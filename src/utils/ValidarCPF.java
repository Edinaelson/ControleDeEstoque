package utils;

import br.com.caelum.stella.tinytype.CPF;

public class ValidarCPF {
    public boolean validarCPF(String cpf){
        CPF cpf1 = new CPF(cpf);
        if (cpf1.isValido()){
            System.out.println("CPF válido");
            return true;
        }
        if (!cpf1.isValido()){
            System.out.println("CPF inválido");
            return false;
        }
        return false;
    }
}
