public class tp {
    public static void modificaArreglo(int[] temperatura) {

        int i;

        for (i = 0; i < temperatura.length; i++)

            temperatura[i] = temperatura[i] * 2;

    }

    public static void main(String[] args) {
   
           // TODO code application logic here
   
           int i;
   
           int[] elementos = {1, 2, 4, 3};
   
           for (i = 0; i < elementos.length; i++) {
   
               System.out.print(elementos[i] + " ");
   
           }
   
           modificaArreglo(elementos);
   
           for (i = 0; i < elementos.length; i++) {
   
               System.out.print(elementos[i] + " ");
   
           }
}
