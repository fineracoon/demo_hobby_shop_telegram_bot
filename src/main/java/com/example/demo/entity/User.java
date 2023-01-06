package com.example.demo.entity;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "user")
public class User
{
    @Id
    private Integer id;

    private String name;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private String role;


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


    public String getUsername()
    {
        return username;
    }


    public void setUsername(String username)
    {
        this.username = username;
    }


    public String getPassword()
    {
        return password;
    }


    public void setPassword(String password)
    {
        this.password = password;
    }


    public String getRole()
    {
        return role;
    }


    public void setRole(String role)
    {
        this.role = role;
    }
}
