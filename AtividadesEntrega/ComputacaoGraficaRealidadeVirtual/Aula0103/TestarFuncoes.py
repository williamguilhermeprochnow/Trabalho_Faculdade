import unittest
from Funcoes import queda_livre, projetil, particulas, pendulo, movimento_circular


class Tests(unittest.TestCase):
    def teste_queda_livre(self):
        val = queda_livre(0, 2845.23, 0.1, 60.17, 14.23, 9.8, 0.1, 2845.23)

        self.assertEqual(val[-1],
                         {'Tempo (s)': 3.700000000000002, 'Velocidade (m/s)': 41.43822909339149},
                         f"Teste falhou valor {val[-1]} não é o esperado")

    def teste_projetil(self):
        val = projetil(0.1, 99.61946980917456, 8.715574274765817, 0.1, 9.8)

        self.assertEqual(val[-1],
                         {
                             'Distância (m)': 169.35309867559678,
                             'Altura (m)': 0.6554762671018839,
                             'Tempo (s)': 1.7000000000000004
                         },
                         f"Teste falhou valor {val[-1]} não é o esperado")

    def teste_particulas(self):
        val = particulas(15, 20, 10, 7, 15, 10)

        self.assertEqual(val,
                         [{'Particula1 Antes da Colisão':
                               {'Velocidade Horizontal': 20.0, 'Velocidade Vertical': 7.0},
                           'Particula2 Antes da Colisão': {'Velocidade Horizontal': 15.0, 'Velocidade Vertical': 10.0}},
                          {'Particula1 Pós da Colisão':
                               {'Velocidade Horizontal': 19.986666666666668, 'Velocidade Vertical': 7.008},
                           'Particula2 Pós da Colisão': {'Velocidade Horizontal': 15.02, 'Velocidade Vertical': 9.988}}]
                         ,
                         f"Teste falhou valor {val} não é o esperado")

    def teste_pendulo(self):
        val = pendulo(0, 10, 1, 10, 9.8, 2, 1)

        self.assertEqual(val[-1], {'Tempo': 9, 'Ângulo': 12699.811488894225},
                         f"Teste falhou valor {val} não é o esperado")

    def teste_movimento_circular(self):
        val = movimento_circular(5, 7)

        self.assertEqual(val, [{'Velocidade Tângencial': 35.0, 'Aceleração Centripeta': 245.0}],
                         f"Teste falhou valor {val} não é o esperado")