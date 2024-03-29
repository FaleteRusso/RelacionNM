package com.corenetworks.RelacionNM.servicio;

import com.corenetworks.RelacionNM.modelo.Conductor;
import com.corenetworks.RelacionNM.repository.IConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConductorServicio implements IConductorServicio{
    @Autowired
    private IConductorRepo conductorRepo;
    @Override
    public Conductor insert(Conductor c) {
        return conductorRepo.save(c);
    }

    @Override
    public Conductor modif(Conductor c) {
        return conductorRepo.save(c);
    }

    @Override
    public void eliminar(String dni) {
        conductorRepo.deleteById(dni);

    }

    @Override
    public List<Conductor> obtenerTodos() {
        return conductorRepo.findAll();
    }

    @Override
    public Conductor obtenerUno(String dni) {
        return conductorRepo.findById(dni).orElse(new Conductor());
    }
}
