/*
 CONVERSOR
 */

package graficos;

import javax.swing.*;

public class MyWindowSwing extends JFrame{
    
    JRadioButton op1, op2, op3;
    JTextField txteuros;
    JLabel txtlbre;
    
    public MyWindowSwing(){
    
        this("Conversos de monedas", 250, 150, 500, 400);
    }
    
    public MyWindowSwing(String title, int x, int y, int w, int h){
    
        super(title);
        this.getContentPane().setLayout(null);
        this.setBounds(x, y, w, h);
        
        JLabel lb = new JLabel("Introduzca valor en euros ");
        lb.setBounds(80, 70, 150, 30);
        
        txteuros = new JTextField();
        txteuros.setBounds(230, 70, 100, 30);
        
        op1 = new JRadioButton("pesetas");
        op1.setBounds(230, 150, 80, 30);
        op2 = new JRadioButton("libras");
        op2.setBounds(230, 180, 80, 30);
        op3 = new JRadioButton("dólares");
        op3.setBounds(230, 210, 80, 30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(op1);
        bg.add(op2);
        bg.add(op3);
        
        JButton bt = new JButton("Convertir");
        bt.setBounds(200,260,100,30);
        bt.addActionListener(new ManejadorBotonConvertir(this));
        
        txtlbre = new JLabel("Hola perri");
        txtlbre.setBounds(200, 300, 100, 30);
        
       
        this.getContentPane().add(op1);
        this.getContentPane().add(op2);
        this.getContentPane().add(op3);
        this.getContentPane().add(lb);
        this.getContentPane().add(txteuros);
        this.getContentPane().add(bt);
        this.getContentPane().add(txtlbre);
        this.setVisible(true);
    }
    
    
    
}
