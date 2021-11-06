package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = new int[100000];

        for(int i = 0; i< myArray.length; i++){
            myArray[i] = (int) (Math.random()*(200+1))-100;
        }
        sortBubble(myArray);
        sortSelect(myArray);
        sortInsert(myArray);

      /*  for(int i = 0; i< myArray.length; i++){
           System.out.println(myArray[i]);
        }*/

    }



    public static void sortBubble(int[] myArray){
        long m = System.currentTimeMillis();

        int out, in;
        for (out = myArray.length - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if (myArray[in] > myArray[in + 1]) {
                    int tmp = myArray[in];
                    myArray[in] = myArray[in+1];
                    myArray[in+1] = tmp;
                }
            }
        }
        System.out.println((double) (System.currentTimeMillis() - m));
    }
    public static void sortSelect(int[] myArray){
        long m = System.currentTimeMillis();
        int out, in, mark;
        for(out=0;out<myArray.length;out++){
            mark = out;
            for(in = out+1;in<myArray.length;in++){
                if (myArray[in]< myArray[mark]){
                    mark = in;
                }
            }
            int tmp = myArray[out];
            myArray[out] = myArray[mark];
            myArray[mark] = tmp;
        }
        System.out.println((double) (System.currentTimeMillis() - m));
    }

    public static void sortInsert(int[] myArray){
        long m = System.currentTimeMillis();
        int in, out;
        for(out = 1;out < myArray.length; out++){
            int temp = myArray[out];
            in = out;
            while(in > 0 && myArray[in-1] >=temp){
                myArray[in] = myArray[in-1];
                --in;
            }
            myArray[in] = temp;
        }
        System.out.println((double) (System.currentTimeMillis() - m));
    }




}
