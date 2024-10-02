/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Ciudadano;
import com.Software2.Package.Model.User;
import com.Software2.Package.Repository.CiudadanoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

@Service
public class CiudadanoService {

    private final CiudadanoRepository ciudadanoRepository;

    public CiudadanoService(CiudadanoRepository ciudadanoRepository) {
        this.ciudadanoRepository = ciudadanoRepository;
    }

    @Transactional

    public <S extends Ciudadano> S save(S entity) {
        return ciudadanoRepository.save(entity);
    }


    public <S extends Ciudadano> Iterable<S> saveAll(Iterable<S> entities) {
        return ciudadanoRepository.saveAll(entities);
    }


    public Optional<Ciudadano> findById(Long id) {
        return ciudadanoRepository.findById(id);
    }


    public boolean existsById(Long id) {
        return ciudadanoRepository.existsById(id);
    }


    public Iterable<Ciudadano> findAll() {
        return ciudadanoRepository.findAll();
    }


    public Iterable<Ciudadano> findAllById(Iterable<Long> ids) {
        return ciudadanoRepository.findAllById(ids);
    }


    public long count() {
        return 0;
    }

    @Transactional

    public void deleteById(Long id) {
        ciudadanoRepository.deleteById(id);
    }


    public void delete(Ciudadano entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAll(Iterable<? extends Ciudadano> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public Optional<Ciudadano> findByUser(User user) {
        return ciudadanoRepository.findByUser(user);
    }


 

}
