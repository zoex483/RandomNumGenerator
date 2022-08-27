package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame  implements ActionListener, WindowListener {
    private TextField field = new TextField();
    private JButton button = new JButton("Random number");
    public Window(){
        setSize(300,400);
        setLayout(null);
        setVisible(true);
        setLocation(750, 330);

        field.setSize(65,25);
        field.setLocation(100, 45);
        field.setVisible(true);

        button.setSize(130,25);
        button.setLocation(70, 75);
        button.setVisible(true);
        addWindowListener(this);
        button.addActionListener(this);
        add(button);
        add(field);
    }
    public void actionPerformed(ActionEvent e) {
        double a = (int)+(Math.random()*9); // округление до целого, генерирует от 1 до 9
        field.setText(String.valueOf(a)); // нужно перевести число в строку
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.exit(666); // допустим, приложение работает, но в какой-то момент оно закрылось
                                // указанный код всегда будет передаваться в консоль, и мы сможем узнать по какой причине закрыдось приложение
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}
