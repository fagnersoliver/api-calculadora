package br.com.fagner.services;

import br.com.fagner.model.CamposTabelaPerson;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/*Essa anotação service, serve para que o spring reconheça esse serviço somente com authored sem precisar
 instânciar o objeto. */
@Service
public class MapeamentoServicoPerson {

    private final AtomicLong counterPrimaryKey = new AtomicLong();

    public CamposTabelaPerson create(CamposTabelaPerson camposTabelaPerson){
        return camposTabelaPerson;
    }

    public CamposTabelaPerson update(CamposTabelaPerson camposTabelaPerson){
        return camposTabelaPerson;
    }

    public void delete(String id){
    }

    public CamposTabelaPerson findById(String id){

        CamposTabelaPerson camposTabelaPerson = new CamposTabelaPerson();
        camposTabelaPerson.setId(counterPrimaryKey.incrementAndGet());
        camposTabelaPerson.setFirstName("Fagner");
        camposTabelaPerson.setLastName("Oliveira");
        camposTabelaPerson.setAddress("Cotia/sp");
        camposTabelaPerson.setGender("Masculino");

        return camposTabelaPerson;
    }

    public List<CamposTabelaPerson> findAll(){

        List<CamposTabelaPerson> listaCamposTabelaPerson = new ArrayList<CamposTabelaPerson>();

        for (int i = 0; i < 8; i++) {
            CamposTabelaPerson camposTabelaPerson = mockCamposTabelaPerson(i);
            listaCamposTabelaPerson.add(camposTabelaPerson);
        }

        return listaCamposTabelaPerson;
    }

    private CamposTabelaPerson mockCamposTabelaPerson(int i ) {
        CamposTabelaPerson camposTabelaPerson = new CamposTabelaPerson();
        camposTabelaPerson.setId(counterPrimaryKey.incrementAndGet());
        camposTabelaPerson.setFirstName("Person FirstName");
        camposTabelaPerson.setLastName("Person LastName");
        camposTabelaPerson.setAddress("Person Address" + i );
        camposTabelaPerson.setGender("Person Gender");

        return camposTabelaPerson;
    }

}
