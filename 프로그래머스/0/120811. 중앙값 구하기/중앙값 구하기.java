class Solution {
    public int solution(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        if (array.length % 2 == 0) {
            int midIndex1 = array.length / 2 - 1;
            int midIndex2 = array.length / 2;
            return (array[midIndex1] + array[midIndex2]) / 2;
        } else {
            int midIndex = array.length / 2;
            return array[midIndex];
        }
    }
}
