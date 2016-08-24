# Spring-MVC-Blueprints

This is the code repository for [Spring MVC Blueprints](https://www.packtpub.com/application-development/spring-mvc-blueprints?utm_source=github&utm_medium=repository&utm_campaign=9781785888274), published by Packt Publishing. It contains all the supporting project files necessary to work through the book from start to finish.

##Instructions and Navigation

How to run the project:
   1. Prepare for your email incoming and outgoing addresses.
   2. There must be Java 1.7 installed. 
   3. Open this Maven project using STS 3.7
   4. Update the Maven project if needed.
   5. Must use Tomcat 7.x to deploy else just configure pom.xml ot run in Jetty or JBoss.
   6. If Tomcat, run Maven using the command clean install tomcat:deploy

#####Code Snippet:
```
package org.packt.edms.portal.model.form;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;
public class MultipleFilesUploadForm {
private List<MultipartFile> files;
public List<MultipartFile> getFiles() {
   return files;
   }
   public void setFiles(List<MultipartFile> files) {
   this.files = files;
   }
}
```

##Related Spring Products:
* [Spring MVC Beginner’s Guide](https://www.packtpub.com/application-development/spring-mvc-beginner%E2%80%99s-guide?utm_source=Github&utm_medium=Repository&utm_campaign=9781783284870)
* [Learning Spring Boot](https://www.packtpub.com/application-development/learning-spring-boot?utm_source=Github&utm_medium=Repository&utm_campaign=9781784393021)
* [Spring Security [Video]](https://www.packtpub.com/application-development/spring-security-video?utm_source=Github&utm_medium=Repository&utm_campaign=9781782168652)

