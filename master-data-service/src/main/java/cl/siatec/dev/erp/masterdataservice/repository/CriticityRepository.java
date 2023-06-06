package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.Criticity;
import cl.siatec.dev.erp.masterdataservice.entity.CriticityType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CriticityRepository extends JpaRepository<Criticity, Long> {
    List<Criticity> findByNameContainsIgnoreCase(String name);

    List<Criticity> findByCriticityType(CriticityType criticityType);

    List<Criticity> findByCriticityType_ActiveTrue();

    List<Criticity> findByActive(Boolean active);
}