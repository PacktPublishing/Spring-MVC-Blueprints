URL to start: /ch04/hrms/login.html

NOTEs: 
   -- Some of the UI/Ajax and chart library needs Internet connection.
   -- JFreeChart results: /ch04/hrms/admin_charts
   -- Google Chart results: /ch04/hrms/hr_charts
   -- Other rendition types: /ch04/hrms/admin_reports.html
   -- DTR rendered as HTML but can be changed to be renedred as PDF: /ch04/hrms/dtr.html

How to run the project:
   (1) There must be Java 1.7 installed. 
   (3) Open this Maven project using STS 3.7
   (4) Update the Maven project if needed.
   (5) Install MySQL 5.6. Login using your account and install db/hrms.sql
   (5) Must use Tomcat 7.x to deploy else just configure pom.xml ot run in Jetty or JBoss.
   (6) If Tomcat, run Maven using the command clean install tomcat:deploy
   
   
   Sample admin account: admin (u)
   	                     admin (p)
   	      employee account: jesette (u)
   	      				   jesette (p)
   	      hr account: mabel (u)
   	      		      mabel (p)
   	      				   
   	      		
   	      				   