# Projeto web services com Spring Boot e JPA / Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/LICENSE) 

# Sobre o projeto

https://course-javasb-danmarche.herokuapp.com/users

O Sistema é um web services, onde temos apis rest disponíveis para serem consumidas. O Backend foi desenvolvido utilizando o **Framework Spring  Boot e o JPA com Hibernate**, este projeto foi desenvolvido durante o **Curso: Java COMPLETO - Programação Orientada a Objetos + Projetos** do [Prof. Dr. Nelio Alves](http://educandoweb.com.br "Site do Prof. Dr. Nelio Alves").
A aplicação consiste em um **Sistema  de vendas**, onde implementamos o modelo de Domínio. No sitema temos as Entidades Usuário, Ordem de Serviço, Pagamento, Produto e a Categoria de Produto.
O projeto está estruturado em camadas lógicas: resource, service, repository. Foi desenvolvido as operações de **CRUD** das Entidades, utilizamos o Banco de Dados PostgreSQL. E também foi realizado os tratamentos de Exceções.

## Listando todos os usuários
![img1](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/listAll.jpg)

## Buscando um usuário por ID
![img 2](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/search.jpg)

## ID não encontrado
![img 3](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/error_search.jpg)

## Inserindo um novo usuário
![img 4](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/insert.jpg)

## Editando dados de um usuario
![img 5](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/edit.jpg)

## Erro ao editar ID inválido
![img 6](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/edit.jpg)

## Deletando um usuário
![img 7](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/delete.jpg)

## Erro ao deletar usuário com ID inválido
![img 8](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/error_delete.jpg)

## Modelo conceitual
![img 9](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/DomainModel.jpg)

## Estrutura do Projeto
![img 10](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/LogicalLayers.jpg)

# Tecnologias utilizadas
![img 11](https://github.com/danielmarcosh/course-springboot-2-java-11/blob/master/assets/tech.jpg)
## Backend
- Java
- SpringBoot
- JPA/Hibernate
- Maven
- Apache TomCat
- PostMan
## Banco de Dados
- H2
- PostgreSQL

## Implantação em produção
- Back end: Heroku
- Banco de dados: Postgresql

# Como executar o projeto

## Aplicação
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/danielmarcosh/course-springboot-2-java-11.git
```
```java
// Abrir o projeto 'course-springboot-2-java-11' no editor Eclipse ou em um de editor de sua preferencia
// Para rodar o projeto. Vai no diretório 'course-springboot-2-java-11/src/main/java/com/danmarche/course/'
// E execute o arquivo 'CourseApplication.java'
CourseApplication.java
```

### Agradecimentos
Os meus sinceros agradecimentos ao [Prof. Dr. Nelio Alves](http://educandoweb.com.br "Site do Prof. Dr. Nelio Alves"), por este excelente curso, no qual eu pude aprender muito e a praticar todos os conhecimentos durante o curso, desejo ao professor muito sucesso em sua carreira!

# Autor

Daniel Marcos Hermenegildo
danielmarcosh@gmail.com / danielmh321@hotmail.com

https://www.linkedin.com/in/daniel-marcos-24260a132
