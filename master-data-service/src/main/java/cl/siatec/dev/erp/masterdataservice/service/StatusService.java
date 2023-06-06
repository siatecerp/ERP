package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.Status;
import cl.siatec.dev.erp.masterdataservice.entity.StatusType;

import java.util.List;

public interface StatusService {

    public Status findById(Long id);

    public Status active(Status status, Boolean active);
    public List<Status> findAll();

    public List<Status> findByStatusType_ActiveTrue();


    public List<Status> findByStatusType(StatusType statusType);
    public List<Status> findByStatusType_NameContainsIgnoreCase(String name);

    public Status save(Status status);
    public Status update(Status status);
    public Status delete(Status status);

}
