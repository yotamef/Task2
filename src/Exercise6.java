public class Exercise6 {
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

    public static int[] intersection(int[] arr1, int[] arr2) {
        int counter=0;
        int [] intersection;
        arr1 = withoutDuplicates(arr1);
        arr2 = withoutDuplicates(arr2);
        for (int i=0; i< arr1.length; i++) {
            for (int j=0; j< arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    counter ++;
                    break;
                }
            }
        }
        intersection = new int [counter];
        int k=0;
        for (int i=0; i< arr1.length; i++) {
            for (int j=0; j< arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection[k] = arr1[i];
                    k++;
                }
            }
        }
        return intersection;
    }

    public static boolean strange(int [] arr1, int[] arr2) {
        int [] intersection = intersection(arr1, arr2);
        if (intersection.length==0)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int [] arr1 = {2,4,6,7};
        int [] arr2 = {1,3,5,5};
        int [] arr3 = intersection(arr1,arr2);
        for (int i=0; i< arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
        System.out.println(strange(arr1,arr2));
    }
}
