/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.cc.lpoo.cs.test;

//import br.edu.ifsul.lpoo.trabalholpoo_2021_1.model.Jogador;

import br.edu.ifsul.cc.lpoo.cs.model.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author bianca.evangelista
 */
public class TestePersistenciaJPA {
    @Test 
    public void testarConexao() throws Exception {

        PersistenciaJPA persistencia = new PersistenciaJPA();

        if (persistencia.conexaoAberta()) {

            System.out.println("Conexão com o BD aberta utilizando JPA");
            persistencia.fecharConexao();

        } else {

            System.out.println("Não houve conesão via JPA");
        }
    }
}