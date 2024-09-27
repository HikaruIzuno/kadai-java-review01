
public class Review01 {

    public static void main(String[] args) {

        //税抜き価格の入力
        int price = 1500;  //具体的な税抜き価格を入力

        //taxメソッドの呼び出し
        double tax = tax(price);

        //アウトプットの形式.小数点以下切り捨て
        System.out.println( price + "円の商品の税込価格は" + (int)(price + tax) + "円（消費税は" + (int)tax +"円）です。");

    }

    public static double tax(int a) {

        //税率の定義
        double tax_rate = 10.0; //単位は％

        //税抜き価格a円の場合の、税額の計算
        double result = (double)a * (tax_rate / 100.0);

        //税額を返す
        return result;

    }

}
