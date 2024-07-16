public class conditionalstms {
    public static void main(String[] args) {
        
       /*  boolean attendance = true;

        if(attendance = true){
            System.out.println("attend classes");
        }
        else{
            System.out.println("not attend classes");
        } */

        char attendance = 'o';

        if (attendance == 'p'){
            System.out.println("attend classes");
        }
        else if (attendance == 'o')
            {
             System.out.println("on duty");
        }
        else 
        {
            System.out.println("not attend classes");
        }
        System.out.println("class over");
    }
}
