/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author bianca.evangelista
 */
@Entity()
@Table(name = "tb_resulado")
public class Resultado {
    
    @EmbeddedId
    private ResultadoID id;        
    
    private Status status;
    
    public Resultado(){
        
    }
    
}