package com.cybertek.collections;


import com.cybertek.enums.Gender;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class ArrayListss {


    public static void createList(){

        List<Integer> list = new ArrayList<>();
        list.add(5);  list.add(15); list.add(10);
        for (Integer l : list){
            System.out.println(l);
        }

    }

    public  static void createUserList(){

        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike","Smith",new Role(2,"Manger"),Gender.MALE));
        userList.add(new User("Kate", "Rodint",new Role(2, "Manger"),Gender.FEMALE));
        for(User u:userList){
            System.out.println(u.getRole().getDescription());
        }

    }

    public static List<Role> createRoleList(){
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1,"Manager"));
        roleList.add(new Role(2,"Employee"));
        roleList.add(new Role(3,"Admin"));
        return roleList;
    }



}
