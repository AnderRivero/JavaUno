package db;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
private JPanel contentPane;
  private JTextField tf1;
  private JTextField tf2;
  private JLabel labelResultado;
  private JLabel labelResultado2;
  private JLabel labelResultado3;
  private JLabel labelResultado4;
  private JLabel  labelResultadoActualizar;
  private JLabel labelSelect1;
  private JLabel labelSelect2;
  private JLabel labelSelect3;
  private JLabel labelEliminar;
  private JLabel labelCodigoActualizar;
  private JButton btnConsultaPorCdigo;
  private JButton btnConsultaParaActualizar;
  private JLabel lblIngreseCdigoDe;
  private JTextField tf3;
  private JTextField tf4;//eliminar
  private JTextField tf5; //actualizar descripcion
  private JTextField tf6;//actualizar precio
  private JTextField tf7; //pide el codigo a consultar para actulizar
  private JLabel labelDescripcionActualizar;
  private JLabel labelPrecioActualizar;
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Formulario frame = new Formulario();
          //frame.cargarDriver();
          frame.setVisible(true);
        } catch (Exception e) {
         e.printStackTrace();
        }
      }
    });
  }
  /**
   * Create the frame.
   */
  public Formulario() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 600, 530);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel separador = new JLabel("----------------------------------------------Insertar Articulo----------------------------------------------");
    separador.setBounds(10, 10, 480, 14);
    contentPane.add(separador);
    
    JLabel lblDescripcinDelArtculo = new JLabel("Descripcion del articulo:");
    lblDescripcinDelArtculo.setBounds(23, 38, 193, 14);
    contentPane.add(lblDescripcinDelArtculo);
    
    tf1 = new JTextField();
    tf1.setBounds(247, 35, 193, 20);
    contentPane.add(tf1);
    tf1.setColumns(10);
    
    JLabel lblPrecio = new JLabel("Precio:");
    lblPrecio.setBounds(23, 74, 95, 14);
    contentPane.add(lblPrecio);
    
    tf2 = new JTextField();
    tf2.setBounds(247, 71, 107, 20);
    contentPane.add(tf2);
    tf2.setColumns(10);
    
    JButton btnInsert = new JButton("Insertar");	   //Insertar articulo
    btnInsert.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        labelResultado.setText("");        
        try {
          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
          Statement comando=conexion.createStatement();
          comando.executeUpdate("insert into articulos(descripcion,precio) values ('"+tf1.getText()+"','"+tf2.getText()+"')");
          conexion.close();
          labelResultado.setText("se registraron los datos");
          tf1.setText("");
          tf2.setText("");
        } catch(SQLException ex){
          setTitle(ex.toString());
        }
      }
    });
    btnInsert.setBounds(247, 100, 89, 23);
    contentPane.add(btnInsert);
    
    JLabel separador2 = new JLabel("---------------------------------------------Consultar Articulo---------------------------------------------");
    separador2.setBounds(10, 135, 480, 14);
    contentPane.add(separador2);
    
    labelResultado = new JLabel("");
    labelResultado.setBounds(361, 122, 229, 14);
    contentPane.add(labelResultado);
    
    labelSelect1 = new JLabel("Resultado consulta ");   //Consultar articulo
    labelSelect1.setBounds(350, 175, 243, 14);
    contentPane.add(labelSelect1);
    labelSelect1 = new JLabel("Codigo: ");
    labelSelect1.setBounds(350, 195, 243, 14);
    contentPane.add(labelSelect1);
    labelSelect2 = new JLabel("Descripcion: ");
    labelSelect2.setBounds(350,205, 243, 14);
    contentPane.add(labelSelect2);
    labelSelect3 = new JLabel("Precio: ");
    labelSelect3.setBounds(350,215, 243, 14);
    contentPane.add(labelSelect3);
    labelResultado3 = new JLabel("");
    labelResultado3.setBounds(350,235, 243, 14);
    contentPane.add(labelResultado3);
    
    btnConsultaPorCdigo = new JButton("Consulta por codigo");//Consultar Articulo
    btnConsultaPorCdigo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        labelResultado.setText("");
        tf1.setText("");
        tf2.setText("");        
        try {
          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
          Statement comando=conexion.createStatement();
          ResultSet registro = comando.executeQuery("select codigo,descripcion,precio from articulos where codigo="+tf3.getText());
          if (registro.next()==true) {
        	  labelSelect1.setText("Codigo: "+registro.getString("codigo"));       
        	  labelSelect2.setText("Descripcion: "+registro.getString("descripcion"));            
        	  labelSelect3.setText("Precio: "+registro.getString("precio"));
          } else { 
            labelResultado3.setText("No existe un articulo con dicho codigo");
          }
          conexion.close();
        } catch(SQLException ex){
          setTitle(ex.toString());
        }
      }
    });
    btnConsultaPorCdigo.setBounds(155, 212, 177, 23);
    contentPane.add(btnConsultaPorCdigo);
    
    JLabel separador3 = new JLabel("----------------------------------------------Eliminar Articulo----------------------------------------------");
    separador3.setBounds(10,245, 480, 14);
    contentPane.add(separador3);
    
    lblIngreseCdigoDe = new JLabel("Ingrese codigo de articulo a consultar:");
    lblIngreseCdigoDe.setBounds(10, 179, 243, 14);
    contentPane.add(lblIngreseCdigoDe);
    tf3 = new JTextField();
    tf3.setBounds(247, 176, 86, 20);
    contentPane.add(tf3);
    tf3.setColumns(10);
    
    
    JButton btnEliminar = new JButton("Eliminar");	   //Eliminar articulo
    btnEliminar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        labelResultado.setText("");        
        try {
          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
          Statement comando=conexion.createStatement();
          
          ResultSet registro = comando.executeQuery("select descripcion from articulos where codigo="+tf4.getText());
          if (registro.next()==true) {
        	  comando.executeUpdate("Delete from articulos where codigo="+tf4.getText());
              labelResultado2.setText("Eliminado con exito");

          } else { 
            labelResultado2.setText("No existe este codigo");
          }
          conexion.close();
          tf4.setText("");
        } catch(SQLException ex){
          setTitle(ex.toString());
        }
      }
    });
    
    labelEliminar = new JLabel("Ingrese codigo de articulo a eliminar:");
    labelEliminar.setBounds(10, 276, 243, 14);
    contentPane.add(labelEliminar);
    
    tf4 = new JTextField();
    tf4.setBounds(247, 276, 86, 20);
    contentPane.add(tf4);
    tf4.setColumns(10);
    
    btnEliminar.setBounds(247, 300, 86, 15);  //posicionar
    contentPane.add(btnEliminar);
    labelResultado2 = new JLabel("");
    labelResultado2.setBounds(347, 276,300 , 14);
    //labelResultado.setBounds(361, 122, 229, 14);
    contentPane.add(labelResultado2);
    JLabel separador4 = new JLabel("----------------------------------------------Eliminar Articulo----------------------------------------------");
    separador4.setBounds(10,325, 480, 14);
    contentPane.add(separador4);
    
    
  
 
    
    btnConsultaParaActualizar = new JButton("enviar");// consulta para actualizar
    btnConsultaParaActualizar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {   
        try {
          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
          Statement comando=conexion.createStatement();
          ResultSet registro = comando.executeQuery("select descripcion,precio from articulos where codigo="+tf7.getText());
          if (registro.next()==true) {
            tf5.setText(registro.getString("descripcion"));
            tf6.setText(registro.getString("precio"));
          } else { 
            labelResultado4.setText("No existe un artículo con dicho código");
          }
          conexion.close();
        } catch(SQLException ex){
          setTitle(ex.toString());
        }
      }
    });
    btnConsultaParaActualizar.setBounds(350, 350, 80, 20);
    contentPane.add(btnConsultaParaActualizar);
    
    labelCodigoActualizar = new JLabel("Ingrese código de articulo a actualizar:");
    labelCodigoActualizar.setBounds(10, 350, 243, 14);
    contentPane.add(labelCodigoActualizar);
    
    labelDescripcionActualizar = new JLabel("Descripcion del producto:");
    labelDescripcionActualizar.setBounds(10, 376, 243, 14);
    contentPane.add(labelDescripcionActualizar);
    
    labelPrecioActualizar = new JLabel("Descripcion del producto:");
    labelPrecioActualizar.setBounds(10, 403, 243, 14);
    contentPane.add(labelPrecioActualizar);
    
    labelResultadoActualizar = new JLabel("");   
    labelResultadoActualizar.setBounds(350, 430, 243, 20);
    contentPane.add(labelResultadoActualizar);
    
    labelResultado4 = new JLabel("");
    labelResultado4.setBounds(360, 430, 243, 20);
    contentPane.add(labelResultado4);
       
    tf7 = new JTextField();
    tf7.setBounds(247, 350, 86, 20);
    contentPane.add(tf7);
    tf7.setColumns(10);
    tf7.setText("");
    
    JButton btnActualizar = new JButton("actualizar");	   //Actualizar articulo
    btnActualizar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        labelResultado.setText("");        
        try {
          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
          Statement comando=conexion.createStatement();
          comando.executeUpdate("update articulos set descripcion='"+tf5.getText()+"',precio='"+tf6.getText()+"'where codigo='"+tf7.getText()+"'");
          conexion.close();
          labelResultadoActualizar.setText("se actualizaron los datos");
          tf5.setText("");
          tf6.setText("");
        } catch(SQLException ex){
          setTitle(ex.toString());
        }
      }
    });
    btnActualizar.setBounds(247, 430, 90, 20);
    contentPane.add(btnActualizar);
    
    tf5 = new JTextField();
    tf5.setBounds(247, 376, 200, 20);
    contentPane.add(tf5);
    tf5.setText("");
    tf5.setColumns(10);
    
    tf6 = new JTextField();
    tf6.setBounds(247, 403, 150, 20);
    tf6.setColumns(10);
    tf6.setText("");
    contentPane.add(tf6);
    
    cargarDriver();
  }
 
  private void cargarDriver() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex) {
      setTitle(ex.toString());
    }
  }
}
