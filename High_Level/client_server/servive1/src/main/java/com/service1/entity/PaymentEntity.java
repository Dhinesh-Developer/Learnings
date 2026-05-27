package com.service1.entity;

public class PaymentEntity {
    
    private Long id;
    private Double paymentAmount;
    private String paymentCurrency;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getPaymentAmount() {
        return paymentAmount;
    }
    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    public String getPaymentCurrency() {
        return paymentCurrency;
    }
    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }
    public PaymentEntity(Long id, Double paymentAmount, String paymentCurrency) {
        this.id = id;
        this.paymentAmount = paymentAmount;
        this.paymentCurrency = paymentCurrency;
    }
    public PaymentEntity() {
    } 
        

}
