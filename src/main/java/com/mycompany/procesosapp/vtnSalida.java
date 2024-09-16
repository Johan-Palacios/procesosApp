package com.mycompany.procesosapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vtnSalida extends JFrame{
    //INICIALIZACION DE COMPONENTES PARA LA GUI
    private final JLabel lbl1, lbl2, lbl3;
    
    //CONSTRUCTOR CON EL DISEÑO DE LOS COMPONENTES GUI
    public vtnSalida(){
        //configuraciones obligatorias
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //diseño del titulo de la ventana
        setTitle("Bienvenido");
        setIconImage(new ImageIcon(getClass().getResource("images/iconTux.png")).getImage());
        
        //diseño de componentes
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("images/tux1.png"));
        lbl1 = new JLabel(imagen1);
        lbl1.setBounds(55,40,250,250);
        add(lbl1);
        
        lbl2 = new JLabel("Planificación de Procesos");
        lbl2.setBounds(65,300,300,30); //(x,y,anch,alt)
        lbl2.setFont(new Font("Arial Bold", 3, 18)); //(fuente, negrita1/cursiva2/ambas3, tamaño)
        lbl2.setForeground(new Color(52, 73, 94)); //color de letra
        add(lbl2);
        
        lbl3 = new JLabel("© 2024 The TUX Company");
        lbl3.setBounds(100,380,300,30);
        lbl3.setFont(new Font("Andale Mono", 1, 12));
        lbl3.setForeground(new Color(93, 109, 126));
        add(lbl3);
        
        //agregar estos componentes para que no interfieran con la imagen de fondo
        getContentPane().add(lbl1);
        getContentPane().add(lbl2);
        getContentPane().add(lbl3);
        
        //implementacion del panel con la imagen de fondo
        fondoVtn fondo = new fondoVtn();
        fondo.setBounds(0, 0, 365, 460);
        add(fondo);
        
        //ES ESTE CASO AL NO HABER BOTONES NI ACCIONES ES QUE EL "public void actionPerformed(ActionEvent e"
        //ESTA DENTRO DEL CONTRUCTOR DEL DISEÑO DE LOS COMPONENTES
        Timer temp = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("IDk why this doesn´t work without ActionListener"
                        + "so I found myself having to use this thing"); 
            }
        });
        temp.setRepeats(false);
        temp.start();
    }
    
    //METODO MAIN PARA LA VENTANA
    public static void main(String[]args){
        vtnSalida ventana1 = new vtnSalida();
        ventana1.setBounds(0,0,365,460);
        ventana1.setLocationRelativeTo(null);
        ventana1.setResizable(false);
        ventana1.setVisible(true);
    }
    
}
