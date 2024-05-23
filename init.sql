-- Criar a tabela Dia
CREATE TABLE IF NOT EXISTS dia (
                                   id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                   data DATE NOT NULL
);

-- Criar a tabela Hora
CREATE TABLE IF NOT EXISTS hora (
                                    id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                    inicio DATETIME NOT NULL,
                                    fim DATETIME NOT NULL,
                                    dia_id BIGINT NOT NULL,
                                    FOREIGN KEY (dia_id) REFERENCES dia(id)
    );

-- Criar a tabela Medicao
CREATE TABLE IF NOT EXISTS medicao (
                                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       idEstacao VARCHAR(255) NOT NULL,
    timestamp DATETIME NOT NULL,
    numeroMedicao INT NOT NULL,
    temperatura FLOAT,
    umidade FLOAT,
    percentualUV FLOAT,
    nivelUV FLOAT,
    pressao FLOAT,
    luminosidade FLOAT,
    mlChuva FLOAT,
    hora_id BIGINT NOT NULL,
    FOREIGN KEY (hora_id) REFERENCES hora(id)
    );
