public class Array {
    public static void main(String[] args) {
        int Marks[]={10,20,30,40,50,60};
        System.out.println(Marks);
        System.out.println(Marks[0]);
        //for each loop
        for(int a:Marks){
            System.out.println(a);
        }
        //classical way to iterate array
        for(int i=0;i<Marks.length;i++){
            System.out.println(Marks[i]);
        }
    }
    
}
