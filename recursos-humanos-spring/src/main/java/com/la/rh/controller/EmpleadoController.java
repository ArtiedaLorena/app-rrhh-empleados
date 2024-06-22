package com.la.rh.controller;

import com.la.rh.model.Empleado;
import com.la.rh.service.EmpleadoService;
import com.la.rh.service.IEmpleadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rh-app") //http://localhost:8080/rh-app/
@CrossOrigin(value = "http://localhost:3000") //Puerto de donde se reciben las peticiones
public class EmpleadoController {
    private static final Logger logger=
        LoggerFactory.getLogger(EmpleadoController.class);

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleados")//http://localhost:8080/rh-app/empleados
    public List<Empleado> obtenerEmpledo(){
        var empleados = empleadoService.listarEMpleados();
        empleados.forEach(empleado -> logger.info((empleado.toString())));
        return empleados;
    }
}
