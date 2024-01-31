# Simplified Banking

## Configuração do Ambiente de Desenvolvimento

1. Clone o repositório:

 ```bash
 git clone https://github.com/seu-usuario/simplified_banking.git
 cd simplified_banking
```

Execute o projeto:
```bash
 ./mvnw spring-boot:run
```

Ou, se estiver usando o Maven instalado globalmente:
```bash
 mvn spring-boot:run
```

Estrutura do Projeto
A estrutura do projeto segue o padrão do Spring Boot:
```lua
simplified_banking/
|-- src/
|   |-- main/
|   |   |-- java/
|   |   |   |-- com/
|   |   |   |   |-- simplified_banking/
|   |   |   |   |   |-- Application.java
|   |   |-- resources/
|   |   |   |-- application.properties
|-- pom.xml
|-- README.md
```

# Dependências
## Lista de dependências principais e versões utilizadas:
- Spring Boot Starter Data JPA - 3.2.2
- Spring Boot Starter Web - 3.2.2
- Spring Boot DevTools - 3.2.2
- H2 Database - (Versão mais recente disponível no repositório Maven)
- PostgreSQL Driver - (Versão mais recente disponível no repositório Maven)
- Lombok - (Versão mais recente disponível no repositório Maven)
- Spring Boot Starter Test - 3.2.2

