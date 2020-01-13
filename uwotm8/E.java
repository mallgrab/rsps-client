package uwotm8;

import uwotm8.F;
import uwotm8.I;
import uwotm8.K;

public final class E {

   public static int a;
   public static E[] b;
   public int c = -1;
   private int[] e;
   private final int[] f = new int[6];
   private final int[] g = new int[6];
   private final int[] h = new int[]{-1, -1, -1, -1, -1};
   public boolean d = false;


   public static void a(I var0) {
      K var6;
      a = (var6 = new K(var0.b("idk.dat"))).h();
      if(b == null) {
         b = new E[a];
      }

      for(int var1 = 0; var1 < a; ++var1) {
         if(b[var1] == null) {
            b[var1] = new E();
         }

         E var10000 = b[var1];
         K var3 = var6;
         E var2 = var10000;

         int var4;
         while((var4 = var3.f()) != 0) {
            if(var4 == 1) {
               var2.c = var3.f();
            } else if(var4 == 2) {
               var4 = var3.f();
               var2.e = new int[var4];

               for(int var5 = 0; var5 < var4; ++var5) {
                  var2.e[var5] = var3.h();
               }
            } else if(var4 == 3) {
               var2.d = true;
            } else if(var4 >= 40 && var4 < 50) {
               var2.f[var4 - 40] = var3.h();
            } else if(var4 >= 50 && var4 < 60) {
               var2.g[var4 - 50] = var3.h();
            } else if(var4 >= 60 && var4 < 70) {
               var2.h[var4 - 60] = var3.h();
            } else {
               System.out.println("Error unrecognised config code: ".concat(String.valueOf(var4)));
            }
         }
      }

   }

   public final boolean a() {
      if(this.e == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.e.length; ++var2) {
            if(!F.b(this.e[var2])) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public final F b() {
      if(this.e == null) {
         return null;
      } else {
         F[] var1 = new F[this.e.length];

         for(int var2 = 0; var2 < this.e.length; ++var2) {
            var1[var2] = F.a(this.e[var2]);
         }

         F var4;
         if(var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new F(var1.length, var1);
         }

         for(int var3 = 0; var3 < 6 && this.f[var3] != 0; ++var3) {
            var4.a(this.f[var3], this.g[var3]);
         }

         return var4;
      }
   }

   public final boolean c() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(this.h[var2] != -1 && !F.b(this.h[var2])) {
            var1 = false;
         }
      }

      return var1;
   }

   public final F d() {
      F[] var1 = new F[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.h[var3] != -1) {
            var1[var2++] = F.a(this.h[var3]);
         }
      }

      F var5 = new F(var2, var1);

      for(int var4 = 0; var4 < 6 && this.f[var4] != 0; ++var4) {
         var5.a(this.f[var4], this.g[var4]);
      }

      return var5;
   }

}
