/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*; 
import javax.swing.table.DefaultTableModel;

public class MyWindowSwing2 extends JFrame{
 
    JComboBox cb;
    JTextField jtfNombre;
    JTextField jtfPuntos;
    JList jl;
    DefaultListModel dlm;
    JLabel lbInfoArmy;
    JLabel lbInfoNombre;
    JLabel lbInfoPuntos;
    JSlider jslPuntos;
    DefaultTableModel dtm;
    JLabel lbError;
    
    public MyWindowSwing2(){
    
        this("Probando listas", 250, 150, 500, 600);
    }
    
   
    public MyWindowSwing2(String title, int x, int y, int w, int h){
    
        super(title);
        this.getContentPane().setLayout(new BorderLayout());
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new FlowLayout());
        this.setBounds(x, y, w, h);
        
        //ETIQUETAS
        JLabel lbArmy = new JLabel("Army");
        //lbArmy.setBounds(50,50, 50, 30);
        JLabel lbNombre = new JLabel("Unidad");
       // lbNombre.setBounds(50,100, 50, 30);
        JLabel lbPuntos = new JLabel("Puntos");
       // lbPuntos.setBounds(50,150, 50, 30);
        
        //COMBOBOX
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        cb = new JComboBox(dcm);
        //cb.setBounds(150, 50, 150, 30);
        dcm.addElement("Undead");
        dcm.addElement("Orcos");
        dcm.addElement("Demonios");
        dcm.addElement("Enanos");
        dcm.addElement("Reinos de los Hombres");
        
        //CAJAS DE TEXTO PARA INTRODUCIR EL NOMBRE DE LA UNIDAD Y LOS PUNTOS
        jtfNombre = new JTextField(10);
        // jtfNombre.setBounds(150, 100, 150, 30);
        jtfPuntos = new JTextField(10);
       // jtfPuntos.setBounds(150, 150, 150, 30);
        
        //SLIDER PARA LOS PUNTOS
        jslPuntos = new JSlider(30, 400, 50);
        //jslPuntos.setBounds(320, 150, 150, 20);
        jslPuntos.addChangeListener(new ManejadorSliderPuntosUnidad(this));
                
        
        //BOTÓN PARA AÑADIR UNIDADES
        JButton bt = new JButton("Añadir");
       // bt.setBounds(350, 100, 100, 30);
        bt.addActionListener(new ManejadorBotonAnadirUnidades(this));
        
        //otros botones de prueba
        JButton bt2 = new JButton("Borrar");
        JButton bt3 = new JButton("Ampliar");
        JPanel barraHerramientas = new JPanel();
        barraHerramientas.setLayout(new FlowLayout());
        
        //LISTA
        dlm = new DefaultListModel();
        jl = new JList(dlm);
       // jl.setBounds(50, 200, 150, 120);
        //rellenamos algo de inicio        
        UnidadKOW unidad1 = new UnidadKOW("undead", "Reg. Revenants", 110);
        UnidadKOW unidad2 = new UnidadKOW("orcos", "Reg. Gore Riders", 140);
        dlm.addElement(unidad1);
        dlm.addElement(unidad2);
        jl.addListSelectionListener(new ManejadorListaUnidades(this));
        
        //TEXTOS
        lbInfoArmy = new JLabel("EL army es");
       // lbInfoArmy.setBounds(250, 200, 250, 30);
        lbInfoNombre = new JLabel("La unidad es");
       // lbInfoNombre.setBounds(250, 240, 250, 30);
        lbInfoPuntos = new JLabel("Puntos: ");
       // lbInfoPuntos.setBounds(250, 280, 150, 30);
        
        //TABLA
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Army", "Unidad", "Puntos"});
        JTable jtbTabla = new JTable(dtm);
        JScrollPane js = new JScrollPane(jtbTabla);
       // js.setBounds(50, 350, 400, 100);
        
        lbError = new JLabel();
       // lbError.setBounds(50, 470, 400, 100);
        
        //AÑADIR ELEMENTOS
        panelCentral.add(lbArmy);
        panelCentral.add(lbNombre);
        panelCentral.add(lbPuntos);
        panelCentral.add(jl);
        panelCentral.add(cb);
        panelCentral.add(lbInfoArmy);
        panelCentral.add(lbInfoNombre);
        panelCentral.add(lbInfoPuntos);
        panelCentral.add(jtfNombre);
        panelCentral.add(jtfPuntos);
        barraHerramientas.add(bt);
        barraHerramientas.add(bt2);
        barraHerramientas.add(bt3);
        panelCentral.add(jslPuntos);
        panelCentral.add(js);
        panelCentral.add(lbError);
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add(panelCentral, BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
