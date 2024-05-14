package com.labpenso.edu.labpensoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medicao")
public class MedicaoController {

    @GetMapping
    public List listar(){
        return null;
    }
}
