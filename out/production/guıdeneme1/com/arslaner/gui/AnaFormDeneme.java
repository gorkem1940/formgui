//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.arslaner.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnaFormDeneme extends JFrame implements ActionListener {
    private JLabel adsad = new JLabel("Adınızı Soyadınızı giriniz.");
    private JTextField adsadfield = new JTextField(50);
    private JLabel babaad = new JLabel("Babanızın giriniz.");
    private JTextField babafield = new JTextField(50);
    private JButton tikla = new JButton("TIKLA");
    private JPanel innerwindow = new JPanel();
    private JPanel innerwindow2 = new JPanel();

    public AnaFormDeneme() {
        super("Elle Form Oluşturma İşlemi...");
        this.getContentPane().setLayout(new BorderLayout());
        this.innerwindow.setLayout(new GridLayout(2, 2, 1, 1));
        this.innerwindow.add(this.adsad);
        this.innerwindow.add(this.adsadfield);
        this.innerwindow.add(this.tikla);
        this.innerwindow2.setLayout(new GridLayout(2, 2, 1, 1));
        this.innerwindow2.add(this.babaad);
        this.innerwindow2.add(this.babafield);
        this.getContentPane().add("West", this.innerwindow2);
        this.getContentPane().add("North", this.innerwindow);
        this.tikla.addActionListener(this);
    }

    public static void main(String[] args) {
        AnaFormDeneme window = new AnaFormDeneme();
        window.setSize(400, 200);
        window.setVisible(true);
        window.setDefaultCloseOperation(3);
    }

    public void actionPerformed(ActionEvent e) {
        this.adsadfield.setText("Adının soyadının yerine bu geldi");
    }
}
