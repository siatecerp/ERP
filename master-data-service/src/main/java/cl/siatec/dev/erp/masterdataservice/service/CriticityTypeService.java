package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.CriticityType;

import java.util.List;

public interface CriticityTypeService {

    public CriticityType findById(Long id);

    public CriticityType active(CriticityType criticityType, Boolean active);
    public List<CriticityType> findAll();
    public List<CriticityType> findByNameContainsIgnoreCase(String name);

    public List<CriticityType> findByActiveTrue();
    public CriticityType save(CriticityType criticityType);
    public CriticityType update(CriticityType criticityType);
    public CriticityType delete(CriticityType criticityType);


}
