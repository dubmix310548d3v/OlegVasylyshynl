# camel-springboot-kafka-camelrest-h2-mongodb

## install
Kafka
here
https://gist.github.com/monkut/07cd1618102cbae8d587811654c92902

MongoDB
here
https://docs.mongodb.com/manual/tutorial/install-mongodb-on-ubuntu/


## run

```
mvn spring-boot:run
```


and then go to the browser and type

```
localhost:8085/camel/entity
localhost:8085/camel/entity/mongo
```


## Events 

xml 

```
<event>
  <acts>
    <act>
      <action>CREATE_USER</action>
      <parameters>
        <parameter field="ID" value="12"/>
        <parameter field="NAME" value="DEXTER"/>
      </parameters>
    </act>
  </acts>
</event>

```

java object

```
Event{acts=[Act{action=CREATE_USER, parameters=[Parameter{field=ID, value='12'}, Parameter{field=NAME, value='DEXTER'}]}]}
```