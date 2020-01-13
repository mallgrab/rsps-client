package uwotm8;

import java.awt.Color;
import uwotm8.I;
import uwotm8.K;
import uwotm8.k;
import uwotm8.n;
import uwotm8.q;

public final class l extends q {

   public int a = 0;
   private int c;
   private int d;
   private int[] e = new int[256];
   private int[] f = new int[256];
   private int[] g = new int[256];
   private int[] h = new int[256];
   private byte[][] r = new byte[256][];
   private int[] s = new int[256];
   private static String t = "trans=";
   private static String u = "shad";
   private static String v = "/shad";
   private static String w = "/str";
   private static String x = "col=";
   private static String y = "br";
   private static String z = "str=";
   private static String A = "/col";
   private static String B = "img=";
   private static String C = "/u";
   private static String D = "str";
   private static String E = "shad=";
   private static String F = "/trans";
   private static String G = "u=";
   private static String H = "u";
   public static String[] b = new String[100];
   private static int I = 0;
   private static int J = -1;
   private static int K = -1;
   private static int L = 256;
   private static int M = -1;
   private static int N = -1;
   private static int O = 256;
   private static int P = 0;


   public l(boolean var1, String var2, I var3) {
      K var11 = new K(var3.b(var2 + ".dat"));
      K var12;
      (var12 = new K(var3.b("index.dat"))).b = var11.h() + 4;
      int var4;
      if((var4 = var12.f()) > 0) {
         var12.b += 3 * (var4 - 1);
      }

      var4 = Integer.MAX_VALUE;
      int var5 = Integer.MIN_VALUE;

      for(int var6 = 0; var6 < 256; ++var6) {
         this.g[var6] = var12.f();
         this.e[var6] = var12.f();
         int var7 = this.h[var6] = var12.h();
         int var8 = this.f[var6] = var12.h();
         int var9 = var12.f();
         int var10 = var7 * var8;
         this.r[var6] = new byte[var10];
         if(var9 == 0) {
            for(var9 = 0; var9 < var10; ++var9) {
               this.r[var6][var9] = var11.g();
            }
         } else if(var9 == 1) {
            for(var9 = 0; var9 < var7; ++var9) {
               for(var10 = 0; var10 < var8; ++var10) {
                  this.r[var6][var9 + var10 * var7] = var11.g();
               }
            }
         }

         if(var8 > this.a && var6 < 128) {
            this.a = var8;
         }

         this.g[var6] = 1;
         this.s[var6] = var7 + 2;
         var9 = 0;

         for(var10 = var8 / 7; var10 < var8; ++var10) {
            var9 += this.r[var6][var10 * var7];
         }

         if(var9 <= var8 / 7) {
            --this.s[var6];
            this.g[var6] = 0;
         }

         var9 = 0;

         for(var10 = var8 / 7; var10 < var8; ++var10) {
            var9 += this.r[var6][var7 - 1 + var10 * var7];
         }

         if(var9 <= var8 / 7) {
            --this.s[var6];
         }

         if(this.e[var6] < var4 && var8 != 0) {
            var4 = this.e[var6];
         }

         if(this.e[var6] + var8 > var5) {
            var5 = this.e[var6] + var8;
         }
      }

      if(var1) {
         this.s[32] = this.s[73];
      } else {
         this.s[32] = this.s[105];
      }

      this.c = this.a - var4;
      this.d = var5 - this.a;
   }

   public final int a(int var1) {
      return this.s[var1 & 255];
   }

   private void a(String var1, int var2, int var3) {
      var3 -= this.a;
      int var4 = -1;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6;
         if((var6 = var1.charAt(var5)) > 255) {
            var6 = 32;
         }

         if(var6 == 60) {
            var4 = var5;
         } else {
            int var8;
            int var11;
            int var12;
            if(var6 == 62 && var4 != -1) {
               String var7 = var1.substring(var4 + 1, var5);
               var4 = -1;
               if(var7.equals("lt")) {
                  var6 = 60;
               } else {
                  if(!var7.equals("gt")) {
                     if(var7.startsWith(B)) {
                        try {
                           var12 = ((n)null).h;
                           if(O == 256) {
                              null.b(var2, var3 + this.a - var12);
                           } else {
                              null.c(var2, var3 + this.a - var12, O);
                           }

                           var2 += ((n)null).g;
                        } catch (Exception var10) {
                           ;
                        }
                     } else {
                        try {
                           if(var7.startsWith(x)) {
                              String var13;
                              P = (var13 = var7.substring(4)).length() < 6?Color.decode(var13).getRGB():Integer.parseInt(var13, 16);
                           } else if(var7.equals(A)) {
                              P = I;
                           } else if(var7.startsWith(t)) {
                              O = Integer.valueOf(var7.substring(6)).intValue();
                           } else if(var7.equals(F)) {
                              O = L;
                           } else if(var7.startsWith(z)) {
                              K = Integer.valueOf(var7.substring(4)).intValue();
                           } else if(var7.equals(D)) {
                              K = 8388608;
                           } else if(var7.equals(w)) {
                              K = -1;
                           } else if(var7.startsWith(G)) {
                              M = Integer.valueOf(var7.substring(2)).intValue();
                           } else if(var7.equals(H)) {
                              M = 0;
                           } else if(var7.equals(C)) {
                              M = -1;
                           } else if(var7.startsWith(E)) {
                              J = Integer.valueOf(var7.substring(5)).intValue();
                           } else if(var7.equals(u)) {
                              J = 0;
                           } else if(var7.equals(v)) {
                              J = N;
                           } else if(var7.equals(y)) {
                              var8 = L;
                              var11 = N;
                              var12 = I;
                              K = -1;
                              M = -1;
                              N = var11;
                              J = var11;
                              I = var12;
                              P = var12;
                              L = var8;
                              O = var8;
                           }
                        } catch (Exception var9) {
                           ;
                        }
                     }
                     continue;
                  }

                  var6 = 62;
               }
            }

            if(var6 == 160) {
               var6 = 32;
            }

            if(var4 == -1) {
               var11 = this.h[var6];
               var8 = this.f[var6];
               if(var6 != 32) {
                  if(O == 256) {
                     if(J != -1) {
                        this.c(var6, var2 + this.g[var6] + 1, var3 + this.e[var6] + 1, var11, var8, J);
                     }

                     this.c(var6, var2 + this.g[var6], var3 + this.e[var6], var11, var8, P);
                  } else {
                     if(J != -1) {
                        this.a(var6, var2 + this.g[var6] + 1, var3 + this.e[var6] + 1, var11, var8, J, O);
                     }

                     this.a(var6, var2 + this.g[var6], var3 + this.e[var6], var11, var8, P, O);
                  }
               }

               var12 = this.s[var6];
               if(K != -1) {
                  k.a(var2, var3 + (int)((double)this.a * 0.7D), var12, K);
               }

               if(M != -1) {
                  k.a(var2, var3 + this.a, var12, M);
               }

               var2 += var12;
            }
         }
      }

   }

   private static void a(int var0, int var1) {
      K = -1;
      M = -1;
      N = var1;
      J = var1;
      I = var0;
      P = var0;
      L = 256;
      O = 256;
   }

   public final int a(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var5;
            if((var5 = var1.charAt(var4)) > 255) {
               var5 = 32;
            }

            if(var5 == 60) {
               var2 = var4;
            } else {
               if(var5 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var4);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var5 = 60;
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=")) {
                           try {
                              var3 += ((n)null).g;
                           } catch (Exception var6) {
                              ;
                           }
                        }
                        continue;
                     }

                     var5 = 62;
                  }
               }

               if(var5 == 160) {
                  var5 = 32;
               }

               if(var2 == -1) {
                  var3 += this.s[var5];
               }
            }
         }

         return var3;
      }
   }

   public final void a(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         a(var4, var5);
         this.a(var1, var2, var3);
      }

   }

   public final void b(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         a(var4, var5);
         this.a(var1, var2 - this.a(var1) / 2, var3);
      }

   }

   public final void c(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         a(var4, var5);
         this.a(var1, var2 - this.a(var1), var3);
      }

   }

   public final void a(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 != null) {
         a(var6, var7);
         if(var10 == 0) {
            var10 = this.a;
         }

         int[] var12 = new int[]{var4};
         if(var5 < this.c + this.d + var10 && var5 < var10 + var10) {
            var12 = null;
         }

         int var11 = this.a(var1, var12, b);
         if(var9 == 3 && var11 == 1) {
            var9 = 1;
         }

         if(var9 == 0) {
            var3 += this.c;
         } else if(var9 == 1) {
            var3 = var3 + this.c + (var5 - this.c - this.d - (var11 - 1) * var10) / 2;
         } else if(var9 == 2) {
            var3 = var3 + var5 - this.d - (var11 - 1) * var10;
         } else {
            if((var5 = (var5 - this.c - this.d - (var11 - 1) * var10) / (var11 + 1)) < 0) {
               var5 = 0;
            }

            var3 = var3 + this.c + var5;
            var10 += var5;
         }

         for(var5 = 0; var5 < var11; ++var5) {
            label56: {
               if(var8 != 0) {
                  if(var8 == 1) {
                     this.a(b[var5], var2 + (var4 - this.a(b[var5])) / 2, var3);
                     break label56;
                  }

                  if(var8 == 2) {
                     this.a(b[var5], var2 + var4 - this.a(b[var5]), var3);
                     break label56;
                  }
               }

               this.a(b[var5], var2, var3);
            }

            var3 += var10;
         }

      }
   }

   public final int a(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = -1;
         byte var8 = 0;
         int var9 = 0;
         int var10 = -1;
         StringBuilder var11 = new StringBuilder();

         for(int var12 = 0; var12 < var1.length(); ++var12) {
            char var13;
            if((var13 = var1.charAt(var12)) > 255) {
               var13 = 32;
            }

            if(var13 == 60) {
               var10 = var12;
            } else {
               if(var13 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var12);
                  var10 = -1;
                  var11.append('<');
                  var11.append(var16);
                  var11.append('>');
                  if(var16.equals("br")) {
                     var3[var9] = var11.substring(var6, var11.length());
                     ++var9;
                     var6 = var11.length();
                     var4 = 0;
                     var7 = -1;
                  } else if(var16.equals("lt")) {
                     var4 += this.a(60);
                  } else if(var16.equals("gt")) {
                     var4 += this.a(62);
                  } else if(var16.startsWith(B)) {
                     try {
                        var4 += ((n)null).g;
                     } catch (Exception var14) {
                        ;
                     }
                  }

                  var13 = 0;
               }

               if(var10 == -1) {
                  if(var13 != 0) {
                     var11.append(var13);
                     var4 += this.a(var13);
                  }

                  if(var13 == 32) {
                     var7 = var11.length();
                     var5 = var4;
                     var8 = 1;
                  }

                  if(var2 != null && var4 > var2[var9 < var2.length?var9:var2.length - 1] && var7 >= 0) {
                     var3[var9] = var11.substring(var6, var7 - var8);
                     ++var9;
                     var6 = var7;
                     var7 = -1;
                     var4 -= var5;
                  }

                  if(var13 == 45) {
                     var7 = var11.length();
                     var5 = var4;
                     var8 = 0;
                  }
               }
            }
         }

         String var15;
         if((var15 = var11.toString()).length() > var6) {
            var3[var9++] = var15.substring(var6, var15.length());
         }

         return var9;
      }
   }

   private static void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(var6 = -var6; var6 < 0; ++var6) {
         for(int var10 = -var5; var10 < 0; ++var10) {
            if(var1[var3++] != 0) {
               int var11 = var0[var4];
               var0[var4++] = (((var11 & 16711935) * var9 & -16711936) + ((var11 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * q.j;
      int var9 = q.j - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(var3 < q.l) {
         var12 = q.l - var3;
         var5 -= var12;
         var3 = q.l;
         var11 = 0 + var12 * var4;
         var8 += var12 * q.j;
      }

      if(var3 + var5 > q.m) {
         var5 -= var3 + var5 - q.m;
      }

      if(var2 < q.n) {
         var12 = q.n - var2;
         var4 -= var12;
         var2 = q.n;
         var11 += var12;
         var8 += var12;
         var10 = var12;
         var9 += var12;
      }

      if(var2 + var4 > q.o) {
         var12 = var2 + var4 - q.o;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(var4 > 0 && var5 > 0) {
         a(q.i, this.r[var1], var6, var11, var8, var4, var5, var9, var10, var7);
      }

   }

   private static void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(var6 = -var6; var6 < 0; ++var6) {
         int var10;
         for(var10 = var9; var10 < 0; ++var10) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var10 = var5; var10 < 0; ++var10) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   private void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * q.j;
      int var8 = q.j - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < q.l) {
         var11 = q.l - var3;
         var5 -= var11;
         var3 = q.l;
         var10 = 0 + var11 * var4;
         var7 += var11 * q.j;
      }

      if(var3 + var5 > q.m) {
         var5 -= var3 + var5 - q.m;
      }

      if(var2 < q.n) {
         var11 = q.n - var2;
         var4 -= var11;
         var2 = q.n;
         var10 += var11;
         var7 += var11;
         var9 = var11;
         var8 += var11;
      }

      if(var2 + var4 > q.o) {
         var11 = var2 + var4 - q.o;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         a(q.i, this.r[var1], var6, var10, var7, var4, var5, var8, var9);
      }

   }

   public static String b(String var0) {
      return var0.equals("369")?"336699":(var0.equals("mon")?"00ff80":(var0.equals("red")?"ff0000":(var0.equals("gre")?"65280":(var0.equals("blu")?"255":(var0.equals("ind")?"4964c8":(var0.equals("yel")?"ffff00":(var0.equals("cya")?"65535":(var0.equals("mag")?"ff00ff":(var0.equals("vio")?"7A10E5":(var0.equals("whi")?"ffffff":(var0.equals("bla")?"0":(var0.equals("lre")?"ff9040":(var0.equals("dre")?"800000":(var0.equals("dbl")?"128":(var0.equals("or1")?"ffb000":(var0.equals("or2")?"ff7000":(var0.equals("or3")?"ff3000":(var0.equals("dor")?"946300":(var0.equals("gr1")?"c0ff00":(var0.equals("gr2")?"80ff00":(var0.equals("gr3")?"40ff00":"")))))))))))))))))))));
   }
}
