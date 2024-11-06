Tópicos:
	
 	1 - Importação das Libs necessárias juntamente com o carregamento dos dados e verificações inicias, como: uma breve amostra de como estão os
    dados na tabela, a quantia de linhas e colunas que a tabela contém, informações da tipagem de cada uma das colunas, valores 
    superficiais para se ter uma melhor noção da tabela como um todo e as correlações entre cada uma das colunas.

	2 - A separação das colunas em tabelas para treino e teste: uma contendo somente as colunas features e a outra somente a coluna target. Após 
    essa separação, é feita uma separação de dados aleatória, pegando 70% dos dados para treino e o restante deixando para teste.

	3 - Ocorre as predições em si, utilizando-se dos classificadores "KNeighborsClassifier", "DecisionTreeClassifier" e "RandomForestClassifier".

    4 - É realizado a avaliação de desempenho de acertos gerais (acurácia), relatório de clasificação (precision, recall, f1-score) e a matriz 
    de confusão, todas essas métricas foram realizadas para cada um dos modelos utilizados.

Análise:
        
	    Todos os modelos obtiveram uma nota relativamente alta, aqui estão as notas (acurácia, precision, recall, f1-score) de seus respectivos 
    modelos: 
        - KNeighborsClassifier: precision    recall  f1-score
                           0.0       0.89      0.89      0.89
                           1.0       0.75      0.71      0.73
                           2.0       0.53      0.57      0.55
                      accuracy                           0.74

        - DecisionTreeClassifier: precision    recall  f1-score
                             0.0       0.75      0.95      0.84
                             1.0       0.94      0.76      0.84
                             2.0       1.00      0.93      0.96
                         accuracy                          0.87
        
        - RandomForestClassifier: precision    recall  f1-score
                             0.0       0.90      1.00      0.95
                             1.0       1.00      0.90      0.95
                             2.0       1.00      1.00      1.00
                        accuracy                           0.96
    
        Como podemos ver, o modelo que mais se destacou em termos de "accuracy" foi o modelo RandomForestClassifier, com um desempenho próximo a 
    pontuação máxima, chegando em 96%. E para conseguirmos dizer qual métrica é mais relevante para avaliação do desempenho, seria uma combinação 
    entre elas analisando também a matriz de confusão para se ter algo mais visual, pois talvez o modelo tenha obtido uma pontuação alta analisando 
    a maior parte dos dados em apenas uma categoria (selecionada de maneira aleatória) e por esses motivos é bom a gente fazer múltiplas métricas 
    que ajudem a complementar a informação da precisão final (accuracy) de cada um dos modelos. Por outro lado, o pior desempenho entre esses 
    modelos foi o KNeighborsClassifier (KNN), por causa que ele fica mais sucetível a mudanças nos dados que não representam o conjunto como um 
    todo (ex: outliers).

Conclusão:

        O melhor desempenho foi o do modelo RandomForestClassifier, como citado anteriormente, pois esses modelos que visam fazer uma árvore de 
    decisão para realizar diversas condições na classificação dos dados são menos afetados por dados discrepantes, e ainda mais esse modelo em 
    espicífico que gera diversas "árvores" para a classificação e após isso faz a junção desses resultados para entregar o melhor desempenho 
    possível.
