package com.vankeytech.pmp.api.controller.common;

import com.vankeytech.pmp.api.param.CityIds;
import com.vankeytech.pmp.api.pojo.JsonResult;
import com.vankeytech.pmp.api.util.ResponseUtil;
import com.vankeytech.pmp.common.intf.CommonIntf;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.Pattern;

/**
 * 公共接口 - 地区数据接口
 * @author AlexWong
 */
@Api(value = "公共接口", description = "地区数据接口")
@RestController
@RequestMapping("/common")
public class RegionController {
    @Resource
    private CommonIntf commonIntf;

    @ApiOperation(value = "获取省/直辖市信息")
    @GetMapping("/getProvinces")
    public JsonResult getProvinces() {
        return ResponseUtil.success(commonIntf.getProvinces());
    }

    @ApiOperation(value = "获取城市信息")
    @ApiImplicitParam(name = "parentId", value = "父级城市ID", required = true, dataType = "string", paramType = "query")
    @GetMapping("/getCities")
    public JsonResult getCities(@RequestParam String parentId) {
        return ResponseUtil.success(commonIntf.getCities(parentId));
    }

    @ApiOperation(value = "根据城市编码获取城市数据")
    @ApiImplicitParam(name = "ids", value = "城市编码，多个编码用','隔开", required = true, dataType = "string", paramType = "query")
    @GetMapping("/getRegions")
    public JsonResult getRegions(@Validated CityIds ids) {
        return ResponseUtil.success(commonIntf.getRegions(ids.getIds()));
    }
}
