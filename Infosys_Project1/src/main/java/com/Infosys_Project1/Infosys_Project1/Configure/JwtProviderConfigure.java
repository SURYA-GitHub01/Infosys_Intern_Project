package com.Infosys_Project1.Infosys_Project1.Configure;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtProviderConfigure {
    private static SecretKey key= Keys.hmacShaKeyFor(JwtConstantConfigure.SECRET_STRING.getBytes());
    public static String generateToken(Authentication auth){
        String jwt= Jwts.builder()
                .setIssuer("UserAdmin").setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime()+86400000))
                .claim("Email",auth.getName())
                .signWith(key)
                .compact();
        return jwt;
    }
    public static String getEmailFromJwtToken(String jwt){
        //bearer token
        jwt=jwt.substring(7);
        Claims claims=Jwts.parser().setSigningKey(key).build().parseClaimsJws(jwt).getBody();
        String email=String.valueOf(claims.get("Email"));
        return email;
    }
}
