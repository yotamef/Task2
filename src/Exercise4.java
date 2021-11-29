public class Exercise4 {

    public static int countDups(int [] arr) {
        int countDups = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    countDups++;
                    break;
                }
            }
        }
        return countDups;
    }

   public static int[] withoutDuplicates(int [] arr) {
       int [] arrWithoutDups = new int[arr.length-countDups(arr)];
       int k=0;
       for (int i = 0; i<arr.length; i++) {
           boolean isDuplicate = false;
           for (int j = i+1; j<arr.length; j++) {
               if (arr[i] == arr[j])
                   isDuplicate = true;
           }
           if (!isDuplicate) {
               arrWithoutDups[k] = arr[i];
               k++;
           }
       }
       return arrWithoutDups;
   }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,8,9,0,0,0,9,4};
        int [] arr2 = withoutDuplicates(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }

    }
}
