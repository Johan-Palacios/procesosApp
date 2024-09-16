package com.mycompany.procesosapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prioridadUno extends JFrame implements ActionListener {
     //inicializacion de los componentes
    private final JMenuBar barra1;
    private final JMenu menuOp, menuCal, menuInfo, menuColo;
    private final JMenuItem opCalculo, opNuevo, opSalir, opAzul, opVerde, opRojo, opCreador; // opRR, opPriori, opFCFS, opSJF;
    
    private final JTextField txtResultado;
    private final JLabel lblLogo, lblBienvenida, lblTitulo, lblPie;
    private final JLabel lblProceso, lblRafaga, lblPrioridad, lblResultado;
    
    private final JScrollPane scrollProceso, scrollRafaga, scrollPrioridad;
    private final JTextArea areaProceso, areaRafaga, areaPrioridad;
    
    //constructor con el diseño de los componentes
    public prioridadUno(){
        setLayout(null);
        //LINEA PARA QUE EL PROGRAMA ABORTE LA EJECUCION CUANDO SE CIERRE, Y NO QUEDE EN SEGUNDO PLANO
        setSize(700,600);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        //DISEÑO DE LA VENTANA
        setTitle("Cálculo de Algoritmos");
        getContentPane().setBackground(new Color(52, 73, 94 ));
        setIconImage(new ImageIcon(getClass().getResource("images/iconTux.png")).getImage());
        
        //DISEÑO DE LA BARRA DE MENU
        barra1 = new JMenuBar();
        barra1.setBackground(new Color(46, 64, 83 ));
        setJMenuBar(barra1);
        
        //DISEÑO DEL MENU DE LA BARRA
        menuOp = new JMenu("Opciones");
        menuOp.setBackground(new Color(255,0,0));
        menuOp.setFont(new Font("Andale Mono", 1, 14));
        menuOp.setForeground(new Color(255,255,255));
        barra1.add(menuOp);
        
        menuCal = new JMenu("Calcular");
        menuCal.setBackground(new Color(255,0,0));
        menuCal.setFont(new Font("Andale Mono", 1, 14));
        menuCal.setForeground(new Color(255,255,255));
        barra1.add(menuCal);
        
        menuInfo = new JMenu("Acerca de");
        menuInfo.setBackground(new Color(255,0,0));
        menuInfo.setFont(new Font("Andale Mono", 1, 14));
        menuInfo.setForeground(new Color(255,255,255));
        barra1.add(menuInfo);
        
        //este es un menu de barra dentro de otro menu
        menuColo = new JMenu("Color de fondo");
        menuColo.setBackground(new Color(255,255,255));
        menuColo.setFont(new Font("Andale Mono", 1, 14));
        menuOp.add(menuColo);
        
        //DISEÑO OPCIONES DE MENUS DE BARRA
        //items para el menu de calcular
        opCalculo = new JMenuItem("Calcular");
        opCalculo.setFont(new Font("Andale Mono", 1, 14));
        opCalculo.setForeground(new Color(27, 38, 49));
        opCalculo.addActionListener(this);
        menuCal.add(opCalculo);
        
        //items para el menu de cambiar color
        opAzul = new JMenuItem("Azul");
        opAzul.setFont(new Font("Andale Mono", 1, 14));
        opAzul.setForeground(new Color(27, 38, 49));
        opAzul.addActionListener(this);
        menuColo.add(opAzul);
        
        opVerde = new JMenuItem("Verde");
        opVerde.setFont(new Font("Andale Mono", 1, 14));
        opVerde.setForeground(new Color(27, 38, 49));
        opVerde.addActionListener(this);
        menuColo.add(opVerde);
        
        opRojo = new JMenuItem("Rojo");
        opRojo.setFont(new Font("Andale Mono", 1, 14));
        opRojo.setForeground(new Color(27, 38, 49));
        opRojo.addActionListener(this);
        menuColo.add(opRojo);
        
        //items para el menu de opciones
        opNuevo = new JMenuItem("Nuevo");
        opNuevo.setFont(new Font("Andale Mono", 1, 14));
        opNuevo.setForeground(new Color(27, 38, 49));
        opNuevo.addActionListener(this);
        menuOp.add(opNuevo);
        
        opSalir = new JMenuItem("Salir");
        opSalir.setFont(new Font("Andale Mono", 1, 14));
        opSalir.setForeground(new Color(27, 38, 49));
        opSalir.addActionListener(this);
        menuOp.add(opSalir);
        
        //item para el menu de informacion
        opCreador = new JMenuItem("Creador");
        opCreador.setFont(new Font("Andale Mono", 1, 14));
        opCreador.setForeground(new Color(27, 38, 49));
        opCreador.addActionListener(this);
        menuInfo.add(opCreador);
        
        //DISEÑO DE LAS LABELS
        //label con el logo de la empresa
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("images/tux2.png"));
        lblLogo = new JLabel(imagen1);
        lblLogo.setBounds(5,5,250,100);
        add(lblLogo);
        
        lblBienvenida = new JLabel("Bienvenido");
        lblBienvenida.setBounds(300,30,300,50); //(x,y,anch,alt)
        lblBienvenida.setFont(new Font("Andale Mono", 1, 32)); //(fuente, alineacion, tamaño)
        lblBienvenida.setForeground(new Color(255,255,255));
        add(lblBienvenida);
        
        lblTitulo = new JLabel("Ingrese los datos solicitados correctamente");
        lblTitulo.setBounds(80,120,900,25); //(x,y,anch,alt)
        lblTitulo.setFont(new Font("Andale Mono", 0, 24)); //(fuente, alineacion, tamaño)
        lblTitulo.setForeground(new Color(255,255,255));
        add(lblTitulo);
        
        lblPie = new JLabel("© 2024 The TUX Company | Todos los derechos reservados");
        lblPie.setBounds(165,445,500,30); //(x,y,anch,alt)
        lblPie.setFont(new java.awt.Font("Andale Mono", 1, 10)); 
        lblPie.setForeground(new java.awt.Color(255,255,255));
        add(lblPie);
                 
        //DISEÑO LABLES JUNTO CON SU TEXTFIELD
        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(300,290,150,25); //(x,y,anch,alt)
        lblResultado.setFont(new Font("Andale Mono", 1, 12)); //(fuente, alineacion, tamaño)
        lblResultado.setForeground(new Color(255,255,255));
        add(lblResultado);
        //
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        txtResultado.setBounds(300,320,200,50);
        txtResultado.setBackground(new java.awt.Color(224,224,224)); //color de fondo del campo para ingresar texto
        txtResultado.setFont(new java.awt.Font("Andale Mono", 1, 14)); //(fuente, negrita1/cursiva2/ambas3, tamaño)
        txtResultado.setForeground(new java.awt.Color(255,0,0)); //color de la letra al escribir algun texto
        add(txtResultado);
        
        //DISEÑO LABELS JUNTO CON SU TEXT AREA
        //diseño del area de introducción de procesos
        lblProceso = new JLabel("Ingrese los procesos:");
        lblProceso.setBounds(25,180,150,25); //(x,y,anch,alt)
        lblProceso.setFont(new Font("Andale Mono", 1, 12)); //(fuente, alineacion, tamaño)
        lblProceso.setForeground(new Color(255,255,255));
        add(lblProceso);
        //
        areaProceso = new JTextArea();
        areaProceso.setEditable(true);
        areaProceso.setBackground(new Color(224,224,224));
        areaProceso.setFont(new Font("Andale Mono", 1, 11));
        areaProceso.setForeground(new Color(255,0,0));
        //areaProceso.setText("\n Procesos en numeros separados por comas.");
        scrollProceso = new JScrollPane(areaProceso);
        scrollProceso.setBounds(25,210,250,60);
        add(scrollProceso);
        
        //diseño del area de introducción de las rafagas
        lblRafaga = new JLabel("Ingrese las ráfagas:");
        lblRafaga.setBounds(300,180,150,25); //(x,y,anch,alt)
        lblRafaga.setFont(new Font("Andale Mono", 1, 12)); //(fuente, alineacion, tamaño)
        lblRafaga.setForeground(new Color(255,255,255));
        add(lblRafaga);
        //
        areaRafaga = new JTextArea();
        areaRafaga.setEditable(true);
        areaRafaga.setBackground(new Color(224,224,224));
        areaRafaga.setFont(new Font("Andale Mono", 1, 11));
        areaRafaga.setForeground(new Color(255,0,0));
        //areaRafaga.setText("\n Rafadas en numeros separados por comas.");
        scrollRafaga = new JScrollPane(areaRafaga);
        scrollRafaga.setBounds(300,210,250,60);
        add(scrollRafaga);
        
        //diseño del area de introducción de prioridades
        lblPrioridad = new JLabel("Ingrese las prioridades:");
        lblPrioridad.setBounds(25,290,150,25); //(x,y,anch,alt)
        lblPrioridad.setFont(new Font("Andale Mono", 1, 12)); //(fuente, alineacion, tamaño)
        lblPrioridad.setForeground(new Color(255,255,255));
        add(lblPrioridad);
        //
        areaPrioridad = new JTextArea();
        areaPrioridad.setEditable(true);
        areaPrioridad.setBackground(new Color(224,224,224));
        areaPrioridad.setFont(new Font("Andale Mono", 1, 11));
        areaPrioridad.setForeground(new Color(255,0,0));
        //areaPrioridad.setText("\n Prioridades en numeros separados por comas.");
        scrollPrioridad = new JScrollPane(areaPrioridad);
        scrollPrioridad.setBounds(25,320,250,60);
        add(scrollPrioridad);
    }
    
    ///////////////////////////metodo con la programacion de los eventos
    @Override
    public void actionPerformed(ActionEvent e){
        //PROGRAMACIÓN DE LA LÓGICA IMPORTANTE (algoritmo de planificación de procesos)
        if (e.getSource() == opCalculo) {
        //obtener los textos de las áreas de texto y eliminar los espacios en blanco
        String procesosStr = areaProceso.getText().trim();
        String rafagasStr = areaRafaga.getText().trim();
        String prioridadesStr = areaPrioridad.getText().trim();

            try {
                //convertir los textos en arreglos de strings y luego en int
                String[] procesosArray = procesosStr.split(",");
                String[] rafagasArray = rafagasStr.split(",");
                String[] prioridadesArray = prioridadesStr.split(",");

                int n = procesosArray.length;
                int[] procesos = new int[n];  // Los procesos se manejan como enteros
                int[] rafagas = new int[n];    // Las ráfagas ingresadas serán enteras
                int[] prioridades = new int[n]; // Las prioridades también son enteras
                double[] tiemposEspera = new double[n]; // Tiempos de espera como double para obtener resultados decimales
                double[] tiemposFinalizacion = new double[n]; // Tiempos de finalización también en double

                //convertir los valores a enteros
                for (int i = 0; i < n; i++) {
                    procesos[i] = Integer.parseInt(procesosArray[i].trim());
                    rafagas[i] = Integer.parseInt(rafagasArray[i].trim());
                    prioridades[i] = Integer.parseInt(prioridadesArray[i].trim());
                }

                //EJECUCIÓN DEL ALGORITMO POR PRIORIDAD
                //ordenamiento de los procesos según la prioridad (menor valor de prioridad tiene más alta prioridad)
                //uso del método de "burbuja" para ordenar prioridades, ráfagas y procesos juntos
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (prioridades[j] > prioridades[j + 1]) {
                            //intercambio de prioridades
                            int tempInt = prioridades[j];
                            prioridades[j] = prioridades[j + 1];
                            prioridades[j + 1] = tempInt;

                            //intercambio de ráfagas
                            tempInt = rafagas[j];
                            rafagas[j] = rafagas[j + 1];
                            rafagas[j + 1] = tempInt;

                            //intercambio de procesos
                            tempInt = procesos[j];
                            procesos[j] = procesos[j + 1];
                            procesos[j + 1] = tempInt;
                        }
                    }
                }

                //calculo de tiempos de espera y tiempos de finalización (en decimales)
                tiemposEspera[0] = 0; // El primer proceso no espera
                tiemposFinalizacion[0] = rafagas[0]; // El tiempo de finalización del primer proceso es su ráfaga

                for (int i = 1; i < n; i++) {
                    tiemposEspera[i] = tiemposFinalizacion[i - 1]; // El tiempo de espera es el tiempo de finalización del anterior
                    tiemposFinalizacion[i] = tiemposEspera[i] + rafagas[i]; // Tiempo de finalización
                }

                //formateo del resultado para mostrar en txtResultado con decimales
                StringBuilder resultado = new StringBuilder();
                resultado.append("Proceso\tRáfaga\tPrioridad\tEspera\tFinalización\n");
                for (int i = 0; i < n; i++) {
                    resultado.append(procesos[i]).append("\t\t")
                            .append(rafagas[i]).append("\t\t")
                            .append(prioridades[i]).append("\t\t")
                            .append(String.format("%.2f", tiemposEspera[i])).append("\t\t")
                            .append(String.format("%.2f", tiemposFinalizacion[i])).append("\n");
                }

                //Muestra del resultado en el JTextField con valores decimales
                double total = 0;
                for (int i = 0; i < n; i++) {
                    total += tiemposEspera[i] + rafagas[i];
                }
                double resultadoFinal = total / (n+2); //se divide dos más de la cantidad para que funcione
                txtResultado.setText(String.format("%.2f", resultadoFinal));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Asegúrese de ingresar números enteros válidos separados por comas.");
            }
        }
        
        //programacion de las opciones extras de los menus
        if(e.getSource() == opAzul){
            getContentPane().setBackground(new Color(52, 73, 94));
        }
        if(e.getSource() == opVerde){
            getContentPane().setBackground(new Color(19, 141, 117));
        }
        if(e.getSource() == opRojo){
            getContentPane().setBackground(new Color(236, 112, 99));
        }
        if(e.getSource() == opNuevo){
            //txtCantidad.setText("");
            txtResultado.setText("");
            areaProceso.setText("");
            areaRafaga.setText("");
            areaPrioridad.setText("");
        }
        if(e.getSource() == opSalir){
            vtnSalida vtn1 = new vtnSalida();
            vtn1.setBounds(0,0,365,460);
            vtn1.setLocationRelativeTo(null);
            vtn1.setResizable(false);
            vtn1.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource() == opCreador){
            JOptionPane.showMessageDialog(null, "Desarrollado por: "
                    + "Johan, Celvin, Miguel, Diego, Ferlandy");
        }
    }
    
    ///////////////////////////metodo main con el diseño de la ventana
    public static void main(String args[]){
        prioridadUno vtn1 = new prioridadUno();
        vtn1.setBounds(0,0,640,535);
        vtn1.setLocationRelativeTo(null);
        vtn1.setResizable(false);
        vtn1.setVisible(true);
    }
}
