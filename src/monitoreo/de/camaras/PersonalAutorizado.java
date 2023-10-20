/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PROPIETARIO
 */
public class PersonalAutorizado {
    
    private String nombre;
    private String cargo;
    private List<String> permisos;

    public PersonalAutorizado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.permisos = new ArrayList<>();
    }

    // Método para otorgar permisos de acceso
    public void otorgarPermiso(String permiso) {
        permisos.add(permiso);
    }

    // Método para revocar permisos de acceso
    public void revocarPermiso(String permiso) {
        permisos.remove(permiso);
    }

    // Método para verificar si el personal autorizado tiene un permiso específico
    public boolean tienePermiso(String permiso) {
        return permisos.contains(permiso);
    }

    // Getters y setters para otros atributos
    
}
