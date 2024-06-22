package com.la.rh.service;

import com.la.rh.model.Empleado;

import java.util.List;

public interface IEmpleadoService {
    public List<Empleado> listarEMpleados();
    public Empleado findEmpleadoById(Integer idEmpleado);
    public Empleado saveEmpleado(Empleado empleado);
    public void deleteEmpleado(Empleado empleado);
}
