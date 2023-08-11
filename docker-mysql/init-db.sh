#!/bin/bash
echo "Create test_db" &
echo mysql -uroot -pmypassword -e "CREATE DATABASE test_db" &
sync &
sleep 15 &
echo "test_db is created" &
mysql -uroot -pmypassword test_db < /tmp/dump.sql