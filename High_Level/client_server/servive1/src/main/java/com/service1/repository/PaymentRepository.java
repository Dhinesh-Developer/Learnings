package com.service1.repository;

import org.springframework.stereotype.Repository;

import com.service1.dto.PaymentRequest;
import com.service1.entity.PaymentEntity;

@Repository
public class PaymentRepository {
    
    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel = executeQuery(request);
        return paymentModel;
    }

    public PaymentEntity executeQuery(PaymentRequest request){
        // Simulating the DBCall

        PaymentEntity payment = new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentAmount(1000.00);
        payment.setPaymentCurrency("INR");

        return payment;

    }

}
