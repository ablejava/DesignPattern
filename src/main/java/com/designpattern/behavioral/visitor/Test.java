package com.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;


public class Test {
    /**
     * 访问者设计模式
     * List,Map,Set组装多个对象的实现，数据的组装和操作相分离
     * @param args
     */
    public static void main(String[] args) {

        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲 -- By Geely");
        codingCourse.setPrice(299);

        /**
         * 数据的组装
         */
        courseList.add(freeCourse);
        courseList.add(codingCourse);

        /**
         * 数据的操作行为
         */
        for(Course course : courseList){
            // Visitor 访问者，可以扩展IVisitor访问者
            course.accept(new Visitor());
        }

    }

    /**
     *
     * 访问者设计模式在spring中的应用
     * org.springframework.beans.factory.config.BeanDefinitionVisitor#visitBeanDefinition(org.springframework.beans.factory.config.BeanDefinition)
     */
}
