package com.es.feign.service;

import org.springframework.stereotype.Component;

@Component("AccountServiceHystrix")
public class AccountServiceHystrix implements AccountService {


    @Override
    public String getAccount(String userId) {
        return "Feign-Service : " + "There is an error!";
    }

    @Override
    public String getAccountList(String userId, String type) {
        return "error";
    }

}
