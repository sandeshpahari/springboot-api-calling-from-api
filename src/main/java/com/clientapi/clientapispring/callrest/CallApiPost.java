/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientapi.clientapispring.callrest;

import com.clientapi.clientapispring.model.Student;
import com.clientapi.clientapispring.repo.ClientStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Component
public class CallApiPost {

    @Autowired
    ClientStudentRepo clientStuRepo;
    @Autowired
    CallApiGet callApiGet;

    public void postData() {

        try {
            Student student1 = new Student();
            Student student = callApiGet.callGetStudent();

            student1.setName(student.getName());
            student1.setGrade(student.getGrade());
            student1.setMajor(student.getMajor());
            clientStuRepo.save(student1);
            System.out.println(student.getName() + " " + student.getGrade() + " " + student.getMajor());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something Went Wrong");

        }

    }
}
