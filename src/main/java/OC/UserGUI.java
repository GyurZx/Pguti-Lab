package OC;

import javax.swing.*;
import java.awt.*;

public class UserGUI {
    public static void main(String[] args) {
    // Создание Flame
    JFrame jFrame = new JFrame("Бегущие от Гогу коженные мешки");
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.setSize(800, 500);
    JMenuBar menuBar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Help");
    JMenu menu3 = new JMenu("Info");
    menuBar.add(menu1);
    menuBar.add(menu2);
    menuBar.add(menu3);
    JMenuItem m11 = new JMenuItem("Open");
    JMenuItem m22 = new JMenuItem("Save as");
    menu1.add(m11);
    menu1.add(m22);
    JTextArea ta = new JTextArea();
    jFrame.getContentPane().add(BorderLayout.NORTH, menuBar);
    jFrame.setVisible(true);
    }
}
