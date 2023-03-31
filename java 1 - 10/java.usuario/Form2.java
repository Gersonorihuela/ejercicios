import javax.swing.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener{
 
 private JTextField textfield1;
 private JTextArea textarea1;
 private JScrollPane scrollpane1;
 private JButton boton1;

 String texto = ""; 

 public Form2(){
  setLayout (null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);
  
  boton1 = new JButton("Agregar");
  boton1.setBounds(250,10,100,30);
  add(boton1);
  boton1.addActionListener(this);

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(10,50,400,300);
  add(scrollpane1);
 }
 
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
   texto += textfield1.getText() + "\n";
   textarea1.setText(texto);
   textfield1.setText("");
  }
 }

 public static void main(String args[]){
  Form2 formulario = new Form2();
  formulario.setBounds(0,0,450,400);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
 }
}
