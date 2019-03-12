package LOOP;
class LearnForLoop {
    public static void main(String[] args) {
        int c;
        c=1;//initialization 1
        while(c<=3){ // condition 2
            System.out.println(c); // work 3
            ++c; // counter change 4
        }
        
        // init ; cond ; counter change
        for(c=1 ; c<=3 ; ++c){ // condition 2
            System.out.println(c); // work 3
        }
    }
}