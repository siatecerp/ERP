package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.Criticity;
import cl.siatec.dev.erp.masterdataservice.entity.CriticityType;

import java.util.List;

public interface CriticityService {

    public Criticity findById(Long id);

    public Criticity active(Criticity criticity,Boolean active);
    public List<Criticity> findAll();

    public List<Criticity> findByNameContainsIgnoreCase(String name);

    public List<Criticity> findByCriticityType(CriticityType criticityType);

    public List<Criticity> findByCriticityType_ActiveTrue();

    public Criticity save(Criticity criticity);
    public Criticity update(Criticity criticity);
    public Criticity delete(Criticity criticity);



}
