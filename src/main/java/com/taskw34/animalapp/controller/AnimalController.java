package com.taskw34.animalapp.controller;

import com.taskw34.animalapp.entity.Animal;
import com.taskw34.animalapp.service.AnimalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/pages")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animals")
    public String getAllAnimals(Model model) {
        model.addAttribute("listAnimals", animalService.getAllAnimals());
        return "animal";
    }

    @GetMapping("/animals/new")
    public String getAnimal(Model model) {
        model.addAttribute("animal",new Animal());
        return "newAnimal";
    }

    @PostMapping("/animals/new")
    public String createAnimal(@ModelAttribute Animal animal) {
        animalService.createAnimal(animal);
        return "redirect:/pages/animals";
    }

    @PostMapping("/animals/delete/{id}")
    public String deleteAnimal(@PathVariable Long id) {
        animalService.deleteAnimal(id);
        return "redirect:/pages/animals";
    }

    @GetMapping("/animals/edit/{id}")
    public String editAnimal(@PathVariable Long id, Model model) {
        Animal currentAnimal = animalService.findAnimalById(id);
        model.addAttribute("current", currentAnimal);
        return "edit";
    }


    @PostMapping("/animals/edit/{id}")
    public String editAnimal(@PathVariable Long id, @ModelAttribute Animal animal) {
        animalService.editAnimal(id, animal);

        return "redirect:/pages/animals";
    }

}
