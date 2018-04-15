# spring boot demo

# add database
 
CREATE DATABASE `shop` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

CREATE TABLE `shop_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `shop_description` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `shop_type` int(11) NOT NULL DEFAULT '1',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
insert into shop_info(shop_name,shop_description,shop_type) value('computer','computer',1);