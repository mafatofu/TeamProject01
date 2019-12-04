/*******************************************************************************
 * KOMORAN 3.0 - Korean Morphology Analyzer
 *
 * Copyright 2015 Shineware http://www.shineware.co.kr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import kr.co.shineware.nlp.komoran.model.Token;

import java.util.List;

public class KomoranTest1 {

	public static void main(String[] args) throws Exception {

		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");
		komoran.setUserDic("user_data/dic.user");
		//komoran.setUserDic("user_data/wiki.titles");
		
		String input = "이전 노트북을 오래 사용하다가 빅스마일 기간에 좋은 가격에 구매를 했습니다 윈도가 깔려있는 상품이길 선호했습니다. 제품기본 사양도 가격대비 좋아서 추가로 업그레이드는 하지않았습니다. 주문량이 많아서 생각보다 배송은 오래걸리긴 했지만 사은품도 다 왔고 노트북이 예뻐서 만족합니다ㅎㅎ늦은 배송에 문의글도 올리고 전화도 했지만 친절하게 답변해주셨습니다 무광이라서 더 예쁘지만 때탈까봐 걱정이 되어서 필름은 붙여야 할 듯합니다ㅎㅎ 좋은 상품 잘 구매한 것 같아서 기분이 좋네요. 액정필름을 잘 붙여야 했는데,,,, 기포 왕창 넣어 붙여서,,, 다시 붙여야 할 듯합니다.ㅜㅜ";
		KomoranResult analyzeResultList = komoran.analyze(input);
		List<Token> tokenList = analyzeResultList.getTokenList();

		//print each tokens by getTokenList()
		System.out.println("==========print 'getTokenList()'==========");
		for (Token token : tokenList) {
			System.out.println(token);
			System.out.println(token.getMorph()+"/"+token.getPos()+"("+token.getBeginIndex()+","+token.getEndIndex()+")");
			System.out.println();
		}
		System.out.println("==========print 'getNouns()'==========");
		System.out.println(analyzeResultList.getNouns());
		System.out.println();
		System.out.println("==========print 'getPlainText()'==========");
		System.out.println(analyzeResultList.getPlainText());
		System.out.println();
		System.out.println("==========print 'getList()'==========");
		System.out.println(analyzeResultList.getList());
	}
}
