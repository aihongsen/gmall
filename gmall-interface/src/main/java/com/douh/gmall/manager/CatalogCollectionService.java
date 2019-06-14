package com.douh.gmall.manager;

import com.douh.gmall.attrbase.BaseCatalog1;
import com.douh.gmall.attrbase.BaseCatalog2;
import com.douh.gmall.attrbase.BaseCatalog3;

import java.util.List;
/**
 * @company: 北京德欧汇进出口贸易有限公司
 * @Month： 六月
 * @CreateData: 2019/06/07
 * Author       Time             Features
 * AiHongSen    23:47            Catalog1~3相关方法
 * 方法说明
 * SL 代表查询方法
 * DL 代表删除方法
 * UP 代表更新方法
 * IN 代表新增方法
 */

public interface CatalogCollectionService {

    /**
     * BaseCatalog1表
     * 查询所有BaseCatalog1数据
     * @return
     */
    public List<BaseCatalog1> catalog1_SL_all();

    /**
     * BaseCatalog1表
     * 插入一条数据
     * @param baseCatalog1
     * @return
     */
    public int catalog1_IN_one(BaseCatalog1 baseCatalog1);

    /**
     * BaseCatalog1表
     * 根据名查一条数据
     * @param baseCatalog1
     * @return
     */
    public BaseCatalog1 catalog1_SL_Byname(BaseCatalog1 baseCatalog1);


    /**
     * BaseCatalog2表
     * 根据 catalog1_id 查询列表
     * @param catalog1_id
     * @return
     */
    public List<BaseCatalog2> catelog2_SL_Bycatalog1_id(Long catalog1_id);


    /**
     * BaseCatalog3表
     * 根据 catalog2_id 查询列表
     * @param catalog2_id
     * @return
     */
    public List<BaseCatalog3> catelog3_SL_Bycatalog2_id(Long catalog2_id);
}
