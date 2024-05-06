package ultimaaula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		List<String> estadosFiltrados = estados.stream().distinct().sorted().collect(Collectors.toList());
		
		int numeroEstados = (int) estados.stream().distinct().count();
		
//		System.out.println("O total de estados unicos é: " + numeroEstados);
//		System.out.println(estados);
//		System.out.println(estadosFiltrados);
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> numerosCubo = numeros.stream()
				.map(numero -> numero*numero*numero)
				.collect(Collectors.toList());
		
		List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).limit(3).collect(Collectors.toList());
		
		numeros.stream()
				.filter(numero -> numero % 2 == 0)
				.limit(3)
				.forEach(batata -> System.out.println(batata));
		//numero -> system.out.println(numero)
		
		
//		System.out.println(numeros);
//		System.out.println(numerosCubo);
//		System.out.println(numerosPares);
//		
//		System.out.println("Esse é diretão " + numeros.stream().filter(numero -> numero % 2 == 0).limit(3).collect(Collectors.toList()));
	}

}
