package farmacia;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaFarmacia {
    private Object[][] datosFarmacia ={
        {1, "Paracetamol", "Tableta", "500 mg", "Generico"},
        {1, "Paracetamol", "Tableta", "500 mg", "Generico"},
        {1, "Paracetamol", "Tableta", "500 mg", "Generico"},
        {1, "Paracetamol", "Tableta", "500 mg", "Generico"},
        {1, "Paracetamol", "Tableta", "500 mg", "Generico"}
    };

    public Object[][] getDatosFarmacia() {
        return datosFarmacia;
    }

    private String[] columnNames = {"ID", "Nombre", "Presentación", "Dosis", "Laboratorio"};

    public JScrollPane crearTabla() {
        DefaultTableModel model = new DefaultTableModel(datosFarmacia, columnNames);
        JTable table = new JTable(model);
        return new JScrollPane(table);
    }

}
