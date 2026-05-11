package com.example.demo.security.jwt;

import org.springframework.stereotype.Component;

@Component
public class JwtProvider {

    public String createToken(String username) {

        return "JWT-TOKEN-" + username;
    }

    public boolean validateToken(String token) {

        return token != null && token.startsWith("JWT-TOKEN-");
    }
}