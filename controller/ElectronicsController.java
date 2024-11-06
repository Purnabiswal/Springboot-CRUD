package com.example.Electronics.controller;

import com.example.Electronics.entity.Electronics;
import com.example.Electronics.repository.ElectronicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElectronicsController {

    @Autowired
    ElectronicsRepository repo;

    //get all the products
    //localhost:8080/electronics
    @GetMapping("/electronics")
    public List<Electronics> getAllElectronics(){
        List<Electronics> electronics=repo.findAll();
        return electronics;
    }

    //get product by id
    //localhost:8080/electronics/1
    @GetMapping("/electronics/{id}")
    public Electronics getElectronic(@PathVariable int id){
        return repo.findById(id).get();
    }

    //Add electronic product
    @PostMapping("/electronic/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createElectronic(@RequestBody Electronics electronic){
        repo.save(electronic);
    }

    //Delete electronic product
    @DeleteMapping("/electronic/delete/{id}")
    public void deleteElectronic(@PathVariable int id){
        repo.deleteById(id);
    }


    //Update electronic product
    @PutMapping("electronic/update/{id}")
    public Electronics updateElectronic(@PathVariable int id){
        Electronics electronic=repo.findById(id).get();
        electronic.setProductName("Keyboard");
        electronic.setProductValue("1000");
        repo.save(electronic);
        return electronic;
    }



}
