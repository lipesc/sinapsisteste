package testevaga.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_SUBESTACAO")
public class Subestacao {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SUBESTACAO")
	private Integer idSubestacao;
	
	@Column(name = "CODIGO", length = 3, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "NOME", length = 100)
	private String nome;
	
	@Column(name ="LATITUDE", precision = 15, scale = 13, nullable = false )
	private BigDecimal latitude;
	
	@Column(name = "LONGITUDE", precision = 15, scale = 13)
	private BigDecimal longitude;
	
	@OneToMany(mappedBy = "subestacao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<RedeMT> redesMT = new ArrayList<RedeMT>();
	
	

	public Subestacao() {}
	
	
	public Subestacao(Integer idSubestacao, String codigo, String nome, BigDecimal latitude, BigDecimal longitude) {
		super();
		this.idSubestacao = idSubestacao;
		this.codigo = codigo;
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	
	public Integer getIdSubestacao() {
		return idSubestacao;
	}

	public void setIdSubestacao(Integer idSubestacao) {
		this.idSubestacao = idSubestacao;
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

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	
	public List<RedeMT> getRedesMT() {
		return redesMT;
	}


	public void setRedesMT(List<RedeMT> redesMT) {
		this.redesMT = redesMT;
	}


	
	
}
