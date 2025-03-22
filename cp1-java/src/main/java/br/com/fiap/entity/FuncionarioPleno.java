package br.com.fiap.entity;

public class FuncionarioPleno extends Funcionario{

    private Double bonus;

    public FuncionarioPleno(String nomeCompleto, Integer horasTrabalhadas, Double valorHora, NivelProfissional nivelProfissional, Double bonus) {
        super(nomeCompleto, horasTrabalhadas, valorHora, nivelProfissional);
        this.bonus = bonus;
    }

    @Override
    public Double calculaSalario(){
        // bonus a cada 10 horas trabalhadas
        int quantidadeDeBonus = getHorasTrabalhadas() / 10;
        double bonusTotal = quantidadeDeBonus * bonus;
        return ((getHorasTrabalhadas() * 30) * getValorHora()) + bonusTotal;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
