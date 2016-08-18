-- MySQL dump 10.13  Distrib 5.6.26, for Win64 (x86_64)
--
-- Host: localhost    Database: hms
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
-- Current Database: `hms`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `hms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hms`;

--
-- Table structure for table `hms_free_booking`
--

DROP TABLE IF EXISTS `hms_free_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_free_booking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `length` int(11) NOT NULL,
  `heads` int(11) NOT NULL,
  `arrivalDate` date NOT NULL,
  `comment` longtext,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_free_booking`
--

LOCK TABLES `hms_free_booking` WRITE;
/*!40000 ALTER TABLE `hms_free_booking` DISABLE KEYS */;
INSERT INTO `hms_free_booking` VALUES (1,'Sherwin John Tragura','09399175107',2,2,'2010-03-31',NULL,'sjctrags@gmail.com'),(2,'Anna','09399175107',3,3,'2010-03-31',NULL,'Laguna');
/*!40000 ALTER TABLE `hms_free_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hms_login`
--

DROP TABLE IF EXISTS `hms_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_login` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4555 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_login`
--

LOCK TABLES `hms_login` WRITE;
/*!40000 ALTER TABLE `hms_login` DISABLE KEYS */;
INSERT INTO `hms_login` VALUES ('sjctrags','sjctrags',1),('admin','admin',2),('liza','liza',4554);
/*!40000 ALTER TABLE `hms_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hms_menu`
--

DROP TABLE IF EXISTS `hms_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menuDate` date NOT NULL,
  `menuName` varchar(45) NOT NULL,
  `menuPlan` varchar(45) NOT NULL,
  `qty` int(3) NOT NULL,
  `price` double(6,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_menu`
--

LOCK TABLES `hms_menu` WRITE;
/*!40000 ALTER TABLE `hms_menu` DISABLE KEYS */;
INSERT INTO `hms_menu` VALUES (1,'2016-10-10','Menudo Meal','Lunch',3,4500.00);
/*!40000 ALTER TABLE `hms_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hms_menu_booking`
--

DROP TABLE IF EXISTS `hms_menu_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_menu_booking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookId` int(11) NOT NULL,
  `menuId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hms_menu_booking_hms_menu1_idx` (`menuId`),
  CONSTRAINT `fk_hms_menu_booking_hms_menu1` FOREIGN KEY (`menuId`) REFERENCES `hms_menu` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_menu_booking`
--

LOCK TABLES `hms_menu_booking` WRITE;
/*!40000 ALTER TABLE `hms_menu_booking` DISABLE KEYS */;
INSERT INTO `hms_menu_booking` VALUES (1,1,1);
/*!40000 ALTER TABLE `hms_menu_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hms_room_booking`
--

DROP TABLE IF EXISTS `hms_room_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_room_booking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookingDate` datetime NOT NULL,
  `roomId` int(11) NOT NULL,
  `bookingStatus` varchar(45) NOT NULL,
  `profileId` int(11) NOT NULL,
  `bookingMenuId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hms_room_booking_hms_user_profile1_idx` (`profileId`),
  KEY `fk_hms_room_booking_hms_rooms_masterlist1_idx` (`roomId`),
  KEY `fk_hms_room_booking_hms_menu_booking1_idx` (`bookingMenuId`),
  CONSTRAINT `fk_hms_room_booking_hms_menu_booking1` FOREIGN KEY (`bookingMenuId`) REFERENCES `hms_menu_booking` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hms_room_booking_hms_rooms_masterlist1` FOREIGN KEY (`roomId`) REFERENCES `hms_rooms_masterlist` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hms_room_booking_hms_user_profile1` FOREIGN KEY (`profileId`) REFERENCES `hms_user_profile` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_room_booking`
--

LOCK TABLES `hms_room_booking` WRITE;
/*!40000 ALTER TABLE `hms_room_booking` DISABLE KEYS */;
INSERT INTO `hms_room_booking` VALUES (1,'2016-10-10 00:00:00',1,'4',1,1),(2,'2016-03-10 00:00:00',1,'3',1,1);
/*!40000 ALTER TABLE `hms_room_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hms_room_type`
--

DROP TABLE IF EXISTS `hms_room_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_room_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4555 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_room_type`
--

LOCK TABLES `hms_room_type` WRITE;
/*!40000 ALTER TABLE `hms_room_type` DISABLE KEYS */;
INSERT INTO `hms_room_type` VALUES (1,'1-br-reg'),(2,'1-br-deluxe'),(3,'1-br-suite'),(4,'2-br-deluxe'),(5,'2-br-suite'),(6,'3-br-suite'),(7,'vip'),(8,'studio'),(9,'jimmy'),(10,'vvbc'),(11,'ffghgf'),(12,'deluxe'),(4554,'deluxe');
/*!40000 ALTER TABLE `hms_room_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hms_rooms`
--

DROP TABLE IF EXISTS `hms_rooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_rooms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `typeId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `roomKeyFK_idx` (`typeId`),
  CONSTRAINT `roomKeyFK` FOREIGN KEY (`typeId`) REFERENCES `hms_room_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_rooms`
--

LOCK TABLES `hms_rooms` WRITE;
/*!40000 ALTER TABLE `hms_rooms` DISABLE KEYS */;
INSERT INTO `hms_rooms` VALUES (1,'Granite','Simple',1),(2,'Saphire','Expensive',1),(3,'Topaz','Expensive',3);
/*!40000 ALTER TABLE `hms_rooms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hms_rooms_masterlist`
--

DROP TABLE IF EXISTS `hms_rooms_masterlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_rooms_masterlist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomId` varchar(45) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `statusId` int(11) NOT NULL,
  `typeId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hms_rooms_masterlist_status1_idx` (`statusId`),
  KEY `fk_hms_rooms_masterlist_hms_room_type1_idx` (`typeId`),
  CONSTRAINT `fk_hms_rooms_masterlist_hms_room_type1` FOREIGN KEY (`typeId`) REFERENCES `hms_room_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hms_rooms_masterlist_status1` FOREIGN KEY (`statusId`) REFERENCES `status` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_rooms_masterlist`
--

LOCK TABLES `hms_rooms_masterlist` WRITE;
/*!40000 ALTER TABLE `hms_rooms_masterlist` DISABLE KEYS */;
INSERT INTO `hms_rooms_masterlist` VALUES (1,'1','Now Open',4,1),(2,'2','Now open',4,2);
/*!40000 ALTER TABLE `hms_rooms_masterlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hms_user_profile`
--

DROP TABLE IF EXISTS `hms_user_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hms_user_profile` (
  `id` int(11) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hms_user_profile`
--

LOCK TABLES `hms_user_profile` WRITE;
/*!40000 ALTER TABLE `hms_user_profile` DISABLE KEYS */;
INSERT INTO `hms_user_profile` VALUES (1,'Sherwin','Tragura','Makati','09219175107','sjctrags@gmail.com'),(4554,'Joana','Greus','Unit 2B 500 Hizon St','09399175107','sjctrags@gmail.com');
/*!40000 ALTER TABLE `hms_user_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
INSERT INTO `status` VALUES (1,'repair'),(2,'closed'),(3,'reserved'),(4,'ready');
/*!40000 ALTER TABLE `status` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-05 23:42:35
