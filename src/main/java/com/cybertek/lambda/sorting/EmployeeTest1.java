package com.cybertek.lambda.sorting;

import com.cybertek.oop.encapsulation.Role;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest1 {


    public static void main(String[] args) {
        Employee e1 = new Employee( 101,"Mike",
                "Smith","VA", new Role(1,"Manager"));
        Employee e2 = new Employee( 144,"Kate",
                "Smith","VA", new Role(55,"QA"));
        Employee e3 = new Employee( 103,"Cecil",
                "Smith","VA", new Role(44,"SDET"));
        Employee e4 = new Employee( 108,"Alyssa",
                "Smith","VA", new Role(33,"DBA"));
        Employee e5 = new Employee( 122,"Valya",
                "Smith","VA", new Role(22,"ScramMaster"));
        Employee e6 = new Employee( 1010,"DEnis",
                "Smith","VA", new Role(99,"DEveloper"));

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        System.out.println(employeeList);

employeeList.sort((emp1,emp2)->emp1.getEmployee_Id().compareTo(emp2.getEmployee_Id()));
        System.out.println(employeeList);

        employeeList.sort((rol1,rol2)->(rol1.getRole().getId().compareTo(rol2.getRole().getId())));
        System.out.println(employeeList);
    }
}
