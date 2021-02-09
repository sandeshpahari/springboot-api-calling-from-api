/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientapi.clientapispring.scheduler;

import com.clientapi.clientapispring.callrest.CallApiPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Component
public class BatchCallToApi {
    @Autowired
    CallApiPost callApiPost;

    @Scheduled(cron = "*/40 * * * * *")
    public void cronJob() {
//        CallApiGet.callGetStudent()
            callApiPost.postData();
    }
}
