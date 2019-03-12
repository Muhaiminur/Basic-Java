package LOOP;
class LearnNestedForLoopWithLabel {
    public static void main(String[] args) {
        int line, word, wordCount=1;
        MyProthomLoop:
        for(line = 1; line <= 3; ++line) {
            System.out.print("Line "+line+": ");
            MyDitioLoop:
            for(word = 1; word <= 4 ; ++word) {
                if(wordCount>6){
                    break MyProthomLoop;
                }
                System.out.print("word"+word+" ");
                ++wordCount;
            }
            System.out.println();
        }
    }
}