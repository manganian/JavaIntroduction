package pl.chojnacki;


public class Task1
{
    public static void writeTheNumbersUp() {
        for (int i=0; i <=30; i++) {
        System.out.println(i);}
    }

        public static void writeTheNumbersDown(){
        for (int j=30; j >=0; j--) {
            System.out.println(j); }}


    public static void main( String[] args )
    {
        writeTheNumbersUp();
        System.out.println("---");
        writeTheNumbersDown();
    }
}
