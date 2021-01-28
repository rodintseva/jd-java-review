package com.cybertek.oop.abstraction.implementstion;

import com.cybertek.oop.encapsulation.User;

public interface UserServiceImplementation {

    String userByRoleID(int id);
    User userByFirstName(String firstName);

}
