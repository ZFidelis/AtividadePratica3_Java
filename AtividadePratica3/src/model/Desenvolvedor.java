package model;

public class Desenvolvedor extends Funcionario implements Trabalhavel {
    
    private String linguagemPreferida;
    private String modeloTrabalho; // Presencial, Hibrido ou Home Office

    //#region Construtores
    public Desenvolvedor() {
        
    }

    public Desenvolvedor(int id, String nome, float valorHora, float horasTrabalhadas, String linguagemPreferida,
            String modeloTrabalho) {
        super(id, nome, valorHora, horasTrabalhadas);
        this.linguagemPreferida = linguagemPreferida;
        this.modeloTrabalho = modeloTrabalho;
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
    //#endregion

    //#region Métodos
    @Override
    public float calcularSalario() {
        float salario = valorHora * horasTrabalhadas;
        return salario;
    }
    //#endregion

    //#region toString
    @Override
    public String toString() {
        String text = super.toString() + "\nLinguagem de Preferencia: " + linguagemPreferida + "\nModelo de Trabalho: " + modeloTrabalho + "\nSalario: " + calcularSalario();
        return text;
    }
    //#endregion
}   