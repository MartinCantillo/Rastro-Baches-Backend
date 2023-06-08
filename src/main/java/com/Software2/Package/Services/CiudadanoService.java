/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Ciudadano;
import com.Software2.Package.Repository.CiudadanoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadanoService implements CiudadanoRepository {

    @Autowired
    private CiudadanoRepository CiudadanoRepository;

    @Override
    public <S extends Ciudadano> S save(S entity) {
        return CiudadanoRepository.save(entity);
    }

    @Override
    public <S extends Ciudadano> Iterable<S> saveAll(Iterable<S> entities) {
        return CiudadanoRepository.saveAll(entities);
    }

    @Override
    public Optional<Ciudadano> findById(Long id) {
        return CiudadanoRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return CiudadanoRepository.existsById(id);
    }

    @Override
    public Iterable<Ciudadano> findAll() {
        return CiudadanoRepository.findAll();
    }

    @Override
    public Iterable<Ciudadano> findAllById(Iterable<Long> ids) {
        return CiudadanoRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        CiudadanoRepository.deleteById(id);
    }

    @Override
    public void delete(Ciudadano entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAll(Iterable<? extends Ciudadano> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
