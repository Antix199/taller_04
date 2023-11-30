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
    private JLabel banderaAus;
    private JLabel banderaChi;
    private JLabel banderaCmr;
    private JLabel banderaGer;
    private JPanel Equipos;

    public GuiTeams() {

        super("Equipos");
        setContentPane(Equipos);

        ausBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        chiBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cmrBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        gerBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

}
