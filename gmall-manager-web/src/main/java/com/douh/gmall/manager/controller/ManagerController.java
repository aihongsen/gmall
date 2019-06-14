package com.douh.gmall.manager.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.douh.gmall.attrbase.BaseCatalog1;
import com.douh.gmall.manager.CatalogCollectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ManagerController {
    @Reference
    CatalogCollectionService catalogCollectionService;
    /**
     * 跳转入口界面
     * @return
     */
    @RequestMapping("/main")
    public String main(){
        return "main";
    }

}
