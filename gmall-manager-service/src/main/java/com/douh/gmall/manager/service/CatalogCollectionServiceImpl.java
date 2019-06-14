package com.douh.gmall.manager.service;
import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.douh.gmall.attrbase.BaseCatalog1;
import com.douh.gmall.attrbase.BaseCatalog2;
import com.douh.gmall.attrbase.BaseCatalog3;
import com.douh.gmall.manager.CatalogCollectionService;
import com.douh.gmall.manager.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CatalogCollectionServiceImpl implements CatalogCollectionService {
    /**
     * 导入mapper
     */
    @Autowired
    BaseCatalog1Mapper baseCatalog1Mapper;
    @Autowired
    BaseCatalog2Mapper baseCatalog2Mapper;
    @Autowired
    BaseCatalog3Mapper baseCatalog3Mapper;
    @Autowired
    BaseAttrInfoMapper baseAttrInfoMapper;
    @Autowired
    BaseAttrValueMapper baseAttrValueMapper;

    /**
     * BaseCatalog1表
     * 查询所有BaseCatalog1数据
     * @return
     */
    @Override
    public List<BaseCatalog1> catalog1_SL_all() {
        return baseCatalog1Mapper.selectList(null);
    }

    /**
     * BaseCatalog1表
     * 插入一条数据
     * @param baseCatalog1
     * @return
     */
    @Override
    public int catalog1_IN_one(BaseCatalog1 baseCatalog1) {
        return baseCatalog1Mapper.insert(baseCatalog1);
    }

    /**
     * BaseCatalog1表
     * 根据名查一条数据
     * @param baseCatalog1
     * @return
     */
    @Override
    public BaseCatalog1 catalog1_SL_Byname(BaseCatalog1 baseCatalog1) {
        return baseCatalog1Mapper.SL_Byname(baseCatalog1);
    }

    /**
     * BaseCatalog2表
     * 根据 catalog1_id 查询列表
     * @param catalog1_id
     * @return
     */
    @Override
    public List<BaseCatalog2> catelog2_SL_Bycatalog1_id(Long catalog1_id) {
        QueryWrapper<BaseCatalog2> queryWrapper = new QueryWrapper<BaseCatalog2>().eq("catalog1_id", catalog1_id);
        return  baseCatalog2Mapper.selectList(queryWrapper);
    }

    /**
     * BaseCatalog3表
     * 根据 catalog2_id 查询列表
     * @param catalog2_id
     * @return
     */
    @Override
    public List<BaseCatalog3> catelog3_SL_Bycatalog2_id(Long catalog2_id) {
        QueryWrapper<BaseCatalog3> queryWrapper = new QueryWrapper<BaseCatalog3>().eq("catalog2_id", catalog2_id);
        return baseCatalog3Mapper.selectList(queryWrapper);
    }
}
