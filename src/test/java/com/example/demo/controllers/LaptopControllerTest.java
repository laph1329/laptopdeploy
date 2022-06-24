package com.example.demo.controllers;

import com.example.demo.models.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;


import java.util.Arrays;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {
//
//    private TestRestTemplate testRestTemplate;
//
//    @Autowired
//    private RestTemplateBuilder restTemplateBuilder;
//
//    @LocalServerPort
//    private int port;
//
//    @BeforeEach/*se ejecuta una vez, antez detodo*/
//    void setUp() {
//        restTemplateBuilder=restTemplateBuilder.rootUri("http://localhost:"+port);
//        testRestTemplate= new TestRestTemplate(restTemplateBuilder);
//    }
//    @DisplayName("comprobar metodo dentro del controlador hello")
//    @Test
//    void hello(){
//        ResponseEntity<String> response= testRestTemplate.getForEntity("/hola",String.class);
//        response.getStatusCode();
//        assertEquals(HttpStatus.OK,response.getStatusCode());
//        assertEquals(200,response.getStatusCode().value());
//        assertEquals("hola desde BootCamp",response.getBody());
//    }
//
//    @Test
//    void findAll() {
//        ResponseEntity<Laptop[]> response=testRestTemplate.getForEntity("/laptop/all", Laptop[].class);
//        assertEquals(HttpStatus.OK,response.getStatusCode());
//        assertEquals(200,response.getStatusCode().value());
//        List<Laptop> laptops=Arrays.asList(response.getBody());
//        System.out.println(laptops.size());
//        //assertEquals();
//    }
//
//    @Test
//    void save() {
//        HttpHeaders headers=new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        String json= """
//                {
//                    "nombre":"lenovo 2023",
//                    "precio":3500
//                }
//                """;
//        HttpEntity<String> request= new HttpEntity<>(json,headers);
//       ResponseEntity<Laptop> response= testRestTemplate.exchange("/laptop/save",HttpMethod.POST,request,Laptop.class);
//        Laptop result =response.getBody();
//        assertEquals("lenovo 2023",result.getNombre());
//        assertEquals(3500,result.getPrecio());
//    }
//
//    @Test
//    void buscarPorId() {
//        ResponseEntity<Laptop> response= testRestTemplate.getForEntity("/laptop/1",Laptop.class);
//        response.getStatusCode();
//        assertEquals(HttpStatus.OK,response.getStatusCode());
//
//    }
}