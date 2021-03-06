package com.example.socialAPI.SocialAPI.location;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;


    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }

    @RequestMapping (value = "/locations/{id}")
    public Optional<Location> getLocation(@PathVariable String id){
        return locationService.getLocation(id);
    }

    @RequestMapping (value = "/locations", method= RequestMethod.POST)
    public void addLocation (@RequestBody Location location){
        locationService.addLocation(location);
    }

    @RequestMapping (value = "/locations/{id}", method= RequestMethod.PUT)
    public void updateLocation (@RequestBody Location location, @PathVariable String id){
        locationService.updateLocation(id, location);
    }

    @RequestMapping (value = "/locations/{id}", method= RequestMethod.DELETE)
    public void deleteLocation (@RequestBody Location location, @PathVariable String id){
        locationService.deleteLocation(id);
    }

}
