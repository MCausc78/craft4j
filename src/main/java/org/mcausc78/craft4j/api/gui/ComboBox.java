package org.mcausc78.craft4j.api.gui;

import javax.swing.JComboBox;
import java.util.List;

public class ComboBox {
    private JComboBox<String> box;
    private String element;
    public ComboBox(String[] elements) {
        this.box = new JComboBox<String>(elements);
        this.init();
    }
    public ComboBox(List<String> elements) {
        this.box = new JComboBox<String>(elements.toArray(new String[0]));
        this.init();
    }
    private void init() {
        this.box.addActionListener((event) -> {
            JComboBox box = (JComboBox) event.getSource();
            this.element = (String)box.getSelectedItem();
        });
    }
    public void setElement(String element) {
        this.box.setSelectedItem((String)element);
    }
    public void setEditable(boolean editable) {
        this.box.setEditable(editable);
    }
    public boolean getEditable() {
        return this.box.isEditable();
    }
    public JComboBox<String> getComboBox() {
        return this.box;
    }
    public String getElement() {
        Object i = this.box.getSelectedItem();
        return (String)i;
    }
}
