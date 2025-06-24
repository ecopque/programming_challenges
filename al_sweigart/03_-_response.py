import random

# Função que define qtde de T e H:
def gera_lancamentos(quantidade): #: 100x
    lista = [] #: H = cara, T = coroa.
    for _ in range(quantidade):
        if random.randint(0, 1) == 0:
            lista.append('T')
        else:
            lista.append('H')
    return lista #: Sequência aleatório de 100 elementos.

# Função que verifica sequência de elementos iguais consecutivos:
def tem_streak(lista, tamanho_streak=6):
    cont = 1

    for i in range(1, len(lista)):
        if lista[i] == lista[i - 1]: # Se for igual ao anterior. ;-)
            cont += 1
            if cont == tamanho_streak:
                return True
        else:
            cont = 1 # Reinicia o contador.
    return False

total_experimentos = 10000
com_streak = 0 # Contador de quantas streaks conseguimos.

# Laço total de experimentos:
for _ in range(total_experimentos):
    lancamentos = gera_lancamentos(100) # Nova lista com 100 lançamentos.
    if tem_streak(lancamentos): # 6 ou mais.
        com_streak += 1

porcentagem = ((com_streak / total_experimentos) * 100)

print(f'Lista com streak de 6 ou mais: {com_streak} de {total_experimentos}')
print(f'Porcentagem: {porcentagem:.2f}%')
