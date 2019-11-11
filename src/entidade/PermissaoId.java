/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author mateus
 */
@Embeddable
public class PermissaoId implements Serializable {

    @JoinColumn(name = "usuario_id")
    @ManyToOne
    private Usuario usuario_id;

    @Column(name = "permissao", length = 100, nullable = false)
    private String permissao;
    
    @Column(name = "tela", length = 100, nullable = false)
    private String tela;

    public PermissaoId() {
    }

    public PermissaoId(PermissaoId permissao) {
        this.usuario_id = permissao.usuario_id;
        this.permissao = permissao.permissao;
        this.tela = permissao.tela;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    
//        @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 83 * hash + Objects.hashCode(this.id);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final PermissaoId other = (PermissaoId) obj;
//        if (!Objects.equals(this., other.id)) {
//            return false;
//        }
//        return true;
//    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

}
