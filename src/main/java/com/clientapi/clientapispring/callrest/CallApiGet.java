/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientapi.clientapispring.callrest;

import com.clientapi.clientapispring.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
import org.springframework.http.ResponseEntity;

@Component
public  class CallApiGet {

     RestTemplate restTemplate = new RestTemplate();
    private static final String GET_STUDENT = "http://localhost:8080/Students/1";

    public Student callGetStudent() {
            ResponseEntity<Student> result = restTemplate.getForEntity(GET_STUDENT, Student.class);
            Student student = result.getBody();
            return student;

    }
}
