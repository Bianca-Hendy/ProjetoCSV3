package br.edu.ifsul.cc.lpoo.cs.model;
import br.edu.ifsul.cc.lpoo.cs.model.Artefato;
import br.edu.ifsul.cc.lpoo.cs.model.Compra;
import br.edu.ifsul.cc.lpoo.cs.model.Patente;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bianca.evangelista
 */
@Entity
@Table (name = "tb_jogador")
public class Jogador implements Serializable{
    
    @Id
    private String nickname;
    
    @Column(length = 6, nullable = false)
    private String senha;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_cadastro;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_ultimo_login;
    
    @Column(nullable = false)
    private Integer pontos;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_artefatos", joinColumns = {@JoinColumn(name = "jogador_nickname")}, 
                                       inverseJoinColumns = {@JoinColumn(name = "artefato_id")})
    private List<Artefato> artefatos; //agregação

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_patentes", joinColumns = {@JoinColumn(name = "jogador_nickname")}, 
                                       inverseJoinColumns = {@JoinColumn(name = "patente_id")})
    private List<Patente> patentes; //agregação
    
    @OneToMany(mappedBy = "jogador")
    private List<Compra> compras;
    
    @ManyToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;
    
    public Jogador() {
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    /**
     * @return the pontos
     */
    public Integer getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    /**
     * @return the patentes
     */
    public List <Patente> getPatentes() {
        return patentes;
    }

    /**
     * @param patentes the patentes to set
     */
    public void setPatentes(List <Patente> patentes) {
        this.patentes = patentes;
    }

    /**
     * @return the compras
     */
    public List <Compra> getCompras() {
        return compras;
    }

    /**
     * @param compras the compras to set
     */
    public void setCompras(List <Compra> compras) {
        this.compras = compras;
    }

    /**
     * @return the artefatos
     */
    public List <Artefato> getArtefatos() {
        return artefatos;
    }

    /**
     * @param artefatos the artefatos to set
     */
    public void setArtefatos(List <Artefato> artefatos) {
        this.artefatos = artefatos;
    }
    
    public void setArtefato(Artefato artefato) {
        
        if(this.artefatos == null){
            this.artefatos = new ArrayList();
        }
        
        this.artefatos.add(artefato);
    } 

    /**
     * @return the data_cadastro
     */
    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    /**
     * @return the data_ultimo_login
     */
    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    /**
     * @param data_ultimo_login the data_ultimo_login to set
     */
    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }
}
