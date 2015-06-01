package zakiyan.com.quiz;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeographyJapan {

    QuizObject hokkaido = new QuizObject("北海道","北海道地方");
    QuizObject aomori = new QuizObject("青森県","東北地方");
    QuizObject iwate = new QuizObject("岩手県","東北地方");
    QuizObject miyagi = new QuizObject("宮城県","東北地方");
    QuizObject akita = new QuizObject("秋田県","東北地方");
    QuizObject yamagata = new QuizObject("山形県","東北地方");
    QuizObject hukushima = new QuizObject("福島県","東北地方");
    QuizObject ibaragi = new QuizObject("茨城県","関東地方");
    QuizObject tochigi = new QuizObject("栃木県","関東地方");
    QuizObject gunma = new QuizObject("群馬県","関東地方");
    QuizObject saitama = new QuizObject("埼玉県","関東地方");
    QuizObject chiba = new QuizObject("千葉県","関東地方");
    QuizObject tokyo = new QuizObject("東京都","関東地方");
    QuizObject kanagawa = new QuizObject("神奈川県","関東地方");
    QuizObject niigata = new QuizObject("新潟県","中部地方");
    QuizObject toyama = new QuizObject("富山県","中部地方");
    QuizObject ishikawa = new QuizObject("石川県","中部地方");
    QuizObject hukui = new QuizObject("福井県","中部地方");
    QuizObject yamanashi = new QuizObject("山梨県","中部地方");
    QuizObject nagano = new QuizObject("長野県","中部地方");
    QuizObject gihu = new QuizObject("岐阜県","中部地方");
    QuizObject shizuoka = new QuizObject("静岡県","中部地方");
    QuizObject aichi = new QuizObject("愛知県","中部地方");
    QuizObject mie = new QuizObject("三重県","関西地方");
    QuizObject shiga = new QuizObject("滋賀県","関西地方");
    QuizObject kyoto = new QuizObject("京都府","関西地方");
    QuizObject osaka = new QuizObject("大阪府","関西地方");
    QuizObject hyogo = new QuizObject("兵庫県","関西地方");
    QuizObject nara = new QuizObject("奈良県","関西地方");
    QuizObject wakayama = new QuizObject("和歌山県","関西地方");
    QuizObject tottori = new QuizObject("鳥取県","中国地方");
    QuizObject shimane = new QuizObject("島根県","中国地方");
    QuizObject okayama = new QuizObject("岡山県","中国地方");
    QuizObject hiroshima = new QuizObject("広島県","中国地方");
    QuizObject yamaguchi = new QuizObject("山口県","中国地方");
    QuizObject tokushima = new QuizObject("徳島県","四国地方");
    QuizObject kagawa = new QuizObject("香川県","四国地方");
    QuizObject ehime = new QuizObject("愛媛県","四国地方");
    QuizObject kochi = new QuizObject("高知県","四国地方");
    QuizObject hukuoka = new QuizObject("福岡県","九州地方");
    QuizObject saga = new QuizObject("佐賀県","九州地方");
    QuizObject nagasaki = new QuizObject("長崎県","九州地方");
    QuizObject kumamoto = new QuizObject("熊本県","九州地方");
    QuizObject oita = new QuizObject("大分県","九州地方");
    QuizObject miyazaki = new QuizObject("宮崎県","九州地方");
    QuizObject kagoshima = new QuizObject("鹿児島県","九州地方");
    QuizObject okinawa = new QuizObject("沖縄県","九州地方");

    QuizObject hokkaidoregion = new QuizObject("北海道地方");
    QuizObject tohokuregion = new QuizObject("東北地方");
    QuizObject kantoregion = new QuizObject("関東地方");
    QuizObject cyuburegion = new QuizObject("中部地方");
    QuizObject kansairegion = new QuizObject("関西地方");
    QuizObject cyugokuregion = new QuizObject("中国地方");
    QuizObject shikokuregion = new QuizObject("四国地方");
    QuizObject kyusyuregion = new QuizObject("九州地方");

    public QuizObject[] quizObjectArray(){

        QuizObject[] quizobjectarray = {
                hokkaido , aomori  , iwate   , miyagi   , akita    , yamagata , hukushima,
                ibaragi  , tochigi , gunma   , saitama  , chiba    , tokyo    , kanagawa,
                niigata  , toyama  , ishikawa, hukui    , yamanashi, nagano   , gihu,
                shizuoka , aichi   , mie     , shiga    , kyoto    , osaka    , hyogo,
                nara     , wakayama, tottori , shimane  , okayama  , hiroshima, yamaguchi,
                tokushima, kagawa  , ehime   , kochi    , hukuoka  , saga     , nagasaki,
                kumamoto , oita    , miyazaki, kagoshima, okinawa
        };

        return shuffleArray(quizobjectarray);
    }

    public String quizGroupName(String groupname){

        QuizObject[] quizgrouparray = {
                hokkaidoregion , tohokuregion  , kantoregion   , cyuburegion,
                kansairegion   , cyugokuregion , shikokuregion , kyusyuregion
        };
        quizgrouparray = shuffleArray(quizgrouparray);

        for (int i = 0; i < quizgrouparray.length; i++){

            if(groupname != quizgrouparray[i].getGroupname() ){
                groupname = quizgrouparray[i].getGroupname();
                break;
            }
        }
        return groupname;
    }
    public QuizObject[] shuffleArray(QuizObject[] quizobjectarray){

        List<QuizObject> list = Arrays.asList(quizobjectarray);
        Collections.shuffle(list);
        quizobjectarray = (QuizObject[])list.toArray(new QuizObject[0]);

        return quizobjectarray;
    }
}
