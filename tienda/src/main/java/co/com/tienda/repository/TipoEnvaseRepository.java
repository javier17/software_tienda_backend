package co.com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.tienda.model.TipoEnvase;

@Repository
public interface TipoEnvaseRepository extends JpaRepository<TipoEnvase, String>{

}
