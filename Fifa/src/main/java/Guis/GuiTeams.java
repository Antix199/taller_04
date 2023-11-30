package Guis;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class GuiTeams extends JFrame {
    private JButton ausBoton;
    private JButton chiBoton;
    private JButton cmrBoton;
    private JButton gerBoton;
    private JPanel Equipos;

    public GuiTeams() {

        super("Equipos");
        setContentPane(Equipos);


        ausBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutaBandera = "src/main/java/Guis/Datos/aus.png";
                String rutaDatos = "src/main/java/Guis/Datos/aus.txt";
                ManejoVentanas.abrirVentanaInfo(rutaBandera, rutaDatos, "Australia",48);
            }
        });
        chiBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutaBandera = "src/main/java/Guis/Datos/chi.png";
                String rutaDatos = "src/main/java/Guis/Datos/chi.txt";
                ManejoVentanas.abrirVentanaInfo(rutaBandera, rutaDatos, "Chile",12);
            }
        });
        cmrBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutaBandera = "src/main/java/Guis/Datos/cmr.png";
                String rutaDatos = "src/main/java/Guis/Datos/cmr.txt";
                ManejoVentanas.abrirVentanaInfo(rutaBandera, rutaDatos, "Camerún",32);
            }
        });
        gerBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutaBandera = "src/main/java/Guis/Datos/ger.png";
                String rutaDatos = "src/main/java/Guis/Datos/ger.txt";
                ManejoVentanas.abrirVentanaInfo(rutaBandera, rutaDatos, "Alemania",7);
            }
        });

    }

}
