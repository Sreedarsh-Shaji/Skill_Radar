package com.srlocator.srLocator.services;


import com.srlocator.srLocator.dao.Location;
import com.srlocator.srLocator.dao.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import java.time.Instant;

@Service
public class LocationService {


    private List<Location> locations= new ArrayList<Location>();

    /* get all Locations */
    public List<Location> getAllLocations()
    {
        return locations;
    }

    /* get a location based on id */
    public Location getLocationByIdDummy(int id)
    {
        /* replace with streams */
        for (Location temp: locations ) {
            if( temp.getId() == id ){
                return  temp;
            }
        }

        return null;
    }

    /* get a location based on user id */
    public Location getLocationByUserDummy(int userId)
    {
        /* replace with streams */
        for (Location temp: locations ) {
            if( temp.getUser().getId() == userId ){
                return  temp;
            }
        }

        return null;
    }

    /* Adds a new Location */
    public boolean addNewLocationDummy(User newUser)
    {
        /* replace with streams */
        for (Location temp: locations ) {
            if( temp.getUser().getEmail().equals(newUser.getEmail()) )
            {
                return false;
            }
        }

        Location newLocation = new Location();

        newLocation.setId(locations.size());
        newLocation.setUser(newUser);
        newLocation.setLatitude(8.924343);
        newLocation.setLongitude(76.6500417);
        newLocation.setLastUpdatedEpoc(Instant.now().toEpochMilli());

        locations.add(newLocation);
        return true;
    }

    /*
    Populates the list with some dummy data
    */
    @PostConstruct
    private void addDummyUsers()
    {

        Location location = new Location();
        location.setId(1);
        location.setUser(new User(1,"Sreedarsh","Sreedarsh.s@teamta.in","Changrabhavanam,Managad,Kollam","Password"));
        location.setLatitude(8.924343);
        location.setLongitude(76.6500417);
        location.setLastUpdatedEpoc(1629273597);
        locations.add(location);


        Location location1 = new Location();
        location1.setId(2);
        location1.setUser(new User(2,"Sudheeshh","Sudheesh.s@teamta.in","Kollam","Password"));
        location1.setLatitude(8.924343);
        location1.setLongitude(76.6500417);
        location1.setLastUpdatedEpoc(1629273600);
        locations.add(location1);
    }


}
