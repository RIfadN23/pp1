import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class GUITestV6 {
  private JFrame miVentana;
  private JLabel lblUsuario;
  private JTextField txtUsuario;
  private JLabel lblPassword;
  private JTextField txtPassword;
  private JButton btnOK;
  private JButton btnCancelar;
  private JButton btnAyuda;

  public GUITestV6() {
    // Configurar el contenedor
    miVentana = new JFrame("GUI Test v6.0");
    miVentana.setSize(320, 160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miVentana.setLayout(new FlowLayout());

    //Agregar Widgets
    lblUsuario = new JLabel("Usuario:");
    miVentana.add(lblUsuario);
    txtUsuario = new JTextField(20);
    miVentana.add(txtUsuario);
    lblPassword = new JLabel("Contraseña:");
    miVentana.add(lblPassword);
    txtPassword = new JTextField(20);
    miVentana.add(txtPassword);
    btnOK = new JButton("OK");
    miVentana.add(btnOK);
    btnCancelar = new JButton("Cancelar");
    miVentana.add(btnCancelar);
    btnAyuda = new JButton("Ayuda");
    miVentana.add(btnAyuda);

    // Mostrar contenedor
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new GUITestV6();
  }
}