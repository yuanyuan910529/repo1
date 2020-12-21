package com.yuan.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

/**
 * 工厂类
 *
 * @author zyl
 * @create 2020-12-08 15:05
 */
public class BeanFactory {

    private static Properties props;

    private static HashMap<String,Object> beans;

    static{
        try {
            props = new Properties();
            beans = new HashMap<>();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("beans.properties");
            props.load(in);
            Enumeration<Object> keys = props.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化配置文件失败!!!");
        }
    }

    /**
     * 根据JavaBean的id获取bean对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return  beans.get(beanName);
    }



}
