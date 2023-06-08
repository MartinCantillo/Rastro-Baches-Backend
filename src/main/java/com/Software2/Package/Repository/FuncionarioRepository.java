/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Software2.Package.Repository;

import com.Software2.Package.Model.Funcionario;
import org.springframework.data.repository.CrudRepository;


public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
    
}
