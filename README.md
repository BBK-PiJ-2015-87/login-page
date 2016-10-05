




#Dev tools for spring boot
http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-devtools

To run application:
mvn spring-boot:run 


#H2 database
Once the application is running we can query go to
http://localhost:8080/h2-console/

Url to connect: jdbc:h2:mem:testdb
user: sa

To dump a table to a csv file run this command in the console. The file will appear in project directory:
CALL CSVWRITE('test.csv', 'SELECT * FROM CUSTOMERS');

To dump whole database run:

SCRIPT TO 'mydump.csv'