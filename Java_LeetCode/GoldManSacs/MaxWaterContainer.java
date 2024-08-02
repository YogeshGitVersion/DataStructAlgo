package GoldManSacs;

/**
 * @author - yogesh
 */
public class MaxWaterContainer {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxWater = 0;

        while (l < r) {
            // Calculate the amount of water
            int curWater = Math.min(height[l], height[r]) * (r - l);
            maxWater = Math.max(maxWater, curWater);

            // Move the pointer that points to the shorter line
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxWater;
    }
}
