package trabajo;

public class Trabajo4 {

    public static void main(String[] args) {

        Trabajo4 Metodo = new Trabajo4();
        
        int [][]matriz={{50, 45,40, 35, 30}, {90,70, 50, 30, 10}, {120, 30, 20, 10, 15}};
        
        Metodo.Restar(matriz);
    }
    public  void Restar(int [][]matriz) {
        int Res[]=new int[matriz.length];

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
            if (j==0) {
                Res[i]=matriz[i][j];
                } else{
                    Res[i]=Res[i]-matriz[i][j];
                }
            }
        }
        for (int i=0; i<Res.length; i++) {
            System.out.println(+ (i + 1) + " = " + Res[i]);
        }
    }
    public static void Mostrar(int [][]matriz) {
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print( + matriz[i][j] );
            }
        }
    }   
}
