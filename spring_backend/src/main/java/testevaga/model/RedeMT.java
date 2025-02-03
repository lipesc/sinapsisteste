package testevaga.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_REDE_MT")
public class RedeMT {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REDE_MT")
	private Integer idRedeMt;
	
	@Column(name = "CODIGO", nullable = false, length = 5, unique = true)
	private String codigo;
	
	@Column(name = "Nome", length = 100)
	private String nome;
	
	@Column(name = "TENSAO_NOMINAL", precision = 5, scale = 2)
	private BigDecimal tensaoNominal;
	
	@ManyToOne
	@JoinColumn(name = "ID_SUBESTACAO", nullable = false)
	private Subestacao subestacao;

	public RedeMT() {}
	
	public RedeMT(Integer idRedeMt, String codigo, String nome, BigDecimal tensaoNominal, Subestacao subestacao) {
        this.idRedeMt = idRedeMt;
        this.codigo = codigo;
        this.nome = nome;
        this.tensaoNominal = tensaoNominal;
        this.subestacao = subestacao;
    }
    public Integer getIdRedeMt() {
        return idRedeMt;
    }

    public void setIdRedeMt(Integer idRedeMt) {
        this.idRedeMt = idRedeMt;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getTensaoNominal() {
        return tensaoNominal;
    }

    public void setTensaoNominal(BigDecimal tensaoNominal) {
        this.tensaoNominal = tensaoNominal;
    }

    public Subestacao getSubestacao() {
        return subestacao;
    }

    public void setSubestacao(Subestacao subestacao) {
        this.subestacao = subestacao;
    }
	
	
}