package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.WayToPayType;
import cl.siatec.dev.erp.masterdataservice.repository.WayToPayTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WayToPayTypeServiceImpl implements WayToPayTypeService{

    @Autowired
    private WayToPayTypeRepository wayToPayTypeRepository;


    @Override
    public WayToPayType findById(Long id) {
        return null;
    }

    @Override
    public List<WayToPayType> findAll() {
        return null;
    }

    @Override
    public List<WayToPayType> findByActiveTrue() {
        return null;
    }

    @Override
    public List<WayToPayType> findByNameContainsIgnoreCase(String name) {
        return null;
    }

    @Override
    public List<WayToPayType> findByActive(Boolean active) {
        return null;
    }

    @Override
    public WayToPayType save(WayToPayType wayToPayType) {
        return null;
    }

    @Override
    public WayToPayType update(WayToPayType wayToPayType) {
        return null;
    }

    @Override
    public WayToPayType delete(WayToPayType wayToPayType) {
        return null;
    }
}
