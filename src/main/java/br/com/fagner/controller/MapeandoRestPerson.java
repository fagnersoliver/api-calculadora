package br.com.fagner.controller;

import br.com.fagner.model.CamposTabelaPerson;
import br.com.fagner.services.MapeamentoServicoPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chama-rest-person")
public class MapeandoRestPerson {

    @Autowired
    private MapeamentoServicoPerson servicoPerson;


    @RequestMapping(method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CamposTabelaPerson create(@RequestBody CamposTabelaPerson camposTabelaPerson) throws Exception {
        return servicoPerson.create(camposTabelaPerson);
    }

    @RequestMapping(method= RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CamposTabelaPerson update(@RequestBody CamposTabelaPerson camposTabelaPerson) throws Exception {
        return servicoPerson.update(camposTabelaPerson);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CamposTabelaPerson findById(@PathVariable("id") Long id) throws Exception {
        return servicoPerson.findById(id);
    }

    @RequestMapping(method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CamposTabelaPerson> findAll() throws Exception {
        return servicoPerson.findAll();
    }

    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) throws Exception {
        servicoPerson.delete(id);
    }
}