package br.com.fagner.services;

import br.com.fagner.exception.ResourceNotFoundException;
import br.com.fagner.model.CamposTabelaPerson;
import br.com.fagner.repository.ComandosSQLPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*Essa anotação service, serve para que o spring reconheça esse serviço somente com authored sem precisar
 instânciar o objeto. */
@Service
public class MapeamentoServicoPerson {

    @Autowired
    ComandosSQLPersonRepository comandosSQLPersonRepository ;


    public CamposTabelaPerson create(CamposTabelaPerson camposTabelaPerson){
        comandosSQLPersonRepository.save(camposTabelaPerson);
        return camposTabelaPerson;
    }

    public List<CamposTabelaPerson> findAll(){
        return comandosSQLPersonRepository.findAll();
    }

    public CamposTabelaPerson findById(Long id){
        return comandosSQLPersonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sem registros para esse ID"));
    }

    public CamposTabelaPerson update(CamposTabelaPerson camposTabelaPerson){
        CamposTabelaPerson entity = comandosSQLPersonRepository.findById(camposTabelaPerson.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        entity.setFirstName(camposTabelaPerson.getFirstName());
        entity.setLastName(camposTabelaPerson.getLastName());
        entity.setAddress(camposTabelaPerson.getAddress());
        entity.setGender(camposTabelaPerson.getGender());
        return comandosSQLPersonRepository.save(entity);
    }

    public void delete(Long id){
        CamposTabelaPerson entity = comandosSQLPersonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        comandosSQLPersonRepository.delete(entity);

    }




}
