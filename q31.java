import java.util.Arrays;

class q31 {
    public void nextPermutation(int[] arr) {
        
        int i=1,last=-1,n=arr.length,temp,x,t;
        if(n==1)
            return ;
        
        //S-1) Find Peak
        while(i<n){
            if(arr[i]>arr[i-1]){
                last=i;
            }
            i+=1;
        }

        //Peak=Last

        //S-2) If last=-1 , no peak just reverse/Assending sort

        if(last==-1){
            i=0;
            x=n-1;
            while(i<x){
                t=arr[i];
                arr[i]=arr[x];
                arr[x]=t;
                x--;i++;
            }
            return;
        }

        //S-3) Check if peak is valid

        //int min=arr[last];
        t=last;
        for(i=last;i<n;i++){
            if(arr[i]>arr[last-1] && arr[i]<arr[t])
                t=i;
        }
        //last=t;

        //S-4) Swap peak with next smallest and swap remainder

        System.out.println(t+","+(last-1));
        temp=arr[t];
        arr[t]=arr[last-1];
        arr[last-1]=temp;

        Arrays.sort(arr,last,n);
    }

}
/*
Q31 Next Permutation

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
*/
/*
Runtime
Details
10ms
Beats 5.14%of users with Java

Memory
Details
42.16MB
Beats 42.95%of users with Java
 */