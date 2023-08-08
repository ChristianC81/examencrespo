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
@Document("Carrera")
public class Carrera {
    private String nombre;
    private String descripcion;

    //Una carrera tiene un periodo
    private Periodo periodo;
}
