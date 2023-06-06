package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.WayToPayType;

import java.util.List;

public interface WayToPayTypeService {

    public WayToPayType findById(Long id);
    public List<WayToPayType> findAll();
    public List<WayToPayType> findByActiveTrue();
    public List<WayToPayType> findByNameContainsIgnoreCase(String name);
    public List<WayToPayType> findByActive(Boolean active);

    public WayToPayType save(WayToPayType wayToPayType);
    public WayToPayType update(WayToPayType wayToPayType);
    public WayToPayType delete(WayToPayType wayToPayType);

}
