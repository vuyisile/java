package com.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
public class LocationController {


    private ArrayList<Location> locations = new ArrayList<>();

    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    public ArrayList<Location> locations() {
        return locations;
    }

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public Location location(@RequestParam(value = "/location") int id) {
        Optional<Location> locationFound = locations
                .stream()
                .filter(location -> location.getProvider_id() == id).findFirst();

        return locationFound.orElse(null);
    }

    @PostMapping("/location")
    public void location(@RequestBody Location location) {
        locations.add(location);
    }
}

/*app.post('/location', jwt.verifyJWT_MW, async function (req, res) {
  try {
    businessId = await ref.getBusinessId(req.body);
    console.log('req', req.body)
    var save = await ref.saveLocation(req.body, businessId);
    // console.log('save :', save);
    res.sendStatus(201).end()
  } catch (error) {
    console.log('error', error)
    res.sendStatus(500).end()
  }
});

app.get('/locations', jwt.verifyJWT_MW, async function (req, res) {
  var user = jsonwebtoken.decode(req.headers['auth'])
  const locations = await ref.getAllLocations(user.email);
  if (locations) {
    res.send(locations.rows).status(201).end();
  } else {
    res.statusStatus(500).end();
  }
});*/