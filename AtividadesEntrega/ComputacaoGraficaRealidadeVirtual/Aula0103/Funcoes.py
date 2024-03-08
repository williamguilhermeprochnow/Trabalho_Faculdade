import math

valores = []  # Armezena os valores das funções recursivas
valores_particulas = []  # Armezena os valores da função das particulas
valores_pendulo = []  # Armezena os valores da função de pendulo
valores_movimento_circular = []  # Armezena os valores da função de movimento circular


# Calcula a velocidade e altura com base no periodo de tempo, massa e arrasto
def queda_livre(v, h, t, m, k, g, t0, h0):
    v = (v - (t / m) * k * v - g * t)
    h = h + t * v

    if (h >= 0) and (h < h0):
        valores.append({'Tempo (s)': t, 'Velocidade (m/s)': (v * (-1))})
        t += t0
        return queda_livre(v, h, t, m, k, g, t0, h0)
    else:
        return valores


def projetil(t, vh, vv, t0, g):
    d = vh * t
    h = vv * t - 0.5 * g * (t ** 2)

    if h >= 0:
        valores.append({'Distância (m)': d, 'Altura (m)': h, 'Tempo (s)': t})
        t += t0
        return projetil(t, vh, vv, t0, g)
    else:
        return valores


def particulas(vh2, vh1, vv2, vv1, m1, m2):
    diff_x = vh2 - vh1
    diff_y = vv2 - vv1

    escala = diff_x * diff_x + diff_y * diff_y
    colisao = escala / ((m1 + m2) * escala)

    colisao_x = diff_x * colisao
    colisao_y = diff_y * colisao

    valores_particulas.append({'Particula1 Antes da Colisão': {'Velocidade Horizontal': vh1, 'Velocidade Vertical': vv1},
                    'Particula2 Antes da Colisão': {'Velocidade Horizontal': vh2, 'Velocidade Vertical': vv2}})

    vh1 += colisao_x / m1
    vv1 += colisao_y / m1

    vh2 -= colisao_x / m2
    vv2 -= colisao_y / m2

    valores_particulas.append({'Particula1 Pós da Colisão': {'Velocidade Horizontal': vh1, 'Velocidade Vertical': vv1},
                    'Particula2 Pós da Colisão': {'Velocidade Horizontal': vh2, 'Velocidade Vertical': vv2}})

    return valores_particulas


def pendulo(va, a, t, tt, g, cp, t0):
    while t < tt:
        k1t = t * va
        k1o = t * (-g / cp * math.sin(a))

        k2t = t * (va + 0.5 * k1o)
        k2o = t * (-g / cp * math.sin(a + 0.5 * k1t))

        k3t = t * (va + 0.5 * k2o)
        k3o = t * (-g / cp * math.sin(a + 0.5 * k2t))

        k4t = t * (va + k3o)
        k4o = t * (-g / cp * math.sin(a + k3t))

        a += (k1t + 2 * k2t + 2 * k3t + k4t) / 6
        va += (k1o + 2 * k2o + 2 * k3o + k4o) / 6

        valores_pendulo.append({'Tempo': t, 'Ângulo': math.degrees(a)})
        t += t0

    return valores_pendulo


def movimento_circular(raio, va):
    vt = raio * va  # Velocidade Tângencial
    ac = (va ** 2) * raio  # Aceleração Centripeta

    valores_movimento_circular.append({'Velocidade Tângencial': vt, 'Aceleração Centripeta': ac})

    return valores_movimento_circular
