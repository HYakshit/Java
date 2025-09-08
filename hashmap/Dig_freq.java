package hashmap;

import java.util.HashMap;
class Dig_freq{
    public static void main(String[] args) {
        int[] a= {132,1,333,543,666,765};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int element: a){
            while (element!=0){
                int digit=element%10;
                if(map.containsKey(digit)){
                    map.put(digit,map.get(digit)+1);
                }
                else{
                    map.put(digit,1);
                }
                element/=10;
            }
            System.out.println(map);
            map.clear();
        }

    }
}