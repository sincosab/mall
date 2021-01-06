CREATE TABLE `crawl_site` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `site` varchar(100) DEFAULT NULL,
  `init_url` varchar(200) DEFAULT NULL,
  `page_url` varchar(200) DEFAULT NULL,
  `page_start` int DEFAULT NULL,
  `page_end` int DEFAULT NULL,
  `regex` varchar(200) DEFAULT NULL,
  `match_url` varchar(250) DEFAULT NULL,
  `title` VARCHAR(200) DEFAULT NULL,
  `content` VARCHAR(200) DEFAULT NULL,
  `meta_flag` varchar(30) DEFAULT NULL,
  `keyword` VARCHAR(100) DEFAULT NULL,
  `publish_time` VARCHAR(30) DEFAULT NULL,
  `domain` VARCHAR(50) DEFAULT NULL,
  `status` int DEFAULT 1,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `crawl_data` (
   `id` bigint NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(200) DEFAULT NULL,
    `content` TEXT,
    `site` VARCHAR(50) DEFAULT NULL,
    `domain` VARCHAR(50) DEFAULT NULL,
    `url` VARCHAR(250) DEFAULT NULL,
    `keyword` VARCHAR(100) DEFAULT NULL,
    `province` VARCHAR(20) DEFAULT NULL,
    `city` VARCHAR(20) DEFAULT NULL,
    `publish_time` VARCHAR(30) DEFAULT NULL,
    `status` int DEFAULT 1,
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
    `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;