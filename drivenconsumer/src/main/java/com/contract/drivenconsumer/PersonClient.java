package com.contract.drivenconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "person-cdc-test", url = "localhost:8080")
public interface PersonClient {

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/person", consumes = "application/json", produces = "application/json")
    void find();

}
