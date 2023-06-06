package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.CriticityType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CriticityTypeRepository extends JpaRepository<CriticityType, Long> {
    List<CriticityType> findByNameContainsIgnoreCase(String name);

    List<CriticityType> findByActiveTrue();

    List<CriticityType> findByActive(Boolean active);




}