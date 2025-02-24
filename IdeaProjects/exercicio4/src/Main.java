public class Main {
    public static void main(String[] args) {

        int tabuada = 1;

        for(int i = 0; i < 11; i = i + 1 ) {
            for(int j = 0; j < 11; j = j + 1 ) {
                tabuada = i * j;
                System.out.println( tabuada);
            }
        }




    }
}