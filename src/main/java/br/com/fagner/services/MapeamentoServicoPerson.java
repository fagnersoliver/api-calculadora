package br.com.fagner.services;

import br.com.fagner.model.CamposTabelaPerson;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/*Essa anotação service, serve para que o spring reconheça esse serviço somente com authored sem precisar
 instânciar o objeto. */
@Service
public class MapeamentoServicoPerson {

    private final AtomicLong counterPrimaryKey = new AtomicLong();

    public CamposTabelaPerson findById(String id){

        CamposTabelaPerson camposTabelaPerson = new CamposTabelaPerson();
        camposTabelaPerson.setId(counterPrimaryKey.incrementAndGet());
        camposTabelaPerson.setFirstName("Fagner");
        camposTabelaPerson.setLastName("Oliveira");
        camposTabelaPerson.setAddress("Cotia/sp");
        camposTabelaPerson.setGender("Masculino");

        return camposTabelaPerson;
    }


}
