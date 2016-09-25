-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.20 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 labmaster 的数据库结构
DROP DATABASE IF EXISTS `labmaster`;
CREATE DATABASE IF NOT EXISTS `labmaster` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `labmaster`;


-- 导出  表 labmaster.department 结构
DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '双亲ID',
  `name` varchar(100) DEFAULT NULL COMMENT '部门名称',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `deleted_mark` int(11) NOT NULL COMMENT '标记删除（1：有效，0：无效）',
  `meta_created` datetime NOT NULL COMMENT '创建时间',
  `meta_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门';

-- 正在导出表  labmaster.department 的数据：~0 rows (大约)
DELETE FROM `department`;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;


-- 导出  表 labmaster.menu 结构
DROP TABLE IF EXISTS `menu`;
CREATE TABLE IF NOT EXISTS `menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '双亲ID',
  `name` varchar(100) DEFAULT NULL COMMENT '菜单名称',
  `description` varchar(100) DEFAULT NULL COMMENT '描述',
  `url` varchar(500) DEFAULT NULL COMMENT '链接',
  `level` int(11) DEFAULT NULL COMMENT '层级',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `deleted_mark` int(11) NOT NULL COMMENT '标记删除（1：有效，0：无效）',
  `meta_created` datetime NOT NULL COMMENT '创建时间',
  `meta_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单';

-- 正在导出表  labmaster.menu 的数据：~0 rows (大约)
DELETE FROM `menu`;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;


-- 导出  表 labmaster.role 结构
DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `deleted_mark` int(11) NOT NULL COMMENT '标记删除（1：有效，0：无效）',
  `meta_created` datetime NOT NULL COMMENT '创建时间',
  `meta_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色';

-- 正在导出表  labmaster.role 的数据：~0 rows (大约)
DELETE FROM `role`;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;


-- 导出  表 labmaster.role_menu 结构
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE IF NOT EXISTS `role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `deleted_mark` int(11) NOT NULL COMMENT '标记删除（1：有效，0：无效）',
  `meta_created` datetime NOT NULL COMMENT '创建时间',
  `meta_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色菜单对应关系表';

-- 正在导出表  labmaster.role_menu 的数据：~0 rows (大约)
DELETE FROM `role_menu`;
/*!40000 ALTER TABLE `role_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_menu` ENABLE KEYS */;


-- 导出  表 labmaster.user 结构
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `attributes` varchar(1000) DEFAULT NULL COMMENT '属性（Json）',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `deleted_mark` int(11) NOT NULL COMMENT '标记删除（1：有效，0：无效）',
  `meta_created` datetime NOT NULL COMMENT '创建时间',
  `meta_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

-- 正在导出表  labmaster.user 的数据：~0 rows (大约)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


-- 导出  表 labmaster.user_dept 结构
DROP TABLE IF EXISTS `user_dept`;
CREATE TABLE IF NOT EXISTS `user_dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '部门ID',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `deleted_mark` int(11) NOT NULL COMMENT '标记删除（1：有效，0：无效）',
  `meta_created` datetime NOT NULL COMMENT '创建时间',
  `meta_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户部门对应关系表';

-- 正在导出表  labmaster.user_dept 的数据：~0 rows (大约)
DELETE FROM `user_dept`;
/*!40000 ALTER TABLE `user_dept` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_dept` ENABLE KEYS */;


-- 导出  表 labmaster.user_role 结构
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE IF NOT EXISTS `user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `deleted_mark` int(11) NOT NULL COMMENT '标记删除（1：有效，0：无效）',
  `meta_created` datetime NOT NULL COMMENT '创建时间',
  `meta_updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色对应关系表';

-- 正在导出表  labmaster.user_role 的数据：~0 rows (大约)
DELETE FROM `user_role`;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
