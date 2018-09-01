package io.github.vasouv.service.entity;

/**
 *
 * @author vasouv
 */
public class CoffeeOrder {

    private Long id;
    private String coffeeName;
    private String price;
    private Long customerId;

    public CoffeeOrder() {
    }

    public CoffeeOrder(Long id, String coffeeName, String price, Long customerId) {
        this.id = id;
        this.coffeeName = coffeeName;
        this.price = price;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

}
