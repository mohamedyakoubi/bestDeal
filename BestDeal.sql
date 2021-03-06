-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Sam 01 Mars 2014 à 13:40
-- Version du serveur: 5.5.25
-- Version de PHP: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `bestdeal`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE IF NOT EXISTS `administrateur` (
  `Id` int(1) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `e_mail` varchar(100) NOT NULL,
  `mot_de_passe` varchar(100) NOT NULL,
  `pseudo` varchar(50) NOT NULL,
  `sexe` varchar(5) DEFAULT 'Homme',
  `CIN` int(50) NOT NULL,
  `Numero_Telephone` int(50) NOT NULL,
  `Date_de_naissance` date DEFAULT NULL,
  `image_profil` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Contenu de la table `administrateur`
--

INSERT INTO `administrateur` (`Id`, `Nom`, `Prenom`, `e_mail`, `mot_de_passe`, `pseudo`, `sexe`, `CIN`, `Numero_Telephone`, `Date_de_naissance`, `image_profil`) VALUES
(26, 'fathia ', 'yakoubi', 'yakoubi_fathia@hotmail.fr', '23536534', 'ftouh', 'Femme', 11853171, 97107569, '2014-05-06', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `Id` int(1) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `mot_de_passe` varchar(50) NOT NULL,
  `e-mail` varchar(100) NOT NULL,
  `pseudo` varchar(50) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `CIN` int(50) NOT NULL,
  `Age` int(2) NOT NULL,
  `Sexe` varchar(5) NOT NULL,
  `Phone_Number` int(20) NOT NULL,
  `Gouvernaurat` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `client`
--


-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE IF NOT EXISTS `commande` (
  `Id` int(20) NOT NULL AUTO_INCREMENT,
  `reference` varchar(50) NOT NULL,
  `Date_Commande` date NOT NULL,
  `Type` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `commande`
--


-- --------------------------------------------------------

--
-- Structure de la table `commerçant`
--

CREATE TABLE IF NOT EXISTS `commerçant` (
  `Id` int(20) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) NOT NULL,
  `Prenom` varchar(50) NOT NULL,
  `Pseudo` varchar(50) NOT NULL,
  `mot_de_passe` varchar(50) NOT NULL,
  `e_mail` varchar(100) NOT NULL,
  `Adresse` varchar(100) NOT NULL,
  `Age` int(2) NOT NULL,
  `Sexe` varchar(5) NOT NULL,
  `CIN` int(20) NOT NULL,
  `Numero_telephone` int(20) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `commerçant`
--


-- --------------------------------------------------------

--
-- Structure de la table `deal`
--

CREATE TABLE IF NOT EXISTS `deal` (
  `Id` int(20) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Date_Creation` date NOT NULL,
  `Date_limite` date NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Reference` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `deal`
--


-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `Id` int(20) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Description_Produit` varchar(100) NOT NULL,
  `Prix_Produit` float NOT NULL,
  `Remise` float NOT NULL,
  `Quantite_init` int(50) NOT NULL,
  `Quantite_dispo` int(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `produit`
--


-- --------------------------------------------------------

--
-- Structure de la table `voucher`
--

CREATE TABLE IF NOT EXISTS `voucher` (
  `Id` int(20) NOT NULL AUTO_INCREMENT,
  `Nom_Client` varchar(50) NOT NULL,
  `Nom_Produit` varchar(50) NOT NULL,
  `Refernce_Produit` varchar(50) NOT NULL,
  `Prix_Final` float NOT NULL,
  `Adresse_Depot` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `voucher`
--

