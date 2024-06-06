Trabalho de: Francisco inaiê / matricula 202203559559
              Willian Rodrigues / matricula 201908372737

Funcionalidade
O código Java fornecido implementa um sistema simples de gerenciamento de funcionários, permitindo as seguintes operações:

Adicionar Funcionário: Permite a adição de um novo funcionário à empresa, solicitando informações como nome, data de nascimento, data de contratação, função e atribuindo um desempenho aleatório.
Excluir Funcionário: Permite excluir um funcionário da empresa pelo nome.
Consultar Funcionários: Exibe a lista de todos os funcionários cadastrados, ordenados pelo nome.
Sair: Encerra o programa.
Estrutura do Código
O código está dividido em duas classes principais dentro do pacote Principal:

Classe Funcionario:

Atributos: nome, dataNascimento, dataContratacao, funcao, desempenho.
Construtor: Inicializa os atributos do funcionário.
Métodos:
getNome(): Retorna o nome do funcionário.
toString(): Retorna uma representação em string dos detalhes do funcionário.
Classe Empresa:

Atributos: funcionarios (lista de objetos Funcionario).
Construtor: Inicializa a lista de funcionários.
Métodos:
adicionarFuncionario(Funcionario funcionario): Adiciona um funcionário à lista.
excluirFuncionario(String nome): Exclui um funcionário pelo nome.
consultarFuncionarios(): Retorna a lista de funcionários.
ordenarFuncionariosPorNome(): Ordena a lista de funcionários pelo nome.
Vantagens e Benefícios
Simplicidade e Clareza:

O código é claro e fácil de entender, com uma estrutura bem definida e operações básicas de gerenciamento de funcionários.
Cada funcionalidade é implementada de maneira direta e sem complexidade excessiva, facilitando a manutenção e a extensão do código.
Modularidade:

A separação das responsabilidades em diferentes classes (Funcionario e Empresa) promove a modularidade. Isso permite que cada classe tenha uma única responsabilidade, seguindo o princípio da responsabilidade única (SRP).
Reusabilidade:

A estrutura modular do código facilita a reutilização das classes Funcionario e Empresa em outros contextos ou projetos.
Novas funcionalidades podem ser adicionadas facilmente sem a necessidade de refatorar o código existente.
Ordenação e Consulta:

A possibilidade de ordenar os funcionários pelo nome facilita a consulta e visualização dos dados, melhorando a usabilidade do sistema.
A consulta aos funcionários é feita de forma organizada e padronizada, permitindo uma visualização clara e ordenada.
Interatividade:

O uso de um menu interativo permite que o usuário realize operações de maneira intuitiva, com instruções claras e feedback imediato sobre as ações realizadas.
Geração Aleatória de Desempenho:

A geração aleatória do desempenho dos funcionários ao adicioná-los torna o sistema útil para simulações e testes onde o desempenho não é um dado previamente conhecido.
Melhorias Potenciais
Embora o código fornecido tenha várias vantagens, algumas melhorias potenciais podem ser consideradas:

Validação de Dados:

Implementar validações adicionais para as entradas do usuário, como a verificação do formato das datas e a garantia de que todos os campos obrigatórios sejam preenchidos corretamente.
Persistência de Dados:

Adicionar funcionalidade para salvar e carregar os dados dos funcionários de um arquivo, permitindo a persistência dos dados entre as execuções do programa.
Interface Gráfica:

Desenvolver uma interface gráfica (GUI) para tornar o sistema mais amigável e acessível, especialmente para usuários sem experiência em linha de comando.
Melhorias na Exclusão de Funcionários:

Permitir a exclusão de funcionários por diferentes critérios (por exemplo, data de contratação) além do nome.
Com essas melhorias, o sistema poderia se tornar ainda mais robusto e versátil, atendendo a um conjunto mais amplo de necessidades e casos de uso.
