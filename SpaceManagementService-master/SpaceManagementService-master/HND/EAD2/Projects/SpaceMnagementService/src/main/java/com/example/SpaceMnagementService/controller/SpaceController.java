package com.example.SpaceMnagementService.controller;

import com.example.SpaceMnagementService.Entity.Space;
import com.example.SpaceMnagementService.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class SpaceController {

    @Autowired
    private SpaceService spaceService;

    @GetMapping(path = "/spaces")
    public List<Space> getSpace() {
        return spaceService.getSpaces();
    }

    @PostMapping(path = "/spaces")
    public Space createSpaces(@RequestBody Space spaces) {
        return spaceService.createSpaces(spaces);
    }

    @PutMapping("spaces/{id}")
    public Optional<Space> updateSpace(@PathVariable int id, @RequestBody Space space) {
        return spaceService.updateSpace(id, space);
    }

    @DeleteMapping(path = "/spaces/{id}")
    public Space deleteSpaceById(@PathVariable int id) {
        return spaceService.deleteSpace(id);
    }

}

