-- MySQL dump 10.13  Distrib 5.6.30, for Win64 (x86_64)
--
-- Host: localhost    Database: bts
-- ------------------------------------------------------
-- Server version	5.6.30-log

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
-- Current Database: `bts`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `bts` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bts`;

--
-- Table structure for table `booked_trip`
--

DROP TABLE IF EXISTS `booked_trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booked_trip` (
  `id` int(11) NOT NULL,
  `tripId` int(11) NOT NULL,
  `adults` int(11) NOT NULL,
  `kids` int(11) NOT NULL,
  `booked` date NOT NULL,
  `userId` int(11) NOT NULL,
  `status` varchar(45) NOT NULL,
  `total` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_booked_trip_customer_info1_idx` (`userId`),
  KEY `fk_booked_trip_trip_detail1_idx` (`tripId`),
  CONSTRAINT `fk_booked_trip_customer_info1` FOREIGN KEY (`userId`) REFERENCES `customer_info` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_booked_trip_trip_detail1` FOREIGN KEY (`tripId`) REFERENCES `trip` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booked_trip`
--

LOCK TABLES `booked_trip` WRITE;
/*!40000 ALTER TABLE `booked_trip` DISABLE KEYS */;
/*!40000 ALTER TABLE `booked_trip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_payment`
--

DROP TABLE IF EXISTS `booking_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking_payment` (
  `id` int(11) NOT NULL,
  `bookingId` int(11) NOT NULL,
  `mode` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_booking_payment_booked_trip1_idx` (`bookingId`),
  CONSTRAINT `fk_booking_payment_booked_trip1` FOREIGN KEY (`bookingId`) REFERENCES `booked_trip` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_payment`
--

LOCK TABLES `booking_payment` WRITE;
/*!40000 ALTER TABLE `booking_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_info`
--

DROP TABLE IF EXISTS `customer_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_info` (
  `id` int(11) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `middleName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_info`
--

LOCK TABLES `customer_info` WRITE;
/*!40000 ALTER TABLE `customer_info` DISABLE KEYS */;
INSERT INTO `customer_info` VALUES (0,'Sherwin','Calleja','Tragura',37);
/*!40000 ALTER TABLE `customer_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_login_customer_info` FOREIGN KEY (`id`) REFERENCES `customer_info` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (0,'sjctrags@yahoo.com','sjctrags');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `station_detail`
--

DROP TABLE IF EXISTS `station_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `station_detail` (
  `id` int(11) NOT NULL,
  `address` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `station_detail`
--

LOCK TABLES `station_detail` WRITE;
/*!40000 ALTER TABLE `station_detail` DISABLE KEYS */;
INSERT INTO `station_detail` VALUES (1,'Lucena Station','admin1@yahoo.com','+6397865-4534'),(2,'Manila Station','admin2@yahoo.com','+6345455-4456');
/*!40000 ALTER TABLE `station_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trip`
--

DROP TABLE IF EXISTS `trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trip` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `sights_stops` int(11) NOT NULL,
  `day_duration` int(11) NOT NULL,
  `night_duration` int(11) NOT NULL,
  `type_duration` varchar(45) NOT NULL,
  `other_transport` varchar(45) NOT NULL,
  `language` varchar(45) NOT NULL,
  `price_adult` double NOT NULL,
  `price_kid` double NOT NULL,
  `stationId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_trip_station_detail1_idx` (`stationId`),
  CONSTRAINT `fk_trip_station_detail1` FOREIGN KEY (`stationId`) REFERENCES `station_detail` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trip`
--

LOCK TABLES `trip` WRITE;
/*!40000 ALTER TABLE `trip` DISABLE KEYS */;
INSERT INTO `trip` VALUES (3232,'Alibata Liner',3,3,4,'bus','boat','english',34.5,65.7,1),(3444,'Alibata Liner 2',43,4,3,'boat','plane','spanish',100.5,567.8,2);
/*!40000 ALTER TABLE `trip` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-25 12:28:28
