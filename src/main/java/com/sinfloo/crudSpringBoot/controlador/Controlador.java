package com.sinfloo.crudSpringBoot.controlador;

import com.sinfloo.crudSpringBoot.interfaceService.ICancionService;
import com.sinfloo.crudSpringBoot.modelo.Cancion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private ICancionService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Cancion> canciones = service.listar();
        model.addAttribute("canciones", canciones);
        return "tabla";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("cancion", new Cancion());
        return "formulario";
    }

    @PostMapping("/save")
    public String save(@Valid Cancion c, Model model){
        service.save(c);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Cancion> cancion = service.listarId(id);
        model.addAttribute("cancion", cancion);
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
