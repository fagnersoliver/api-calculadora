package br.com.fagner.controller;

import br.com.fagner.model.CamposTabelaPerson;
import br.com.fagner.services.MapeamentoServicoPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chama-rest-person")
public class MapeandoRestPerson {

    @Autowired
    private MapeamentoServicoPerson servicoPerson;


    @PostMapping
    public CamposTabelaPerson create(@RequestBody CamposTabelaPerson camposTabelaPerson) throws Exception {
        return servicoPerson.create(camposTabelaPerson);
    }

    @PutMapping
    public CamposTabelaPerson update(@RequestBody CamposTabelaPerson camposTabelaPerson) throws Exception {
        return servicoPerson.update(camposTabelaPerson);
    }

    @GetMapping("/{id}")
    public CamposTabelaPerson findById(@PathVariable("id") Long id) throws Exception {
        return servicoPerson.findById(id);
    }

    @GetMapping
    public List<CamposTabelaPerson> findAll() throws Exception {
        return servicoPerson.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        servicoPerson.delete(id);
        return ResponseEntity.ok().build();
    }
}