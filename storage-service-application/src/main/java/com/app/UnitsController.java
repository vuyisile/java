package com.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
public class UnitsController {

        private ArrayList<Unit> units = new ArrayList<>();

        @RequestMapping(value = "/units", method = RequestMethod.GET)
        public ArrayList<Unit> units() {
            return units;
        }

        @RequestMapping(value = "/unit", method = RequestMethod.GET)
        public Unit unit(@RequestParam(value = "/unit") String name) {
            Optional<Unit> unitFound = units
                    .stream()
                    .filter(unit -> unit.getUnitName().toLowerCase().equals(name.toLowerCase())).findFirst();

            return unitFound.orElse(null);
        }

        @PostMapping("/unit")
        public void unit(@RequestBody Unit unit) {
            units.add(unit);
        }
    }



/*
app.post('/unit', jwt.verifyJWT_MW, async function (req, res) {
  var details = req.body;
  try {
    console.log('helper function', ref.saveUnits(details.unitName, details.block[0], details.unitType[0]));

    await ref.saveUnits(details.unitName, details.block[0], details.unitType[0]);
    res.sendStatus(201).end()
  } catch (error) {
    console.log('error', error)
    res.sendStatus(500)
  }
});

app.get('/availableUnits', jwt.verifyJWT_MW, async function (req, res) {
  var user = jsonwebtoken.decode(req.headers['auth'])
  var allUnits = await ref.combineAllTables();
  if (allUnits) {
    res.send(allUnits.rows).status(201).end();
  } else {
    res.statusStatus(500).end();
  }
});

app.get('/myUnits', jwt.verifyJWT_MW, async function (req, res) {
  var user = jsonwebtoken.decode(req.headers['auth'])
  if (user.userType === 'business') {
    var userDb = await ref.getBusinessData(user.email)
    console.log('userDb :', userDb);
    if (userDb) {
      res.send(userDb.rows).status(201).end();
    } else {
      res.statusStatus(500).end();
    }
  } else {
    var allUnits = await ref.getMyUnits(user);
    console.log('allUnits :', allUnits);
    if (allUnits) {
      res.send(allUnits).status(201).end();
    } else {
      res.statusStatus(500).end();
    }
  }
});

app.post('/updateUnitStatus', jwt.verifyJWT_MW, async (req, res) => {
  let unit_id = req.body;
  var user = jsonwebtoken.decode(req.headers['auth'])
  try {
    await ref.updateUnit(unit_id, user)
    res.sendStatus(201).end()
  } catch (error) {
    console.log('error', error)
    res.sendStatus(500)
  }
})
*/