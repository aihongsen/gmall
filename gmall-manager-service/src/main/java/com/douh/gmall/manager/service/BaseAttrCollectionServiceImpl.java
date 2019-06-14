package com.douh.gmall.manager.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.douh.gmall.attrbase.BaseAttrInfo;
import com.douh.gmall.attrbase.BaseAttrValue;
import com.douh.gmall.manager.BaseAttrCollectionService;
import com.douh.gmall.manager.mapper.BaseAttrInfoMapper;
import com.douh.gmall.manager.mapper.BaseAttrValueMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @company: 北京德欧汇进出口贸易有限公司
 * @Month： 六月
 * @CreateData: 2019/06/07
 * Author       Time             Features
 * AiHongSen    23:57
 * 方法说明
 * SL 代表查询方法
 * DL 代表删除方法
 * UP 代表更新方法
 * IN 代表新增方法
 */
@Service
public class BaseAttrCollectionServiceImpl implements BaseAttrCollectionService {
    @Autowired
    BaseAttrInfoMapper baseAttrInfoMapper;

    @Autowired
    BaseAttrValueMapper baseAttrValueMapper;
    /**
     * BaseAttrInfo 表
     * 根据 catalog3_id 进行查询
     * @param catalog3_id
     * @return
     */
    @Override
    public List<BaseAttrInfo> baseAttrInfo_SL_Bycatalog3_id(Long catalog3_id) { return baseAttrInfoMapper.selectList(new QueryWrapper<BaseAttrInfo>().eq("catalog3_id",catalog3_id));
    }

    /**
     * BaseAttrValue表
     * 根据平台属性名attr_id 获取平台属性值
     * @param attr_id
     * @return list
     */
    @Override
    public List<BaseAttrValue> baseAttrValue_SL_Byattr_ud(Long attr_id) { return baseAttrValueMapper.selectList(new QueryWrapper<BaseAttrValue>().eq("attr_id", attr_id));
    }
}
