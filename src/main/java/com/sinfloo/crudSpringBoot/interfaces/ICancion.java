package com.sinfloo.crudSpringBoot.interfaces;

import com.sinfloo.crudSpringBoot.modelo.Cancion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICancion extends CrudRepository<Cancion, Integer> {

}
