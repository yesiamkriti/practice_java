public class jaggedArray {
    public static void main(String[] args){
        // declaring a 2D array with odd coulmns
        int arr[][] =new int [4][];
        arr[0]=new int[3];
        arr[1]= new int[5];
        arr[3] = new int[2];
        arr[2]= new int [1];
        // initializing a jagged array
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        // printing the data of jagged array

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
}
