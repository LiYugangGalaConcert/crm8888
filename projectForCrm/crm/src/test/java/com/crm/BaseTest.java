package com.crm;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件的位置
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class BaseTest {

}