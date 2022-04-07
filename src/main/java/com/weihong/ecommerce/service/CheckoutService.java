package com.weihong.ecommerce.service;

import com.weihong.ecommerce.dto.PaymentInfo;
import com.weihong.ecommerce.dto.Purchase;
import com.weihong.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
