/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Mateus Roveda
 */
public class GerenciarJanelas {

    private static JDesktopPane areaTrabalho;

    /**
     * Metodo responsavel por setar qual o desktoppane
     *
     * @param JDesktopPane
     */
    public GerenciarJanelas(JDesktopPane dktPainel) {
        this.areaTrabalho = dktPainel;
    }

    /**
     * Metodo utilizado para abrir uma janela nova, recebe um iframe
     *
     * @param JInternalFrame
     */
    public void abreJanela(JInternalFrame iFrame) {
        if (iFrame.isVisible()) {
            iFrame.setLocation(areaTrabalho.getWidth() / 2 - iFrame.getWidth() / 2, areaTrabalho.getHeight() / 2 - iFrame.getHeight() / 2);
            iFrame.toFront();
            iFrame.requestFocus();
        } else {
            areaTrabalho.add(iFrame);
            iFrame.setLocation(areaTrabalho.getWidth() / 2 - iFrame.getWidth() / 2, areaTrabalho.getHeight() / 2 - iFrame.getHeight() / 2);
            iFrame.setVisible(true);
        }
    }

    /**
     * Metodo estatico utilizado para fechar as janelas
     *
     * @param JInternalFrame
     */
    public static void fecharJanela(JInternalFrame iFrame) {
//        LimpaTela(iFrame);
        iFrame.dispose();
        areaTrabalho.remove(iFrame);
    }

    public static void limparCampos(Container container) {
        Component c[] = container.getComponents();
        for (int i = 0; i < c.length; i++) {
            if (c[i] instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) c[i];
                field.setValue(null);
            } else if (c[i] instanceof JTextField) {
                JTextField field = (JTextField) c[i];
                field.setText("");
//            } else if (c[i] instanceof JScrollPane) {
//                 ((JTextArea) ((JScrollPane) c[i]).getViewport().getComponent(0)).setText("");
            } else if (c[i] instanceof JComboBox) {
                JComboBox cb = (JComboBox) c[i];
                cb.setSelectedIndex(0);
            } else if (c[i] instanceof JCheckBox) {
                JCheckBox ckb = (JCheckBox) c[i];
                ckb.setSelected(false);
            } else if (c[i] instanceof JPasswordField) {
                JPasswordField field = (JPasswordField) c[i];
                field.setText(null);
            }
        }
    }
}
