package com.sinfloo.crudSpringBoot.servicio;

import com.sinfloo.crudSpringBoot.interfaceService.ICancionService;
import com.sinfloo.crudSpringBoot.interfaces.ICancion;
import com.sinfloo.crudSpringBoot.modelo.Cancion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CancionService implements ICancionService {

    @Autowired
    private ICancion data;

    @Override
    public List<Cancion> listar() {
        return (List<Cancion>) data.findAll();
    }

    @Override
    public Optional<Cancion> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Cancion c) {
        int respuesta = 0;
        Cancion cancion = data.save(c);
        if (!cancion.equals(null)){
            respuesta = 1;
        }
        return respuesta;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
