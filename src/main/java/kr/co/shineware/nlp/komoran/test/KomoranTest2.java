package kr.co.shineware.nlp.komoran.test;
import java.util.List;

import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.Token;

public class KomoranTest2 {

    public static void main(String[] args) {
        Komoran komoran = new Komoran("models_light");
        komoran.setUserDic("user_data/dic.user");
        List<Token> tokens = komoran.analyze("청하는아이오아이출신입니다").getTokenList();
        for(Token token : tokens)
            System.out.println(token);
    }
}