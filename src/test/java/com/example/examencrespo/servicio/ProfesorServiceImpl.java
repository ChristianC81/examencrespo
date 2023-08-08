/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examencrespo.servicio;

import com.example.examencrespo.entidades.Profesor;
import com.example.examencrespo.entidades.repositorios.ProfesorRepository;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

/**
 *
 * @author chris
 */
public class ProfesorServiceImpl implements ProfesorRepository{

    @Override
    public <S extends Profesor> S insert(S entity) {
      return null;
    }

    @Override
    public <S extends Profesor> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Profesor> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Profesor> List<S> findAll(Example<S> example, Sort sort) {
      return null;
    }

    @Override
    public <S extends Profesor> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<Profesor> findAll() {
        return null;
    }

    @Override
    public List<Profesor> findAllById(Iterable<Object> ids) {
         return null;
    }

    @Override
    public <S extends Profesor> S save(S entity) {
         return null;
    }

    @Override
    public Optional<Profesor> findById(Object id) {
         return null;
    }

    @Override
    public boolean existsById(Object id) {
         return true;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Object id) {
         
    }

    @Override
    public void delete(Profesor entity) {
         
    }

    @Override
    public void deleteAllById(Iterable<? extends Object> ids) {
        
    }

    @Override
    public void deleteAll(Iterable<? extends Profesor> entities) {
        
    }

    @Override
    public void deleteAll() {
       
    }

    @Override
    public List<Profesor> findAll(Sort sort) {
         return null;
    }

    @Override
    public Page<Profesor> findAll(Pageable pageable) {
         return null;
    }

    @Override
    public <S extends Profesor> Optional<S> findOne(Example<S> example) {
         return null;
    }

    @Override
    public <S extends Profesor> Page<S> findAll(Example<S> example, Pageable pageable) {
         return null;
    }

    @Override
    public <S extends Profesor> long count(Example<S> example) {
         return 0;
    }

    @Override
    public <S extends Profesor> boolean exists(Example<S> example) {
         return true;
    }

    @Override
    public <S extends Profesor, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
         return null;
    }
    
}
