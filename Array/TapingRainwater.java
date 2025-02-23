public class TapingRainwater{
    public static void main(String[] args) {
        int height [] = {4,2,0,6,3,2,5};
        int store = trap(height);
        System.out.println(store);
    }
    public static int trap(int[] height) {
        int store=0;
        int MaxLeft [] = new int[height.length];
        int MaxRight [] = new int[height.length];
        MaxLeft[0]=height[0];
        MaxRight[height.length-1]=height[height.length-1];

        for (int i = 1; i < height.length; i++) {
            MaxLeft[i] = Math.max(height[i], MaxLeft[i - 1]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            MaxRight[i] = Math.max(height[i], MaxRight[i + 1]);
        }

        for(int i=0;i<height.length;i++){
            int waterlevel =Math.min(MaxLeft[i], MaxRight[i]);
            store+=(waterlevel-height[i]);
        }
        return store;
    }
}
