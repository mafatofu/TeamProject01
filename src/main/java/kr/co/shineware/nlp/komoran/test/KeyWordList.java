package kr.co.shineware.nlp.komoran.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyWordList {
   //배송키워드 긍정/부정 단어 리스트
   public static final List<String> shipping_positive = new ArrayList<String>
   (Arrays.asList("꼼꼼", "빠르", "안전하게", "바로", "예상", "무료", "하루", "당일", "빨리", "다음날"));
   public static final List<String> shipping_negative = new ArrayList<String>
   (Arrays.asList("늦", "아쉽", "오래", "느리", "지연", "지연이", "걸리","파손", "직원", "만"));
   
   //사은품키워드 긍정/부정 단어 리스트
   public static final List<String>  gift_positive = new ArrayList<String>
   (Arrays.asList("많이","챙기","감사","저렴","잘","모두","빠짐없이","이것저것","풍년","마음","그냥","푸짐","쓰","빵빵",
            "필요","특별","적당","특별히","좋","젤로","만족스럽","챙겨주","많","그럭저럭","만족스럽",
            "꼭","필요","다","받"));
   public static final List<String>  gift_negative = new ArrayList<String>
   (Arrays.asList("누락","없","복잡","까다롭","밖에","싸구려","빠지","어쩌","곰팡이","좀 없이"));
   
   //가격키워드 긍정/부정 단어 리스트
   public static final List<String>  price_positive = new ArrayList<String>
   (Arrays.asList("좋","대비","가성비","착한가격","이만한","저렴","만족","싸게","최저가","행사","빅스마일데이",
         "착하","훌륭","득템","비교","마음","굿"));
   public static final List<String>  price_negative = new ArrayList<String>
   (Arrays.asList("비싸"));
   
   //윈도우키워드 긍정/부정 단어 리스트
   public static final List<String>  window_positive = new ArrayList<String>
   (Arrays.asList("윈도우10","설치","깔리","탑재","기본으로","윈도우","정품","깔","깔리","활성화","셋팅","기본","문제없이"));
   public static final List<String>  window_negative = new ArrayList<String>
   (Arrays.asList("욕먹을짓"));
   
   //가성비키워드 긍정/부정 단어 리스트
   public static final List<String>  cost_positive = new ArrayList<String>
   (Arrays.asList("","가성비로 유명한","가성비 노트북","가성비 최고","가성비 고려","가성비 좋습니다","착한가격","착한 가격",
         "탁월","추천","훌륭","괜찮","금액","대비", "가격"));
   public static final List<String>  cost_negative = new ArrayList<String>();
   
   //성능키워드 긍정/부정 단어 리스트
   public static final List<String>  perform_positive = new ArrayList<String>
   (Arrays.asList("좋","나쁘지","필요한","좋은것","훨씬","나은","빠릿빠릿","생각한대로","좋고","대만족","충분","매우","탁월","만족"));
   public static final List<String>  perform_negative = new ArrayList<String>
   (Arrays.asList("성능차이"));

   //화면키워드 긍정/부정 단어 리스트
   public static final List<String>  display_positive = new ArrayList<String>
   (Arrays.asList("크","시원","신세계","좋","크게","넓","와이드","깨끗","시원시원","큰"));
   public static final List<String>  display_negative = new ArrayList<String>(Arrays.asList());

   //무게키워드 긍정/부정 단어 리스트
   public static final List<String>  weight_positive = new ArrayList<String>
   (Arrays.asList("가볍","가볍고","적당"));
   public static final List<String>  weight_negative = new ArrayList<String>
   (Arrays.asList("가볍지","무겁","빼고","약간","더"));

   //속도키워드 긍정/부정 단어 리스트
   public static final List<String>  speed_positive = new ArrayList<String>
   (Arrays.asList("신세계", "감동", "빠르","상상","속도에","빠르고","환상적","감탄"));
   public static final List<String>  speed_negative = new ArrayList<String>
   (Arrays.asList());
}
