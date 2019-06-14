package com.douh.gmall.manager;

import com.douh.gmall.attrbase.BaseAttrInfo;
import com.douh.gmall.attrbase.BaseAttrValue;

import java.util.List;

/**
 * @company: 北京德欧汇进出口贸易有限公司
 * @Month： 六月
 * @CreateData: 2019/06/07
 * Author       Time             Features
 * AiHongSen    23:52
 * 方法说明
 * SL 代表查询方法
 * DL 代表删除方法
 * UP 代表更新方法
 * IN 代表新增方法
 */
public interface BaseAttrCollectionService {
    /**
     * BaseAttrInfo 表
     * 根据catalog3_id 获取平台属性名
     * @param baseAttrInfo
     * @return List
     */
    public List<BaseAttrInfo> baseAttrInfo_SL_Bycatalog3_id(Long catalog3_id);


    /**
     * BaseAttrValue表
     * 根据平台属性名attr_id 获取平台属性值
     * @param attr_id
     * @return list
     */
    public List<BaseAttrValue> baseAttrValue_SL_Byattr_ud(Long attr_id);
}
