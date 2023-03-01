package operadores;

public class MinhaClasse {
	public static void main(String[] args) {
		//operador de atribuição '='
		
   
		String nome = "Hanna";
		//operadores aritimeticos + - * / % ()

		String nomeCompleto ="LINGUAGEM"+" "+"JAVA";
		String soma =1+1+1+"1";
		
		System.out.println(nomeCompleto);
		System.out.println(soma);
		
		//operadores unários, junto com outros conectores + / - / ++ incremento /
		// -- decremento / ! negacao
		
		int numero = 5;
		System.out.println(--numero);
		System.out.println(++numero);
		System.out.println(-numero);
		numero = numero+2;
		System.out.println(numero);
		numero++;
		System.out.println(numero);
		numero--;
		System.out.println(numero++);
		System.out.println(numero);
		System.out.println(++numero);
		
		//operador ternario ?:
		//condicao ? <caso seja true> : <caso seja falso>
		
		String casa = "";
		//casa = "nova";
		int a =1;
		int b =2;
		casa=(a==b)?"Nova":"Velha";
		
		System.out.println(casa);
		//operadores relacionais == igual,  != direrente, > maior, < menor, <= menor ou igual
		casa=(a<=b)?"Nova":"Velha";
		System.out.println(casa);
		//operadores lógicos && e, || ou
		casa=(a==b||a<=b)?"Nova":"Velha";
		
		System.out.println(casa);
	
	}

}
