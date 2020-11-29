/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g3m3e6.reto5.repositorios;

import com.g3m3e6.reto5.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository

public interface UsuarioRepositorio extends JpaRepository<Usuario,String>{
    
}
