package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ConsultaFuncionarios {

    public static class Funcionario {
        private String nome;
        private String dataNascimento;
        private String dataContratacao;
        private String funcao;
        private float desempenho;

        public Funcionario(String nome, String dataNascimento, String dataContratacao, String funcao, float desempenho) {
            this.nome = nome;
            this.dataNascimento = dataNascimento;
            this.dataContratacao = dataContratacao;
            this.funcao = funcao;
            this.desempenho = desempenho;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Data de Contratação: " + dataContratacao + ", Função: " + funcao + ", Desempenho: " + desempenho;
        }
    }

    public static class Empresa {
        private List<Funcionario> funcionarios;

        public Empresa() {
            this.funcionarios = new ArrayList<>();
        }

        public void adicionarFuncionario(Funcionario funcionario) {
            funcionarios.add(funcionario);
        }

        public void excluirFuncionario(String nome) {
            Funcionario funcionarioParaExcluir = null;
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    funcionarioParaExcluir = funcionario;
                    break;
                }
            }
            if (funcionarioParaExcluir != null) {
                funcionarios.remove(funcionarioParaExcluir);
                System.out.println("Funcionário " + nome + " excluído com sucesso.");
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        }

        public List<Funcionario> consultarFuncionarios() {
            return funcionarios;
        }

        public void ordenarFuncionariosPorNome() {
            Collections.sort(funcionarios, Comparator.comparing(Funcionario::getNome));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();

        boolean running = true;
        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Excluir Funcionário");
            System.out.println("3. Consultar Funcionários");
            System.out.println("4. Sair");

            int opcao = -1;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do funcionário:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a data de nascimento (dd/MM/yyyy):");
                    String dataNascimento = scanner.nextLine();
                    System.out.println("Digite a data de contratação (dd/MM/yyyy):");
                    String dataContratacao = scanner.nextLine();
                    System.out.println("Digite a função:");
                    String funcao = scanner.nextLine();
                    System.out.println("Digite o desempenho:");
                    float desempenho = -1;
                    try {
                        desempenho = Float.parseFloat(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Desempenho inválido. Por favor, insira um número.");
                        continue;
                    }

                    Funcionario novoFuncionario = new Funcionario(nome, dataNascimento, dataContratacao, funcao, desempenho);
                    empresa.adicionarFuncionario(novoFuncionario);
                    System.out.println("Funcionário adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o nome do funcionário que deseja excluir:");
                    String nomeExcluir = scanner.nextLine();
                    empresa.excluirFuncionario(nomeExcluir);
                    break;
                case 3:
                    empresa.ordenarFuncionariosPorNome();
                    List<Funcionario> funcionarios = empresa.consultarFuncionarios();
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario funcionario : funcionarios) {
                            System.out.println(funcionario);
                        }
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
            }
        }

        scanner.close();
    }
}
