/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Services;

import com.Software2.Package.Model.Bache;
import com.Software2.Package.Model.Funcionario;
import com.Software2.Package.Model.User;
import com.Software2.Package.Repository.FuncionarioRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Transactional

    public <S extends Funcionario> S save(S entity) {
        return funcionarioRepository.save(entity);
    }


    public <S extends Funcionario> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public Optional<Funcionario> findById(Long id) {
        return funcionarioRepository.findById(id);
    }


    public boolean existsById(Long id) {
        return funcionarioRepository.existsById(id);
    }


    public Iterable<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }


    public Iterable<Funcionario> findAllById(Iterable<Long> ids) {
        return funcionarioRepository.findAllById(ids);
    }


    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Transactional

    public void deleteById(Long id) {
        funcionarioRepository.deleteById(id);
    }


    public void delete(Funcionario entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    public Optional<Funcionario> findByuser(User user) {
        return funcionarioRepository.findByuser(user);
    }
}
