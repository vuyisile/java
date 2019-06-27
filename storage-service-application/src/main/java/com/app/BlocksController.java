package com.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class BlocksController {
    private ArrayList<Blocks> blocks = new ArrayList<>();

    @RequestMapping(value = "/blocks", method = RequestMethod.GET)
    public ArrayList<Blocks> blocks() {
        return blocks;
    }

    @RequestMapping(value = "/block", method = RequestMethod.GET)
    public Blocks block(@RequestParam(value = "/block") String name) {
        Optional<Blocks> blockFound = blocks
                .stream()
                .filter(block -> block.getBlockName().toLowerCase().equals(name.toLowerCase())).findFirst();

        return blockFound.orElse(null);
    }

    @PostMapping("/block")
    public void block(@RequestBody Blocks block) {
        blocks.add(block);
    }
}



//app.post('/block', jwt.verifyJWT_MW, async function (req, res) {
//        var details = req.body;
//        try {
//        const locationId = await ref.fetchLocationId(details);
//        await ref.saveBlock(details, locationId);
//        res.sendStatus(201).end()
//        } catch (error) {
//        console.log('error', error)
//        res.sendStatus(500)
//        }
//        });
//        app.get('/blocks', jwt.verifyJWT_MW, async function (req, res) {
//        var blocks = await ref.getAllBlocks();
//        if (blocks) {
//        res.send(blocks).status(201).end();
//        } else {
//        res.statusStatus(500).end();
//        }
//        });

