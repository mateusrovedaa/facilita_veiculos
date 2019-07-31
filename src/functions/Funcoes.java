package functions;

import javax.swing.JTable;

public class Funcoes {

    public void limparCheckTabela(JTable tabela) {

        for (int i = 0; i < tabela.getRowCount(); i++) {

            boolean selecionado = tabela.getValueAt(i, 0) == null ? false : true;

            if (selecionado) {
                tabela.setValueAt(false, i, 0);
            }
        }
    }
}
