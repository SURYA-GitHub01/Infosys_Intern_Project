package com.Infosys_Project1.Infosys_Project1.Configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class UserLoginConfigure {

@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

}


}
