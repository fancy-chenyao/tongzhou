package cn.ncepu.service_basicdata.controller;


import cn.ncepu.common_utils.R;
import cn.ncepu.service_basicdata.entity.BasicdataEnterpriseinfo;
import cn.ncepu.service_basicdata.service.BasicdataEnterpriseinfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dreamtech
 * @since 2020-08-29
 */
@RestController
@RequestMapping("/service_basicdata/enterpriseinfo")
@CrossOrigin
public class BasicdataEnterpriseinfoController {
    //注入service
    @Autowired
    private BasicdataEnterpriseinfoService basicdataEnterpriseinfoService;

    //添加企业
    @ApiOperation(value = "新增企业")
    @PostMapping("addEnterprise")
    public R addEnterprise(@RequestBody BasicdataEnterpriseinfo basicdataEnterpriseinfo){
        boolean save = basicdataEnterpriseinfoService.save(basicdataEnterpriseinfo);
        if(save){
            return R.ok();
        }else {
            return R.error();
        }
    }

    //简单查询所以企业信息
    @ApiOperation(value = "简单查询企业")
    @GetMapping("findAll")
    public List<BasicdataEnterpriseinfo> findAllEnterprise(){
        List<BasicdataEnterpriseinfo> list = basicdataEnterpriseinfoService.list(null);
        return list;
    }


}

