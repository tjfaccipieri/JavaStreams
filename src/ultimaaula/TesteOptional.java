package ultimaaula;

import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

//		Optional<String> opcional = Optional.empty();
//		Optional<String> opcional2 = Optional.of("Thiago");
//		Optional<String> opcional3 = Optional.ofNullable(null);
//		
//		System.out.println(opcional);
//		System.out.println(opcional2);
//		System.out.println(opcional3.orElse("oi"));
		
		String[] palavras = new String[10];
		
		Optional<String> seila = Optional.ofNullable(palavras[2]);
		
		System.out.println(seila.orElse("Ta vazio, pode colocar um nome novo"));
		
		palavras[7] = "Vania";
//		
//		if(palavras[2] == null) {
//			System.out.println("Ta vazio, pode colocar um nome novo");
//		} else {
//			System.out.println(palavras[2]);
//		}
		
		Colaborador c1 = new Colaborador(1L, "Joice Bond", 1000.0f);
		
	    Optional<Colaborador> colaboradorOptional = Optional.of(c1);
	    
	    
	    colaboradorOptional.map(resposta -> resposta.getNome())
	    	.filter(colaboradorNome -> colaboradorNome.startsWith("M"))
	    	.orElseThrow(() -> new RuntimeException("Colaborador não encontrado!"));
	    
	    System.out.println(colaboradorOptional.get().getNome());
//	    System.out.println(colabOptional.map(resposta -> resposta.getNome()));
//	    colaboradorOptional.map(resposta -> resposta.getNome())
//	    		.filter(colaboradorNome -> colaboradorNome.startsWith("J"))
//	    		.orElseThrow(() -> new RuntimeException("Colaborador não encontrado!"));
//	                                                    
//	    System.out.println("\nNome do Colaborador: " + colaboradorOptional.get().getNome());
		
		
		
	}

}
