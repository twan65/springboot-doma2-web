CREATE DATABASE infodb CHARACTER set utf8;
CREATE DATABASE infotestdb CHARACTER set utf8;
CREATE USER 'infouser'@'localhost' identified by 'infopass';
GRANT ALL on infodb.* to 'infouser'@'%';
GRANT ALL on infotestdb.* to 'infouser'@'%';