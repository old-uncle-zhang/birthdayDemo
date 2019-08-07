package com.homework.service;

import java.util.regex.Pattern;

public class EmployeeValidator {

    private static final String DATE_REGEX = "\\d{4}/\\d{2}/\\d{2}";

    private static EmployeeValidator EMPLOYEE_VALIDATOR_INSTANCE = new EmployeeValidator();

    private EmployeeValidator() {
    }

    public static EmployeeValidator getInstance() {
        return EMPLOYEE_VALIDATOR_INSTANCE;
    }

    public Boolean employeeBirthdayValidator(String dateString){
        return Pattern.matches(DATE_REGEX, dateString);
    }

}
