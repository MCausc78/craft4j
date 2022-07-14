package org.mcausc78.craft4j.api.gui;

import javax.swing.JFrame;
import java.awt.*;

public class Frame {
    private JFrame frame;
    public Frame(String name) {
        this.frame = new JFrame(name);
    }
    public Frame setSize(int x, int y) {
        this.frame.setSize(x, y);
        return this;
    }
    public JFrame getFrame() {
        return this.frame;
    }
    public void build() {
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }
}
