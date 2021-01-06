package com.macro.mall.service;


import com.macro.mall.model.CrawlData;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品爬取数据Service
 * Created by macro on 2018/4/26.
 */
public interface CrawlDataService {
    /**
     * 获取所有爬取数据
     */
    List<CrawlData> listAllCrawlData();

    /**
     * 创建爬取数据
     */
    int createCrawlData(CrawlData pmsCrawlDataParam);

    /**
     * 修改爬取数据
     */
    @Transactional
    int updateCrawlData( CrawlData pmsCrawlDataParam);

    /**
     * 删除爬取数据
     */
    int deleteCrawlData(Long id);

    /**
     * 批量删除爬取数据
     */
    int deleteCrawlData(List<Long> ids);

    /**
     * 分页查询爬取数据
     */
    List<CrawlData> listCrawlData(String keyword, int pageNum, int pageSize);

    /**
     * 获取爬取数据
     */
    CrawlData getCrawlData(Long id);

    /**
     * 修改显示状态
     */
    int updateStatus(List<Long> ids, Integer showStatus);

    
}
