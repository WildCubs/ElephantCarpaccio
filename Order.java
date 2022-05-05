public class Order {

    private int totalPrice;
    private String stateCode;

    public Order(String stateCode);

public void calculateTotal(int quantity, double price) {
    totalPrice = quantity * price
}

}

