package uwotm8;

import uwotm8.J;
import uwotm8.K;
import uwotm8.av;
import uwotm8.c;

public final class aw {

   private static int a = 0;
   private static av[] b;


   public static void a(c var0) {
      try {
         b = new av[a = var0.a()];

         for(int var1 = 0; var1 < a; ++var1) {
            byte[] var2;
            if(var0.a(var1) && (var2 = J.a(var0.b(var1))) != null) {
               K var5 = new K(var2);
               av var3;
               (var3 = new av()).a(var5);
               b[var1] = var3;
            }
         }

      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static av a(int var0) {
      return b[var0];
   }
}
