package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class HardCodedExamples {

    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODQ4ODc4MzUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NDkzMTAzNSwidXNlcklkIjoiNTI2MyJ9.2RKfr0XMO14mwh2NjLnyH7v4USm6vYh-c9m9Qgp0tsA";

    @Test
    public void createEmployee(){
        //prepare the request
        RequestSpecification preparedRequest = given().
                header("Content-Type","application/json").
                header("Authorization",token).body("{\n" +
                        "  \"emp_firstname\": \"nelena\",\n" +
                        "  \"emp_lastname\": \"faria\",\n" +
                        "  \"emp_middle_name\": \"ms\",\n" +
                        "  \"emp_gender\": \"F\",\n" +
                        "  \"emp_birthday\": \"2012-05-20\",\n" +
                        "  \"emp_status\": \"Confirmed\",\n" +
                        "  \"emp_job_title\": \"Engineer\"\n" +
                        "}");

        //hitting the endpoint/send the request
        Response response = preparedRequest.when().post("/createEmployee.php");

        //verifying the assertions/ get response
        response.then().assertThat().statusCode(201);
        //it will print the output in the console
        response.prettyPrint();

    }



}
