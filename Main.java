import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import vistas.LoginPanel;
import vistas.bannerPanel;

public class Main {
    public static void main(String[] args) {

        // Ventana
        JFrame miVentana = new JFrame();    // Crea una nueva ventana vacía
        miVentana.setTitle("Hospital SCL"); // Título que aparece en la parte superior
        miVentana.setSize(1000, 800);       // Establece el tamaño de la ventana (ancho x alto)
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        // Panel Login
        LoginPanel panelLogin = new LoginPanel();
        miVentana.add(panelLogin.getPanel(), BorderLayout.CENTER);

        //panel banner
        bannerPanel bannerPanel = new bannerPanel();
        miVentana.add(bannerPanel.getBanner(), BorderLayout.WEST);

        miVentana.setVisible(true);         // Muestra la ventana en pantalla
    }
}