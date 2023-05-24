package API;

import io.restassured.RestAssured;

public class HardCodedExamples {

    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODQ4ODc4MzUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NDkzMTAzNSwidXNlcklkIjoiNTI2MyJ9.2RKfr0XMO14mwh2NjLnyH7v4USm6vYh-c9m9Qgp0tsA";

    public void createEmployee(){
        //prepare the request


        //hitting the endpoint

        //verifying the assertions
    }



}
