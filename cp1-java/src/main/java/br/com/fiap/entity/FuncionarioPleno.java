package br.com.fiap.entity;

public class FuncionarioPleno extends Funcionario{

    private Double bonus;

    public FuncionarioPleno(String nomeCompleto, Integer horasTrabalhadas, Double valorHora, Double bonus,
                             Double calculaSalario, String retornaInformacao) {
        super(nomeCompleto, horasTrabalhadas, valorHora);
        this.bonus = bonus;
        this.retornaInformacao = retornaInformacao;
    }

    @Override
    public Double calculaSalario(){
        int quantidadeDeBonus = horasTrabalhadas / 10;
        double bonusTotal = quantidadeDeBonus * bonus;
        double salario = horasTrabalhadas * valorHora + bonusTotal;
        return salario;
    }

    @Override
    public void retornaInformacao(){
        System.out.println(
                "1nNome: " + getNomeCompleto() +
                        "Horas Trabalhadas: " + getHorasTrabalhadas() +
                        "Valor Hora: " + getValorHora() +
                        "Salário: " + calculaSalario());
    }

}
