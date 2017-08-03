/*
Navicat MySQL Data Transfer

Source Server         : mysql-root
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : db_schoolangel

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-25 17:14:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for table_order
-- ----------------------------
DROP TABLE IF EXISTS `table_order`;
CREATE TABLE `table_order` (
  `ordernum` varchar(20) DEFAULT NULL,
  `apartment` int(11) DEFAULT NULL,
  `dorm` int(11) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `datetime` varchar(30) DEFAULT NULL,
  `foodnum` int(11) DEFAULT NULL,
  `money` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_order
-- ----------------------------
INSERT INTO `table_order` VALUES (null, '2', '568', '空间了', null, '12', null);
INSERT INTO `table_order` VALUES (null, '1', '2', '3', null, '4', null);
INSERT INTO `table_order` VALUES (null, '1', '2', '3', null, '4', null);
INSERT INTO `table_order` VALUES (null, '1', '2', '3', null, '4', null);
INSERT INTO `table_order` VALUES (null, '1', '2', '3', null, '4', null);
INSERT INTO `table_order` VALUES (null, '1', '2', '3', null, '4', null);
INSERT INTO `table_order` VALUES (null, '12', '23', 'SDR', null, '12', null);
INSERT INTO `table_order` VALUES (null, '123', '123', '123', null, '123', null);
SET FOREIGN_KEY_CHECKS=1;
