package testevaga.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_REDE_MT")
public class RedeMT {
	/*
	 * CREATE TABLE TB_REDE_MT (
	 * ID_REDE_MT     int(11) NOT NULL AUTO_INCREMENT, 
	 * ID_SUBESTACAO  int(11) NOT NULL, 
	 * CODIGO         varchar(5) NOT NULL UNIQUE, 
	 * NOME           varchar(100), 
	 * TENSAO_NOMINAL decimal(5, 2), 
	 * PRIMARY KEY (ID_REDE_MT));
	 * ALTER TABLE TB_REDE_MT ADD CONSTRAINT 
	 * FK_SUBESTACAO_REDE_MT FOREIGN KEY (ID_SUBESTACAO) 
	 * REFERENCES TB_SUBESTACAO (ID_SUBESTACAO) ON DELETE Cascade; 
	 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REDE_MT")
	private int idRedeMt;
	
	@Column(name = "CODIGO", nullable = false, length = 5, unique = true)
	private String codigo;
	
	@Column(name = "Nome", length = 100)
	private String nome;
	
	@Column(name = "TENSAO_NOMINAL", precision = 5, scale = 2)
	private double tensaoNominal;
}