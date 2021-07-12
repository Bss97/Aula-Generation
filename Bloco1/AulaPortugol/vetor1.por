programa
{
	
	funcao inicio()
	{
		//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
		//Encontre após a maior pontuação e a apresente. 

		real pont[5],maiorp = 0.0
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("Digite um valor: ")
			leia(pont[x])
		
		
		se(pont[x] >= maiorp)
		
			maiorp = pont[x]
		
		}
		escreva("\nMaior pontuação é: ",maiorp)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pont, 9, 7, 4}-{maiorp, 9, 15, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */