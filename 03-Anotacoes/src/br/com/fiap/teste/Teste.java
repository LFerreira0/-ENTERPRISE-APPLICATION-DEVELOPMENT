package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Veiculo;

public class Teste {

	public static void main(String[] args) {
		//Instanciar um veiculo
		Veiculo veiculo = new Veiculo();
		
		//Recuperar os atributos da classe veiculo
		Field[] atributos = veiculo.getClass().getDeclaredFields();
		//Exibir o nome dos atributos
		for (Field f : atributos) {
			//Recuperar a anotação @Coluna
			Coluna anotacao = f.getAnnotation(Coluna.class);
			
			System.out.println(f.getName() + " - " +
				anotacao.nome() + " - " + anotacao.obrigatorio());
			
		}
		
		//Recuperar os métodos da classe veiculo
		Method[] metodos = veiculo.getClass().getDeclaredMethods();
		//Exibir o nome dos métodos
		for (Method m : metodos) {
			System.out.println(m.getName());
		}
		
	}
	
}






