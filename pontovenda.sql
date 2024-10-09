create database pontovenda;
use pontovenda;

CREATE TABLE `produtos` (
  `codigo_pro` varchar(100) NOT NULL,
  `tipo_pro` varchar(100) NOT NULL,
  `nome_pro` varchar(100) NOT NULL,
  `valor_pro` decimal(10,2) NOT NULL,
  `estoque` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `produtos` (`codigo_pro`, `tipo_pro`, `nome_pro`, `valor_pro`,`estoque`) VALUES
('PRO0001', 'BEBIDAS', 'COCA COLA', '4.00','50'),
('PRO0002', 'CARNES', 'FRANGO CONGELADO', '10.00','10'),
('PRO0003', 'LACTINEOS', 'IOGURTE', '6.00','99'),
('PRO0004', 'VERDURAS', 'ALFACE', '2.00','300');


CREATE TABLE `usuarios` (
  `codigo_us` varchar(50) NOT NULL,
  `nome_us` varchar(100) NOT NULL,
  `sexo_us` varchar(20) NOT NULL,
  `tipo_us` varchar(30) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `usuarios` (`codigo_us`, `nome_us`, `sexo_us`, `tipo_us`, `senha`) VALUES
('USU0003', 'ADM', 'MASCULINO', 'ADM', '123');


CREATE TABLE `vendas` (
  `numero_ven` varchar(30) NOT NULL,
  `total_ven` decimal(10,2) NOT NULL,
  `data_ven` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `vendas` (`numero_ven`, `total_ven`, `data_ven`) VALUES
('00000001', '30.00', '30/05/2018'),
('00000002', '6.00', '30/05/2018');

ALTER TABLE `produtos`
  ADD PRIMARY KEY (`codigo_pro`);


ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`codigo_us`);

ALTER TABLE `vendas`
  ADD PRIMARY KEY (`numero_ven`);
COMMIT;
