/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jonatas.ferreiraa
 */
@Entity
@Table(name = "produtos")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p")
    , @NamedQuery(name = "Produtos.findByCodigo", query = "SELECT p FROM Produtos p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Produtos.findByNomeProduto", query = "SELECT p FROM Produtos p WHERE p.nomeProduto = :nomeProduto")
    , @NamedQuery(name = "Produtos.findByPeso", query = "SELECT p FROM Produtos p WHERE p.peso = :peso")
    , @NamedQuery(name = "Produtos.findByEstoque", query = "SELECT p FROM Produtos p WHERE p.estoque = :estoque")
    , @NamedQuery(name = "Produtos.findByFornecedor", query = "SELECT p FROM Produtos p WHERE p.fornecedor = :fornecedor")
    , @NamedQuery(name = "Produtos.findByDescricao", query = "SELECT p FROM Produtos p WHERE p.descricao = :descricao")
    , @NamedQuery(name = "Produtos.findByDimensao", query = "SELECT p FROM Produtos p WHERE p.dimensao = :dimensao")
    , @NamedQuery(name = "Produtos.findByValor", query = "SELECT p FROM Produtos p WHERE p.valor = :valor")
    , @NamedQuery(name = "Produtos.findByEstoqueMinimo", query = "SELECT p FROM Produtos p WHERE p.estoqueMinimo = :estoqueMinimo")})
public class Produtos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "Nome_Produto")
    private String nomeProduto;
    @Basic(optional = false)
    @Column(name = "Peso")
    private String peso;
    @Basic(optional = false)
    @Column(name = "Estoque")
    private String estoque;
    @Basic(optional = false)
    @Column(name = "Fornecedor")
    private String fornecedor;
    @Basic(optional = false)
    @Column(name = "Descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "Dimensao")
    private String dimensao;
    @Basic(optional = false)
    @Column(name = "Valor")
    private String valor;
    @Basic(optional = false)
    @Column(name = "EstoqueMinimo")
    private String estoqueMinimo;

    public Produtos() {
    }

    public Produtos(Integer codigo) {
        this.codigo = codigo;
    }

    public Produtos(Integer codigo, String nomeProduto, String peso, String estoque, String fornecedor, String descricao, String dimensao, String valor, String estoqueMinimo) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.peso = peso;
        this.estoque = estoque;
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.dimensao = dimensao;
        this.valor = valor;
        this.estoqueMinimo = estoqueMinimo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(String estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JFrames.Produtos[ codigo=" + codigo + " ]";
    }
    
}
