/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 *
 * @author jamez
 */
public class data_base_build {
    
    
    CREATE TABLE Laptop (
    id INT PRIMARY KEY,
    model VARCHAR(255),
    brand VARCHAR(255),
    price DECIMAL(10, 2)
);

CREATE TABLE PC_Parts (
    id INT PRIMARY KEY,
    model VARCHAR(255),
    brand VARCHAR(255),
    price DECIMAL(10, 2)
);

CREATE TABLE Tablet (
    id INT PRIMARY KEY,
    model VARCHAR(255),
    brand VARCHAR(255),
    price DECIMAL(10, 2)
);

CREATE TABLE Contact_Information (
    address VARCHAR(255),
    city VARCHAR(255),
    phone VARCHAR(255),
    email VARCHAR(255)
);

INSERT INTO Contact_Information (address, city, phone, email)
VALUES ('55 Queen St', 'Auckland', '05 321456', 'computer_store@gmail.com');


    
INSERT INTO Laptop (id, model, brand, price)
VALUES (1, 'Nitro 5', 'Acer', 600.00);
INSERT INTO Laptop (id, model, brand, price)
VALUES (2, 'ROG', 'Asus', 1000.00);
INSERT INTO Laptop (id, model, brand, price)
VALUES (3, 'Surface Pro', 'Microsoft', 900.00);
INSERT INTO Laptop (id, model, brand, price)
VALUES (4, 'XPS13', 'Dell', 800.00);

INSERT INTO PC_Parts (id, model, brand, price)
VALUES (1, 'GTX3070', 'EVGA', 600.00);
INSERT INTO PC_Parts (id, model, brand, price)
VALUES (2, 'Core I5', 'Intel', 300.00);
INSERT INTO PC_Parts (id, model, brand, price)
VALUES (3, 'GTX4090', 'Nvidia', 1400.00);
INSERT INTO PC_Parts (id, model, brand, price)
VALUES (4, 'GTX1080', 'Nvidia', 500.00);
INSERT INTO PC_Parts (id, model, brand, price)
VALUES (5, 'GTX980ti', 'Nvidia', 400.00);

INSERT INTO Tablet (id, model, brand, price)
VALUES (1, 'iPad', 'Apple', 600.00);
INSERT INTO Tablet (id, model, brand, price)
VALUES (2, 'iPad Air', 'Apple', 1000.00);
INSERT INTO Tablet (id, model, brand, price)
VALUES (3, 'Galaxy Tab', 'Samsung', 900.00);
INSERT INTO Tablet (id, model, brand, price)
VALUES (4, 'M8', 'Lenevo', 800.00);

    
}
