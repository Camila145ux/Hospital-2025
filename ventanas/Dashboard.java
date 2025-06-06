package ventanas;

import javax.swing.JFrame;
import vistas.TablaPanel; 

public class Dashboard extends JFrame {
    
    public Dashboard(){
        
        // Ventana
        this.setTitle("Dashware");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // Crear y agregar la tabla
        TablaPanel tabla = new TablaPanel();
        tabla.setBounds(0, 0, 1000, 800); 
        this.add(tabla); 

        this.setVisible(true);
    }
    public JFrame getDasFrame(){
        return this;
    }
}