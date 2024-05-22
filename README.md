
# API LabPenso

## Descrição

A API LabPenso é uma aplicação RESTful para gerenciamento de medições de dados ambientais.

## Endpoints

### Medição

#### Criar uma Medição

- **Path**: `api/medicao`
- **Método**: `POST`
- **Formato da Requisição**:
  ```json
  {
    "idEstacao": "LABP-ES001",
    "timestamp": "2023-05-20T15:30:00",
    "temperatura": 25.0,
    "umidade": 60.0,
    "percentualUV": 0.5,
    "nivelUV": 3.0,
    "pressao": 1012.0,
    "luminosidade": 750.0,
    "mlChuva": 0.0
  }
  ```

#### Buscar uma Medição Específica

- **Path**: `/api/dia/{dia}/hora/{hora}/medicao/{numero}`
- **Método**: `GET`

#### Listar Medições por Dia

- **Path**: `/api/dia/{data}`
- **Método**: `GET`

#### Listar Medições por Hora do Dia

- **Path**: `/api/dia/{data}/hora/{hora}`
- **Método**: `GET`

#### Deletar uma Medição

- **Path**: `api/medicao/{id}`
- **Método**: `DELETE`



![Logo](https://i.kym-cdn.com/entries/icons/facebook/000/034/167/donny's_theme_cover.jpg)

