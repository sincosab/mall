package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;

import com.macro.mall.model.CrawlSite;
import com.macro.mall.service.CrawlSiteService;

import cn.hutool.core.lang.UUID;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 站点功能Controller
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "CrawlSiteController", description = "商品站点管理")
@RequestMapping("/crawlSite")
public class CrawlSiteController {
    @Autowired
    private CrawlSiteService crawlSiteService;

    @ApiOperation(value = "获取全部站点列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CrawlSite>> getList() {
        return CommonResult.success(crawlSiteService.listAllCrawlSite());
    }

    @ApiOperation(value = "添加站点")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@Validated @RequestBody CrawlSite crawlSite) {
        CommonResult commonResult;
        crawlSite.setId("222");
        int count = crawlSiteService.createCrawlSite(crawlSite);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation(value = "更新站点")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable("id") String id,
                               @Validated @RequestBody CrawlSite crawlSite) {
        CommonResult commonResult;
        int count = crawlSiteService.updateCrawlSite(crawlSite);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation(value = "删除站点")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable("id") String id) {
        int count = crawlSiteService.deleteCrawlSite(id);
        if (count == 1) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "根据站点名称分页获取站点列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<CrawlSite>> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<CrawlSite> crawlSiteList = crawlSiteService.listCrawlSite(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(crawlSiteList));
    }

    @ApiOperation(value = "根据编号查询站点信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CrawlSite> getItem(@PathVariable("id") String id) {
        return CommonResult.success(crawlSiteService.getCrawlSite(id));
    }

    @ApiOperation(value = "批量删除站点")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteBatch(@RequestParam("ids") List<String> ids) {
        int count = crawlSiteService.deleteCrawlSite(ids);
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
        int count = crawlSiteService.updateShowStatus(ids, showStatus);
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
        int count = crawlSiteService.updateFactoryStatus(ids, factoryStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }*/
}
