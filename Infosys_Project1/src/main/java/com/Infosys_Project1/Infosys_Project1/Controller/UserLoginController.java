package com.Infosys_Project1.Infosys_Project1.Controller;

import com.Infosys_Project1.Infosys_Project1.Service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {
    @Autowired
    public UserLoginService userLoginService;

    @PostMapping("/userLogin")
    public ResponseEntity<?> userLogin(@RequestParam String email,@RequestParam String password){
        boolean isAuthenticated= userLoginService.authenticate(email,password);
        if(isAuthenticated){
            return ResponseEntity.ok("Login Successful");
        }
        else{
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }
}
