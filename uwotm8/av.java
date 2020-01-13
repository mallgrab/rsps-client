package uwotm8;

import uwotm8.K;
import uwotm8.as;
import uwotm8.au;

public final class av {

   private static int b = 22050;
   private final as[] c = new as[10];
   private int d;
   private int e;
   public int a;


   public final void a(K var1) {
      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(var1.f() != 0) {
            --var1.b;
            this.c[var2] = new as();
            this.c[var2].a(var1);
         }
      }

      this.d = var1.h();
      this.e = var1.h();
      av var4 = this;
      var2 = 9999999;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if(var4.c[var3] != null && var4.c[var3].b / 20 < var2) {
            var2 = var4.c[var3].b / 20;
         }
      }

      if(var4.d < var4.e && var4.d / 20 < var2) {
         var2 = var4.d / 20;
      }

      int var10001;
      if(var2 != 9999999 && var2 != 0) {
         for(var3 = 0; var3 < 10; ++var3) {
            if(var4.c[var3] != null) {
               var4.c[var3].b -= var2 * 20;
            }
         }

         if(var4.d < var4.e) {
            var4.d -= var2 * 20;
            var4.e -= var2 * 20;
         }

         var10001 = var2;
      } else {
         var10001 = 0;
      }

      this.a = var10001;
   }

   public final au a() {
      av var1 = this;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if(var1.c[var3] != null && var1.c[var3].a + var1.c[var3].b > var2) {
            var2 = var1.c[var3].a + var1.c[var3].b;
         }
      }

      byte[] var10000;
      if(var2 == 0) {
         var10000 = new byte[0];
      } else {
         byte[] var10 = new byte[var2 * b / 1000];

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1.c[var3] != null) {
               int var4 = var1.c[var3].a * b / 1000;
               int var5 = var1.c[var3].b * b / 1000;
               int[] var6 = var1.c[var3].a(var4, var1.c[var3].a);

               for(int var7 = 0; var7 < var4; ++var7) {
                  int var8;
                  if(((var8 = (var6[var7] >> 8) + var10[var7 + var5]) + 128 & -256) != 0) {
                     var8 = var8 >> 31 ^ 127;
                  }

                  var10[var7 + var5] = (byte)var8;
               }
            }
         }

         var10000 = var10;
      }

      byte[] var9 = var10000;
      return new au(b, var9, this.d * b / 1000, this.e * b / 1000);
   }
}
