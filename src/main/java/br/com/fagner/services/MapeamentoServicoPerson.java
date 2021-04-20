package br.com.fagner.services;

import br.com.fagner.converter.DozerConverter;
import br.com.fagner.data.vo.CamposTabelaPersonVO;
import br.com.fagner.exception.ResourceNotFoundException;
import br.com.fagner.data.model.CamposTabelaPerson;
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

    public CamposTabelaPersonVO create(CamposTabelaPersonVO camposTabelaPerson){
        var entity = DozerConverter.parseObject(camposTabelaPerson, CamposTabelaPerson.class);
        var vo = DozerConverter.parseObject(comandosSQLPersonRepository.save(entity), CamposTabelaPersonVO.class);
        return vo;
    }

    public List<CamposTabelaPersonVO> findAll(){
        return DozerConverter.parseListObjects(comandosSQLPersonRepository.findAll(),CamposTabelaPersonVO.class);
    }

    public CamposTabelaPersonVO findById(Long id){
        var entity= comandosSQLPersonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sem registros para esse ID"));
        return  DozerConverter.parseObject(comandosSQLPersonRepository.save(entity), CamposTabelaPersonVO.class);
    }

    public CamposTabelaPersonVO update(CamposTabelaPersonVO camposTabelaPerson){
        var entity = comandosSQLPersonRepository.findById(camposTabelaPerson.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        entity.setFirstName(camposTabelaPerson.getFirstName());
        entity.setLastName(camposTabelaPerson.getLastName());
        entity.setAddress(camposTabelaPerson.getAddress());
        entity.setGender(camposTabelaPerson.getGender());
        var vo = DozerConverter.parseObject(comandosSQLPersonRepository.save(entity), CamposTabelaPersonVO.class);
        return vo;
    }

    public void delete(Long id){
        CamposTabelaPerson entity = comandosSQLPersonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        comandosSQLPersonRepository.delete(entity);

    }




}
