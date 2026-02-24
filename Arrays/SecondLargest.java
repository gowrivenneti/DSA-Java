class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int secondL=-1;
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondL=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondL){
                secondL=arr[i];
            }
        }
        return secondL;
    }
}
