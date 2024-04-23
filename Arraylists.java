import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> ages=new ArrayList<>();
        ages.add(23);
        ages.add(56);

        ages.add(0,21);//inserting element to a specific index
        System.out.println(ages);

        ages.add(0,211);

        //looping arraylist
        for(int i=0; i<ages.size(); i++){
            System.out.println(ages.get(i));
        }

    }
}