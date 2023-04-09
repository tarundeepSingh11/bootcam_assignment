package com.restapi2.restapi2.Users;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private static List<User> userList=new ArrayList<>();
    private static int count=0;
    static{
        userList.add(new User(++count,"Tarundeep","TTN"));
        userList.add(new User(++count,"Karan","LG"));
        userList.add(new User(++count,"Mohit","GOOGLE"));
    }
    public List<User> findAll(){
        return userList;
    }
    public User findOne(int id){
        User user=null;
        for(User o:userList){
            if(o.getId()==id){
                user=o;
                break;
            }
        }
        return user;
    }
    public User addUser(User user){
         userList.add(user);
         return user;
    }

    public void update(User user){
        for(User u:userList){
            if(u.getId()==user.getId()){
                u.setDepartment(user.getDepartment());
                u.setName(user.getName());
            }
        }

    }
    public void dell(int id){
        for(User u:userList) {
            if (u.getId() == id) {
                userList.remove(u);
            }
        }
    }

}
