package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.Tax;

import java.util.List;

public interface TaxService {

    public Tax findById(Long id);

    public Tax activate(Tax tax, Boolean activate);
    public List<Tax> findAll();

    public List<Tax> findByActiveTrue();
    public List<Tax> findByNameContainsIgnoreCase(String name);
    public List<Tax> findByAbrevContainsIgnoreCase(String abrev);
    public List<Tax> findByPorcent(Double porcent);

    public Tax save(Tax tax);
    public Tax update(Tax tax);
    public Tax delete(Tax tax);

}
