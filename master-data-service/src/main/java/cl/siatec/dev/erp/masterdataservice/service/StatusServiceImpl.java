package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.Status;
import cl.siatec.dev.erp.masterdataservice.entity.StatusType;
import cl.siatec.dev.erp.masterdataservice.repository.StatusRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService{

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Status findById(Long id) {return statusRepository.findById(id).orElse(null);}

    @Override
    public Status active(Status status, Boolean active) {
        Status statusToActive = statusRepository.findById(status.getId()).orElse(null);
        if (statusToActive != null) {
            statusToActive.setActive(active);
            return statusRepository.save(statusToActive);
        }
        return null;
    }

    @Override
    public List<Status> findAll() {return statusRepository.findAll();}

    @Override
    public List<Status> findByStatusType_ActiveTrue() {return statusRepository.findByActiveTrue();}

    @Override
    public List<Status> findByStatusType(StatusType statusType) {return statusRepository.findByStatusType(statusType);}

    @Override
    public List<Status> findByStatusType_NameContainsIgnoreCase(String name) {return statusRepository.findByStatusType_NameContainsIgnoreCase(name);}

    @Override
    public Status save(Status status) {return statusRepository.save(status);}

    @Override
    public Status update(Status status) {
        Status statusToUpdate = statusRepository.findById(status.getId()).orElse(null);
        if (statusToUpdate != null) {
            statusToUpdate.setName(status.getName());
            statusToUpdate.setDescription(status.getDescription());
            statusToUpdate.setStatusType(status.getStatusType());
            return statusRepository.save(statusToUpdate);
        }
        return null;
    }

    @Override
    public Status delete(Status status) {
        Status statusToDelete = statusRepository.findById(status.getId()).orElse(null);
        if (statusToDelete != null) {
            statusRepository.delete(statusToDelete);
            return statusToDelete;
        }
        return null;
    }
}
