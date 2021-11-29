public class Exercise5 {

    public static int arrayUpDown(int [] arr) {
        int value = arr[0], index=0;
        boolean up=true;
        for (int i=0; i<arr.length && up; i++) {
            if (arr[i] >= value) {
                value = arr[i];
                index = i;
            }
            else {
                up = false;
            }
        }
        boolean down = true;
        for (int i=index+1; i<arr.length; i++) {
            if (arr[i] <= value) {
                value = arr[i];
            }
            else {
                down = false;
            }
        }

        if (down)
            return index;
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,9,6,4,1,-5};
        System.out.println(arrayUpDown(arr));
    }
}
