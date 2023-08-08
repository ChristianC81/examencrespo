/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examencrespo.entidades;

import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author chris
 */
@Data
@Document("Ciclo")
public class Ciclo {
    private String nombre;
    private String descripcion;
    
    //En un clclo hay una carrera
    private List <Carrera> carreras;
}
