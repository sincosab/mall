package com.macro.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.CrawlDataMapper;
import com.macro.mall.model.CrawlData;
import com.macro.mall.model.CrawlDataExample;
import com.macro.mall.service.CrawlDataService;

/**
 * 商品品牌Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class CrawlDataServiceImpl implements CrawlDataService {
    @Autowired
    private CrawlDataMapper brandMapper;


    @Override
    public List<CrawlData> listAllCrawlData() {
        return brandMapper.selectByExample(new CrawlDataExample());
    }

    @Override
    public int createCrawlData(CrawlData crawlData) {
        return brandMapper.insertSelective(crawlData);
    }

    @Override
    public int updateCrawlData( CrawlData crawlData) {
        return brandMapper.updateByPrimaryKeySelective(crawlData);
    }

    @Override
    public int deleteCrawlData(String id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteCrawlData(List<String> ids) {
        CrawlDataExample pmsCrawlDataExample = new CrawlDataExample();
        pmsCrawlDataExample.createCriteria().andIdIn(ids);
        return brandMapper.deleteByExample(pmsCrawlDataExample);
    }

    @Override
    public List<CrawlData> listCrawlData(String keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CrawlDataExample pmsCrawlDataExample = new CrawlDataExample();
        pmsCrawlDataExample.setOrderByClause("sort desc");
        CrawlDataExample.Criteria criteria = pmsCrawlDataExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSiteLike("%" + keyword + "%");
        }
        return brandMapper.selectByExample(pmsCrawlDataExample);
    }

    @Override
    public CrawlData getCrawlData(String id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateShowStatus(List<String> ids, Integer showStatus) {
        CrawlData pmsCrawlData = new CrawlData();
       // pmsCrawlData.setShowStatus(showStatus);
        CrawlDataExample pmsCrawlDataExample = new CrawlDataExample();
        pmsCrawlDataExample.createCriteria().andIdIn(ids);
        return brandMapper.updateByExampleSelective(pmsCrawlData, pmsCrawlDataExample);
    }

  
}