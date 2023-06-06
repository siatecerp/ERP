package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.StatusType;
import cl.siatec.dev.erp.masterdataservice.repository.StatusTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusTypeServiceImpl implements StatusTypeService{

    @Autowired
    private StatusTypeRepository statusTypeRepository;


    @Override
    public StatusType findById(Long id) {return statusTypeRepository.findById(id).orElse(null);}

    @Override
    public StatusType active(StatusType statusType, Boolean active) {
        StatusType statusTypeToActive = statusTypeRepository.findById(statusType.getId()).orElse(null);
        if(statusTypeToActive != null) {
            statusTypeToActive.setActive(active);
            return statusTypeRepository.save(statusTypeToActive);
        }
        return null;
    }

    @Override
    public List<StatusType> findAll() {return statusTypeRepository.findAll();}

    @Override
    public List<StatusType> findByActiveTrue() {return statusTypeRepository.findByActiveTrue();}

    @Override
    public List<StatusType> findByNameContainsIgnoreCase(String name) {return statusTypeRepository.findByNameContainsIgnoreCase(name); }

    @Override
    public StatusType save(StatusType statusType) {return statusTypeRepository.save(statusType);}

    @Override
    public StatusType update(StatusType statusType) {
        StatusType statusTypeToUpdate = statusTypeRepository.findById(statusType.getId()).orElse(null);
        if(statusTypeToUpdate != null) {
        statusTypeToUpdate.setName(statusType.getName());
        statusTypeToUpdate.setDescription(statusType.getDescription());
            return statusTypeRepository.save(statusTypeToUpdate);
        }
        return null;
    }

    @Override
    public StatusType delete(StatusType statusType) {
        StatusType statusTypeToDelete = statusTypeRepository.findById(statusType.getId()).orElse(null);
        if(statusTypeToDelete != null) {
            statusTypeRepository.delete(statusTypeToDelete);
            return statusTypeToDelete;
        }
        return null;
    }
}
