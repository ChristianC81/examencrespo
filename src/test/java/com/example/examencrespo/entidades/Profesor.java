/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examencrespo.entidades;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author chris
 */

@Data
@Document("Profesor")
public class Profesor {
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;
    //Un profesor tiens un ciclo
    private Ciclo ciclo;    
    //Un profesor tiene una asignatura
    private Asignatura asignatura;
}
