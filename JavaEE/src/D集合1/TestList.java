package D集合1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

//ArrayList：List的主要实现类
/*
*  List中相对于Collection，新增加的方法
*  void add(int index, Object ele):在指定的索引位置index添加元素ele
   boolean addAll(int index, Collection eles)
   Object get(int index):获取指定索引的元素
   Object remove(int index):删除指定索引位置的元素
   Object set(int index, Object ele):设置指定索引位置的元素为ele
   int indexOf(Object obj):返回obj在集合中首次出现的位置。没有的话，返回-1
   int lastIndexOf(Object obj)：返回obj在集合中最后一次出现的位置.没有的话，返回-1
   List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex结束的左闭右开一个子list
   List常用的方法：增(add(Object obj)) 删(remove) 改(set(int index,Object obj))
			         查(get(int index)) 插(add(int index, Object ele)) 长度(size())
*/
public class TestList {
   @Test
   public void testList1(){
	   List list = new ArrayList();
	   list.add(123);
	   list.add(456);
	   list.add("AA");
	   list.add(new String ("GG"));
	   System.out.println(list);
	   list.add(0.555);
	   System.out.println(list);
	   Object obj = list.get(1);
	   System.out.println(obj);
	   list.remove(0);
	   System.out.println(list.get(0));
	   list.set(0, 111);
	   System.out.println(list.get(0));
	   System.out.println();
	   
	   //list集合遍历
	   Iterator iterator = list.iterator();
	   while(iterator.hasNext()){
		   System.out.println(iterator.next());
	   }
   }
   @Test
   public void testList2(){
	   List list = new ArrayList();
	   list.add(123);
	   list.add(456);
	   list.add("AA");
	   list.add(new String ("GG"));
	   list.add(456);
	   System.out.println(list.indexOf(456));
	   System.out.println(list.lastIndexOf(456));
	   System.out.println(list.indexOf(123) == list.lastIndexOf(123));
	   System.out.println(list.indexOf(222));
   }
}
