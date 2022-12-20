package LeetCode.LeetCode75.Day7;

public abstract class FirstBadVersion {

    abstract boolean isBadVersion(int version);
    
    public int firstBadVersion(int n) {
            int res=-1;
            int left = 0;
            int right = n-1;
            
            while(left<=right){
                int mid = left+(right-left)/2;

                if( isBadVersion(mid+1) ){
                    res = mid+1;
                    right = mid-1;
                }
                else
                    left = mid+1;
            }
            return res;
        }
}
