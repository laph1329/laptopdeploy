package com.example.demo.controllers;

import com.example.demo.models.Laptop;
import com.example.demo.repository.LaptopRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( "/laptop")
public class LaptopController {

    private final Logger log= LoggerFactory.getLogger(LaptopController.class);

    @Autowired
    private LaptopRepository laptopRepository;

    @GetMapping("/all")
    public List<Laptop>findAll(){
        return (List<Laptop>) laptopRepository.findAll();
    }

    @PostMapping("/save")
    @ApiOperation("esta es una api para guardar una laptop con sus atributos, dos campos")
    public ResponseEntity<?> create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        if(laptop.getId()!=null){
            log.warn("se intentó crear un usuario con id");
            System.out.println("se intentó crear un usuario con id");
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(laptopRepository.save(laptop));

    }

    @GetMapping("/{id}")
    public ResponseEntity<?>findOneById(@ApiParam("#clave primaria de tipo Long") @PathVariable Long id){
        Optional<Laptop> o= laptopRepository.findById(id);
        if(o.isPresent()){
            return ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Laptop laptop){
        if(laptop.getId()==null){
            log.warn("no se envio un id");
            return ResponseEntity.badRequest().build();
        }
        if(!laptopRepository.existsById(laptop.getId())){
            log.warn("no existe el usuario con ese id");
            return ResponseEntity.notFound().build();
        }

        Optional<Laptop> laptop1=laptopRepository.findById(laptop.getId());
        if(laptop1.isPresent()){
            Laptop laptopdb=laptop1.get();
            laptopdb.setNombre(laptop.getNombre());
            laptopdb.setPrecio(laptop.getPrecio());
            return ResponseEntity.ok(laptopRepository.save(laptopdb));
        }
        return ResponseEntity.noContent().build();
    }

    @ApiIgnore//ignorar este metodo en al documentacion, pero sigue funcionando
    @DeleteMapping("/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){

        if(!laptopRepository.existsById(id)){
            log.warn("no existe el usuario con ese id");
            return ResponseEntity.notFound().build();
        }

        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @ApiIgnore
    @DeleteMapping("/deleteall")
    public ResponseEntity<?>deleteAll(){
        log.info("Se borraron todas las laptops de la db");
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
