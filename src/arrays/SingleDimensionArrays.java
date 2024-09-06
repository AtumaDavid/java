package arrays;

public class SingleDimensionArrays {
    public static void main (String[] args){
        //    Declaring an array
//        int[] marks;
//        marks = new int[5];
//        ----Or----
//        int[] marks = new int[5];

//        Initializing an array
//        int[] marks = new int[]{10,20,30,40,50};

//        Declare and assign
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 78;
        marks[3] = 80;
        marks[4] = 98;

        for (int mark : marks) {
            System.out.println(mark);
        }

    }
}
