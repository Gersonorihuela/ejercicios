import javax.swing.*;
import java.awt.event.*;

public class Form5 extends JFrame implements ActionListener{
  
  private JTextField ingreso;
  private JLabel etiqueta;
  private JButton boton1;

  public Form5(){
   setLayout(null);
   etiqueta = new JLabel("Usuario:");
   etiqueta.setBounds(10,10,100,30);
   add(etiqueta);

   ingreso = new JTextField();
   ingreso.setBounds(120,17,150,20);
   add(ingreso);

   boton1 = new JButton("Aceptar");
   boton1.setBounds(10,80,100,30);
   add(boton1);
   boton1.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
    String texto = ingreso.getText();
    setTitle(texto);
   }
  }

  public static void main(String args[]){

   Form5 formulario = new Form5();
   formulario.setBounds(0,0,300,150);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
   }
}