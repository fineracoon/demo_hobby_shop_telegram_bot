package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "order_item")
public class OrderItem
{
    @Id
    private Integer id;

    @JoinColumn(name = "item_id")
    private Item item;

    private Integer quantity;


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public Item getItem()
    {
        return item;
    }


    public void setItem(Item item)
    {
        this.item = item;
    }


    public Integer getQuantity()
    {
        return quantity;
    }


    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }
}
