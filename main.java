import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;

class JDBCSingleton extends menu {

    private static JDBCSingleton jdbc;

    private JDBCSingleton() {
    }

    public static JDBCSingleton getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingleton();
        }
        System.out.print("Gello");
        return jdbc;
    }
}

class Editor extends JDBCSingleton {
    public static void main(String args[]) {
        JDBCSingleton jdbc1 = JDBCSingleton.getInstance();
    }
}
