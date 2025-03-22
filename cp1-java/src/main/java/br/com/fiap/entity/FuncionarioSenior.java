package br.com.fiap.entity;

public class FuncionarioSenior extends Funcionario{

    private Double bonus;

    public FuncionarioSenior(String nomeCompleto, Integer horasTrabalhadas, Double valorHora, Double bonus, NivelProfissional nivelProfissional) {
        super(nomeCompleto, horasTrabalhadas, valorHora, nivelProfissional);
        this.bonus = bonus;
    }

    @Override
    public Double calculaSalario() {
        // bonus a cada 15 horas trabalhadas
       int quantidadeDeBonus = getHorasTrabalhadas() / 15;
       double bonusTotal = quantidadeDeBonus * bonus;
       return ((getHorasTrabalhadas() * 30) * getValorHora()) + bonusTotal;
    }
}
