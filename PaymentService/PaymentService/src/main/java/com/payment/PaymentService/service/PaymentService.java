package com.payment.PaymentService.service;

import com.payment.PaymentService.model.Payment;

public interface PaymentService {
    public Payment createPayment(Payment payment);
    public Payment getPaymentById(int id);
    public Payment updatePayment(Payment payment);
}
