-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 26, 2021 at 06:39 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jspweb`
--

-- --------------------------------------------------------

--
-- Table structure for table `books_tbl`
--

DROP TABLE IF EXISTS `books_tbl`;
CREATE TABLE IF NOT EXISTS `books_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_tuthr` varchar(200) NOT NULL,
  `book_name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books_tbl`
--

INSERT INTO `books_tbl` (`id`, `book_tuthr`, `book_name`) VALUES
(1, 'Author 01  ', 'Book 01'),
(2, 'Author 02', 'Book 02'),
(3, 'Author 03', 'Book 03'),
(4, 'Author 04', 'Book 04'),
(5, 'author1234', 'book1234'),
(6, 'Saadu', 'Achchariya manusayo'),
(7, 'Adrew Samuakls', 'BookWorld'),
(8, 'author1234asdf', 'book1234sdf'),
(9, 'Adrew Samuaklsasad', 'BookWorlddas'),
(10, 'author1234asdadadasd', 'book1234asdasd'),
(11, 'author1234asdads', 'book1234adasd'),
(12, 'author1234222222', 'book123422222'),
(13, 'Mr P', 'NewAdded'),
(14, 'Mr S P', 'NewAdded 02'),
(22, 'Pulasthi Bethmage', 'Java and Spring Boot Concepts'),
(21, 'Mr Leela', 'Kuma');

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

DROP TABLE IF EXISTS `user_login`;
CREATE TABLE IF NOT EXISTS `user_login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(100) NOT NULL,
  `u_pass` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`id`, `u_name`, `u_pass`) VALUES
(1, 'pula', '123'),
(2, 'sadi', '1234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
