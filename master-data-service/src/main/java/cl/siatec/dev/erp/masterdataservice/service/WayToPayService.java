package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.WayToPay;
import cl.siatec.dev.erp.masterdataservice.entity.WayToPayType;

import java.util.List;

public interface WayToPayService {

    public WayToPay findById(Long id);
    public List<WayToPay> findAll();
    public List<WayToPay> findByActiveTrue();
    public List<WayToPay> findByWayToPayType(WayToPayType wayToPayType);
    public List<WayToPay> findByNameContainsIgnoreCase(String name);
    public List<WayToPay> findByWayToPayTypeAndActiveTrue(WayToPayType wayToPayType);

    public List<WayToPay> findByActive(Boolean active);

    public WayToPay save(WayToPay wayToPay);
    public WayToPay update(WayToPay wayToPay);
    public WayToPay delete(WayToPay wayToPay);
}
