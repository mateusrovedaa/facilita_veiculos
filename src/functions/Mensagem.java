/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author hukers
 */
public class Mensagem {

    /**
     * Método privado para geração de mensagens do sistema
     *
     * @param titulo mensagem a ser exibida no topo da tela
     * @param mensagem mensagem a ser exibida no conteudo da caixa de dialogo
     * @param tipo padrãoo de mensagens <b>JOptionPane<b>
     */
    private static void mensagem(String titulo, String mensagem, int tipo, Component localizacao) {
        JOptionPane.showMessageDialog(localizacao, mensagem, titulo, tipo);
    }

    private static int mensagemC(String titulo, String mensagem, int tipo, Component localizacao) {
        int escolha = JOptionPane.showConfirmDialog(localizacao, mensagem, titulo, tipo);
        return escolha;
    }

    public static void aviso(String mensagem, Component localizacao) {
        mensagem("Aviso", mensagem, JOptionPane.WARNING_MESSAGE, localizacao);
    }

    public static void informacao(String mensagem, Component localizacao) {
        mensagem("Informação", mensagem, JOptionPane.INFORMATION_MESSAGE, localizacao);
    }

    /**
     * Metodo para exibisão de mensagens de errro
     *
     * @param mensagem mensagem a ser exibida na tela
     * @param localizacao
     */
    public static void erro(String mensagem, Component localizacao) {
        mensagem("Erro", mensagem, JOptionPane.ERROR_MESSAGE, localizacao);
    }

    public static int confirmacao(String mensagem, Component localizacao) {
       return mensagemC("Confirmação", mensagem, JOptionPane.YES_NO_CANCEL_OPTION, localizacao);
    }
}
