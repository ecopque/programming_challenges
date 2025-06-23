def nova_funcao(lista):
    if (len(lista) == 0):
        return 'Lista vazia.'
    
    resultado = ""

    if (len(lista)) == 1:
        return lista[0] + "."

    for i in range(len(lista) - 1):
        resultado += str(lista[i]) + ", "

    resultado += "e " + str(lista[-1]) + "."

    return resultado

minha_lista = ["Edson", 11, "Théo", "Mel"]
print(nova_funcao(minha_lista))
