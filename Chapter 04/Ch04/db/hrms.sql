-- MySQL dump 10.13  Distrib 5.6.26, for Win64 (x86_64)
--
-- Host: localhost    Database: hrms
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `hrms`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `hrms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hrms`;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `deptId` int(11) NOT NULL,
  `departmentName` varchar(45) NOT NULL,
  PRIMARY KEY (`deptId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'infrastructure'),(2,'business'),(3,'implementation'),(4,'officer'),(5,'art'),(7,'sales'),(8,'marketing'),(9,'management');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrms_employee_attendance`
--

DROP TABLE IF EXISTS `hrms_employee_attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrms_employee_attendance` (
  `empId` int(11) NOT NULL,
  `timeIn` time NOT NULL,
  `timeOut` time NOT NULL,
  `remarks` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_hrms_employee_attendance_hrms_employee_details1` (`empId`),
  CONSTRAINT `fk_hrms_employee_attendance_hrms_employee_details1` FOREIGN KEY (`empId`) REFERENCES `hrms_employee_details` (`empId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrms_employee_attendance`
--

LOCK TABLES `hrms_employee_attendance` WRITE;
/*!40000 ALTER TABLE `hrms_employee_attendance` DISABLE KEYS */;
INSERT INTO `hrms_employee_attendance` VALUES (1233455,'08:10:00','22:00:00',NULL,1),(1233455,'07:30:00','24:00:00',NULL,2),(1233455,'08:00:00','16:00:00',NULL,3),(1233455,'08:00:00','16:00:00',NULL,4),(1233455,'08:00:00','16:00:00',NULL,5);
/*!40000 ALTER TABLE `hrms_employee_attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrms_employee_details`
--

DROP TABLE IF EXISTS `hrms_employee_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrms_employee_details` (
  `empId` int(11) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `midName` varchar(50) NOT NULL,
  `positionId` int(11) NOT NULL,
  `deptId` int(11) NOT NULL,
  `birthDate` date NOT NULL,
  `age` int(3) NOT NULL,
  `sex` char(2) NOT NULL,
  `address` varchar(100) NOT NULL,
  `employedDate` date NOT NULL,
  `supervisorId` int(11) NOT NULL,
  PRIMARY KEY (`empId`),
  KEY `fk_hrms_employee_details_positions1_idx` (`positionId`),
  KEY `fk_hrms_employee_details_department1_idx` (`deptId`),
  CONSTRAINT `fk_hrms_employee_details_department1` FOREIGN KEY (`deptId`) REFERENCES `department` (`deptId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hrms_employee_details_positions1` FOREIGN KEY (`positionId`) REFERENCES `positions` (`positionId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrms_employee_details`
--

LOCK TABLES `hrms_employee_details` WRITE;
/*!40000 ALTER TABLE `hrms_employee_details` DISABLE KEYS */;
INSERT INTO `hrms_employee_details` VALUES (1133245,'Lombardie','Clan','Kit',8,7,'1989-10-05',32,'M','Tacloban City','2001-10-10',1233455),(1233455,'Jesse','Mendiola','Chionglo',5,4,'1990-07-25',26,'F','Makati City','2010-02-26',9090934),(1234567,'Sherwin','Tragura','Calleja',1,1,'1978-10-30',37,'M','Makati City','2006-06-04',2312235),(2312235,'Allan','Poe','Tan',6,2,'1989-11-05',45,'M','Cavite City','2009-11-20',5567321),(3232311,'Jeane','Grey','Black',6,4,'1990-10-11',31,'F','Davao City','2001-06-04',2312235),(4545335,'Adrian','Tamlod','Sun',6,8,'1991-05-23',29,'M','Bacolod City','2005-01-06',8898911),(5567321,'Mabel','Sia','Go',6,2,'1960-10-04',55,'F','Metro Manila','2011-11-25',9090934),(7666544,'James','Kumba','Kum',3,5,'1980-10-11',35,'M','Batangas City','2000-08-10',2312235),(7678834,'Jesette','David','Manolo',8,2,'1979-12-14',36,'F','Surigao City','2012-02-14',5567321),(8898911,'Mathieu','Domino','Goofy',6,8,'1990-10-07',30,'M','Sorsogon','2000-03-02',1233455),(8900045,'Anna','Lasi','Garredo',3,4,'1979-07-07',36,'F','San Pedro City','2000-04-03',9090934),(9090934,'Jimmy','Cricket','Buck',2,4,'1970-01-10',45,'M','Metro Manila','1998-10-10',9090934),(9787532,'Owen','Salvador','Salazar',2,2,'1982-07-02',34,'M','Bataan City','2001-10-10',2312235);
/*!40000 ALTER TABLE `hrms_employee_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrms_employee_leaves`
--

DROP TABLE IF EXISTS `hrms_employee_leaves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrms_employee_leaves` (
  `empId` int(11) NOT NULL,
  `leaveId` int(11) NOT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `totalDays` double NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_hrms_employee_leaves_hrms_employee_details1_idx` (`empId`),
  KEY `fk_hrms_employee_leaves_leaves1_idx` (`leaveId`),
  CONSTRAINT `fk_hrms_employee_leaves_hrms_employee_details1` FOREIGN KEY (`empId`) REFERENCES `hrms_employee_details` (`empId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hrms_employee_leaves_leaves1` FOREIGN KEY (`leaveId`) REFERENCES `leaves` (`leaveId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrms_employee_leaves`
--

LOCK TABLES `hrms_employee_leaves` WRITE;
/*!40000 ALTER TABLE `hrms_employee_leaves` DISABLE KEYS */;
INSERT INTO `hrms_employee_leaves` VALUES (7666544,2,'2016-09-01','2016-09-05',4,1),(7666544,6,'2016-10-30','2016-10-30',1,2),(7678834,5,'2016-11-10','2016-11-17',8,3),(3232311,1,'2016-08-10','2016-08-15',6,4),(3232311,1,'2016-08-25','2016-08-28',4,5),(5567321,2,'2016-05-20','2016-09-10',90,6);
/*!40000 ALTER TABLE `hrms_employee_leaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrms_employee_projects`
--

DROP TABLE IF EXISTS `hrms_employee_projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrms_employee_projects` (
  `empId` int(11) NOT NULL,
  `projectHandled` varchar(100) NOT NULL,
  `dateStarted` date NOT NULL,
  `dateEnded` date DEFAULT NULL,
  `status` varchar(10) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_hrms_employee_projects_hrms_employee_details1` (`empId`),
  CONSTRAINT `fk_hrms_employee_projects_hrms_employee_details1` FOREIGN KEY (`empId`) REFERENCES `hrms_employee_details` (`empId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrms_employee_projects`
--

LOCK TABLES `hrms_employee_projects` WRITE;
/*!40000 ALTER TABLE `hrms_employee_projects` DISABLE KEYS */;
INSERT INTO `hrms_employee_projects` VALUES (2312235,'Alibata Expansion Plan 5','2001-10-10','2006-10-10','success',1),(3232311,'Customer Service Project','2012-09-05','2013-01-20','success',2),(7666544,'Fiber Optics Technology','2015-05-05','2016-10-10','success',3),(8898911,'Social Cam Technology','2013-07-10','2015-10-10','success',4);
/*!40000 ALTER TABLE `hrms_employee_projects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrms_employee_salary`
--

DROP TABLE IF EXISTS `hrms_employee_salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrms_employee_salary` (
  `empId` int(11) NOT NULL,
  `salaryRange` varchar(45) NOT NULL,
  `annualIncome` double NOT NULL,
  `taxable` double NOT NULL,
  `loans` double NOT NULL,
  `insurance` double NOT NULL,
  PRIMARY KEY (`empId`),
  KEY `fk_hrms_employee_salary_hrms_employee_details1_idx` (`empId`),
  CONSTRAINT `fk_hrms_employee_salary_hrms_employee_details1` FOREIGN KEY (`empId`) REFERENCES `hrms_employee_details` (`empId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrms_employee_salary`
--

LOCK TABLES `hrms_employee_salary` WRITE;
/*!40000 ALTER TABLE `hrms_employee_salary` DISABLE KEYS */;
INSERT INTO `hrms_employee_salary` VALUES (1234567,'60000.00',700000,600000,0,200000),(2312235,'100000.00',1000000,1000,5600000,4500000),(3232311,'890000.00',900000,45453,756565,450000),(5567321,'55560.00',650000,56777.89,100500,500000),(7678834,'35000.90',600000,550000,450000,250000);
/*!40000 ALTER TABLE `hrms_employee_salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrms_employee_trainings`
--

DROP TABLE IF EXISTS `hrms_employee_trainings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrms_employee_trainings` (
  `empId` int(11) NOT NULL,
  `skills` longtext NOT NULL,
  `training` varchar(45) NOT NULL,
  `projectReqt` varchar(45) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bond` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_hrms_employee_skills_hrms_employee_details1` (`empId`),
  CONSTRAINT `fk_hrms_employee_skills_hrms_employee_details1` FOREIGN KEY (`empId`) REFERENCES `hrms_employee_details` (`empId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrms_employee_trainings`
--

LOCK TABLES `hrms_employee_trainings` WRITE;
/*!40000 ALTER TABLE `hrms_employee_trainings` DISABLE KEYS */;
/*!40000 ALTER TABLE `hrms_employee_trainings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrms_login`
--

DROP TABLE IF EXISTS `hrms_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrms_login` (
  `empId` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(10) NOT NULL,
  PRIMARY KEY (`username`),
  KEY `fk_hrms_login_hrms_employee_details` (`empId`),
  CONSTRAINT `fk_hrms_login_hrms_employee_details` FOREIGN KEY (`empId`) REFERENCES `hrms_employee_details` (`empId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrms_login`
--

LOCK TABLES `hrms_login` WRITE;
/*!40000 ALTER TABLE `hrms_login` DISABLE KEYS */;
INSERT INTO `hrms_login` VALUES (1234567,'admin','admin','admin'),(2312235,'allan','allan','admin'),(7678834,'jesette','jesette','employee'),(1233455,'jesse','jesee','employee'),(5567321,'mabel','mabel','hr');
/*!40000 ALTER TABLE `hrms_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hrms_news`
--

DROP TABLE IF EXISTS `hrms_news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hrms_news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(45) NOT NULL DEFAULT '',
  `summary` longtext NOT NULL,
  `link` varchar(45) NOT NULL DEFAULT '',
  `author` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrms_news`
--

LOCK TABLES `hrms_news` WRITE;
/*!40000 ALTER TABLE `hrms_news` DISABLE KEYS */;
INSERT INTO `hrms_news` VALUES (1,'Salary Increase','Alibata System Inc. employees ill receive increase in salary.','http://localhost:8080/ch04/hrms/login.html','CEO Jimmy Metal'),(2,'China Explosion','Luo Shuhui\'s home was 700 meters from the chemical warehouse that exploded last week, hurling fireballs into the sky.','http://cnn.com',' Steven Jiang, Will Ripley '),(3,'El Niño: Why now is the time to act?','This year we have seen a succession of unusual weather events across Asia: Deadly heat waves in India and Pakistan, widespread drought in Cambodia, Indonesia, and Vietnam, and planned water rationing in Thailand.','http://cnn.com','Ancha Srinivasan');
/*!40000 ALTER TABLE `hrms_news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leaves`
--

DROP TABLE IF EXISTS `leaves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leaves` (
  `leaveId` int(11) NOT NULL,
  `leaveName` varchar(50) NOT NULL,
  `days` int(3) NOT NULL,
  PRIMARY KEY (`leaveId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leaves`
--

LOCK TABLES `leaves` WRITE;
/*!40000 ALTER TABLE `leaves` DISABLE KEYS */;
INSERT INTO `leaves` VALUES (0,'sick',15),(1,'vacation',10),(2,'maternity',90),(3,'paternity',7),(4,'bereavement',3),(5,'single parent',10),(6,'personal with pay',4),(7,'personal without pay',5),(8,'furlough',365),(9,'adoptive',5);
/*!40000 ALTER TABLE `leaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `positions`
--

DROP TABLE IF EXISTS `positions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `positions` (
  `positionId` int(11) NOT NULL,
  `positionName` varchar(50) NOT NULL,
  PRIMARY KEY (`positionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `positions`
--

LOCK TABLES `positions` WRITE;
/*!40000 ALTER TABLE `positions` DISABLE KEYS */;
INSERT INTO `positions` VALUES (1,'administrator'),(2,'ceo'),(3,'cto'),(4,'manager'),(5,'supervisor'),(6,'assistant manager'),(7,'accountant'),(8,'helpdesk officer'),(9,'clerk'),(10,'senior supervisor'),(11,'agent');
/*!40000 ALTER TABLE `positions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-05 17:34:54
