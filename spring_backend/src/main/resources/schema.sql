CREATE TABLE TB_SUBESTACAO (
  ID_SUBESTACAO int(11) NOT NULL AUTO_INCREMENT, 
  CODIGO        varchar(3) NOT NULL UNIQUE, 
  NOME          varchar(100), 
  LATITUDE      decimal(15, 13) NOT NULL, 
  LONGITUDE     decimal(15, 13), 
  PRIMARY KEY (ID_SUBESTACAO));
  
CREATE TABLE TB_REDE_MT (
  ID_REDE_MT     int(11) NOT NULL AUTO_INCREMENT, 
  ID_SUBESTACAO  int(11) NOT NULL, 
  CODIGO         varchar(5) NOT NULL UNIQUE, 
  NOME           varchar(100), 
  TENSAO_NOMINAL decimal(5, 2), 
  PRIMARY KEY (ID_REDE_MT));

ALTER TABLE TB_REDE_MT ADD CONSTRAINT FK_SUBESTACAO_REDE_MT FOREIGN KEY (ID_SUBESTACAO) REFERENCES TB_SUBESTACAO (ID_SUBESTACAO) ON DELETE Cascade;