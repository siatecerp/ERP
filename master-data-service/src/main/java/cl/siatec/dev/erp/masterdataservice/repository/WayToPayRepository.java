package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.WayToPay;
import cl.siatec.dev.erp.masterdataservice.entity.WayToPayType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WayToPayRepository extends JpaRepository<WayToPay, Long> {
    List<WayToPay> findByActiveTrue();

    List<WayToPay> findByWayToPayType(WayToPayType wayToPayType);

    List<WayToPay> findByNameContainsIgnoreCase(String name);

    List<WayToPay> findByWayToPayTypeAndActiveTrue(WayToPayType wayToPayType);

    List<WayToPay> findByActive(Boolean active);
}