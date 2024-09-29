package Inner_Classes;
 class Order {
    private String orderId;
    private double orderAmount;

    public Order(String orderId, double orderAmount) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}

public class OrderProcessor {
    public void processOrder(Order order) {
        // Local inner class to calculate discount
        class DiscountCalculator {
            double calculateDiscount() {
                if (order.getOrderAmount() > 100) {
                    return order.getOrderAmount() * 0.1;  // 10% discount
                } else {
                    return 0;
                }
            }
        }

        DiscountCalculator discountCalculator = new DiscountCalculator();
        double discount = discountCalculator.calculateDiscount();
        double finalAmount = order.getOrderAmount() - discount;

        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Original Amount: $" + order.getOrderAmount());
        System.out.println("Discount: $" + discount);
        System.out.println("Final Amount: $" + finalAmount);
    }

    public static void main(String[] args) {
        Order order1 = new Order("O12345", 150.0);
        Order order2 = new Order("O12346", 90.0);

        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order1);
        processor.processOrder(order2);
    }
}
