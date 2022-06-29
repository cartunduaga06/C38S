package com.example.C38S.service;

import com.example.C38S.model.Partido;
import com.example.C38S.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {

    @Autowired
    private PartidoRepository partidoRepository;


    public Partido guardar(Partido p) {
        return partidoRepository.save(p);
    }

    public Partido buscar(String id) {
        return partidoRepository.findById(id).get();
    }

    public List<Partido> buscarTodos() {
        return partidoRepository.findAll();
    }


}
