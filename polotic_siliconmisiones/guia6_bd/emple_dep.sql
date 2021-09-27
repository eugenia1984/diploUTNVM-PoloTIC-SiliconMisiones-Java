-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-09-2021 a las 01:25:01
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `emple_dep`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `id_departamento` int(11) NOT NULL,
  `nombre_departamento` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(35) COLLATE utf8_spanish_ci NOT NULL,
  `departamento` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`id_departamento`, `nombre_departamento`, `direccion`, `departamento`) VALUES
(1, 'ventas ', 'Avenida de Mayo 2022 1 A', 'ventas nacionales'),
(2, 'contabilidad', 'Peru 1020 5 C', 'contabilidad'),
(3, 'administracion', 'Brasil 5698 4 C', 'contabilidad'),
(4, 'gerencia', 'Brasil 5698 4 D', 'gerencia'),
(5, 'ventas ', 'id_departamento', 'ventas internacionales');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `nro_legajo` int(11) NOT NULL,
  `dni` int(8) NOT NULL,
  `apellido` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `fecha_incorporacion` date NOT NULL,
  `cargo` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `sueldo_neto` double NOT NULL,
  `id_departamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`nro_legajo`, `dni`, `apellido`, `nombre`, `fecha_nacimiento`, `fecha_incorporacion`, `cargo`, `sueldo_neto`, `id_departamento`) VALUES
(1, 31158798, 'Costa', 'Maria Eugenia', '1984-09-01', '2021-08-10', 'ventas', 50000, 1),
(2, 27895689, 'Bruni', 'Sandro', '1998-02-03', '2020-01-05', 'administracion', 70000, 3),
(3, 95786158, 'Sanchez', 'Jorge', '1968-05-04', '2008-05-02', 'administracion', 80000, 3),
(4, 28967589, 'Rodriguez', 'Marcos', '1980-05-01', '2008-05-02', 'gerente', 80000, 4),
(5, 98756845, 'Martinez', 'Maria', '1986-05-02', '2005-05-08', 'gerente', 260000, 4),
(6, 95784359, 'Thomson', 'Thomas', '1986-01-02', '2009-05-12', 'ventas internacionales', 153000, 5),
(7, 93458657, 'Root', 'Martin', '1978-09-01', '2018-05-02', 'vendedor', 80000, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`id_departamento`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`nro_legajo`),
  ADD KEY `id_departamento` (`id_departamento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `nro_legajo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `id_departamento` FOREIGN KEY (`id_departamento`) REFERENCES `departamentos` (`id_departamento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
