///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package entidade;
//
//import java.io.Serializable;
//import java.util.Calendar;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
///**
// *
// * @author mateus
// */
//@Entity
//@Table(name = "permissoes")
//
//public class Permissao implements Serializable {
//
//    @Id
//    @SequenceGenerator(name = "PERMISSOES_SEQ", sequenceName = "seq_permissoes", allocationSize = 1, initialValue = 1)
//    @GeneratedValue(generator = "PERMISSOES_SEQ", strategy = GenerationType.SEQUENCE)
//
//    @JoinColumn(name = "usuario_id")
//    @ManyToOne
//    private Usuario usuario_id;
//
//    @Column(name = "permissao", length = 100, nullable = false)
//    private String permissao;
//
//    @Column(name = "slug", length = 200, nullable = false)
//    private String slug;
//
//    @Column(name = "criado_em", nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Calendar criadoEm;
//
//    @Column(name = "alterado_em", nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Calendar alteradoEm;
//
//    public Permissao() {
//    }
//
//    public Permissao(Permissao permissao) {
//        this.usuario_id = permissao.usuario_id;
//        this.permissao = permissao.permissao;
//        this.slug = permissao.slug;
//        this.criadoEm = permissao.criadoEm;
//        this.alteradoEm = permissao.alteradoEm;
//    }
//
//    public Usuario getUsuario_id() {
//        return usuario_id;
//    }
//
//    public void setUsuario_id(Usuario usuario_id) {
//        this.usuario_id = usuario_id;
//    }
//
//    public String getPermissao() {
//        return permissao;
//    }
//
//    public void setPermissao(String permissao) {
//        this.permissao = permissao;
//    }
//
//    public String getSlug() {
//        return slug;
//    }
//
//    public void setSlug(String slug) {
//        this.slug = slug;
//    }
//
//    public Calendar getCriadoEm() {
//        return criadoEm;
//    }
//
//    public void setCriadoEm(Calendar criadoEm) {
//        this.criadoEm = criadoEm;
//    }
//
//    public Calendar getAlteradoEm() {
//        return alteradoEm;
//    }
//
//    public void setAlteradoEm(Calendar alteradoEm) {
//        this.alteradoEm = alteradoEm;
//    }
//
//}
