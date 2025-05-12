CREATE DATABASE reservas_nintendo_switch2;
USE reservas_nintendo_switch2;

-- Tabla: Usuario
CREATE TABLE Usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    contraseña VARCHAR(100) NOT NULL,
);

-- Tabla: Producto
CREATE TABLE Producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    tipo ENUM('consola', 'juego', 'accesorio') NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL
);

-- Tabla: Reserva
CREATE TABLE Reserva (
    id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_producto INT,
    fecha_reserva DATE NOT NULL,
    estado ENUM('pendiente', 'confirmada', 'cancelada') DEFAULT 'pendiente',
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario),
    FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
);

-- Tabla: Pago
CREATE TABLE Pago (
    id_pago INT AUTO_INCREMENT PRIMARY KEY,
    id_reserva INT,
    metodo_pago ENUM('tarjeta', 'paypal', 'saldo_nintendo'),
    monto DECIMAL(10,2),
    estado_pago ENUM('pendiente', 'pagado', 'fallido') DEFAULT 'pendiente',
    FOREIGN KEY (id_reserva) REFERENCES Reserva(id_reserva)
);

