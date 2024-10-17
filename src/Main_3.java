class Order {
    private String productName;
    private int quantity;
    private double price;

    public  Order(){}

    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}


class PriceCalculator {
    public double calculateTotalPrice(Order order) {
        return order.getQuantity() * order.getPrice() * 0.9;
    }
}


class PaymentProcessor {
    public void processPayment(String paymentDetails) {
        System.out.println("Payment processed using: " + paymentDetails);
    }
}


class NotificationService {
    public void sendConfirmationEmail(String email) {
        System.out.println("Confirmation email sent to: " + email);
    }
}


public class Main_3 {
    public static void main(String[] args) {
        Order order = new Order("Laptop", 2, 1000.00);
        double totalPrice = order.getQuantity() * order.getPrice() * 0.9;
        System.out.println("Total price after discount: " + totalPrice);

        processPayment("Credit Card");
        sendConfirmationEmail("customer@example.com");
    }

    private static void processPayment(String paymentDetails) {
        System.out.println("Payment processed using: " + paymentDetails);
    }

    private static void sendConfirmationEmail(String email) {
        System.out.println("Confirmation email sent to: " + email);
    }
}
