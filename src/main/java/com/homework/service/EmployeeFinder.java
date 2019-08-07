package com.homework.service;

import com.homework.bean.Employee;

import java.time.LocalDate;
import java.util.List;

public class EmployeeFinder {

    private static EmployeeFinder EMPLOYEE_FINDER_INSTANCE = new EmployeeFinder();

    private EmployeeFinder(){
    }

    public static EmployeeFinder getInstance(){
        return EMPLOYEE_FINDER_INSTANCE;
    }

    public void getBirthdayOnCurrentDayEmployees(List<Employee> employees) {
        employees.stream().filter(employee -> LocalDate.now().equals(employee.getBirthday()))
                .forEach(employee -> System.out.println(employee.toString()));
    }
}
