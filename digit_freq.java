class  Radius{
    double pi=3.14;
    private int limit=0;
    void setlimit(int a){
        limit=a;
    }
    void radius(int r){
        int  area=(int)Math.round(pi*r*r);
        if(!(area>limit)){
            System.out.println(area);
        }
    }
}
class digit_freq {
    public static void main(String[] args) {
        Radius r= new Radius();
        r.setlimit(100);
        r.radius(5);
    }
}
