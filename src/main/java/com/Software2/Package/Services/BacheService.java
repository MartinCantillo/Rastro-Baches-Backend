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

    private final BacheRepository bacheRepository;

    public BacheService(BacheRepository bacheRepository) {
        this.bacheRepository = bacheRepository;
    }

    @Transactional

    public <S extends Bache> S save(S entity) {
        return bacheRepository.save(entity);
    }


    public <S extends Bache> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }


    public Optional<Bache> findById(Long id) {
        return bacheRepository.findById(id);
    }


    public boolean existsById(Long id) {
        return bacheRepository.existsById(id);
    }


    public Iterable<Bache> findAll() {
        return bacheRepository.findAll();
    }


    public Iterable<Bache> findAllById(Iterable<Long> ids) {
        return bacheRepository.findAllById(ids);
    }


    public long count() {
        return 0;
    }

    @Transactional

    public void deleteById(Long id) {
        bacheRepository.deleteById(id);
    }



    public List<Bache> findByciudadano(Ciudadano ciudadano) {
        return bacheRepository.findByciudadano(ciudadano);
    }

}
