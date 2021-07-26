programa
{
	
	funcao inicio()
	{
		
		inteiro mat[3][3],x,y,somav = 0,soma = 0
		 
		para(x=0;x<3;x++)
		{
			para(y=0;y<3;y++)
			{
				escreva("Digite os valores da matriz: ")
				leia(mat[x][y])
				somav = somav + mat[x][y]
				
				se(x == y)
	               {
	                soma = soma + mat[x][y]	
	               }
				}
			}
             	escreva("\nSoma dos valores: ",somav)
			escreva("\nOs valores da primeira diagonal: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 7, 10, 3}-{somav, 7, 24, 5}-{soma, 7, 34, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */