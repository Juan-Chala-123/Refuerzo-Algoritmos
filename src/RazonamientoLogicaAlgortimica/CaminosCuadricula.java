/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RazonamientoLogicaAlgortimica;

/**
 *
 * @author CHALA RAMIREZ
 */
public class CaminosCuadricula {
    public static int caminosRec(int i, int j, int N, int M) {
        if (i == N - 1 || j == M - 1)
            return 1;

        return caminosRec(i + 1, j, N, M) + caminosRec(i, j + 1, N, M);
    }

    public static void main(String[] args) {
        int N = 3;
        int M = 4;
        System.out.println("Número de caminos: " + caminosRec(0, 0, N, M));
    }
}
