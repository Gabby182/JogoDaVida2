# JogoDaVida2
-----Desafio proposto pela empresa Captalys, para construção de um código para o conhecido Game of Life de John Horton Conway-----

--------------------------------------------------------Objetivo------------------------------------------------------------------

Implementar minha própria versão do Jogo da Vida, criado pelo matemático John Horton Conway em 1970. Este é um jogo do tipo zero-player, o que significa que sua evolução é determinada por seu estado inicial, não necessitando de interação subsequente. O universo do Jogo da Vida, é um tabuleiro bidimensional de células quadradas, onde cada uma delas tem um de dois estados possíveis: viva ou morta. Cada célula interage com suas oito vizinhas adjacentes horizontais, verticais ou diagonais.

----------------------------------------------------------Regras------------------------------------------------------------------

Qualquer célula viva com menos de dois vizinhos vivos morre de solidão.
Qualquer célula viva com mais de três vizinhos vivos morre de superpopulação.
Qualquer célula morta com exatamente três vizinhos vivos se torna uma célula viva.
Qualquer célula viva com dois ou três vizinhos vivos continua no mesmo estado para a próxima geração.
----------------------------------------------------Estrutura do código-----------------------------------------------------------

Declaração de variáveis para o cenário inicial, cenário1, por meio da criação de matriz quadrada 9 X 9, que aceita somente inteiros. Não foi validada para receber somente 0 ou 1, mas é composta por 0 que representa a situação de vivo, e 1 que representa morto.
Declaração de matriz para o cenário após iteração, chamado cenário 2, aberto a receber valores.
Impressão de verificação do cenário 1.
Verificação quais células estão vivas e quais estão mortas para testar a hipótese de vida e morte. Sabendo cada célula interage com suas oito vizinhas adjacentes horizontais, verticais ou diagonais. O comando "for", deverá percorrer a matriz cenário1 e verificar l-1, pois a iteração sempre adiciona uma repetição. A base da verificação deve ser uma matriz 3 X 3, com pelo menos 4 células vivas, o restante estando morta. As células vizinhas na horizontal deverão ser verificadas e somadas. Caso estejam vivas o número de células vivas deverá ser 4 e o de mortas 5. Para a aplicação das regras do jogo, foram necessárias estruturas lógicas que verifiquem o cenário da matriz cenário1, a quantidade de mortos e vivos da células e vizinhança da matriz 3 X 3.
Impressão do cenário 2.
Inspirado no código da: https://www.google.com/amp/s/www.geeksforgeeks.org/program-for-conways-game-of-life/amp/
