import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorts {
    public List<Integer> selectionSort(List<Integer> list){
        List<Integer> retL = new ArrayList<>();
        int length = list.size();
        for(int i=0 ;i<length;i++){
            int min = i;
            for (int j = i+1; j < length; j++) {
                if(list.get(j)<list.get(min)){
                    min = j;
                }
            }
            int temp = list.get(min);
            list.set(min,list.get(i));
            list.set(i,temp);
        }
        return list;
    }
    public List<Integer> insertionSort(List<Integer> list){
        int length = list.size();
        for(int i= 1;i<length;i++){
            int j =i;
            while (j> 0 && list.get(j)<list.get(j-1)){
                int temp = list.get(j);
                list.set(j,list.get(j-1));
                list.set(j-1,temp);
                j--;
            }

        }
        return list;
    }
    public List<Integer> bubbleSort(List<Integer> list){
        int length = list.size();
        for(int i= 0;i<length;i++){
            for (int j = 0; j < length-1; j++) {
                if (list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(19));
        }
        System.out.println(list);
        new Sorts().bubbleSort(list);
        System.out.println(list);
    }
}
