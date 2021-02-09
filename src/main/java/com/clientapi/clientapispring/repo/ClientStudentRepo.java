/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientapi.clientapispring.repo;

import com.clientapi.clientapispring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Repository
public interface ClientStudentRepo extends JpaRepository<Student, Integer>{
    
}
