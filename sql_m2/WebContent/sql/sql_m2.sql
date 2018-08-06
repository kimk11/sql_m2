-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        5.5.32 - MySQL Community Server (GPL)
-- 서버 OS:                        Win32
-- HeidiSQL 버전:                  8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- sql_m2 의 데이터베이스 구조 덤핑
CREATE DATABASE IF NOT EXISTS `sql_m2` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sql_m2`;


-- 테이블 sql_m2의 구조를 덤프합니다. cake
CREATE TABLE IF NOT EXISTS `cake` (
  `name` varchar(50) DEFAULT NULL,
  `price` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table sql_m2.cake: ~4 rows (대략적)
/*!40000 ALTER TABLE `cake` DISABLE KEYS */;
INSERT INTO `cake` (`name`, `price`) VALUES
	('시폰', 2300),
	('몽블랑', 3000),
	('푸딩', 1800),
	('치즈', 2500);
/*!40000 ALTER TABLE `cake` ENABLE KEYS */;


-- 테이블 sql_m2의 구조를 덤프합니다. stock
CREATE TABLE IF NOT EXISTS `stock` (
  `code` int(10) DEFAULT NULL,
  `arrival` int(10) DEFAULT NULL,
  `shipment` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table sql_m2.stock: ~4 rows (대략적)
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` (`code`, `arrival`, `shipment`) VALUES
	(11, 20, 17),
	(12, 30, 23),
	(11, 48, 36),
	(12, 34, 12);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
