FROM mysql:8.1.0
MAINTAINER vsanyc
ADD ./docker-mysql/dump.sql /tmp/dump.sql
ADD ./docker-mysql/init-db.sh /docker-entrypoint-initdb.d/init-db.sh
