package uwotm8;

import com.runescape.Client;
import uwotm8.C;
import uwotm8.F;
import uwotm8.H;
import uwotm8.O;
import uwotm8.S;
import uwotm8.T;
import uwotm8.V;
import uwotm8.W;
import uwotm8.X;
import uwotm8.aa;
import uwotm8.ac;
import uwotm8.ad;
import uwotm8.u;
import uwotm8.x;

public final class Y {

   private boolean d = true;
   public static boolean a = true;
   private final int e = 4;
   private final int f = 104;
   private final int g = 104;
   private final int[][][] h;
   private final S[][][] i = new S[4][104][104];
   private int j;
   private int k;
   private final x[] l = new x[5000];
   private final int[][][] m = new int[4][105][105];
   private static int n;
   private static int o;
   private static int p;
   private static int q;
   private static int r;
   private static int s;
   private static int t;
   private static int u;
   private static int v;
   private static int w;
   private static int x;
   private static int y;
   private static int z;
   private static int A;
   private static int B;
   private static int C;
   private static x[] D = new x[100];
   private static final int[] E = new int[]{53, -53, -53, 53};
   private static final int[] F = new int[]{-53, -53, 53, 53};
   private static final int[] G = new int[]{-45, 45, 45, -45};
   private static final int[] H = new int[]{45, 45, -45, -45};
   private static boolean I;
   private static int J;
   private static int K;
   public static int b = -1;
   public static int c = -1;
   private static int[] L = new int[4];
   private static V[][] M = new V[4][500];
   private static int N;
   private static final V[] O = new V[500];
   private static O P = new O();
   private static final int[] Q = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   private static final int[] R = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   private static final int[] S = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   private static final int[] T = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   private static final int[] U = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   private static final int[] V = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   private static final int[] W = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   private static final int[] X = new int[]{41, '\u9950', 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, '\ua84e', 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41};
   private final int[] Y = new int[10000];
   private final int[] Z = new int[10000];
   private int aa;
   private final int[][] ab = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   private final int[][] ac = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   private static boolean[][][][] ad = new boolean[8][32][51][51];
   private static boolean[][] ae;
   private static int af;
   private static int ag;
   private static int ah;
   private static int ai;


   public Y(int[][][] var1) {
      this.h = var1;
      this.b();
   }

   public static void a() {
      D = null;
      L = null;
      M = null;
      P = null;
      ad = null;
      ae = null;
   }

   public final void b() {
      int var1;
      int var2;
      for(var1 = 0; var1 < 4; ++var1) {
         for(var2 = 0; var2 < 104; ++var2) {
            for(int var3 = 0; var3 < 104; ++var3) {
               this.i[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < 4; ++var1) {
         for(var2 = 0; var2 < L[var1]; ++var2) {
            M[var1][var2] = null;
         }

         L[var1] = 0;
      }

      for(var1 = 0; var1 < this.k; ++var1) {
         this.l[var1] = null;
      }

      this.k = 0;

      for(var1 = 0; var1 < D.length; ++var1) {
         D[var1] = null;
      }

   }

   public final void c() {
      this.j = 0;

      for(int var1 = 0; var1 < 104; ++var1) {
         for(int var2 = 0; var2 < 104; ++var2) {
            if(this.i[0][var1][var2] == null) {
               this.i[0][var1][var2] = new S(0, var1, var2);
            }
         }
      }

   }

   public final void a(int var1, int var2) {
      S var3 = this.i[0][var2][var1];

      for(int var4 = 0; var4 < 3; ++var4) {
         S var5;
         if((var5 = this.i[var4][var2][var1] = this.i[var4 + 1][var2][var1]) != null) {
            --var5.a;

            for(int var6 = 0; var6 < var5.k; ++var6) {
               x var7;
               if(((var7 = var5.l[var6]).m >> 29 & 3) == 2 && var7.g == var2 && var7.i == var1) {
                  --var7.a;
               }
            }
         }
      }

      if(this.i[0][var2][var1] == null) {
         this.i[0][var2][var1] = new S(0, var2, var1);
      }

      this.i[0][var2][var1].w = var3;
      this.i[3][var2][var1] = null;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      V var8;
      (var8 = new V()).a = var1 / 128;
      var8.b = var3 / 128;
      var8.c = var6 / 128;
      var8.d = var4 / 128;
      var8.e = var7;
      var8.f = var1;
      var8.g = var3;
      var8.h = var6;
      var8.i = var4;
      var8.j = var5;
      var8.k = var2;
      M[var0][L[var0]++] = var8;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      if(this.i[var1][var2][var3] != null) {
         this.i[var1][var2][var3].o = var4;
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      X var21;
      if(var4 == 0) {
         var21 = new X(var11, var12, var13, var14, -1, var19, false);

         for(var5 = var1; var5 >= 0; --var5) {
            if(this.i[var5][var2][var3] == null) {
               this.i[var5][var2][var3] = new S(var5, var2, var3);
            }
         }

         this.i[var1][var2][var3].e = var21;
      } else if(var4 != 1) {
         W var22 = new W(var3, var15, var14, var9, var6, var17, var5, var11, var19, var13, var10, var8, var7, var4, var18, var16, var12, var2, var20);

         for(var5 = var1; var5 >= 0; --var5) {
            if(this.i[var5][var2][var3] == null) {
               this.i[var5][var2][var3] = new S(var5, var2, var3);
            }
         }

         this.i[var1][var2][var3].f = var22;
      } else {
         var21 = new X(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var5 = var1; var5 >= 0; --var5) {
            if(this.i[var5][var2][var3] == null) {
               this.i[var5][var2][var3] = new S(var5, var2, var3);
            }
         }

         this.i[var1][var2][var3].e = var21;
      }
   }

   public final void a(int var1, int var2, int var3, C var4, byte var5, int var6, int var7) {
      if(var4 != null) {
         aa var8;
         (var8 = new aa()).d = var4;
         var8.b = (var7 << 7) + 64;
         var8.c = (var3 << 7) + 64;
         var8.a = var2;
         var8.e = var6;
         var8.f = var5;
         if(this.i[var1][var7][var3] == null) {
            this.i[var1][var7][var3] = new S(var1, var7, var3);
         }

         this.i[var1][var7][var3].i = var8;
      }
   }

   public final void a(int var1, int var2, C var3, int var4, C var5, C var6, int var7, int var8) {
      T var9;
      (var9 = new T()).d = var6;
      var9.b = (var1 << 7) + 64;
      var9.c = (var8 << 7) + 64;
      var9.a = var4;
      var9.g = var2;
      var9.e = var3;
      var9.f = var5;
      var2 = 0;
      S var10;
      if((var10 = this.i[var7][var1][var8]) != null) {
         for(var4 = 0; var4 < var10.k; ++var4) {
            int var11;
            if(var10.l[var4].e instanceof F && (var11 = ((F)var10.l[var4].e).t) > var2) {
               var2 = var11;
            }
         }
      }

      var9.h = var2;
      if(this.i[var7][var1][var8] == null) {
         this.i[var7][var1][var8] = new S(var7, var1, var8);
      }

      this.i[var7][var1][var8].j = var9;
   }

   public final void a(int var1, C var2, int var3, int var4, byte var5, int var6, C var7, int var8, int var9, int var10) {
      if(var2 != null || var7 != null) {
         ac var11;
         (var11 = new ac()).h = var3;
         var11.i = var5;
         var11.b = (var6 << 7) + 64;
         var11.c = (var4 << 7) + 64;
         var11.a = var8;
         var11.f = var2;
         var11.g = var7;
         var11.d = var1;
         var11.e = var9;

         for(var1 = var10; var1 >= 0; --var1) {
            if(this.i[var1][var6][var4] == null) {
               this.i[var1][var6][var4] = new S(var1, var6, var4);
            }
         }

         this.i[var10][var6][var4].g = var11;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, C var7, int var8, byte var9, int var10, int var11) {
      if(var7 != null) {
         ad var12;
         (var12 = new ad()).g = var1;
         var12.h = var9;
         var12.b = (var8 << 7) + 64 + var5;
         var12.c = (var2 << 7) + 64 + var10;
         var12.a = var6;
         var12.f = var7;
         var12.d = var11;
         var12.e = var3;

         for(var1 = var4; var1 >= 0; --var1) {
            if(this.i[var1][var8][var2] == null) {
               this.i[var1][var8][var2] = new S(var1, var8, var2);
            }
         }

         this.i[var4][var8][var2].h = var12;
      }
   }

   public final boolean a(int var1, byte var2, int var3, int var4, C var5, int var6, int var7, int var8, int var9, int var10) {
      if(var5 == null) {
         return true;
      } else {
         int var11 = (var10 << 7) + (var6 << 6);
         int var12 = (var9 << 7) + (var4 << 6);
         return this.a(var7, var10, var9, var6, var4, var11, var12, var3, var5, var8, false, var1, var2);
      }
   }

   public final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, C var8, boolean var9) {
      if(var8 == null) {
         return true;
      } else {
         int var10 = var7 - var6;
         int var11 = var5 - var6;
         int var12 = var7 + var6;
         var6 += var5;
         if(var9) {
            if(var2 > 640 && var2 < 1408) {
               var6 += 128;
            }

            if(var2 > 1152 && var2 < 1920) {
               var12 += 128;
            }

            if(var2 > 1664 || var2 < 384) {
               var11 -= 128;
            }

            if(var2 > 128 && var2 < 896) {
               var10 -= 128;
            }
         }

         var10 /= 128;
         var11 /= 128;
         var12 /= 128;
         var6 /= 128;
         return this.a(var1, var10, var11, var12 - var10 + 1, var6 - var11 + 1, var7, var5, var3, var8, var2, true, var4, (byte)0);
      }
   }

   public final boolean a(int var1, int var2, C var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return var3 == null?true:this.a(var1, var8, var11, var9 - var8 + 1, var5 - var11 + 1, var6, var2, var7, var3, var4, true, var10, (byte)0);
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, C var9, int var10, boolean var11, int var12, byte var13) {
      int var15;
      for(int var14 = var2; var14 < var2 + var4; ++var14) {
         for(var15 = var3; var15 < var3 + var5; ++var15) {
            if(var14 < 0 || var15 < 0 || var14 >= 104 || var15 >= 104) {
               return false;
            }

            S var16;
            if((var16 = this.i[var1][var14][var15]) != null && var16.k >= 5) {
               return false;
            }
         }
      }

      x var18;
      (var18 = new x()).m = var12;
      var18.n = var13;
      var18.a = var1;
      var18.c = var6;
      var18.d = var7;
      var18.b = var8;
      var18.e = var9;
      var18.f = var10;
      var18.g = var2;
      var18.i = var3;
      var18.h = var2 + var4 - 1;
      var18.j = var3 + var5 - 1;

      for(var15 = var2; var15 < var2 + var4; ++var15) {
         for(int var19 = var3; var19 < var3 + var5; ++var19) {
            var6 = 0;
            if(var15 > var2) {
               ++var6;
            }

            if(var15 < var2 + var4 - 1) {
               var6 += 4;
            }

            if(var19 > var3) {
               var6 += 8;
            }

            if(var19 < var3 + var5 - 1) {
               var6 += 2;
            }

            for(var7 = var1; var7 >= 0; --var7) {
               if(this.i[var7][var15][var19] == null) {
                  this.i[var7][var15][var19] = new S(var7, var15, var19);
               }
            }

            S var17;
            (var17 = this.i[var1][var15][var19]).l[var17.k] = var18;
            var17.m[var17.k] = var6;
            var17.n |= var6;
            ++var17.k;
         }
      }

      if(var11) {
         this.l[this.k++] = var18;
      }

      return true;
   }

   public final void d() {
      for(int var1 = 0; var1 < this.k; ++var1) {
         x var2 = this.l[var1];
         this.a(var2);
         this.l[var1] = null;
      }

      this.k = 0;
   }

   private void a(x var1) {
      for(int var2 = var1.g; var2 <= var1.h; ++var2) {
         for(int var3 = var1.i; var3 <= var1.j; ++var3) {
            S var4;
            if((var4 = this.i[var1.a][var2][var3]) != null) {
               int var5;
               for(var5 = 0; var5 < var4.k; ++var5) {
                  if(var4.l[var5] == var1) {
                     --var4.k;

                     while(var5 < var4.k) {
                        var4.l[var5] = var4.l[var5 + 1];
                        var4.m[var5] = var4.m[var5 + 1];
                        ++var5;
                     }

                     var4.l[var4.k] = null;
                     break;
                  }
               }

               var4.n = 0;

               for(var5 = 0; var5 < var4.k; ++var5) {
                  var4.n |= var4.m[var5];
               }
            }
         }
      }

   }

   public final void b(int var1, int var2, int var3, int var4) {
      S var5;
      if((var5 = this.i[var4][var3][var1]) != null) {
         ad var6;
         if((var6 = var5.h) != null) {
            var3 = (var3 << 7) + 64;
            var1 = (var1 << 7) + 64;
            var6.b = var3 + (var6.b - var3) * var2 / 16;
            var6.c = var1 + (var6.c - var1) * var2 / 16;
         }

      }
   }

   public final void a(int var1, int var2, int var3) {
      S var4;
      if((var4 = this.i[var2][var1][var3]) != null) {
         var4.g = null;
      }

   }

   public final void b(int var1, int var2, int var3) {
      S var4;
      if((var4 = this.i[var2][var3][var1]) != null) {
         var4.h = null;
      }

   }

   public final void c(int var1, int var2, int var3) {
      S var6;
      if((var6 = this.i[var1][var2][var3]) != null) {
         for(int var4 = 0; var4 < var6.k; ++var4) {
            x var5;
            if(((var5 = var6.l[var4]).m >> 29 & 3) == 2 && var5.g == var2 && var5.i == var3) {
               this.a(var5);
               return;
            }
         }

      }
   }

   public final void d(int var1, int var2, int var3) {
      S var4;
      if((var4 = this.i[var1][var3][var2]) != null) {
         var4.i = null;
      }
   }

   public final void e(int var1, int var2, int var3) {
      S var4;
      if((var4 = this.i[var1][var2][var3]) != null) {
         var4.j = null;
      }

   }

   public final ac f(int var1, int var2, int var3) {
      S var4;
      return (var4 = this.i[var1][var2][var3]) == null?null:var4.g;
   }

   public final ad g(int var1, int var2, int var3) {
      S var4;
      return (var4 = this.i[var3][var1][var2]) == null?null:var4.h;
   }

   public final x h(int var1, int var2, int var3) {
      S var6;
      if((var6 = this.i[var3][var1][var2]) == null) {
         return null;
      } else {
         for(int var4 = 0; var4 < var6.k; ++var4) {
            x var5;
            if(((var5 = var6.l[var4]).m >> 29 & 3) == 2 && var5.g == var1 && var5.i == var2) {
               return var5;
            }
         }

         return null;
      }
   }

   public final aa i(int var1, int var2, int var3) {
      S var4;
      return (var4 = this.i[var3][var2][var1]) != null && var4.i != null?var4.i:null;
   }

   public final int j(int var1, int var2, int var3) {
      S var4;
      return (var4 = this.i[var1][var2][var3]) != null && var4.g != null?var4.g.h:0;
   }

   public final int k(int var1, int var2, int var3) {
      S var4;
      return (var4 = this.i[var1][var2][var3]) != null && var4.h != null?var4.h.g:0;
   }

   public final int l(int var1, int var2, int var3) {
      S var6;
      if((var6 = this.i[var1][var2][var3]) == null) {
         return 0;
      } else {
         for(int var4 = 0; var4 < var6.k; ++var4) {
            x var5;
            if(((var5 = var6.l[var4]).m >> 29 & 3) == 2 && var5.g == var2 && var5.i == var3) {
               return var5.m;
            }
         }

         return 0;
      }
   }

   public final int m(int var1, int var2, int var3) {
      S var4;
      return (var4 = this.i[var1][var2][var3]) != null && var4.i != null?var4.i.e:0;
   }

   public final int c(int var1, int var2, int var3, int var4) {
      S var5;
      if((var5 = this.i[var1][var2][var3]) == null) {
         return -1;
      } else if(var5.g != null && var5.g.h == var4) {
         return var5.g.i & 255;
      } else if(var5.h != null && var5.h.g == var4) {
         return var5.h.h & 255;
      } else if(var5.i != null && var5.i.e == var4) {
         return var5.i.f & 255;
      } else {
         for(var2 = 0; var2 < var5.k; ++var2) {
            if(var5.l[var2].m == var4) {
               return var5.l[var2].n & 255;
            }
         }

         return -1;
      }
   }

   public final void e() {
      int var1 = (int)Math.sqrt(5100.0D) * 768 >> 8;

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 104; ++var3) {
            for(int var4 = 0; var4 < 104; ++var4) {
               S var5;
               if((var5 = this.i[var2][var3][var4]) != null) {
                  ac var6 = var5.g;
                  if(var5.g != null && var6.f != null && var6.f.aC != null) {
                     this.a(var2, 1, 1, var3, var4, (F)var6.f);
                     if(var6.g != null && var6.g.aC != null) {
                        this.a(var2, 1, 1, var3, var4, (F)var6.g);
                        this.a((F)var6.f, (F)var6.g, 0, 0, 0, false);
                        ((F)var6.g).a(80, var1, -50, -10, -50);
                     }

                     ((F)var6.f).a(80, var1, -50, -10, -50);
                  }

                  for(int var12 = 0; var12 < var5.k; ++var12) {
                     x var7;
                     if((var7 = var5.l[var12]) != null && var7.e != null && var7.e.aC != null) {
                        this.a(var2, var7.h - var7.g + 1, var7.j - var7.i + 1, var3, var4, (F)var7.e);
                        ((F)var7.e).a(80, var1, -50, -10, -50);
                     }
                  }

                  aa var13 = var5.i;
                  if(var5.i != null && var13.d.aC != null) {
                     F var9 = (F)var13.d;
                     S var11;
                     if(var3 < 104 && (var11 = this.i[var2][var3 + 1][var4]) != null && var11.i != null && var11.i.d.aC != null) {
                        this.a(var9, (F)var11.i.d, 128, 0, 0, true);
                     }

                     if(var4 < 104 && (var11 = this.i[var2][var3][var4 + 1]) != null && var11.i != null && var11.i.d.aC != null) {
                        this.a(var9, (F)var11.i.d, 0, 0, 128, true);
                     }

                     if(var3 < 104 && var4 < 104 && (var11 = this.i[var2][var3 + 1][var4 + 1]) != null && var11.i != null && var11.i.d.aC != null) {
                        this.a(var9, (F)var11.i.d, 128, 0, 128, true);
                     }

                     if(var3 < 104 && var4 > 0 && (var11 = this.i[var2][var3 + 1][var4 - 1]) != null && var11.i != null && var11.i.d.aC != null) {
                        this.a(var9, (F)var11.i.d, 128, 0, -128, true);
                     }

                     ((F)var13.d).a(80, var1, -50, -10, -50);
                  }
               }
            }
         }
      }

   }

   private void a(int var1, int var2, int var3, int var4, int var5, F var6) {
      boolean var7 = true;
      int var8 = var4;
      int var9 = var4 + var2;
      int var10 = var5 - 1;
      int var11 = var5 + var3;

      for(int var12 = var1; var12 <= var1 + 1; ++var12) {
         if(var12 != 4) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < 104) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     S var15;
                     if(var14 >= 0 && var14 < 104 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var5 && var13 != var4) && (var15 = this.i[var12][var13][var14]) != null) {
                        int var16 = (this.h[var12][var13][var14] + this.h[var12][var13 + 1][var14] + this.h[var12][var13][var14 + 1] + this.h[var12][var13 + 1][var14 + 1]) / 4 - (this.h[var1][var4][var5] + this.h[var1][var4 + 1][var5] + this.h[var1][var4][var5 + 1] + this.h[var1][var4 + 1][var5 + 1]) / 4;
                        ac var17 = var15.g;
                        if(var15.g != null && var17.f != null && var17.f.aC != null) {
                           this.a(var6, (F)var17.f, (var13 - var4 << 7) + (1 - var2 << 6), var16, (var14 - var5 << 7) + (1 - var3 << 6), var7);
                        }

                        if(var17 != null && var17.g != null && var17.g.aC != null) {
                           this.a(var6, (F)var17.g, (var13 - var4 << 7) + (1 - var2 << 6), var16, (var14 - var5 << 7) + (1 - var3 << 6), var7);
                        }

                        for(int var21 = 0; var21 < var15.k; ++var21) {
                           x var18;
                           if((var18 = var15.l[var21]) != null && var18.e != null && var18.e.aC != null) {
                              int var19 = var18.h - var18.g + 1;
                              int var20 = var18.j - var18.i + 1;
                              this.a(var6, (F)var18.e, (var18.g - var4 << 7) + (var19 - var2 << 6), var16, (var18.i - var5 << 7) + (var20 - var3 << 6), var7);
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   private void a(F var1, F var2, int var3, int var4, int var5, boolean var6) {
      ++this.aa;
      int var7 = 0;
      int[] var8 = var2.c;
      int var9 = var2.b;

      int var10;
      for(var10 = 0; var10 < var1.b; ++var10) {
         H var11 = var1.aC[var10];
         H var12;
         int var13;
         int var14;
         int var15;
         if((var12 = var1.x[var10]).d != 0 && (var13 = var1.d[var10] - var4) <= var2.q && (var14 = var1.c[var10] - var3) >= var2.l && var14 <= var2.m && (var15 = var1.e[var10] - var5) >= var2.o && var15 <= var2.n) {
            for(int var16 = 0; var16 < var9; ++var16) {
               H var17 = var2.aC[var16];
               H var18 = var2.x[var16];
               if(var14 == var8[var16] && var15 == var2.e[var16] && var13 == var2.d[var16] && var18.d != 0) {
                  var11.a += var18.a;
                  var11.b += var18.b;
                  var11.c += var18.c;
                  var11.d += var18.d;
                  var17.a += var12.a;
                  var17.b += var12.b;
                  var17.c += var12.c;
                  var17.d += var12.d;
                  ++var7;
                  this.Y[var10] = this.aa;
                  this.Z[var16] = this.aa;
               }
            }
         }
      }

      if(var7 >= 3 && var6) {
         for(var10 = 0; var10 < var1.f; ++var10) {
            if(this.Y[var1.g[var10]] == this.aa && this.Y[var1.h[var10]] == this.aa && this.Y[var1.i[var10]] == this.aa) {
               var1.j[var10] = -1;
            }
         }

         for(var10 = 0; var10 < var2.f; ++var10) {
            if(this.Z[var2.g[var10]] == this.aa && this.Z[var2.h[var10]] == this.aa && this.Z[var2.i[var10]] == this.aa) {
               var2.j[var10] = -1;
            }
         }

      }
   }

   public final void a(int[] var1, int var2, int var3, int var4, int var5) {
      S var9;
      if((var9 = this.i[var3][var4][var5]) != null) {
         X var11 = var9.e;
         if(var9.e == null) {
            W var10;
            if((var10 = var9.f) != null) {
               var4 = var10.l;
               var5 = var10.m;
               int var6 = var10.n;
               var3 = var10.o;
               int[] var12 = this.ab[var4];
               int[] var13 = this.ac[var5];
               int var7 = 0;
               int var8;
               if(var6 != 0) {
                  for(var8 = 0; var8 < 4; ++var8) {
                     var1[var2] = var12[var13[var7++]] != 0?var3:var6;
                     var1[var2 + 1] = var12[var13[var7++]] != 0?var3:var6;
                     var1[var2 + 2] = var12[var13[var7++]] != 0?var3:var6;
                     var1[var2 + 3] = var12[var13[var7++]] != 0?var3:var6;
                     var2 += 512;
                  }

               } else {
                  for(var8 = 0; var8 < 4; ++var8) {
                     if(var12[var13[var7++]] != 0) {
                        var1[var2] = var3;
                     }

                     if(var12[var13[var7++]] != 0) {
                        var1[var2 + 1] = var3;
                     }

                     if(var12[var13[var7++]] != 0) {
                        var1[var2 + 2] = var3;
                     }

                     if(var12[var13[var7++]] != 0) {
                        var1[var2 + 3] = var3;
                     }

                     var2 += 512;
                  }

               }
            }
         } else {
            var3 = var11.g;
            if(var11.g != 0) {
               for(var4 = 0; var4 < 4; ++var4) {
                  var1[var2] = var3;
                  var1[var2 + 1] = var3;
                  var1[var2 + 2] = var3;
                  var1[var2 + 3] = var3;
                  var2 += 512;
               }

            }
         }
      }
   }

   public static void a(int var0, int var1, int[] var2) {
      ah = var0;
      ai = var1;
      af = var0 / 2;
      ag = var1 / 2;
      boolean[][][][] var3 = new boolean[9][32][53][53];

      int var4;
      int var5;
      int var7;
      int var8;
      for(var4 = 128; var4 <= 384; var4 += 32) {
         for(var0 = 0; var0 < 2048; var0 += 64) {
            z = F.D[var4];
            A = F.E[var4];
            B = F.D[var0];
            C = F.E[var0];
            var1 = (var4 - 128) / 32;
            var5 = var0 / 64;

            for(int var6 = -26; var6 <= 26; ++var6) {
               for(var7 = -26; var7 <= 26; ++var7) {
                  var8 = var6 << 7;
                  int var9 = var7 << 7;
                  boolean var10 = false;

                  for(int var11 = -500; var11 <= 800; var11 += 128) {
                     int var12 = var2[var1] + var11;
                     int var15 = var9 * B + var8 * C >> 16;
                     int var13 = var9 * C - var8 * B >> 16;
                     int var14 = var12 * z + var13 * A >> 16;
                     var12 = var12 * A - var13 * z >> 16;
                     boolean var10000;
                     if(var14 >= 50 && var14 <= 3500) {
                        var13 = af + (var15 << Client.l) / var14;
                        var12 = ag + (var12 << Client.l) / var14;
                        var10000 = var13 >= 0 && var13 <= ah && var12 >= 0 && var12 <= ai;
                     } else {
                        var10000 = false;
                     }

                     if(var10000) {
                        var10 = true;
                        break;
                     }
                  }

                  var3[var1][var5][var6 + 25 + 1][var7 + 25 + 1] = var10;
               }
            }
         }
      }

      for(var4 = 0; var4 < 8; ++var4) {
         for(var0 = 0; var0 < 32; ++var0) {
            for(var1 = -25; var1 < 25; ++var1) {
               for(var5 = -25; var5 < 25; ++var5) {
                  boolean var16 = false;

                  label82:
                  for(var7 = -1; var7 <= 1; ++var7) {
                     for(var8 = -1; var8 <= 1; ++var8) {
                        if(var3[var4][var0][var1 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var16 = true;
                           break label82;
                        }

                        if(var3[var4][(var0 + 1) % 31][var1 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var16 = true;
                           break label82;
                        }

                        if(var3[var4 + 1][var0][var1 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var16 = true;
                           break label82;
                        }

                        if(var3[var4 + 1][(var0 + 1) % 31][var1 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var16 = true;
                           break label82;
                        }
                     }
                  }

                  ad[var4][var0][var1 + 25][var5 + 25] = var16;
               }
            }
         }
      }

   }

   public static void b(int var0, int var1) {
      I = true;
      J = var1;
      K = var0;
      b = -1;
      c = -1;
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= 13312) {
         var1 = 13311;
      }

      if(var2 < 0) {
         var2 = 0;
      } else if(var2 >= 13312) {
         var2 = 13311;
      }

      ++p;
      z = F.D[var6];
      A = F.E[var6];
      B = F.D[var3];
      C = F.E[var3];
      ae = ad[(var6 - 128) / 32][var3 / 64];
      w = var1;
      x = var4;
      y = var2;
      u = var1 / 128;
      v = var2 / 128;
      o = var5;
      if((q = u - 25) < 0) {
         q = 0;
      }

      if((s = v - 25) < 0) {
         s = 0;
      }

      if((r = u + 25) > 104) {
         r = 104;
      }

      if((t = v + 25) > 104) {
         t = 104;
      }

      var1 = L[o];
      V[] var14 = M[o];
      N = 0;

      int var7;
      int var8;
      for(var3 = 0; var3 < var1; ++var3) {
         int var9;
         boolean var10;
         int var11;
         V var16;
         if((var16 = var14[var3]).e == 1) {
            if((var7 = var16.a - u + 25) >= 0 && var7 <= 50) {
               if((var8 = var16.c - v + 25) < 0) {
                  var8 = 0;
               }

               if((var9 = var16.d - v + 25) > 50) {
                  var9 = 50;
               }

               var10 = false;

               while(var8 <= var9) {
                  if(ae[var7][var8++]) {
                     var10 = true;
                     break;
                  }
               }

               if(var10) {
                  if((var11 = w - var16.f) > 32) {
                     var16.l = 1;
                  } else {
                     if(var11 >= -32) {
                        continue;
                     }

                     var16.l = 2;
                     var11 = -var11;
                  }

                  var16.o = (var16.h - y << 8) / var11;
                  var16.p = (var16.i - y << 8) / var11;
                  var16.q = (var16.j - x << 8) / var11;
                  var16.r = (var16.k - x << 8) / var11;
                  O[N++] = var16;
               }
            }
         } else if(var16.e == 2) {
            if((var7 = var16.c - v + 25) >= 0 && var7 <= 50) {
               if((var8 = var16.a - u + 25) < 0) {
                  var8 = 0;
               }

               if((var9 = var16.b - u + 25) > 50) {
                  var9 = 50;
               }

               var10 = false;

               while(var8 <= var9) {
                  if(ae[var8++][var7]) {
                     var10 = true;
                     break;
                  }
               }

               if(var10) {
                  if((var11 = y - var16.h) > 32) {
                     var16.l = 3;
                  } else {
                     if(var11 >= -32) {
                        continue;
                     }

                     var16.l = 4;
                     var11 = -var11;
                  }

                  var16.m = (var16.f - w << 8) / var11;
                  var16.n = (var16.g - w << 8) / var11;
                  var16.q = (var16.j - x << 8) / var11;
                  var16.r = (var16.k - x << 8) / var11;
                  O[N++] = var16;
               }
            }
         } else if(var16.e == 4 && (var7 = var16.j - x) > 128) {
            if((var8 = var16.c - v + 25) < 0) {
               var8 = 0;
            }

            if((var9 = var16.d - v + 25) > 50) {
               var9 = 50;
            }

            if(var8 <= var9) {
               int var18;
               if((var18 = var16.a - u + 25) < 0) {
                  var18 = 0;
               }

               if((var11 = var16.b - u + 25) > 50) {
                  var11 = 50;
               }

               boolean var12;
               label318:
               for(var12 = false; var18 <= var11; ++var18) {
                  for(int var13 = var8; var13 <= var9; ++var13) {
                     if(ae[var18][var13]) {
                        var12 = true;
                        break label318;
                     }
                  }
               }

               if(var12) {
                  var16.l = 5;
                  var16.m = (var16.f - w << 8) / var7;
                  var16.n = (var16.g - w << 8) / var7;
                  var16.o = (var16.h - y << 8) / var7;
                  var16.p = (var16.i - y << 8) / var7;
                  O[N++] = var16;
               }
            }
         }
      }

      n = 0;

      S[][] var15;
      for(var1 = 0; var1 < 4; ++var1) {
         var15 = this.i[var1];

         for(var3 = q; var3 < r; ++var3) {
            for(var6 = s; var6 < t; ++var6) {
               S var17;
               if((var17 = var15[var3][var6]) != null) {
                  if(var17.o <= var5 && (ae[var3 - u + 25][var6 - v + 25] || this.h[var1][var3][var6] - var4 >= 2000)) {
                     var17.p = true;
                     var17.q = true;
                     var17.r = var17.k > 0;
                     ++n;
                  } else {
                     var17.p = false;
                     var17.q = false;
                     var17.s = 0;
                  }
               }
            }
         }
      }

      S var19;
      for(var1 = 0; var1 < 4; ++var1) {
         var15 = this.i[var1];

         for(var3 = -25; var3 <= 0; ++var3) {
            var6 = u + var3;
            var7 = u - var3;
            if(var6 >= q || var7 < r) {
               for(var4 = -25; var4 <= 0; ++var4) {
                  var5 = v + var4;
                  var8 = v - var4;
                  if(var6 >= q) {
                     if(var5 >= s && (var19 = var15[var6][var5]) != null && var19.p) {
                        this.a(var19, true);
                     }

                     if(var8 < t && (var19 = var15[var6][var8]) != null && var19.p) {
                        this.a(var19, true);
                     }
                  }

                  if(var7 < r) {
                     if(var5 >= s && (var19 = var15[var7][var5]) != null && var19.p) {
                        this.a(var19, true);
                     }

                     if(var8 < t && (var19 = var15[var7][var8]) != null && var19.p) {
                        this.a(var19, true);
                     }
                  }

                  if(n == 0) {
                     I = false;
                     return;
                  }
               }
            }
         }
      }

      for(var1 = 0; var1 < 4; ++var1) {
         var15 = this.i[var1];

         for(var3 = -25; var3 <= 0; ++var3) {
            var6 = u + var3;
            var7 = u - var3;
            if(var6 >= q || var7 < r) {
               for(var4 = -25; var4 <= 0; ++var4) {
                  var5 = v + var4;
                  var8 = v - var4;
                  if(var6 >= q) {
                     if(var5 >= s && (var19 = var15[var6][var5]) != null && var19.p) {
                        this.a(var19, false);
                     }

                     if(var8 < t && (var19 = var15[var6][var8]) != null && var19.p) {
                        this.a(var19, false);
                     }
                  }

                  if(var7 < r) {
                     if(var5 >= s && (var19 = var15[var7][var5]) != null && var19.p) {
                        this.a(var19, false);
                     }

                     if(var8 < t && (var19 = var15[var7][var8]) != null && var19.p) {
                        this.a(var19, false);
                     }
                  }

                  if(n == 0) {
                     I = false;
                     return;
                  }
               }
            }
         }
      }

      I = false;
   }

   private void a(S var1, boolean var2) {
      P.a(var1);

      while((var1 = (S)P.a()) != null) {
         if(var1.q) {
            int var3 = var1.b;
            int var4 = var1.c;
            int var5 = var1.a;
            int var6 = var1.d;
            S[][] var7 = this.i[var5];
            S var8;
            ac var9;
            int var10;
            x var11;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var19;
            boolean var20;
            int var22;
            S var29;
            if(var1.p) {
               if(var2) {
                  if(var5 > 0 && (var8 = this.i[var5 - 1][var3][var4]) != null && var8.q || var3 <= u && var3 > q && (var8 = var7[var3 - 1][var4]) != null && var8.q && (var8.p || (var1.n & 1) == 0) || var3 >= u && var3 < r - 1 && (var8 = var7[var3 + 1][var4]) != null && var8.q && (var8.p || (var1.n & 4) == 0) || var4 <= v && var4 > s && (var8 = var7[var3][var4 - 1]) != null && var8.q && (var8.p || (var1.n & 8) == 0) || var4 >= v && var4 < t - 1 && (var8 = var7[var3][var4 + 1]) != null && var8.q && (var8.p || (var1.n & 2) == 0)) {
                     continue;
                  }
               } else {
                  var2 = true;
               }

               var1.p = false;
               if(var1.w != null) {
                  var8 = var1.w;
                  if(var1.w.e != null) {
                     if(!this.n(0, var3, var4)) {
                        this.a(var8.e, 0, z, A, B, C, var3, var4);
                     }
                  } else if(var8.f != null && !this.n(0, var3, var4)) {
                     a(var3, z, B, var8.f, A, var4, C);
                  }

                  var9 = var8.g;
                  if(var8.g != null) {
                     var9.f.a(0, z, A, B, C, var9.b - w, var9.a - x, var9.c - y, var9.h);
                  }

                  for(var10 = 0; var10 < var8.k; ++var10) {
                     if((var11 = var8.l[var10]) != null) {
                        var11.e.a(var11.f, z, A, B, C, var11.c - w, var11.b - x, var11.d - y, var11.m);
                     }
                  }
               }

               var20 = false;
               if(var1.e != null) {
                  if(!this.n(var6, var3, var4)) {
                     var20 = true;
                     this.a(var1.e, var6, z, A, B, C, var3, var4);
                  }
               } else if(var1.f != null && !this.n(var6, var3, var4)) {
                  var20 = true;
                  a(var3, z, B, var1.f, A, var4, C);
               }

               var19 = 0;
               var10 = 0;
               ac var21 = var1.g;
               ad var12 = var1.h;
               if(var21 != null || var12 != null) {
                  if(u == var3) {
                     ++var19;
                  } else if(u < var3) {
                     var19 += 2;
                  }

                  if(v == var4) {
                     var19 += 3;
                  } else if(v > var4) {
                     var19 += 6;
                  }

                  var10 = Q[var19];
                  var1.v = S[var19];
               }

               if(var21 != null) {
                  if((var21.d & R[var19]) != 0) {
                     if(var21.d == 16) {
                        var1.s = 3;
                        var1.t = T[var19];
                        var1.u = 3 - var1.t;
                     } else if(var21.d == 32) {
                        var1.s = 6;
                        var1.t = U[var19];
                        var1.u = 6 - var1.t;
                     } else if(var21.d == 64) {
                        var1.s = 12;
                        var1.t = V[var19];
                        var1.u = 12 - var1.t;
                     } else {
                        var1.s = 9;
                        var1.t = W[var19];
                        var1.u = 9 - var1.t;
                     }
                  } else {
                     var1.s = 0;
                  }

                  if((var21.d & var10) != 0 && !this.d(var6, var3, var4, var21.d)) {
                     var21.f.a(0, z, A, B, C, var21.b - w, var21.a - x, var21.c - y, var21.h);
                  }

                  if((var21.e & var10) != 0 && !this.d(var6, var3, var4, var21.e)) {
                     var21.g.a(0, z, A, B, C, var21.b - w, var21.a - x, var21.c - y, var21.h);
                  }
               }

               if(var12 != null && !this.e(var6, var3, var4, var12.f.aD)) {
                  if((var12.d & var10) != 0) {
                     var12.f.a(var12.e, z, A, B, C, var12.b - w, var12.a - x, var12.c - y, var12.g);
                  } else if((var12.d & 768) != 0) {
                     var13 = var12.b - w;
                     var14 = var12.a - x;
                     var15 = var12.c - y;
                     var16 = var12.e;
                     if(var12.e != 1 && var16 != 2) {
                        var17 = var13;
                     } else {
                        var17 = -var13;
                     }

                     if(var16 != 2 && var16 != 3) {
                        var19 = var15;
                     } else {
                        var19 = -var15;
                     }

                     if((var12.d & 256) != 0 && var19 < var17) {
                        var10 = var13 + E[var16];
                        var22 = var15 + F[var16];
                        var12.f.a((var16 << 9) + 256, z, A, B, C, var10, var14, var22, var12.g);
                     }

                     if((var12.d & 512) != 0 && var19 > var17) {
                        var10 = var13 + G[var16];
                        var22 = var15 + H[var16];
                        var12.f.a((var16 << 9) + 1280 & 2047, z, A, B, C, var10, var14, var22, var12.g);
                     }
                  }
               }

               if(var20) {
                  aa var25 = var1.i;
                  if(var1.i != null) {
                     var25.d.a(0, z, A, B, C, var25.b - w, var25.a - x, var25.c - y, var25.e);
                  }

                  T var28 = var1.j;
                  if(var1.j != null && var28.h == 0) {
                     if(var28.e != null) {
                        var28.e.a(0, z, A, B, C, var28.b - w, var28.a - x, var28.c - y, var28.g);
                     }

                     if(var28.f != null) {
                        var28.f.a(0, z, A, B, C, var28.b - w, var28.a - x, var28.c - y, var28.g);
                     }

                     if(var28.d != null) {
                        var28.d.a(0, z, A, B, C, var28.b - w, var28.a - x, var28.c - y, var28.g);
                     }
                  }
               }

               var13 = var1.n;
               if(var1.n != 0) {
                  if(var3 < u && (var13 & 4) != 0 && (var29 = var7[var3 + 1][var4]) != null && var29.q) {
                     P.a(var29);
                  }

                  if(var4 < v && (var13 & 2) != 0 && (var29 = var7[var3][var4 + 1]) != null && var29.q) {
                     P.a(var29);
                  }

                  if(var3 > u && (var13 & 1) != 0 && (var29 = var7[var3 - 1][var4]) != null && var29.q) {
                     P.a(var29);
                  }

                  if(var4 > v && (var13 & 8) != 0 && (var29 = var7[var3][var4 - 1]) != null && var29.q) {
                     P.a(var29);
                  }
               }
            }

            if(var1.s != 0) {
               var20 = true;

               for(var19 = 0; var19 < var1.k; ++var19) {
                  if(var1.l[var19].l != p && (var1.m[var19] & var1.s) == var1.t) {
                     var20 = false;
                     break;
                  }
               }

               if(var20) {
                  var9 = var1.g;
                  if(!this.d(var6, var3, var4, var9.d)) {
                     var9.f.a(0, z, A, B, C, var9.b - w, var9.a - x, var9.c - y, var9.h);
                  }

                  var1.s = 0;
               }
            }

            int var24;
            if(var1.r) {
               try {
                  int var23 = var1.k;
                  var1.r = false;
                  var19 = 0;

                  label541:
                  for(var10 = 0; var10 < var23; ++var10) {
                     if((var11 = var1.l[var10]).l != p) {
                        for(var24 = var11.g; var24 <= var11.h; ++var24) {
                           for(var13 = var11.i; var13 <= var11.j; ++var13) {
                              if((var29 = var7[var24][var13]).p) {
                                 var1.r = true;
                                 continue label541;
                              }

                              if(var29.s != 0) {
                                 var15 = 0;
                                 if(var24 > var11.g) {
                                    ++var15;
                                 }

                                 if(var24 < var11.h) {
                                    var15 += 4;
                                 }

                                 if(var13 > var11.i) {
                                    var15 += 8;
                                 }

                                 if(var13 < var11.j) {
                                    var15 += 2;
                                 }

                                 if((var15 & var29.s) == var1.u) {
                                    var1.r = true;
                                    continue label541;
                                 }
                              }
                           }
                        }

                        D[var19++] = var11;
                        var24 = u - var11.g;
                        if((var13 = var11.h - u) > var24) {
                           var24 = var13;
                        }

                        var14 = v - var11.i;
                        if((var15 = var11.j - v) > var14) {
                           var11.k = var24 + var15;
                        } else {
                           var11.k = var24 + var14;
                        }
                     }
                  }

                  while(var19 > 0) {
                     var10 = -50;
                     var22 = -1;

                     for(var24 = 0; var24 < var19; ++var24) {
                        x var30;
                        if((var30 = D[var24]).l != p) {
                           if(var30.k > var10) {
                              var10 = var30.k;
                              var22 = var24;
                           } else if(var30.k == var10) {
                              var14 = var30.c - w;
                              var15 = var30.d - y;
                              var16 = D[var22].c - w;
                              var17 = D[var22].d - y;
                              if(var14 * var14 + var15 * var15 > var16 * var16 + var17 * var17) {
                                 var22 = var24;
                              }
                           }
                        }
                     }

                     if(var22 == -1) {
                        break;
                     }

                     x var31;
                     (var31 = D[var22]).l = p;
                     if(!this.b(var6, var31.g, var31.h, var31.i, var31.j, var31.e.aD)) {
                        var31.e.a(var31.f, z, A, B, C, var31.c - w, var31.b - x, var31.d - y, var31.m);
                     }

                     for(var13 = var31.g; var13 <= var31.h; ++var13) {
                        for(var14 = var31.i; var14 <= var31.j; ++var14) {
                           S var34;
                           if((var34 = var7[var13][var14]).s != 0) {
                              P.a(var34);
                           } else if((var13 != var3 || var14 != var4) && var34.q) {
                              P.a(var34);
                           }
                        }
                     }
                  }

                  if(var1.r) {
                     continue;
                  }
               } catch (Exception var18) {
                  var1.r = false;
               }
            }

            if(var1.q && var1.s == 0 && (var3 > u || var3 <= q || (var8 = var7[var3 - 1][var4]) == null || !var8.q) && (var3 < u || var3 >= r - 1 || (var8 = var7[var3 + 1][var4]) == null || !var8.q) && (var4 > v || var4 <= s || (var8 = var7[var3][var4 - 1]) == null || !var8.q) && (var4 < v || var4 >= t - 1 || (var8 = var7[var3][var4 + 1]) == null || !var8.q)) {
               var1.q = false;
               --n;
               T var26 = var1.j;
               if(var1.j != null && var26.h != 0) {
                  if(var26.e != null) {
                     var26.e.a(0, z, A, B, C, var26.b - w, var26.a - x - var26.h, var26.c - y, var26.g);
                  }

                  if(var26.f != null) {
                     var26.f.a(0, z, A, B, C, var26.b - w, var26.a - x - var26.h, var26.c - y, var26.g);
                  }

                  if(var26.d != null) {
                     var26.d.a(0, z, A, B, C, var26.b - w, var26.a - x - var26.h, var26.c - y, var26.g);
                  }
               }

               if(var1.v != 0) {
                  ad var32 = var1.h;
                  if(var1.h != null && !this.e(var6, var3, var4, var32.f.aD)) {
                     if((var32.d & var1.v) != 0) {
                        var32.f.a(var32.e, z, A, B, C, var32.b - w, var32.a - x, var32.c - y, var32.g);
                     } else if((var32.d & 768) != 0) {
                        var10 = var32.b - w;
                        var22 = var32.a - x;
                        var24 = var32.c - y;
                        var13 = var32.e;
                        if(var32.e != 1 && var13 != 2) {
                           var14 = var10;
                        } else {
                           var14 = -var10;
                        }

                        if(var13 != 2 && var13 != 3) {
                           var15 = var24;
                        } else {
                           var15 = -var24;
                        }

                        if((var32.d & 256) != 0 && var15 >= var14) {
                           var16 = var10 + E[var13];
                           var17 = var24 + F[var13];
                           var32.f.a((var13 << 9) + 256, z, A, B, C, var16, var22, var17, var32.g);
                        }

                        if((var32.d & 512) != 0 && var15 <= var14) {
                           var16 = var10 + G[var13];
                           var17 = var24 + H[var13];
                           var32.f.a((var13 << 9) + 1280 & 2047, z, A, B, C, var16, var22, var17, var32.g);
                        }
                     }
                  }

                  ac var27 = var1.g;
                  if(var1.g != null) {
                     if((var27.e & var1.v) != 0 && !this.d(var6, var3, var4, var27.e)) {
                        var27.g.a(0, z, A, B, C, var27.b - w, var27.a - x, var27.c - y, var27.h);
                     }

                     if((var27.d & var1.v) != 0 && !this.d(var6, var3, var4, var27.d)) {
                        var27.f.a(0, z, A, B, C, var27.b - w, var27.a - x, var27.c - y, var27.h);
                     }
                  }
               }

               S var33;
               if(var5 < 3 && (var33 = this.i[var5 + 1][var3][var4]) != null && var33.q) {
                  P.a(var33);
               }

               if(var3 < u && (var33 = var7[var3 + 1][var4]) != null && var33.q) {
                  P.a(var33);
               }

               if(var4 < v && (var33 = var7[var3][var4 + 1]) != null && var33.q) {
                  P.a(var33);
               }

               if(var3 > u && (var33 = var7[var3 - 1][var4]) != null && var33.q) {
                  P.a(var33);
               }

               if(var4 > v && (var33 = var7[var3][var4 - 1]) != null && var33.q) {
                  P.a(var33);
               }
            }
         }
      }

   }

   private void a(X var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - w;
      int var11;
      int var12 = var11 = (var8 << 7) - y;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.h[var2][var7][var8] - x;
      int var18 = this.h[var2][var7 + 1][var8] - x;
      int var19 = this.h[var2][var7 + 1][var8 + 1] - x;
      var2 = this.h[var2][var7][var8 + 1] - x;
      int var20 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var20;
      var20 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var20;
      if(var12 >= 50) {
         var20 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var20;
         var20 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var20;
         if(var11 >= 50) {
            var20 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var20;
            var20 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var20;
            if(var16 >= 50) {
               var20 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var20;
               var20 = var2 * var4 - var15 * var3 >> 16;
               var15 = var2 * var3 + var15 * var4 >> 16;
               var2 = var20;
               if(var15 >= 50) {
                  var3 = u.e + (var10 << Client.l) / var12;
                  var4 = u.f + (var17 << Client.l) / var12;
                  var5 = u.e + (var14 << Client.l) / var11;
                  var6 = u.f + (var18 << Client.l) / var11;
                  var20 = u.e + (var13 << Client.l) / var16;
                  int var21 = u.f + (var19 << Client.l) / var16;
                  int var22 = u.e + (var9 << Client.l) / var15;
                  int var23 = u.f + (var2 << Client.l) / var15;
                  u.d = 0;
                  if((var20 - var22) * (var6 - var23) - (var21 - var23) * (var5 - var22) > 0) {
                     u.a(var20, var22, var5);
                     if(I && b(J, K, var21, var23, var6, var20, var22, var5)) {
                        b = var7;
                        c = var8;
                     }

                     if(var1.e == -1) {
                        if(var1.c != 12345678) {
                           u.a(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b);
                        }
                     } else if(!a) {
                        if(var1.f) {
                           u.a(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b, var10, var14, var9, var17, var18, var2, var12, var11, var15, var1.e);
                        } else {
                           u.a(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b, var13, var9, var14, var19, var2, var18, var16, var15, var11, var1.e);
                        }
                     } else {
                        var13 = X[var1.e];
                        u.a(var21, var23, var6, var20, var22, var5, c(var13, var1.c), c(var13, var1.d), c(var13, var1.b));
                     }
                  }

                  if((var3 - var5) * (var23 - var6) - (var4 - var6) * (var22 - var5) > 0) {
                     u.a(var3, var5, var22);
                     if(I && b(J, K, var4, var6, var23, var3, var5, var22)) {
                        b = var7;
                        c = var8;
                     }

                     if(var1.e == -1) {
                        if(var1.a != 12345678) {
                           u.a(var4, var6, var23, var3, var5, var22, var1.a, var1.b, var1.d);
                           return;
                        }
                     } else {
                        if(!a) {
                           u.a(var4, var6, var23, var3, var5, var22, var1.a, var1.b, var1.d, var10, var14, var9, var17, var18, var2, var12, var11, var15, var1.e);
                           return;
                        }

                        var13 = X[var1.e];
                        u.a(var4, var6, var23, var3, var5, var22, c(var13, var1.a), c(var13, var1.b), c(var13, var1.d));
                     }
                  }

               }
            }
         }
      }
   }

   private static void a(int var0, int var1, int var2, W var3, int var4, int var5, int var6) {
      int var7 = var3.a.length;

      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      for(var8 = 0; var8 < var7; ++var8) {
         var9 = var3.a[var8] - w;
         var10 = var3.b[var8] - x;
         var12 = (var11 = var3.c[var8] - y) * var2 + var9 * var6 >> 16;
         var11 = var11 * var6 - var9 * var2 >> 16;
         var9 = var12;
         var12 = var10 * var4 - var11 * var1 >> 16;
         var11 = var10 * var1 + var11 * var4 >> 16;
         if(var11 < 50) {
            return;
         }

         if(var3.j != null) {
            W.r[var8] = var9;
            W.s[var8] = var12;
            W.t[var8] = var11;
         }

         W.p[var8] = u.e + (var9 << Client.l) / var11;
         W.q[var8] = u.f + (var12 << Client.l) / var11;
      }

      u.d = 0;
      var7 = var3.g.length;

      for(var8 = 0; var8 < var7; ++var8) {
         var9 = var3.g[var8];
         var10 = var3.h[var8];
         var11 = var3.i[var8];
         var12 = W.p[var9];
         var1 = W.p[var10];
         var2 = W.p[var11];
         var4 = W.q[var9];
         var6 = W.q[var10];
         int var13 = W.q[var11];
         if((var12 - var1) * (var13 - var6) - (var4 - var6) * (var2 - var1) > 0) {
            u.a(var12, var1, var2);
            if(I && b(J, K, var4, var6, var13, var12, var1, var2)) {
               b = var0;
               c = var5;
            }

            if(var3.j != null && var3.j[var8] != -1) {
               if(!a) {
                  if(var3.k) {
                     u.a(var4, var6, var13, var12, var1, var2, var3.d[var8], var3.e[var8], var3.f[var8], W.r[0], W.r[1], W.r[3], W.s[0], W.s[1], W.s[3], W.t[0], W.t[1], W.t[3], var3.j[var8]);
                  } else {
                     u.a(var4, var6, var13, var12, var1, var2, var3.d[var8], var3.e[var8], var3.f[var8], W.r[var9], W.r[var10], W.r[var11], W.s[var9], W.s[var10], W.s[var11], W.t[var9], W.t[var10], W.t[var11], var3.j[var8]);
                  }
               } else {
                  var9 = X[var3.j[var8]];
                  u.a(var4, var6, var13, var12, var1, var2, c(var9, var3.d[var8]), c(var9, var3.e[var8]), c(var9, var3.f[var8]));
               }
            } else if(var3.d[var8] != 12345678) {
               u.a(var4, var6, var13, var12, var1, var2, var3.d[var8], var3.e[var8], var3.f[var8]);
            }
         }
      }

   }

   private static int c(int var0, int var1) {
      if((var1 = (127 - var1) * (var0 & 127) / 160) < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   private static boolean b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         var2 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         var0 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         return var8 * var0 > 0 && var0 * var2 > 0;
      }
   }

   private boolean n(int var1, int var2, int var3) {
      int var4;
      if((var4 = this.m[var1][var2][var3]) == -p) {
         return false;
      } else if(var4 == p) {
         return true;
      } else {
         var4 = var2 << 7;
         int var5 = var3 << 7;
         if(o(var4 + 1, this.h[var1][var2][var3], var5 + 1) && o(var4 + 128 - 1, this.h[var1][var2 + 1][var3], var5 + 1) && o(var4 + 128 - 1, this.h[var1][var2 + 1][var3 + 1], var5 + 128 - 1) && o(var4 + 1, this.h[var1][var2][var3 + 1], var5 + 128 - 1)) {
            this.m[var1][var2][var3] = p;
            return true;
         } else {
            this.m[var1][var2][var3] = -p;
            return false;
         }
      }
   }

   private boolean d(int var1, int var2, int var3, int var4) {
      if(!this.n(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         var3 = (var2 = this.h[var1][var2][var3] - 1) - 120;
         int var7 = var2 - 230;
         int var8 = var2 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > w) {
                  if(!o(var5, var2, var6)) {
                     return false;
                  }

                  if(!o(var5, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6)) {
                     return false;
                  }

                  if(!o(var5, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6) && o(var5, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 2) {
               if(var6 < y) {
                  if(!o(var5, var2, var6 + 128)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6 + 128)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6 + 128) && o(var5 + 128, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 4) {
               if(var5 < w) {
                  if(!o(var5 + 128, var2, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5 + 128, var3, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5 + 128, var7, var6) && o(var5 + 128, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 8) {
               if(var6 > y) {
                  if(!o(var5, var2, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6) && o(var5 + 128, var7, var6)) {
                  return true;
               }

               return false;
            }
         }

         if(!o(var5 + 64, var8, var6 + 64)) {
            return false;
         } else if(var4 == 16) {
            return o(var5, var7, var6 + 128);
         } else if(var4 == 32) {
            return o(var5 + 128, var7, var6 + 128);
         } else if(var4 == 64) {
            return o(var5 + 128, var7, var6);
         } else if(var4 == 128) {
            return o(var5, var7, var6);
         } else {
            System.out.println("Warning unsupported wall type");
            return true;
         }
      }
   }

   private boolean e(int var1, int var2, int var3, int var4) {
      if(!this.n(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return o(var5 + 1, this.h[var1][var2][var3] - var4, var6 + 1) && o(var5 + 128 - 1, this.h[var1][var2 + 1][var3] - var4, var6 + 1) && o(var5 + 128 - 1, this.h[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && o(var5 + 1, this.h[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   private boolean b(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var2 == var3 && var4 == var5) {
         if(!this.n(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return o(var7 + 1, this.h[var1][var2][var4] - var6, var8 + 1) && o(var7 + 128 - 1, this.h[var1][var2 + 1][var4] - var6, var8 + 1) && o(var7 + 128 - 1, this.h[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && o(var7 + 1, this.h[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.m[var1][var7][var8] == -p) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         var1 = this.h[var1][var2][var4] - var6;
         if(!o(var7, var1, var8)) {
            return false;
         } else if(!o(var2 = (var3 << 7) - 1, var1, var8)) {
            return false;
         } else {
            var3 = (var5 << 7) - 1;
            if(o(var7, var1, var3) && o(var2, var1, var3)) {
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private static boolean o(int var0, int var1, int var2) {
      for(int var3 = 0; var3 < N; ++var3) {
         V var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         if((var4 = O[var3]).l == 1) {
            if((var5 = var4.f - var0) > 0) {
               var6 = var4.h + (var4.o * var5 >> 8);
               var7 = var4.i + (var4.p * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 2) {
            if((var5 = var0 - var4.f) > 0) {
               var6 = var4.h + (var4.o * var5 >> 8);
               var7 = var4.i + (var4.p * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 3) {
            if((var5 = var4.h - var2) > 0) {
               var6 = var4.f + (var4.m * var5 >> 8);
               var7 = var4.g + (var4.n * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 4) {
            if((var5 = var2 - var4.h) > 0) {
               var6 = var4.f + (var4.m * var5 >> 8);
               var7 = var4.g + (var4.n * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 5 && (var5 = var1 - var4.j) > 0) {
            var6 = var4.f + (var4.m * var5 >> 8);
            var7 = var4.g + (var4.n * var5 >> 8);
            var8 = var4.h + (var4.o * var5 >> 8);
            var9 = var4.i + (var4.p * var5 >> 8);
            if(var0 >= var6 && var0 <= var7 && var2 >= var8 && var2 <= var9) {
               return true;
            }
         }
      }

      return false;
   }
}
