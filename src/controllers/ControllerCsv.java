package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelCsv;
import views.ViewCsv;

public class ControllerCsv implements ActionListener {

    ModelCsv modelCsv;
    ViewCsv viewCsv;

    public ControllerCsv(ModelCsv modelCsv, ViewCsv viewCsv) {
        this.modelCsv = modelCsv;
        this.viewCsv = viewCsv;
        this.viewCsv.jbSave.addActionListener(this);
        this.viewCsv.jbClean.addActionListener(this);
        initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewCsv.jbSave) {
            Guardar();
        } else if (e.getSource() == viewCsv.jbClean) {
            Nuevo();
        }
    }

    private void Guardar() {
        modelCsv.setPath("C:\\Users\\DELL\\Documents\\NetBeansProjects\\No entragrados\\base.csv");
        modelCsv.setBase(modelCsv.text(viewCsv.jtfName.getText(), viewCsv.jtfEmail.getText()));
        modelCsv.openBase(modelCsv.getBase(), modelCsv.getPath());
        JOptionPane.showMessageDialog(null, "registro guardado");
    }

    private void Nuevo() {
        viewCsv.jtfName.setText("");
        viewCsv.jtfEmail.setText("");
    }

    private void initComponents() {
        viewCsv.setTitle("Actividad-10 --- CSV-v-0.1");
        viewCsv.setLocationRelativeTo(null);
        viewCsv.setResizable(false);
        viewCsv.setVisible(true);
    }

}
