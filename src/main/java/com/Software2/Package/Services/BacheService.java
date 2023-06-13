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
public class BacheService implements BacheRepository {

    @Autowired
    private BacheRepository BacheRepository;

    @Transactional
    @Override
    public <S extends Bache> S save(S entity) {
        return BacheRepository.save(entity);
    }

    @Override
    public <S extends Bache> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Bache> findById(Long id) {
        return BacheRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return BacheRepository.existsById(id);
    }

    @Override
    public Iterable<Bache> findAll() {
        return BacheRepository.findAll();
    }

    @Override
    public Iterable<Bache> findAllById(Iterable<Long> ids) {
        return BacheRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return 0;
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        BacheRepository.deleteById(id);
    }

    @Override
    public void delete(Bache entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
    }
    @Override
    public void deleteAll(Iterable<? extends Bache> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<Bache> findByciudadano(Ciudadano ciudadano) {
        return BacheRepository.findByciudadano(ciudadano);
    }

}
