/*
Autor: María José Corredor Garzón
 */
package Parciall2;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Parciall2 {
    private ViewModel viewModel;
    
    public Parciall2 (ViewModel viewModel){
        this.viewModel = viewModel;
        
        JFrame frame = new JFrame("Parcial 2");
        JPanel panel= new JPanel();
        JTextField inputProducto = new JTextField(20);
        JButton VerDispoButton = new JButton("Verificar disponibilidad");
        JButton AgProductButton = new JButton("Agregar producto");
        
        VerDispoButton.addActionListener((ActionEvent e) -> {
            String producto = inputProducto.getText();
            boolean disponible = viewModel.VerDispo(producto);
            
            if (disponible) {
                JOptionPane.showMessageDialog(null, "El producto esta disponible");
            } else {
                JOptionPane.showMessageDialog(null, "El producto no esta disponible");
            }
        });
        
        AgProductButton.addActionListener((ActionEvent e) -> {
            String nuevoProducto = inputProducto.getText();
            viewModel.AgProduct(nuevoProducto);
            JOptionPane.showMessageDialog(null, "El producto ha sido agregado con exito");
        });
        
        panel.add(inputProducto);
        panel.add(VerDispoButton);
        panel.add(AgProductButton);
        
        frame.add(panel);
        frame.setSize(400,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        Model model= new Model();
        ViewModel viewModel= new ViewModel(model);
        Parciall2 view = new Parciall2(viewModel);
    }
}

