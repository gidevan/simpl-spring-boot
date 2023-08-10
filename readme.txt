Simple Spring bbot application.
Database is MySql on Docker container.

docker build -t docker-mysql-8.1.0 .
docker run --name docker-mysql-con -e MYSQL_ROOT_PASSWORD=mypassword -dp 127.0.0.1:3306:3306 docker-mysql-8.1.0

