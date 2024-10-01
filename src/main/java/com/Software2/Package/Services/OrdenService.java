/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Orden;
import com.Software2.Package.Repository.OrdenRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenService   {

    @Autowired
    private OrdenRepository OrdenRepository;

    @Transactional

    public <S extends Orden> S save(S entity) {
        return OrdenRepository.save(entity);
    }




    public Optional<Orden> findById(Long id) {
        return OrdenRepository.findById(id);
    }


    public boolean existsById(Long id) {
        return OrdenRepository.existsById(id);
    }


    public Iterable<Orden> findAll() {
        return OrdenRepository.findAll();
    }


    public Iterable<Orden> findAllById(Iterable<Long> ids) {
        return OrdenRepository.findAllById(ids);
    }


    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Transactional

    public void deleteById(Long id) {
        OrdenRepository.deleteById(id);
    }


    public void delete(Orden entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAll(Iterable<? extends Orden> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
