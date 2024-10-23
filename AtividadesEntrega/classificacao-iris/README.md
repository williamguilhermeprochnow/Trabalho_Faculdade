Tópicos:
	
 	1 - Importação das Libs necessárias juntamente com o carregamento dos dados e verificações inicias, como: uma breve amostra de como estão os
    dados na tabela, informações da tipagem de cada uma das colunas, valores superficiais para se ter uma melhor noção da tabela com um todo e por
    fim a quantia de linhas e colunas que a tabela contém.

	2 - A separação das colunas em tabelas para treino e teste: uma contendo somente as colunas features e a outra somente a colunas target. Após 
    essa separação, é feita uma separação de dados aleatória, pegando 70% dos dados para treino e o restante deixando para teste.

	3 - Ocorre a predição em si, utilizando-se dos classificadores "DecisionTreeClassifier" e "KNN", juntamente com o plot dos gráficos (matriz de 
    confusão e árvore de decisão) resultantes dessas diferentes predições e com diferentes parâmetros com base em suas métricas.

Análise:
        
	    Ambos os modelos obtiveram a pontuação máxima ou chegaram bem perto, pois a quantidade de dados foi muito pequena para realizar uma ánalise 
    consistente nas métricas, assim os modelos obtiveram overfit em todos os testes. Por esse motivo, não conseguiria dizer através das métricas 
    obtidas qual dos parâmetros melhor se saiu, seria uma resposta muito superficial dos parâmetros dos modelos por causa da base de dados que foi 
    utilizada.
