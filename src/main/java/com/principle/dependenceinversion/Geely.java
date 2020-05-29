package com.principle.dependenceinversion;

/**
 * Created by ablejava
 */
public class Geely {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;



    public void studyImoocCourse(){
        iCourse.studyCourse();
    }






}
