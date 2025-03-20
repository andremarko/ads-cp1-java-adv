package br.com.fiap;

import br.com.fiap.entity.FuncionarioPleno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FuncionarioPleno FP = new FuncionarioPleno("André", 120, 30);

        System.out.printf(FP.calculaSalario() , FP.retornaInformacao())


        }
    }
}