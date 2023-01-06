package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "item")
public class Item
{
    @Id
    private Integer id;

    private String name;

    @JoinColumn(name = "category_id")
    private Category category;

    private String producer;

    private String description;

    private Integer quantity;

    private Double cost;


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public Category getCategory()
    {
        return category;
    }


    public void setCategory(Category category)
    {
        this.category = category;
    }


    public String getProducer()
    {
        return producer;
    }


    public void setProducer(String producer)
    {
        this.producer = producer;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }


    public Integer getQuantity()
    {
        return quantity;
    }


    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }


    public Double getCost()
    {
        return cost;
    }


    public void setCost(Double cost)
    {
        this.cost = cost;
    }
}
