# PacktCoffeeShop

This is the code from my video course with Packt Publishing, you can find it here: https://github.com/PacktPublishing/Building-and-Deploying-Java-EE-Microservices-on-the-Cloud

I want to play a bit more with the microservices, so if you want the original code grab it from the link above.

## Payara OpenApi issue
The 5.182 version of Payara has an issue with OpenAPI and throws exceptions when it's starting. It will be fixed in 5.183 but until then, the command to deploy on Payara Micro are: `java -jar -Dmp.openapi.scan.disable=true <payara-micro>.jar PacktCustomer.war --port 8085`

## Customers
Uses the Payara embedded H2 database and Microprofile 1.3. Can be deployed on a Payara Web or Full server, or on Payara Micro (as intended) with `java -jar <payara-micro>.jar PacktCustomer.war --port 8085`

## Orders
Uses H2 as an external DB which is configured in web.xml and is updated to Microprofile 1.3. Can be deployed on a Payara Web or Full server, or on Payara Micro (as intended) with `java -jar <payara-micro>.jar PacktOrder.war --port 8086`
