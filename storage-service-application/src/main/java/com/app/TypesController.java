package com.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

public class TypesController {

    private ArrayList<Type> types = new ArrayList<>();

    @RequestMapping(value = "/types", method = RequestMethod.GET)
    public ArrayList<Type> types() {
        return types;
    }

    @RequestMapping(value = "/type", method = RequestMethod.GET)
    public Type type(@RequestParam(value = "/type") String name) {
        Optional<Type> typeFound = types
                .stream()
                .filter(type -> type.getType().toLowerCase().equals(name.toLowerCase())).findFirst();

        return typeFound.orElse(null);
    }

    @PostMapping("/type")
    public void type(@RequestBody Type type) {
        types.add(type);
    }
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