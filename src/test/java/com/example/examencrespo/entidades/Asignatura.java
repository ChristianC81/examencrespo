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
@Document("Asignatura")
public class Asignatura {

    private String nombre;
    private int n_horas;
    private int n_horas_practicas;
    private int n_horas_autonomas;

}
