package paneles;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.*;

public class MenuLateralPanel extends JPanel{
    public MenuLateralPanel(){
        this.setPreferredSize(new Dimension(400, 1000));
        this.setOpaque(true);
        this.setBackground(Color.RED);
        this.setLayout(null);

    


     // Botón Historial
     JButton boton1 = new JButton("Historial"); //creacion del boton (JButton)
     boton1.setBounds(80, 30, 140, 30);  // medidas (posiciona el boton en el menulateral (con x, y))
     boton1.addActionListener(new ActionListener() {  //pone el boton activo (cuando den click haga algo)
         @Override  //sobreescribir un metodo existente en la clase padre. (como el permiso para que este reemplazando la acción original por una personalizada)
         public void actionPerformed(ActionEvent e) { // el metodo que se ejecuta cuando haces click alboton
             ventanahistorial("Página Historial"); // Abre nueva ventana al hacer clic
         }
     });
     this.add(boton1); //agrega el boton al panel.

    // Botón Pacientes
     JButton boton2 = new JButton("Pacientes");
     boton2.setBounds(80, 80, 140, 30);  // posicionarlo debajo del botón anterior (con x,y)
     boton2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             ventanapacientes("Página Pacientes");
         }
     });
     this.add(boton2);
 }


 // VENTANAS DE LOS BOTONES
 // Método para abrir la ventana del historial
 private void ventanahistorial(String titulo) { //abrir la ventana
     JFrame ventanaHistorial = new JFrame(titulo); //creacion de la ventana
     ventanaHistorial.setSize(800, 1000); //medidas
     ventanaHistorial.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //cerrar solo esta ventana no todo el programa.
     ventanaHistorial.setVisible(true); //mostrar la ventana
 }


// // Método para abrir la ventana de pacientes
 private void ventanapacientes(String titulo) {
    JFrame ventanapacientes = new JFrame(titulo);
    ventanapacientes.setSize(800, 1000);
    ventanapacientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    ventanapacientes.setVisible(true);
}


    
    public JPanel getPanel(){
        return this;
    }
    
}
