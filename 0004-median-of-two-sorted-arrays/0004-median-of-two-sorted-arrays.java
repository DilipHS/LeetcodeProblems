class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] num = new int[nums1.length + nums2.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            num[k++] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            num[k++] = nums2[j];
        }

        for (int x = 0; x < num.length; x++) {
            for (int y = x + 1; y < num.length; y++) {
                if (num[x] > num[y]) {
                    int temp = num[x];
                    num[x] = num[y];
                    num[y] = temp;
                }
            }
        }

        int n = num.length;
        if (n % 2 != 0) {
            return num[n / 2];
        } else {
            return (num[n / 2 - 1] + num[n / 2]) / 2.0;
        }
    }
}