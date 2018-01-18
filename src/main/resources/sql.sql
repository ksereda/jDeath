CREATE SCHEMA `jdeath2`;

CREATE TABLE `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `sureName` varchar(45) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

CREATE TABLE `accounts` (
  `accountId` int(11) NOT NULL AUTO_INCREMENT,
  `account` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`accountId`),
  KEY `userId_idx` (`userId`),
  CONSTRAINT `userId` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into users(userId, name, sureName) values(1, 'Vasya', 'Bolodolov');
insert into users(userId, name, sureName) values(2, 'Petya', 'Petrovich');
insert into users(userId, name, sureName) values(3, 'Kirill', 'Sereda');
insert into users(userId, name, sureName) values(4, 'Ivan', 'Urgant');
insert into users(userId, name, sureName) values(5, 'Olga', 'Buzova');
insert into users(userId, name, sureName) values(6, 'Garik', 'Harlamov');
insert into users(userId, name, sureName) values(7, 'Garik', 'Martirosyan');
insert into users(userId, name, sureName) values(8, 'Mark', 'Yolberg');
insert into users(userId, name, sureName) values(9, 'John', 'Travolta');
insert into users(userId, name, sureName) values(10, 'Nikolas', 'Keige');

insert into accounts(accountId, account, userId) values(1, 300, 1);
insert into accounts(accountId, account, userId) values(2, 200, 2);
insert into accounts(accountId, account, userId) values(3, 800, 3);
insert into accounts(accountId, account, userId) values(4, 400, 4);
insert into accounts(accountId, account, userId) values(5, 900, 5);
insert into accounts(accountId, account, userId) values(6, 600, 6);
insert into accounts(accountId, account, userId) values(7, 700, 7);
insert into accounts(accountId, account, userId) values(8, 500, 8);
insert into accounts(accountId, account, userId) values(9, 450, 9);
insert into accounts(accountId, account, userId) values(10, 1100, 10);
