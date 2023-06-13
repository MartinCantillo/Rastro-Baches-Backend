/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Rest;

import com.Software2.Package.Model.Averia;
import com.Software2.Package.Model.Bache;
import com.Software2.Package.Model.Ciudadano;
import com.Software2.Package.Model.Funcionario;
import com.Software2.Package.Model.Orden;
import com.Software2.Package.Model.Personal;
import com.Software2.Package.Model.User;
import com.Software2.Package.Model.UserRequest;
import com.Software2.Package.Services.AvariaService;
import com.Software2.Package.Services.BacheService;
import com.Software2.Package.Services.CiudadanoService;
import com.Software2.Package.Services.FuncionarioService;
import com.Software2.Package.Services.OrdenService;
import com.Software2.Package.Services.PersonalService;
import com.Software2.Package.Services.UserService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // para usar el log
@RestController
@RequestMapping("/user/")
public class Rest {

    @Autowired
    private PersonalService personalService;

    @Autowired
    private OrdenService ordenService;

    @Autowired
    private AvariaService avariaService;

    @Autowired
    private BacheService bacheService;
    @Autowired
    private FuncionarioService funcionarioService;
    @Autowired
    private CiudadanoService CiudadanoService;

    @Autowired
    private UserService UserService;

    @PostMapping("/saveuser")
    private ResponseEntity<User> SaveUser(@RequestBody User user) {
        User newUser = UserService.save(user);
        try {
            //aqui es para mandarle la persona guardada como respuesta
            return ResponseEntity.created(new URI("/user/" + newUser.getUsername())).body(newUser);
        } catch (URISyntaxException ex) {
            //aca por si hay algun error
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/saveOrden")
    private ResponseEntity<Orden> SaveOrden(@RequestBody Orden orden) {

        Orden newOrden = ordenService.save(orden);
        try {

            return ResponseEntity.created(new URI("/saveOrden/" + newOrden.getFuncionario())).body(newOrden);
        } catch (URISyntaxException ex) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/savec")
    private ResponseEntity<Ciudadano> SaveCiudadano(@RequestBody Ciudadano ciudadano) {
        Ciudadano newCiudadano = CiudadanoService.save(ciudadano);
        try {

            return ResponseEntity.created(new URI("/Ciudadano/" + newCiudadano.getNombreC())).body(newCiudadano);
        } catch (URISyntaxException ex) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/funcionario")
    private ResponseEntity<Funcionario> SaveFuncionario(@RequestBody Funcionario funcionario) {
        Funcionario newfuncionarioService = funcionarioService.save(funcionario);
        try {

            return ResponseEntity.created(new URI("/Funcionario/" + newfuncionarioService.getNombreF())).body(newfuncionarioService);
        } catch (URISyntaxException ex) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/bache")
    private ResponseEntity<Bache> SaveBache(@RequestBody Bache bache) {
        Bache newbache = bacheService.save(bache);
        try {

            return ResponseEntity.created(new URI("/bache/" + newbache.getDistrito())).body(newbache);
        } catch (URISyntaxException ex) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/averia")
    private ResponseEntity<Averia> SaveAveria(@RequestBody Averia averia) {
        System.out.println("averia obtenida del frontened " +averia.toString());
        Averia newaveria = avariaService.save(averia);
        try {

            return ResponseEntity.created(new URI("/averia/" + newaveria.getTipoDano())).body(newaveria);
        } catch (URISyntaxException ex) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/personal")
    private ResponseEntity<Personal> SavePersonal(@RequestBody Personal personal) {
        //     System.out.println("Personal obtenido desde el frontend" +personal.toString());
        Personal newPersonal = personalService.save(personal);
        try {

            return ResponseEntity.created(new URI("/personal/" + newPersonal.getNombre())).body(newPersonal);
        } catch (URISyntaxException ex) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

//    @PostMapping("/find")
//    private ResponseEntity<User> getUsePkrByUsername(@RequestBody UserRequest userRequest) {
//        String username = userRequest.getUsername();
//        System.out.println("username que recibe desde el frontend" + username);
//        Optional<User> usuarios = UserService.findByusername(username);
//        System.out.println("lo que recibe del servidoe" + usuarios);
//
//        if (usuarios.isPresent()) {
//            User c = usuarios.get();
//
//            return ResponseEntity.ok(c);
//        } else {
//
//            return ResponseEntity.notFound().build();
//
//        }
//
//    }
    @PostMapping("/finduser")
    private ResponseEntity<User> getpkUser(@RequestBody UserRequest userRequest) {
        String username = userRequest.getUsername();
        String password = userRequest.getPassword();
        // System.out.println("username que recibe desde el frontend" + username + "paswword");
        Optional<User> usuarios = UserService.findByusername(username);
        //  System.out.println("lo que recibe del servidoe" + usuarios);

        if (usuarios.isPresent()) {
            User c = usuarios.get();

            return ResponseEntity.ok(c);
        } else {

            return ResponseEntity.notFound().build();

        }

    }

    @GetMapping("find/{id}")
    private ResponseEntity<Ciudadano> getCiudadano(@PathVariable(name = "id") long id) {

        Optional<Ciudadano> ciudadanos = CiudadanoService.findById(id);

        if (ciudadanos.isPresent()) {
            Ciudadano c = ciudadanos.get();

            return ResponseEntity.ok(c);
        } else {

            return ResponseEntity.notFound().build();

        }

    }

    @PostMapping("findciudadanobyId")
    private ResponseEntity<Ciudadano> getCiudadanoByFK(@RequestBody User user) {
        // System.out.println("Dato recibido: " + user);

        Optional<Ciudadano> ciudadano = CiudadanoService.findByUser(user);
        //     System.out.println("objeto del servidor" + ciudadano);
        if (ciudadano.isPresent()) {
            Ciudadano c = ciudadano.get();
            return ResponseEntity.ok(c);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/GetAllBache")
    private ResponseEntity<Iterable<Bache>> getAllBaches() {

        return ResponseEntity.ok(bacheService.findAll());
    }

    @PostMapping("/GetIdBache")
    private ResponseEntity<List<Bache>> getBacheById(@RequestBody Ciudadano ciudadano) {
//        System.out.println("-----");
//        System.out.println("ciudadano enviado desde el frontend" + ciudadano);
        List<Bache> Baches = bacheService.findByciudadano(ciudadano);
        // Baches.stream().forEach(System.out::println);
        if (!Baches.isEmpty()) {
            List<Bache> c = Baches;

            return ResponseEntity.ok(c);
        } else {

            return ResponseEntity.notFound().build();

        }
    }

    @PostMapping("/getpkfuncionario")
    private ResponseEntity<Funcionario> GetPkFuncionario(@RequestBody User user) {
        // System.out.println("user fk obtenido del frontend" +user.getId());
        Optional funcionarios = funcionarioService.findByuser(user);
        //   System.out.println("funconario del servidor respeusta" +funcionarios.toString());
        if (!funcionarios.isEmpty()) {
            Funcionario funcionario = (Funcionario) funcionarios.get();

            return ResponseEntity.ok(funcionario);
        } else {

            return ResponseEntity.notFound().build();

        }
    }

    @PostMapping("/GetPersonalByOrden")
    private ResponseEntity<List<Personal>> getPersonalByOrden(@RequestBody Orden orden) {
//        System.out.println("-----");
//        System.out.println("ciudadano enviado desde el frontend" + ciudadano);
        List<Personal> personals = personalService.findByorden(orden);
        // Baches.stream().forEach(System.out::println);
        if (!personals.isEmpty()) {
            List<Personal> c = personals;

            return ResponseEntity.ok(c);
        } else {

            return ResponseEntity.notFound().build();

        }
    }
}
