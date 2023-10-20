/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monitoreo.de.camaras;

import java.util.List;

/**
 *
 * @author PROPIETARIO
 */
public class MonitoreoDeCamaras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario("usuario1", "contraseña123");
        Alarma alarma = new Alarma();
        ConexionRed conexionRed = new ConexionRed("192.168.1.100");
        ConexionBluetooh conexionBluetooth = new ConexionBluetooh("00:12:34:56:78:90");

        // Ejemplos de uso
        if (usuario.autenticar("contraseña123")) {
            alarma.activar();
            conexionRed.conectar();
            conexionBluetooth.conectar();
        } else {
            System.out.println("Usuario no autenticado");
        
         SistemaMonitoreoCamara Sistemamonitoreo = new SistemaMonitoreoCamara();
        
        // Agregar cámaras al sistema
        Sistemamonitoreo.addCamera(new Camara("cam001", "Entrada Principal"));
        Sistemamonitoreo.addCamera(new Camara("cam002", "Pasillo Interior"));
        
        // Acceder a la lista de cámaras
        List<Camara> cameras = Sistemamonitoreo.getCameras();
        
        for (Camara camera : cameras) {
            System.out.println("Cámara ID: " + camera.getId());
            System.out.println("Ubicación: " + camera.getLocation());
        }
        
        PersonalAutorizado usuario1 = new PersonalAutorizado("Usuario 1", "Administrador");
        usuario1.otorgarPermiso("Monitoreo en tiempo real");
        usuario1.otorgarPermiso("Control de cámara");
        
        PersonalAutorizado usuario2 = new PersonalAutorizado("Usuario 2", "Operador");
        usuario2.otorgarPermiso("Monitoreo en tiempo real");
        
        // Verificar si un usuario tiene un permiso específico
        System.out.println("¿Usuario 1 tiene permiso para Control de cámara? " + usuario1.tienePermiso("Control de cámara"));
        System.out.println("¿Usuario 2 tiene permiso para Control de cámara? " + usuario2.tienePermiso("Control de cámara"));
        
        // Ver una imagen de una cámara específica
        String cameraIdToView = "cam001";
        byte[] image = Sistemamonitoreo.viewCameraImage(cameraIdToView);
        if (image != null) {
            System.out.println("Vista previa de la cámara " + cameraIdToView);
            System.out.println(new String(image));
        } else {
            System.out.println("Cámara no encontrada");
        }
    }
}

    private static class Alarma {

        public Alarma() {
            
        }

        private void activar() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}

      

    

