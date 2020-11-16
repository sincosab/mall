CREATE TABLE `crawl_site` (
  `id` varchar(32) NOT NULL,
  `site` varchar(100) DEFAULT NULL,
  `init_url` varchar(200) DEFAULT NULL,
  `page_url` varchar(200) DEFAULT NULL,
  `page_start` int DEFAULT NULL,
  `page_end` int DEFAULT NULL,
  `regex` varchar(200) DEFAULT NULL,
  `match_url` varchar(250) DEFAULT NULL,
  `meta_flag` varchar(30) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `crawl_data` (
    `id` VARCHAR(32) NOT NULL,
    `title` VARCHAR(200) DEFAULT NULL,
    `content` TEXT,
    `site` VARCHAR(50) DEFAULT NULL,
    `domain` VARCHAR(50) DEFAULT NULL,
    `url` VARCHAR(250) DEFAULT NULL,
    `keyword` VARCHAR(100) DEFAULT NULL,
    `province` VARCHAR(20) DEFAULT NULL,
    `city` VARCHAR(20) DEFAULT NULL,
    `publish_time` VARCHAR(30) DEFAULT NULL,
    `create_time` DATETIME DEFAULT NULL,
    PRIMARY KEY (`id`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;