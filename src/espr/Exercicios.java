package espr;

import java.util.Scanner;

public class Exercicios {

	public void exerc1() {
		/* Calculadora de Média
		   Crie um programa que solicite ao usuário que insira três notas (de 0 a 10) e exiba a média das notas. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a 1ª nota: ");
		float nota1 = input.nextFloat();
		
		System.out.print("Digite a 2ª nota: ");
		float nota2 = input.nextFloat();
		
		System.out.print("Digite a 3ª nota: ");
		float nota3 = input.nextFloat();
		
		input.close();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média das notas é " + media);
	}
	
	public void exerc2() {
		/* Conversor de Temperatura
		   Crie um programa que solicite ao usuário que insira uma temperatura em Celsius e exiba a
		   temperatura equivalente em Fahrenheit. A fórmula para converter Celsius em Fahrenheit é: `F = C * 9/5 + 32`. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em Celsius: ");
		float tempC = input.nextFloat();
		
		float tempF = (tempC * (float)1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é " + tempF);
		
		input.close();
	}
	
	public void exerc3() {
		/* Calculadora de IMC (Índice de Massa Corporal)
           Crie um programa que solicite ao usuário que insira seu peso (em quilogramas) e altura (em metros)
           e calcule o Índice de Massa Corporal (IMC). O IMC é calculado pela fórmula: `IMC = peso / altura ^ 2`. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu peso (Kg): ");
		float peso = input.nextFloat();
		
		System.out.print("Digite sua altura (m): ");
		float altura = input.nextFloat();
		
		float imc = peso / (altura * altura);
		
		System.out.println("O se IMC é " + imc);
		
		input.close();
	}
	
	public void exerc4() {
		/* Exercício 4: Validador de Senha
		   Crie um programa que solicite ao usuário que crie uma senha. A senha deve atender aos seguintes critérios:
		       • Pelo menos 8 caracteres de comprimento.
		       • Pelo menos uma letra maiúscula e uma letra minúscula.
		       • Pelo menos um número.
	       O programa deve exibir uma mensagem indicando se a senha é válida ou não. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma senha seguindo as seguintes regra:\n"
				+ "• Pelo menos 8 caracteres de comprimento.\n"
				+ "• Pelo menos uma letra maiúscula e uma letra minúscula.\n"
				+ "• Pelo menos um número.\n");
		String senha = input.next();
		
		if (senha.length() < 8) {
			System.out.print("Senha inválida! A senha deve ter pelo menos 8 caracteres de comprimento!");
		}
		else if (senha.equals(senha.toLowerCase()) || senha.equals(senha.toUpperCase())) {
			System.out.print("Senha inválida! A senha deve ter pelo menos uma letra maiúscula e uma letra minúscula!");
		}
		else if (!senha.contains("0") && !senha.contains("1") && !senha.contains("2") && !senha.contains("3") && !senha.contains("4")
				&& !senha.contains("5") && !senha.contains("6") && !senha.contains("7") && !senha.contains("8") && !senha.contains("9")) {
			System.out.print("Senha inválida! A senha deve ter pelo menos um número!");
		}
		else {
			System.out.print("Senha válida!");
		}
		
		input.close();
	}

	public void exerc5() {
		/* Calculadora de Juros Simples
           Crie um programa que solicite ao usuário que insira o valor principal, a taxa de juros (em porcentagem)
           e o número de anos, e calcule o montante total após juros simples.
           A fórmula para calcular juros simples é: `Montante = Principal * (1 + Taxa * Tempo)`. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor inicial: ");
		float valor = input.nextFloat();
		
		System.out.print("Digita a taxa de juros (%): ");
		float juros = input.nextFloat();
		
		System.out.print("Digite a quantidade de anos: ");
		float anos = input.nextFloat();
		
		float montante = valor * (1 + (juros / 100) * anos);

		System.out.print("O valor do montante total no final será de R$ " + montante);
		
		input.close();
	}

	public void exerc6() {
		/* Conversor de Moeda
           Crie um programa que solicite ao usuário que insira um valor em reais (R$) e exiba o valor
           equivalente em dólares americanos (USD). Suponha uma taxa de câmbio fixa de 1 USD = 5 BRL. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor em reais (R$): ");
		float valorR = input.nextFloat();
				
		float valorD = valorR / 5;

		System.out.print("O valor em dólares é $ " + valorD);
		
		input.close();
	}

	public void exerc7() {
		/* Validador de E-mail
           Crie um programa que solicite ao usuário que insira um endereço de e-mail e valide se o 
           formato do e-mail é válido (ou seja, se contém um símbolo '@' e um domínio válido). */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um email: ");
		String email = input.next();
				
		if (!email.contains("@") || !email.contains("gmail.com")) {
			System.out.print("Email inválido!");
		}
		else {
			System.out.print("Email válida!");
		}
		
		input.close();
	}
	
	public void exerc8() {
		/* Contador de Caracteres
           Crie um programa que solicite ao usuário que insira uma frase e exiba o número de caracteres na frase, excluindo espaços em branco. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = input.nextLine();
		
		System.out.print("A frase contém " + frase.length() + " caracteres.");
		
		input.close();
	}
	
	public void exerc9() {
		/* Conversor de Medidas
           Crie um programa que solicite ao usuário que insira uma medida em metros e exiba o equivalente em centímetros, polegadas e pés. */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma medida em metros: ");
		float metros = input.nextFloat();
		
		float cent = metros * 100;
		
		float pol = metros * (float)39.3701;
		
		float pes = metros * (float)3.28084;
		
		System.out.println(metros + " metros é igual à:");
		System.out.println(cent + " centímetros;");
		System.out.println(pol + " polegadas;");
		System.out.println(pes + " pés.");
		
		input.close();
	}
	
	public void exerc10() {
		/* Validador de Número de Telefone
		   Crie um programa que solicite ao usuário que insira um número de telefone no formato `(DDD) XXXX-XXXX` e valide se o número de telefone é válido. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um telefone no formato (DDD) XXXX-XXXX: ");
		String tel = input.nextLine();
		
		String[] caracteres = tel.split("");
		
		boolean erro = false;
		
		if (tel.length() != 15) {
			erro = true;
		}
		else {
			for (int i = 0; i < tel.length(); i++) {
				String c = caracteres[i];
				
				if (i == 0 && !c.equals("(")) {
					erro = true;
				}
				else if (i == 4 && !c.equals(")")) {
					erro = true;
				}
				else if (i == 5 && !c.equals(" ")) {
					erro = true;
				}
				else if (i == 10 && !c.equals("-")) {
					erro = true;
				}
				else if (i != 0 && i != 4 && i != 5 && i != 10 && !Character.isDigit(tel.charAt(i))) {
					erro = true;
				}
				
				if (erro) {
					break;
				}
			}
		}

		if (erro) {
			System.out.print("Telefone inválido!");
		}
		else {
			System.out.print("Telefone válido!");
		}
	}
}
