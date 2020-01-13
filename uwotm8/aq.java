package uwotm8;

import uwotm8.K;

public final class aq {

   private int d = 2;
   private int[] e = new int[2];
   private int[] f = new int[2];
   int a;
   int b;
   int c;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;


   aq() {
      this.e[0] = 0;
      this.e[1] = '\uffff';
      this.f[0] = 0;
      this.f[1] = '\uffff';
   }

   final void a(K var1) {
      this.c = var1.f();
      this.a = var1.k();
      this.b = var1.k();
      this.b(var1);
   }

   final void b(K var1) {
      this.d = var1.f();
      this.e = new int[this.d];
      this.f = new int[this.d];

      for(int var2 = 0; var2 < this.d; ++var2) {
         this.e[var2] = var1.h();
         this.f[var2] = var1.h();
      }

   }

   final void a() {
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.k = 0;
      this.j = 0;
   }

   final int a(int var1) {
      if(this.j >= this.g) {
         this.k = this.f[this.h++] << 15;
         if(this.h >= this.d) {
            this.h = this.d - 1;
         }

         this.g = (int)((double)this.e[this.h] / 65536.0D * (double)var1);
         if(this.g > this.j) {
            this.i = ((this.f[this.h] << 15) - this.k) / (this.g - this.j);
         }
      }

      this.k += this.i;
      ++this.j;
      return this.k - this.i >> 15;
   }
}
