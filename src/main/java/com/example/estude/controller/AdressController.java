package com.example.estude.controller;

import java.util.List;

import com.example.estude.model.Adress;
import com.example.estude.repository.IAdressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adress")
public class AdressController {

    @Autowired
    private IAdressRepository adressRepository;

    @GetMapping
    public List<Adress> listar(){
        return adressRepository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Adress adress){
        adressRepository.save(adress);
    }

    @PutMapping
    public void alterar(@RequestBody Adress adress){
        if(adress.getIdAdress()>0)
            adressRepository.save(adress);
    }

    @DeleteMapping
    public void excluir(@RequestBody Adress adress){
        adressRepository.delete(adress);
    }







}
