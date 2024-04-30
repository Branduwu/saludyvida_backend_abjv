-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: salud_y_vida
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carrito_compras`
--

DROP TABLE IF EXISTS `carrito_compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carrito_compras` (
  `id_carrito` bigint NOT NULL,
  `fecha_actualizacion` datetime DEFAULT NULL,
  `usuarios_id_usuarios` bigint NOT NULL,
  PRIMARY KEY (`id_carrito`,`usuarios_id_usuarios`),
  KEY `fk_carrito_compras_usuarios1_idx` (`usuarios_id_usuarios`),
  CONSTRAINT `fk_carrito_compras_usuarios1` FOREIGN KEY (`usuarios_id_usuarios`) REFERENCES `usuarios` (`id_usuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrito_compras`
--

LOCK TABLES `carrito_compras` WRITE;
/*!40000 ALTER TABLE `carrito_compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `carrito_compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carrito_compras_has_lentes`
--

DROP TABLE IF EXISTS `carrito_compras_has_lentes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carrito_compras_has_lentes` (
  `id_carrito` bigint NOT NULL,
  `id_lentes` bigint NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`id_carrito`,`id_lentes`),
  KEY `fk_carrito_compras_has_lentes_lentes1_idx` (`id_lentes`),
  KEY `fk_carrito_compras_has_lentes_carrito_compras1_idx` (`id_carrito`),
  CONSTRAINT `fk_carrito_compras_has_lentes_carrito_compras1` FOREIGN KEY (`id_carrito`) REFERENCES `carrito_compras` (`id_carrito`),
  CONSTRAINT `fk_carrito_compras_has_lentes_lentes1` FOREIGN KEY (`id_lentes`) REFERENCES `lentes` (`id_lentes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrito_compras_has_lentes`
--

LOCK TABLES `carrito_compras_has_lentes` WRITE;
/*!40000 ALTER TABLE `carrito_compras_has_lentes` DISABLE KEYS */;
/*!40000 ALTER TABLE `carrito_compras_has_lentes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `id_categorias` bigint NOT NULL AUTO_INCREMENT,
  `material` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_categorias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `citas`
--

DROP TABLE IF EXISTS `citas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citas` (
  `id_citas` bigint NOT NULL AUTO_INCREMENT,
  `usuarios_id_usuarios` bigint NOT NULL,
  `fecha_hora_cita` datetime NOT NULL,
  PRIMARY KEY (`id_citas`,`usuarios_id_usuarios`),
  KEY `fk_citas_usuarios1_idx` (`usuarios_id_usuarios`),
  CONSTRAINT `fk_citas_usuarios1` FOREIGN KEY (`usuarios_id_usuarios`) REFERENCES `usuarios` (`id_usuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citas`
--

LOCK TABLES `citas` WRITE;
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras` (
  `id_compras` bigint NOT NULL AUTO_INCREMENT,
  `Id_usuario` bigint NOT NULL,
  `id_tipo_pago` bigint NOT NULL,
  `fecha_compra` datetime NOT NULL,
  `pago_total` bigint NOT NULL,
  PRIMARY KEY (`id_compras`,`Id_usuario`,`id_tipo_pago`),
  KEY `fk_compras_usuarios1_idx` (`Id_usuario`),
  KEY `fk_compras_tipos de pago1_idx` (`id_tipo_pago`),
  CONSTRAINT `fk_compras_tipos de pago1` FOREIGN KEY (`id_tipo_pago`) REFERENCES `tipos de pago` (`id_tipo_pago`),
  CONSTRAINT `fk_compras_usuarios1` FOREIGN KEY (`Id_usuario`) REFERENCES `usuarios` (`id_usuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras_has_lentes`
--

DROP TABLE IF EXISTS `compras_has_lentes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras_has_lentes` (
  `compras_id_compras` bigint NOT NULL,
  `lentes_id_lentes` bigint NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`compras_id_compras`,`lentes_id_lentes`,`cantidad`),
  KEY `fk_compras_has_lentes_lentes1_idx` (`lentes_id_lentes`),
  KEY `fk_compras_has_lentes_compras1_idx` (`compras_id_compras`),
  CONSTRAINT `fk_compras_has_lentes_compras1` FOREIGN KEY (`compras_id_compras`) REFERENCES `compras` (`id_compras`),
  CONSTRAINT `fk_compras_has_lentes_lentes1` FOREIGN KEY (`lentes_id_lentes`) REFERENCES `lentes` (`id_lentes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras_has_lentes`
--

LOCK TABLES `compras_has_lentes` WRITE;
/*!40000 ALTER TABLE `compras_has_lentes` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras_has_lentes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direcciones`
--

DROP TABLE IF EXISTS `direcciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `direcciones` (
  `id_direcciones` bigint NOT NULL AUTO_INCREMENT,
  `usuarios_id_usuarios` bigint NOT NULL,
  `calle` varchar(100) NOT NULL,
  `colonia` varchar(100) NOT NULL,
  `municipio_alcaldia` varchar(100) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `codigo_postal` varchar(10) NOT NULL,
  PRIMARY KEY (`id_direcciones`,`usuarios_id_usuarios`),
  KEY `fk_direcciones_usuarios1_idx` (`usuarios_id_usuarios`),
  CONSTRAINT `fk_direcciones_usuarios1` FOREIGN KEY (`usuarios_id_usuarios`) REFERENCES `usuarios` (`id_usuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direcciones`
--

LOCK TABLES `direcciones` WRITE;
/*!40000 ALTER TABLE `direcciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `direcciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lentes`
--

DROP TABLE IF EXISTS `lentes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lentes` (
  `id_lentes` bigint NOT NULL AUTO_INCREMENT,
  `nombre_lentes` varchar(50) NOT NULL,
  `url_imagen` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `descripcion` varchar(500) NOT NULL,
  `largo` varchar(10) NOT NULL,
  `ancho` varchar(10) NOT NULL,
  `alto` varchar(10) NOT NULL,
  `modelo_producto` varchar(10) NOT NULL,
  `sku` varchar(50) NOT NULL,
  `precio` decimal(9,2) NOT NULL,
  PRIMARY KEY (`id_lentes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lentes`
--

LOCK TABLES `lentes` WRITE;
/*!40000 ALTER TABLE `lentes` DISABLE KEYS */;
/*!40000 ALTER TABLE `lentes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lentes_has_categorias`
--

DROP TABLE IF EXISTS `lentes_has_categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lentes_has_categorias` (
  `lentes_id_lentes` bigint NOT NULL,
  `categorias_id_categorias` bigint NOT NULL,
  PRIMARY KEY (`lentes_id_lentes`,`categorias_id_categorias`),
  KEY `fk_lentes_has_categorias_categorias1_idx` (`categorias_id_categorias`),
  KEY `fk_lentes_has_categorias_lentes1_idx` (`lentes_id_lentes`),
  CONSTRAINT `fk_lentes_has_categorias_categorias1` FOREIGN KEY (`categorias_id_categorias`) REFERENCES `categorias` (`id_categorias`),
  CONSTRAINT `fk_lentes_has_categorias_lentes1` FOREIGN KEY (`lentes_id_lentes`) REFERENCES `lentes` (`id_lentes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lentes_has_categorias`
--

LOCK TABLES `lentes_has_categorias` WRITE;
/*!40000 ALTER TABLE `lentes_has_categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `lentes_has_categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarjetas`
--

DROP TABLE IF EXISTS `tarjetas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjetas` (
  `id_tarjeta` bigint NOT NULL,
  `numero_tarjeta` varchar(16) NOT NULL,
  `expiracion` varchar(10) NOT NULL,
  `direccion_tarjeta` varchar(45) DEFAULT NULL,
  `usuarios_id_usuarios` bigint NOT NULL,
  PRIMARY KEY (`id_tarjeta`,`usuarios_id_usuarios`),
  KEY `fk_tarjetas_usuarios1_idx` (`usuarios_id_usuarios`),
  CONSTRAINT `fk_tarjetas_usuarios1` FOREIGN KEY (`usuarios_id_usuarios`) REFERENCES `usuarios` (`id_usuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarjetas`
--

LOCK TABLES `tarjetas` WRITE;
/*!40000 ALTER TABLE `tarjetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tarjetas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_usuario` (
  `id_tipo` bigint NOT NULL AUTO_INCREMENT,
  `rol` varchar(30) NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos de pago`
--

DROP TABLE IF EXISTS `tipos de pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos de pago` (
  `id_tipo_pago` bigint NOT NULL,
  `descripcion_tipo_pago` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_pago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos de pago`
--

LOCK TABLES `tipos de pago` WRITE;
/*!40000 ALTER TABLE `tipos de pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipos de pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuarios` bigint NOT NULL AUTO_INCREMENT,
  `id_tipo` bigint NOT NULL,
  `nombres` varchar(60) NOT NULL,
  `apellidos` varchar(60) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `genero` varchar(10) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  `estatus` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_usuarios`,`id_tipo`),
  UNIQUE KEY `correo_UNIQUE` (`correo`),
  KEY `fk_usuarios_tipo_usuario_idx` (`id_tipo`),
  CONSTRAINT `fk_usuarios_tipo_usuario` FOREIGN KEY (`id_tipo`) REFERENCES `tipo_usuario` (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-30  5:53:13
