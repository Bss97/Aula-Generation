programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real a,b,c,r,s,d
		
		escreva("\nValor de A: ")
		leia(a)
		escreva("\nValor de B: ")
		leia(b)
		escreva("\nValor de C: ")
		leia(c)
		
		r = mat.potencia(a + b, 2.0)
		s = mat.potencia(b + c, 2.0)

		d = (r + s)/2
		escreva("\nValor de d: ",mat.arredondar(d,2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */