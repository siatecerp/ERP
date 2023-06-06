package cl.siatec.dev.erp.masterdataservice.repository;

import cl.siatec.dev.erp.masterdataservice.entity.Status;
import cl.siatec.dev.erp.masterdataservice.entity.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Long> {
    List<Status> findByStatusType(StatusType statusType);

    List<Status> findByStatusType_NameContainsIgnoreCase(String name);

    List<Status> findByActiveTrue();

    List<Status> findByActive(Boolean active);


    List<Status> findByStatusTypeAndActiveTrue(StatusType statusType);
}