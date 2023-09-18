package stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import constants.EmployeeEndpoints;
import entities.Employee;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_scouse.An;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import utils.Request;

import java.util.List;

import static org.hamcrest.CoreMatchers.not;

public class EmployeesSteps {

    Response response;
    @Given("Realizo un GET al endpoint de los empleados")
    public void getEmployees(){
        response = Request.get(EmployeeEndpoints.GET_EMPLOYEES);
    }

    @And("Verifico que se devuelve el status code {int}")
    public void verifyStatusCode(int statusCode){
        response.then().assertThat().statusCode(statusCode);
    }

    @And("Compruebo que el body no tiene un tamaño de {int}")
    public void verifyResponseSize(int size){
        response.then().assertThat().body("size()", not(size));
    }

    @And("Realizo un POST en el endpoint create con los siguientes datos")
    public void postEmployee(DataTable employeeInfo) throws JsonProcessingException, InterruptedException {
        Thread.sleep(60000);
        List<String> data = employeeInfo.transpose().asList(String.class);
        Employee employee = new Employee();
        employee.setName(data.get(0));
        employee.setSalary(data.get(1));
        employee.setAge(data.get(2));
        ObjectMapper mapper = new ObjectMapper();

        String payload = mapper.writeValueAsString(employee);
        response = Request.post(EmployeeEndpoints.POST_EMPLOYEE, payload);
    }

    @And("Verifico los siguientes datos en el body response")
    public void verifyEmployeeResponseData(DataTable employeeInfo){
        List<String> data = employeeInfo.transpose().asList(String.class);
        response.then().assertThat().body("data.name", Matchers.equalTo(data.get(0)));
        response.then().assertThat().body("data.salary", Matchers.equalTo(data.get(1)));
        response.then().assertThat().body("data.age", Matchers.equalTo(data.get(2)));

    }

    @Given("Realizo un GET con una identificación específica igual a {string} para el endpoint del empleado")
    public void getWithIdEmployee(String getID) throws InterruptedException {
        Thread.sleep(60000);
        response = Request.getWithId(EmployeeEndpoints.GET_EMPLOYEE,getID);
    }

    @And("Verifico los siguientes datos en el body response completo")
    public void verifyBodyEmployeeResponse(DataTable employeeInformation){
        List<String> data = employeeInformation.transpose().asList(String.class);

        response.then().assertThat().body("data.id", Matchers.equalTo(Integer.parseInt(data.get(0))));
        response.then().assertThat().body("data.employee_name", Matchers.equalTo(data.get(1)));
        response.then().assertThat().body("data.employee_salary", Matchers.equalTo(Integer.parseInt(data.get(2))));
        response.then().assertThat().body("data.employee_age", Matchers.equalTo(Integer.parseInt(data.get(3))));
        response.then().assertThat().body("profile_image", Matchers.equalTo(data.get(4)));

    }

    @And("Verifico que el mensaje dice {string}")
    public void verifyMessageInBody(String message){
        response.then().assertThat().body("message", Matchers.equalTo(message));
    }

    @And("Realizo un PUT en el update endpoint con el ID {string}")
    public void putEmployee(String id, DataTable employeeInfo) throws JsonProcessingException, InterruptedException {
        Thread.sleep(60000);

        List<String> data = employeeInfo.transpose().asList(String.class);

        Employee employee = new Employee();
        employee.setName(data.get(0));
        employee.setSalary(data.get(1));
        employee.setAge(data.get(2));

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getAge());

        ObjectMapper mapper = new ObjectMapper();
        String payload = mapper.writeValueAsString(employee);

        response = Request.put(EmployeeEndpoints.PUT_EMPLOYEE, id, payload);

    }

    @Given("Realizo un DELETE con una identificación específica igual a {string} en el endpoint del empleado")
    public void deleteEmployee(String id) throws InterruptedException {
        Thread.sleep(60000);
        response = Request.delete(EmployeeEndpoints.DELETE_EMPLOYEE, id);

    }

    @And("Verifico que el number data eliminado sea igual a {string}")
    public void verifyNumberDataDeleted(String id){
        response.then().assertThat().body("data", Matchers.equalTo(id));
    }

}
