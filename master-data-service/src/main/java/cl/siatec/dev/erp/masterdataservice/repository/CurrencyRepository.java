package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    List<Currency> findByActiveTrue();

    List<Currency> findByNameContainsIgnoreCase(String name);

    List<Currency> findByAbrevContainsIgnoreCase(String abrev);

    List<Currency> findByActive(Boolean active);
}