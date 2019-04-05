
package floydwarshall;


public class Floydwarshall {

     static int INF=999;     
    static int[][] M = {    
                        {0  , INF, 9,  2, INF}, 
                        {2, 0  , INF,  INF, 3}, 
                        {INF, 2, 0  ,  2, 3}, 
                        {1, INF, INF,  0  , 4}, 
                        {INF, 2, INF,  INF, 0  }, 
                                
                       };
    
    static void floyd_warshall(int grafo[][]){
        int n = grafo.length;
        int temp=0;
        //craer matriz de distancia
        int distancias[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distancias[i][j]=j;
            }
        }
        //ejecutar el metodo floay-warshall
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    temp = grafo[j][i]+grafo[i][k];
                    if(temp<grafo[j][k]){
                        grafo[j][k]=temp;
                        distancias[j][k]=i;
                    }
                }
            }
        }
        
        System.out.println("La matriz de distancia");
        print(distancias);
        System.out.println(" .");
        print(grafo);
    }
    
    static void print(int m[][]){
        
        System.out.println("   ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        floyd_warshall(M);
    }
    
}
