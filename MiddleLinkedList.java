import java.util.*;
public class main{
    public static void main(String[] args){
        LinkedList L = new LinkedList();
        Scanner s = new Scanner(System.in);
        int mid = 0;
        int t = s.nextInt();
        s.nextLine();
        while(t!=0){
            int k = s.nextInt();
            s.nextLine();
            String[] str = s.nextLine().split(" ");
            if(str.length%2==0)
                mid  = str.length/2;
            else
                mid  = str.length/2;
            for(int i=0;i<str.length;i++){
                L.addLast(Integer.parseInt(str[i]));
                if(i == mid)
                    System.out.println(L.getLast());
            }
            t--;
        }
    }

}
