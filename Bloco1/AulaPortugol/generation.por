programa
{
	
	funcao inicio()
	{
		inteiro anos,meses,dias,totalDias
		
		escreva("\nDigite a sua idade: ")
		leia(anos)
		
		escreva("\nDigite a sua idade em meses: ")
		leia(meses)
		
		escreva("\nDigite a sua idade em dias: ")
		leia(dias)

		totalDias = anos * 365 + meses * 30 + dias
		escreva("\nTotal de dias: " ,totalDias)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */