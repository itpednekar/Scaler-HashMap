public class Solution {
    public int solve(ArrayList<Integer> A) {
        int totalEven = 0;
        int totalOdd = 0;
        
        for(int i=0; i<A.size(); i++){
            if(i % 2 == 0)
                totalEven = totalEven + A.get(i);
            else
                totalOdd = totalOdd + A.get(i);
        }
        int EB = 0;
        int OB = 0;
        int EA = 0;
        int OA = 0;
        int cnt = 0;
       
        for(int i=0; i<A.size();i++){
                EA = totalEven - EB;
                OA = totalOdd - OB;
                if(i % 2 == 0)
                    EA = EA - A.get(i);
                else
                    OA = OA - A.get(i);
                
                if(EB + OA == OB + EA)
                   cnt++;
                   
                if(i % 2 == 0)
                    EB = EB + A.get(i);
                else
                    OB = OB + A.get(i); 
                
        }
        return cnt;
    }
}
