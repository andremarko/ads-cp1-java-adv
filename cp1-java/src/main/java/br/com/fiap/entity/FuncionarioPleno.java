package br.com.fiap.entity;

public class FuncionarioPleno extends Funcionario{

    private double bonus;

    public FuncionarioPleno(String nomeCompleto, Integer horasTrabalhadas, Double valorHora, Double bonus) {
        super(nomeCompleto, horasTrabalhadas, valorHora);
        this.bonus = bonus;
    }

    @Override
    public Double calculaSalario(){
        quantidadeDeBonus = getHorasTrabalhadas() / 10;
        double bonusTotal = quantidadeDeBonus * bonus;
        double salario = getHorasTrabalhadas() * getValorHora() + bonusTotal;
        return salario;
    }

    @Override
    public void retornaInformacao(){
        System.out.println(
                        "\nNome: " + getNomeCompleto() +
                        "\nHoras Trabalhadas: " + getHorasTrabalhadas() +
                        "\nValor Hora: " + getValorHora() +
                        "\nSalário: " + calculaSalario());
    }

}
