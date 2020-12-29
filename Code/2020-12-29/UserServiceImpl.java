package service.impl;
//import service.UserService;
import service.*;
public class UserServiceImpl implements UserService{
    public void say(){
        System.out.println("User Message");    
    }

    public static void main(String[] args){
        UserService user = new UserServiceImpl();
        user.say();
    }
}
