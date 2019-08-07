package com.homework.service;

import com.homework.bean.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {

    private static EmployeeRepository EMPLOYEE_REPOSITORY_INSTANCE = new EmployeeRepository();

    private EmployeeRepository() {
    }

    public static EmployeeRepository getInstance() {
        return EMPLOYEE_REPOSITORY_INSTANCE;
    }

    public List<Employee> buildMultiEmployee(List<String> employeeStrings) {
        List<Employee> employees = new ArrayList<>();
        employeeStrings.forEach(employeeString -> buildSingleEmployee(employeeString).ifPresent(employees::add));
        return employees;
    }

    private Optional<Employee> buildSingleEmployee(String employeeString) {
        Optional<Employee> employeeOptional = Optional.empty();
        Employee employee = new Employee();
        String[] employeeInfo = getEmployeeInfo(employeeString);

        String name = employeeInfo[1];
        LocalDate birthday = buildEmployeeBirthday(employeeInfo[2]);
        String email = employeeInfo[3];

        employee.setName(name);
        employee.setBirthday(birthday);
        employee.setEmail(email);

        return Optional.ofNullable(employee);
    }

    private String[] getEmployeeInfo(String employeeString) {
        String[] contentArr = employeeString.split(",");
        return Arrays.stream(contentArr).map(String::trim).toArray(String[]::new);
    }

    private LocalDate buildEmployeeBirthday(String dateString) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return LocalDate.parse(dateString, fmt);
    }

}
