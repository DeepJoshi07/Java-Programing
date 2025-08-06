import java.util.*;

// set,get,add,remove,addFirst,addLast,removeFirst,removeLast
public class Array_List {
    public static int findMaximum(ArrayList<Integer> al) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < al.size(); i++) {
            max = Math.max(al.get(i), max);
        }

        return max;
    }

    public static void swapTwoNumbers(ArrayList<Integer> al, int idx1, int idx2) {
        int temp = al.get(idx1);
        al.set(idx1, al.get(idx2));
        al.set(idx2, temp);
    }

    public static int maxTrapedWater(ArrayList<Integer> al) {
        int maxWater = Integer.MIN_VALUE;
        int si = 0;
        int ei = al.size()-1;
        while (si < ei) {
            int height = Math.min(al.get(si), al.get(ei));
            int width = (ei - si);
            int currWater = height * width;
            maxWater = Math.max( currWater  , maxWater);
            if (al.get(si) < al.get(ei)) {
                si++;
            } else {
                ei--;
            }
        }
        return maxWater;
    }

    public static boolean pairSum(ArrayList<Integer>al,int sum){
        int si = 0;
        int ei = al.size()-1;
        while(si < ei){
            if(al.get(si)+al.get(ei) == sum){
                return true;
            }
            if(sum > al.get(si)+al.get(ei)){
                si++;
            }else{
                ei--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        System.out.println(al);
        System.out.println("---------------------------------");
        al.remove(5);
        System.out.println(al);
        System.out.println("---------------------------------");
        al.set(2, 4);
        System.out.println(al);
        System.out.println("---------------------------------");
        System.out.println(al.get(4));
        System.out.println("---------------------------------");
        System.out.println(al.size());
        System.out.println("---------------------------------");
        al.removeFirst();
        System.out.println(al);
        System.out.println("---------------------------------");
        al.removeLast();
        System.out.println(al);
        System.out.println("---------------------------------");
        al.addFirst(12);
        System.out.println(al);
        System.out.println("---------------------------------");
        al.addLast(20);
        System.out.println(al);
        System.out.println("---------------------------------");
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(12);
        al1.add(16);
        al1.add(18);
        al1.add(14);
        al1.add(10);
        al1.add(19);
        al1.add(11);
        al1.add(13);
        al1.add(15);
        al1.add(17);
        System.out.println(findMaximum(al1));
        System.out.println(al1);
        System.out.println("---------------------------------");
        swapTwoNumbers(al1, 1, 5);
        System.out.println(al1);
        System.out.println("---------------------------------");
        Collections.sort(al1);
        System.out.println(al1);
        System.out.println("---------------------------------");
        Collections.sort(al1, Collections.reverseOrder());
        System.out.println(al1);
        System.out.println("---------------------------------");
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list0 = new ArrayList<>();
        list0.add(20);
        list0.add(30);
        list0.add(40);
        list0.add(50);
        list0.add(60);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(21);
        list1.add(31);
        list1.add(41);
        list1.add(51);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(22);
        list2.add(32);
        list2.add(42);

        list.add(list0);
        list.add(list1);
        list.add(list2);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> lista = new ArrayList<>();
            lista = list.get(i);
            int length = lista.size();
            for (int j = 0; j < length; j++) {
                System.out.print(lista.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println(maxTrapedWater(height));
        System.out.println("---------------------------------");
        ArrayList<Integer> sorted = new ArrayList<>();
        sorted.add(1);
        sorted.add(2);
        sorted.add(3);
        sorted.add(4);
        sorted.add(5);
        System.out.println(pairSum(sorted,5));
        System.out.println("---------------------------------");

    }
}
