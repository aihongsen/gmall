package com.douh.gmall.manager;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.douh.gmall.attrbase.BaseCatalog1;
import com.douh.gmall.attrbase.BaseCatalog2;
import com.douh.gmall.attrbase.BaseCatalog3;
import com.douh.gmall.manager.mapper.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManagerServiceApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    BaseCatalog2Mapper baseCatalog2Mapper;
    @Autowired
    BaseCatalog3Mapper baseCatalog3Mapper;
    @Autowired
    BaseAttrInfoMapper baseAttrInfoMapper;
    @Autowired
    BaseAttrValueMapper baseAttrValueMapper;
    @Autowired
    BaseCatalog1Mapper baseCatalog1Mapper;
    @Test
    public void test1(){

    }

    @Test
    public void test2(){
        BaseCatalog1 baseCatalog1 = new BaseCatalog1();
        baseCatalog1.setName("骏琦用品");
        int i = baseCatalog1Mapper.insert(baseCatalog1);
        if (i>0) {
            log.info("成功！.......id是{},name是{}",baseCatalog1.getId(),baseCatalog1.getName());
        }else {
            log.info("失败！");
        }
    }

    @Test
    public void test3() {
        QueryWrapper<BaseCatalog3> queryWrapper = new QueryWrapper<BaseCatalog3>().eq("catalog2_id", 1L);

        for (BaseCatalog3 baseCatalog3 : baseCatalog3Mapper.selectList(queryWrapper)) {
            log.info("catelog3->>>>>>ID={},name={},catalog2_id={}",baseCatalog3.getId(),baseCatalog3.getName(),baseCatalog3.getCatalog2Id());
        }

    }
}
