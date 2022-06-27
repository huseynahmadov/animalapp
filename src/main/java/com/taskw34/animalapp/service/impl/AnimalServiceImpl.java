package com.taskw34.animalapp.service.impl;

import com.taskw34.animalapp.entity.Animal;
import com.taskw34.animalapp.repository.AnimalRepository;
import com.taskw34.animalapp.service.AnimalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public void createAnimal(Animal animal) {
         animalRepository.save(animal);
    }

    @Override
    public void deleteAnimal(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public Animal findAnimalById(Long id) {
        return null;
    }


}
