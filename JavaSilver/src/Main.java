import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
      question_011();
   }


   // 2025/10/14 第2回
   private static void question_001() {
      /*
      次のうち、インポート宣言をしなくても、自動的にインポートされるものはどれか。正しいものを選びなさい。（2つ選択）
      A. java.langパッケージに属するクラス
      B. java.langパッケージのうち、StringクラスとSystemクラスの2つだけ
      C. 同じパッケージに属するクラス
      D. サブパッケージに属するクラス
      */
      System.out.println("A, C");
   }

   private static void question_002() {
      /*
      パッケージの説明として誤っているものはどれですか。（2つ選択）
      A. ソースファイルを管理する仕組み
      B. クラスファイルを管理する仕組み
      C. 1つのソースファイルに1つのパッケージ宣言のみできる
      D. 複数の異なるソースファイルに、同じ名前のパッケージ宣言は記述できない
      E. パッケージ宣言が異なっていれば、同じ名前のクラスを宣言できる
       */
      System.out.println("A, D");
   }

   private static void question_003() {
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

   private static void question_004() {
      /*
      次の式のうち、コンパイルエラーになるものを選びなさい。5つ選択）
      A. int a = 123_456_789;
      B. int b = 5_______2;
      C. int c = _123_456_789;

      D. int d = 123_456_789_;

      E. float e = 3_.1415F;

      F. long f = 999_99_9999_L;

      G. byte g = 0b0_1;
      H. int h = 0_52;
      I. int i = 0x_52;
      */
      System.out.println("C, D, E, F, I");
   }

   private static void question_005() {
      /*
      次の式のうち、コンパイルエラーになるものを選びなさい。2つ選択
      A. int $a = 100;
      B. int b_ = 200;
      C. int _0 = 300;
      D. int ${0} = 400;

      E. int g.a = 700;
      */
      System.out.println("D, E");
   }

   private static void question_006() {
      /*
      次のステートメントのうち、正しいものを選びなさい。４つ選択）
      A. int[][] a = {{1, 1}, {2, 2}};
      B. short b = (short) 'A';
      C. byte c1 = 10;
      D. char c2 = c1;
      E.boolean d = (10 == 10);
      F. float e = 1.99;
      G. int f = 12_34;
      H. String g = 'a';
      */
      System.out.println("A, B, D, G");
   }

   private static void question_007() {
      /*
      の変数宣言のうち、コンパイルエラーとならないものを選びなさい。（1つ選択）
      A. var a;
      B. var b = null;
      C. var c = () -> {};
      D. var d = {1, 2, 3};
      E. var e = new ArrayList<>();
      */
      System.out.println("E");
   }

   private static void question_008() {
      /*
      A. Stringオブジェクトを作成するコードとして、正しいものを選びなさい。（2つ選択）
      B. String a = new String("sample");
      C. String b = "sample";
      D. String c = String.newInstance("sample");
      E. String d = String.valueOf('sample');
      */
      System.out.println("A, B");
   }

   private static void question_009() {
      String str = "hoge, world.";
      hello(str);
      System.out.println(str);
   }

   private static void hello(String msg) {
      msg.replaceAll("hoge", "hello");
   }

   private static void question010() {
      String str = "abcd";
      System.out.println(str.charAt(5));
   }

   private static void question_011() { // String
      String str = "abcdef";
      System.out.println(str.indexOf("abcdef"));

      String str2 = "abcde";
      System.out.println(str2.substring(2, 4));

      String str3 = "aaaa";
      System.out.println(str3.replace("aa", "b"));

      String str4 = "abcde";
      System.out.println(str4.substring(1, 3).startsWith("b"));

      String str5 = "Hello, ".concat("Java!");
      System.out.println(str5);

      StringBuilder sb = new StringBuilder("abcde");
      System.out.println(sb.capacity());

      String str6 = """
            this is textblock sample.""";
   }
}
