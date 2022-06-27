package com.taskw34.animalapp.service;

import com.taskw34.animalapp.entity.Animal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface AnimalService {


    List<Animal> getAllAnimals();

    void createAnimal(Animal animal);

    void deleteAnimal(Long id);

    Animal findAnimalById(Long id);
}
