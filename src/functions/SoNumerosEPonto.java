/*
 Autor: Mateus Roveda
 Data: 20/02/2019
 Projeto: ASSIPED (programa gerenciador de pedidos)
 */

package functions;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class SoNumerosEPonto extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9,]", ""), a);
    }

}
