Simple Spring bbot application.
Database is MySql on Docker container.

1) mysql build/start
docker build -t docker-mysql-8.1.0 .
docker run --name docker-mysql-con -e MYSQL_ROOT_PASSWORD=mypassword -dp 127.0.0.1:3306:3306 docker-mysql-8.1.0

2) docker build -t spring-boot-rest .
docker run --name spring-boot-rest-con -dp 127.0.0.1:8080:8080 spring-boot-rest
