package br.com.fagner.controller;

import br.com.fagner.data.vo.CamposTabelaPersonVO;
import br.com.fagner.services.MapeamentoServicoPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chama-rest-person")
public class MapeandoRestPerson {

    @Autowired
    private MapeamentoServicoPerson servicoPerson;

    @GetMapping
    public List<CamposTabelaPersonVO> findAll() throws Exception {
        return servicoPerson.findAll();
    }

    @GetMapping("/{id}")
    public CamposTabelaPersonVO findById(@PathVariable("id") Long id) throws Exception {
        return servicoPerson.findById(id);
    }

    @PostMapping
    public CamposTabelaPersonVO create(@RequestBody CamposTabelaPersonVO camposTabelaPerson) throws Exception {
        return servicoPerson.create(camposTabelaPerson);
    }

    @PutMapping
    public CamposTabelaPersonVO update(@RequestBody CamposTabelaPersonVO camposTabelaPerson) throws Exception {
        return servicoPerson.update(camposTabelaPerson);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        servicoPerson.delete(id);
        return ResponseEntity.ok().build();
    }
}