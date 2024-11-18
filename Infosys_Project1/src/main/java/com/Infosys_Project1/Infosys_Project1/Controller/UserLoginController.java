package com.Infosys_Project1.Infosys_Project1.Controller;

import com.Infosys_Project1.Infosys_Project1.Service.UserLoginService;
import com.Infosys_Project1.Infosys_Project1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {
    @Autowired
    public UserLoginService userLoginService;



    public class AuthController {

        @Autowired
        private UserService userService;

        @PostMapping("/login")
        public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
            boolean isAuthenticated = userLoginService.verifyLogin(email, password);
            return isAuthenticated ?
                    ResponseEntity.ok("Login successful!") :
                    ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password.");
        }
    }
}
