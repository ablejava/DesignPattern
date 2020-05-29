package com.designpattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    /**
     * 容器单例
     *
     * 这种容器模式会有多线程安全问题，
     */
    private static Map<String,Object> singletonMap = new ConcurrentHashMap<String, Object>();

    public static void putInstance(String key,Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }


}
