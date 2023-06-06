package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxRepository extends JpaRepository<Tax, Long> {
    List<Tax> findByNameContainsIgnoreCase(String name);

    List<Tax> findByAbrevContainsIgnoreCase(String abrev);

    List<Tax> findByPorcent(Double porcent);

    List<Tax> findByActiveTrue();

    List<Tax> findByActive(Boolean active);
}