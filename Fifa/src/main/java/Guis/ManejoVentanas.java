package Guis;

import javax.swing.*;
import java.awt.*;

public class ManejoVentanas {

    public static void abrirVentanaPrincipal() {
        GuiTeams guiTeams = new GuiTeams();
        guiTeams.setSize(400, 300);
        guiTeams.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiTeams.setLocationRelativeTo(null);
        guiTeams.setVisible(true);
    }

    public static void abrirVentanaInfo(String rutaBandera,String rutaDatos, String pais, int rank) {

        GuiInfoEquipo guiInfoEquipo= new GuiInfoEquipo(rutaBandera,pais,rank);
        guiInfoEquipo.setSize(400, 300);
        guiInfoEquipo.setLocationRelativeTo(null);
        guiInfoEquipo.setVisible(true);
    }


}

