package com.app;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;

public class JJWT {
    Key key =  MacProvider.generateKey();
    String jws = Jwts.builder().setSubject("getting-started-with-jjwt").signWith(SignatureAlgorithm.HS512, key).compact();
    public String getJws(){
        return this.jws;
    }
}
