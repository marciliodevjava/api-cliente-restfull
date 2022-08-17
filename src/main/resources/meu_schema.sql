CREATE TABLE TB_CLIENTE (
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	NOME VARCHAR(200),
	CPF VARCHAR(11)
);

CREATE TABLE TB_PRODUTO (
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	DESCRICAO VARCHAR(200),
	PRECO_UNITARIO NUMERIC(20,2)
);

CREATE TABLE TB_PEDIDO (
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	CLIENTE_ID INTEGER REFERENCES CLIENTE (ID),
	DATA_PEDIDO TIMESTAMP,
	STATUS VARCHAR(20),
	TOTAL NUMERIC(20,2)
);

CREATE TABLE TB_ITEM_PEDIDO (
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	PEDIDO_ID INTEGER REFERENCES PEDIDO (ID),
	PRODUTO_ID INTEGER REFERENCES PRODUTO (ID),
	QUANTIDADE INTEGER
);

CREATE TABLE USUARIO(
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	LOGIN VARCHAR(50) NOT NULL,
	SENHA VARCHAR(255) NOT NULL,
	ADMIN BOOL DEFAULT FALSE
);