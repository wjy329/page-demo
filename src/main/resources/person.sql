/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : page_demo

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2018-12-10 16:28:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'wjy', '24');
INSERT INTO `person` VALUES ('2', 'wjy1', '25');
INSERT INTO `person` VALUES ('3', '25', '25');
INSERT INTO `person` VALUES ('4', 'wjy2', '25');
INSERT INTO `person` VALUES ('5', 'wjy3', '25');
INSERT INTO `person` VALUES ('6', 'wjy4', '26');
INSERT INTO `person` VALUES ('7', 'wjy5', '27');
INSERT INTO `person` VALUES ('8', 'wjy0', '24');
