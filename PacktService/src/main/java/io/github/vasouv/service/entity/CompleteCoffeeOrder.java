package io.github.vasouv.service.entity;

/**
 *
 * @author vasouv
 */
public class CompleteCoffeeOrder {

    private String customerName;
    private String email;

    private String coffeeName;
    private String coffeePrice;
    private Long customerID;

    public CompleteCoffeeOrder() {
    }

    public CompleteCoffeeOrder(String customerName, String email, String coffeeName, String coffeePrice, Long customerID) {
        this.customerName = customerName;
        this.email = email;
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(String coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

}
