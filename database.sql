create database employee; 

use employee;

select * from emp_details;

desc emp_details   ;

INSERT INTO emp_details (id, name, designation, star_rating, joindate) VALUES
('EMP001', 'John Doe', 'Manager', 4.5, '2023-01-05'),
('EMP002', 'Jane Smith', 'Engineer', 3.8, '2023-02-15'),
('EMP003', 'Michael Johnson', 'Sales Representative', 4.2, '2023-03-10'),
('EMP004', 'Emily Brown', 'Designer', 4.7, '2023-04-20'),
('EMP005', 'David Wilson', 'Engineer', 4.0, '2023-05-01'),
('EMP006', 'Sarah Lee', 'Manager', 4.9, '2023-05-25'),
('EMP007', 'Robert Taylor', 'Developer', 3.5, '2023-06-08'),
('EMP008', 'Olivia Martinez', 'Sales Representative', 4.6, '2023-06-15'),
('EMP009', 'James Anderson', 'Designer', 3.9, '2023-07-02'),
('EMP010', 'Sophia Jackson', 'Engineer', 4.4, '2023-07-10'),
('EMP011', 'William White', 'Manager', 4.8, '2023-01-15'),
('EMP012', 'Emma Harris', 'Developer', 3.7, '2023-02-05'),
('EMP013', 'Daniel Clark', 'Sales Representative', 4.3, '2023-03-20'),
('EMP014', 'Ava Walker', 'Designer', 4.1, '2023-04-10'),
('EMP015', 'Liam Turner', 'Engineer', 3.6, '2023-05-15'),
('EMP016', 'Mia Rodriguez', 'Manager', 4.5, '2023-06-01'),
('EMP017', 'Benjamin Martinez', 'Developer', 4.2, '2023-06-20'),
('EMP018', 'Harper Adams', 'Sales Representative', 4.7, '2023-07-05'),
('EMP019', 'Ethan Scott', 'Designer', 3.8, '2023-07-15'),
('EMP020', 'Amelia King', 'Engineer', 4.4, '2023-01-20'),
('EMP021', 'Sebastian Murphy', 'Manager', 4.9, '2023-02-10'),
('EMP022', 'Evelyn Green', 'Developer', 3.5, '2023-03-01'),
('EMP023', 'Jackson Baker', 'Sales Representative', 4.6, '2023-04-05'),
('EMP024', 'Luna Hall', 'Designer', 3.9, '2023-05-10'),
('EMP025', 'Aiden Wood', 'Engineer', 4.0, '2023-06-05'),
('EMP026', 'Scarlett Rivera', 'Manager', 4.8, '2023-07-10'),
('EMP027', 'Lucas Cooper', 'Developer', 3.7, '2023-01-10'),
('EMP028', 'Chloe Ward', 'Sales Representative', 4.3, '2023-02-20'),
('EMP029', 'Grayson Foster', 'Designer', 4.1, '2023-03-15'),
('EMP030', 'Zoe Brooks', 'Engineer', 3.6, '2023-04-30');

SELECT id, name, designation, joindate, star_rating
FROM emp_DETAILS
WHERE joindate >= DATE_SUB(CURDATE(), INTERVAL 3 MONTH)
ORDER BY star_rating DESC;

