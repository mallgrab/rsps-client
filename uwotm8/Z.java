package uwotm8;

import java.nio.ByteBuffer;
import uwotm8.I;

public final class Z {

   public static Z[] a;
   public static Z[] b;
   public int c = -1;
   public int d;
   public boolean e = true;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;


   public static void a(I var0) {
      ByteBuffer var6;
      short var1 = (var6 = ByteBuffer.wrap(var0.b("flo.dat"))).getShort();
      System.out.println("Underlay Floors Loaded: ".concat(String.valueOf(var1)));
      b = new Z[var1];

      Z var10000;
      Z var3;
      ByteBuffer var4;
      byte var5;
      for(int var2 = 0; var2 < var1; ++var2) {
         if(b[var2] == null) {
            b[var2] = new Z();
         }

         var10000 = b[var2];
         var4 = var6;
         var3 = var10000;

         while((var5 = var4.get()) != 0) {
            if(var5 == 1) {
               var3.d = ((var4.get() & 255) << 16) + ((var4.get() & 255) << 8) + (var4.get() & 255);
            } else {
               System.out.println("Error unrecognised underlay code: ".concat(String.valueOf(var5)));
            }
         }

         b[var2].a();
      }

      short var8 = var6.getShort();
      System.out.println("Overlay Floors Loaded: ".concat(String.valueOf(var8)));
      a = new Z[var8];

      for(int var7 = 0; var7 < var8; ++var7) {
         if(a[var7] == null) {
            a[var7] = new Z();
         }

         var10000 = a[var7];
         var4 = var6;
         var3 = var10000;

         while((var5 = var4.get()) != 0) {
            if(var5 == 1) {
               var3.d = ((var4.get() & 255) << 16) + ((var4.get() & 255) << 8) + (var4.get() & 255);
            } else if(var5 == 2) {
               var3.c = var4.get() & 255;
            } else if(var5 == 5) {
               var3.e = false;
            } else if(var5 == 7) {
               var3.f = ((var4.get() & 255) << 16) + ((var4.get() & 255) << 8) + (var4.get() & 255);
            } else {
               System.out.println("Error unrecognised overlay code: ".concat(String.valueOf(var5)));
            }
         }

         a[var7].a();
      }

   }

   private void a() {
      if(this.f != -1) {
         this.a(this.f);
         this.j = this.g;
         this.k = this.h;
         this.l = this.i;
      }

      this.a(this.d);
   }

   private void a(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if(var8 != var10) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if(var6 == var10) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.g = (int)(var12 * 256.0D);
      this.h = (int)(var14 * 256.0D);
      this.i = (int)(var16 * 256.0D);
      if(this.h < 0) {
         this.h = 0;
      } else if(this.h > 255) {
         this.h = 255;
      }

      if(this.i < 0) {
         this.i = 0;
      } else if(this.i > 255) {
         this.i = 255;
      }

      if(var16 > 0.5D) {
         this.n = (int)((1.0D - var16) * var14 * 512.0D);
      } else {
         this.n = (int)(var16 * var14 * 512.0D);
      }

      if(this.n <= 0) {
         this.n = 1;
      }

      this.m = (int)(var12 * (double)this.n);
      this.o = a(this.g, this.h, this.i);
   }

   private static final int a(int var0, int var1, int var2) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 243) {
         var1 /= 2;
      }

      return (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
   }
}
