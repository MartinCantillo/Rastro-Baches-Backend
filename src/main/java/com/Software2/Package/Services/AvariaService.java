/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Averia;
import com.Software2.Package.Repository.Averiarepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvariaService  {

    @Autowired
    private Averiarepository Averiarepository;

    @Transactional

    public <S extends Averia> S save(S entity) {

        return Averiarepository.save(entity);
    }


    public <S extends Averia> Iterable<S> saveAll(Iterable<S> entities) {
        return Averiarepository.saveAll(entities);
    }


    public Optional<Averia> findById(Long id) {
        return Averiarepository.findById(id);
    }


    public boolean existsById(Long id) {
        return Averiarepository.existsById(id);
    }


    public Iterable<Averia> findAll() {
        return Averiarepository.findAll();
    }


    public Iterable<Averia> findAllById(Iterable<Long> ids) {
        return Averiarepository.findAllById(ids);
    }


    @Transactional

    public void deleteById(Long id) {
        Averiarepository.deleteById(id);
    }



}
