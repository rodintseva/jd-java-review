package com.cybertek.oop.abstraction.Service;

import com.cybertek.oop.abstraction.implementstion.UserServiceImplementation;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {


    @Override
    public String userByRoleID(int id) {
        User user = new User("Mike", "Smith",new Role(id,"Admin"));
        return user.getFirstName()+" "+user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName, "Ally",new Role(5,"Employee"));
        return user;

    }
}
