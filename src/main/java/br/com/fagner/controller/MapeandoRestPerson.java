package br.com.fagner.controller;

import br.com.fagner.model.CamposTabelaPerson;
import br.com.fagner.request.converters.NumberConverter;
import br.com.fagner.services.MapeamentoServicoPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chama-rest-person")
public class MapeandoRestPerson {

    @Autowired
    private MapeamentoServicoPerson servicoPerson;

    @RequestMapping(value="/{id}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CamposTabelaPerson findById(@PathVariable("id") String id) throws Exception {
        return servicoPerson.findById(id);
    }
}
