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
	
	
}
