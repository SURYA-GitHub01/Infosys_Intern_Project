package com.Infosys_Project1.Infosys_Project1.Controller;

import com.Infosys_Project1.Infosys_Project1.Entity.UserRegistrationDTO;
import com.Infosys_Project1.Infosys_Project1.Service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserRegistrationController {
    @Autowired
    public UserRegistrationService userRegistrationService;

    @GetMapping("/getAllRegisteredUser")
    public List<UserRegistrationDTO> getAllRegisteredUser(){
        return userRegistrationService.getAllRegisteredUser();
    }

    @GetMapping("/getRegisteredUserById/{userId}")
    public Optional<UserRegistrationDTO> getRegisteredUserById(@PathVariable Long userId){
        return userRegistrationService.getRegisteredUserById(userId);
    }

    @PostMapping("/createUserRegistration")
    public String createUserRegistration(@RequestBody UserRegistrationDTO userRegistrationDTO){
        userRegistrationService.createUserRegistration(userRegistrationDTO);
        return "User Registered Successfully";
    }

    @PutMapping("/updateUserRegistration/{userId}")
    public String updateUserRegistration(@PathVariable Long userId,@RequestBody UserRegistrationDTO userRegistrationDTO){
        userRegistrationService.updateUserRegistration(userId,userRegistrationDTO);
        return "Update User Registered Successfully";
    }

    @DeleteMapping("/deleteRegisteredUser/{userId}")
    public String deleteRegisteredUserById(@PathVariable Long userId){
        userRegistrationService.deleteRegisteredUserById(userId);
        return "Delete Registered User Successfully";
    }
}
