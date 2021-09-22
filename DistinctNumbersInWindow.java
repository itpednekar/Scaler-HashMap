public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        if(A.size() < B)
            return new ArrayList<>();
            
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<B; i++){
            if(hm.containsKey(A.get(i)))
               hm.put(A.get(i), hm.get(A.get(i))+1);
            else
               hm.put(A.get(i), 1);
        }
        ans.add(hm.size());
        for(int i=B; i<A.size(); i++){
            hm.put(A.get(i-B), hm.get(A.get(i-B))-1);
            if(hm.get(A.get(i-B)) == 0)
                hm.remove(A.get(i-B));
            
            if(hm.containsKey(A.get(i)))
                hm.put(A.get(i), hm.get(A.get(i))+1);
            else
                hm.put(A.get(i), 1);
                
            ans.add(hm.size());
        }
        
        return ans;
    }
}
