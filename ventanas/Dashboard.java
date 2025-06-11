package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import paneles.MenuLateralPanel;
import paneles.TablaPanel; 

public class Dashboard extends JFrame {
    
    public Dashboard(){

        // Ventana
        this.setTitle("Dashware");
        this.setSize(1600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(new MenuLateralPanel().getPanel(), BorderLayout.WEST);
        TablaPanel tablaPanel = new TablaPanel();
        add(tablaPanel);

        //Header
        JPanel headerJPanel = new JPanel(null);   //posicion "fija"
        headerJPanel.setPreferredSize(new Dimension(1000, 60)); //medidas
        headerJPanel.setBackground(Color.WHITE);  //color de fondo del header 

        //Logo
        JLabel logo = new JLabel("🧑‍🦼‍➡️");  //emoji (como texto)
        logo.setBounds(20, 10, 40, 40); //posicion y tamanno del emoji
        headerJPanel.add(logo); //agregarlo al header 

        //titulo + logo
        JLabel titulo = new JLabel("Hospital"); //nombre o titulo
        titulo.setBounds(70, 15, 200, 30); //medidas del titulo
        headerJPanel.add(titulo); //agregarlo al header

        //nombre
        JLabel user = new JLabel("User SCL"); //nombre o titulo
        user.setBounds(1000, 15, 900, 30); //medidas
        user.setHorizontalAlignment(SwingConstants.RIGHT); //hace que el texto dentro del header se alinee a la derecha sin cambiar el JLabel
        headerJPanel.add(user);  //agregarlo al header

        this.add(headerJPanel, BorderLayout.NORTH); //posicionar el header(llamando por "this") en la parte de arriba de todo (NORTH)
       
        this.setVisible(true);
    }
    public JFrame getDasFrame(){
        return this;
    }
}