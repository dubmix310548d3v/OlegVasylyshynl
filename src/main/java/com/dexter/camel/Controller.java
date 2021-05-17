package com.dexter.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
class Controller extends RouteBuilder {

    @Override
    public void configure() {
        restConfiguration()
                .contextPath("/camel").apiContextPath("/api-doc")
                .apiProperty("api.title", "Camel REST API")
                .apiProperty("api.version", "1.0")
                .apiProperty("cors", "true")
                .apiContextRouteId("doc-api")
                .bindingMode(RestBindingMode.json);

        rest("/entity").description("Entity REST service")
                .consumes("application/json")
                .produces("application/json")
                .get("/").description("The list of all the books").outType(String.class)
                .route().routeId("entity-api")
                .bean(Hello.class, "process").endRest()
                .get("/mongo").description("List from mongo").outType(String.class)
                .route().routeId("mongoRestId")
                .bean(Hello.class, "process2");
//                .endRest();
//                .get("order/{id}").description("Details of an order by id")
//                .route().routeId("order-api")
//                .bean(Database.class, "findOrder(${header.id})");

    }
}
