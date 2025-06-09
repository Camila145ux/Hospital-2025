package ventanas;

import java.awt.BorderLayout;

import javax.swing.JFrame;

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

       
        this.setVisible(true);
    }
    public JFrame getDasFrame(){
        return this;
    }
}