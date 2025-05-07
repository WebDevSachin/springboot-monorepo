#!/bin/bash

# Build all projects
echo "Building all projects..."
mvn clean install

# Start each service in its own terminal
echo "Starting Service1 on port 8081..."
cd service1 && mvn spring-boot:run &

echo "Starting Service2 on port 8082..."
cd service2 && mvn spring-boot:run &

echo "All services are starting..."
echo "Access Service1 at http://localhost:8081/api/service1/status"
echo "Access Service2 at http://localhost:8082/api/service2/status" 