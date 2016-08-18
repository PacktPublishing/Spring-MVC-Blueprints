-- MySQL dump 10.13  Distrib 5.6.26, for Win64 (x86_64)
--
-- Host: localhost    Database: cfs
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
-- Current Database: `cfs`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `cfs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cfs`;

--
-- Table structure for table `cfs_feedback`
--

DROP TABLE IF EXISTS `cfs_feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cfs_feedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `feedback` longtext NOT NULL,
  `topicId` int(11) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cfs_feedback_cfs_topic_idx` (`topicId`),
  CONSTRAINT `fk_cfs_feedback_cfs_topic` FOREIGN KEY (`topicId`) REFERENCES `cfs_topic` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cfs_feedback`
--

LOCK TABLES `cfs_feedback` WRITE;
/*!40000 ALTER TABLE `cfs_feedback` DISABLE KEYS */;
INSERT INTO `cfs_feedback` VALUES (1,'Zac Barte','sjctrags@yahoo.com','Are u against the Eurpean countries not embracing refugees??? No way',8,'2015-08-29'),(2,'Sherwin Tragura','sjctrags@yahoo.com','I want to protest!',8,'2015-08-06');
/*!40000 ALTER TABLE `cfs_feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cfs_topic`
--

DROP TABLE IF EXISTS `cfs_topic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cfs_topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `description` longtext,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cfs_topic`
--

LOCK TABLES `cfs_topic` WRITE;
/*!40000 ALTER TABLE `cfs_topic` DISABLE KEYS */;
INSERT INTO `cfs_topic` VALUES (8,'What contributes to Asia\'s stock market fall?','Just an inquiry?','2015-09-04'),(9,'Is MJ Fernandez a Leila De Lima in the making???','Comment','2015-08-28'),(10,'Are you a racist???','Wala lang???','2015-09-04'),(11,'Can we approve the FOI BIll???','Comment na','2015-09-04');
/*!40000 ALTER TABLE `cfs_topic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'cfs'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-13  9:44:25
