package controllers;
import db.DBHelper;
import models.Employee;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;

public class EmployeesController {

    public EmployeesController(){
        this.setupEndpoints();
    }

    private void setupEndpoints(){

        get("/employees", (req,res)->{
            Map<String, Object> model= new HashMap<>();
            List<Employee> employees = DBHelper.getAll(Employee.class);
            model.put("employees", employees);
            model.put("template", "templates/employees/index.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());
    }
}
