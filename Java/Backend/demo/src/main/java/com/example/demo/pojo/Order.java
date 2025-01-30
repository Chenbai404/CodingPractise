package com.example.demo.pojo;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "tb_order")
@Entity
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderID;

    @Column(name = "customer_name")
    private String CustomerName;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "order_price")
    private Float orderPrice;


    // One-to-Many relationship with OrderItem
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;


    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", CustomerName=" + CustomerName + ", orderDate=" + orderDate
                + ", orderPrice=" + orderPrice + ", orderItems=" + orderItems + "]";
    }

    


}
