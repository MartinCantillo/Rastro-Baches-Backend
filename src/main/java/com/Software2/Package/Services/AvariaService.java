/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Averia;
import com.Software2.Package.Repository.Averiarepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvariaService implements Averiarepository {
    
    @Autowired
     private Averiarepository Averiarepository;

    @Override
    public <S extends Averia> S save(S entity) {
        
        return Averiarepository.save(entity);
    }
    
    @Override
    public <S extends Averia> Iterable<S> saveAll(Iterable<S> entities) {
        return Averiarepository.saveAll(entities);
    }
    
    @Override
    public Optional<Averia> findById(Long id) {
        return Averiarepository.findById(id);
    }
    
    @Override
    public boolean existsById(Long id) {
        return Averiarepository.existsById(id);
    }
    
    @Override
    public Iterable<Averia> findAll() {
        return Averiarepository.findAll();
    }
    
    @Override
    public Iterable<Averia> findAllById(Iterable<Long> ids) {
        return Averiarepository.findAllById(ids);
    }
    
    @Override
    public long count() {
        return 0;
    }
    
    @Override
    public void deleteById(Long id) {
        Averiarepository.deleteById(id);
    }
    
    @Override
    public void delete(Averia entity) {
    }
    
    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
    }
    
    @Override
    public void deleteAll(Iterable<? extends Averia> entities) {
    }
    
    @Override
    public void deleteAll() {
    }
    
}
