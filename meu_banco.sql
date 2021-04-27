-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.7.21-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para rest_with_spring_boot_udemy
CREATE DATABASE IF NOT EXISTS `rest_with_spring_boot_udemy` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rest_with_spring_boot_udemy`;

-- Copiando estrutura para tabela rest_with_spring_boot_udemy.campos_tabela_person
CREATE TABLE IF NOT EXISTS `campos_tabela_person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(100) NOT NULL,
  `first_name` varchar(90) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `last_name` varchar(90) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela rest_with_spring_boot_udemy.campos_tabela_person: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `campos_tabela_person` DISABLE KEYS */;
INSERT INTO `campos_tabela_person` (`id`, `address`, `first_name`, `gender`, `last_name`) VALUES
	(1, 'Cotia', 'Fagner', 'male', 'oliveira'),
	(2, 'São Paulo ', 'Otavio', 'feme', 'cristiano'),
	(3, 'Cotia', 'Santos Fagner', 'male', 'oliveira'),
	(4, 'Cotia', 'Santos Fagner', 'male', 'oliveira');
/*!40000 ALTER TABLE `campos_tabela_person` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
