package com.app;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;

public class JJWT {

    Key key =  MacProvider.generateKey();
    public String generate(String str){
        String jws = Jwts.builder().setSubject(str).signWith(SignatureAlgorithm.HS512, key).compact();
        return jws;
    }



}
