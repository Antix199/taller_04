package Guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class GuiInfoEquipo extends JFrame {
    private JPanel infoEquipos;
    private JLabel nombre;
    private JLabel bandera;
    private JButton VERYEDITARFORMACIÓNButton;
    private JLabel ranking;


    public GuiInfoEquipo(String rutaImagen, String pais, int rank) {
        super("InfoEquipos");
        setContentPane(infoEquipos);
        mostrarBandera(rutaImagen, bandera);
        nombrarPais(pais,nombre);
        setRanking(rank,ranking);
    }

    public static void mostrarBandera(String rutaImagen, JLabel bandera) {
        ImageIcon imagen = new ImageIcon(new ImageIcon(rutaImagen).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        bandera.setIcon(imagen);
    }

    public static void nombrarPais(String pais, JLabel nombre){
        nombre.setText(pais);
    }

    public static void setRanking(int rank, JLabel ranking){
        String ranki = String.valueOf(rank);
        ranking.setText(ranki);
    }
}
