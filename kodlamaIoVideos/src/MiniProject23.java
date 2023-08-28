public class MiniProject23 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,6,5,7,8,9,0};
        int x =21;
        boolean isThere=false;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==x){
                isThere=true;
            }
        }
        if (isThere == true) {
            System.out.println(x + " dizinin icinde vardir");
        }
        else {
            System.out.println(x + " dizinin icinde yoktur");
        }

    }
}
