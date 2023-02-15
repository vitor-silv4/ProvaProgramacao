package provaprogramacao;

import java.util.Random;

public class Embaralhador {

    public static void embaralhar(int v[]) {

        Random random = new Random();

        for (int i = 0; i < (v.length - 1); i++) {

            //sorteia um índice
            int j = random.nextInt(v.length);

            //troca o conteúdo dos índices i e j do vetor
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }

}
