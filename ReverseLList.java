import java.util.*;
public class main{
    public static void main(String[] args){
        LinkedList L = new LinkedList();
        Scanner s = new Scanner(System.in);
        int mid = 0;
        String temp = "";
            int k = s.nextInt();
            s.nextLine();
            String[] str = s.nextLine().split(" ");
            for(int i=0;i<str.length;i++){
                L.addLast(Integer.parseInt(str[i]));
                temp = L.getLast() + " " + temp;
            }
        System.out.println(temp);
    }

}
