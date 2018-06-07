Debugging Spring Boot

-If spring boot does not start or stop automatically after it started : 
- check if you have the pom.xml in your directory
- try to run from mvn from cli -> mvn spring-boot:run
- if still not starting do a purge on your local repository -> mvn dependency:purge-local-repository