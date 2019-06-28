package com.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
public class BusinessController {
    private ArrayList<Business> businesses = new ArrayList<>();
    @RequestMapping(value = "/businesses", method = RequestMethod.GET)
    public ArrayList<Business> businesses() {
        return businesses;
    }

    @RequestMapping(value = "/business", method = RequestMethod.GET)
    public Business business(@RequestParam(value = "/business") String name) {
        Optional<Business> businessFound = businesses
                .stream()
                .filter(business -> business.getName().toLowerCase().equals(name.toLowerCase())).findFirst();

        return businessFound.orElse(null);
    }

    @PostMapping("/business")
    public void business(@RequestBody Business business) {
        businesses.add(business);
    }
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

