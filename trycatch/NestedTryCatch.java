public class NestedTryCatch {
    public static void main(String[] args) {
        try{//block 1
            try{//block2
                try{//block3
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]);

                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBounds Exception in block 3");
                    throw e;
                }

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBounds Exception in block 2");
                throw e;
            }
        }catch (ArrayIndexOutOfBoundsException e4){
            System.out.println("ArrayIndexOutOfBounds Exception in block 1                                           ");
          
        }catch(Exception e5){
            System.out.println("general exception");
        }
    }
}