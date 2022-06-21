public class Numeros0a99 {
    public static void main(String[] args) {
        int num = -1;
        for(int i = 0; i<=98; i++){
            num += 1;
            System.out.print(num + ", ");
            if(i == 98){
                System.out.println("99");
            }
        }
    }

}
