package com.es.feign.controller;


import com.es.feign.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping(value = "/is-ok")
    public String isOk() {
        return "The Service Status is OK!";
    }


    @GetMapping(value = "/accounts/{userId}")
    public String getStudentHystrix(@PathVariable("userId") String userId) {
        return accountService.getAccount(userId);
    }

    @GetMapping(value = "/accounts")
    public String getAccountList(@RequestParam("userId") String userId,
                         @RequestParam("type") String type) {
        return accountService.getAccountList(userId, type);
    }

}


