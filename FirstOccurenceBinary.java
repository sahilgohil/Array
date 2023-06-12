/*
finding the first occurence of the element using binary search
*/    
public static void firstOccurenceBinary(int[] arr, int key) {

        int firstOccurence = -1;

        int si = 0;
        int ei = arr.length-1;
        while(si<=ei)
        {
            int mid = si +(ei-si)/2;
            if(arr[mid] == key)
            {
                firstOccurence = mid;
                ei = mid-1;
            }
            else if(arr[mid] < key)
            {
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }

        if(firstOccurence == -1)
        {
            System.out.println("No Element Found");
        }
        else{
            System.out.println("First Occurence is "+firstOccurence);
        }
        
    }
