package rpg.planner.gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    private static final int WINDOW_WIDTH = 1024;
    private static final int WINDOW_HEIGHT = 720;

    private JFrame window;


    public MainWindow() {
        window = new JFrame();
        buildWindow(window);
        MapPanel map = new MapPanel();

        window.add(map);
    }

    private void buildWindow(JFrame window) {
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLayout(new FlowLayout());     //TODO Layouts nachschauen
        window.setSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
        window.setLocationRelativeTo(null);
    }


}
