package com.principle.singleresponsibility;

/**
 * Created by ablejava
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
