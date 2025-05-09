import javax.swing.JFrame;                       //Para crear una ventana.
import javax.swing.JLabel;                       //JLabel: Para mostrar texto dentro de esa ventana.

public class Main {

    public static void main(String[] args ) {

        //crear una ventana con frame

     JFrame miVentana = new JFrame();           ///crear un objeto JFrame (miventana)
     miVentana.setTitle("Hospital SCL");   //Establecer un titulo
     miVentana.setSize(1000,800);   //Definir el tamanno, ancho y alto

     JLabel Texto = new JLabel();               //crear una etiqueta JLabel (texto)
     Texto.setText("Hola mundo");          //colocar el texto
     miVentana.add(Texto);                      //annadir esta etiqueta(texto) a la ventana creada



     miVentana.setVisible(true);              //mostrar la ventana

    

    }


}