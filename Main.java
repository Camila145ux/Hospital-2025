import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import vistas.LoginPanel;

public class Main {
    public static void main(String[] args) {

        // Ventana
        JFrame miVentana = new JFrame();    // Crea una nueva ventana vacía
        miVentana.setTitle("Hospital SCL"); // Título que aparece en la parte superior
        miVentana.setSize(1000, 800);       // Establece el tamaño de la ventana (ancho x alto)
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        // Panel Banner
        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
        miVentana.add(panelBanner);
        miVentana.add(panelBanner,BorderLayout.WEST);

        // Panel Login
        LoginPanel panelLogin = new LoginPanel();
        miVentana.add(panelLogin.getPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);         // Muestra la ventana en pantalla
    }
}