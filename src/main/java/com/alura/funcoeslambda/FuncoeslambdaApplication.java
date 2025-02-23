package com.alura.funcoeslambda;

import com.alura.funcoeslambda.modelos.Calculadora;
import com.alura.funcoeslambda.services.OperacoesFuncional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FuncoeslambdaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FuncoeslambdaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Calculadora calculadora = new Calculadora();
		int resultadoMultiplicacao = calculadora.multiplicacao(2, 2);
		System.out.println(resultadoMultiplicacao);

		OperacoesFuncional calculadoraAnonima = (a, b) -> a * b;

//		OperacoesFuncional calculadoraAnonima = new OperacoesFuncional() {
//			@Override
//			public int multiplicacao(int a, int b) {
//				return a * b;
//			}
//		};
		System.out.println(calculadoraAnonima.multiplicacao(3, 3));
	}
}
