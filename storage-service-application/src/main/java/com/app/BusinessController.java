package com.app;

public class BusinessController {
}




//app.post('/business', jwt.verifyJWT_MW, async function (req, res) {
//        try {
//        await ref.saveBusiness(req.body);
//        res.sendStatus(201).end()
//        } catch (error) {
//        res.sendStatus(500).end()
//        }
//        });
//
//        app.get('/businesses', jwt.verifyJWT_MW, async function (req, res) {
//        var user = jsonwebtoken.decode(req.headers['auth'])
//        console.log('user :', user);
//        var businesses = await ref.getAllBusinesses(user.email);
//        if (businesses) {
//        res.send(businesses.rows).status(201).end();
//        } else {
//        res.status(500).end();
//        }
//        });

