package LOOP;
class LearnNestedWhileLoop {
    public static void main(String[] args) {
        int line, word;
        line = 1;
        while(line <= 3) {
            System.out.print("Line "+line+": ");
            
            word = 1;
            while(word <= 4) {
                System.out.print("word"+word+" ");
                ++word;
            }
            
            System.out.println();
            ++line;
        }
    }
}