# Atividade da Pós Graduação Java UTFPR - Banco de Dados

![der](https://user-images.githubusercontent.com/75284951/135463357-61485869-4ea3-44dd-8cd2-d50ae93f16e0.png)

1. Crie as classes com as respectivas anotações em JPA a partir do esquema lógico (relacional) para as Entidades (@Entity); e para os Relacionamentos que existem entre elas (obrigatoriamente criar o relacionamento bidirecional - mappedBy).
2. Crie as interfaces de repositório (@Repository) para as classes de modo a permitir o acesso aos métodos de CRUD do JpaRepository.
3. Crie na camada de lógica de negócios (@Service), um método para salvar as entidades (incluindo o relacionamento entre elas), utilizando injeção de dependências com a camada de acesso aos dados (@Repository).
4. Crie na camada de lógica de negócios (@Service), um método para excluir a partir do identificador - delete(ID) - um registro de cada entidade, utilizando injeção de dependências com a camada de acesso aos dados (@Repository).
5. Crie na camada de lógica de negócios (@Service), pelo menos 2 (dois) métodos com consultas para cada entidade, utilizando injeção de dependências com a camada de acesso aos dados (@Repository). Quando necessário, acrescentar a assinatura dos métodos na camada de acesso aos dados.
6. Usando o CommandLineRunner e o Logger, realize operações de inclusão, exclusão e consulta para todos os métodos criados na camada de lógica de negócio criada nas questões anteriores.

## Tecnologias utilizadas

* Springboot
* Banco de dados Postgrees


