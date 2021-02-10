package com.cybertek.stream.exercises;

import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import java.util.List;

public class StreamDemo {
    //Task 1
    public static List<Project> getListOfProject(){};
    //Task 2
    public static List<Project> getListOfProject(Status status){};
    //Task 3
    public static List<Project> getListOfProject(User manager){};
    //Task 4
    public static List<Project> getListOfProjectCode(String projectCode){};
    //Task 5
    public static List<User> getListOfUsers(){};
    //Task 6
    public static User getUserByFirstName(String firstName){
        return new User();    };

    //Task 7
    public static String getUserByUserID(Long id){};

    //Task 8
    public static List<User> deleteUser(String firstName){ };
    //Task 9
    public static List<Project> updateProjectStatus(String oldStatus, Status newStatus){};
    //Task 10
    public static List<Project> findProjectByManager(User manager){};
    //Task 11
    public static Integer totalProjectDurationForManger(User manager){ };
    //Task 12
    public static long findTotalMaleInCompany(Status status){};

}
