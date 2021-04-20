package br.com.fagner.repository;

import br.com.fagner.data.model.CamposTabelaPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComandosSQLPersonRepository extends JpaRepository<CamposTabelaPerson, Long>{
}
