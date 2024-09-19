import java.util.*;
public class _1979A{
    public static boolean allElementsSame(int arr[]){
        int first=arr[0];
        for(int element:arr){
            if(element!=first){
                return false;
            }
        }
        if(first==1){
            return true;
        }
        return false;
        
    }
    public static List<Integer> maxElementsOfSubarrays(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length < 2) {
            return result;
        }

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove elements not within the sliding window
            while (!deque.isEmpty() && deque.peek() < i - 1) {
                deque.poll();
            }

            // Remove elements smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element at the end of the deque
            deque.offer(i);

            // Start adding results to the list once we have at least 2 elements in the window
            if (i >= 1) {
                result.add(nums[deque.peek()]);
            }
        }

        return result;
    }
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0) {
                int n=in.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=in.nextInt();
                }
                if(allElementsSame(arr)){
                    System.out.println(0);
                }
                else{
                    List<Integer> maxElement= maxElementsOfSubarrays(arr);
                    int min=Integer.MAX_VALUE;
                    for(int element:maxElement){
                        min=Math.min(min,element);
                    }
                    System.out.println(min-1);
                }
            }
        }
    }


   

    

