/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Software2.Package.Repository;

import com.Software2.Package.Model.Bache;
import com.Software2.Package.Model.Orden;
import com.Software2.Package.Model.Personal;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends CrudRepository<Personal, Long> {

    List<Personal> findByorden(Orden orden);
}
