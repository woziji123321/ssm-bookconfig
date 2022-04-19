/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80026
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 80026
File Encoding         : 65001

Date: 2022-04-19 17:05:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_book
-- ----------------------------
DROP TABLE IF EXISTS `tb_book`;
CREATE TABLE `tb_book` (
  `id` int DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `press` varchar(32) DEFAULT NULL,
  `author` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_book
-- ----------------------------
INSERT INTO `tb_book` VALUES ('1', 'Java EE企业应用开发教程', '人民邮电出版社', '自学程序员');
