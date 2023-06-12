/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Model;

/**
 *
 *
 */
//clase para representar la estructura de los datos JSON que se envían en una solicitud POST
public class UserRequest {

    private String username;

    private String password;

    public UserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
