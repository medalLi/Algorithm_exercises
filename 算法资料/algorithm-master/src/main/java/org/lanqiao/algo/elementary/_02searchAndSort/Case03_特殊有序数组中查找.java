package org.lanqiao.algo.elementary._02searchAndSort;

/**
 * 有个排序后的字符串数组，其中散布着一些空字符串，编写一个方法，
 * 找出给定字符串（肯定不是空字符串）的索引。
 SHA1(mininet_test.ovf)= f7029d7e7b817ef43c24108ef6b23b79a503622f
 47
 <Item>
        <rasd:Address>0</rasd:Address>
        <rasd:Description>SATA Controller</rasd:Description>
        <rasd:ElementName>sataController0</rasd:ElementName>
        <rasd:InstanceID>3</rasd:InstanceID>
        <rasd:ResourceSubType>vmware.sata.ahci</rasd:ResourceSubType>
        <rasd:ResourceType>20</rasd:ResourceType>
      </Item>
54
 
 * */
public class Case03_特殊有序数组中查找 {
  public static void main(String[] args) {
    String[] arr = {"a", "", "ac", "", "ad", "b", "", "ba"};
    int res = indexOf(arr, "abc");
    System.out.println(res);
  }

  private static int indexOf(String[] arr, String p) {
    int begin = 0;
    int end = arr.length - 1;
    while (begin <= end) {
      int indexOfMid = begin + ((end - begin) >> 1);
      while (arr[indexOfMid].equals("")) {
        indexOfMid++;
        //千万要注意
        if (indexOfMid > end)
          return -1;
      }
      if (arr[indexOfMid].compareTo(p) > 0) {
        end = indexOfMid - 1;
      } else if (arr[indexOfMid].compareTo(p) < 0) {
        begin = indexOfMid + 1;
      } else {
        return indexOfMid;
      }
    }
    return -1;
  }
}
