package ultimaaula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando uma nova lista de Strings, com alguns estados
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		//filtrando apenas os estados unicos da lista acima, organizando em ordem alfabética, e gerando uma nova lista com base nisso, utilizando Stream
		List<String> estadosFiltrados = estados.stream().distinct().sorted().collect(Collectors.toList());
		
		//utilizando stream para percorrer a lista de estador, verificando os estados unicos, e gerando uma contagem de quantos essa lista filtrada possui
		int numeroEstados = (int) estados.stream().distinct().count();
		
		System.out.println("O total de estados unicos é: " + numeroEstados);
		System.out.println(estados);
		System.out.println(estadosFiltrados);
		
		//criando uma lista de numeros inteiros
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numeros);
		
		//utilizando map das streams, para percorrer a lista, e para cada numero dentro dela, elevar o numero ao cubo, e depois gerar uma nova lista com base nos resultados
		List<Integer> numerosCubo = numeros.stream()
				.map(numero -> numero*numero*numero)
				.collect(Collectors.toList());
		System.out.println(numerosCubo);
		
		//gerando uma nova lista, com base nos numeros, onde irá entrar apenas os numeros pares (parte do filter), e limitado apenas aos 3 primeiros resultados(parte do limit)
		List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).limit(3).collect(Collectors.toList());
		System.out.println(numerosPares);
		
		//fazendo a mesma coisa que a lista acima, porem sem gerar uma lista, usando Stream direto dentro do syso de saida
		System.out.println("Esse é diretão " + numeros.stream().filter(numero -> numero % 2 == 0).limit(3).collect(Collectors.toList()));
		
//		outro modo de gerar a saida de cada um dos numeros da lista acima, porem usando forEach, para que cada numero seja impresso em uma linha nova do console
		numeros.stream()
				.filter(numero -> numero % 2 == 0)
				.limit(3)
				.forEach(batata -> System.out.println(batata));
		
		
		
//		
	}

}
