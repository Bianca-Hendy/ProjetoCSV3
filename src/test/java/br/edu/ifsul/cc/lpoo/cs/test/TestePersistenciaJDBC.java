/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.cc.lpoo.cs.test;
import br.edu.ifsul.cc.lpoo.cs.model.dao.PersistenciaJDBC;
import org.junit.Test;
/**
 *
 * @author bianca.evangelista
 */
public class TestePersistenciaJDBC {
    @Test
    public void testarConexao() throws Exception {

        PersistenciaJDBC persistencia = new PersistenciaJDBC();

        if (persistencia.conexaoAberta()) {

            System.out.println("Conexao com o BD aberta utilizando JDBC");
            persistencia.fecharConexao();

        } else {
            System.out.println("Não abriu conexao via JDBC");
        }

    }
}
