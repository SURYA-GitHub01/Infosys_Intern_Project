package com.Infosys_Project1.Infosys_Project1.Configure;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JwtValidatorConfigure extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String jwt=request.getHeader(JwtConstantConfigure.JWT_HEADER);
        if (jwt!=null){
            try{
                String email= JwtProviderConfigure.getEmailFromJwtToken(jwt);
            }
            catch(Exception e){
                throw new BadCredentialsException("Invalid Token");
            }
        }
        filterChain.doFilter(request,response);
    }

}
