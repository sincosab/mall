package com.macro.mall.mapper;

import com.macro.mall.model.CrawlSite;
import com.macro.mall.model.CrawlSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlSiteMapper {
    long countByExample(CrawlSiteExample example);

    int deleteByExample(CrawlSiteExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrawlSite record);

    int insertSelective(CrawlSite record);

    List<CrawlSite> selectByExample(CrawlSiteExample example);

    CrawlSite selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrawlSite record, @Param("example") CrawlSiteExample example);

    int updateByExample(@Param("record") CrawlSite record, @Param("example") CrawlSiteExample example);

    int updateByPrimaryKeySelective(CrawlSite record);

    int updateByPrimaryKey(CrawlSite record);
}