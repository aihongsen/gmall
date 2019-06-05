package com.douh.gmall.manager;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    @TableLogic   //逻辑删除
    private Integer delFlag;
}
