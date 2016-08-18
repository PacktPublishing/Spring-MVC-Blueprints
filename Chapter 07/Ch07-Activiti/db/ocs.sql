-- MySQL dump 10.13  Distrib 5.6.30, for Win64 (x86_64)
--
-- Host: localhost    Database: ocs
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
-- Current Database: `ocs`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ocs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ocs`;

--
-- Table structure for table `billing_address`
--

DROP TABLE IF EXISTS `billing_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `billing_address` (
  `userId` int(11) NOT NULL,
  `billingAddress` varchar(45) NOT NULL,
  `transId` int(11) NOT NULL,
  PRIMARY KEY (`transId`),
  KEY `fk_billing_address_customer_account1_idx` (`userId`),
  CONSTRAINT `fk_billing_address_customer_account1` FOREIGN KEY (`userId`) REFERENCES `customer_account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing_address`
--

LOCK TABLES `billing_address` WRITE;
/*!40000 ALTER TABLE `billing_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `billing_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `billing_statement`
--

DROP TABLE IF EXISTS `billing_statement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `billing_statement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transId` int(11) NOT NULL,
  `catalogId` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_billing_statement_billing_address1_idx` (`transId`),
  CONSTRAINT `fk_billing_statement_billing_address1` FOREIGN KEY (`transId`) REFERENCES `billing_address` (`transId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing_statement`
--

LOCK TABLES `billing_statement` WRITE;
/*!40000 ALTER TABLE `billing_statement` DISABLE KEYS */;
/*!40000 ALTER TABLE `billing_statement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalog`
--

DROP TABLE IF EXISTS `catalog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `price` double(10,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `expiry` date NOT NULL,
  `category` int(2) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_catalog_category_idx` (`category`),
  CONSTRAINT `fk_catalog_category` FOREIGN KEY (`category`) REFERENCES `category` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalog`
--

LOCK TABLES `catalog` WRITE;
/*!40000 ALTER TABLE `catalog` DISABLE KEYS */;
INSERT INTO `catalog` VALUES (1,'Shirt',45.56,356,'2010-11-22',1,1);
/*!40000 ALTER TABLE `catalog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Kitchen Appliances '),(2,'Laundry/ Clothing Care '),(3,'Maintenance & Accessories '),(4,'Coatings '),(5,'Supplements '),(6,'Other Cross Cutting'),(7,'Food & Beverage '),(8,'Clothing '),(9,'Personal Care '),(10,'Sporting Goods '),(11,'Cleaning '),(12,'Construction Materials '),(13,'Home and Garden ');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_account`
--

DROP TABLE IF EXISTS `customer_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) NOT NULL,
  `midName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `birthDate` date NOT NULL,
  `address` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `startDate` date NOT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_account`
--

LOCK TABLES `customer_account` WRITE;
/*!40000 ALTER TABLE `customer_account` DISABLE KEYS */;
INSERT INTO `customer_account` VALUES (13,'Sherwin','Calleja','Tragura','2015-11-03','Unit 2B 500 Hizon St','sjctrags@yahoo.com','09399175107','2015-11-03','sjctrags'),(14,'Zacarias','Zamora','Barte','2015-11-04','mAKATI','sjctrags@gmail.com','09399175107','2015-11-04','admin'),(15,'Nesa','Puke','Priestly','2016-04-17','Unit 2B 500 Hizon St','sjctrags@gmail.com','09399175107','2016-04-17','maya'),(16,'Nesa','Puke','Priestly','2016-04-17','Unit 2B 500 Hizon St','sjctrags@gmail.com','09399175107','2016-04-17','elly'),(17,'Nesa','Puke','Greus','2016-04-17','Unit 2B 500 Hizon St','sjctrags@gmail.com','09399175107','2016-04-17','nesa'),(18,'owen','owen','owen','2016-04-17','Unit 2B 500 Hizon St','sjctrags@gmail.com','09399175107','2016-04-17','owen'),(19,'Owen','Owen','Owen','2016-04-17','Unit 2B 500 Hizon St','sjctrags@gmail.com','09399175107','2016-04-17','owen'),(20,'Matet','Matet','Matet','2016-04-17','Unit 2B 500 Hizon St','sjctrags@gmail.com','09399175107','2016-04-17','matet'),(21,'Mila','Mila','Mila','2016-04-17','Unit 2B 500 Hizon St','sjctrags@gmail.com','09399175107','2016-04-17','mila');
/*!40000 ALTER TABLE `customer_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `enc_password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`id`,`username`),
  UNIQUE KEY `UK_ia1alb0cw92bv4e4raup8drni` (`id`,`username`),
  CONSTRAINT `fk_login_customer_account1` FOREIGN KEY (`id`) REFERENCES `customer_account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (13,'sjctrags','sjctrags','v7Elfrh5C/aI1GvM1FGZQYq7bqax5Zqe1zLLtQr/h5ptvTeBJqshpUyqumFtbwTQHxke1Lc49gx9plHNsXEPHw=='),(14,'admin','admin','QQDsAuQNRdZdnfOckSBuLqM9LXHAJx5S5tkvD6yBx2UIyvLqUWZYAmpfZqBLZnPmSmD3nre8FLv5VY9+VzWd0w=='),(17,'nesa','nesa','4rc3wXzceSTcxdKKKlcleAxDN1Y3tQ6cD4yDLcgN/3jOsCVg5oVGlBDY8Ljt1cMv/3CXbT0/0mv98Gx73q/JGQ=='),(18,'owen','owen','6yqNzlyq5HTFH7bSpv4xJfVisw2yioO4LJSzVhl/NFZRVJAbZPXzMPB9oIibrcC43eog9fgYTqzLLK7Wb2ySVA=='),(19,'owen','owen','6yqNzlyq5HTFH7bSpv4xJfVisw2yioO4LJSzVhl/NFZRVJAbZPXzMPB9oIibrcC43eog9fgYTqzLLK7Wb2ySVA=='),(20,'matet','matet','q8ub7uPpOrNB1ZUT2pTJjF8QyJE9y1tGfgsKjOC6gw+tsgEwrtYBu3/wHCDBj91ByqyFE6pbFcc9IeeQ3NUErQ=='),(21,'mila','mila','XqOAi/isbcHCKlWjuFKHWgpByN1yz82VUSt3TAdkfHyl/kX1WXWdfJKbn/fxlRAxtPVPnXnjXMH28RQenkXwwg==');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_payment`
--

DROP TABLE IF EXISTS `order_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_payment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transId` int(11) NOT NULL,
  `total` double(10,2) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_order_payment_billing_statement1_idx` (`transId`),
  KEY `fk_order_payment_status1_idx` (`status`),
  CONSTRAINT `fk_order_payment_billing_statement1` FOREIGN KEY (`transId`) REFERENCES `billing_statement` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_payment_status1` FOREIGN KEY (`status`) REFERENCES `status` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_payment`
--

LOCK TABLES `order_payment` WRITE;
/*!40000 ALTER TABLE `order_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permission`
--

DROP TABLE IF EXISTS `permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission`
--

LOCK TABLES `permission` WRITE;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;
INSERT INTO `permission` VALUES (1,'USE_CART','Can buy'),(2,'OFF_CART','Working');
/*!40000 ALTER TABLE `permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ALL','Generic'),(2,'ADMIN','Administrator'),(3,'USER','Customer'),(4,'GUEST','Guest');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_permission`
--

DROP TABLE IF EXISTS `role_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) NOT NULL,
  `permissionId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_role_permission_permission1_idx` (`permissionId`),
  KEY `fk_role_permission_role1_idx` (`roleId`),
  KEY `fk_role_permission_login1_idx` (`userId`),
  CONSTRAINT `fk_role_permission_login1` FOREIGN KEY (`userId`) REFERENCES `login` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_role_permission_permission1` FOREIGN KEY (`permissionId`) REFERENCES `permission` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_role_permission_role1` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_permission`
--

LOCK TABLES `role_permission` WRITE;
/*!40000 ALTER TABLE `role_permission` DISABLE KEYS */;
INSERT INTO `role_permission` VALUES (4,3,2,13),(5,3,1,13),(6,2,2,14),(7,2,1,14),(8,4,2,14),(9,4,1,14),(10,1,2,14),(11,1,1,14),(12,3,2,14),(13,3,1,14),(14,2,2,17),(15,2,1,17),(16,4,2,17),(17,4,1,17),(18,1,2,17),(19,1,1,17),(20,3,2,17),(21,3,1,17),(22,2,2,18),(23,2,1,18),(24,4,2,18),(25,4,1,18),(26,1,2,18),(27,1,1,18),(28,3,2,18),(29,3,1,18),(30,2,2,19),(31,2,1,19),(32,4,2,19),(33,4,1,19),(34,1,2,19),(35,1,1,19),(36,3,2,19),(37,3,1,19),(38,2,2,20),(39,2,1,20),(40,4,2,20),(41,4,1,20),(42,1,2,20),(43,1,1,20),(44,3,2,20),(45,3,1,20),(46,2,2,21),(47,2,1,21),(48,4,2,21),(49,4,1,21),(50,1,2,21),(51,1,1,21),(52,3,2,21),(53,3,1,21);
/*!40000 ALTER TABLE `role_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipment_details`
--

DROP TABLE IF EXISTS `shipment_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipment_details` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `midName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `shippingAddress` varchar(45) NOT NULL,
  `payment_type` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_shipment_details_customer_account1_idx` (`userId`),
  CONSTRAINT `fk_shipment_details_customer_account1` FOREIGN KEY (`userId`) REFERENCES `customer_account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipment_details`
--

LOCK TABLES `shipment_details` WRITE;
/*!40000 ALTER TABLE `shipment_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `shipment_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `status` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
INSERT INTO `status` VALUES (1,'available'),(2,'out-of-stock'),(3,'limited'),(4,'exclusive'),(5,'reservation'),(6,'free');
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

-- Dump completed on 2016-04-19 15:26:15
