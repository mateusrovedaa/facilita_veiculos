package functions;

import dao.MarcaDao;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GerenciarJTable
{
    public int obterValorUltimaLinha(JTable model)
    {
        for (int i = model.getRowCount() - 1; i > 0; i--)
        {
            if (model.getValueAt(i, 0) != null)
            {
                return (Integer) model.getValueAt(i, 0);
            }
        }

        return 1000000000;
    }

    public int obterValorPrimeiraLinha(JTable model)
    {
        for (int i = 0; i < model.getRowCount(); i++)
        {
            if (model.getValueAt(i, 0) != null)
            {
                return (Integer) model.getValueAt(i, 0);
            }
        }

        return 0;
    }
}
