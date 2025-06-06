package vistas;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import vistas.TablaPanel;
import javax.swing.table.DefaultTableModel;


public class TablaPanel extends JScrollPane {

public TablaPanel() {

// Columnas de la tabla
String[] columnas = { "ID", "Nombre", "Edad" };

// Datos de la tabla
Object[][] datos = {
{ 1, "Ana", 20 },
{ 2, "Luis", 22 },
{ 3, "María", 19 }
};

DefaultTableModel base = new DefaultTableModel(datos, columnas);
JTable tabla = new JTable(base);

this.setViewportView(tabla);

}
 public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame ventana = new JFrame("Tabla Banner");
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setSize(400, 200);

    TablaPanel tablaBanner = new TablaPanel();
      ventana.add(tablaBanner);
      ventana.setVisible(true);
        });

}
}