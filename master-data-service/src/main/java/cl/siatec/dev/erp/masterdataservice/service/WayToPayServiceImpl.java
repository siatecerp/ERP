package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.WayToPay;
import cl.siatec.dev.erp.masterdataservice.entity.WayToPayType;
import cl.siatec.dev.erp.masterdataservice.repository.WayToPayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WayToPayServiceImpl implements WayToPayService{

    @Autowired
    private WayToPayRepository wayToPayRepository;

    @Override
    public WayToPay findById(Long id) {return wayToPayRepository.findById(id).orElse(null);}

    @Override
    public List<WayToPay> findAll() {return wayToPayRepository.findAll();}

    @Override
    public List<WayToPay> findByActiveTrue() {return wayToPayRepository.findByActiveTrue();}

    @Override
    public List<WayToPay> findByWayToPayType(WayToPayType wayToPayType) {return wayToPayRepository.findByWayToPayType(wayToPayType);}

    @Override
    public List<WayToPay> findByNameContainsIgnoreCase(String name) {return wayToPayRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public List<WayToPay> findByWayToPayTypeAndActiveTrue(WayToPayType wayToPayType) {
        return null;
    }

    @Override
    public List<WayToPay> findByActive(Boolean active) {return wayToPayRepository.findByActive(active);}

    @Override
    public WayToPay save(WayToPay wayToPay) {return wayToPayRepository.save(wayToPay);}

    @Override
    public WayToPay update(WayToPay wayToPay) {
        WayToPay wayToPayToUpdate = wayToPayRepository.findById(wayToPay.getId()).orElse(null);
        if (wayToPayToUpdate != null) {
            wayToPayToUpdate.setActive(wayToPay.getActive());
            wayToPayToUpdate.setName(wayToPay.getName());
            wayToPayToUpdate.setDescription(wayToPay.getDescription());
            wayToPayToUpdate.setWayToPayType(wayToPay.getWayToPayType());
            return wayToPayRepository.save(wayToPayToUpdate);
        }
        return null;
    }

    @Override
    public WayToPay delete(WayToPay wayToPay) {
        WayToPay wayToPayToDelete = wayToPayRepository.findById(wayToPay.getId()).orElse(null);
        if (wayToPayToDelete != null) {
            wayToPayToDelete.setActive(false);
            return wayToPayRepository.save(wayToPayToDelete);
        }
        return null;
    }
}
