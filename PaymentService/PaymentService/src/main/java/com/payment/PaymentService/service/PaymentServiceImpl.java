package com.payment.PaymentService.service;

import com.payment.PaymentService.model.Payment;
import com.payment.PaymentService.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment getPaymentById(int id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @Override
    public Payment updatePayment(Payment payment) {
        Optional<Payment> existingPayment = paymentRepository.findById(payment.getId());

        if (existingPayment.isPresent()) {
            return paymentRepository.save(payment); // Fix: Update and save the payment
        }

        return null; // Return null if payment ID does not exist
    }


}
