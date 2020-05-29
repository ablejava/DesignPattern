package com.designpattern.behavioral.mediator;

/**
 *
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    /**
     * 中介者核心
     * 用户将消息发送给中介者
     * @param message
     */
    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
