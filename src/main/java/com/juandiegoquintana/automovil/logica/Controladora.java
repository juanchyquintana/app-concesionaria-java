package com.juandiegoquintana.automovil.logica;

import com.juandiegoquintana.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Automovil auto = new Automovil();

        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);

        controlPersistencia.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersistencia.traerAutos();
    }

    public void borrarAutomovil(int id) {
        controlPersistencia.borrarAutomovil(id);
    }

    public Automovil traerAuto(int id) {
        return controlPersistencia.traerAuto(id);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersistencia.modificarAuto(auto);
    }

}
