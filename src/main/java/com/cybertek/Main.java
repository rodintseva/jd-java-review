package com.cybertek;

import com.cybertek.core.Loops;
import com.cybertek.core.Methods;
import com.cybertek.core.SelectionStatement;
import com.cybertek.oop.abstraction.Service.UserService;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Methods method =new Methods();
        method.methodA();
        System.out.println(method.methodB());
        method.methodA("katya");
        System.out.println( method.methodB(5));
        Loops.demoForEach();
        Loops.demoForIterator();


        SelectionStatement.demoIfStatement();
        SelectionStatement.demoSwitchCaseStatement();

        //*****************OOP-Encapsulation*************************//
        User user = new User("Mike", "Smith",new Role(2,"Manager"));
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());


        Project project =new Project(1,LocalDateTime.now(), 1, LocalDateTime.now().minusDays(3),256,"25","MANDALORIAN",
                new User("SUPERWOMEN","RODINTSEVA",new Role(1,"Manager")),LocalDate.now().minusDays(2),LocalDate.now().plusDays(96), "IN PROGRESS", "WORKING");


        /******************************oop-interface*******************************/
        UserService userService= new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());

    }
}
