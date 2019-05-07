CREATE TABLE `doctors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cnp` varchar(13) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `specialisation` varchar(45) NOT NULL,
  `years_experience` int(11) NOT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `medicaloffice`.`doctors`
(
`cnp`,
`first_name`,
`last_name`,
`specialisation`,
`years_experience`)
VALUES
(
'13242524',
'Maria',
'Paraschiv',
'Medic de familie' ,
4);
INSERT INTO `medicaloffice`.`doctors`
(
`cnp`,
`first_name`,
`last_name`,
`specialisation`,
`years_experience`)
VALUES
(
'13242524',
'Maria',
'Paraschiv',
'Medic de familie' ,
4);
INSERT INTO `medicaloffice`.`doctors`
(
`cnp`,
`first_name`,
`last_name`,
`specialisation`,
`years_experience`)
VALUES
(
'5930243',
'Corina',
'Preda',
'Medic ginecolog' ,
8);




CREATE TABLE `medicaloffice`.`medicalcentres` (
  `id` INT NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `street_name` VARCHAR(45) NOT NULL,
  `street_number` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
  );
INSERT INTO `medicaloffice`.`medicalcentres`
(`id`,
`country`,
`city`,
`street_name`,
`street_number`)
VALUES
(231,
'Romania',
'Bucuresti',
'Iuliu Maniu',
'2B');
INSERT INTO `medicaloffice`.`medicalcentres`
(`id`,
`country`,
`city`,
`street_name`,
`street_number`)
VALUES
(21,
'Romania',
'Craiova',
'Dezrobirii',
'30');




CREATE TABLE `pills` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `prospect` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `medicaloffice`.`pills`
(`id`,
`name`,
`prospect`)
VALUES
(3432,
'Paracetamol',
'administrare orala');
INSERT INTO `medicaloffice`.`pills`
(`id`,
`name`,
`prospect`)
VALUES
(3022,
'Nurofen',
'administrare orala');


CREATE TABLE `patients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cnp` varchar(13) NOT NULL,
  `name` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
)

(

INSERT INTO `medicaloffice`.`patients`
(
`cnp`,
`name`,
`telephone`,
`age`
)
VALUES
(
'23242535',
'Irina Butu',
'0724250382',
23);

INSERT INTO `medicaloffice`.`patients`
(
`cnp`,
`name`,
`telephone`,
`age`
)
VALUES
(
'23240035',
'Cornelia Dinu',
'0724250300',
21);
INSERT INTO `medicaloffice`.`patients`
(
`cnp`,
`name`,
`telephone`,
`age`
)
VALUES
(
'23242535',
'Ioana Paraschiv',
'0724000382',
21);
INSERT INTO `medicaloffice`.`patients`
(
`cnp`,
`name`,
`telephone`,
`age`
)
VALUES
(
'333242535',
'Dan Ionescu',
'0701250382',
33);

