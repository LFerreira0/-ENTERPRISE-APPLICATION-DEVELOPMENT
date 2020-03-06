package br.com.fiap.revisao.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.revisao.bean.Aluno;

public class TesteData {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(874, 10);
		//Atribuir uma data de nascimento para o aluno
		//Calendar data = Calendar.getInstance(); //Obtem a data atual
		Calendar data = new GregorianCalendar(2001, Calendar.AUGUST, 23);
		aluno.setDataNascimento(data);
		
		//Exibir a data de nascimento
		System.out.println(aluno.getDataNascimento());
		
		//Formatar a data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatador.format(
				aluno.getDataNascimento().getTime()));
	}
	
}