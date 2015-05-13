Sample Spring MVC application


To build:

mvn package -  creates a war to deploy with Tomcat

Curl examples:
To add orders:
curl --data "userId=1&merchantId=1&price=4.99" localhost:8080/Order-1/rest/orders
curl --data "userId=1&merchantId=2&price=12.99" localhost:8080/Order-1/rest/orders
curl --data "userId=2&merchantId=1&price=3.99" localhost:8080/Order-1/rest/orders

To retrieve orders: (path ends with the userId)
curl localhost:8080/Order-1/rest/orders/users/1
curl localhost:8080/Order-1/rest/orders/users/2


