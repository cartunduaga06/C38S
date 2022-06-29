package com.example.C38S.controller;

import com.example.C38S.model.Partido;
import com.example.C38S.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    @Autowired
    private PartidoService partidoService;

    @RequestMapping("/listar")
    private List<Partido> listar(){
        return partidoService.buscarTodos();
    }

    @RequestMapping("/nuevo")
    private Partido crear(@RequestBody Partido partido){
        return partidoService.guardar(partido);
    }

}
