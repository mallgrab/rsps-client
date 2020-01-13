package uwotm8;

import uwotm8.C;
import uwotm8.D;
import uwotm8.F;
import uwotm8.K;
import uwotm8.R;
import uwotm8.Y;
import uwotm8.Z;
import uwotm8.ag;
import uwotm8.ap;
import uwotm8.j;
import uwotm8.u;

public final class U {

   private final int[] d;
   private final int[] e;
   private final int[] f;
   private final int[] g;
   private final int[] h;
   private final int[][][] i;
   private final byte[][][] j;
   public static int a;
   private final byte[][][] k;
   private final int[][][] l;
   private final byte[][][] m;
   private static final int[] n = new int[]{1, 0, -1, 0};
   private final int[][] o;
   private static final int[] p = new int[]{16, 32, 64, 128};
   private final byte[][][] q;
   private static final int[] r = new int[]{0, -1, 0, 1};
   public static int b = 99;
   private final int s;
   private final int t;
   private final byte[][][] u;
   private final byte[][][] v;
   public static boolean c = true;
   private static final int[] w = new int[]{1, 2, 4, 8};


   public U(byte[][][] var1, int[][][] var2) {
      b = 99;
      this.s = 104;
      this.t = 104;
      this.i = var2;
      this.v = var1;
      this.q = new byte[4][104][104];
      this.j = new byte[4][104][104];
      this.m = new byte[4][104][104];
      this.u = new byte[4][104][104];
      this.l = new int[4][105][105];
      this.k = new byte[4][105][105];
      this.o = new int[105][105];
      this.d = new int[104];
      this.e = new int[104];
      this.f = new int[104];
      this.g = new int[104];
      this.h = new int[104];
   }

   private static int b(int var0, int var1) {
      int var10000 = (var0 += var1 * 57) << 13 ^ var0;
      return (var10000 * (var10000 * var10000 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) >> 19 & 255;
   }

   public final void a(R[] var1, Y var2) {
      try {
         int var3;
         int var4;
         int var5;
         int var6;
         for(var3 = 0; var3 < 4; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  if((this.v[var3][var4][var5] & 1) == 1) {
                     var6 = var3;
                     if((this.v[1][var4][var5] & 2) == 2) {
                        var6 = var3 - 1;
                     }

                     if(var6 >= 0) {
                        var1[var6].a(var5, var4);
                     }
                  }
               }
            }
         }

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var27;
         for(var3 = 0; var3 < 4; ++var3) {
            byte[][] var30 = this.k[var3];
            var9 = (int)Math.sqrt(5100.0D) * 768 >> 8;

            for(var10 = 1; var10 < 103; ++var10) {
               for(var11 = 1; var11 < 103; ++var11) {
                  var12 = this.i[var3][var11 + 1][var10] - this.i[var3][var11 - 1][var10];
                  var8 = this.i[var3][var11][var10 + 1] - this.i[var3][var11][var10 - 1];
                  var13 = (int)Math.sqrt((double)(var12 * var12 + 65536 + var8 * var8));
                  var14 = (var12 << 8) / var13;
                  var15 = 65536 / var13;
                  var16 = (var8 << 8) / var13;
                  var27 = 96 + (var14 * -50 + var15 * -10 + var16 * -50) / var9;
                  var5 = (var30[var11 - 1][var10] >> 2) + (var30[var11 + 1][var10] >> 3) + (var30[var11][var10 - 1] >> 2) + (var30[var11][var10 + 1] >> 3) + (var30[var11][var10] >> 1);
                  this.o[var11][var10] = var27 - var5;
               }
            }

            for(var10 = 0; var10 < 104; ++var10) {
               this.d[var10] = 0;
               this.e[var10] = 0;
               this.f[var10] = 0;
               this.g[var10] = 0;
               this.h[var10] = 0;
            }

            for(var10 = -5; var10 < 109; ++var10) {
               for(var11 = 0; var11 < 104; ++var11) {
                  if((var12 = var10 + 5) >= 0 && var12 < 104 && (var8 = this.q[var3][var12][var11] & 255) > 0) {
                     Z var31 = Z.b[var8 - 1];
                     this.d[var11] += var31.m;
                     this.e[var11] += var31.h;
                     this.f[var11] += var31.i;
                     this.g[var11] += var31.n;
                     ++this.h[var11];
                  }

                  if((var8 = var10 - 5) >= 0 && var8 < 104 && (var13 = this.q[var3][var8][var11] & 255) > 0) {
                     Z var32 = Z.b[var13 - 1];
                     this.d[var11] -= var32.m;
                     this.e[var11] -= var32.h;
                     this.f[var11] -= var32.i;
                     this.g[var11] -= var32.n;
                     --this.h[var11];
                  }
               }

               if(var10 > 0 && var10 < 103) {
                  var11 = 0;
                  var12 = 0;
                  var8 = 0;
                  var13 = 0;
                  var14 = 0;

                  for(var15 = -5; var15 < 109; ++var15) {
                     if((var16 = var15 + 5) >= 0 && var16 < 104) {
                        var11 += this.d[var16];
                        var12 += this.e[var16];
                        var8 += this.f[var16];
                        var13 += this.g[var16];
                        var14 += this.h[var16];
                     }

                     if((var27 = var15 - 5) >= 0 && var27 < 104) {
                        var11 -= this.d[var27];
                        var12 -= this.e[var27];
                        var8 -= this.f[var27];
                        var13 -= this.g[var27];
                        var14 -= this.h[var27];
                     }

                     if(var15 > 0 && var15 < 103 && (!c || (this.v[0][var10][var15] & 2) != 0 || (this.v[var3][var10][var15] & 16) == 0 && this.c(var15, var3, var10) == a)) {
                        if(var3 < b) {
                           b = var3;
                        }

                        var5 = this.q[var3][var10][var15] & 255;
                        var27 = this.j[var3][var10][var15] & 255;
                        if(var5 > 0 || var27 > 0) {
                           var4 = this.i[var3][var10][var15];
                           var6 = this.i[var3][var10 + 1][var15];
                           var7 = this.i[var3][var10 + 1][var15 + 1];
                           var9 = this.i[var3][var10][var15 + 1];
                           var16 = this.o[var10][var15];
                           int var17 = this.o[var10 + 1][var15];
                           int var18 = this.o[var10 + 1][var15 + 1];
                           int var19 = this.o[var10][var15 + 1];
                           int var20 = -1;
                           int var21 = -1;
                           int var22;
                           if(var5 > 0) {
                              var22 = (var11 << 8) / var13;
                              var21 = var12 / var14;
                              int var23 = var8 / var14;
                              var20 = b(var22, var21, var23);
                              var21 = b(var22, var21, var23);
                           }

                           if(var3 > 0) {
                              boolean var33 = true;
                              if(var5 == 0 && this.m[var3][var10][var15] != 0) {
                                 var33 = false;
                              }

                              if(var27 > 0 && !Z.a[var27 - 1].e) {
                                 var33 = false;
                              }

                              if(var33 && var4 == var6 && var4 == var7 && var4 == var9) {
                                 this.l[var3][var10][var15] |= 2340;
                              }
                           }

                           var22 = 0;
                           if(var20 != -1) {
                              var22 = u.w[f(var21, 96)];
                           }

                           if(var27 == 0) {
                              var2.a(var3, var10, var15, 0, 0, -1, var4, var6, var7, var9, f(var20, var16), f(var20, var17), f(var20, var18), f(var20, var19), 0, 0, 0, 0, var22, 0);
                           } else {
                              var21 = this.m[var3][var10][var15] + 1;
                              byte var34 = this.u[var3][var10][var15];
                              Z var29;
                              if((var5 = (var29 = Z.a[var27 - 1]).c) == 137) {
                                 var5 = 25;
                              }

                              if(var5 > 50) {
                                 var5 = -1;
                              }

                              int var24;
                              int var25;
                              if(var5 >= 0) {
                                 var25 = u.a(var5);
                                 var24 = -1;
                              } else if(var29.d == 16711935) {
                                 var25 = 0;
                                 var24 = -2;
                                 var5 = -1;
                              } else if(var29.d == 3355443) {
                                 var25 = u.w[d(var29.o, 96)];
                                 var24 = -2;
                                 var5 = -1;
                              } else {
                                 var24 = b(var29.g, var29.h, var29.i);
                                 var25 = u.w[d(var29.o, 96)];
                              }

                              if(var25 == 0 && var29.f != -1) {
                                 var27 = b(var29.j, var29.k, var29.l);
                                 var25 = u.w[d(var27, 96)];
                              }

                              var2.a(var3, var10, var15, var21, var34, var5, var4, var6, var7, var9, f(var20, var16), f(var20, var17), f(var20, var18), f(var20, var19), d(var24, var16), d(var24, var17), d(var24, var18), d(var24, var19), var22, var25);
                           }
                        }
                     }
                  }
               }
            }

            for(var10 = 1; var10 < 103; ++var10) {
               for(var11 = 1; var11 < 103; ++var11) {
                  var2.a(var3, var11, var10, this.c(var10, var3, var11));
               }
            }
         }

         var2.e();

         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if((this.v[1][var3][var4] & 2) == 2) {
                  var2.a(var4, var3);
               }
            }
         }

         var3 = 1;
         var4 = 2;
         var5 = 4;

         for(var6 = 0; var6 < 4; ++var6) {
            if(var6 > 0) {
               var3 <<= 3;
               var4 <<= 3;
               var5 <<= 3;
            }

            for(var27 = 0; var27 <= var6; ++var27) {
               for(int var28 = 0; var28 <= 104; ++var28) {
                  for(var7 = 0; var7 <= 104; ++var7) {
                     if((this.l[var27][var7][var28] & var3) != 0) {
                        var8 = var28;
                        var9 = var28;
                        var10 = var27;

                        for(var11 = var27; var8 > 0 && (this.l[var27][var7][var8 - 1] & var3) != 0; --var8) {
                           ;
                        }

                        while(var9 < 104 && (this.l[var27][var7][var9 + 1] & var3) != 0) {
                           ++var9;
                        }

                        label412:
                        while(var10 > 0) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              if((this.l[var10 - 1][var7][var12] & var3) == 0) {
                                 break label412;
                              }
                           }

                           --var10;
                        }

                        label401:
                        while(var11 < var6) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              if((this.l[var11 + 1][var7][var12] & var3) == 0) {
                                 break label401;
                              }
                           }

                           ++var11;
                        }

                        if((var11 + 1 - var10) * (var9 - var8 + 1) >= 8) {
                           var13 = this.i[var11][var7][var8] - 240;
                           var14 = this.i[var10][var7][var8];
                           Y.a(var6, var7 << 7, var14, var7 << 7, (var9 << 7) + 128, var13, var8 << 7, 1);

                           for(var15 = var10; var15 <= var11; ++var15) {
                              for(var16 = var8; var16 <= var9; ++var16) {
                                 this.l[var15][var7][var16] &= ~var3;
                              }
                           }
                        }
                     }

                     if((this.l[var27][var7][var28] & var4) != 0) {
                        var8 = var7;
                        var9 = var7;
                        var10 = var27;

                        for(var11 = var27; var8 > 0 && (this.l[var27][var8 - 1][var28] & var4) != 0; --var8) {
                           ;
                        }

                        while(var9 < 104 && (this.l[var27][var9 + 1][var28] & var4) != 0) {
                           ++var9;
                        }

                        label361:
                        while(var10 > 0) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              if((this.l[var10 - 1][var12][var28] & var4) == 0) {
                                 break label361;
                              }
                           }

                           --var10;
                        }

                        label350:
                        while(var11 < var6) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              if((this.l[var11 + 1][var12][var28] & var4) == 0) {
                                 break label350;
                              }
                           }

                           ++var11;
                        }

                        if((var11 + 1 - var10) * (var9 - var8 + 1) >= 8) {
                           var13 = this.i[var11][var8][var28] - 240;
                           var14 = this.i[var10][var8][var28];
                           Y.a(var6, var8 << 7, var14, (var9 << 7) + 128, var28 << 7, var13, var28 << 7, 2);

                           for(var15 = var10; var15 <= var11; ++var15) {
                              for(var16 = var8; var16 <= var9; ++var16) {
                                 this.l[var15][var16][var28] &= ~var4;
                              }
                           }
                        }
                     }

                     if((this.l[var27][var7][var28] & var5) != 0) {
                        var8 = var7;
                        var9 = var7;
                        var10 = var28;

                        for(var11 = var28; var10 > 0 && (this.l[var27][var7][var10 - 1] & var5) != 0; --var10) {
                           ;
                        }

                        while(var11 < 104 && (this.l[var27][var7][var11 + 1] & var5) != 0) {
                           ++var11;
                        }

                        label310:
                        while(var8 > 0) {
                           for(var12 = var10; var12 <= var11; ++var12) {
                              if((this.l[var27][var8 - 1][var12] & var5) == 0) {
                                 break label310;
                              }
                           }

                           --var8;
                        }

                        label299:
                        while(var9 < 104) {
                           for(var12 = var10; var12 <= var11; ++var12) {
                              if((this.l[var27][var9 + 1][var12] & var5) == 0) {
                                 break label299;
                              }
                           }

                           ++var9;
                        }

                        if((var9 - var8 + 1) * (var11 - var10 + 1) >= 4) {
                           var12 = this.i[var27][var8][var10];
                           Y.a(var6, var8 << 7, var12, (var9 << 7) + 128, (var11 << 7) + 128, var12, var10 << 7, 4);

                           while(var8 <= var9) {
                              for(var13 = var10; var13 <= var11; ++var13) {
                                 this.l[var27][var8][var13] &= ~var5;
                              }

                              ++var8;
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (Exception var26) {
         ;
      }
   }

   private static int c(int var0, int var1) {
      if((var0 = (int)((double)(a(var0 + '\ub135', var1 + 91923, 4) - 128 + (a(var0 + 10294, var1 + '\u93bd', 2) - 128 >> 1) + (a(var0, var1, 1) - 128 >> 2)) * 0.3D) + 35) < 10) {
         var0 = 10;
      } else if(var0 > 60) {
         var0 = 60;
      }

      return var0;
   }

   public static void a(K var0, ag var1) {
      int var2 = -1;

      int var3;
      while((var3 = var0.c()) != 0) {
         j var6;
         if((var6 = j.a(var2 += var3)) != null) {
            j var10000 = var6;
            ag var4 = var1;
            var6 = var6;
            if(var10000.v != null) {
               for(int var5 = 0; var5 < var6.v.length; ++var5) {
                  var4.b(var6.v[var5] & '\uffff', 0);
               }
            }

            while(var0.r() != 0) {
               var0.f();
            }
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 <= var1 + var2; ++var5) {
         for(int var6 = var4; var6 <= var4 + var3; ++var6) {
            if(var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               this.k[0][var6][var5] = 127;
               if(var6 == var4 && var6 > 0) {
                  this.i[0][var6][var5] = this.i[0][var6 - 1][var5];
               }

               if(var6 == var4 + var3 && var6 < 103) {
                  this.i[0][var6][var5] = this.i[0][var6 + 1][var5];
               }

               if(var5 == var1 && var5 > 0) {
                  this.i[0][var6][var5] = this.i[0][var6][var5 - 1];
               }

               if(var5 == var1 + var2 && var5 < 103) {
                  this.i[0][var6][var5] = this.i[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   private void a(int var1, Y var2, R var3, int var4, int var5, int var6, int var7, int var8) {
      if(c && (this.v[0][var6][var1] & 2) == 0) {
         if((this.v[var5][var6][var1] & 16) != 0) {
            return;
         }

         if(this.c(var1, var5, var6) != a) {
            return;
         }
      }

      if(var5 < b) {
         b = var5;
      }

      int var9 = this.i[var5][var6][var1];
      int var10 = this.i[var5][var6 + 1][var1];
      int var11 = this.i[var5][var6 + 1][var1 + 1];
      int var12 = this.i[var5][var6][var1 + 1];
      int var13 = var9 + var10 + var11 + var12 >> 2;
      j var14;
      if((var14 = j.a(var7)) != null) {
         int var15 = var6 + (var1 << 7) + (var7 << 14) + 1073741824;
         j var16;
         if(!((var16 = var14.b()) != null?var16.z:var14.z)) {
            var15 += Integer.MIN_VALUE;
         }

         byte var21 = (byte)((var8 << 6) + var4);
         int var17;
         int var18;
         j var22;
         if(var14.a != 1 || var14.c != null) {
            ap var19;
            (var19 = new ap()).a = var5;
            var19.b = var6;
            var19.j = var1;
            var17 = var14.h;
            var18 = var14.p;
            if(var8 == 1 || var8 == 3) {
               var17 = var14.p;
               var18 = var14.h;
            }

            var19.l = var17 + var6;
            var19.c = var18 + var1;
            var19.e = var14.a;
            var19.d = var14.b;
            var19.g = var14.d;
            var19.h = var14.e;
            var19.i = var14.c;
            if(var14.o != null) {
               var19.k = var14;
               if((var22 = var19.k.b()) != null) {
                  var19.e = var22.a;
                  var19.d = var22.b;
                  var19.g = var22.d;
                  var19.h = var22.e;
                  var19.i = var22.c;
               } else {
                  var19.e = 0;
                  var19.d = 0;
                  var19.g = 0;
                  var19.h = 0;
                  var19.i = null;
               }
            }

            if(var19.i != null) {
               var19.f = var19.g + (int)(Math.random() * (double)(var19.h - var19.g));
            }
         }

         Object var23;
         if(var4 == 22) {
            if(!c || var14.z || var14.f) {
               if(var14.C == -1 && var14.o == null) {
                  var23 = var14.a(22, var8, var9, var10, var11, var12, -1);
               } else {
                  var23 = new D(var7, var8, 22, var10, var11, var9, var12, var14.C, true);
               }

               var2.a(var5, var13, var1, (C)var23, var21, var15, var6);
               if(var14.t && var14.z && var3 != null) {
                  var3.a(var1, var6);
               }

            }
         } else if(var4 != 10 && var4 != 11) {
            if(var4 >= 12) {
               if(var14.C == -1 && var14.o == null) {
                  var23 = var14.a(var4, var8, var9, var10, var11, var12, -1);
               } else {
                  var23 = new D(var7, var8, var4, var10, var11, var9, var12, var14.C, true);
               }

               var2.a(var15, var21, var13, 1, (C)var23, 1, var5, 0, var1, var6);
               if(var4 >= 12 && var4 <= 17 && var4 != 13 && var5 > 0) {
                  this.l[var5][var6][var1] |= 2340;
               }

               if(var14.t && var3 != null) {
                  var3.a(var14.m, var14.h, var14.p, var6, var1, var8);
               }

            } else if(var4 == 0) {
               if(var14.C == -1 && var14.o == null) {
                  var23 = var14.a(0, var8, var9, var10, var11, var12, -1);
               } else {
                  var23 = new D(var7, var8, 0, var10, var11, var9, var12, var14.C, true);
               }

               var2.a(w[var8], (C)var23, var15, var1, var21, var6, (C)null, var13, 0, var5);
               if(var8 == 0) {
                  if(var14.A) {
                     this.k[var5][var6][var1] = 50;
                     this.k[var5][var6][var1 + 1] = 50;
                  }

                  if(var14.r) {
                     this.l[var5][var6][var1] |= 585;
                  }
               } else if(var8 == 1) {
                  if(var14.A) {
                     this.k[var5][var6][var1 + 1] = 50;
                     this.k[var5][var6 + 1][var1 + 1] = 50;
                  }

                  if(var14.r) {
                     this.l[var5][var6][var1 + 1] |= 1170;
                  }
               } else if(var8 == 2) {
                  if(var14.A) {
                     this.k[var5][var6 + 1][var1] = 50;
                     this.k[var5][var6 + 1][var1 + 1] = 50;
                  }

                  if(var14.r) {
                     this.l[var5][var6 + 1][var1] |= 585;
                  }
               } else if(var8 == 3) {
                  if(var14.A) {
                     this.k[var5][var6][var1] = 50;
                     this.k[var5][var6 + 1][var1] = 50;
                  }

                  if(var14.r) {
                     this.l[var5][var6][var1] |= 1170;
                  }
               }

               if(var14.t && var3 != null) {
                  var3.a(var1, var8, var6, var4, var14.m);
               }

               if(var14.x != 16) {
                  var2.b(var1, var14.x, var6, var5);
               }

            } else if(var4 == 1) {
               if(var14.C == -1 && var14.o == null) {
                  var23 = var14.a(1, var8, var9, var10, var11, var12, -1);
               } else {
                  var23 = new D(var7, var8, 1, var10, var11, var9, var12, var14.C, true);
               }

               var2.a(p[var8], (C)var23, var15, var1, var21, var6, (C)null, var13, 0, var5);
               if(var14.A) {
                  if(var8 == 0) {
                     this.k[var5][var6][var1 + 1] = 50;
                  } else if(var8 == 1) {
                     this.k[var5][var6 + 1][var1 + 1] = 50;
                  } else if(var8 == 2) {
                     this.k[var5][var6 + 1][var1] = 50;
                  } else if(var8 == 3) {
                     this.k[var5][var6][var1] = 50;
                  }
               }

               if(var14.t && var3 != null) {
                  var3.a(var1, var8, var6, var4, var14.m);
               }

            } else {
               int var25;
               Object var26;
               if(var4 == 2) {
                  var25 = var8 + 1 & 3;
                  Object var24;
                  if(var14.C == -1 && var14.o == null) {
                     var24 = var14.a(2, var8 + 4, var9, var10, var11, var12, -1);
                     var26 = var14.a(2, var25, var9, var10, var11, var12, -1);
                  } else {
                     var24 = new D(var7, var8 + 4, 2, var10, var11, var9, var12, var14.C, true);
                     var26 = new D(var7, var25, 2, var10, var11, var9, var12, var14.C, true);
                  }

                  var2.a(w[var8], (C)var24, var15, var1, var21, var6, (C)var26, var13, w[var25], var5);
                  if(var14.r) {
                     if(var8 == 0) {
                        this.l[var5][var6][var1] |= 585;
                        this.l[var5][var6][var1 + 1] |= 1170;
                     } else if(var8 == 1) {
                        this.l[var5][var6][var1 + 1] |= 1170;
                        this.l[var5][var6 + 1][var1] |= 585;
                     } else if(var8 == 2) {
                        this.l[var5][var6 + 1][var1] |= 585;
                        this.l[var5][var6][var1] |= 1170;
                     } else if(var8 == 3) {
                        this.l[var5][var6][var1] |= 1170;
                        this.l[var5][var6][var1] |= 585;
                     }
                  }

                  if(var14.t && var3 != null) {
                     var3.a(var1, var8, var6, var4, var14.m);
                  }

                  if(var14.x != 16) {
                     var2.b(var1, var14.x, var6, var5);
                  }

               } else if(var4 == 3) {
                  if(var14.C == -1 && var14.o == null) {
                     var23 = var14.a(3, var8, var9, var10, var11, var12, -1);
                  } else {
                     var23 = new D(var7, var8, 3, var10, var11, var9, var12, var14.C, true);
                  }

                  var2.a(p[var8], (C)var23, var15, var1, var21, var6, (C)null, var13, 0, var5);
                  if(var14.A) {
                     if(var8 == 0) {
                        this.k[var5][var6][var1 + 1] = 50;
                     } else if(var8 == 1) {
                        this.k[var5][var6 + 1][var1 + 1] = 50;
                     } else if(var8 == 2) {
                        this.k[var5][var6 + 1][var1] = 50;
                     } else if(var8 == 3) {
                        this.k[var5][var6][var1] = 50;
                     }
                  }

                  if(var14.t && var3 != null) {
                     var3.a(var1, var8, var6, var4, var14.m);
                  }

               } else if(var4 == 9) {
                  if(var14.C == -1 && var14.o == null) {
                     var23 = var14.a(var4, var8, var9, var10, var11, var12, -1);
                  } else {
                     var23 = new D(var7, var8, var4, var10, var11, var9, var12, var14.C, true);
                  }

                  var2.a(var15, var21, var13, 1, (C)var23, 1, var5, 0, var1, var6);
                  if(var14.t && var3 != null) {
                     var3.a(var14.m, var14.h, var14.p, var6, var1, var8);
                  }

               } else {
                  if(var14.q) {
                     if(var8 == 1) {
                        var25 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var9;
                        var9 = var25;
                     } else if(var8 == 2) {
                        var25 = var12;
                        var12 = var10;
                        var10 = var25;
                        var25 = var11;
                        var11 = var9;
                        var9 = var25;
                     } else if(var8 == 3) {
                        var25 = var12;
                        var12 = var9;
                        var9 = var10;
                        var10 = var11;
                        var11 = var25;
                     }
                  }

                  if(var4 == 4) {
                     if(var14.C == -1 && var14.o == null) {
                        var23 = var14.a(4, 0, var9, var10, var11, var12, -1);
                     } else {
                        var23 = new D(var7, 0, 4, var10, var11, var9, var12, var14.C, true);
                     }

                     var2.a(var15, var1, var8 << 9, var5, 0, var13, (C)var23, var6, var21, 0, w[var8]);
                  } else if(var4 == 5) {
                     var25 = 16;
                     if((var17 = var2.j(var5, var6, var1)) > 0 && (var22 = j.a(var17 >> 14 & 32767)) != null) {
                        var25 = var22.x;
                     }

                     if(var14.C == -1 && var14.o == null) {
                        var26 = var14.a(4, 0, var9, var10, var11, var12, -1);
                     } else {
                        var26 = new D(var7, 0, 4, var10, var11, var9, var12, var14.C, true);
                     }

                     var2.a(var15, var1, var8 << 9, var5, n[var8] * var25, var13, (C)var26, var6, var21, r[var8] * var25, w[var8]);
                  } else if(var4 == 6) {
                     if(var14.C == -1 && var14.o == null) {
                        var23 = var14.a(4, 0, var9, var10, var11, var12, -1);
                     } else {
                        var23 = new D(var7, 0, 4, var10, var11, var9, var12, var14.C, true);
                     }

                     var2.a(var15, var1, var8, var5, 0, var13, (C)var23, var6, var21, 0, 256);
                  } else if(var4 == 7) {
                     if(var14.C == -1 && var14.o == null) {
                        var23 = var14.a(4, 0, var9, var10, var11, var12, -1);
                     } else {
                        var23 = new D(var7, 0, 4, var10, var11, var9, var12, var14.C, true);
                     }

                     var2.a(var15, var1, var8, var5, 0, var13, (C)var23, var6, var21, 0, 512);
                  } else {
                     if(var4 == 8) {
                        if(var14.C == -1 && var14.o == null) {
                           var23 = var14.a(4, 0, var9, var10, var11, var12, -1);
                        } else {
                           var23 = new D(var7, 0, 4, var10, var11, var9, var12, var14.C, true);
                        }

                        var2.a(var15, var1, var8, var5, 0, var13, (C)var23, var6, var21, 0, 768);
                     }

                  }
               }
            }
         } else {
            if(var14.C == -1 && var14.o == null) {
               var23 = var14.a(10, var8, var9, var10, var11, var12, -1);
            } else {
               var23 = new D(var7, var8, 10, var10, var11, var9, var12, var14.C, true);
            }

            if(var23 != null) {
               var17 = 0;
               if(var4 == 11) {
                  var17 += 256;
               }

               if(var8 != 1 && var8 != 3) {
                  var18 = var14.h;
                  var4 = var14.p;
               } else {
                  var18 = var14.p;
                  var4 = var14.h;
               }

               if(var2.a(var15, var21, var13, var4, (C)var23, var18, var5, var17, var1, var6) && var14.A) {
                  F var20;
                  if(var23 instanceof F) {
                     var20 = (F)var23;
                  } else {
                     var20 = var14.a(10, var8, var9, var10, var11, var12, -1);
                  }

                  if(var20 != null) {
                     for(var7 = 0; var7 <= var18; ++var7) {
                        for(var9 = 0; var9 <= var4; ++var9) {
                           if((var10 = var20.p / 4) > 30) {
                              var10 = 30;
                           }

                           if(var10 > this.k[var5][var6 + var7][var1 + var9]) {
                              this.k[var5][var6 + var7][var1 + var9] = (byte)var10;
                           }
                        }
                     }
                  }
               }
            }

            if(var14.t && var3 != null) {
               var3.a(var14.m, var14.h, var14.p, var6, var1, var8);
            }

         }
      }
   }

   private static int a(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      var0 &= var2 - 1;
      int var4 = var1 / var2;
      var1 &= var2 - 1;
      int var5 = e(var3, var4);
      int var6 = e(var3 + 1, var4);
      int var7 = e(var3, var4 + 1);
      var3 = e(var3 + 1, var4 + 1);
      var4 = b(var5, var6, var0, var2);
      var0 = b(var7, var3, var0, var2);
      return b(var4, var0, var1, var2);
   }

   private static int b(int var0, int var1, int var2) {
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

   public static boolean a(int var0, int var1) {
      j var3 = j.a(var0);
      if(var1 == 11) {
         var1 = 10;
      }

      if(var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      if(var3 != null) {
         boolean var10000;
         if(var3.y == null) {
            if(var3.v == null) {
               var10000 = true;
            } else if(var1 != 10) {
               var10000 = true;
            } else {
               boolean var2 = true;

               for(var1 = 0; var1 < var3.v.length; ++var1) {
                  var2 &= F.b(var3.v[var1] & '\uffff');
               }

               var10000 = var2;
            }
         } else {
            int var4 = 0;

            while(true) {
               if(var4 >= var3.y.length) {
                  var10000 = true;
                  break;
               }

               if(var3.y[var4] == var1) {
                  var10000 = F.b(var3.v[var4] & '\uffff');
                  break;
               }

               ++var4;
            }
         }

         if(var10000) {
            return true;
         }
      }

      return false;
   }

   public final void a(int var1, int var2, R[] var3, int var4, int var5, byte[] var6, int var7, int var8, int var9) {
      int var11;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var11 = 0; var11 < 8; ++var11) {
            if(var4 + var10 > 0 && var4 + var10 < 103 && var9 + var11 > 0 && var9 + var11 < 103) {
               var3[var8].a[var4 + var10][var9 + var11] &= -16777217;
            }
         }
      }

      K var17 = new K(var6);

      for(var11 = 0; var11 < 4; ++var11) {
         for(int var15 = 0; var15 < 64; ++var15) {
            for(int var16 = 0; var16 < 64; ++var16) {
               if(var11 == var1 && var15 >= var5 && var15 < var5 + 8 && var16 >= var7 && var16 < var7 + 8) {
                  int var10003 = var15 & 7;
                  int var14 = var16 & 7;
                  int var13 = var10003;
                  int var12;
                  int var10001 = var9 + ((var12 = var2 & 3) == 0?var14:(var12 == 1?7 - var13:(var12 == 2?7 - var14:var13)));
                  int var10006 = var15 & 7;
                  var14 = var16 & 7;
                  var13 = var10006;
                  this.a(var10001, 0, var17, var4 + ((var12 = var2 & 3) == 0?var13:(var12 == 1?var14:(var12 == 2?7 - var13:7 - var14))), var8, var2, 0);
               } else {
                  this.a(-1, 0, var17, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   public final void a(byte[] var1, int var2, int var3, int var4, int var5, R[] var6) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if(var3 + var8 > 0 && var3 + var8 < 103 && var2 + var9 > 0 && var2 + var9 < 103) {
                  var6[var7].a[var3 + var8][var2 + var9] &= -16777217;
               }
            }
         }
      }

      K var11 = new K(var1);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               this.a(var10 + var2, var5, var11, var9 + var3, var8, 0, var4);
            }
         }
      }

   }

   private void a(int var1, int var2, K var3, int var4, int var5, int var6, int var7) {
      try {
         int var8;
         if(var4 >= 0 && var4 < 104 && var1 >= 0 && var1 < 104) {
            this.v[var5][var4][var1] = 0;

            while((var8 = var3.f()) != 0) {
               if(var8 == 1) {
                  if((var2 = var3.f()) == 1) {
                     var2 = 0;
                  }

                  if(var5 == 0) {
                     this.i[0][var4][var1] = -var2 << 3;
                     return;
                  }

                  this.i[var5][var4][var1] = this.i[var5 - 1][var4][var1] - (var2 << 3);
                  return;
               }

               if(var8 <= 49) {
                  this.j[var5][var4][var1] = var3.g();
                  this.m[var5][var4][var1] = (byte)((var8 - 2) / 4);
                  this.u[var5][var4][var1] = (byte)(var8 - 2 + var6 & 3);
               } else if(var8 <= 81) {
                  this.v[var5][var4][var1] = (byte)(var8 - 49);
               } else {
                  this.q[var5][var4][var1] = (byte)(var8 - 81);
               }
            }

            if(var5 == 0) {
               this.i[0][var4][var1] = -c(var4 + 932731 + var7, var1 + 556238 + var2) << 3;
               return;
            }

            this.i[var5][var4][var1] = this.i[var5 - 1][var4][var1] - 240;
            return;
         }

         while((var8 = var3.f()) != 0) {
            if(var8 == 1) {
               var3.f();
               return;
            }

            if(var8 <= 49) {
               var3.f();
            }
         }
      } catch (Exception var9) {
         ;
      }

   }

   private int c(int var1, int var2, int var3) {
      return (this.v[var2][var3][var1] & 8) != 0?0:(var2 > 0 && (this.v[1][var3][var1] & 2) != 0?var2 - 1:var2);
   }

   public final void a(R[] var1, Y var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      K var25 = new K(var7);
      int var11 = -1;

      int var12;
      while((var12 = var25.c()) != 0) {
         var11 += var12;
         var12 = 0;

         int var13;
         while((var13 = var25.r()) != 0) {
            var13 = (var12 += var13 - 1) & 63;
            int var14 = var12 >> 6 & 63;
            int var15 = var12 >> 12;
            int var16;
            int var17 = (var16 = var25.f()) >> 2;
            var16 &= 3;
            j var18;
            if(var15 == var3 && var14 >= var8 && var14 < var8 + 8 && var13 >= var5 && var13 < var5 + 8 && (var18 = j.a(var11)) != null) {
               int var10002 = var16 != 0 && var16 != 2?var18.h:var18.p;
               int var10003 = var14 & 7;
               int var10004 = var13 & 7;
               int var24 = var16 != 0 && var16 != 2?var18.p:var18.h;
               int var23 = var10004;
               int var22 = var10003;
               int var21 = var10002;
               int var20;
               int var19 = var4 + ((var20 = var9 & 3) == 0?var22:(var20 == 1?var23:(var20 == 2?7 - var22 - (var24 - 1):7 - var23 - (var21 - 1))));
               int var10001 = var13 & 7;
               var10002 = var16 != 0 && var16 != 2?var18.h:var18.p;
               var10004 = var16 != 0 && var16 != 2?var18.p:var18.h;
               var24 = var14 & 7;
               var23 = var10004;
               var21 = var10002;
               var20 = var10001;
               var13 = var10 + ((var22 = var9 & 3) == 0?var20:(var22 == 1?7 - var24 - (var23 - 1):(var22 == 2?7 - var20 - (var21 - 1):var24)));
               if(var19 > 0 && var13 > 0 && var19 < 103 && var13 < 103) {
                  var14 = var15;
                  if((this.v[1][var19][var13] & 2) == 2) {
                     var14 = var15 - 1;
                  }

                  R var26 = null;
                  if(var14 >= 0) {
                     var26 = var1[var6];
                  }

                  this.a(var13, var2, var26, var17, var6, var19, var11, var16 + var9 & 3);
               }
            }
         }
      }

   }

   private static int b(int var0, int var1, int var2, int var3) {
      var2 = 65536 - u.r[(var2 << 10) / var3] >> 1;
      return (var0 * (65536 - var2) >> 16) + (var1 * var2 >> 16);
   }

   private static int d(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 0) {
            var1 = 0;
         } else if(var1 > 127) {
            var1 = 127;
         }

         return 127 - var1;
      } else {
         if((var1 = var1 * (var0 & 127) / 128) < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   private static int e(int var0, int var1) {
      int var2 = b(var0 - 1, var1 - 1) + b(var0 + 1, var1 - 1) + b(var0 - 1, var1 + 1) + b(var0 + 1, var1 + 1);
      int var3 = b(var0 - 1, var1) + b(var0 + 1, var1) + b(var0, var1 - 1) + b(var0, var1 + 1);
      var0 = b(var0, var1);
      return var2 / 16 + var3 / 8 + var0 / 4;
   }

   private static int f(int var0, int var1) {
      if(var0 == -1) {
         return 12345678;
      } else {
         if((var1 = var1 * (var0 & 127) / 128) < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   public static void a(Y var0, int var1, int var2, int var3, int var4, R var5, int[][][] var6, int var7, int var8, int var9) {
      int var10 = var6[var4][var7][var2];
      int var11 = var6[var4][var7 + 1][var2];
      int var12 = var6[var4][var7 + 1][var2 + 1];
      var4 = var6[var4][var7][var2 + 1];
      int var19 = var10 + var11 + var12 + var4 >> 2;
      j var13;
      if((var13 = j.a(var8)) != null) {
         int var14 = var7 + (var2 << 7) + (var8 << 14) + 1073741824;
         j var15;
         if(!((var15 = var13.b()) != null?var15.z:var13.z)) {
            var14 += Integer.MIN_VALUE;
         }

         byte var20 = (byte)((var1 << 6) + var3);
         Object var16;
         if(var3 == 22) {
            if(var13.C == -1 && var13.o == null) {
               var16 = var13.a(22, var1, var10, var11, var12, var4, -1);
            } else {
               var16 = new D(var8, var1, 22, var11, var12, var10, var4, var13.C, true);
            }

            var0.a(var9, var19, var2, (C)var16, var20, var14, var7);
            if(var13.t && var13.z) {
               var5.a(var2, var7);
            }

         } else {
            int var17;
            if(var3 != 10 && var3 != 11) {
               if(var3 >= 12) {
                  if(var13.C == -1 && var13.o == null) {
                     var16 = var13.a(var3, var1, var10, var11, var12, var4, -1);
                  } else {
                     var16 = new D(var8, var1, var3, var11, var12, var10, var4, var13.C, true);
                  }

                  var0.a(var14, var20, var19, 1, (C)var16, 1, var9, 0, var2, var7);
                  if(var13.t) {
                     var5.a(var13.m, var13.h, var13.p, var7, var2, var1);
                  }

               } else if(var3 == 0) {
                  if(var13.C == -1 && var13.o == null) {
                     var16 = var13.a(0, var1, var10, var11, var12, var4, -1);
                  } else {
                     var16 = new D(var8, var1, 0, var11, var12, var10, var4, var13.C, true);
                  }

                  var0.a(w[var1], (C)var16, var14, var2, var20, var7, (C)null, var19, 0, var9);
                  if(var13.t) {
                     var5.a(var2, var1, var7, var3, var13.m);
                  }

               } else if(var3 == 1) {
                  if(var13.C == -1 && var13.o == null) {
                     var16 = var13.a(1, var1, var10, var11, var12, var4, -1);
                  } else {
                     var16 = new D(var8, var1, 1, var11, var12, var10, var4, var13.C, true);
                  }

                  var0.a(p[var1], (C)var16, var14, var2, var20, var7, (C)null, var19, 0, var9);
                  if(var13.t) {
                     var5.a(var2, var1, var7, var3, var13.m);
                  }

               } else {
                  int var21;
                  Object var24;
                  if(var3 == 2) {
                     var21 = var1 + 1 & 3;
                     Object var22;
                     if(var13.C == -1 && var13.o == null) {
                        var22 = var13.a(2, var1 + 4, var10, var11, var12, var4, -1);
                        var24 = var13.a(2, var21, var10, var11, var12, var4, -1);
                     } else {
                        var22 = new D(var8, var1 + 4, 2, var11, var12, var10, var4, var13.C, true);
                        var24 = new D(var8, var21, 2, var11, var12, var10, var4, var13.C, true);
                     }

                     var0.a(w[var1], (C)var22, var14, var2, var20, var7, (C)var24, var19, w[var21], var9);
                     if(var13.t) {
                        var5.a(var2, var1, var7, var3, var13.m);
                     }

                  } else if(var3 == 3) {
                     if(var13.C == -1 && var13.o == null) {
                        var16 = var13.a(3, var1, var10, var11, var12, var4, -1);
                     } else {
                        var16 = new D(var8, var1, 3, var11, var12, var10, var4, var13.C, true);
                     }

                     var0.a(p[var1], (C)var16, var14, var2, var20, var7, (C)null, var19, 0, var9);
                     if(var13.t) {
                        var5.a(var2, var1, var7, var3, var13.m);
                     }

                  } else if(var3 == 9) {
                     if(var13.C == -1 && var13.o == null) {
                        var16 = var13.a(var3, var1, var10, var11, var12, var4, -1);
                     } else {
                        var16 = new D(var8, var1, var3, var11, var12, var10, var4, var13.C, true);
                     }

                     var0.a(var14, var20, var19, 1, (C)var16, 1, var9, 0, var2, var7);
                     if(var13.t) {
                        var5.a(var13.m, var13.h, var13.p, var7, var2, var1);
                     }

                  } else {
                     if(var13.q) {
                        if(var1 == 1) {
                           var21 = var4;
                           var4 = var12;
                           var12 = var11;
                           var11 = var10;
                           var10 = var21;
                        } else if(var1 == 2) {
                           var21 = var4;
                           var4 = var11;
                           var11 = var21;
                           var21 = var12;
                           var12 = var10;
                           var10 = var21;
                        } else if(var1 == 3) {
                           var21 = var4;
                           var4 = var10;
                           var10 = var11;
                           var11 = var12;
                           var12 = var21;
                        }
                     }

                     if(var3 == 4) {
                        if(var13.C == -1 && var13.o == null) {
                           var16 = var13.a(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var16 = new D(var8, 0, 4, var11, var12, var10, var4, var13.C, true);
                        }

                        var0.a(var14, var2, var1 << 9, var9, 0, var19, (C)var16, var7, var20, 0, w[var1]);
                     } else if(var3 == 5) {
                        var21 = 16;
                        j var23;
                        if((var17 = var0.j(var9, var7, var2)) > 0 && (var23 = j.a(var17 >> 14 & 32767)) != null) {
                           var21 = var23.x;
                        }

                        if(var13.C == -1 && var13.o == null) {
                           var24 = var13.a(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var24 = new D(var8, 0, 4, var11, var12, var10, var4, var13.C, true);
                        }

                        var0.a(var14, var2, var1 << 9, var9, n[var1] * var21, var19, (C)var24, var7, var20, r[var1] * var21, w[var1]);
                     } else if(var3 == 6) {
                        if(var13.C == -1 && var13.o == null) {
                           var16 = var13.a(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var16 = new D(var8, 0, 4, var11, var12, var10, var4, var13.C, true);
                        }

                        var0.a(var14, var2, var1, var9, 0, var19, (C)var16, var7, var20, 0, 256);
                     } else if(var3 == 7) {
                        if(var13.C == -1 && var13.o == null) {
                           var16 = var13.a(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var16 = new D(var8, 0, 4, var11, var12, var10, var4, var13.C, true);
                        }

                        var0.a(var14, var2, var1, var9, 0, var19, (C)var16, var7, var20, 0, 512);
                     } else {
                        if(var3 == 8) {
                           if(var13.C == -1 && var13.o == null) {
                              var16 = var13.a(4, 0, var10, var11, var12, var4, -1);
                           } else {
                              var16 = new D(var8, 0, 4, var11, var12, var10, var4, var13.C, true);
                           }

                           var0.a(var14, var2, var1, var9, 0, var19, (C)var16, var7, var20, 0, 768);
                        }

                     }
                  }
               }
            } else {
               if(var13.C == -1 && var13.o == null) {
                  var16 = var13.a(10, var1, var10, var11, var12, var4, -1);
               } else {
                  var16 = new D(var8, var1, 10, var11, var12, var10, var4, var13.C, true);
               }

               if(var16 != null) {
                  var17 = 0;
                  if(var3 == 11) {
                     var17 += 256;
                  }

                  int var18;
                  if(var1 != 1 && var1 != 3) {
                     var18 = var13.h;
                     var3 = var13.p;
                  } else {
                     var18 = var13.p;
                     var3 = var13.h;
                  }

                  var0.a(var14, var20, var19, var3, (C)var16, var18, var9, var17, var2, var7);
               }

               if(var13.t) {
                  var5.a(var13.m, var13.h, var13.p, var7, var2, var1);
               }

            }
         }
      }
   }

   public static boolean a(int var0, byte[] var1, int var2) {
      boolean var3 = true;
      K var10 = new K(var1);
      int var4 = -1;

      int var5;
      while((var5 = var10.r()) != 0) {
         var4 += var5;
         var5 = 0;
         boolean var6 = false;

         while(true) {
            if(var6) {
               if(var10.r() == 0) {
                  break;
               }

               var10.f();
            } else {
               int var7;
               if((var7 = var10.r()) == 0) {
                  break;
               }

               var7 = (var5 += var7 - 1) & 63;
               int var8 = var5 >> 6 & 63;
               int var9 = var10.f() >> 2;
               var8 += var0;
               var7 += var2;
               j var12;
               if(var8 > 0 && var7 > 0 && var8 < 103 && var7 < 103 && (var12 = j.a(var4)) != null && (var9 != 22 || !c || var12.z || var12.f)) {
                  j var11 = var12;
                  boolean var10001;
                  if(var12.v == null) {
                     var10001 = true;
                  } else {
                     var6 = true;

                     for(var7 = 0; var7 < var11.v.length; ++var7) {
                        var6 &= F.b(var11.v[var7] & '\uffff');
                     }

                     var10001 = var6;
                  }

                  var3 &= var10001;
                  var6 = true;
               }
            }
         }
      }

      return var3;
   }

   public final void a(int var1, R[] var2, int var3, Y var4, byte[] var5) {
      K var15 = new K(var5);
      int var6 = -1;

      int var7;
      while((var7 = var15.r()) != 0) {
         var6 += var7;
         var7 = 0;

         int var8;
         while((var8 = var15.r()) != 0) {
            var8 = (var7 += var8 - 1) & 63;
            int var9 = var7 >> 6 & 63;
            int var10 = var7 >> 12;
            int var11;
            int var12 = (var11 = var15.f()) >> 2;
            var11 &= 3;
            var9 += var1;
            var8 += var3;
            if(var9 > 0 && var8 > 0 && var9 < 103 && var8 < 103 && var10 >= 0 && var10 < 4) {
               int var13 = var10;
               if((this.v[1][var9][var8] & 2) == 2) {
                  var13 = var10 - 1;
               }

               R var14 = null;
               if(var13 >= 0) {
                  var14 = var2[var13];
               }

               this.a(var8, var4, var14, var12, var10, var9, var6, var11);
            }
         }
      }

   }
}
