package com.pragra.day8;

public class CodingBatArrays1 {
    int[] nums = new int[5];

    public static void main(String[] args) {

        //System.out.println(new CodingBatArrays1().firstLast6([6,3,4,7,8]));
        //CodingBatArrays1 arr = new CodingBatArrays1();
        //arr.sameFirstLast([1, 2, 3, 4]);

        //System.out.println(rotateLeft3(new int[]{1,2,3}));
        // System.out.println((sum2(new int[]{1,1})));
        //System.out.println(rotatewords(new String[]{"rajender","brar","singh"}.));
    }

    public boolean firstLast6(int[] nums) {
        if ((nums[0] == 6) || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sameFirstLast(int nums[]) {
        if ((nums.length >= 1) && (nums[0] == nums[nums.length - 1])) {
            return true;
        } else {
            return false;
        }
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (((a.length >= 1) && (b.length >= 1)) && ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]))) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};

    }

    public static String[] rotatewords(String[] str) {
        String temp = str[0];
        str[0] = str[1];
        str[1] = str[2];
        str[2] = temp;
        return str;

        //return new String[]{str[1],str[0]};

    }

    public static int sum2(int[] nums) {
        int sum = 0;
        if (nums.length >= 2) {
            sum = nums[0] + nums[1];
            return sum;
        } else if (nums.length == 1) {
            sum = nums[0];
            return sum;
        } else {
            return 0;
        }
    }

    public static boolean double23(int[] nums) {
        if ((nums.length == 3) && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 2 && nums[2] == 2) || (nums[1] == 2 && nums[2] == 2))) {
            return true;
        } else if ((nums.length == 2) && (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean double231(int[] nums) {

        if (nums.length != 1 && nums.length != 0)

            return ((nums[0] == 2 && nums[1] == 2)

                    || (nums[0] == 3 && nums[1] == 3));

        else

            return false;


    }

    public static int[] fix23(int[] nums) {


        if (nums[0] == 2 && nums[1] == 3)

            nums[1] = 0;

        if (nums[1] == 2 && nums[2] == 3)

            nums[2] = 0;

        return new int[]{nums[0], nums[1], nums[2]};

    }

    public int start1(int[] a, int[] b) {
        if ((a.length == 0) && (b.length == 0)) {
            return 0;
        } else if (((a.length == 0) && (b[0] == 1)) || ((b.length == 0) && (a[0] == 1))) {
            return 1;
        } else if ((a.length > 0 && b.length > 0) && ((a[0] == 1) && (b[0] == 1))) {
            return 2;
        } else if ((a.length > 0 && b.length > 0) && ((a[0] == 1) || (b[0] == 1))) {
            return 1;
        } else {
            return 0;
        }
    }



    public int[] midThree(int[] nums) {

        return new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2], nums[(nums.length / 2) + 1]};
    }

    public int maxTriple(int[] nums) {
int x=nums[(nums.length-1)/2];
int y=nums[nums.length-1];
        if((nums[0]>nums[nums.length-1])&&(nums[0]>nums[(nums.length-1)/2])){
            return nums[0];
        }
        else if((x>y)&&(x>nums[0])){
            return nums[(nums.length-1)/2];
        }
      else{
            return nums[nums.length-1] ;
        }

    }


}




