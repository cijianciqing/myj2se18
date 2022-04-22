package cj_array;



public class CJArraySort {

    public static void main(String[] args) {
        int cjTemp;
        int cjArray[] = new int[]{9 ,8,7,3,2};
        int cjLength = cjArray.length;
        for(int i=0;i<cjLength;i++){
            for(int k=i; k<cjLength;k++){
                if(cjArray[k]<cjArray[i]){
                   cjTemp =  cjArray[i];
                   cjArray[i] = cjArray[k];
                   cjArray[k] = cjTemp;
                }
            }
        }

        for(int j=0;j<cjLength;j++){
            System.out.println(cjArray[j]);
        }
    }

}
