public class RecapDemo15 {
    public static void main(String[] args){
        double[] myList ={1.2,2.9,1.4};
        double total =0;
        double max =myList[0];
        for (double nums:myList){
            if(max<nums){
                max=nums;
            }
            total+=nums;
            System.out.println(nums);
        }
        System.out.println("total = "+total);
        System.out.println("largest number :"+ max);
    }
}
