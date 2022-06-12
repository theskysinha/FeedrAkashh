package com.example.feedrapplication;

public class User 
{
     public String email, type, name, location;

     public User()
     {}

     public User(String email, String name, String type, String location)
     {
          this.email = email;
          this.type = type;
          this.name = name;
          this.location = location;
     }
}
