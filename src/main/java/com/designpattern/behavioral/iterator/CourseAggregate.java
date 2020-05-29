package com.designpattern.behavioral.iterator;

/**
 * .
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
