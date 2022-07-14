package org.mcausc78.craft4j.api.gui;

import org.mcausc78.craft4j.api.Lambda1;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    private String text;
    private JButton button;
    public Button(String text) {
        this.text = text;
        this.button = new JButton(this.text);
    }
    public void setText(String text) {
        this.button.setText(text);
    }
    public String getText() {
        return this.button.getText();
    }
    public void setButton(JButton button) {
        this.button = button;
    }
    public JButton getButton() {
        return this.button;
    }
    public void addAction(Lambda1<ActionEvent> action) {
        this.button.addActionListener((event) -> {
            action.run(event);
        });
    }
    public ActionListener[] getActions() {
        return this.button.getActionListeners();
    }
}
