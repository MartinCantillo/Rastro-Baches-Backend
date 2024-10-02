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


    private final PersonalRepository personalRepository;

    public PersonalService(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    @Transactional
    public <S extends Personal> S save(S entity) {
        return personalRepository.save(entity);
    }


    public <S extends Personal> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public Optional<Personal> findById(Long id) {
        return personalRepository.findById(id);
    }


    public boolean existsById(Long id) {
        return personalRepository.existsById(id);
    }


    public Iterable<Personal> findAll() {
        return personalRepository.findAll();
    }


    public Iterable<Personal> findAllById(Iterable<Long> ids) {
        return personalRepository.findAllById(ids);
    }


    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Transactional
    public void deleteById(Long id) {
        personalRepository.deleteById(id);    }


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
        return personalRepository.findByorden(orden);
    }

}
