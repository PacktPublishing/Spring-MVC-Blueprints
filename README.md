[![GitHub issues](https://img.shields.io/github/issues/PacktPublishing/Spring-MVC-Blueprints.svg)](https://github.com/PacktPublishing/Spring-MVC-Blueprints/issues)   [![GitHub forks](https://img.shields.io/github/forks/PacktPublishing/Spring-MVC-Blueprints.svg)](https://github.com/PacktPublishing/Spring-MVC-Blueprints/network)   [![GitHub stars](https://img.shields.io/github/stars/PacktPublishing/Spring-MVC-Blueprints.svg)](https://github.com/PacktPublishing/Spring-MVC-Blueprints/stargazers)   [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/PacktPublishing/Spring-MVC-Blueprints/master/LICENSE)

# Spring MVC Blueprints

This is the code repository for [Spring MVC Blueprints](https://www.packtpub.com/application-development/spring-mvc-blueprints?utm_source=github&utm_medium=repository&utm_campaign=9781785888274), published by Packt Publishing. It contains all the supporting project files necessary to work through the book from start to finish.

##Instructions and Navigation

####These instructions are common to all projects:
   * Prepare for your email incoming and outgoing addresses.
   * There must be Java 1.7 installed. 
   * Open this Maven project using STS 3.7
   * Update the Maven project if needed.
   * Must use Tomcat 7.x to deploy else just configure pom.xml ot run in Jetty or JBoss.
   * If Tomcat, run Maven using the command clean install tomcat:deploy

####These are additional project-specific instructions:

#####Chapter 2:
   * FTP server: URL, username and password! Fill in URL of FTP in UploadSingleFileFtpController

#####Chapter 5:
   * Sign-up for SendGrdi account (free account) and get the api-user and api-key
   * Sign-up for Google recaptch account and generate our own private key 

#####Chapter 6:
   * Preferred to use Java 1.6. There are bugs when Java 1.7 version is used

#####Chapter 7:
   * For the BTM-JTA Manager configuration, all files are inside jata-server-conf folder
   * If Apache Pluto, run Maven using the command clean install tomcat:deploy
   * Must use Apache Pluto server for portlets to deploy else just configure pom.xml ot run in Jetty or JBoss.
   * For the BTM-JTA Manager configuration, all files are inside jata-server-conf folder

#####Chapter 8:
   * Needs to install Rabbit MQ server and erlang
   * Needs to install Apache Active MQ

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

