package com.macro.mall.service;

import com.macro.mall.model.CrawlSite;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品站点Service
 * Created by macro on 2018/4/26.
 */
public interface CrawlSiteService {
    /**
     * 获取所有站点
     */
    List<CrawlSite> listAllCrawlSite();

    /**
     * 创建站点
     */
    int createCrawlSite(CrawlSite crawlSite);

    /**
     * 修改站点
     */
    @Transactional
    int updateCrawlSite( CrawlSite crawlSite);

    /**
     * 删除站点
     */
    int deleteCrawlSite(String id);

    /**
     * 批量删除站点
     */
    int deleteCrawlSite(List<String> ids);

    /**
     * 分页查询站点
     */
    List<CrawlSite> listCrawlSite(String keyword, int pageNum, int pageSize);

    /**
     * 获取站点
     */
    CrawlSite getCrawlSite(String id);

    /**
     * 修改显示状态
     */
    int updateShowStatus(List<String> ids, Integer showStatus);

    
}
