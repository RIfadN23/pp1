import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WidgetsTestV5 {
  private String datos[][]={
                      {"A101","Leche","$31.60"},
                      {"A102","Arroz","$6.69"},
                      {"A103","Maizena","$1.99"},
                      {"A104","Café soluble","$21.99"},
                      {"A105","Frijol","$14.00"},
                      {"A106","Sopa","$1.69"},
                      {"A107","Huevos","$10.40"},
                      {"A108","Consomate","$4.99"},
                      {"A109","Harina de trigo","$6.19"},
                      {"A110","Azúcar","$18.40"},
                      {"A111","Aceite","$7.75"},
                      {"A112","Manteca vegetal","$5.50"},
                      {"A113","Papa blanca","$11.00"},
                      {"A114","Jitomate","$18.00"},
                      {"A115","Pierna y muslo de pollo","$11.00"}
                     };    
  private String columnas[]={"ID","NOMBRE","PRECIO"}; 
  private JTable jtProductos;
  private JFrame ventana;
  private JLabel lblArticulos;
  private JScrollPane spProductos;
  private JButton btnGuardar;

  public WidgetsTestV5() {
    // Configurar el contenedor
    ventana = new JFrame("Widgets Test v5.0");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(320, 160);

    // Agregar Widgets
    lblArticulos = new JLabel("Lista de Artículos:");
    ventana.add(lblArticulos, BorderLayout.NORTH);
    jtProductos = new JTable(datos, columnas);
    spProductos = new JScrollPane(jtProductos);
    ventana.add(spProductos, BorderLayout.CENTER);
    btnGuardar = new JButton("Salir");
    ventana.add(btnGuardar, BorderLayout.SOUTH);

    // Mostrar contenedor
    ventana.setVisible(true);
  }

  public static void main(String[] args) {
    new WidgetsTestV5();
  }
}
