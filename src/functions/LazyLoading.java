package functions;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public interface LazyLoading
{
    public void incrementaTabela(JTable tabela, int linhas);
    
    public void recarregaTabela(JTable tabela, int linhas);
    
    public void criaTabela(JTable tabela, JScrollPane barraScroll);
    
    public void scrollTable(JTable tabela, JScrollPane barraScroll);
    
    public void tabelaFiltro(JTable tabela, String filtro);
}
