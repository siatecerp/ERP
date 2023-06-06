package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.WayToPayType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WayToPayTypeRepository extends JpaRepository<WayToPayType, Long> {

    List<WayToPayType> findByActiveTrue();

    List<WayToPayType> findByNameContainsIgnoreCase(String name);
    List<WayToPayType> findByActive(Boolean active);

}