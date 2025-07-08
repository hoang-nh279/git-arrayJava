public class test {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
//        double[] myList ;
//        myList = new double[10];
//        System.out.println("Do dai cua mang la: " + myList.length);
//
//        //nhap vao
//
//        myList[0] = 69; // ep kieu ngam dinh (implicit type casting)
//        myList[5] = 96;
//        myList[9] = 100;
//        //in ra
//        for(int i = 0 ; i < myList.length ; i++){
//            System.out.println(myList[i]);
//        }
//       int[] number = {1,2,3};
//        System.out.println(number.length);
//        System.out.println(number[1]);
//         for (elementType elementReVaf : collection)
//        for(int num :  number){
//            System.out.println("Number " + num);
//        }

//        int larger = max(3,4);
    }

    //    public static int max(int a, int b){
//        return a > b ? a : b ;
//    }
    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

}
