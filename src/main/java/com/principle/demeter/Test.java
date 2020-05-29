package com.principle.demeter;

/**
 * Created by ablejava
 */
public class Test {
    /**
     * 迪米特法则
     * @param args
     */
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
