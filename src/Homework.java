import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class Homework {
    public int countEvens(int[] nums) {
        int r=0;
        for (int n : nums) {
            r=n%2==0?r+1:r;
        }
        return r;
    }

    public int sum13(int[] nums) {
        int r=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==13){
                i++;
                continue;
            }
            r=r+nums[i];
        }
        return r;
    }
    public boolean lucky13(int[] nums) {
        return Arrays.stream(nums).anyMatch(i -> i == 1 || i==3);
    }

    public int[] evenOdd(int[] nums) {
        int[] narr = new int[nums.length];
        int j=nums.length-1;
        int i=0;
        for (int n=0;n<nums.length;n++){
            if(nums[n]%2==0){
                narr[i]=nums[n];
                i++;
            }else{
                narr[j]=nums[n];
                j--;
            }
        }
        return narr;
    }

    public int[] zeroFront(int[] nums) {
        int[] narr = new int[nums.length];
        int j= nums.length-1;
        for (int i=0;i<nums.length;)
            if ( nums[i]==0)
                i++;
            else{
                narr[j]=nums[i];
                j--;
                i++;
            }
            return narr;
    }
    public int[] squareUp(int n) {
        int[] tab = new int[n * n];
        if (tab.length==1)
            tab[0] = n;
        else{
            int max=n;
            for(int j=tab.length-1;j>0;) {
                for (int i = 1; i <= n; i++) {
                    if(i <= max)
                        tab[j]=i;
                    j--;
                }
                max--;
            }
        }
        return tab;
    }

    public int[] fix45(int[] nums) {
        if (nums.length==0)
            return  nums;
        Deque<Integer> queue = new ArrayDeque<>();
        if(nums[0]==5){
            queue.addLast(0);
        }
        for (int i=1;i<nums.length;i++){

           if(nums[i]==5 && nums[i-1]!=4){
               queue.addLast(i);
            }
        }
        for (int i=0;i<nums.length-1;i++) {
            if (nums[i] == 4 && nums[i+1]!=5) {
                int temp = nums[i + 1] ;
                nums[i+1] = 5;
                nums[queue.removeFirst()] = temp;
            }
        }
        return nums;
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public  int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i=0; i < (nums.length-1); i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

}
