import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class Source {

   public static void main(String[] args) {
       List<Float> random = new ArrayList<Float>();
       random.add(1f);
       random.add(2f);
       random.add(3f);
       random.add(4f);
       random.add(5f);
       random.add(6f);
       
      // random.add(2,11f);
       
       System.out.println(random);
       
       ListIterator<Float> it = random.listIterator(random.size());
       while(it.hasPrevious()) {
           if(it.hasPrevious()) {
               System.out.println(it.previous());
           }
           it.previous();
       } 

      // printList(random);
       
       
       List<Integer> arrayList = new ArrayList<Integer>();
       arrayList.add(1);
       arrayList.add(2);

       ListIterator<Integer> listIterator = arrayList.listIterator();
       while(listIterator.hasNext()) {
                System.out.print(listIterator.next());
                listIterator.previous();
       }
   }

   public static void printList(List<Float> arr) {
	  ListIterator<Float> itr= arr.listIterator(arr.size());
	   
	   while(itr.hasPrevious()){
		   System.out.println(itr.previous());
	   }
      /* for(Float num : arr) {
           System.out.println(num);
       }*/
   }
}