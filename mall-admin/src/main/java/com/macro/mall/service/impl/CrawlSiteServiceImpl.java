package com.macro.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.CrawlSiteMapper;
import com.macro.mall.model.CrawlSite;
import com.macro.mall.model.CrawlSiteExample;
import com.macro.mall.service.CrawlSiteService;

/**
 * 商品品牌Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class CrawlSiteServiceImpl implements CrawlSiteService {
    @Autowired
    private CrawlSiteMapper crawlSiteMapper;


    @Override
    public List<CrawlSite> listAllCrawlSite() {
        return crawlSiteMapper.selectByExample(new CrawlSiteExample());
    }

    @Override
    public int createCrawlSite(CrawlSite crawlSite) {
        return crawlSiteMapper.insertSelective(crawlSite);
    }

    @Override
    public int updateCrawlSite(CrawlSite crawlSite) {
    	
        return crawlSiteMapper.updateByPrimaryKey(crawlSite);
    }

    @Override
    public int deleteCrawlSite(Long id) {
        return crawlSiteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteCrawlSite(List<Long> ids) {
        CrawlSiteExample csCrawlSiteExample = new CrawlSiteExample();
        csCrawlSiteExample.createCriteria().andIdIn(ids);
        return crawlSiteMapper.deleteByExample(csCrawlSiteExample);
    }

    @Override
    public List<CrawlSite> listCrawlSite(String keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CrawlSiteExample csCrawlSiteExample = new CrawlSiteExample();
        csCrawlSiteExample.setOrderByClause("update_time desc");
        CrawlSiteExample.Criteria criteria = csCrawlSiteExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSiteLike("%" + keyword + "%");
        }
        return crawlSiteMapper.selectByExample(csCrawlSiteExample);
    }

    @Override
    public CrawlSite getCrawlSite(Long id) {
        return crawlSiteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateStatus(List<Long> ids, Integer status) {
        CrawlSite csCrawlSite = new CrawlSite();
        csCrawlSite.setStatus(status);
        CrawlSiteExample csCrawlSiteExample = new CrawlSiteExample();
        csCrawlSiteExample.createCriteria().andIdIn(ids);
        return crawlSiteMapper.updateByExampleSelective(csCrawlSite, csCrawlSiteExample);
    }


}
