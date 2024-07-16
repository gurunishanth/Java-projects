public class twodarray {
    public static void main(String[] args) {
        
        int [] a= new int[3];
        int [] b= new int[3];
        int [] c= new int[3];

        int num = 4;

        for(int i=0; i<3;i++){
            a[i]= i;
        }
        for(int i=0; i<3;i++){
          b[i]= num;
          ++num;
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i] +"  ");
            
        }
        System.out.println(":  Values of array in 'A'  ");

        for (int i=0; i<3; i++){
            System.out.print(b[i] +"  ");
        }
        System.out.println(":  values of array in 'B' ");

 
        for (int i = 0; i < 3; i++) {
            c[i] = a[i] + b[i];
            
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(c[i] +"  ");
        }
        System.out.println(":  Addition of A and B  ");


    }
}
