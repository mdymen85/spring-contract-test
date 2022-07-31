package com.contract.drivenconsumer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ConsumerController {

    private final PersonClient personClient;

    @RequestMapping(path = "/v1/person", method = RequestMethod.GET)
    public void checkPerson() {

        personClient.find();

    }

}
