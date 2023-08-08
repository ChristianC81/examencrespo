/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examencrespo.entidades.repositorios;

import com.example.examencrespo.entidades.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author chris
 */
public interface ProfesorRepository extends MongoRepository<Profesor, Object>{
    
}
