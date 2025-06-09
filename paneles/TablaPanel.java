package paneles;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import data.Pacientes;

public class TablaPanel extends JScrollPane {

    public TablaPanel() {
        // Columnas de la tabla
        String[] columnas = { "ID", "Nombre", "Edad" };

        // Obtener los datos de la clase Pacientes
        Object[][] datos = new Pacientes().getDatos();

        // Crear modelo y tabla
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);

        // Añadir tabla al JScrollPane
        this.setViewportView(tabla);
    }
}