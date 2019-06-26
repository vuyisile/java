package com.app;

public class typesController {
}
/*
app.post('/type', jwt.verifyJWT_MW, async function (req, res) {
  var details = req.body;
  console.log('details :', details);
  try {
    await ref.saveTypes(details.unitType, details.length, details.height, details.width)
    res.sendStatus(201).end()
  } catch (error) {
    console.log('error', error)
    res.sendStatus(500)
  }

});

app.get('/types', jwt.verifyJWT_MW, async function (req, res) {
  var allTypesOfUnits = await ref.getAllTypesOfUnits();
  if (allTypesOfUnits) {
    res.send(allTypesOfUnits).status(201).end();
  } else {
    res.statusStatus(500).end();
  }
});
*/