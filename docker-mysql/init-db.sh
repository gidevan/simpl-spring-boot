#!/bin/bash
mysql -uroot -pmypassword -e "CREATE DATABASE test_db" &
sync &
sleep 5 &
mysql -uroot -pmypassword test_db < /tmp/dump.sql