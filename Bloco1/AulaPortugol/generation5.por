programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real nota1,nota2,nota3,mediaFinal

		escreva("\n Coloque a primeira nota: ")
		leia(nota1)
		escreva("\n Coloque a segundaa nota: ")
		leia(nota2)
		escreva("\n Coloque a terceira nota: ")
		leia(nota3)

		mediaFinal = (nota1*2+nota2*3+nota3*5)/10
		escreva("\nMédia foi de: ",mat.arredondar(mediaFinal,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */