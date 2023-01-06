package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name = "order")
public class Order
{
    @Id
    private Integer id;

    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany
    @JoinColumn(table = "order_item", name = "order_id")
    private List<OrderItem> items;

    @Column(name = "creation_date_time")
    private Timestamp created;

    @Enumerated(EnumType.STRING)
    private DeliveryMethod delivery;

    @Enumerated(EnumType.STRING)
    private PaymentMethod payment;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(name = "closing_date_time")
    private Timestamp closed;

    private Double totalSum;


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public Customer getCustomer()
    {
        return customer;
    }


    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }


    public List<OrderItem> getItems()
    {
        return items;
    }


    public void setItems(List<OrderItem> items)
    {
        this.items = items;
    }


    public Timestamp getCreated()
    {
        return created;
    }


    public void setCreated(Timestamp created)
    {
        this.created = created;
    }


    public DeliveryMethod getDelivery()
    {
        return delivery;
    }


    public void setDelivery(DeliveryMethod delivery)
    {
        this.delivery = delivery;
    }


    public PaymentMethod getPayment()
    {
        return payment;
    }


    public void setPayment(PaymentMethod payment)
    {
        this.payment = payment;
    }


    public OrderStatus getStatus()
    {
        return status;
    }


    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }


    public Timestamp getClosed()
    {
        return closed;
    }


    public void setClosed(Timestamp closed)
    {
        this.closed = closed;
    }


    public Double getTotalSum()
    {
        return totalSum;
    }


    public void setTotalSum(Double totalSum)
    {
        this.totalSum = totalSum;
    }
}
