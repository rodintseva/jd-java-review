package com.cybertek.core;

public class SelectionStatement {
public static void demoIfStatement(){
    String userName ="Ozzy";
    if(userName.equals("Ozzy")){
        System.out.println("PASS");
    }else if(userName.equals("Mike")){
        System.out.println("Fail");
    }else {
        System.out.println("Not Valid");
    }
}
public static void demoSwitchCaseStatement(){
    String userName ="Mike";
    switch (userName){
        case "Ozzy":
            System.out.println("PASS");
            break;
        case "Mike":
            System.out.println("Fail");
            break;
        default:
            System.out.println("Not Valid");
    }
}

}