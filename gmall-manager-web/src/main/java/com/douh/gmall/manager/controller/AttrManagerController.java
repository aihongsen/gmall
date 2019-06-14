package com.douh.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.douh.gmall.attrbase.*;
import com.douh.gmall.manager.BaseAttrCollectionService;
import com.douh.gmall.manager.CatalogCollectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class AttrManagerController {
    @Reference
    BaseAttrCollectionService baseAttrCollectionService;
    @Reference
    CatalogCollectionService catalogCollectionService;

    /**
     * 跳转到attrListPage.html 页面
     *
     * @return
     */
    @RequestMapping("/attr/attrListPage.html")
    public String attrListPage() {
        return "/attr/attrListPage";
    }

    /**
     * BaseCatalog1表
     * 查询所有BaseCatalog1数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/catalog/1/list.json")
    public List<BaseCatalog1> catalog1_SL_all() {
        return catalogCollectionService.catalog1_SL_all();
    }

    /**
     * BaseCatalog2表
     * 根据 catalog1_id 查询列表
     *
     * @param catalog1_id
     * @return
     */
    @ResponseBody
    @RequestMapping("/catalog/2/list.json")
    public List<BaseCatalog2> catelog2_SL_Bycatalog1_id(Long catalog1_id) {
        return catalogCollectionService.catelog2_SL_Bycatalog1_id(catalog1_id);
    }

    /**
     * BaseCatalog3表
     * 根据 catalog2_id 查询列表
     *
     * @param catalog2_id
     * @return
     */
    @ResponseBody
    @RequestMapping("/catalog/3/list.json")
    public List<BaseCatalog3> catelog3_SL_Bycatalog2_id(Long catalog2_id) {
        return catalogCollectionService.catelog3_SL_Bycatalog2_id(catalog2_id);
    }

    /**
     * BaseAttrInfo 表
     * 根据catalog3_id 获取平台属性名
     *
     * @param catalog3_id
     * @return List
     */
    @ResponseBody
    @RequestMapping("/baseAttrInfo.json")
    public List<BaseAttrInfo> baseAttrInfo_SL_Bycatalog3_id(Long catalog3_id) {

        return baseAttrCollectionService.baseAttrInfo_SL_Bycatalog3_id(catalog3_id);
    }

    /**
     * BaseAttrValue表
     * 根据平台属性名attr_id 获取平台属性值
     *
     * @param attr_id
     * @return list
     */
    @ResponseBody
    @RequestMapping("/baseAttrValue.json")
    public List<BaseAttrValue> baseAttrValue_SL_Byattr_ud(Long attr_id) {
        return baseAttrCollectionService.baseAttrValue_SL_Byattr_ud(attr_id);
    }
}
