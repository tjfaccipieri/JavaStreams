package ultimaaula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criando uma nova lista de numeros inteiro, ja com os valores
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//exibindo a lista por completo
		System.out.println(numeros);
		
		//utilizando um ForEach básico, para imprimir em console cada um dos numeros da lista em uma linha
		for(Integer numero : numeros) {
			System.out.println(numero);
		}
		
		//fazendo a mesma coisa acima, porém com uso de forEach junto com Lambda
		numeros.forEach((numero) -> System.out.println(numero));

		//criando um for each básico para verificar e exibir em console, apenas os numeros pares
		for(Integer numero : numeros) {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		}
		
		//fazendo a mesma coisa do exemplo acima, com lambda
		numeros.forEach(numero -> {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		});

	}

}
