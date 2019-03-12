package LOOP;
class LearnForLoop2 {
    public static void main(String[] args) {
        int c, m;
        m=7;
        c=1;//initialization 1
        while(c<=3){ // condition 2
            System.out.println(m); // work 3
            m+=7;
            ++c; // counter change 4
        }
        
       //m=7;
        // init1     ;  cond2   ; counter change
        for(m=7,c=1  ;  c<=3    ; m+=7,++c){ // condition 2
            System.out.println(m); // work 3
            //m+=7;
        }
    }
}