package com.cognizant.ormlearn2;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn2.model.Employee;
import com.cognizant.ormlearn2.service.EmployeeService;

@SpringBootApplication
public class OrmLearn2Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearn2Application.class);
    private static EmployeeService service;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearn2Application.class, args);
        LOGGER.info("System Initialized");

        service = context.getBean(EmployeeService.class);
        runLabAssignmentOps();
    }

    private static void runLabAssignmentOps() {
        LOGGER.info("Populating initial lab database entries");
        service.addEmployee(new Employee("Shaheeth Hussain"));
        service.addEmployee(new Employee("Rahul"));
        service.addEmployee(new Employee("Shaheeth Aslam"));

        LOGGER.info("Running exact name match operation ('Rahul')");
        List<Employee> exactResults = service.getEmployeesByName("Rahul");
        LOGGER.info("Found exact matches: {}", exactResults);

        LOGGER.info("Running keyword search operation ('Shaheeth')");
        List<Employee> keywordResults = service.searchEmployeesByKeyword("Shaheeth");
        LOGGER.info("Found keyword matches: {}", keywordResults);

        LOGGER.info("custom operations executed");
    }
}
