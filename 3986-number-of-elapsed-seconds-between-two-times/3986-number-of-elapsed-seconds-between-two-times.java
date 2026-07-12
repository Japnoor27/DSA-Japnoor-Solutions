class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] arr=startTime.split(":");
        String[] arr1=endTime.split(":");
        int sum=0; 
    for(int i=0;i<3;i++){
    arr1[i]=String.valueOf(Integer.parseInt(arr1[i])-Integer.parseInt(arr[i]));
    }
     
        sum=sum+Integer.parseInt(arr1[0])*60*60+Integer.parseInt(arr1[1])*60+Integer.parseInt(arr1[2]);
        return sum;
    
    }
}