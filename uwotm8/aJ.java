package uwotm8;

import com.runescape.Client;
import java.awt.Point;
import java.awt.Rectangle;
import uwotm8.aH;
import uwotm8.aK;
import uwotm8.m;
import uwotm8.n;
import uwotm8.q;

public final class aJ extends aK {

   private static n a;
   private static final Point b = new Point(54, 9);
   private n[] c = new n[10];
   private static final int[] d = new int[]{0, 1, 1, 1, 1, 1, 2, 3, 1, 1, 1, 1, 1, 4};
   private static final int[] e = new int[]{6, 44, 77, 110, 143, 176, 209};
   private static final int[] f = new int[]{0, 0, 0, 0, 0, 0, 0, 298, 298, 298, 298, 298, 298, 298};
   private static final int[] g = new int[]{11, 5, 6, 4, 4, 4, 5, 8, 5, 5, 6, 5, 8, 9};
   private static final int[] h = new int[]{9, 7, 7, 5, 2, 3, 7, 5, 8, 8, 4, 6, 4, 5};
   private static final int[] i = new int[]{7, 5, 6, 3, 4, 4, 3, 6, 5, 5, 6, 5, 8, 7};
   private static final int[] j = new int[]{7, 6, 6, 4, 1, 2, 5, 5, 6, 6, 2, 5, 4, 4};
   private static final int[][] k = new int[][]{{'\uff00', 16776960, 16711680, '\uffff'}, {'\uff00', 16776960, 16711680}, {'\uff00', '\uffff', 16711680}};
   private static final String[][] l = new String[][]{{"On", "Friends", "Off", "Hide"}, {"On", "Filtered", "Off"}, {"On", "Hidden", "Off"}};
   private static final int[] m = new int[]{1, 0, 0, 2, 0, 2};
   private static final int[] n = new int[]{5, 70, 135, 200, 265, 330, 395, 460};
   private static final int[] o = new int[]{158, 153, 153, 153, 153, 153, 153, 156};
   private static final int[] p = new int[]{32, 97, 162, 227, 292, 357, 422, 487};
   private static final String[] q = new String[]{"All", "Game", "Public", "Private", "Clan", "Trade", "Global", "Report"};
   private static final Rectangle r = new Rectangle(10, 8, 497, 112);
   private static final Rectangle s = new Rectangle(0, 0, 204, 275);
   private static final Rectangle t = new Rectangle(10, 15, 479, 96);


   public final void a() {
      n var1 = aH.a("frame_default", "redstones", 0);
      n var2 = aH.a("frame_default", "redstones", 1);
      n var3;
      (var3 = var1.d()).b();
      n var4;
      (var4 = var1.d()).c();
      n var5;
      (var5 = var4.d()).b();
      this.c = new n[]{var1, var2, var3, var4, var5};
      a = aH.a("frame_default", "map", 4);
   }

   public final void a(Client var1, boolean var2) {
      Point var3;
      int var4 = (var3 = this.b(false)).x;
      int var5 = var3.y;
      int var6 = var3.x + 125;
      com.runescape.b var10001 = Client.a;
      var10001 = com.runescape.b.a;
      int var7 = var3.y + 82;
      a.a(33, var1.W, var1.E, var1.z, 25, var3.y + (Client.a == com.runescape.b.a?3:4), var3.x + (Client.a == com.runescape.b.a?28:29), 33, 25);
      if(var2) {
         aH.a("frame_default", "map", Client.a == com.runescape.b.a?1:3).d(var4, var5);
      } else {
         q.b(3, var7, var6, 16777215, 3);
         aH.a("frame_default", "map", Client.a == com.runescape.b.a?0:2).d(var4, var5);
      }
   }

   public final void a(Client var1) {
      Rectangle var2 = s;
      boolean var3 = Client.c >= Client.h;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if(Client.a == com.runescape.b.a) {
         aH.a("frame_default", "tabs", 0).d(0, 0);
         var1.r.a(30, 37);
      } else {
         var4 = var3?Client.c - 461:Client.c - 231;
         var5 = var3?Client.d - 36:Client.d - 73;
         aH.a("frame_default", "tabs", var3?3:2).d(var4, var5);
         if(Client.f) {
            var4 = Client.c - ((int)var2.getWidth() + (var3?0:14));
            var6 = (int)var2.getHeight();
            var7 = var4 + 7;
            var8 = var5 - (var6 - 7);
            q.a(5260860, var5 - var6, var2.width - 1, var2.height - 1, 200, var4);
            var1.r.a(var7, var8);
            aH.a("frame_default", "tabs", 1).d(var4, var5 - var6);
         }
      }

      if(var1.X == -1) {
         if(Client.f && Client.ab >= 0 && Client.ab < 14 && Client.N[Client.ab] >= 0) {
            if(Client.a == com.runescape.b.a) {
               n var12;
               if((var12 = this.c[d[Client.ab]]) != null) {
                  var12.d(e[Client.ab % 7], f[Client.ab]);
               }
            } else {
               boolean var13 = Client.c >= Client.h;
               n var14;
               if((var14 = this.c[1]) != null) {
                  var6 = var13?Client.c - 461:Client.c - 231;
                  var7 = var13?Client.d - 36:Client.d - 73;
                  if(!var13 && Client.ab > 6) {
                     var7 += 36;
                  }

                  var6 += 33 * (!var13?Client.ab % 7:Client.ab);
                  var14.d(var6, var7);
               }
            }
         }

         Client var11 = var1;
         var4 = 0;
         var5 = 0;
         boolean var15 = Client.c >= Client.h;
         if(Client.a != com.runescape.b.a) {
            var4 = var15?Client.c - 462:Client.c - 231;
            var5 = var15?Client.d - 36:Client.d - 72;
         }

         for(var7 = 0; var7 < 14; ++var7) {
            var8 = var4 + e[var7 % 7] + g[var7];
            int var9 = var5 + f[var7] + h[var7];
            if(Client.a != com.runescape.b.a) {
               var8 = var4 + 33 * (!var15?var7 % 7:var7) + i[var7];
               var9 = var5 + j[var7];
               if(!var15 && var7 > 6) {
                  var9 += 36;
               }
            }

            boolean var10 = Client.N[var7] != -1 && var11.D != var7;
            if(var11.D == var7) {
               var10 = Client.S % 20 < 10;
            }

            if(var10) {
               aH.a("frame_default", "sideicons", var7).d(var8, var9);
            }
         }
      }

      if(Client.f) {
         var4 = Client.a == com.runescape.b.a?31:Client.c - 211;
         var5 = Client.a == com.runescape.b.a?36:Client.d - 340;
         if(Client.a != com.runescape.b.a && var3) {
            var4 += 16;
            var5 += 37;
         }

         if(var1.X != -1) {
            var1.a(var4, var5, 190, 260, m.a[var1.X], -1, 0);
            return;
         }

         if(Client.N[Client.ab] != -1) {
            var1.a(var4, var5, 190, 260, m.a[Client.N[Client.ab]], -1, 0);
         }
      }

   }

   public final void b(Client var1) {
      if(var1.aw == 1) {
         int var4;
         int var6;
         int var7;
         int var8;
         int var9;
         if(Client.a == com.runescape.b.a) {
            if(var1.au >= 516 && var1.au <= 765 && var1.av >= 168 && var1.av <= 503) {
               for(var4 = 0; var4 < 14; ++var4) {
                  n var5;
                  if(Client.N[var4] != -1 && (var5 = this.c[d[var4]]) != null) {
                     var7 = (var6 = 516 + e[var4 % 7]) + var5.c;
                     var9 = (var8 = 168 + f[var4]) + var5.d;
                     if(var1.au >= var6 && var1.au < var7 && var1.av >= var8 && var1.av < var9) {
                        Client.ab = var4;
                        Client.L = true;
                        Client.Q = true;
                        return;
                     }
                  }
               }

               return;
            }
         } else {
            boolean var2;
            int var3 = (var2 = Client.c >= Client.h)?Client.c - 461:Client.c - 231;
            var4 = var2?Client.d - 36:Client.d - 73;
            if(var1.au >= var3 && var1.au <= Client.c && var1.av >= var4 && var1.av <= Client.d) {
               for(int var10 = 0; var10 < 14; ++var10) {
                  if(Client.N[var10] != -1) {
                     var7 = (var6 = var3 + 33 * (!var2?var10 % 7:var10)) + 33;
                     var8 = f[var10];
                     if(!var2 && var10 > 6) {
                        var8 += 36;
                     }

                     var9 = var4 + var8 + 36;
                     if(var1.au >= var6 && var1.au < var7 && var1.av >= var8 && var1.av < var9) {
                        if(Client.ab == var10) {
                           Client.f = !Client.f;
                        } else {
                           Client.f = true;
                        }

                        Client.ab = var10;
                        Client.Q = true;
                        Client.L = true;
                        return;
                     }
                  }
               }
            }
         }

      }
   }

   public final void c(Client var1) {
      int var2 = this.a(false);
      if(Client.e) {
         if(Client.g) {
            q.a(13417370, var2, 520, 143, 200, 0);
            aH.a("frame_default", "chat", 1).d(0, var2);
            var1.s.a(7, var2 + 6);
         } else {
            aH.a("frame_default", "chat", 0).d(0, var2);
            var1.s.a(7, var2 + 6);
         }
      }

      if(Client.g) {
         aH.a("frame_default", "chat", 2).d(0, Client.d - 23);
      }

      Client var8 = var1;
      int var7 = this.a(false);
      if(var1.q >= 0 & var1.q <= 6) {
         aH.a("frame_default", "chat", 4).d(n[var1.q], var7 + 142);
      }

      if(var1.p >= 0 & var1.p <= 7) {
         int var3 = var1.p == var1.q?5:(var1.p == 7?6:3);
         aH.a("frame_default", "chat", var3).d(n[var1.p], var7 + 142);
      }

      int[] var9 = new int[]{var1.o, var1.ak, var1.u, var1.m, var1.af, var1.n};

      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         var8.ag.a(16777215, p[var4], q[var4], o[var4] + var7, true);
      }

      for(var4 = 0; var4 < 6; ++var4) {
         int[] var5 = k[m[var4]];
         String[] var6 = l[m[var4]];
         var8.ag.a(var5[var9[var4]], p[var4 + 1], var6[var9[var4]], var7 + 163, true);
      }

   }

   public final int a(boolean var1) {
      return var1?(Client.a == com.runescape.b.a?338:Client.d - 165):(Client.a == com.runescape.b.a?0:Client.d - 165);
   }

   public final Rectangle b() {
      return r;
   }

   public final Rectangle c() {
      return t;
   }

   public final Point b(boolean var1) {
      return new Point(Client.a == com.runescape.b.a?(var1?516:0):Client.c - 238, var1?0:(Client.a == com.runescape.b.a?0:3));
   }

   public final Point d() {
      return b;
   }

   public final boolean e() {
      return false;
   }

   public final n f() {
      return aH.a("frame_default", "sideicons", 1);
   }

   public final int[] g() {
      return n;
   }
}
