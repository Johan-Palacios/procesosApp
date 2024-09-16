package com.mycompany.procesosapp;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SJFInterface extends JFrame {
    private int numeroProcesos;
    private int procesoActual = 0;
    private int[][] procesos;
    private int totalTiempoEspera = 0;

    public SJFInterface() {
        setTitle("Planificación SJF");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        inicializarVentanaNumeroProcesos();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void inicializarVentanaNumeroProcesos() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Ingrese el número de procesos:");
        JTextField textField = new JTextField();

        JButton ingresarButton = new JButton("Ingresar");
        ingresarButton.addActionListener(e -> {
            try {
                numeroProcesos = Integer.parseInt(textField.getText());
                if (numeroProcesos <= 0) {
                    JOptionPane.showMessageDialog(this, "Ingrese un número válido de procesos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                procesos = new int[numeroProcesos][3];
                procesoActual = 0;
                ingresarTiempoProceso();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(ingresarButton);
        add(panel);

        setVisible(true);
    }

    private void ingresarTiempoProceso() {
        JFrame ventanaIngreso = new JFrame();
        ventanaIngreso.setTitle("Ingresar tiempo de proceso");
        ventanaIngreso.setSize(300, 150);
        ventanaIngreso.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Ingrese tiempo de P" + (procesoActual + 1) + ":");
        JTextField textField = new JTextField();

        JButton ingresarButton = new JButton("Ingresar");
        ingresarButton.addActionListener(e -> {
            try {
                int tiempoRafaga = Integer.parseInt(textField.getText());
                if (tiempoRafaga < 0) {
                    JOptionPane.showMessageDialog(ventanaIngreso, "Ingrese un tiempo válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                procesos[procesoActual][0] = procesoActual + 1;
                procesos[procesoActual][1] = tiempoRafaga;
                procesoActual++;

                ventanaIngreso.dispose();
                if (procesoActual < numeroProcesos) {
                    ingresarTiempoProceso();
                } else {
                    calcularTiempos();
                    mostrarResultados();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventanaIngreso, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(ingresarButton);
        ventanaIngreso.add(panel);
        ventanaIngreso.setVisible(true);
    }

    private void calcularTiempos() {
        // Ordenar los procesos por tiempo de ráfaga
        Arrays.sort(procesos, (a, b) -> Integer.compare(a[1], b[1]));

        // Calcular tiempos de espera
        procesos[0][2] = 0;
        for (int i = 1; i < numeroProcesos; i++) {
            procesos[i][2] = procesos[i - 1][2] + procesos[i - 1][1];
            totalTiempoEspera += procesos[i][2];
        }
    }

    private void mostrarResultados() {
        JFrame ventanaResultados = new JFrame();
        ventanaResultados.setTitle("Resultados");
        ventanaResultados.setSize(400, 300);
        ventanaResultados.setLocationRelativeTo(null);

        String[] columnNames = {"Proceso", "Tiempo", "Espera"};
        String[][] data = new String[numeroProcesos][3];
        for (int i = 0; i < numeroProcesos; i++) {
            data[i][0] = "P" + procesos[i][0];
            data[i][1] = String.valueOf(procesos[i][1]);
            data[i][2] = String.valueOf(procesos[i][2]);
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        float tiempoEsperaPromedio = (float) totalTiempoEspera / numeroProcesos;
        JLabel promedioLabel = new JLabel("Tiempo promedio: " + tiempoEsperaPromedio);

        ventanaResultados.setLayout(new BorderLayout());
        ventanaResultados.add(scrollPane, BorderLayout.CENTER);
        ventanaResultados.add(promedioLabel, BorderLayout.SOUTH);
        ventanaResultados.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SJFInterface::new);
    }
}
