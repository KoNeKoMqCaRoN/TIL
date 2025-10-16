import java.util.ArrayList;

public class Silver003 extends Main {
   // 2025/10/16 Silver第3回

   protected void question_001() {
      // メモリの中に文字列が存在しているかどうか

      String a = "abc";
      String b = new String(a);

      int count = 0;
      if (a.intern() == "abc") {
         count++;
      }
      if (b.intern() == "abc") {
         count++;
      }
      if (a.intern() == b.intern()) {
         count++;
      }
      System.out.println(count);
   }

   protected void question_002() {
      String a = "sample";
      String b = "sample";
      System.out.print(a == b);
      System.out.print(", ");
      System.out.println(a.equals(b));
   }

   protected void question_005() {
      int[] array = new int[0];
      System.out.println(array);
      // ハッシュコードが表示される
   }

   protected void question_006() {
      Item[] items = new Item[3]; // Item型の部屋を作っただけ、中身は無い
      int total = 0;
      for (int i = 0; i < items.length; i++) {
         total += items[i].price; // ←ここでエラー
      }
      System.out.println(total);
      // コンパイルエラーが発生する
   }

   protected void question_008() {
      String[][] array = { { "A", "B" }, null, { "C", "D", "E" } };
      int total = 0;
      for (String[] tmp : array) {
         total += tmp.length;
      }
      System.out.println(total);
      // 実行時に例外がスローされる
   }

   protected void question_011() {
      ArrayList<String> list = new ArrayList<>();
      list.add("A");
      list.add(2, "B"); // indexが2の要素はないからエラー
      list.add("C");
      list.add("D");
      for (String str : list) {
         System.out.print(str);
      }
      // 実行時に例外がスロー去れる
   }

   protected void question_013() {
      ArrayList<String> list = new ArrayList<>();
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");

      // 拡張for文限定
      // 参照中に中身を変更するとエラー
      for (String str : list) {
         if ("B".equals(str)) {
            list.remove(str);
         } else {
            System.out.println(str);
         }
      }
      // 実行時に例外がスローされる
   }
}

class Item {
   String name;
   int price = 100;
}