package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.Currency;

import java.util.List;

public interface CurrencyService {

    public Currency findById(Long id);

    public List<Currency> findAll();

    public List<Currency> findByActiveTrue();

    public List<Currency> findByNameContainsIgnoreCase(String name);
    public List<Currency> findByAbrevContainsIgnoreCase(String abrev);

    public List<Currency> findByActive(Boolean active);

    public Currency save(Currency currency);
    public Currency update(Currency currency);
    public Currency delete(Currency currency);


}
