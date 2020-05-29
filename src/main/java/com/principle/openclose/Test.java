package com.principle.openclose;

/**
 * Created by ablejava
 */
public class Test {
    /**
     * 软件设计原则
     * 开闭原则
     * @param args
     */
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        if (iCourse instanceof JavaDiscountCourse) {

            JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
            System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() + " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");


        }


    }
}
