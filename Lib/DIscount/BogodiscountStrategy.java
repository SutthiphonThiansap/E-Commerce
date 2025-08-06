package Lib.DIscount;

import Lib.*;

/**
 * กลยุทธ์ส่วนลด BOGO (ซื้อ 1 เเถม 1)
 */

public class BogodiscountStrategy implements DiscountStrategy {

    @Override
    public double calculatePrice(CartItem item) {
        int quantity = item.getQuantity();
        double price = item.getProduct().getPrice();
        int quantityToPay = (quantity / 2) + (quantity % 2);
        return price * quantityToPay;
    }
}