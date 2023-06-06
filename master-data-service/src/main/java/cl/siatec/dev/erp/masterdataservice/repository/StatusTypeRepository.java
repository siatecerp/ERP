package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusTypeRepository extends JpaRepository<StatusType, Long> {
    List<StatusType> findByNameContainsIgnoreCase(String name);

    List<StatusType> findByActiveTrue();

    List<StatusType> findByActive(Boolean active);




}