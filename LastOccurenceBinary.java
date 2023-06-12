// finding the last occurence of the element using the binary search
public static void lastOccurenceBinary(int[] arr, int key) {
        {
            int lastOccurence = -1;

            int si = 0;
            int ei = arr.length-1;

            while(si<=ei)
            {
                int mid = si + (ei-si)/2;
                if(arr[mid] == key)
                {
                    lastOccurence = mid;
                    si = mid+1;
                }
                else if(key > arr[mid])
                {
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
            
            if(lastOccurence == -1)
            {
                System.out.println("No Element Found");
            }
            else{
                System.out.println("Last Occurence is at index "+lastOccurence);
            }
        }
        
    }
