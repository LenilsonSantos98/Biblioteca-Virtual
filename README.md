# Biblioteca-Virtual
Criando uma Biblioteca com SpringBoot/java

<h1> Criando o Back End</h1>

<h2> Criando o Projeto no Spring Initialzr</h2>
 <p> Para esse projeto usarei a versão mais estável do springboot(3.3.3).<br>
  Escolhi a linguagem Java e o projeto será Maven.
 </p>
 <p>Irei trabalhar com o banco de dados PostgreeSQL.<br> Essas serão as dependências utilizadas:
 
 - Spring Web - Para criar uma api rest.
 - Spring Data JPA - Para integrar a Java Persistence API ao banco de dados.
 - PostgreSQL Driver - Para conctar ao PostgreSQL.
 - Spring Boot DevTools - para facilitar o desenvolvimento.
 </p>

 <h2>Criando a entidade Livro</h2>
A classe Livro, representa a entidade de um livro no sistema de uma livraria. A classe é mapeada para a tabela `tb_livro` no banco de dados através da anotação @Entity. Cada livro possui vários atributos, incluindo id (identificador único), titulo, autor, isbn, dataPublicacao, preco, estoque, e uma sinopse. Os atributos são armazenados no banco de dados com validações de não nulidade e alguns possuem tipos específicos, como BigDecimal para o preço e LocalDate para a data de publicação. A classe também inclui construtores, getters e setters para acessar e modificar os valores dos atributos.

<h2>Repositorio</h2>
A interface LivroRepository, que é um repositório responsável por realizar operações de banco de dados para a entidade Livro. Ele estende a interface JpaRepository, fornecendo métodos padrão para operações como salvar, atualizar, deletar e buscar livros. Além disso, inclui um método personalizado existsByIsbn(String isbn), que verifica se já existe um livro cadastrado com um determinado ISBN no banco de dados. A anotação @Repository indica que é um componente de persistência Spring.

<h2>Implementação</h2>

A camada de implementação de serviço (ServiceImpl) é responsável por executar a lógica de negócios da aplicação, interagindo diretamente com o repositório de dados. No caso da livraria, a implementação do serviço de Livro define métodos para:

Criar Livros: Antes de salvar um novo livro, verifica se o ISBN já está cadastrado no banco de dados, evitando duplicidade.
Buscar por ID: Retorna um livro com base no ID, lançando uma exceção se o livro não for encontrado.
Essa camada abstrai a complexidade do acesso ao banco de dados e mantém a lógica de negócios centralizada.