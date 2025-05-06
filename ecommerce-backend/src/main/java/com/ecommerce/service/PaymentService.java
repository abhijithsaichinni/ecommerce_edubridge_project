package com.ecommerce.service;


import com.ecommerce.entity.PaymentRequest;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(PaymentRequest request) {
        // Mock validation logic
        if (request.getAmount() <= 0) {
            return "Invalid amount";
        }
        if (!request.getCardNumber().matches("\\d{16}")) {
            return "Invalid card number";
        }

        // Simulate interaction with payment gateway
        // In real case, you would call Stripe/PayPal API here
        System.out.println("Processing payment of $" + request.getAmount() + " for user " + request.getUserId());
        
        return "Payment successful";
    }
}
