package Guis;

import javax.swing.*;

public class ManejoVentanas {

    public static void abrirVentanaPrincipal() {
        X y = new y();
        y.setSize(400, 300);
        y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        y.setLocationRelativeTo(null);
        y.setVisible(true);
    }
    public static void mostrarBandera(String rutaImagen, JLabel labelBandera) {
        ImageIcon icon = new ImageIcon(rutaImagen);
        labelBandera.setIcon(icon);
    }
}

