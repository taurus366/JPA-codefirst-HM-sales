package com.spring.boot.entity.universitySystem;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends Person{

    @Column(name = "average_grade")
    private BigDecimal averageGrade;

    @Column(name = "attendance")
    private Boolean attendance;


    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "students",targetEntity = Course.class)
    private Set<Course>  courses = new HashSet<>();

    public Set<Course> getCourses() {
        return courses;
    }



    public Student() {

    }

    public Student(String firstName, String lastName, String phoneNumber, BigDecimal averageGrade, Boolean attendance) {
        super(firstName, lastName, phoneNumber);
        this.averageGrade = averageGrade;
        this.attendance = attendance;
    }

    public BigDecimal getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(BigDecimal averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Boolean getAttendance() {
        return attendance;
    }

    public void setAttendance(Boolean attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "averageGrade=" + averageGrade +
                ", attendance=" + attendance +
                '}';
    }
}
