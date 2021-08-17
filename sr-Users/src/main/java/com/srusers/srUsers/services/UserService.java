package com.srusers.srUsers.services;

import com.srusers.srUsers.dao.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class UserService {


    private List<User> users= new ArrayList<User>();

    /* get all users */
    public List<User> getAllUsers()
    {
        return users;
    }

    /* get a user based on id */
    public User getUserByIdDummy(int id)
    {
        /* replace with streams */
        for (User temp: users ) {
            if( temp.getId() == id ){
                return  temp;
            }
        }

        return null;
    }

    /* checks if a user exits */
    public boolean userLoginDummy(String username,String password)
    {
        /* replace with streams */
        boolean isValidUser = false;
        for (User temp: users ) {
            if( temp.getEmail().equals(username) && temp.getPassword().equals(password) )
            {
                isValidUser = true;
                break;
            }
        }

        return isValidUser;
    }

    /* Adds a new user */
    public boolean addNewUserDummy(User newUser)
    {
        /* replace with streams */
        for (User temp: users ) {
            if( temp.getEmail().equals(newUser.getEmail()) )
            {
                return false;
            }
        }

        users.add(newUser);
        return true;
    }

    /*
    Populates the list with some dummy data
    */
    @PostConstruct
    private void addDummyUsers()
    {

        users.add(new User(1,"Sreedarsh","Sreedarsh.s@teamta.in","Changrabhavanam,Managad,Kollam","Password"));
        users.add(new User(2,"Sudheeshh","Sudheesh.s@teamta.in","Kollam","Password"));

    }


}
