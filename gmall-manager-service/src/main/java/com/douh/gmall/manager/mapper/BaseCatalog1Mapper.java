package com.douh.gmall.manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.douh.gmall.attrbase.BaseCatalog1;

import java.util.List;


public interface BaseCatalog1Mapper extends BaseMapper<BaseCatalog1> {

    /**
     * BaseCatalog1表
     * 根据名查一条数据
     * @param baseCatalog1
     * @return
     */
    public BaseCatalog1 SL_Byname(BaseCatalog1 baseCatalog1);




}
