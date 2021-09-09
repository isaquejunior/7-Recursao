package reversearray;

public class ReverseArray {
	Algoritmo ReverseArray(A, i, j):
		
		Entrada: um arranjo A e índices inteiros não negativos i e j 
		Saída: os elementos de A invertidos começando no índice i e terminando em j
		
		if i < j então 
			Inverter A[i] e A[j]
			ReverseArray(A, i + 1, j - 1) 
		return

}
