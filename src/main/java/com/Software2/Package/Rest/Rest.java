/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Rest;

import com.Software2.Package.Model.Averia;
import com.Software2.Package.Model.Bache;
import com.Software2.Package.Model.Ciudadano;
import com.Software2.Package.Model.Funcionario;
import com.Software2.Package.Model.Personal;
import com.Software2.Package.Model.User;
import com.Software2.Package.Model.UserRequest;
import com.Software2.Package.Services.AvariaService;
import com.Software2.Package.Services.BacheService;
import com.Software2.Package.Services.CiudadanoService;
import com.Software2.Package.Services.FuncionarioService;
import com.Software2.Package.Services.PersonalService;
import com.Software2.Package.Services.UserService;
import java.net.URI;
import java.net.URISyntaxException;
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
        Averia newaveria = avariaService.save(averia);
        try {

            return ResponseEntity.created(new URI("/averia/" + newaveria.getTipoDAño())).body(newaveria);
        } catch (URISyntaxException ex) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/personal")
    private ResponseEntity<Personal> SavePersonal(@RequestBody Personal personal) {
        Personal newPersonal = personalService.save(personal);
        try {

            return ResponseEntity.created(new URI("/personal/" + newPersonal.getNombre())).body(newPersonal);
        } catch (URISyntaxException ex) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/find")
    private ResponseEntity<User> getUsePkrByUsername(@RequestBody UserRequest userRequest) {
        String username = userRequest.getUsername();

        Optional<User> usuarios = UserService.findByusername(username);

        if (usuarios.isPresent()) {
            User c = usuarios.get();

            return ResponseEntity.ok(c);
        } else {

            return ResponseEntity.notFound().build();

        }

    }

}
