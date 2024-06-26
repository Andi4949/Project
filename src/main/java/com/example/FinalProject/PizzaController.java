package com.example.FinalProject;

import com.example.FinalProject.model.Pizza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PizzaController {
    private final PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping
    List<Pizza> list() {
        return pizzaRepository.findAll();
    }

    @PostMapping
    Pizza add(@RequestBody Pizza pizza) {
        return pizzaRepository.save(pizza);
    }
}
