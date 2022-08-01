package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return a person"
    request {
        method GET()
        url("/api/v1/person/11")
    }
    response {
        body '''\
            { 
              "id": 11,
              "name": "Martin"
            }
        '''
        status 200;
    }
}
