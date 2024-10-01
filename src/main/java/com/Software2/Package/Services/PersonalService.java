/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Orden;
import com.Software2.Package.Model.Personal;
import com.Software2.Package.Repository.PersonalRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalService  {

    @Autowired
    private PersonalRepository PersonalRepository;

    @Transactional

    public <S extends Personal> S save(S entity) {
        return PersonalRepository.save(entity);
    }


    public <S extends Personal> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public Optional<Personal> findById(Long id) {
        return PersonalRepository.findById(id);
    }


    public boolean existsById(Long id) {
        return PersonalRepository.existsById(id);
    }


    public Iterable<Personal> findAll() {
        return PersonalRepository.findAll();
    }


    public Iterable<Personal> findAllById(Iterable<Long> ids) {
        return PersonalRepository.findAllById(ids);
    }


    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Transactional
    public void deleteById(Long id) {
PersonalRepository.deleteById(id);    }


    public void delete(Personal entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAll(Iterable<? extends Personal> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public List<Personal> findByorden(Orden orden) {
        return PersonalRepository.findByorden(orden);
    }

}
