package com.alura.funcoeslambda;

import com.alura.funcoeslambda.modelos.Calculadora;
import com.alura.funcoeslambda.services.ConverteString;
import com.alura.funcoeslambda.services.NumeroPrimo;
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
		// EXERCÍCIO 1
		OperacoesFuncional calculadoraAnonima = (a, b) -> a * b;

//		OperacoesFuncional calculadoraAnonima = new OperacoesFuncional() {
//			@Override
//			public int multiplicacao(int a, int b) {
//				return a * b;
//			}
//		};
		System.out.println(calculadoraAnonima.multiplicacao(3, 3));

		// EXERCÍCIO 2

//		NumeroPrimo numeroPrimo = new NumeroPrimo() {
//			@Override
//			public String primo(int a) {
//				if (a % 2 == 0) {
//					return "primo";
//				} else {
//					return "não é primo";
//				}
//			}
//		};

		NumeroPrimo numeroPrimoLambda = (a) -> {
			if (a % 2 == 0) {
				return "primo";
			} else {
				return "não é primo";
			}
		};
		System.out.println(numeroPrimoLambda.primo(2));

		// EXERCÍCIO 3

//		String textoConverter = "teste";
//		ConverteString converteString = new ConverteString() {
//			@Override
//			public String converteString(String texto) {
//				return texto.toUpperCase();
//			}
//		};

		ConverteString converteStringLambda = (texto) -> texto.toUpperCase();
		System.out.println(converteStringLambda.converteString("teste"));


	}
}