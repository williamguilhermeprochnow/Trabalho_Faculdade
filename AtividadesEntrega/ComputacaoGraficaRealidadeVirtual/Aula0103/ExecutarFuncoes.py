from Funcoes import queda_livre, projetil, particulas, movimento_circular, pendulo

import math

g = 9.8  # Força da gravidade

################################################# Descomentar Bloco que Rodar ##########################################
################################################# Queda Livre #########################################################1
h = float(input("Qual a altura inicial do objeto: "))  # Altura inicial - Metros
t = float(input("Qual o tempo de atualização que deseja: "))  # Tempo atualização - Segundos
m = float(input("Qual a massa (kg) do objeto: "))  # Massa em kg
k = float(input("Qual seria o arrasto do ar no objeto: "))  # Arrasto em kg/s

v = 0  # Velocidade inicial
h0 = h  # Altura inicial
t0 = t  # Tempo inicial

valores = queda_livre(v, h, t, m, k, g, t0, h0)


########################################################################################################################
################################################# Projetil ############################################################2
# a = math.radians(float(input("Qual o ângulo de lançamento: ")))
# v0 = float(input("Qual a velocidade inicial do objeto: "))
# t = float(input("Qual o tempo de atualização que deseja: "))
#
# vh = v0 * math.cos(a)  # Velocidade Horizontal
# vv = v0 * math.sin(a)  # Velocidade Vertical
# t0 = t  # Tempo inicial
#
# valores = projetil(t, vh, vv, t0, g)

########################################################################################################################
################################################# Particulas ##########################################################3
# m1 = float(input("Qual a massa do primeiro objeto: "))
# m2 = float(input("Qual a massa do segundo objeto: "))
# vh1 = float(input("Qual a velocidade horizontal do primeiro objeto: "))
# vv1 = float(input("Qual a velocidade vertical do primeiro objeto: "))
# vh2 = float(input("Qual a velocidade horizontal do segundo objeto: "))
# vv2 = float(input("Qual a velocidade vertical do segundo objeto: "))
#
#
# valores = particulas(vh2, vh1, vv2, vv1, m1, m2)


########################################################################################################################
################################################# Pendulo #############################################################4
# a = math.radians(float(input("Qual o ângulo inicial do pendulo (º): ")))  # Ângulo radiano
# cp = float(input("Qual o comprimento do pendulo (m): "))  # Comprimento
# t = float(input("Qual o tempo de atualização que deseja (s): "))  # Tempo atualização - Segundos
# tt = float(input("Qual o tempo de simulação (s): "))  # Tempo simulação - Segundos
#
# t0 = t
# va = 0
#
# valores = pendulo(va, a, t, tt, g, cp, t0)

########################################################################################################################
################################################# MCU #################################################################5
# raio = float(input("Qual o raio da trajetória circular (m): "))
# va = float(input("Qual a velocidade angular (rad/s): "))
#
#
# valores = movimento_circular(raio, va)

########################################################################################################################
################################################# Print ################################################################
print(valores)
