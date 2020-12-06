package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;

import com.macro.mall.model.CrawlData;
import com.macro.mall.service.CrawlDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 爬取数据功能Controller
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "CrawlDataController", description = "爬取数据管理")
@RequestMapping("/crawlData")
public class CrawlDataController {
    @Autowired
    private CrawlDataService crawlDataService;

    @ApiOperation(value = "获取全部爬取数据列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CrawlData>> getList() {
        return CommonResult.success(crawlDataService.listAllCrawlData());
    }

    @ApiOperation(value = "添加爬取数据")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@Validated @RequestBody CrawlData crawlData) {
        CommonResult commonResult;
        int count = crawlDataService.createCrawlData(crawlData);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation(value = "更新爬取数据")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable("id") String id,
                               @Validated @RequestBody CrawlData crawlData) {
        CommonResult commonResult;
        int count = crawlDataService.updateCrawlData(crawlData);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation(value = "删除爬取数据")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable("id") String id) {
        int count = crawlDataService.deleteCrawlData(id);
        if (count == 1) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "根据爬取数据名称分页获取爬取数据列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET,produces="application/json;charset=UTF-8")
    @ResponseBody
    public CommonResult<CommonPage<CrawlData>> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<CrawlData> crawlDataList = crawlDataService.listCrawlData(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(crawlDataList));
    }

    @ApiOperation(value = "根据编号查询爬取数据信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CrawlData> getItem(@PathVariable("id") String id) {
        return CommonResult.success(crawlDataService.getCrawlData(id));
    }

    @ApiOperation(value = "批量删除爬取数据")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteBatch(@RequestParam("ids") List<String> ids) {
        int count = crawlDataService.deleteCrawlData(ids);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "批量更新显示状态")
    @RequestMapping(value = "/update/showStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateShowStatus(@RequestParam("ids") List<String> ids,
                                   @RequestParam("showStatus") Integer showStatus) {
        int count = crawlDataService.updateShowStatus(ids, showStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

   /* @ApiOperation(value = "批量更新厂家制造商状态")
    @RequestMapping(value = "/update/factoryStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateFactoryStatus(@RequestParam("ids") List<String> ids,
                                      @RequestParam("factoryStatus") Integer factoryStatus) {
        int count = crawlDataService.updateFactoryStatus(ids, factoryStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }*/
}
