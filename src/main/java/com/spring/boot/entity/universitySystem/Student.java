package com.spring.boot.entity.universitySystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "students")
public class Student extends Person{

    @Column(name = "average_grade")
    private BigDecimal averageGrade;

    @Column(name = "attendance")
    private Boolean attendance;

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
