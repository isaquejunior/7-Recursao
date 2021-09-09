package binarysum;

public class BinarySum {
	Algoritmo BinarySum(A, i, n):
		
		Entrada: um arranjo A e os inteiros i e n 
		Saída: a soma dos n inteiros de A iniciando pelo índice i
		 
		if n = 1 então
			return A[i];
					
		return BinarySum(A, i, ⎡n/2⎤) + BinarySum(A, i + ⎡n/2⎤, ⎣n/2⎦)

}
