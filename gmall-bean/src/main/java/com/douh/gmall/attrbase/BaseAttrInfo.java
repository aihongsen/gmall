package com.douh.gmall.attrbase;

import com.douh.gmall.SupperBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述:base_attr_info表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2019-06-05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseAttrInfo extends SupperBase implements Serializable {

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 三级分类id
     */
    private Long catalog3Id;
}