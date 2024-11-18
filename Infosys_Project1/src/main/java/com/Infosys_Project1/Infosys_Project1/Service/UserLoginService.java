package com.Infosys_Project1.Infosys_Project1.Service;

import com.Infosys_Project1.Infosys_Project1.Entity.UserLoginDTO;
import com.Infosys_Project1.Infosys_Project1.Repo.UserLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLoginService {
    @Autowired
    public UserLoginRepo userLoginRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public boolean verifyLogin(String email, String password) {
        Optional<UserLoginDTO> user = userLoginRepo.findByEmail(email);
        return user.isPresent() && passwordEncoder.matches(password, user.get().getPassword());
    }
}
