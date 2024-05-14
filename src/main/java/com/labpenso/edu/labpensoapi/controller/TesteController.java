package com.labpenso.edu.labpensoapi.controller;

import com.labpenso.edu.labpensoapi.model.Teste;
import com.labpenso.edu.labpensoapi.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private TesteRepository testeRepository;

    @GetMapping
    public List listar(){
        return testeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Teste add(@RequestBody Teste teste){
        return testeRepository.save(teste);
    }

    @GetMapping("/{id}")
    public Teste findById(@PathVariable Long id){
        return testeRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public Teste update(@PathVariable Long id, @RequestBody Teste teste){
        teste.setId(id);
        return testeRepository.save(teste);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Teste delete(@PathVariable Long id){
        Teste objeto = testeRepository.findById(id).get();
        testeRepository.deleteById(id);
        return objeto;
    }


}
