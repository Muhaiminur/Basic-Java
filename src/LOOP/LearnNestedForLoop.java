package LOOP;
class LearnNestedForLoop {
    public static void main(String[] args) {
        int line, word;
        for(line = 1; line <= 3; ++line) {
            System.out.print("Line "+line+": ");
            
            for(word = 1; word <= 4 ; ++word) {
                System.out.print("word"+word+" ");
            }
            
            System.out.println();
        }
    }
}