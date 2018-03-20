package controllers;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

import db.Seeds;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

public class MainController {

    public static void main(String[] args) {
        Seeds.seedData();
        staticFileLocation("/public");
        EmployeesController employeesController = new EmployeesController();
        ManagersController managersController = new ManagersController();
        DepartmentController departmentController = new DepartmentController();
        EngineersController engineersController = new EngineersController();

        get("/homepage", (req, res)->{
            Map<String, Object> model = new HashMap<>();
            model.put("template", "templates/homepage.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());
    }
}