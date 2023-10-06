-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: flml_corporation
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cad_funcionario`
--

DROP TABLE IF EXISTS `cad_funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cad_funcionario` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `tp_fj` char(1) NOT NULL,
  `nr_cpf_cnpj` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nm_cliente` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `fg_ativo` tinyint(1) NOT NULL,
  `nm_email` varchar(100) DEFAULT NULL,
  `nr_cep` char(8) NOT NULL,
  `ds_endereco` text,
  `sg_estado` char(2) NOT NULL,
  `nm_municipio` varchar(100) NOT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `cad_cliente_UN` (`nr_cpf_cnpj`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_funcionario`
--

LOCK TABLES `cad_funcionario` WRITE;
/*!40000 ALTER TABLE `cad_funcionario` DISABLE KEYS */;
INSERT INTO `cad_funcionario` VALUES (21,'F','12121212121','Update',0,'12131','13131212','1212121adsdadsad','SP','121'),(23,'F','12121212120','Felipe Pedroso de Lima',0,'teste','11222121','1212121212','AC','teste'),(24,'F','12343446546','adosdo',1,'adsdas','12134312','1211212','AC','dasdasd'),(25,'F','47151074816','Felipe Pedoros de Lima',1,'flima@jpti.com.br','13311390','Rua Araldo Rodrigues, 104','SP','Itu');
/*!40000 ALTER TABLE `cad_funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sistema_usuario`
--

DROP TABLE IF EXISTS `sistema_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sistema_usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nm_login` varchar(80) NOT NULL,
  `senha` varchar(32) NOT NULL,
  `nm_usuario` varchar(100) NOT NULL,
  `nm_email` varchar(80) GENERATED ALWAYS AS (`nm_login`) STORED,
  `fg_primeiro_acesso` tinyint(1) DEFAULT '1',
  `dh_upd` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `sistema_usuario_UN` (`nm_login`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sistema_usuario`
--

LOCK TABLES `sistema_usuario` WRITE;
/*!40000 ALTER TABLE `sistema_usuario` DISABLE KEYS */;
INSERT INTO `sistema_usuario` (`id_usuario`, `nm_login`, `senha`, `nm_usuario`, `fg_primeiro_acesso`, `dh_upd`) VALUES (4,'felipe.pedroso2108@gmail.com','2F33842A9CBD5A21DB627A43AAFA5A86','Felipe Pedroso de Lima',1,'2022-11-23 16:04:06'),(5,'luizobara@gmail.com','202CB962AC59075B964B07152D234B70','Luiz Obara',1,'2022-11-09 22:10:26'),(6,'lucashbotelho@hotmail.com','202CB962AC59075B964B07152D234B70','Lucas Botelho',1,'2022-11-22 10:37:07'),(8,'murilo@facens.br','202CB962AC59075B964B07152D234B70','Murilo Araujo',1,'2022-11-23 15:52:19');
/*!40000 ALTER TABLE `sistema_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'flml_corporation'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-23 16:06:23
