package com.Infosys_Project1.Infosys_Project1.Service;

import com.Infosys_Project1.Infosys_Project1.Repo.UserLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    @Autowired
    public UserLoginRepo userLoginRepo;
}
