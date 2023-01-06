package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer_info")
public class CustomerInfo
{
    @Id
    private Integer id;

    private Integer customerId;

    private String phoneNumber;

    private String address;

    private String city;


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public Integer getCustomerId()
    {
        return customerId;
    }


    public void setCustomerId(Integer customerId)
    {
        this.customerId = customerId;
    }


    public String getPhoneNumber()
    {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }


    public String getAddress()
    {
        return address;
    }


    public void setAddress(String address)
    {
        this.address = address;
    }


    public String getCity()
    {
        return city;
    }


    public void setCity(String city)
    {
        this.city = city;
    }
}
