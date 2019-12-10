package kr.co.shineware.nlp.komoran.test;

import java.util.HashMap;

public class CountPNTest {
   //긍정/부정 단어리스트의 크기
   static int plistSize = KeyWordList.shipping_positive.size();
   static int nlistSize = KeyWordList.shipping_negative.size();
   
   //긍정, 부정 해시맵 선언 및 초기화
   public static final HashMap<String, Integer> phashmap = new HashMap<String, Integer>();
   static{
         for(int i=0;i<plistSize;i++) {
            phashmap.put(KeyWordList.shipping_positive.get(i), 0);
         }   
      }
      
   public static final HashMap<String, Integer> nhashmap = new HashMap<String, Integer>();
   static{
         for(int i=0;i<nlistSize;i++) {
            nhashmap.put(KeyWordList.shipping_negative.get(i), 0);
         }   
   }
}
