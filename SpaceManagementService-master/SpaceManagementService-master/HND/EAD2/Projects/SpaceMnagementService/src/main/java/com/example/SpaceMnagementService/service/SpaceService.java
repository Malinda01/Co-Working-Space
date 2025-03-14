package com.example.SpaceMnagementService.service;

import com.example.SpaceMnagementService.Entity.Space;
import com.example.SpaceMnagementService.Repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpaceService {

    @Autowired
    private SpaceRepository spaceRepository;

    public List<Space> getSpaces(){
        return spaceRepository.findAll();
    }

    public Space createSpaces(Space spaces){
        return spaceRepository.save(spaces);
    }

    public Optional<Space> updateSpace(int id, Space newSpaceData) {
        return spaceRepository.findById(id)
                .map(space -> {
                    space.setName(newSpaceData.getName());
                    space.setLocation(newSpaceData.getLocation());
                    space.setCapacity(newSpaceData.getCapacity());
                    space.setPrice_per_hour(newSpaceData.getPrice_per_hour());
                    return spaceRepository.save(space);
                });
    }

    public Space deleteSpace(int id) {
        Optional<Space> spc = spaceRepository.findById(id); // First, find the space
        if (spc.isPresent()) {
            spaceRepository.deleteById(id); // Then, delete it
            return spc.get(); // Return the deleted space
        }
        return null; // If not found, return null
    }

}
