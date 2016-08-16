URL to start: /ch02/edms/index.html

This is the JavaConfig style of ApplicationContext. (web.xml-less)

How to run the project:
   (1) FTP server: URL, username and password! Fill in URL of FTP in UploadSingleFileFtpController.
   (2) There must be Java 1.7 installed. 
   (3) Open this Maven project using STS 3.7
   (4) Update the Maven project if needed.
   (5) Must use Tomcat 7.x to deploy else just configure pom.xml ot run in Jetty or JBoss.
   (6) If Tomcat, run Maven using the command clean install tomcat:deploy