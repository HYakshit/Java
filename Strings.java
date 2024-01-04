public class Strings {
    public static void main(String[] args) {
        // reverse a  string
        System.out.println(reverse("akshit"));;
    }
    static String reverse(String str){
        StringBuilder localstring = new StringBuilder(str);
        for(int i=0;i<localstring.length()/2;i++){//loop is half coz we are swapping two elements at a time
            int start=i;
            int end=localstring.length()-1-i;
            // to store starting variiable
              char temp=localstring.charAt(start);
            localstring.setCharAt(start, localstring.charAt(end));
            localstring.setCharAt(end,temp);
        }
        return localstring.toString();
    }
}
