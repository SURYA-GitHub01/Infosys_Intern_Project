package com.Infosys_Project1.Infosys_Project1.Controller;

import com.Infosys_Project1.Infosys_Project1.Entity.UserDTO;
import com.Infosys_Project1.Infosys_Project1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user/details")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getUserById/{userId}")
    public Optional<UserDTO> getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody UserDTO userDTO) {
        userService.createUser(userDTO);
        return "User Created Successfully";
    }

    @PutMapping("/updateUser/{userId}")
    public String updateUser(@PathVariable Long userId, @RequestBody UserDTO userDTO) {
        userService.saveUpdateUser(userId, userDTO);
        return "User Updated Successfully";
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return "User Deleted Successfully";
    }
}
