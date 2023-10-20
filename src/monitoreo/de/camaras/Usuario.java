/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

/**
 *
 * @author PROPIETARIO
 */
public class Usuario {
    
    private String nombre;
    private String contraseña;

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public boolean autenticar(String contraseñaIngresada) {
        return this.contraseña.equals(contraseñaIngresada);
    }

    // Getters y setters
}
    

