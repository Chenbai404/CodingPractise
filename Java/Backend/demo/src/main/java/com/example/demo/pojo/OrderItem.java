package com.example.demo.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "tb_order_item")
@Entity
public class OrderItem {

    @Id
    @Column(name = "order_item_id")
    private Integer orderItemID;

    // Many-to-One relationship with Order
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    // Many-to-One relationship with Product
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;


    @Column(name = "order_item_price")
    private Float orderItemPrice;

    @Column(name = "order_item_quantity")
    private Integer orderItemQuantity;

    public Integer getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(Integer orderItemID) {
        this.orderItemID = orderItemID;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Float getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(Float orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    public Integer getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(Integer orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    @Override
    public String toString() {
        return "OrderItem [orderItemID=" + orderItemID + ", order=" + order + ", product=" + product
                + ", orderItemPrice=" + orderItemPrice + ", orderItemQuantity=" + orderItemQuantity + "]";
    }

}
