package ultimaaula;

import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Modos de criação de um optional
		 */
		Optional<String> opcional = Optional.empty(); //o Optional sempre será vazio
		Optional<String> opcional2 = Optional.of("Thiago"); //o Optional sempre precisará ter um valor
		
		/*
		 * o Optional com ofNullable pode tanto ser nulo (irá agir como o optional.empty) 
		 * como ter um valor (irá se comportar como o optional.of
		 */
		Optional<String> opcional3 = Optional.ofNullable(null); 
		
		System.out.println(opcional);
		System.out.println(opcional2);
		System.out.println(opcional3.orElse("oi")); //usando o ".orElse", caso o valor do optional seja "null", sera exibido o que foi passado no orElse
		

		// criando um array de 10 possições, para strings
		String[] palavras = new String[10];
		//colocando valor na posição 7 do array
		palavras[7] = "Vania";
		
		//criando duas instancias de optional, uma pegando o valor 2 do array, e outro o valor 7
		Optional<String> seila = Optional.ofNullable(palavras[2]);
		Optional<String> seila2 = Optional.ofNullable(palavras[7]);
		
		//irá imprimir a instancia do optional,e caso seja nula, ira imprimir o que está no "orElse"
		System.out.println(seila.orElse("Ta vazio, pode colocar um nome novo"));
		System.out.println(seila2.orElse("Ta vazio, pode colocar um nome novo"));

		//modo de se fazer a mesma coisa acima, porem, com um if padrão e sem o uso do optional
		if(palavras[2] == null) {
			System.out.println("Ta vazio, pode colocar um nome novo");
		} else {
			System.out.println(palavras[2]);
		}
		
		/*
		 * o bloco de código abaixo, irá instanciar um objeto Colaborador, com base na modelagem da classe colaborador
		 * depois irá colocar esse colaborador dentro de um optional
		 * irá mapear o optional, buscando pelo nome, e caso o nome comece com J, irá passar pelo filtro e exibir o nome
		 * caso não começe com J, não passará pelo filtro, e irá "jogar" um novo exception, informando que o colaborador não foi encontrado 
		 */
		Colaborador c1 = new Colaborador(1L, "Joice Bond", 1000.0f);
		
	    Optional<Colaborador> colaboradorOptional = Optional.of(c1);
	    
	    colaboradorOptional.map(resposta -> resposta.getNome())
	    		.filter(colaboradorNome -> colaboradorNome.startsWith("J"))
	    		.orElseThrow(() -> new RuntimeException("Colaborador não encontrado!"));
	                                                    
	    System.out.println("\nNome do Colaborador: " + colaboradorOptional.get().getNome());
		
		
		
	}

}
