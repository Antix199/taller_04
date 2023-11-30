package Guis;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class GuiInfoEquipo {
    private JPanel panel1;
    private JLabel nombre;
    private JLabel label;
    private JLabel bandera;
    private JFormattedTextField formattedTextField1;
    private JButton VERYEDITARFORMACIÓNButton;

    public GuiInfoEquipo() {
        bandera.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                String ruta = "src/Datos/aus.png";
                ManejoVentanas.mostrarBandera(ruta,bandera);
            }
        });
    }
}
