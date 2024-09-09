package loops;

public class ForEachLoop {
    public static void main(String[] args){
        String[] names = {"Kings", "Queen", "Prince", "Princess"}  ;
        for (String s : names) {
            System.out.println(s);
        }
        for(String name: names){
            System.out.println(name);
        }
    }
}
