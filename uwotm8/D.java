package uwotm8;

import com.runescape.Client;
import uwotm8.C;
import uwotm8.F;
import uwotm8.am;
import uwotm8.d;
import uwotm8.j;

public final class D extends C {

   private int b;
   private final int[] c;
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final int h;
   private final int i;
   private d j;
   private int k;
   public static Client a;
   private int l;
   private final int m;
   private final int n;


   private j b() {
      int var1 = -1;
      if(this.d != -1) {
         try {
            am var2;
            int var3 = (var2 = am.a[this.d]).b;
            int var4 = var2.c;
            int var6 = var2.d;
            var6 = Client.ae[var6 - var4];
            var1 = a.B[var3] >> var4 & var6;
         } catch (Exception var5) {
            ;
         }
      } else if(this.e != -1) {
         var1 = a.B[this.e];
      }

      return var1 >= 0 && var1 < this.c.length && this.c[var1] != -1?j.a(this.c[var1]):null;
   }

   public final F a() {
      int var1 = -1;
      if(this.j != null) {
         int var2;
         if((var2 = Client.S - this.k) > 100 && this.j.e > 0) {
            var2 = 100;
         }

         while(var2 > this.j.a(this.b)) {
            var2 -= this.j.a(this.b);
            ++this.b;
            if(this.b >= this.j.b) {
               this.b -= this.j.e;
               if(this.b < 0 || this.b >= this.j.b) {
                  this.j = null;
                  break;
               }
            }
         }

         this.k = Client.S - var2;
         if(this.j != null) {
            var1 = this.j.c[this.b];
         }
      }

      j var3;
      if(this.c != null) {
         var3 = this.b();
      } else {
         var3 = j.a(this.l);
      }

      return var3 == null?null:var3.a(this.m, this.n, this.f, this.g, this.h, this.i, var1);
   }

   public D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.l = var1;
      this.m = var3;
      this.n = var2;
      this.f = var6;
      this.g = var4;
      this.h = var5;
      this.i = var7;
      if(var8 != -1) {
         this.j = d.a[var8];
         this.b = 0;
         this.k = Client.S;
         if(var9 && this.j.e != -1) {
            this.b = (int)(Math.random() * (double)this.j.b);
            this.k -= (int)(Math.random() * (double)this.j.a(this.b));
         }
      }

      j var10;
      if((var10 = j.a(this.l)) != null) {
         this.d = var10.w;
         this.e = var10.j;
         this.c = var10.o;
      } else {
         this.d = -1;
         this.e = -1;
         this.c = null;
      }
   }
}
