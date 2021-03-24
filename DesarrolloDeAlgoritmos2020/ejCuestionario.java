

public class ejCuestionario {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        queHace(3);
    }

    public static char letra(int nro) {
        char let;
        switch (nro) {
            case 0:
                let = 'A';
                break;
            case 1:
                let = 'B';
                break;
            case 2:
                let = 'C';
                break;
            case 3:
                let = 'D';
                break;
            default:
                let = 'E';
                break;
        }
        return let;
    }

    public static void queHace (int nro) {
        if( nro == 0){
            System.out.println(letra(nro));
        }else {
            System.out.println(letra(nro));
            nro--;
            queHace(nro);
            System.out.println(letra(nro));
        }
    }
}
