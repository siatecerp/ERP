package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.Criticity;
import cl.siatec.dev.erp.masterdataservice.entity.CriticityType;
import cl.siatec.dev.erp.masterdataservice.repository.CriticityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriticityServiceImpl implements CriticityService{

    @Autowired
    private CriticityRepository criticityRepository;


    @Override
    public Criticity findById(Long id) {return criticityRepository.findById(id).orElse(null);}

    @Override
    public Criticity active(Criticity criticity, Boolean active) {
        Criticity criticityDB = criticityRepository.findById(criticity.getId()).orElse(null);
        if (criticityDB == null) return null;
        criticityDB.setActive(active);
        return criticityRepository.save(criticityDB);
    }

    @Override
    public List<Criticity> findAll() {return criticityRepository.findAll();}

    @Override
    public List<Criticity> findByNameContainsIgnoreCase(String name) {return criticityRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public List<Criticity> findByCriticityType(CriticityType criticityType) {return criticityRepository.findByCriticityType(criticityType);}

    @Override
    public List<Criticity> findByCriticityType_ActiveTrue() {return criticityRepository.findByCriticityType_ActiveTrue();}

    @Override
    public Criticity save(Criticity criticity) {return criticityRepository.save(criticity);}

    @Override
    public Criticity update(Criticity criticity) {
        Criticity criticityToUpdate = criticityRepository.findById(criticity.getId()).orElse(null);
        if (criticityToUpdate == null) return null;
        criticityToUpdate.setName(criticity.getName());
        criticityToUpdate.setCriticityType(criticity.getCriticityType());
        return criticityRepository.save(criticityToUpdate);
    }

    @Override
    public Criticity delete(Criticity criticity) {
        Criticity criticityToDelete = criticityRepository.findById(criticity.getId()).orElse(null);
        if (criticityToDelete == null) return null;
        criticityRepository.delete(criticityToDelete);
        return criticityToDelete;
    }
}
