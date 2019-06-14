package com.douh.gmall.attrbase;

import com.douh.gmall.SupperBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述:base_catalog2表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2019-06-05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseCatalog2 extends SupperBase implements Serializable {
    /**
     * 二级分类名称
     */
    private String name;

    /**
     * 一级分类编号
     */
    private Long catalog1Id;
}