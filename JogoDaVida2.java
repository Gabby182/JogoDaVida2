


public class JogoDaVida2 {
	
	private static int sair;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub0

	    //Declaração de variáveis para o cenário inicial, cenário1, por meio da criação de matriz quadrada 9 X 9, que aceita somente inteiros. 
	    //Não foi validada para receber somente 0 ou 1, mas é composta por 0 que representa a situação de vivo, e 1 que representa morto. 
	    int l = 9;
	    int c = 9;
	    int cenário_1[][]= new int [l][c];
	    //Declaração de matriz para o cenário após iteração, chamado cenário 2, aberto a receber valores.                    
	    int cenário_2 [][]= new int [l][c];

	    //Impressão de verificação do cenário 1. 
	    System.out.println(" Cenário 1");
	    for (int i=0 ; i < l ;i++ ){
            for (int j=0 ; j < c ;j++ ){   
                if ((i==0 || i==1 || i==7|| i==8)&&(j==0 || j==1 || j==7|| j==8)){
                cenário_1[i][j]=0;
                System.out.print(" |v| ");
                }
                else {
                cenário_1[i][j]=1;
                System.out.print(" |m| ");
                }
            }
            System.out.println();   
       }
	      
	    //Verificar quais células estão vivas e quais estão mortas para testar a hipótese de vida e morte.
	    //Sabendo cada célula interage com suas oito vizinhas adjacentes horizontais, verticais ou diagonais.
	    //O comando "for", deverá percorrer a matriz cenário1 e verificar l-1, pois a iteração sempre adiciona uma repetição.
	    for (int m = 1; m < l - 1; m++){
		    for (int n = 1; n < c - 1; n++){
				for (int i = -1; i <= 1; i++){
			        for (int j = -1; j <= 1; j++){
	    //A base da verificação deve ser uma matriz 3 X 3, com pelo menos 4 células vivas, o restante estando morta.                
	                    int vivos = 4;
				        int mortos = 5;
		//As células vizinhas na horizontal deverão ser verificadas e somadas. 
		//Caso estejam vivas o número de células vivas deverá ser 4 e o de mortas 5. 
	                    vivos = vivos + cenário_1[m + i][n + j];
	                    vivos = vivos - cenário_1[m][n];
						mortos = mortos + cenário_1[m + i][n + j];
						mortos = mortos - cenário_1[m][n];
		//Para a aplicação das regras do jogo, foram necessárias estruturas lógicas que verifiquem o cenário da matriz cenário1, 
		//a quantidade de mortos e vivos da células e vizinhança da matriz 3 X 3.   
					if (((cenário_1[m][n] == 0) && (mortos < 5))&&((cenário_1[m][n] == 0) && (vivos > 4)))
					    cenário_2[m][n] = 1;
					else if (((cenário_1[m][n] == 0) && (mortos > 6))&&((cenário_1[m][n] == 0) && (vivos < 3)))
					    cenário_2[m][n] = 1; 
					else if ((cenário_1[m][n] == 1) && (mortos == 6))
						cenário_2[m][n] = 0;
					else
						cenário_2[m][n] = cenário_1[m][n];
					}	
				}	
			}
		}
		//Impressão do cenário 2
	    System.out.println("Cenário 2");
		    for (int i = 0; i < l; i++){
				for (int j = 0; j < c; j++){
				 	if (cenário_2[i][j] == 0)
						System.out.print(" |v| ");
					else
						System.out.print(" |m| ");
				}
				System.out.println();
			}
	}

}
