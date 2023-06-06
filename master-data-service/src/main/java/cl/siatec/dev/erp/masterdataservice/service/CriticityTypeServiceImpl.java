package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.CriticityType;
import cl.siatec.dev.erp.masterdataservice.repository.CriticityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriticityTypeServiceImpl implements CriticityTypeService{

    @Autowired
    private CriticityTypeRepository criticityTypeRepository;


    @Override
    public CriticityType findById(Long id) {return criticityTypeRepository.findById(id).orElse(null);}

    @Override
    public CriticityType active(CriticityType criticityType, Boolean active) {
        CriticityType criticityTypeToActive = criticityTypeRepository.findById(criticityType.getId()).orElse(null);
        if (criticityTypeToActive != null) {
            criticityTypeToActive.setActive(active);
            return criticityTypeRepository.save(criticityTypeToActive);
        }
        return null;
    }

    @Override
    public List<CriticityType> findAll() {return criticityTypeRepository.findAll();}

    @Override
    public List<CriticityType> findByNameContainsIgnoreCase(String name) {return criticityTypeRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public List<CriticityType> findByActiveTrue() {
        return criticityTypeRepository.findByActiveTrue();
    }

    @Override
    public CriticityType save(CriticityType criticityType) {return criticityTypeRepository.save(criticityType);}

    @Override
    public CriticityType update(CriticityType criticityType) {
        CriticityType criticityTypeToUpdate = criticityTypeRepository.findById(criticityType.getId()).orElse(null);
        if (criticityTypeToUpdate != null) {
            criticityTypeToUpdate.setName(criticityType.getName());
            criticityTypeToUpdate.setDescription(criticityType.getDescription());
            return criticityTypeRepository.save(criticityTypeToUpdate);
        }
        return null;
    }

    @Override
    public CriticityType delete(CriticityType criticityType) {
        CriticityType criticityTypeToDelete = criticityTypeRepository.findById(criticityType.getId()).orElse(null);
        if (criticityTypeToDelete != null) {
            criticityTypeRepository.delete(criticityTypeToDelete);
            return criticityTypeToDelete;
        }
        return null;
    }
}
