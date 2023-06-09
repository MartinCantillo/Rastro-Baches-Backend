/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Funcionario;
import com.Software2.Package.Repository.FuncionarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService implements FuncionarioRepository {

    @Autowired
    private FuncionarioRepository FuncionarioRepository;

    @Transactional
    @Override
    public <S extends Funcionario> S save(S entity) {
        return FuncionarioRepository.save(entity);
    }

    @Override
    public <S extends Funcionario> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Funcionario> findById(Long id) {
        return FuncionarioRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return FuncionarioRepository.existsById(id);
    }

    @Override
    public Iterable<Funcionario> findAll() {
        return FuncionarioRepository.findAll();
    }

    @Override
    public Iterable<Funcionario> findAllById(Iterable<Long> ids) {
        return FuncionarioRepository.findAllById(ids);
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        FuncionarioRepository.deleteById(id);
    }

    @Override
    public void delete(Funcionario entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAll(Iterable<? extends Funcionario> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
