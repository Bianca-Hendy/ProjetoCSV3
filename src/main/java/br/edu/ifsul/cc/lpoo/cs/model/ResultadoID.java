/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bianca.evangelista
 */

@Embeddable
public class ResultadoID implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "objetivo_id")
    private Objetivo objetivo;
    
    @ManyToOne
    @JoinColumn(name = "round_id")
    private Round round;
    
    
    public ResultadoID(){
        
    }
    
    
}