package com.la.rh.service;

import com.la.rh.model.Empleado;
import com.la.rh.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpleadoService implements IEmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepositorio;
    @Override
    public List<Empleado> listarEMpleados() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Empleado findEmpleadoById(Integer idEmpleado) {
        Empleado empleado =empleadoRepositorio.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    @Override
    public void deleteEmpleado(Empleado empleado) {
       empleadoRepositorio.delete(empleado);
       System.out.println("Empleado eliminado con exito");
    }
}
