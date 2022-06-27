package com.taskw34.animalapp.repository;

import com.taskw34.animalapp.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
