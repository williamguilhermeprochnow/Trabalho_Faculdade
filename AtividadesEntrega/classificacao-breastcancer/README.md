Tópicos:
	
 	1 - Importação das Libs necessárias juntamente com o carregamento dos dados e verificações inicias, como: uma breve amostra de como estão os
    dados na tabela, a quantia de linhas e colunas que a tabela contém, informações da tipagem de cada uma das colunas, valores 
    superficiais para se ter uma melhor noção da tabela como um todo, verificação da quantidade de valores nulos contidos em cada coluna e as 
    correlações entre elas.

	2 - A separação das colunas em tabelas para treino e teste: uma contendo somente as colunas features e a outra somente a colunas target. Após 
    essa separação, é feita uma separação de dados aleatória, pegando 70% dos dados para treino e o restante deixando para teste.

	3 - Ocorre a predição em si, utilizando-se do classificador "RandomForestClassifier".

    4 - É realizado a avaliação de desempenho de acertos gerais (Acurácia), uma matriz de confusão e relatório de clasificação (precision, 
    recall, f1-score).

Análise:
        
	    O modelo chegou bem perto da pontuação máxima, podendo dizer que o modelo teve um overfit, classificando com uma alta precisão os casos de 
    tumores benignos e malignos.