package com.designpattern.behavioral.mediator;

import java.util.Date;

/**
 * 中介者
 */
public class StudyGroup {

    /**
     * 谁说来什么消息
     * @param user
     * @param message
     */
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
