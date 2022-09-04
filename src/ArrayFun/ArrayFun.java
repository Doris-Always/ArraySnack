package ArrayFun;

public class ArrayFun {
    //a program that returns the largest element in a list
    public int maxArray(int [] myArray){
        int maxNumber = 0;
        for (int i = 0; i < myArray.length;i++){
            if (myArray[i] > maxNumber){
                maxNumber = myArray[i];
            }
        }
        return maxNumber;
    }


    public int minArray(int [] myArray){
        int minNumber = 0;
        for (int i = 0;i < myArray.length;i++){
            if (myArray[i] < minNumber){
                minNumber = myArray[i];
            }
        }
        return minNumber;
    }

//    public int[] reverseArr(int[] myArray) {
//
//
//    }
}
