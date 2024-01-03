public class CopyConstructor {
    String word;
    CopyConstructor(){
        word="I am main constructor";
        System.out.println(word);
    
    }
    CopyConstructor(CopyConstructor ref){
       word=ref.word;
       System.out.println("Copied Constructor word "+word);
    }

    public static void main(String[] args) {
        CopyConstructor obj = new CopyConstructor();
        CopyConstructor obj2 = new CopyConstructor(obj);
    }
}
