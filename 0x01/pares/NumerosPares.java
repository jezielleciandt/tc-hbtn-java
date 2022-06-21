public class NumerosPares {

    public static void main(String[] args) {
        int num = -2;
        for(int i = 0; i<=48; i++){
            num += 2;
            System.out.print(num + ", ");
            if(i == 48){
                num+= 2;
                System.out.printf("%d\n",num);
            }
        }
    }
}
