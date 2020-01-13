package uwotm8;

import uwotm8.I;
import uwotm8.K;

public final class an {

   public static an[] a;
   private static int d;
   private static int[] e;
   public int b;
   public boolean c = false;


   public static void a(I var0) {
      K var7 = new K(var0.b("varp.dat"));
      d = 0;
      int var1 = var7.h();
      if(a == null) {
         a = new an[var1];
      }

      if(e == null) {
         e = new int[var1];
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         if(a[var2] == null) {
            a[var2] = new an();
         }

         an var10000 = a[var2];
         int var5 = var2;
         K var4 = var7;
         an var3 = var10000;

         int var6;
         while((var6 = var4.f()) != 0) {
            if(var6 == 1) {
               var4.f();
            } else if(var6 == 2) {
               var4.f();
            } else if(var6 == 3) {
               e[d++] = var5;
            } else if(var6 != 4) {
               if(var6 == 5) {
                  var3.b = var4.h();
               } else if(var6 != 6) {
                  if(var6 == 7) {
                     var4.k();
                  } else if(var6 == 8) {
                     var3.c = true;
                  } else if(var6 == 10) {
                     var4.m();
                  } else if(var6 == 11) {
                     var3.c = true;
                  } else if(var6 == 12) {
                     var4.k();
                  } else if(var6 != 13) {
                     System.out.println("Error unrecognised config code: ".concat(String.valueOf(var6)));
                  }
               }
            }
         }
      }

      if(var7.b != var7.a.length) {
         System.out.println("varptype load mismatch");
      }

   }

}
