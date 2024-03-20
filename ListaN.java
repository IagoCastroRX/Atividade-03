class Lista {
    int valor;
    Lista proximo;

    Lista(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class RemoverPrimeirosN {
    public Lista removerPrimeirosN(Lista cabeca, int n) {
        if (cabeca == null || n <= 0) {
            return null;
        }

        Lista dummy = new Lista(0);
        dummy.proximo = cabeca;
        Lista anterior = dummy;
        for (int i = 0; i < n; i++) {
            if (cabeca == null) {
                break;
            }
            cabeca = cabeca.proximo;
        }
        anterior.proximo = cabeca;

        return dummy.proximo;
    }

    public void imprimirLista(Lista cabeca) {
        Lista atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoverPrimeirosN solucao = new RemoverPrimeirosN();

        Lista cabeca = new Lista(1);
        cabeca.proximo = new Lista(2);
        cabeca.proximo.proximo = new Lista(3);
        cabeca.proximo.proximo.proximo = new Lista(4);
        cabeca.proximo.proximo.proximo.proximo = new Lista(5);

        System.out.println("Lista original:");
        solucao.imprimirLista(cabeca);

        int n = 2;
        cabeca = solucao.removerPrimeirosN(cabeca, n); // Atualizando a cabeça da lista
        System.out.println("Lista após remover os " + n + " primeiros nós:");
        solucao.imprimirLista(cabeca);
    }
}