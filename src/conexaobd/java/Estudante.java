/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd.java;

/**
 *
 * @author fred
 */
public class Estudante {
    String nome;
    String  curso;

    public Estudante(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Estudante() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
