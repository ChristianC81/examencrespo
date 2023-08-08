/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examencrespo.controlador;

import com.example.examencrespo.entidades.Profesor;
import com.example.examencrespo.servicio.ProfesorServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chris
 */
@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorServiceImpl studentService;

    @GetMapping(value = "/")
    public List<Profesor> getAllProfesors() {
        return studentService.findAll();
    }
    
}
