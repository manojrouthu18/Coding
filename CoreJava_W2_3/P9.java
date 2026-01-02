



class P9{
    public static void main(String[] args) {
        System.out.println(findLargest(12,3,1,14,54,3,5,64,211,76523));
     
    }


    public static int findLargest(int... arr) {
         int max = Integer.MIN_VALUE;
        for(int i:arr)
            max = Math.max(max,i);
        return max;
    }
}
