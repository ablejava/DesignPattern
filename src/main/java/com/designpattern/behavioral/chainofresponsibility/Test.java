package com.designpattern.behavioral.chainofresponsibility;

/**
 *
 */
public class Test {
    /**
     * 请求的发送者与接收者(请求的处理)解耦
     * 责任链可以动态组合
     * @param args
     */
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式精讲 -- By Geely");
        course.setArticle("Java设计模式精讲的手记");
        course.setVideo("Java设计模式精讲的视频");

        // 设置下一个审批者
        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }

    /**
     * 责任链模式与状态模式区别：
     * 责任链模式不知道下一个处理对象是谁，状态模式知道下个处理状态对象
     *
     * 责任链模式的应用：
     * javax.servlet.FilterChain#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
     */
}
