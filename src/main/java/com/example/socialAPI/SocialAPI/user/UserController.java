package com.example.socialAPI.SocialAPI.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/users/{id}")
    public Optional <User> getUser(@PathVariable String id){
        return userService.getUser(id);}

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUsers(@RequestBody User user){
         userService.addUser(user);
    }

    @RequestMapping (value = "/users/{id}", method= RequestMethod.PUT)
    public void updateUser (@RequestBody User user, @PathVariable String id){
        userService.updateUser(user);
    }

    @RequestMapping (value = "/users/{id}", method= RequestMethod.DELETE)
    public void deletePost (@RequestBody User post, @PathVariable String id){
        userService.deleteUser(id);
    }

    @RequestMapping(value = "/users/location/{Id}")
    public List <User> getUserByLocationId(@PathVariable String Id){
        return userService.getUserByLocationId(Id);}

    @RequestMapping(value = "/users/firstname/{firstname }")
    public List <User> getUserByFirstname(@PathVariable String firstname){
        return userService.getUserByFirstname(firstname);}


}
