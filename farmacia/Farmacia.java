package farmacia;

public class Farmacia {
    int ID;
    String NombreMedicamento;
    String Presentacion;
    String Dosis;
    String Laboratorio;

    public Farmacia(int ID, String NombreMedicamento, String Presentacion, String Dosis, String Laboratorio) {
        this.ID = ID;
        this.NombreMedicamento = NombreMedicamento;
        this.Presentacion = Presentacion;
        this.Dosis = Dosis;
        this.Laboratorio = Laboratorio;
    }

    public int getID() { return ID; }
    public String getNombreMedicamento() { return NombreMedicamento; }
    public String getPresentacion() { return Presentacion; }
    public String getDosis() { return Dosis; }
    public String getLaboratorio() { return Laboratorio; }
  
    

    Object [][] datosFarmacia = new TablaFarmacia().getDatosFarmacia();
}
