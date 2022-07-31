package com.contract.drivenproducer;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class PersonController {



    @RequestMapping(path = "/v1/person" , method = RequestMethod.GET)
    public void findById() {

    }

//    @RequestMapping(path = "/v1/person/{id}" , method = RequestMethod.GET)
//    public ResponseEntity<Person> findById(@PathVariable Long id) {
//
//        var person = Person.builder()
//                .id(id)
//                .name("Martin")
//                .build();
//
//
//
//        return new ResponseEntity<Person>(person, HttpStatus.OK);
//
//    }

}

@Data
@Builder
class Person {

    private Long id;
    private String name;

}
