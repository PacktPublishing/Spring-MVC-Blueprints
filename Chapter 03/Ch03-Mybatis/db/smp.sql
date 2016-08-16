-- MySQL dump 10.13  Distrib 5.6.26, for Win64 (x86_64)
--
-- Host: localhost    Database: smp
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
-- Current Database: `smp`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `smp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `smp`;

--
-- Table structure for table `level`
--

DROP TABLE IF EXISTS `level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level` (
  `level` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  PRIMARY KEY (`level`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level`
--

LOCK TABLES `level` WRITE;
/*!40000 ALTER TABLE `level` DISABLE KEYS */;
INSERT INTO `level` VALUES (0,'pending'),(1,'freshman');
/*!40000 ALTER TABLE `level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `pass_word` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `person_id` int(11) NOT NULL,
  `salary` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semester`
--

DROP TABLE IF EXISTS `semester`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `semester` (
  `semester` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  PRIMARY KEY (`semester`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semester`
--

LOCK TABLES `semester` WRITE;
/*!40000 ALTER TABLE `semester` DISABLE KEYS */;
INSERT INTO `semester` VALUES (0,'pending'),(1,'first'),(2,'second');
/*!40000 ALTER TABLE `semester` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `status` (
  `status` int(11) NOT NULL,
  `label` varchar(45) NOT NULL,
  PRIMARY KEY (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
INSERT INTO `status` VALUES (0,'pending'),(1,'approved'),(2,'banned'),(3,'revoked');
/*!40000 ALTER TABLE `status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbladminuser`
--

DROP TABLE IF EXISTS `tbladminuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbladminuser` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbladminuser`
--

LOCK TABLES `tbladminuser` WRITE;
/*!40000 ALTER TABLE `tbladminuser` DISABLE KEYS */;
INSERT INTO `tbladminuser` VALUES ('sjctrags','sjctrags');
/*!40000 ALTER TABLE `tbladminuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblcourses`
--

DROP TABLE IF EXISTS `tblcourses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblcourses` (
  `departmentID` int(11) NOT NULL,
  `courseCode` varchar(15) NOT NULL,
  `courseName` varchar(50) NOT NULL,
  `courseUnit` int(11) NOT NULL,
  PRIMARY KEY (`courseCode`),
  KEY `fk_tblEdmsCourses_tblEdmsDepartment` (`departmentID`),
  CONSTRAINT `fk_tblEdmsCourses_tblEdmsDepartment` FOREIGN KEY (`departmentID`) REFERENCES `tbldepartment` (`departmentID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcourses`
--

LOCK TABLES `tblcourses` WRITE;
/*!40000 ALTER TABLE `tblcourses` DISABLE KEYS */;
INSERT INTO `tblcourses` VALUES (2,'CMSC 123','Data Structures',3),(5,'CMSC 125','Operating Systems',3),(3,'CMSC 132','Networking',3),(2,'CMSC 150','Numerical Analysis',3),(1,'CMSC 22','Basic Java',3),(3,'CMSC 56','Discrete Mathematics',3),(3,'CMSC 57','Discrete Mathematics 2',3),(5,'ENSC 21','Engineering',3),(1,'IT 255','Enterprise Applications',3);
/*!40000 ALTER TABLE `tblcourses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbldepartment`
--

DROP TABLE IF EXISTS `tbldepartment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbldepartment` (
  `departmentID` int(11) NOT NULL,
  `departmentName` varchar(50) NOT NULL,
  PRIMARY KEY (`departmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldepartment`
--

LOCK TABLES `tbldepartment` WRITE;
/*!40000 ALTER TABLE `tbldepartment` DISABLE KEYS */;
INSERT INTO `tbldepartment` VALUES (1,'IT'),(2,'CMSC'),(3,'MGT'),(4,'MATH'),(5,'STAT'),(56,'Human Eco'),(4545,'Chemistry'),(5645,'PE');
/*!40000 ALTER TABLE `tbldepartment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblfaculty`
--

DROP TABLE IF EXISTS `tblfaculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblfaculty` (
  `facultyId` int(11) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `middleName` varchar(50) NOT NULL,
  `departmentId` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`facultyId`),
  KEY `fk_tblEdmsFaculty_tblEdmsDepartment1_idx` (`departmentId`),
  CONSTRAINT `fk_tblEdmsFaculty_tblEdmsDepartment1` FOREIGN KEY (`departmentId`) REFERENCES `tbldepartment` (`departmentID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblfaculty`
--

LOCK TABLES `tblfaculty` WRITE;
/*!40000 ALTER TABLE `tblfaculty` DISABLE KEYS */;
INSERT INTO `tblfaculty` VALUES (0,'Joana','Priestly','May',1,'joanna');
/*!40000 ALTER TABLE `tblfaculty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblfacultyuser`
--

DROP TABLE IF EXISTS `tblfacultyuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblfacultyuser` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblfacultyuser`
--

LOCK TABLES `tblfacultyuser` WRITE;
/*!40000 ALTER TABLE `tblfacultyuser` DISABLE KEYS */;
INSERT INTO `tblfacultyuser` VALUES ('joanna','joanna');
/*!40000 ALTER TABLE `tblfacultyuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblgpa`
--

DROP TABLE IF EXISTS `tblgpa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblgpa` (
  `studentID` int(11) NOT NULL,
  `gpaCalculated` double NOT NULL,
  PRIMARY KEY (`studentID`),
  CONSTRAINT `fk_tblEdmsGPA_tblEdmsStudents1` FOREIGN KEY (`studentID`) REFERENCES `tblstudents` (`studentID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblgpa`
--

LOCK TABLES `tblgpa` WRITE;
/*!40000 ALTER TABLE `tblgpa` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblgpa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblregistration`
--

DROP TABLE IF EXISTS `tblregistration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblregistration` (
  `regId` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `birthDate` date NOT NULL,
  `gender` varchar(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `mobile` varchar(12) NOT NULL,
  `email` varchar(45) NOT NULL,
  `middleName` varchar(50) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`regId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblregistration`
--

LOCK TABLES `tblregistration` WRITE;
/*!40000 ALTER TABLE `tblregistration` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblregistration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblstudentgrades`
--

DROP TABLE IF EXISTS `tblstudentgrades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblstudentgrades` (
  `studentID` int(11) NOT NULL,
  `courseCode` varchar(45) NOT NULL,
  `grade` double NOT NULL,
  `semester` int(11) NOT NULL,
  `level` int(11) NOT NULL,
  `facultyId` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_tblEdmsStudentGrades_tblEdmsCourses1_idx` (`courseCode`),
  KEY `fk_tblEdmsStudentGrades_tblEdmsStudents1_idx` (`studentID`),
  CONSTRAINT `fk_tblEdmsStudentGrades_tblEdmsCourses1` FOREIGN KEY (`courseCode`) REFERENCES `tblcourses` (`courseCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblEdmsStudentGrades_tblEdmsStudents1` FOREIGN KEY (`studentID`) REFERENCES `tblstudents` (`studentID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblstudentgrades`
--

LOCK TABLES `tblstudentgrades` WRITE;
/*!40000 ALTER TABLE `tblstudentgrades` DISABLE KEYS */;
INSERT INTO `tblstudentgrades` VALUES (24,'CMSC 22',0,1,1,0,24),(24,'CMSC 56',0,1,1,0,25),(24,'ENSC 21',0,1,1,0,26);
/*!40000 ALTER TABLE `tblstudentgrades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblstudents`
--

DROP TABLE IF EXISTS `tblstudents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblstudents` (
  `studentID` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `middleName` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `birthDate` date NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `degree` varchar(45) NOT NULL DEFAULT '',
  `level` int(11) NOT NULL DEFAULT '0',
  `semester` int(11) NOT NULL DEFAULT '0',
  `address` varchar(100) NOT NULL,
  `mobile` varchar(12) NOT NULL,
  `email` varchar(45) NOT NULL,
  `username` varchar(50) NOT NULL,
  PRIMARY KEY (`studentID`),
  KEY `fk_tblEdmsStudents_level1_idx` (`level`),
  KEY `fk_tblEdmsStudents_semester1_idx` (`semester`),
  KEY `fk_tblEdmsStudents_status1_idx` (`status`),
  CONSTRAINT `fk_tblEdmsStudents_level1` FOREIGN KEY (`level`) REFERENCES `level` (`level`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblEdmsStudents_semester1` FOREIGN KEY (`semester`) REFERENCES `semester` (`semester`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblEdmsStudents_status1` FOREIGN KEY (`status`) REFERENCES `status` (`status`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblstudents`
--

LOCK TABLES `tblstudents` WRITE;
/*!40000 ALTER TABLE `tblstudents` DISABLE KEYS */;
INSERT INTO `tblstudents` VALUES (24,'Sherwin','Tragura','Calleja','Male','1978-10-30',0,'',0,0,'Makati City','09399175107','sjctrags@gmail.com','student1');
/*!40000 ALTER TABLE `tblstudents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblstudentuser`
--

DROP TABLE IF EXISTS `tblstudentuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblstudentuser` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblstudentuser`
--

LOCK TABLES `tblstudentuser` WRITE;
/*!40000 ALTER TABLE `tblstudentuser` DISABLE KEYS */;
INSERT INTO `tblstudentuser` VALUES ('student1','student1');
/*!40000 ALTER TABLE `tblstudentuser` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-05 17:05:14
