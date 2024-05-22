package com.labpenso.edu.labpensoapi.controller;

import com.labpenso.edu.labpensoapi.model.Medicao;
import com.labpenso.edu.labpensoapi.repository.MedicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicao")
public class MedicaoController {

    @Autowired
    private MedicaoRepository medicaoRepository;

    @GetMapping
    public List<Medicao> listar() {
        return medicaoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Medicao add(@RequestBody Medicao medicao) {
        return medicaoRepository.save(medicao);
    }

    @GetMapping("/{id}")
    public Medicao findById(@PathVariable Long id) {
        return medicaoRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Medicao update(@PathVariable Long id, @RequestBody Medicao medicao) {
        medicao.setId(id);
        return medicaoRepository.save(medicao);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        medicaoRepository.deleteById(id);
    }
}
