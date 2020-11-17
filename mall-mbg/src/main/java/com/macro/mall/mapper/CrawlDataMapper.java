package com.macro.mall.mapper;

import com.macro.mall.model.CrawlData;
import com.macro.mall.model.CrawlDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrawlDataMapper {
    long countByExample(CrawlDataExample example);

    int deleteByExample(CrawlDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrawlData record);

    int insertSelective(CrawlData record);

    List<CrawlData> selectByExampleWithBLOBs(CrawlDataExample example);

    List<CrawlData> selectByExample(CrawlDataExample example);

    CrawlData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrawlData record, @Param("example") CrawlDataExample example);

    int updateByExampleWithBLOBs(@Param("record") CrawlData record, @Param("example") CrawlDataExample example);

    int updateByExample(@Param("record") CrawlData record, @Param("example") CrawlDataExample example);

    int updateByPrimaryKeySelective(CrawlData record);

    int updateByPrimaryKeyWithBLOBs(CrawlData record);

    int updateByPrimaryKey(CrawlData record);
}