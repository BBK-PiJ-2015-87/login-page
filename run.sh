#!/usr/bin/env bash


#add maven wrapper
#mvn -N io.takari:maven:wrapper



./mvnw clean package
java -jar target/log-in-1.0-SNAPSHOT.jar
#java -jar target/log-in-1.0-SNAPSHOT.jar --server.port=1987