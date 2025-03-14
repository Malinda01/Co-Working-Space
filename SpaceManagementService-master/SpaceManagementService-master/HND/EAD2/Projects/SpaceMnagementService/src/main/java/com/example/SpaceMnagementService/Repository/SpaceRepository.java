package com.example.SpaceMnagementService.Repository;

import com.example.SpaceMnagementService.Entity.Space;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpaceRepository  extends JpaRepository<Space, Integer> {
    Optional<Space> deleteById(int id);
}
