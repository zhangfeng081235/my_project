package com.myself.devp.myusercenter.core.filter;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Field;

public class SpringProcessor implements BeanPostProcessor {
    private String  id;
    private  String name ;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> aClass = bean.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (int i = 0; i <declaredFields.length ; i++) {
            declaredFields[i].setAccessible(true);
            if (declaredFields[i].getName().equals("id")){
                try {
                    declaredFields[i].set(bean,"kkkkk");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    declaredFields[i].set(bean,"张三");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            Object o = aClass.newInstance();
            return o;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> aClass = bean.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (int i = 0; i <declaredFields.length ; i++) {
            declaredFields[i].setAccessible(true);
            if (declaredFields[i].getName().equals("id")){
                try {
                    declaredFields[i].set(bean,"kkkkk");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    declaredFields[i].set(bean,"张三");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            Object o = aClass.newInstance();
            return o;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
