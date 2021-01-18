-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mall
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `crawl_site`
--

LOCK TABLES `crawl_site` WRITE;
/*!40000 ALTER TABLE `crawl_site` DISABLE KEYS */;
INSERT INTO `crawl_site` VALUES (1,'北京市公共资源交易服务平台_工程建设','https://ggzyfw.beijing.gov.cn/jyxxggjtbyqs/','meta[http-equiv=SiteName]','index.html','index_',2,3,'.*','.*/.*','meta[http-equiv=ArticleTitle]','div.div-content',NULL,'meta[http-equiv=ColumnKeywords]','meta[http-equiv=PubDate]','meta[http-equiv=SiteDomain]',1,'2021-01-06 16:01:57','2021-01-18 11:44:09'),(2,'北京市公共资源交易服务平台_政府采购','https://ggzyfw.beijing.gov.cn/jyxxcggg/','meta[http-equiv=SiteName]','index.html','index_',2,3,'.*','.*/.*','meta[http-equiv=ArticleTitle]','div.div-content',NULL,'meta[http-equiv=ColumnKeywords]','meta[http-equiv=PubDate]','meta[http-equiv=SiteDomain]',1,'2021-01-06 16:01:57','2021-01-18 11:44:20'),(3,'北京市公共资源交易服务平台_土地使用权','https://ggzyfw.beijing.gov.cn/jyxxzpggg/','meta[http-equiv=SiteName]','index.html','index_',2,3,'.*','.*/.*','meta[http-equiv=ArticleTitle]','div.div-content',NULL,'meta[http-equiv=ColumnKeywords]','meta[http-equiv=PubDate]','meta[http-equiv=SiteDomain]',1,'2021-01-06 16:01:57','2021-01-18 11:44:29'),(4,'北京市公共资源交易服务平台_国有产权','https://ggzyfw.beijing.gov.cn/jyxxswzcgpplxx/','meta[http-equiv=SiteName]','index.html','index_',2,3,'.*','.*/.*','meta[http-equiv=ArticleTitle]','div.div-content',NULL,'meta[http-equiv=ColumnKeywords]','meta[http-equiv=PubDate]','meta[http-equiv=SiteDomain]',1,'2021-01-06 16:01:57','2021-01-18 11:44:40'),(5,'北京市公共资源交易服务平台_软件和信息服务','https://ggzyfw.beijing.gov.cn/jyxxrjxxzbgg/','meta[http-equiv=SiteName]','index.html','index_',2,3,'.*','.*/.*','meta[http-equiv=ArticleTitle]','div.div-content',NULL,'meta[http-equiv=ColumnKeywords]','meta[http-equiv=PubDate]','meta[http-equiv=SiteDomain]',1,'2021-01-06 16:01:57','2021-01-18 11:44:51'),(6,'北京市公共资源交易服务平台_其他','https://ggzyfw.beijing.gov.cn/jyxxqtjygg/','meta[http-equiv=SiteName]','index.html','index_',2,3,'.*','.*/.*','meta[http-equiv=ArticleTitle]','div.div-content',NULL,'meta[http-equiv=ColumnKeywords]','meta[http-equiv=PubDate]','meta[http-equiv=SiteDomain]',1,'2021-01-06 16:01:57','2021-01-18 11:45:01');
/*!40000 ALTER TABLE `crawl_site` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'mall'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-18 14:06:18
