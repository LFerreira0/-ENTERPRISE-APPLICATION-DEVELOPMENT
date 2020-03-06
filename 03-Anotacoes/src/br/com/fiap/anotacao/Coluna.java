package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Configura até quando a anotação estará presente
@Retention(RetentionPolicy.RUNTIME)//Execução
//Configura onde pode ser utilizada a anotação
@Target(ElementType.FIELD) //atributos
public @interface Coluna {

	boolean obrigatorio() default false;
	
	String nome();
	
}
