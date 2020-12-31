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
    public int deleteCrawlData(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteCrawlData(List<Long> ids) {
        CrawlDataExample crawlDataExample = new CrawlDataExample();
        crawlDataExample.createCriteria().andIdIn(ids);
        return brandMapper.deleteByExample(crawlDataExample);
    }

    @Override
    public List<CrawlData> listCrawlData(String keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CrawlDataExample crawlDataExample = new CrawlDataExample();
        crawlDataExample.setOrderByClause("create_time desc");
        CrawlDataExample.Criteria criteria = crawlDataExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSiteLike("%" + keyword + "%");
        }
        return brandMapper.selectByExampleWithBLOBs(crawlDataExample);
    }

    @Override
    public CrawlData getCrawlData(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        CrawlData pmsCrawlData = new CrawlData();
       // pmsCrawlData.setShowStatus(showStatus);
        CrawlDataExample crawlDataExample = new CrawlDataExample();
        crawlDataExample.createCriteria().andIdIn(ids);
        return brandMapper.updateByExampleSelective(pmsCrawlData, crawlDataExample);
    }

  
}
