programa
{
	
	funcao inicio()
	{
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00. */

		real salario,filho,medsalario=0.0,medfilhos=0.0,maiorsalario=0.0,persalario,quantsala=0.0,quantfil=0.0
		inteiro x
		para(x=1;x<=20;x++)
		{
			escreva("\nQual o valor do seu salario: ")
			leia(salario)
			escreva("\nQuantidade de filhos: ")
			leia(filho)

			medsalario = medsalario / 20
			medfilhos = medfilhos / 20
			persalario = (quantsala * 100) / 20
			
			
		}
		
		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 714; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */