-- Copiando estrutura para tabela rest_with_spring_boot_udemy.campos_tabela_person
CREATE TABLE IF NOT EXISTS `campos_tabela_person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(100) NOT NULL,
  `first_name` varchar(90) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `last_name` varchar(90) NOT NULL,
  PRIMARY KEY (`id`)
)