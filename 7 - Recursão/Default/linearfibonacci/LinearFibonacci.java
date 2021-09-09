package linearfibonacci;

public class LinearFibonacci {
	Algoritmo LinearFibonacci(k):
		
		Entrada: um inteiro não negativo k 
		Saída: um par de números Fibonacci (Fk , Fk-1) 

		 
		if k ≤ 1 então 
			return (k, 0) 
		else 
			(i, j) ← LinearFibonacci(k - 1)
		return (i + j, i)

}
