package uwotm8;

import java.util.Random;
import uwotm8.I;
import uwotm8.K;
import uwotm8.q;

public final class o extends q {

   private byte[][] b = new byte[256][];
   private int[] c = new int[256];
   private int[] d = new int[256];
   private int[] e = new int[256];
   private int[] f = new int[256];
   private int[] g = new int[256];
   public int a;
   private Random h = new Random();


   public o(boolean var1, String var2, I var3) {
      K var9 = new K(var3.b(var2 + ".dat"));
      K var10;
      (var10 = new K(var3.b("index.dat"))).b = var9.h() + 4;
      int var4;
      if((var4 = var10.f()) > 0) {
         var10.b += 3 * (var4 - 1);
      }

      for(var4 = 0; var4 < 256; ++var4) {
         this.e[var4] = var10.f();
         this.f[var4] = var10.f();
         int var5 = this.c[var4] = var10.h();
         int var6 = this.d[var4] = var10.h();
         int var7 = var10.f();
         int var8 = var5 * var6;
         this.b[var4] = new byte[var8];
         if(var7 == 0) {
            for(var7 = 0; var7 < var8; ++var7) {
               this.b[var4][var7] = var9.g();
            }
         } else if(var7 == 1) {
            for(var7 = 0; var7 < var5; ++var7) {
               for(var8 = 0; var8 < var6; ++var8) {
                  this.b[var4][var7 + var8 * var5] = var9.g();
               }
            }
         }

         if(var6 > this.a && var4 < 128) {
            this.a = var6;
         }

         this.e[var4] = 1;
         this.g[var4] = var5 + 2;
         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.b[var4][var8 * var5];
         }

         if(var7 <= var6 / 7) {
            --this.g[var4];
            this.e[var4] = 0;
         }

         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.b[var4][var5 - 1 + var8 * var5];
         }

         if(var7 <= var6 / 7) {
            --this.g[var4];
         }
      }

      if(var1) {
         this.g[32] = this.g[73];
      } else {
         this.g[32] = this.g[105];
      }
   }

   public final void a(String var1, int var2, int var3, int var4) {
      this.b(var3, var1, var4, var2 - this.b(var1));
   }

   public final void a(int var1, String var2, int var3, int var4, boolean var5) {
      if(var5) {
         this.a(0, var2, var3 + 1, var4 + 1, false);
      }

      this.b(var1, var2, var3, var4 - this.b(var2) / 2);
   }

   public final void a(int var1, String var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, false);
   }

   public final void a(int var1, int var2, String var3, int var4, boolean var5) {
      this.a(var5, var2 - this.a(var3) / 2, var1, var3, var4);
   }

   public final void a(int var1, String var2, int var3) {
      this.a(false, var1, 255, var2, var3);
   }

   public final int a(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if(var1.charAt(var3) == 64 && var3 + 4 < var1.length() && var1.charAt(var3 + 4) == 64) {
               var3 += 4;
            } else {
               char var4;
               if((var4 = var1.charAt(var3)) > 255) {
                  var4 = 32;
               }

               var2 += this.g[var4];
            }
         }

         return var2;
      }
   }

   public final int b(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            char var4;
            if((var4 = var1.charAt(var3)) > 255) {
               var4 = 32;
            }

            var2 += this.g[var4];
         }

         return var2;
      }
   }

   public final void b(int var1, String var2, int var3, int var4) {
      if(var2 != null) {
         var3 -= this.a;

         for(int var5 = 0; var5 < var2.length(); ++var5) {
            char var6;
            if((var6 = var2.charAt(var5)) > 255) {
               var6 = 32;
            }

            if(var6 != 32) {
               a(this.b[var6], var4 + this.e[var6], var3 + this.f[var6], this.c[var6], this.d[var6], var1);
            }

            var4 += this.g[var6];
         }

      }
   }

   public final void a(int var1, String var2, int var3, int var4, int var5) {
      if(var2 != null) {
         var3 -= this.b(var2) / 2;
         var5 -= this.a;

         for(int var6 = 0; var6 < var2.length(); ++var6) {
            char var7;
            if((var7 = var2.charAt(var6)) > 255) {
               var7 = 32;
            }

            if(var7 != 32) {
               a(this.b[var7], var3 + this.e[var7], var5 + this.f[var7] + (int)(Math.sin((double)var6 / 2.0D + (double)var4 / 5.0D) * 5.0D), this.c[var7], this.d[var7], var1);
            }

            var3 += this.g[var7];
         }

      }
   }

   public final void b(int var1, String var2, int var3, int var4, int var5) {
      if(var2 != null) {
         var1 -= this.b(var2) / 2;
         var4 -= this.a;

         for(int var6 = 0; var6 < var2.length(); ++var6) {
            char var7;
            if((var7 = var2.charAt(var6)) > 255) {
               var7 = 32;
            }

            if(var7 != 32) {
               a(this.b[var7], var1 + this.e[var7] + (int)(Math.sin((double)var6 / 5.0D + (double)var3 / 5.0D) * 5.0D), var4 + this.f[var7] + (int)(Math.sin((double)var6 / 3.0D + (double)var3 / 5.0D) * 5.0D), this.c[var7], this.d[var7], var5);
            }

            var1 += this.g[var7];
         }

      }
   }

   public final void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      if(var2 != null) {
         double var7;
         if((var7 = 7.0D - (double)var1 / 8.0D) < 0.0D) {
            var7 = 0.0D;
         }

         var5 -= this.b(var2) / 2;
         var4 -= this.a;

         for(var1 = 0; var1 < var2.length(); ++var1) {
            char var9;
            if((var9 = var2.charAt(var1)) > 255) {
               var9 = 32;
            }

            if(var9 != 32) {
               a(this.b[var9], var5 + this.e[var9], var4 + this.f[var9] + (int)(Math.sin((double)var1 / 1.5D + (double)var3) * var7), this.c[var9], this.d[var9], var6);
            }

            var5 += this.g[var9];
         }

      }
   }

   public final void a(boolean var1, int var2, int var3, String var4, int var5) {
      int var6 = -1;
      int var7 = -1;
      if(var4 != null) {
         var5 -= this.a;

         for(int var8 = 0; var8 < var4.length(); ++var8) {
            if(var4.charAt(var8) == 64 && var8 + 4 < var4.length() && var4.charAt(var8 + 4) == 64) {
               int var10;
               if((var10 = c(var4.substring(var8 + 1, var8 + 4))) >= 0) {
                  var3 = var10;
               } else if(var10 == -2) {
                  var6 = var2;
               } else if(var10 == -3) {
                  var7 = var2;
               }

               var8 += 4;
            } else {
               char var9;
               if((var9 = var4.charAt(var8)) > 255) {
                  var9 = 32;
               }

               if(var9 != 32) {
                  if(var1) {
                     a(this.b[var9], var2 + this.e[var9] + 1, var5 + this.f[var9] + 1, this.c[var9], this.d[var9], 0);
                  }

                  a(this.b[var9], var2 + this.e[var9], var5 + this.f[var9], this.c[var9], this.d[var9], var3);
               }

               if(var6 >= 0) {
                  q.c(var5 + (int)((double)this.a * 0.7D), 8388608, var2 - var6, var6);
                  if(var7 >= 0) {
                     var7 = -1;
                     var6 = -1;
                  }
               }

               var2 += this.g[var9];
            }
         }

         if(var6 >= 0) {
            q.c(var5 + (int)((double)this.a * 0.7D), 8388608, var2 - var6, var6);
         }

      }
   }

   private static int c(String var0) {
      return var0.equals("369")?3368601:(var0.equals("mon")?'\uff80':(var0.equals("red")?16711680:(var0.equals("gre")?'\uff00':(var0.equals("blu")?255:(var0.equals("ind")?4809928:(var0.equals("yel")?16776960:(var0.equals("cya")?'\uffff':(var0.equals("mag")?16711935:(var0.equals("vio")?7999717:(var0.equals("whi")?16777215:(var0.equals("bla")?0:(var0.equals("lre")?16748608:(var0.equals("dre")?8388608:(var0.equals("dbl")?128:(var0.equals("or1")?16756736:(var0.equals("or2")?16740352:(var0.equals("or3")?16723968:(var0.equals("dor")?9724672:(var0.equals("gr1")?12648192:(var0.equals("gr2")?8453888:(var0.equals("gr3")?4259584:(var0.equals("glo")?8270336:(var0.equals("str")?-2:(var0.equals("end")?-3:-1))))))))))))))))))))))));
   }

   private static void a(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * j;
      int var7 = j - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < l) {
         var10 = l - var2;
         var4 -= var10;
         var2 = l;
         var9 = 0 + var10 * var3;
         var6 += var10 * j;
      }

      if(var2 + var4 >= m) {
         var4 -= var2 + var4 - m;
      }

      if(var1 < n) {
         var10 = n - var1;
         var3 -= var10;
         var1 = n;
         var9 += var10;
         var6 += var10;
         var8 = var10;
         var7 += var10;
      }

      if(var1 + var3 >= o) {
         var10 = var1 + var3 - o;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         a(i, var0, var5, var9, var6, var3, var4, var7, var8);
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
}
