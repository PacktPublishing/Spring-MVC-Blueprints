URL to start: /ch05/cfs/topics.html

This is the JavaConfig style of ApplicationContext. (web.xml-less)

How to run the project:
   (1) Sign-up for SendGrdi account (free account) and get the api-user and api-key
   (2) Sign-up for Google recaptch account and generate our own private key 
   (3) There must be Java 1.7 installed. 
   (4) Open this Maven project using STS 3.7
   (5) Update the Maven project if needed.
   (6) Must use Tomcat 7.x to deploy else just configure pom.xml ot run in Jetty or JBoss.
   (7) If Tomcat, run Maven using the command clean install tomcat:deploy