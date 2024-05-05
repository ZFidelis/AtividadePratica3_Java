package controller;
import java.util.ArrayList;
import java.util.List;
import model.*;


public class CadastroFuncionarios {
    
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    //#region Getter
    public static void cadastrarFuncionario(Funcionario funcionario) { 
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }
    //#endregion

    //#region Metodos
    public static Funcionario buscarFuncionario(String nome) {
        
        for (Funcionario temporario : listaFuncionarios) {
            if(temporario.getNome().equals(nome)) {
                //listaFuncionarios.remove(temporario);
                return temporario;
            }
        }
        return null;
    }

    public static Funcionario buscarFuncionario(int id) {

        for (Funcionario temporario : listaFuncionarios) {
            if(temporario.getId() == id) {
                //listaFuncionarios.remove(temporario);
                return temporario;
            }
        }
        return null;
    }

    public static boolean removerFuncionario(int id) {

        for (Funcionario temporario : listaFuncionarios) {
            if(temporario.getId() == id) {
                listaFuncionarios.remove(temporario);
                return true;
            }
        }
        return false;
    }

    //#endregion

}
