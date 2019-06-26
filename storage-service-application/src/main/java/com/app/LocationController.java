package com.app;

public class LocationController {
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