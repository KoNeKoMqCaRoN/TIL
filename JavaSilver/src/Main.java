public class Main {

   public static void main(String[] args) {
      question_001();
   }


   // 2025/10/13 Silver第1回
   static void question_001() {
      /*
      パッケージに関する説明として、正しいものを選びなさい。（3つ選択）
      A. 名前空間を提供する
      B. パッケージ名にはドメイン名を逆にしたものを使用しなければならない
      C. アクセス制御を提供する
      D. クラスの分類を可能にする
      E. パッケージに属さないクラスもある
       */
      System.out.println("A ,C, D");
   }

   // 2025/10/13 Silver第2回
   static void question_002() {
      /*
      次のうち、インポート宣言をしなくても、自動的にインポートされるものはどれか。正しいものを選びなさい。（2つ選択）
      A. java.langパッケージに属するクラス
      B. java.langパッケージのうち、StringクラスとSystemクラスの2つだけ
      C. 同じパッケージに属するクラス
      D. サブパッケージに属するクラス
       */
      System.out.println("A ,C");
   }
   static void question_003() {
      /*
      次の式のうち、コンパイルエラーになるものを選びなさい。
      A. int a = 267;
      B. int b = 0413;
      C. int c = 0x10B;
      D. int d = 0b100001011;
      E. int e = 0B27;
       */
      System.out.println("E");
   }
}
