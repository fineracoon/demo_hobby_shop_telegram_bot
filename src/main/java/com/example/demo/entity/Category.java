package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "category")
public class Category
{
    @Id
    private Integer id;

    private String name;

    @JoinColumn(name = "parent_id")
    private Category parent;

    private String code;


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


    public Category getParent()
    {
        return parent;
    }


    public void setParent(Category parent)
    {
        this.parent = parent;
    }


    public String getCode()
    {
        return code;
    }


    public void setCode(String code)
    {
        this.code = code;
    }
}
