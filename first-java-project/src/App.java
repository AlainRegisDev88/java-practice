public class App{
    public static void main(String [] args) throws Exception {
        System.out.println("Hello World");
        int x = 5;
        int y = 7;

        int sum = x + y;
        System.out.println(sum);
        
        int total = 0;

        for(int i = 0; i <5 ; i++){
            total += 1;
        }
        System.out.println(total);

        // testing the stack storage of the primitive variables

        int a = 4;
        int b = a;
        b = 10;

        int [] arr1 = {1, 2, 3}; 
        int [] arr2 = arr1; 

        arr2 [0] = 100;

        System.out.println('\n');
        System.out.println(arr1[0]);

        System.out.println('\n');
        System.out.println(b);

    }
}