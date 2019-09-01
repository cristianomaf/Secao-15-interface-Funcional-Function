package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Produto;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto>lista = new ArrayList<>();
		
		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));
		                              //map aplica a funcao a cada elemento da lista
		List <String> nomes = lista.stream().map(new UpperCaseName()).collect(Collectors.toList());
		          // primeiro converte lista para stream
		// depois converte denovo para lista 

		nomes.forEach(System.out::println);
		
	}

}
