package paneles;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.*;

//tablas
import farmacia.*;

public class MenuLateralPanel extends JPanel{
    public MenuLateralPanel(){
        this.setPreferredSize(new Dimension(400, 1000));
        this.setOpaque(true);
        this.setBackground(Color.RED);
        this.setLayout(null);

     // Botón Historial
     JButton boton1 = new JButton("Historial"); //creacion del boton (JButton)
     boton1.setBounds(80, 30, 140, 30);  // medidas (posiciona el boton en el menulateral (con x, y))
     this.add(boton1); //agrega el boton al panel.

    // Botón Pacientes
     JButton boton2 = new JButton("Pacientes");
     boton2.setBounds(80, 80, 140, 30); 
     this.add(boton2);

    //Botòn Habitaciòn
     JButton boton3 = new JButton("Habitacion");
     boton3.setBounds(80, 130, 140, 30);  
     this.add(boton3);

    //Botón Doc
     JButton boton4 = new JButton("Doctor");
     boton4.setBounds(80, 180, 140, 30);  
     this.add(boton4);

    //Botón Farmacia
     JButton boton5 = new JButton("Farmacia");
     boton5.setBounds(80, 230, 140, 30); 
     boton5.addActionListener(e -> TablaFarmacia());
     this.add(boton5);

    
     //Botón Diagnostico
     JButton boton6 = new JButton("Diagnostico");
     boton6.setBounds(80, 280, 140, 30);  
     this.add(boton6);
 
    }
// // Método para abrir la ventana de pacientes
 private void ventanapacientes(String titulo) {
    JFrame ventanapacientes = new JFrame(titulo);
    ventanapacientes.setSize(800, 1000);
    ventanapacientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    ventanapacientes.setVisible(true);
}


//mostrar la tabla farmacia
private void TablaFarmacia() {
    // Crear ventana
    JFrame ventanaFarmacia = new JFrame("Tabla de Farmacia");
    ventanaFarmacia.setSize(600, 400);
    ventanaFarmacia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Obtener datos desde TablaFarmacia
    TablaFarmacia tabla = new TablaFarmacia();
    Object[][] datos = tabla.getDatosFarmacia();

    // Encabezados de la tabla
    String[] columnas = {"ID", "Nombre Medicamento", "Presentación", "Dosis", "Laboratorio"};

    // Crear JTable
    JTable tablaFarmacia = new JTable(datos, columnas);
    JScrollPane scroll = new JScrollPane(tablaFarmacia);

    // Agregar tabla al frame
    ventanaFarmacia.add(scroll);
    ventanaFarmacia.setVisible(true);
}


    
    public JPanel getPanel(){
        return this;
    }
    
}
