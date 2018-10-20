# demo spring2 jdbc

development environment

* Java 1.8.0
* Spring Boot 2.0.6
  * Spring Boot Starter JDBC 2.0.6
    * Spring JDBC 5.0.10
* PostgreSQL 9.6.1
* Maven 3.5.4

## Database

create table

```text
CREATE TABLE fruits (
  name varchar(100) NOT NULL
);
```

insert test data

```text
insert into fruits values ('apple');
insert into fruits values ('orange');
insert into fruits values ('pineapple');
```
