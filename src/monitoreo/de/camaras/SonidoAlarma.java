/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoreo.de.camaras;

/**
 *
 * @author PROPIETARIO
 */
public class SonidoAlarma {
    
    private boolean activa;
    private String sonidoAlarma;

    public SonidoAlarma() {
        this.activa = false;
        this.sonidoAlarma = "sonido_de_alarma.mp3"; // Ruta al sonido de alarma
    }

    public void activar() {
        this.activa = true;
        // Lógica para reproducir el sonido de la alarma
    }

    public void desactivar() {
        this.activa = false;
        // Lógica para detener el sonido de la alarma
    }

    // Getters y setters
}
