package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.StatusType;

import java.util.List;

public interface StatusTypeService {

    public StatusType findById(Long id);

    public StatusType active(StatusType statusType, Boolean active);
    public List<StatusType> findAll();

    public List<StatusType> findByActiveTrue();
    public List<StatusType> findByNameContainsIgnoreCase(String name);

    public StatusType save(StatusType statusType);
    public StatusType update(StatusType statusType);
    public StatusType delete(StatusType statusType);

}
