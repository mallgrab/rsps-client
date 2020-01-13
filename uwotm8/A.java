package uwotm8;

import com.runescape.Client;
import uwotm8.E;
import uwotm8.F;
import uwotm8.K;
import uwotm8.L;
import uwotm8.aC;
import uwotm8.aE;
import uwotm8.d;
import uwotm8.e;
import uwotm8.g;
import uwotm8.h;
import uwotm8.i;
import uwotm8.w;

public final class A extends w {

   public int ad;
   private long aJ = -1L;
   public h ae;
   public boolean af = false;
   public final int[] ag = new int[5];
   public int ah;
   private int aK;
   public String ai;
   public static L aj = new L(260);
   public int ak;
   public int al;
   public int am;
   public int an;
   public int ao;
   public int ap;
   public boolean aq = false;
   public int ar;
   public int as;
   public int at;
   public F au;
   public final int[] av = new int[12];
   private long aL;
   public int aw;
   public int ax;
   public int ay;
   public int az;
   public int aA;
   public int aB = 0;


   public final F a() {
      if(!this.aq) {
         return null;
      } else {
         A var1 = this;
         F var10000;
         if(this.ae != null) {
            int var7 = -1;
            if(super.y >= 0 && super.B == 0) {
               var7 = d.a[super.y].c[super.z];
            } else if(super.p >= 0) {
               var7 = d.a[super.p].c[super.q];
            }

            var10000 = this.ae.a(-1, var7, (int[])null);
         } else {
            label309: {
               long var26 = this.aL;
               int var2 = -1;
               int var3 = -1;
               int var4 = -1;
               int var5 = -1;
               if(super.y >= 0 && super.B == 0) {
                  d var6;
                  var2 = (var6 = d.a[super.y]).c[super.z];
                  if(super.p >= 0 && super.p != super.j) {
                     var3 = d.a[super.p].c[super.q];
                  }

                  if(var6.i >= 0) {
                     var4 = var6.i;
                     var26 += (long)(var4 - this.av[5] << 40);
                  }

                  if(var6.j >= 0) {
                     var5 = var6.j;
                     var26 += (long)(var5 - this.av[3] << 48);
                  }
               } else if(super.p >= 0) {
                  var2 = d.a[super.p].c[super.q];
               }

               int var10;
               int var11;
               i var12;
               int var13;
               int var14;
               int var15;
               int var16;
               F var24;
               i var32;
               if((var24 = (F)aj.a(var26)) == null) {
                  boolean var9 = false;

                  for(var10 = 0; var10 < 12; ++var10) {
                     var11 = var1.av[var10];
                     if(var5 >= 0 && var10 == 3) {
                        var11 = var5;
                     }

                     if(var4 >= 0 && var10 == 5) {
                        var11 = var4;
                     }

                     if(var11 >= 256 && var11 < 512 && !E.b[var11 - 256].a()) {
                        var9 = true;
                     }

                     if(var11 >= 512) {
                        var32 = i.a(var11 - 512);
                        var13 = var1.aK;
                        var12 = var32;
                        var14 = var32.l;
                        var15 = var12.x;
                        var16 = var12.w;
                        if(var13 == 1) {
                           var14 = var12.E;
                           var15 = var12.k;
                           var16 = var12.i;
                        }

                        boolean var34;
                        if(var14 == -1) {
                           var34 = true;
                        } else {
                           boolean var17 = true;
                           if(!F.b(var14)) {
                              var17 = false;
                           }

                           if(var15 != -1 && !F.b(var15)) {
                              var17 = false;
                           }

                           if(var16 != -1 && !F.b(var16)) {
                              var17 = false;
                           }

                           var34 = var17;
                        }

                        if(!var34) {
                           var9 = true;
                        }
                     }
                  }

                  if(var9) {
                     if(var1.aJ != -1L) {
                        var24 = (F)aj.a(var1.aJ);
                     }

                     if(var24 == null) {
                        var10000 = null;
                        break label309;
                     }
                  }
               }

               if(var24 == null) {
                  F[] var28 = new F[12];
                  var10 = 0;

                  for(var11 = 0; var11 < 12; ++var11) {
                     int var25 = var1.av[var11];
                     if(var5 >= 0 && var11 == 3) {
                        var25 = var5;
                     }

                     if(var4 >= 0 && var11 == 5) {
                        var25 = var4;
                     }

                     F var30;
                     if(var25 >= 256 && var25 < 512 && (var30 = E.b[var25 - 256].b()) != null) {
                        var28[var10++] = var30;
                     }

                     if(var25 >= 512) {
                        var32 = i.a(var25 - 512);
                        var13 = var1.aK;
                        var12 = var32;
                        var14 = var32.l;
                        var15 = var12.x;
                        var16 = var12.w;
                        if(var13 == 1) {
                           var14 = var12.E;
                           var15 = var12.k;
                           var16 = var12.i;
                        }

                        if(var14 == -1) {
                           var10000 = null;
                        } else {
                           F var35 = F.a(var14);
                           if(var15 != -1) {
                              if(var16 != -1) {
                                 var24 = F.a(var15);
                                 F var31 = F.a(var16);
                                 F[] var27 = new F[]{var35, var24, var31};
                                 var35 = new F(3, var27);
                              } else {
                                 var24 = F.a(var15);
                                 F[] var33 = new F[]{var35, var24};
                                 var35 = new F(2, var33);
                              }
                           }

                           if(var13 == 0 && var12.I != 0) {
                              var35.a(0, var12.I, 0);
                           }

                           if(var13 == 1 && var12.a != 0) {
                              var35.a(0, var12.a, 0);
                           }

                           if(var12.g != null) {
                              for(var25 = 0; var25 < var12.g.length; ++var25) {
                                 var35.a(var12.g[var25], var12.c[var25]);
                              }
                           }

                           var10000 = var35;
                        }

                        var30 = var10000;
                        if(var10000 != null) {
                           var28[var10++] = var30;
                        }
                     }
                  }

                  var24 = new F(var10, var28);

                  for(var11 = 0; var11 < 5; ++var11) {
                     if(var1.ag[var11] != 0) {
                        var24.a(Client.C[var11][0], Client.C[var11][var1.ag[var11]]);
                        if(var11 == 1) {
                           var24.a(Client.Z[0], Client.Z[var1.ag[var11]]);
                        }
                     }
                  }

                  var24.d();
                  if(aE.l) {
                     var24.a(64, 850, -30, -50, -30, true);
                  } else {
                     var24.a(84, 1000, -90, -580, -90, true);
                  }

                  aj.a(var24, var26);
                  var1.aJ = var26;
               }

               if(var1.af) {
                  var10000 = var24;
               } else {
                  F var29;
                  (var29 = F.a).a(var24, e.b(var2) & e.b(var3));
                  if(var2 != -1 && var3 != -1) {
                     var29.a(d.a[var1.y].f, var3, var2);
                  } else if(var2 != -1) {
                     var29.c(var2);
                  }

                  var29.c();
                  var29.v = null;
                  var29.u = null;
                  var10000 = var29;
               }
            }
         }

         F var18 = var10000;
         if(var10000 == null) {
            return null;
         } else {
            super.h = var18.aD;
            var18.w = true;
            if(this.af) {
               return var18;
            } else {
               if(super.s != -1 && super.t != -1) {
                  g var20;
                  F var22;
                  if((var22 = (var20 = g.a[super.s]).a()) == null) {
                     return null;
                  }

                  (var22 = new F(true, e.b(super.t), false, var22)).a(0, -super.w, 0);
                  var22.d();
                  var22.c(var20.b.c[super.t]);
                  var22.v = null;
                  var22.u = null;
                  if(var20.c != 128 || var20.d != 128) {
                     var22.b(var20.c, var20.c, var20.d);
                  }

                  var22.a(64 + var20.f, 850 + var20.g, -30, -50, -30, true);
                  F[] var19 = new F[]{var18, var22};
                  var18 = new F(var19);
               }

               if(this.au != null) {
                  if(Client.S >= this.ao) {
                     this.au = null;
                  }

                  if(Client.S >= this.an && Client.S < this.ao) {
                     F var21 = this.au;
                     this.au.a(this.ar - super.V, this.as - this.ap, this.at - super.W);
                     if(super.i == 512) {
                        var21.e();
                        var21.e();
                        var21.e();
                     } else if(super.i == 1024) {
                        var21.e();
                        var21.e();
                     } else if(super.i == 1536) {
                        var21.e();
                     }

                     F[] var23 = new F[]{var18, var21};
                     var18 = new F(var23);
                     if(super.i == 512) {
                        var21.e();
                     } else if(super.i == 1024) {
                        var21.e();
                        var21.e();
                     } else if(super.i == 1536) {
                        var21.e();
                        var21.e();
                        var21.e();
                     }

                     var21.a(super.V - this.ar, this.ap - this.as, super.W - this.at);
                  }
               }

               var18.w = true;
               return var18;
            }
         }
      }
   }

   public final void a(K var1) {
      var1.b = 0;
      this.aK = var1.f();
      this.al = var1.f();
      this.am = var1.f();
      this.ae = null;
      this.ah = 0;

      int var2;
      int var3;
      for(var2 = 0; var2 < 12; ++var2) {
         if((var3 = var1.f()) == 0) {
            this.av[var2] = 0;
         } else {
            int var4 = var1.f();
            this.av[var2] = (var3 << 8) + var4;
            if(var2 == 0 && this.av[0] == '\uffff') {
               this.ae = h.a(var1.h());
               break;
            }

            if(this.av[var2] >= 512 && this.av[var2] - 512 < i.G && (var3 = i.a(this.av[var2] - 512).F) != 0) {
               this.ah = var3;
            }
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         if((var3 = var1.f()) < 0 || var3 >= Client.C[var2].length) {
            var3 = 0;
         }

         this.ag[var2] = var3;
      }

      super.j = var1.h();
      if(super.j == '\uffff') {
         super.j = -1;
      }

      super.k = var1.h();
      if(super.k == '\uffff') {
         super.k = -1;
      }

      super.Z = var1.h();
      if(super.Z == '\uffff') {
         super.Z = -1;
      }

      super.aa = var1.h();
      if(super.aa == '\uffff') {
         super.aa = -1;
      }

      super.ab = var1.h();
      if(super.ab == '\uffff') {
         super.ab = -1;
      }

      super.ac = var1.h();
      if(super.ac == '\uffff') {
         super.ac = -1;
      }

      super.f = var1.h();
      if(super.f == '\uffff') {
         super.f = -1;
      }

      this.ai = aC.c(aC.a(var1.l()));
      this.ak = var1.f();
      this.aA = var1.h();
      this.aB = var1.f();

      try {
         if((var2 = var1.i()) >= 0) {
            this.X = this.i = var2;
         }
      } catch (Exception var5) {
         ;
      }

      this.aq = this.ae == null || this.ae.b != 335;
      this.aL = 0L;

      for(var2 = 0; var2 < 12; ++var2) {
         this.aL <<= 4;
         if(this.av[var2] >= 256) {
            this.aL += (long)(this.av[var2] - 256);
         }
      }

      if(this.av[0] >= 256) {
         this.aL += (long)(this.av[0] - 256 >> 4);
      }

      if(this.av[1] >= 256) {
         this.aL += (long)(this.av[1] - 256 >> 8);
      }

      for(var2 = 0; var2 < 5; ++var2) {
         this.aL <<= 3;
         this.aL += (long)this.ag[var2];
      }

      this.aL <<= 1;
      this.aL += (long)this.aK;
   }

   public final boolean c() {
      return this.aq;
   }

   public final F d() {
      if(!this.aq) {
         return null;
      } else if(this.ae != null) {
         return this.ae.a();
      } else {
         boolean var1 = false;

         int var3;
         i var4;
         int var5;
         int var6;
         int var7;
         i var10000;
         for(int var2 = 0; var2 < 12; ++var2) {
            if((var3 = this.av[var2]) >= 256 && var3 < 512 && !E.b[var3 - 256].c()) {
               var1 = true;
            }

            if(var3 >= 512) {
               var10000 = i.a(var3 - 512);
               var5 = this.aK;
               var4 = var10000;
               var6 = var10000.s;
               var7 = var4.m;
               if(var5 == 1) {
                  var6 = var4.C;
                  var7 = var4.q;
               }

               boolean var16;
               if(var6 == -1) {
                  var16 = true;
               } else {
                  boolean var12 = true;
                  if(!F.b(var6)) {
                     var12 = false;
                  }

                  if(var7 != -1 && !F.b(var7)) {
                     var12 = false;
                  }

                  var16 = var12;
               }

               if(!var16) {
                  var1 = true;
               }
            }
         }

         if(var1) {
            return null;
         } else {
            F[] var9 = new F[12];
            var3 = 0;

            int var11;
            for(int var8 = 0; var8 < 12; ++var8) {
               F var13;
               if((var11 = this.av[var8]) >= 256 && var11 < 512) {
                  var13 = E.b[var11 - 256].d();
                  var9[var3++] = var13;
               }

               if(var11 >= 512) {
                  var10000 = i.a(var11 - 512);
                  var5 = this.aK;
                  var4 = var10000;
                  var6 = var10000.s;
                  var7 = var4.m;
                  if(var5 == 1) {
                     var6 = var4.C;
                     var7 = var4.q;
                  }

                  F var17;
                  if(var6 == -1) {
                     var17 = null;
                  } else {
                     var13 = F.a(var6);
                     if(var7 != -1) {
                        F var15 = F.a(var7);
                        F[] var14 = new F[]{var13, var15};
                        var13 = new F(2, var14);
                     }

                     if(var4.g != null) {
                        for(var6 = 0; var6 < var4.g.length; ++var6) {
                           var13.a(var4.g[var6], var4.c[var6]);
                        }
                     }

                     var17 = var13;
                  }

                  var13 = var17;
                  if(var17 != null) {
                     var9[var3++] = var13;
                  }
               }
            }

            F var10 = new F(var3, var9);

            for(var11 = 0; var11 < 5; ++var11) {
               if(this.ag[var11] != 0) {
                  var10.a(Client.C[var11][0], Client.C[var11][this.ag[var11]]);
                  if(var11 == 1) {
                     var10.a(Client.Z[0], Client.Z[this.ag[var11]]);
                  }
               }
            }

            return var10;
         }
      }
   }

}
