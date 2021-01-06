/*
-- Query: SELECT * FROM mall.crawl_site
LIMIT 0, 10

-- Date: 2021-01-06 16:27
*/
INSERT INTO `` (`id`,`site`,`init_url`,`page_url`,`page_start`,`page_end`,`regex`,`match_url`,`title`,`content`,`meta_flag`,`keyword`,`publish_time`,`domain`,`base_url`,`status`,`create_time`,`update_time`,`domain_name`) VALUES (1,'meta[http-equiv=SiteName]','index.html','index_',2,3,'.*','.*/.*','meta[http-equiv=ArticleTitle]','div.div-content',NULL,'meta[http-equiv=ColumnKeywords]','meta[http-equiv=PubDate]','meta[http-equiv=SiteDomain]','https://ggzyfw.beijing.gov.cn/jyxxggjtbyqs/',2,'2021-01-06 16:01:57','2021-01-06 16:27:02','北京');
