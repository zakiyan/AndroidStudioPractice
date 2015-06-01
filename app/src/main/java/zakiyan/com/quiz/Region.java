package zakiyan.com.quiz;

public class Region {

    String[][] namearray = {
            {"北海道","北海道地方"},
            {"青森県","東北地方"},{"岩手県","東北地方"},{"宮城県","東北地方"},
            {"秋田県","東北地方"},{"山形県","東北地方"},{"福島県","東北地方"},
            {"茨城県","関東地方"},{"栃木県","関東地方"},{"群馬県","関東地方"},{"埼玉県","関東地方"},
            {"千葉県","関東地方"},{"東京都","関東地方"},{"神奈川県","関東地方"},
            {"新潟県","中部地方"},{"富山県","中部地方"},{"石川県","中部地方"},
            {"福井県","中部地方"},{"山梨県","中部地方"},{"長野県","中部地方"},
            {"岐阜県","中部地方"},{"静岡県","中部地方"},{"愛知県","中部地方"},
            {"三重県","関西地方"},{"滋賀県","関西地方"},{"京都府","関西地方"},{"大阪府","関西地方"},
            {"兵庫県","関西地方"},{"奈良県","関西地方"},{"和歌山県","関西地方"},
            {"鳥取県","中国地方"},{"島根県","中国地方"},{"岡山県","中国地方"},
            {"広島県","中国地方"},{"山口県","中国地方"},
            {"徳島県","四国地方"},{"香川県","四国地方"},{"愛媛県","四国地方"},{"高知県","四国地方"},
            {"福岡県","九州地方"},{"佐賀県","九州地方"},{"長崎県","九州地方"},{"熊本県","九州地方"},
            {"大分県","九州地方"},{"宮崎県","九州地方"},{"鹿児島県","九州地方"},{"沖縄県","九州地方"},
    };

    public String[] getRegionName(int code) {
        String[] array = {namearray[code][0],namearray[code][1]};
        return array;
    }
}