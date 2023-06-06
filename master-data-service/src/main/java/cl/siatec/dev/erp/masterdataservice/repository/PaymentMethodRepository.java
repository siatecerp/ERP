package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

    List<PaymentMethod> findByActiveTrue();

    List<PaymentMethod> findByNameContainsIgnoreCase(String name);

    List<PaymentMethod> findByActive(Boolean active);


}