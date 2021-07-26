programa
{
	
	funcao inicio()
	{
		
		//4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores 
		//dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.

		inteiro mat[3][3],x,y,somav = 0,soma = 0
		 
		para(x=0;x<3;x++)
		{
			para(y=0;y<3;y++)
			{
			escreva("\nDigite os valores da matriz: ")
			leia(mat[x][y])
			somav = somav + mat[x][y]
			}
		}
		limpa()
		para(x=0;x<=2;x++)
		{
			para(y=0;y<=2;y++)
			{
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
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 10, 10, 3}-{somav, 10, 24, 5}-{soma, 10, 34, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */