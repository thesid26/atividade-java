public class atv {

    
    public static boolean contem(int[] v, int tam, int elemento) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    
     
     
    private static void inverter(int[] v, int inicio, int fim) {
        while (inicio < fim) {
            int temp = v[inicio];
            v[inicio] = v[fim];
            v[fim] = temp;
            inicio++;
            fim--;
        }
    }

    // --- IMPLEMENTAÇÃO DAS QUESTÕES ---

    // 
    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = gerarVetorSemRepeticao(a, tamA, u);

        for (int i = 0; i < tamB; i++) {
            if (!contem(u, tamU, b[i])) {
                u[tamU] = b[i];
                tamU++;
            }
        }

        return tamU;
    }

    
    public static void ordenar(int[] v, int n) {
        for (int i = 1; i < n; i++) {
            int chave = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }

    
    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int tamVSR = 0;

        for (int i = 0; i < tamV; i++) {
            if (!contem(vsr, tamVSR, v[i])) {
                vsr[tamVSR] = v[i];
                tamVSR++;
            }
        }

        return tamVSR;
    }

    
    public static void rotacionar(int[] v, int tam, int k) {
        if (tam <= 1) return;

        k = k % tam;
        if (k < 0) {
            k = k + tam;
        }

        if (k == 0) return;

        inverter(v, 0, k - 1);
        inverter(v, k, tam - 1);
        inverter(v, 0, tam - 1);
    }
}