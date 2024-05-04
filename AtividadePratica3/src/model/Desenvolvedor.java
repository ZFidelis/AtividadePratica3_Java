package model;

public class Desenvolvedor extends Funcionario implements Trabalhavel {
    
    //#region Atributos
    private String linguagemPreferida;
    private String modeloTrabalho; // Presencial, Hibrido ou Home Office
    private String projetoAtual;
    //#endregion

    //#region Construtores
    public Desenvolvedor() {
        
    }

    public Desenvolvedor(int id, String nome, float valorHora, float horasTrabalhadas, String linguagemPreferida,
            String modeloTrabalho, String projetoAtual) {
        super(id, nome, valorHora, horasTrabalhadas);
        this.linguagemPreferida = linguagemPreferida;
        this.modeloTrabalho = modeloTrabalho;
        this.projetoAtual = projetoAtual;
    }
    //#endregion

    //#region Getters e Setters
    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida) {
        this.linguagemPreferida = linguagemPreferida;
    }

    public String getModeloTrabalho() {
        return modeloTrabalho;
    }

    public void setModeloTrabalho(String modeloTrabalho) {
        this.modeloTrabalho = modeloTrabalho;
    }

    public String getProjetoAtual() {
        return projetoAtual;
    }

    public void setProjetoAtual(String projetoAtual) {
        this.projetoAtual = projetoAtual;
    }
    //#endregion

    //#region Métodos
    @Override //vem da superclasse Funcionario()
    public float calcularSalario() {
        float salario = valorHora * horasTrabalhadas;
        return salario;
    }

    @Override //vem da interface Trabalhavel()
    public String trabalhar() {
        String text = "O Desenvolvedor " + getNome() + " iniciou o desenvolvimento do Projeto: " + projetoAtual;
        return text;
    }

    @Override //vem da interface Trabalhavel()
    public String relatarProgresso() {
        String text = "De acordo com o " + getNome() + ", o Projeto: " + projetoAtual + " esta 97% concluido";
        return text;
    }
    //#endregion

    //#region toString
    @Override
    public String toString() {
        String text = super.toString() + "\nLinguagem de Preferencia: " + linguagemPreferida + "\nModelo de Trabalho: " + modeloTrabalho + "\nSalario: " + calcularSalario() + "\nProjeto Atual: " + projetoAtual;
        return text;
    }
    //#endregion

}   