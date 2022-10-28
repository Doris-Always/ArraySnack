package ArrayFun;

import java.util.ArrayList;
import java.util.List;

public class ArrayFun {
    public static void main(String[] args) {
        ArrayFun arrayFun = new ArrayFun();

//        int [] arr = {3,2,8,0,1};
//        System.out.println(Arrays.toString(arrayFun.reverseArr(arr)));
        int [] myArr = {3,2,8,4,1,5,9,12,6};
//        System.out.println( arrayFun.searchElement(myArr,8));
//        arrayFun.printArrayAtOddPosition(myArr);
//        arrayFun.printArrayAtEvenPosition(myArr);

        arrayFun.printArrayAtOddPosition(myArr);


    }



    //a program that returns the largest element in a list
    public int maxArray(int [] myArray){
        int maxNumber = myArray[0];
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

    public int[] reverseArr(int[] myArray) {
        int temp = 0;
        for (int i = 0;i <(myArray.length/2);i++){
            temp = myArray[i];
            myArray[i] = myArray[myArray.length-1 -i];
            myArray[myArray.length-1 -i] = temp;

        }

        return myArray;
    }

    public boolean searchElement(int[] myArray,int findElement) {
        boolean isContained = false;
        for (int element: myArray){
            if (element == findElement){
                isContained = true;
                System.out.println("it is present");
                break;
            }
        }
        return isContained;
    }

    public List<Integer> printArrayAtOddPosition(int[] myArray) {
//        System.out.println("Array at odd position");
        List<Integer> newArray = new ArrayList();
        for (int i = 0;i <myArray.length ;i++){
            if(i%2 == 0) {
                   newArray.add(myArray[i]);
               }
        }
//        for (Object num: newArray
//             ) {
//            System.out.print(num + " ");
//        }
        return newArray;

    }
   public void printArrayAtEvenPosition(int[] myArray){
       System.out.println("my array at even position is ");
      for (int i = 1;i <myArray.length ;i = i+2){
              System.out.println(myArray[i]);
       }
     }

    public int runningSum(int[] myArray) {
        int sum = 0;
        for (int j : myArray) {
            sum += j;
        }
        return sum;
    }

    public List<Integer> alternateElements(int[] myArray1, int[] myArray2) {
        List<Integer> alternateArray = new ArrayList<>();
        for (int i = 0; i< myArray1.length; i++) {
            alternateArray.add(2*i, myArray1[i]);
            alternateArray.add((2*i)+1, myArray2[i]);
        }
        return alternateArray;
    }


}