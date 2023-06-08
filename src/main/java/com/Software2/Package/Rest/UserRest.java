/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Rest;

import com.Software2.Package.Model.User;
import com.Software2.Package.Services.UserService;
import java.net.URI;
import java.net.URISyntaxException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // para usar el log
@RestController
@RequestMapping("/user/")
public class UserRest {

    @Autowired
    private UserService UserService;

    @PostMapping
    private ResponseEntity<User> SaveUser(@RequestBody User user) {
        User newUser = UserService.save(user);
        try {
            //aqui es para mandarle la persona guardada como respuesta
            return ResponseEntity.created(new URI("/empleados/" + newUser.getUsername())).body(newUser);
        } catch (URISyntaxException ex) {
            //aca por si hay algun error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
