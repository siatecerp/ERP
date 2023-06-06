package cl.siatec.dev.erp.masterdataservice.service;

import cl.siatec.dev.erp.masterdataservice.entity.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {

    public PaymentMethod findById(Long id);
    public List<PaymentMethod> findAll();
    public List<PaymentMethod> findByActiveTrue();
    public List<PaymentMethod> findByNameContainsIgnoreCase(String name);
    public List<PaymentMethod> findByActive(Boolean active);

    public PaymentMethod save(PaymentMethod paymentMethod);
    public PaymentMethod update(PaymentMethod paymentMethod);
    public PaymentMethod delete(PaymentMethod paymentMethod);

}
