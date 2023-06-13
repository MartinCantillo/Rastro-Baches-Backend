/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Software2.Package.Repository;

import com.Software2.Package.Model.Bache;
import com.Software2.Package.Model.Ciudadano;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface BacheRepository extends CrudRepository<Bache, Long> {

    List<Bache> findByciudadano(Ciudadano ciudadano);
}
