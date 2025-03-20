package br.com.fiap.entity;

public class FuncionarioSenior extends Funcionario{

    private Double bonus;

    public FuncionarioSenior(String nomeCompleto, Integer horasTrabalhadas, Double valorHora, Double bonus,
                             Double calculaSalario, String retornaInformacao) {
        super(nomeCompleto, horasTrabalhadas, valorHora);
        this.bonus = bonus;
        this.retornaInformacao = retornaInformacao;
    }

    @Override
    public Double calculaSalario() {
       int quantidadeDeBonus = horasTrabalhadas / 15;
       double bonusTotal = quantidadeDeBonus * bonus;
       double salario = horasTrabalhadas * valorHora + bonusTotal;
       return salario;
    }

    @Override
    public String retornaInformacao {

    }
}
