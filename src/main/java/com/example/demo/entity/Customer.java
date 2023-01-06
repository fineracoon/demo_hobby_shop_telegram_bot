package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    private Integer id;

    private String name;

    private String surname;

    private String username;

    private Long chatId;


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


    public String getSurname()
    {
        return surname;
    }


    public void setSurname(String surname)
    {
        this.surname = surname;
    }


    public String getUsername()
    {
        return username;
    }


    public void setUsername(String username)
    {
        this.username = username;
    }


    public Long getChatId()
    {
        return chatId;
    }


    public void setChatId(Long chatId)
    {
        this.chatId = chatId;
    }
}
