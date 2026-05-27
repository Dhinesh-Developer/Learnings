package com.service1.dto;

public class PaymentRequest {
    
    private Long paymentId;

    public PaymentRequest(){

    }

    public PaymentRequest(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }
    

}
