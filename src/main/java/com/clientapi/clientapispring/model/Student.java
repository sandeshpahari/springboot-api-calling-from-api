/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientapi.clientapispring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Entity
@Table(name = "student")
public class Student {

    
    @Id
    @GeneratedValue
    private int id;

    private String name; 
   
    private String grade;
    
    private String major;

//    public Student() {
//    }
//
//    public Student(int id, String name, String grade, String major) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.grade = grade;
//        this.major = major;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

//    @Override
//    public String toString() {
//        return "Student{" + "id=" + id + ", name=" + name + ", grade=" + grade + ", major=" + major + '}';
//    }

}
