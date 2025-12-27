class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int lt_mx = 0;
        int rt_mx = 0;
        int ans = 0;

        while(left <= right){
            if(lt_mx <= rt_mx){
                lt_mx = Math.max(lt_mx, height[left]);
                ans += lt_mx - height[left];
                left++;
        }
        else{
            rt_mx = Math.max(rt_mx, height[right]);
            ans += rt_mx - height[right];
            right--;
        }
    }
    return ans;
    }
}
