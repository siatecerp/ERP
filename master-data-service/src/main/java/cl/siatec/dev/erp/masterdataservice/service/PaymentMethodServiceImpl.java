package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.PaymentMethod;
import cl.siatec.dev.erp.masterdataservice.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService{

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;


    @Override
    public PaymentMethod findById(Long id) {return paymentMethodRepository.findById(id).orElse(null);}

    @Override
    public List<PaymentMethod> findAll() {return paymentMethodRepository.findAll();}

    @Override
    public List<PaymentMethod> findByActiveTrue() {return paymentMethodRepository.findByActiveTrue();}

    @Override
    public List<PaymentMethod> findByNameContainsIgnoreCase(String name) {return paymentMethodRepository.findByNameContainsIgnoreCase(name);}

    @Override
    public List<PaymentMethod> findByActive(Boolean active) {return paymentMethodRepository.findByActive(active);}

    @Override
    public PaymentMethod save(PaymentMethod paymentMethod) {return paymentMethodRepository.save(paymentMethod);}

    @Override
    public PaymentMethod update(PaymentMethod paymentMethod) {
       PaymentMethod paymentMethodToUpdate = paymentMethodRepository.findById(paymentMethod.getId()).orElse(null);
       if (paymentMethodToUpdate != null){
           paymentMethodToUpdate.setActive(paymentMethod.getActive());
           paymentMethodToUpdate.setName(paymentMethod.getName());
           paymentMethodToUpdate.setDescription(paymentMethod.getDescription());
           return paymentMethodRepository.save(paymentMethodToUpdate);
       }
         return null;
    }

    @Override
    public PaymentMethod delete(PaymentMethod paymentMethod) {
        PaymentMethod paymentMethodToDelete = paymentMethodRepository.findById(paymentMethod.getId()).orElse(null);
        if (paymentMethodToDelete != null){
            paymentMethodToDelete.setActive(false);
            return paymentMethodRepository.save(paymentMethodToDelete);
        }
        return null;
    }
}
