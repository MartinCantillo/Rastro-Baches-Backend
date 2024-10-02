/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Rol;
import com.Software2.Package.Repository.RolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService  {

    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Transactional

    public <S extends Rol> S save(S entity) {
        return rolRepository.save(entity);
    }


    public <S extends Rol> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public Optional<Rol> findById(Long id) {
        return rolRepository.findById(id);
    }


    public boolean existsById(Long id) {
        return rolRepository.existsById(id);
    }


    public Iterable<Rol> findAll() {
        return rolRepository.findAll();
    }


    public Iterable<Rol> findAllById(Iterable<Long> ids) {
        return rolRepository.findAllById(ids);
    }


    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
