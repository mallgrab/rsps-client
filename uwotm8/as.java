package uwotm8;

import uwotm8.K;
import uwotm8.aq;
import uwotm8.ar;

final class as {

   private static final int[] c;
   private static final int[] d = new int['\u8000'];
   private static final int[] e;
   private static final int[] f;
   private static final int[] g;
   private static final int[] h;
   private static final int[] i;
   private static final int[] j;
   private aq k;
   private aq l;
   private aq m;
   private aq n;
   private aq o;
   private aq p;
   private aq q;
   private aq r;
   private int[] s = new int[5];
   private int[] t = new int[5];
   private int[] u = new int[5];
   private int v;
   private int w = 100;
   private ar x;
   private aq y;
   int a = 500;
   int b;


   static {
      int var0;
      for(var0 = 0; var0 < '\u8000'; ++var0) {
         if(Math.random() > 0.5D) {
            d[var0] = 1;
         } else {
            d[var0] = -1;
         }
      }

      e = new int['\u8000'];

      for(var0 = 0; var0 < '\u8000'; ++var0) {
         e[var0] = (int)(Math.sin((double)var0 / 5215.1903D) * 16384.0D);
      }

      c = new int[220500];
      f = new int[5];
      g = new int[5];
      h = new int[5];
      i = new int[5];
      j = new int[5];
   }

   public final int[] a(int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < var1; ++var3) {
         c[var3] = 0;
      }

      if(var2 < 10) {
         return c;
      } else {
         double var15 = (double)var1 / ((double)var2 + 0.0D);
         this.k.a();
         this.l.a();
         var2 = 0;
         int var5 = 0;
         int var6 = 0;
         if(this.m != null) {
            this.m.a();
            this.n.a();
            var2 = (int)((double)(this.m.b - this.m.a) * 32.768D / var15);
            var5 = (int)((double)this.m.a * 32.768D / var15);
         }

         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         if(this.o != null) {
            this.o.a();
            this.p.a();
            var7 = (int)((double)(this.o.b - this.o.a) * 32.768D / var15);
            var8 = (int)((double)this.o.a * 32.768D / var15);
         }

         int var10;
         for(var10 = 0; var10 < 5; ++var10) {
            if(this.s[var10] != 0) {
               f[var10] = 0;
               g[var10] = (int)((double)this.u[var10] * var15);
               h[var10] = (this.s[var10] << 14) / 100;
               i[var10] = (int)((double)(this.k.b - this.k.a) * 32.768D * Math.pow(1.0057929410678534D, (double)this.t[var10]) / var15);
               j[var10] = (int)((double)this.k.a * 32.768D / var15);
            }
         }

         int var11;
         int var12;
         int var13;
         int var14;
         for(var10 = 0; var10 < var1; ++var10) {
            var11 = this.k.a(var1);
            var12 = this.l.a(var1);
            if(this.m != null) {
               var13 = this.m.a(var1);
               var14 = this.n.a(var1);
               var11 += a(var14, var6, this.m.c) >> 1;
               var6 += (var13 * var2 >> 16) + var5;
            }

            if(this.o != null) {
               var13 = this.o.a(var1);
               var14 = this.p.a(var1);
               var12 = var12 * ((a(var14, var9, this.o.c) >> 1) + '\u8000') >> 15;
               var9 += (var13 * var7 >> 16) + var8;
            }

            for(var13 = 0; var13 < 5; ++var13) {
               if(this.s[var13] != 0 && (var14 = var10 + g[var13]) < var1) {
                  c[var14] += a(var12 * h[var13] >> 15, f[var13], this.k.c);
                  f[var13] += (var11 * i[var13] >> 16) + j[var13];
               }
            }
         }

         if(this.q != null) {
            this.q.a();
            this.r.a();
            var10 = 0;
            boolean var16 = true;

            for(var12 = 0; var12 < var1; ++var12) {
               var13 = this.q.a(var1);
               var14 = this.r.a(var1);
               if(var16) {
                  var2 = this.q.a + ((this.q.b - this.q.a) * var13 >> 8);
               } else {
                  var2 = this.q.a + ((this.q.b - this.q.a) * var14 >> 8);
               }

               var10 += 256;
               if(var10 >= var2) {
                  var10 = 0;
                  var16 = !var16;
               }

               if(var16) {
                  c[var12] = 0;
               }
            }
         }

         if(this.v > 0 && this.w > 0) {
            for(var11 = var10 = (int)((double)this.v * var15); var11 < var1; ++var11) {
               c[var11] += c[var11 - var10] * this.w / 100;
            }
         }

         if(this.x.a[0] > 0 || this.x.a[1] > 0) {
            this.y.a();
            var10 = this.y.a(var1 + 1);
            var11 = this.x.a(0, (float)var10 / 65536.0F);
            var12 = this.x.a(1, (float)var10 / 65536.0F);
            if(var1 >= var11 + var12) {
               var13 = 0;
               var14 = var12;
               if(var12 > var1 - var11) {
                  var14 = var1 - var11;
               }

               while(var13 < var14) {
                  var2 = (int)((long)c[var13 + var11] * (long)ar.c >> 16);

                  for(var3 = 0; var3 < var11; ++var3) {
                     var2 += (int)((long)c[var13 + var11 - 1 - var3] * (long)ar.b[0][var3] >> 16);
                  }

                  for(var3 = 0; var3 < var13; ++var3) {
                     var2 -= (int)((long)c[var13 - 1 - var3] * (long)ar.b[1][var3] >> 16);
                  }

                  c[var13] = var2;
                  var10 = this.y.a(var1 + 1);
                  ++var13;
               }

               var14 = 128;

               while(true) {
                  if(var14 > var1 - var11) {
                     var14 = var1 - var11;
                  }

                  while(var13 < var14) {
                     var3 = (int)((long)c[var13 + var11] * (long)ar.c >> 16);

                     for(var2 = 0; var2 < var11; ++var2) {
                        var3 += (int)((long)c[var13 + var11 - 1 - var2] * (long)ar.b[0][var2] >> 16);
                     }

                     for(var2 = 0; var2 < var12; ++var2) {
                        var3 -= (int)((long)c[var13 - 1 - var2] * (long)ar.b[1][var2] >> 16);
                     }

                     c[var13] = var3;
                     var10 = this.y.a(var1 + 1);
                     ++var13;
                  }

                  if(var13 >= var1 - var11) {
                     while(var13 < var1) {
                        var3 = 0;

                        for(var2 = var13 + var11 - var1; var2 < var11; ++var2) {
                           var3 += (int)((long)c[var13 + var11 - 1 - var2] * (long)ar.b[0][var2] >> 16);
                        }

                        for(var2 = 0; var2 < var12; ++var2) {
                           var3 -= (int)((long)c[var13 - 1 - var2] * (long)ar.b[1][var2] >> 16);
                        }

                        c[var13] = var3;
                        ++var13;
                     }
                     break;
                  }

                  var11 = this.x.a(0, (float)var10 / 65536.0F);
                  var12 = this.x.a(1, (float)var10 / 65536.0F);
                  var14 += 128;
               }
            }
         }

         for(var10 = 0; var10 < var1; ++var10) {
            if(c[var10] < -32768) {
               c[var10] = -32768;
            }

            if(c[var10] > 32767) {
               c[var10] = 32767;
            }
         }

         return c;
      }
   }

   private static int a(int var0, int var1, int var2) {
      return var2 == 1?((var1 & 32767) < 16384?var0:-var0):(var2 == 2?e[var1 & 32767] * var0 >> 14:(var2 == 3?((var1 & 32767) * var0 >> 14) - var0:(var2 == 4?d[var1 / 2607 & 32767] * var0:0)));
   }

   public final void a(K var1) {
      this.k = new aq();
      this.k.a(var1);
      this.l = new aq();
      this.l.a(var1);
      if(var1.f() != 0) {
         --var1.b;
         this.m = new aq();
         this.m.a(var1);
         this.n = new aq();
         this.n.a(var1);
      }

      if(var1.f() != 0) {
         --var1.b;
         this.o = new aq();
         this.o.a(var1);
         this.p = new aq();
         this.p.a(var1);
      }

      if(var1.f() != 0) {
         --var1.b;
         this.q = new aq();
         this.q.a(var1);
         this.r = new aq();
         this.r.a(var1);
      }

      int var3;
      for(int var2 = 0; var2 < 10 && (var3 = var1.r()) != 0; ++var2) {
         this.s[var2] = var3;
         this.t[var2] = var1.q();
         this.u[var2] = var1.r();
      }

      this.v = var1.r();
      this.w = var1.r();
      this.a = var1.h();
      this.b = var1.h();
      this.x = new ar();
      this.y = new aq();
      this.x.a(var1, this.y);
   }

}
