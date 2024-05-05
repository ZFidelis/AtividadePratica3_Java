package view;

import controller.CadastroFuncionarios;
import model.*;

public class Sistema {
    
    public static void executar() {
        int op = 1;

        while (op != 0) {
            menuPrincipal();
            op = Console.lerInt();
            encaminharMenu(op);
        }


    }

    public static void menuPrincipal() {

        System.out.println("\n-- Menu Principal --");
        System.out.println("0)Encerrar Programa");
        System.out.println("1)Cadastros");
        System.out.println("2)Consultas");
        System.out.println("3)Busca/Exclusão");
        System.out.print("Informe uma opção: ");

    }

    public static void menuCadastros() {

        System.out.println("\n-- Menu de Cadastros --");
        System.out.println("0)Voltar");
        System.out.println("1)Cadastrar Gerente");
        System.out.println("2)Cadastrar Desenvolvedor");
        System.out.println("3)Cadastrar Estagiario");
        System.out.print("Informe uma opção: ");

    }

    public static void menuConsultas() {

        System.out.println("\n-- Menu de Consultas --");
        System.out.println("0)Voltar");
        System.out.println("1)Listar Gerente");
        System.out.println("2)Listar Desenvolvedor");
        System.out.println("3)Listar Estagiario");
        System.out.println("4)Listar Todos");
        System.out.print("Informe uma opção: ");

    }

    public static void menuBuscas() {

        System.out.println("\n-- Menu de Buscas --");
        System.out.println("0)Voltar");
        System.out.println("1)Buscas por Nome");
        System.out.println("2)Buscar por ID");
        System.out.print("Informe uma opção: ");

    }

    public static void encaminharMenu(int op) {
        int opt;
        switch (op) {
            case 0: // Finaliza Programa
                System.out.println("Programa Finalizado!");
                break;
            case 1: // Cadastros
                menuCadastros();
                opt = Console.lerInt();
                realizarCadastro(opt);
                break;
            case 2: // Consultas
                menuConsultas();
                opt = Console.lerInt();
                realizarConsultas(opt);
                break;
            case 3: // Buscas
                menuBuscas();
                opt = Console.lerInt();
                realizarBuscas(opt);
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }

    public static void realizarCadastro(int opt) {
        
        if (opt == 0) {
            return;
        }

        System.out.print("Digite o ID do novo funcionario: ");
        int id = Console.lerInt();
        System.out.print("Digite o Nome do novo funcionario: ");
        String nome = Console.lerStr();
        System.out.print("Valor da Hora do funcionario: ");
        float valorHora = Console.lerFloat();
        System.out.print("Horas trabalhadas por este funcionario: ");
        float horasTrabalhadas = Console.lerFloat();

        switch (opt) {
            case 1: // Atributos proprios Gerente
                System.out.print("Bonus Salarial do Gerente: ");
                float bonusSalarial = Console.lerFloat();
                System.out.print("Time que o Gerente esta responsavel: ");
                String timeGerenciado = Console.lerStr();

                Gerente gerente = new Gerente(id, nome, valorHora, horasTrabalhadas, bonusSalarial, timeGerenciado);
                CadastroFuncionarios.cadastrarFuncionario(gerente);
                break;
            case 2: // Atrubutos proprios Desenvolvedor
                System.out.print("Modelo de Trabalho(Hibrido/Presencial/HO): ");
                String modeloTrabalho = Console.lerStr();
                System.out.print("Projeto que está trabalhando atualmente: ");
                String projetoAtual = Console.lerStr();
                System.out.print("Linguagem de Preferencia: ");
                String linguagemPreferida = Console.lerStr();

                Desenvolvedor desenvolvedor = new Desenvolvedor(id, nome, valorHora, horasTrabalhadas, linguagemPreferida, modeloTrabalho, projetoAtual);
                CadastroFuncionarios.cadastrarFuncionario(desenvolvedor);
                break;
            case 3: // Atributos proprios Responsavel
                System.out.print("Responsavel pelo Estagiario: ");
                String supervisor = Console.lerStr();
                System.out.print("Aprendendo atualmente: ");
                String aprendendo = Console.lerStr();

                Estagiario estagiario = new Estagiario(id, nome, valorHora, horasTrabalhadas, supervisor, aprendendo);
                CadastroFuncionarios.cadastrarFuncionario(estagiario);
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }

    public static void realizarConsultas(int opt) {
        switch (opt) {
            case 0: // Voltar
                
                break;
            case 1: // Consultar Gerentes
                for (Funcionario temporario : CadastroFuncionarios.getListaFuncionarios()) {
                    if (temporario instanceof Gerente) {
                        System.out.println(temporario);
                    }
                }
                break;
            case 2: // Consultar Desenvolvedores
                for (Funcionario temporario : CadastroFuncionarios.getListaFuncionarios()) {
                    if (temporario instanceof Desenvolvedor) {
                        System.out.println(temporario);
                    }
                }
                break;
            case 3: // Consultar Estagiarios
                for (Funcionario temporario : CadastroFuncionarios.getListaFuncionarios()) {
                    if (temporario instanceof Estagiario) {
                        System.out.println(temporario);
                    }
                }
                break;
            case 4: // Consultar Todos
                for (Funcionario temporario : CadastroFuncionarios.getListaFuncionarios()) {
                    System.out.println(temporario);
                }
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }

    public static void realizarBuscas(int opt) {
        Funcionario funcionarioEncontrado;

        switch (opt) {
            case 0: // Voltar
                return;
            case 1: // Buscar p/ Nome
                System.out.print("\nNome do Funcionario que deseja buscar: ");
                String nome = Console.lerStr();

                funcionarioEncontrado = CadastroFuncionarios.buscarFuncionario(nome);

                break;
            case 2: // Buscar p/ ID
                System.out.print("\nID do Funcionario que deseja buscar: ");
                int id = Console.lerInt();

                funcionarioEncontrado = CadastroFuncionarios.buscarFuncionario(id);

                break;
            default:
                System.out.println("Opcao Invalida");
                return;
        }

        if (funcionarioEncontrado.getNome().equals("")) {
            System.out.println("Funcionario não Encontrado :(");
            return;
        }

        System.out.println("\n-- Funcionario Encontrado --");
        System.out.println(funcionarioEncontrado);
        int opc;
        do{
            System.out.println("0)Menu Principal");
            System.out.println("1)Excluir");
            System.out.println("2)Trabalhar");
            System.out.println("3)Relatar Progresso");
            System.out.print("Escolha: ");
            opc = Console.lerInt();
            System.out.println();

            switch (opc) {
                case 0: // Voltar

                    break;
                case 1: // Excluir
                    CadastroFuncionarios.removerFuncionario(funcionarioEncontrado.getId());
                    System.out.println("Funcionario Removido");
                    break;
                case 2: // Trabalhar
                    System.out.println(funcionarioEncontrado.trabalhar());
                    break;
                case 3: // Relatar Progresso
                    System.out.println(funcionarioEncontrado.relatarProgresso());
                    break;
                default:
                    System.out.println("Opcao Invalida\n");
                    break;
            }
        } while (opc!= 0 && opc != 1);

    }

}
