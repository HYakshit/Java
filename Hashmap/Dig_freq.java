package Hashmap;

import java.util.HashMap;
class Dig_freq{
    public static void main(String[] args) {
        int[] a= {132,1,333,543,666,765};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i: a){
            while (i!=0){
                int digit=i%10;
                if(map.containsKey(digit)){
                    map.put(digit,map.get(digit)+1);
                }
                else{
                    map.put(digit,1);
                }
                i/=10;
            }
            System.out.println(map);
            map.clear();
        }

    }
}