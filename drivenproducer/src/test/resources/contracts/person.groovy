package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "shoul return a person"
    request {
        method GET()
        url("/api/v1/person")
//        url("/api/v1/person") {
//            queryParameters {
//                parameter("id", 11)
//            }
//        }
    }
    response {
//        body '''\
//            "id": 11,
//            "name": Martin
//        '''
        status 200;
    }
}
