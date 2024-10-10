Tópicos:
	1 - Importação das Libs necessárias juntamente com o carregamento dos dados e verificações inicias, como: uma breve amostra de como estão os
    dados na tabela, informações da tipagem de cada uma das colunas, valores superficiais para se ter uma melhor noção da tabela com um todo e por
    fim a quantia de linhas e colunas que a tabela contém.

	2 - É feita uma análise para verificar valores faltantes em cada uma das colunas e logo após uma tratativa na coluna "age" pegando somente os 
    valores que estão no intervalo em que a maior parte dos dados estão, assim eliminando os dados faltantes (pois não é maioria) e deixando a 
    tabela mais apropriada para se trabalha na predição.

	3 - Acontece a seleção das colunas que mais vão importar na predição, as "features", são as colunas que mais vão ter valor na hora de predizer a 
    coluna target, obviamente também é feita a seleção da coluna target: "survived". É feita uma breve tratativa de tranformação de uma coluna 
    categórica para numérica, assim fazendo a coluna se encaixar melhor com relação aos valores das demais colunas e ao próprio formato que 
    utilizaremos pra predição.

	4 - A separação das colunas em tabelas para treino e teste: uma contendo somente as colunas features e a outra somente a colunas target. Após 
    essa separação, é feita uma separação de dados aleatória, pegando 70% dos dados para treino e o restante deixando para teste.

	5 - Ocorre a predição em si, utilizando-se do classificador "KNN" observando os três dados mais próximos (vizinhos) e realizando a clissificação 
    deles como fazendo parte de um grupo só.

	6 - É realizado a avaliação de desempenho tanto de acertos gerais (Acurácia) e uma matriz de confusão, deixando mais evidente o que foi 
    identificado como positivo, falso positivo, negativo e falso negativo pela predição realizada.

Conclusão:
        O desempenho do modelo está bom, pois se considerarmos ML em si, veremos que o ideal não é ficar muito próximo a 1 (nesse caso da acurácia) 
    pelo motivo que outros dados podem surgir na mesma fonte de dados e se o modelo estiver bem treinado aos dados inicias (como se ele lembrasse da 
    tabela como algo estático), o que surgir com pouco mais de variação a esses dados pode jogar a precisão muito pra baixo, dizendo-se que o modelo 
    está com overfit (ele é muito bom para analisar os atuais dados somente). Associando isso com a matriz de confusão, podemos ver que foi uma boa 
    classificação, pois se somarmos os acertos, dará um número superior, porém nem tanto, ao valor da soma dos erros.
	    Se quiséssemos melhorar ainda mais nossa predição, imagino que poderiamos abordar em duas maneiras: 
    1ª - Ampliar o número de "vizinhos" em que o dado será comparado para se agrupar na classificação, assim dando ao modelo mais informação do que está ao redor de um dado em específico.
    2ª - Alteração do número de interações em que o KNN terá com os dados, podendo diversas vezes considerar os três vizinhos mais próximos diferentes, pois para cada localização de um dado, provalvelmente terá mais de três vizinhos para serem considerados, assim, o agrupamento ficará mais dinâmico e preciso ao decorrer das interções.