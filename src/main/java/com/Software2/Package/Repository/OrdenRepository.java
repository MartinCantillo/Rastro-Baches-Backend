/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Repository;

import com.Software2.Package.Model.Bache;
import com.Software2.Package.Model.Ciudadano;
import com.Software2.Package.Model.Orden;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface OrdenRepository  extends CrudRepository<Orden, Long>{
    //List<Bache> findByciudadano(Ciudadano ciudadano);
}
