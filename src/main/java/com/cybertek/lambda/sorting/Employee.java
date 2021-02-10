package com.cybertek.lambda.sorting;

import com.cybertek.oop.encapsulation.Role;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private Integer employee_Id;
    private String employeeName;
    private String employeeLastName;
    private String employeeCity;

 /*   @Override
    public String toString() {
        return "Employee{" +
                "employee_Id=" + employee_Id +
                ", employeeName='" + employeeName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", employeeCity='" + employeeCity + '\'' +
                ", role=" + role +
                '}';
    }*/

    private Role role;





}
