package com.sinfloo.crudSpringBoot.interfaceService;

import com.sinfloo.crudSpringBoot.modelo.Cancion;

import java.util.List;
import java.util.Optional;

public interface ICancionService {

    public List<Cancion> listar();
    public Optional<Cancion> listarId(int id);
    public int save(Cancion c);
    public void delete(int id);

}
