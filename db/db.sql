/*
SQLyog - Free MySQL GUI v5.13
Host - 5.0.22-community-nt : Database - doctorappointment
*********************************************************************
Server version : 5.0.22-community-nt
*/


SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `doctorappointment`;

USE `doctorappointment`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `bookingdetails` */

DROP TABLE IF EXISTS `bookingdetails`;

CREATE TABLE `bookingdetails` (
  `patientname` varchar(50) default NULL,
  `doctorname` varchar(50) default NULL,
  `problem` varchar(50) default NULL,
  `scheduledate` varchar(50) default NULL,
  `scheduletime` varchar(50) default NULL,
  `status` varchar(50) default NULL,
  `id` int(10) NOT NULL auto_increment,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bookingdetails` */

insert into `bookingdetails` (`patientname`,`doctorname`,`problem`,`scheduledate`,`scheduletime`,`status`,`id`) values ('kavi','smithi','fever','02-11-2024','5pm','attend',1),('vijay','selva','ulcer','03-11-2024','6pm','attend',3),('kavi','shiny','sensitive skin','05-11-2024','7pm','attend',4),('vijay','smithi','fever','03-11-2024','4pm','notattend',5),('kavi','selva','left abdomen pain','06-11-2024','4pm','notattend',6),('kavi','shiny','allergy in leg fingers','02-11-2024','11am','attend',7),('vijay','selva','gas troble','04-11-2024','5pm','notattend',8)insert into `bookingdetails` (`patientname`,`doctorname`,`problem`,`scheduledate`,`scheduletime`,`status`,`id`) values ('kavi','smithi','fever','02-11-2024','5pm','attend',1),('vijay','selva','ulcer','03-11-2024','6pm','attend',3),('kavi','shiny','sensitive skin','05-11-2024','7pm','attend',4),('vijay','smithi','fever','03-11-2024','4pm','notattend',5),('kavi','selva','left abdomen pain','06-11-2024','4pm','notattend',6),('kavi','shiny','allergy in leg fingers','02-11-2024','11am','attend',7),('vijay','selva','gas troble','04-11-2024','5pm','notattend',8),
('Ramesh Kumar', 'rameshkumar', 'pass1111', 'Bangalore', 'Cardiologist', '9876500011', 'ramesh.kumar@gmail.com', '9am to 1pm-4pm to 8pm', '10am to 12pm'),
('Siddharth Rao', 'siddharthrao', 'secure5678', 'Hyderabad', 'Neurologist', '9123400009', 'siddharth.rao@gmail.com', '10am to 2pm-5pm to 9pm', '11am to 1pm'),
('Priya Singh', 'priyasingh', 'health3333', 'Kolkata', 'Dermatologist', '9988706655', 'priya.singh@gmail.com', '9am to 12pm-3pm to 7pm', 'not available'),
('Vikram Das', 'vikramdas', 'pass9090', 'Chennai', 'Pediatrician', '8899000002', 'vikram.das@gmail.com', '8am to 12pm-4pm to 8pm', '9am to 11am'),
('Swathi Agarwal', 'swathiagarwal', 'safe2234', 'Delhi', 'Orthopedic', '9776600003', 'swathi.agarwal@gmail.com', '10am to 1pm-3pm to 6pm', '10am to 12pm'),
('Neha Patel', 'nehapatel', 'secure8888', 'Mumbai', 'Gastroenterologist', '8877660044', 'neha.patel@gmail.com', '11am to 3pm-6pm to 9pm', 'not available'),
('Krishna Pillai', 'krishnapillai', 'health9900', 'Pune', 'Psychiatrist', '8123400000', 'krishna.pillai@gmail.com', '10am to 2pm-5pm to 8pm', '11am to 1pm'),
('Shweta Menon', 'shwetamenon', 'pass4040', 'Ahmedabad', 'General Physician', '8223300555', 'shweta.menon@gmail.com', '9am to 1pm-4pm to 8pm', 'not available'),
('Aditya Kapoor', 'adityakapoor', 'safe9999', 'Jaipur', 'Endocrinologist', '9112233400', 'aditya.kapoor@gmail.com', '8am to 12pm-3pm to 6pm', '9am to 11am'),
('Vivek Saxena', 'viveksaxena', 'secure7777', 'Lucknow', 'Ophthalmologist', '9125500008', 'vivek.saxena@gmail.com', '10am to 1pm-5pm to 9pm', '10am to 12pm'),
('Smith Kumar', 'smithkumar', 'pass1234', 'Bangalore', 'Cardiologist', '9876543210', 'smith.kumar@gmail.com', '9am to 1pm-4pm to 8pm', '10am to 12pm'),
('Arjun Reddy', 'arjunreddy', 'secure5678', 'Hyderabad', 'Neurologist', '9123456789', 'arjun.reddy@gmail.com', '10am to 2pm-5pm to 9pm', '11am to 1pm'),
('Meera Sharma', 'meerasharma', 'health1010', 'Kochi', 'Dermatologist', '9988776655', 'meera.sharma@gmail.com', '9am to 12pm-3pm to 7pm', 'not available'),
('Karthik Das', 'karthikdas', 'pass7890', 'Chennai', 'Pediatrician', '8899001122', 'karthik.das@gmail.com', '8am to 12pm-4pm to 8pm', '9am to 11am'),
('Ananya Gupta', 'ananyagupta', 'safe4321', 'Delhi', 'Orthopedic', '9776655443', 'ananya.gupta@gmail.com', '10am to 1pm-3pm to 6pm', '10am to 12pm'),
('Rajesh Iyer', 'rajeshiyer', 'secure999', 'Mumbai', 'Gastroenterologist', '8877665544', 'rajesh.iyer@gmail.com', '11am to 3pm-6pm to 9pm', 'not available'),
('Divya Chandran', 'divyachandran', 'health2020', 'Pune', 'Psychiatrist', '8123456780', 'divya.chandran@gmail.com', '10am to 2pm-5pm to 8pm', '11am to 1pm'),
('Suresh Nair', 'sureshnair', 'pass4567', 'Ahmedabad', 'General Physician', '8223344556', 'suresh.nair@gmail.com', '9am to 1pm-4pm to 8pm', 'not available'),
('Aditi Sharma', 'aditisharma', 'safe1010', 'Jaipur', 'Endocrinologist', '9112233445', 'aditi.sharma@gmail.com', '8am to 12pm-3pm to 6pm', '9am to 11am'),
('Manoj Gupta', 'manojgupta', 'secure888', 'Lucknow', 'Ophthalmologist', '9125566778', 'manoj.gupta@gmail.com', '10am to 1pm-5pm to 9pm', '10am to 12pm'),;


/*Table structure for table `doctordetails` */

DROP TABLE IF EXISTS `doctordetails`;

CREATE TABLE `doctordetails` (
  `name` varchar(50) default NULL,
  `username` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `address` varchar(100) default NULL,
  `dept` varchar(50) default NULL,
  `mobileno` varchar(50) default NULL,
  `emailid` varchar(50) default NULL,
  `mondaytosatday` varchar(50) default NULL,
  `sunday` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `doctordetails` */

INSERT INTO `doctordetails` 
(`name`, `username`, `password`, `address`, `dept`, `mobileno`, `emailid`, `mondaytosatday`, `sunday`) 
VALUES
('Arjun Kumar', 'arjun', 'pass123', 'Bangalore', 'Cardiologist', '9876543210', 'arjunheart@gmail.com', '9am to 1pm-4pm to 8pm', '10am to 12pm'),
('Meera Chandran', 'meera', 'health001', 'Kochi', 'Dermatologist', '9988776655', 'meera.skin@gmail.com', '10am to 2pm-5pm to 7pm', 'not available'),
('Karthik Reddy', 'karthik', 'securepass', 'Hyderabad', 'Neurologist', '9900990099', 'karthik.neuro@gmail.com', '9am to 12pm-3pm to 6pm', '10am to 1pm'),
('Ananya Das', 'ananya', 'safe1234', 'Kolkata', 'Orthopedic', '9123456789', 'ananya.ortho@gmail.com', '10am to 1pm-4pm to 8pm', '11am to 2pm'),
('Ravi Shankar', 'ravi', 'ravi2023', 'Mumbai', 'Oncologist', '9871234567', 'ravi.oncology@gmail.com', '10am to 2pm-5pm to 8pm', 'not available'),
('Priya Sharma', 'priya', 'priya#pass', 'Delhi', 'Gynecologist', '9998877665', 'priya.gynae@gmail.com', '9am to 1pm-3pm to 7);
('Smith Kumar', 'smithkumar', 'pass1234', 'Bangalore', 'Cardiologist', '9876543210', 'smith.kumar@gmail.com', '9am to 1pm-4pm to 8pm', '10am to 12pm'),
('Arjun Reddy', 'arjunreddy', 'secure5678', 'Hyderabad', 'Neurologist', '9123456789', 'arjun.reddy@gmail.com', '10am to 2pm-5pm to 9pm', '11am to 1pm'),
('Meera Sharma', 'meerasharma', 'health1010', 'Kochi', 'Dermatologist', '9988776655', 'meera.sharma@gmail.com', '9am to 12pm-3pm to 7pm', 'not available'),
('Karthik Das', 'karthikdas', 'pass7890', 'Chennai', 'Pediatrician', '8899001122', 'karthik.das@gmail.com', '8am to 12pm-4pm to 8pm', '9am to 11am'),
('Ananya Gupta', 'ananyagupta', 'safe4321', 'Delhi', 'Orthopedic', '9776655443', 'ananya.gupta@gmail.com', '10am to 1pm-3pm to 6pm', '10am to 12pm'),
('Rajesh Iyer', 'rajeshiyer', 'secure999', 'Mumbai', 'Gastroenterologist', '8877665544', 'rajesh.iyer@gmail.com', '11am to 3pm-6pm to 9pm', 'not available'),
('Divya Chandran', 'divyachandran', 'health2020', 'Pune', 'Psychiatrist', '8123456780', 'divya.chandran@gmail.com', '10am to 2pm-5pm to 8pm', '11am to 1pm'),
('Suresh Nair', 'sureshnair', 'pass4567', 'Ahmedabad', 'General Physician', '8223344556', 'suresh.nair@gmail.com', '9am to 1pm-4pm to 8pm', 'not available'),
('Aditi Sharma', 'aditisharma', 'safe1010', 'Jaipur', 'Endocrinologist', '9112233445', 'aditi.sharma@gmail.com', '8am to 12pm-3pm to 6pm', '9am to 11am'),
('Manoj Gupta', 'manojgupta', 'secure888', 'Lucknow', 'Ophthalmologist', '9125566778', 'manoj.gupta@gmail.com', '10am to 1pm-5pm to 9pm', '10am to 12pm');
/*Table structure for table `medicalhistory` */

DROP TABLE IF EXISTS `medicalhistory`;

CREATE TABLE `medicalhistory` (
  `patientname` varchar(50) default NULL,
  `patientid` varchar(50) default NULL,
  `problem` varchar(50) default NULL,
  `remedy` varchar(300) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `medicalhistory` */

insert into `medicalhistory` (`patientname`,`patientid`,`problem`,`remedy`) values ('vijay','3','ulcer','Omeprazole, pantoprazole and lansoprazole'),('kavi','1','fever','Acetaminophen (Tylenol) or ibuprofen (Motrin) '),('kavi','4','sensitive skin','Cetaphil Moisturising Cream for feel better '),('kavi','7','allergy in leg fingers','Oral antihistamines-for itching and Cortizone for reduce reaction');

/*Table structure for table `patientdetails` */

DROP TABLE IF EXISTS `patientdetails`;

CREATE TABLE `patientdetails` (
  `name` varchar(50) default NULL,
  `username` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `address` varchar(100) default NULL,
  `mobileno` varchar(50) default NULL,
  `emailid` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `patientdetails` */

insert into `patientdetails` (`name`,`username`,`password`,`address`,`mobileno`,`emailid`) values ('kavitha','kavi','0717','coimbatore','9945474858','kavi77@gmail.com'),('vijay','vijay','1234','chennai','9944842677','vijay9944@gmail.com');

SET SQL_MODE=@OLD_SQL_MODE;