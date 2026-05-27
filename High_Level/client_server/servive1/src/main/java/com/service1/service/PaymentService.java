package com.service1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service1.dto.PaymentRequest;
import com.service1.dto.PaymentResponse;
import com.service1.entity.PaymentEntity;
import com.service1.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentResponse getPaymentById(PaymentRequest internalRequestObj){
        // Fetch entiry from repository
        PaymentEntity paymentModel = paymentRepository.getPaymentById(internalRequestObj);

        // convert Entity -> ResponeDto

        PaymentResponse paymentResponse = mapModelToResponseDTO(paymentModel);
        return paymentResponse;
    }

    public PaymentResponse mapModelToResponseDTO(PaymentEntity paymentModel){
        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(paymentModel.getId());
        response.setAmount(paymentModel.getPaymentAmount());
        response.setCurrency(paymentModel.getPaymentCurrency());

        return response;
    }


}
