/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Bache;
import com.Software2.Package.Model.Ciudadano;
import com.Software2.Package.Repository.BacheRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class BacheService {

    @Autowired
    private BacheRepository BacheRepository;

    @Transactional

    public <S extends Bache> S save(S entity) {
        return BacheRepository.save(entity);
    }


    public <S extends Bache> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }


    public Optional<Bache> findById(Long id) {
        return BacheRepository.findById(id);
    }


    public boolean existsById(Long id) {
        return BacheRepository.existsById(id);
    }


    public Iterable<Bache> findAll() {
        return BacheRepository.findAll();
    }


    public Iterable<Bache> findAllById(Iterable<Long> ids) {
        return BacheRepository.findAllById(ids);
    }


    public long count() {
        return 0;
    }

    @Transactional

    public void deleteById(Long id) {
        BacheRepository.deleteById(id);
    }


    public void delete(Bache entity) {
    }


    public void deleteAllById(Iterable<? extends Long> ids) {
    }

    public void deleteAll(Iterable<? extends Bache> entities) {
    }


    public void deleteAll() {
    }


    public List<Bache> findByciudadano(Ciudadano ciudadano) {
        return BacheRepository.findByciudadano(ciudadano);
    }

}
