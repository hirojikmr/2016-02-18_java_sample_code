import java.util.Iterator;

///////////////////////////////
//
// IteratorとIterableは、
// javaがすでに定義済みである
//
///////////////////////////////

//interface Iterable<E>{
//  Iterator<E> iterator();
//}

//interface Iterator<E>{
//  boolean hasNext();
//  E next();
//}

class Moge implements Iterable<String>, Iterator<String>{

  String[] arr=new String[3];
  int cnt;

  Moge(String _a, String _b, String _c){
    arr[0]=_a;
    arr[1]=_b;
    arr[2]=_c;
    cnt=0;
  }

  public Iterator<String> iterator(){
    return this;
  }

  public boolean hasNext(){
    return cnt<arr.length;
  }

  public String next(){
    return arr[cnt++];
  }

  public void remove(){
  }

}

class Main{
  public static void main(String args[]){
    Moge m = new Moge("aaaa","BBB","ZZZ");

    //
    //  Iterableなものは拡張for文が使える
    //
    for(String s : m ){
      System.out.println( s );
    }
  }
}
