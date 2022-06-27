package com.taskw34.animalapp.controller;

import com.taskw34.animalapp.entity.Animal;
import com.taskw34.animalapp.service.AnimalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return "redirect:/animals";
    }

}
