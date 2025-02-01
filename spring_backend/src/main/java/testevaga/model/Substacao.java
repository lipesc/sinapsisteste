package testevaga.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_SUBESTACAO")
public class Substacao {
/*
 * ID_SUBESTACAO int(11) NOT NULL AUTO_INCREMENT, 
 *CODIGO        varchar(3) NOT NULL UNIQUE, 
 *NOME          varchar(100), 
 *LATITUDE      decimal(15, 13) NOT NULL, 
 *LONGITUDE     decimal(15, 13), 
 *PRIMARY KEY (ID_SUBESTACAO)); 
 * */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SUBESTACAO", length = 11)
	private int idSubstacao;
	
	@Column(name = "CODIGO", length = 3, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "NOME", length = 100)
	private String nome;
	
	@Column(name ="LATITUDE", precision = 15, scale = 13, nullable = false )
	private double latitude;
	
	@Column(name = "LONGITUDE", precision = 15, scale = 13)
	private Double LONGITUDE;

	public Substacao(int idSubstacao, String codigo, String nome, double latitude, Double lONGITUDE) {
		super();
		this.idSubstacao = idSubstacao;
		this.codigo = codigo;
		this.nome = nome;
		this.latitude = latitude;
		LONGITUDE = lONGITUDE;
	}

	public int getIdSubstacao() {
		return idSubstacao;
	}

	public void setIdSubstacao(int idSubstacao) {
		this.idSubstacao = idSubstacao;
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

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public Double getLONGITUDE() {
		return LONGITUDE;
	}

	public void setLONGITUDE(Double lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}
	
	
	
	
}
