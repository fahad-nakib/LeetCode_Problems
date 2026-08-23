class KOKO {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles = piles[0];
        for(int i=0; i<piles.length; i++){
            if(piles[i] > maxPiles){
                maxPiles = piles[i];
            }
        }

        int low = 1, high = maxPiles;
        while(low<=high){
            int mid = (low+high)/2;
            long hrs = numOfHrs(piles,mid);
            if(hrs <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    public long numOfHrs(int[] piles, int rate){
        long hrs = 0;
        System.out.println("rate : "+ rate);
        for(int i=0; i<piles.length; i++){
            if(piles[i]< rate){
                hrs++;
            }else{
                hrs += (piles[i]+rate-1)/rate;
            }

        }
        return hrs;
    }
}

public class KokoEatBanana_875 {

    static void main() {
        KOKO koko = new KOKO();
        int[] piles = {1,4,3,2};
        int h=9;
        int ans = koko.minEatingSpeed(piles, h);
        System.out.println("Answer : "+ ans);

    }
}
