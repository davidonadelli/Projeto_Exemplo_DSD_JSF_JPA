/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.Objects;
import javax.faces.bean.ViewScoped;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author UsuarioGeral
 */
@javax.persistence.Entity
@ViewScoped
public class Professor implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String titulacao;
    private Integer anoContratacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Integer getAnocontratacao() {
        return anoContratacao;
    }

    public void setAnocontratacao(Integer anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
}
