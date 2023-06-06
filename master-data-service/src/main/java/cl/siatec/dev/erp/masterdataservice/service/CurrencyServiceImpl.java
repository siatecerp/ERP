package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.Currency;
import cl.siatec.dev.erp.masterdataservice.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService{

    @Autowired
    private CurrencyRepository currencyRepository;


    @Override
    public Currency findById(Long id) {return currencyRepository.findById(id).orElse(null);}

    @Override
    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

    @Override
    public List<Currency> findByActiveTrue() {
        return currencyRepository.findByActiveTrue();
    }

    @Override
    public List<Currency> findByNameContainsIgnoreCase(String name){return currencyRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public List<Currency> findByAbrevContainsIgnoreCase(String abrev) {return currencyRepository.findByAbrevContainsIgnoreCase(abrev);}

    @Override
    public List<Currency> findByActive(Boolean active) {
        return currencyRepository.findByActive(active);
    }

    @Override
    public Currency save(Currency currency) {return currencyRepository.save(currency);}

    @Override
    public Currency update(Currency currency){
        Currency currencyToUpdate = currencyRepository.findById(currency.getId()).orElse(null);
        if(currencyToUpdate != null){
            currencyToUpdate.setActive(currency.getActive());
            currencyToUpdate.setName(currency.getName());
            currencyToUpdate.setAbrev(currency.getAbrev());
            currencyToUpdate.setDescription(currency.getDescription());
            return currencyRepository.save(currencyToUpdate);
        }
        return null;
    }

    @Override
    public Currency delete(Currency currency) {
        Currency currencyToDelete = currencyRepository.findById(currency.getId()).orElse(null);
        if(currencyToDelete != null){
            currencyToDelete.setActive(false);
            return currencyRepository.save(currencyToDelete);
        }
        return null;
    }
}
