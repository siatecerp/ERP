package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.Tax;
import cl.siatec.dev.erp.masterdataservice.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxServiceImpl implements TaxService {

    @Autowired
    private TaxRepository taxRepository;

    @Override
    public Tax findById(Long id) {return taxRepository.findById(id).orElse(null);}

    @Override
    public Tax activate(Tax tax, Boolean activate) {
        Tax taxToActivate = taxRepository.findById(tax.getId()).orElse(null);
        if (taxToActivate != null) {
            taxToActivate.setActive(activate);
            return taxRepository.save(taxToActivate);
        }
        return null;
    }

    @Override
    public List<Tax> findAll() {return taxRepository.findAll();}

    @Override
    public List<Tax> findByActiveTrue() {return taxRepository.findByActiveTrue();}

    @Override
    public List<Tax> findByNameContainsIgnoreCase(String name) {return taxRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public List<Tax> findByAbrevContainsIgnoreCase(String abrev) {return taxRepository.findByAbrevContainsIgnoreCase(abrev);}

    @Override
    public List<Tax> findByPorcent(Double porcent) {return taxRepository.findByPorcent(porcent);}

    @Override
    public Tax save(Tax tax) {return taxRepository.save(tax);}

    @Override
    public Tax update(Tax tax) {

        Tax taxToUpdate = taxRepository.findById(tax.getId()).orElse(null);
        if (taxToUpdate != null) {
            taxToUpdate.setName(tax.getName());
            taxToUpdate.setAbrev(tax.getAbrev());
            taxToUpdate.setPorcent(tax.getPorcent());
            taxToUpdate.setFactor(tax.getFactor());
            return taxRepository.save(taxToUpdate);
        }
        return null;
    }

    @Override
    public Tax delete(Tax tax) {

        Tax taxToDelete = taxRepository.findById(tax.getId()).orElse(null);
        if (taxToDelete != null) {
            taxRepository.delete(taxToDelete);
            return taxToDelete;
        }
        return null;
    }
}
