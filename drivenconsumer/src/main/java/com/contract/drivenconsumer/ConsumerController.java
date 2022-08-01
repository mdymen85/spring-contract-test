package com.contract.drivenconsumer;

import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ConsumerController {

    private final PersonClient personClient;

    @RequestMapping(path = "/v1/person/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> checkPerson(@PathVariable Long id) {

        return new ResponseEntity<>(personClient.find(id), HttpStatus.OK);

    }

}
