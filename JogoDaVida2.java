


public class JogoDaVida2 {
	
	private static int sair;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub0

	    //Declara��o de vari�veis para o cen�rio inicial, cen�rio1, por meio da cria��o de matriz quadrada 9 X 9, que aceita somente inteiros. 
	    //N�o foi validada para receber somente 0 ou 1, mas � composta por 0 que representa a situa��o de vivo, e 1 que representa morto. 
	    int l = 9;
	    int c = 9;
	    int cen�rio_1[][]= new int [l][c];
	    //Declara��o de matriz para o cen�rio ap�s itera��o, chamado cen�rio 2, aberto a receber valores.                    
	    int cen�rio_2 [][]= new int [l][c];

	    //Impress�o de verifica��o do cen�rio 1. 
	    System.out.println(" Cen�rio 1");
	    for (int i=0 ; i < l ;i++ ){
            for (int j=0 ; j < c ;j++ ){   
                if ((i==0 || i==1 || i==7|| i==8)&&(j==0 || j==1 || j==7|| j==8)){
                cen�rio_1[i][j]=0;
                System.out.print(" |v| ");
                }
                else {
                cen�rio_1[i][j]=1;
                System.out.print(" |m| ");
                }
            }
            System.out.println();   
       }
	      
	    //Verificar quais c�lulas est�o vivas e quais est�o mortas para testar a hip�tese de vida e morte.
	    //Sabendo cada c�lula interage com suas oito vizinhas adjacentes horizontais, verticais ou diagonais.
	    //O comando "for", dever� percorrer a matriz cen�rio1 e verificar l-1, pois a itera��o sempre adiciona uma repeti��o.
	    for (int m = 1; m < l - 1; m++){
		    for (int n = 1; n < c - 1; n++){
				for (int i = -1; i <= 1; i++){
			        for (int j = -1; j <= 1; j++){
	    //A base da verifica��o deve ser uma matriz 3 X 3, com pelo menos 4 c�lulas vivas, o restante estando morta.                
	                    int vivos = 4;
				        int mortos = 5;
		//As c�lulas vizinhas na horizontal dever�o ser verificadas e somadas. 
		//Caso estejam vivas o n�mero de c�lulas vivas dever� ser 4 e o de mortas 5. 
	                    vivos = vivos + cen�rio_1[m + i][n + j];
	                    vivos = vivos - cen�rio_1[m][n];
						mortos = mortos + cen�rio_1[m + i][n + j];
						mortos = mortos - cen�rio_1[m][n];
		//Para a aplica��o das regras do jogo, foram necess�rias estruturas l�gicas que verifiquem o cen�rio da matriz cen�rio1, 
		//a quantidade de mortos e vivos da c�lulas e vizinhan�a da matriz 3 X 3.   
					if (((cen�rio_1[m][n] == 0) && (mortos < 5))&&((cen�rio_1[m][n] == 0) && (vivos > 4)))
					    cen�rio_2[m][n] = 1;
					else if (((cen�rio_1[m][n] == 0) && (mortos > 6))&&((cen�rio_1[m][n] == 0) && (vivos < 3)))
					    cen�rio_2[m][n] = 1; 
					else if ((cen�rio_1[m][n] == 1) && (mortos == 6))
						cen�rio_2[m][n] = 0;
					else
						cen�rio_2[m][n] = cen�rio_1[m][n];
					}	
				}	
			}
		}
		//Impress�o do cen�rio 2
	    System.out.println("Cen�rio 2");
		    for (int i = 0; i < l; i++){
				for (int j = 0; j < c; j++){
				 	if (cen�rio_2[i][j] == 0)
						System.out.print(" |v| ");
					else
						System.out.print(" |m| ");
				}
				System.out.println();
			}
	}

}
