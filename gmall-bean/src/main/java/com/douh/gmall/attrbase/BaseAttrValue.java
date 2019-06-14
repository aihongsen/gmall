package com.douh.gmall.attrbase;

import com.douh.gmall.SupperBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述:base_attr_value表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2019-06-05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseAttrValue extends SupperBase implements Serializable {

    /**
     * 属性值名称
     */
    private String valueName;

    /**
     * 属性id
     */
    private Long attrId;
}