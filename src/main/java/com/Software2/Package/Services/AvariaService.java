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

    private final Averiarepository averiarepository;

    public AvariaService(Averiarepository averiarepository) {
        this.averiarepository = averiarepository;
    }

    @Transactional

    public <S extends Averia> S save(S entity) {

        return averiarepository.save(entity);
    }


    public <S extends Averia> Iterable<S> saveAll(Iterable<S> entities) {
        return averiarepository.saveAll(entities);
    }


    public Optional<Averia> findById(Long id) {
        return averiarepository.findById(id);
    }


    public boolean existsById(Long id) {
        return averiarepository.existsById(id);
    }


    public Iterable<Averia> findAll() {
        return averiarepository.findAll();
    }


    public Iterable<Averia> findAllById(Iterable<Long> ids) {
        return averiarepository.findAllById(ids);
    }


    @Transactional

    public void deleteById(Long id) {
        averiarepository.deleteById(id);
    }



}
