CREATE TABLE recharge (
  id_recharge bigint NOT NULL AUTO_INCREMENT,
  estatus varchar(255) DEFAULT NULL,
  number bigint NOT NULL,
  operator enum('TIGO','MOVISTAR','COMCEL','UFF') NOT NULL,
  seller varchar(255) DEFAULT NULL,
  value double NOT NULL,
  transaction_date datetime(6) NOT NULL,
  type_recharge varchar(255) NOT NULL,
  PRIMARY KEY (id_recharge)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci