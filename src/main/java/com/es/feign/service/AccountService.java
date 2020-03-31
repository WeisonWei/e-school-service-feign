package com.es.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "e-school-service-account", fallback = AccountServiceHystrix.class)
public interface AccountService {

    @GetMapping(value = "/accounts/{userId}")
    String getAccount(@PathVariable("userId") String userId);


    @GetMapping("/accounts")
    String getAccountList(@RequestParam String userId,
                          @RequestParam String type);
}

