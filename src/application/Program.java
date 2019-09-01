package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto>lista = new ArrayList<>();
		
		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));
		
		//Declarando Funcao lambda inline
			
		
		List<String> nomes = lista.stream().map( p-> p.getNome().toUpperCase()).collect(Collectors.toList());		
		nomes.forEach(System.out::println);
		
	}

}
