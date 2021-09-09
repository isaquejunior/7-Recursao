package binaryfib;

public class BinaryFib {
	Algoritmo BinaryFib(k):
		
		Entrada: inteiro não negativo k 
		Saída: o k-ésimo número Fibonacci Fk 

		 
		if k ≤ 1 então
			return k
		else
			return BinaryFib(k - 1) + BinaryFib(k - 2)

}
