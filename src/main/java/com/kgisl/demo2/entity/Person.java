package com.kgisl.demo2.entity;
 
import org.springframework.data.annotation.Id;
 
public record Person(@Id Long id,String uname, String email) {
   
}