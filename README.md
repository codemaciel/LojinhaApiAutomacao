## Lojinha API Automação
Esse é um repositório que contém a automação de alguns testes de API Rest de um software denominado lojinha.
Os sub-tópicos abaixo descrevem algumas decisões tomadas nas estruturação do projeto.

## Tecnologias

- Java
- JUnit
- RestAssured
-  Maven
## Testes automatizados
Teste para validar as partições de equivalência relacionadas ao valor do produto na lojinha, que estão vinculados diretamente a regra de negócio que diz que o valor do produto deve estar entre $0,01 e $  7.000,00.

## Notas Gerais
- sempre utilizamos as anotação before Each para capturar o token que será utilizado posteriormente nos métodos de testes.
- Armazenamos os dados que são enviados para a API através do uso de classes POJO.
- Criamos dados iniciais através do uso de classe Data Factory, para facilitara a criação e controle dos mesmos.
- Nesse projeto fazemos uso do JUnit 5 o que da a possibilidade de usar a anotação DisplayName para dar descrições em português para nossos testes