package com.srusers.srUsers.services;

import com.srusers.srUsers.dao.User;
import com.srusers.srUsers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {


    private List<User> users= new ArrayList<User>();

    @Autowired
    UserRepository repository;

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

    /* Adds a new dummy user */
    @Deprecated
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

    /* Adds a new user into the repo */
    public boolean addNewUser(User inputUser)
    {

        try
        {
            repository.saveAll(Stream.of(inputUser).collect(Collectors.toList()));
            return true;
        }
        catch (Exception ex)
        {
            return false;
        }
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
