package com.runescape;

import com.runescape.a;
import com.runescape.b;
import com.runescape.c;
import com.runescape.d;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Desktop.Action;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import uwotm8.A;
import uwotm8.B;
import uwotm8.C;
import uwotm8.D;
import uwotm8.E;
import uwotm8.F;
import uwotm8.I;
import uwotm8.K;
import uwotm8.M;
import uwotm8.O;
import uwotm8.R;
import uwotm8.U;
import uwotm8.Y;
import uwotm8.Z;
import uwotm8.aA;
import uwotm8.aB;
import uwotm8.aC;
import uwotm8.aE;
import uwotm8.aF;
import uwotm8.aH;
import uwotm8.aK;
import uwotm8.aL;
import uwotm8.aM;
import uwotm8.aN;
import uwotm8.aa;
import uwotm8.ab;
import uwotm8.ac;
import uwotm8.ad;
import uwotm8.ae;
import uwotm8.af;
import uwotm8.ag;
import uwotm8.ai;
import uwotm8.aj;
import uwotm8.ak;
import uwotm8.am;
import uwotm8.an;
import uwotm8.ao;
import uwotm8.at;
import uwotm8.au;
import uwotm8.av;
import uwotm8.aw;
import uwotm8.ax;
import uwotm8.ay;
import uwotm8.az;
import uwotm8.E;
import uwotm8.G;
import uwotm8.H;
import uwotm8.I;
import uwotm8.J;
import uwotm8.K;
import uwotm8.L;
import uwotm8.M;
import uwotm8.N;
import uwotm8.O;
import uwotm8.P;
import uwotm8.Q;
import uwotm8.R;
import uwotm8.T;
import uwotm8.U;
import uwotm8.V;
import uwotm8.W;
import uwotm8.X;
import uwotm8.Y;
import uwotm8.Z;

public class Client extends c {

   public static b a = b.a;
   public static int b = 1;
   public static int c = 765;
   public static int d = 503;
   private static int aD = 512;
   private static int aE = 334;
   public static boolean e = true;
   public static boolean f = true;
   public static boolean g = false;
   public static int h = 1000;
   private int aF;
   private final String[] aG = new String[100];
   private final int[] aH = new int[100];
   public static int i;
   public static int j = 100;
   private int aI = -1;
   private int aJ = -1;
   private String aK = "";
   public static Client k;
   private static final int[] aL = new int[]{0, 3, 14, 2, 16, 13, 1, 15, 10, 4, 17, 7, 5, 12, 11, 6, 9, 8, 20, 18, 19, 22, 21};
   private int aM;
   private int aN;
   private int aO;
   private boolean aP;
   private String aQ;
   public static int l = 9;
   private boolean aR;
   private static boolean aS = false;
   private static boolean aT = false;
   private double aU;
   private int aV;
   private int aW;
   private String aX;
   private final int aY;
   private final int[] aZ;
   private final boolean[] ba;
   private int bb;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   private n bc;
   private n bd;
   public n r;
   public n s;
   public static aK t;
   private t be;
   private t bf;
   private int bg;
   private long bh;
   private int[][] bi;
   private int[] bj;
   private O[][][] bk;
   private volatile boolean bl;
   private Socket bm;
   private int bn;
   private K bo;
   private z[] bp;
   private int bq;
   private int[] br;
   private int bs;
   private int[] bt;
   private int bu;
   private int bv;
   private int bw;
   private String bx;
   public int u;
   private K by;
   private boolean bz;
   private static int bA;
   private static int bB;
   private int bC;
   static int v;
   private int bD;
   private int bE;
   private int bF;
   private int bG;
   private int bH;
   private int bI;
   private final int[] bJ;
   private n bK;
   private n bL;
   private boolean bM;
   private final int[] bN;
   private final boolean[] bO;
   private long bP;
   private int bQ;
   private int bR;
   private int bS;
   private az bT;
   private String bU;
   private String[] bV;
   private int bW;
   private boolean bX;
   private int bY;
   private String bZ;
   private final int ca;
   private final int cb;
   private A[] cc;
   private int cd;
   private int[] ce;
   private int cf;
   private int[] cg;
   private K[] ch;
   private int ci;
   private int cj;
   private int ck;
   private int cl;
   private int[][] cm;
   private byte[] cn;
   private int co;
   private int cp;
   private int cq;
   private int cr;
   private int cs;
   private int ct;
   private final int[] cu;
   private static int cv;
   private long[] cw;
   private boolean cx;
   private final int[] cy;
   private int[][] cz;
   private n cA;
   private n cB;
   private int cC;
   private int cD;
   private int cE;
   private int cF;
   private int cG;
   private int cH;
   private final int[] cI;
   private final String[] cJ;
   private final String[] cK;
   private final String[] cL;
   private int cM;
   private Y cN;
   public n[] w;
   private int cO;
   private int cP;
   private int cQ;
   private int cR;
   private long cS;
   private boolean cT;
   private long[] cU;
   private long[] cV;
   private int[] cW;
   private int cX;
   private static int cY = 10;
   public static int x;
   private static boolean cZ = false;
   static int y = -1;
   private static boolean da = true;
   private int db;
   private int dc;
   private final int[] dd;
   public final int[] z;
   public final uwotm8.c[] A;
   public int[] B;
   private boolean de;
   private final int df;
   private final int[] dg;
   private final int[] dh;
   private final int[] di;
   private final int[] dj;
   private final int[] dk;
   private final int[] dl;
   private final int[] dm;
   private final String[] dn;
   private int do;
   private boolean dp;
   private int dq;
   private static int dr;
   private n[] ds;
   private int dt;
   private int[] du;
   private final boolean dv;
   private int dw;
   private int dx;
   private int dy;
   private int dz;
   private int dA;
   private ae dB;
   private n dC;
   private n dD;
   public static final int[][] C = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, '\u83a1', 22433, 2983, '\ud3b1'}, {8741, 12, '\ufa1e', '\ua89a', 7735, 8404, 1701, '\u961e', 24094, 10153, '\udd2d', 4783, 1341, 16578, '\u88bb', 25239}, {25238, 8742, 12, '\ufa1e', '\ua89a', 7735, 8404, 1701, '\u961e', 24094, 10153, '\udd2d', 4783, 1341, 16578, '\u88bb'}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
   private String dE;
   private String dF;
   private static int dG;
   private int dH;
   private int dI;
   private int dJ;
   private int dK;
   private int dL;
   private int dM;
   private O dN;
   private int dO;
   private int dP;
   private int dQ;
   private boolean dR;
   private int dS;
   private boolean dT;
   private static final int[] dU = new int[99];
   private int dV;
   private int dW;
   private n dX;
   private n dY;
   private k dZ;
   private k ea;
   private int eb;
   private final int[] ec;
   private boolean ed;
   private n[] ee;
   private int ef;
   private int eg;
   private int eh;
   private int ei;
   private int ej;
   private int ek;
   private int el;
   private final int[] em;
   private final int[] en;
   private int eo;
   private boolean ep;
   private int eq;
   private String er;
   private static int es;
   private final int[] et;
   private I eu;
   public int D;
   private int ev;
   private O ew;
   public final int[] E;
   private m ex;
   private k[] ey;
   private int ez;
   private final int eA;
   private int eB;
   private final int[] eC;
   private int eD;
   private int eE;
   public ag F;
   private int eF;
   private int eG;
   private int eH;
   private int[] eI;
   private int[] eJ;
   private n eK;
   private n eL;
   private n eM;
   private n eN;
   private n eO;
   private n eP;
   private int eQ;
   private boolean eR;
   private String[] eS;
   private K eT;
   private int eU;
   private int eV;
   private int eW;
   private int eX;
   private int eY;
   public static int G;
   private static int eZ = 0;
   private int fa;
   public static int H = 600;
   public static int I = 180;
   public static int J = 900;
   private final int[] fb;
   private int[] fc;
   private int[] fd;
   public int[] K;
   private int[] fe;
   private n ff;
   private n[] fg;
   private n[] fh;
   private n[] fi;
   private static int fj;
   private int fk;
   private int fl;
   private int fm;
   private int fn;
   private int fo;
   public static boolean L;
   private int fp;
   private String fq;
   private t fr;
   private t fs;
   private t ft;
   private t fu;
   private t fv;
   private t fw;
   private t fx;
   private t fy;
   private t fz;
   private static int fA;
   private int fB;
   private String fC;
   private n fD;
   private t fE;
   private t fF;
   private t fG;
   public static A M;
   private final String[] fH;
   private final boolean[] fI;
   private final int[][][] fJ;
   public static final int[] N = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   private int fK;
   public int O;
   private static int fL;
   private int fM;
   private int fN;
   private int fO;
   private String fP;
   private n[] fQ;
   private boolean fR;
   private int fS;
   private boolean fT;
   private n[] fU;
   private static boolean fV;
   public static boolean P;
   public static boolean Q;
   private int fW;
   private static int fX;
   private static boolean fY;
   public static boolean R;
   private boolean fZ;
   private boolean ga;
   private boolean gb;
   private boolean gc;
   public static int S;
   private static t gd;
   private t ge;
   private static t gf;
   private static t gg;
   private int gh;
   private aj gi;
   private int gj;
   public static String T = "";
   public static String U = "";
   public static boolean V = false;
   private static int gk = -1;
   private static String gl = "";
   private static int gm;
   private boolean gn;
   private final int[] go;
   private int gp;
   private int gq;
   private O gr;
   private static int[] gs;
   private static int[] gt;
   private byte[][] gu;
   private int gv;
   public int W;
   private int gw;
   private int gx;
   private static int gy;
   public int X;
   private K gz;
   private int gA;
   private int gB;
   private k gC;
   public String[] Y;
   private final int[] gD;
   public static final int[] Z = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, '\u9792', 24466, 10145, '\ue51e', 5027, 1457, 16565, '\u88af', 25486};
   private final int[] gE;
   private int gF;
   static int aa;
   private String gG;
   private int gH;
   private int[][][] gI;
   private long gJ;
   private int gK;
   private final k[] gL;
   private long gM;
   public static int ab;
   private int gN;
   public static boolean ac;
   public int ad;
   private static int gO;
   private int gP;
   private boolean gQ;
   private int gR;
   private boolean gS;
   private at gT;
   private final int[] gU;
   private R[] gV;
   public static int[] ae;
   private int[] gW;
   private int[] gX;
   private int[] gY;
   private int gZ;
   private boolean ha;
   private int hb;
   private int hc;
   private int hd;
   private int he;
   private byte[][] hf;
   public int af;
   private int hg;
   private final int[] hh;
   private final int[] hi;
   private int hj;
   private final boolean hk;
   private int hl;
   private boolean hm;
   private boolean hn;
   private byte[][][] ho;
   private int hp;
   private int hq;
   private int hr;
   private n hs;
   private int ht;
   private int hu;
   private String hv;
   private String hw;
   private int hx;
   private int hy;
   public o ag;
   private o hz;
   private o hA;
   private o hB;
   private o hC;
   private o hD;
   private o hE;
   private o hF;
   private o hG;
   public l ah;
   public l ai;
   private l hH;
   private l hI;
   private l hJ;
   private l hK;
   private l hL;
   private l hM;
   private l hN;
   public int aj;
   private int hO;
   private int[] hP;
   private int[] hQ;
   private int hR;
   private int hS;
   private int hT;
   private int hU;
   private String hV;
   public int ak;
   private static int hW;
   private static String hX = "";
   private int hY;
   private int hZ;
   private int ia;
   private int ib;
   private int ic;
   private int id;
   private ak ie;
   private r if;
   private r ig;


   static {
      int var0 = 0;

      int var1;
      for(var1 = 0; var1 < 99; ++var1) {
         int var2 = (int)((double)(var2 = var1 + 1) + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var2;
         dU[var1] = var0 / 4;
      }

      ae = new int[32];
      var0 = 2;

      for(var1 = 0; var1 < 32; ++var1) {
         ae[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static b a() {
      return a;
   }

   private void a(b var1) {
      if(a != var1) {
         a = var1;
         if(var1 == b.a) {
            c = 765;
            d = 503;
            H = aE.h;
            l = 9;
            g = false;
         } else if(var1 == b.b) {
            int var2 = 765 * b;
            int var3 = 503 * b;
            c = aE.d >= var2?aE.d:var2;
            d = aE.e >= var3?aE.e:var3;
            H = aE.h;
            l = 10;
         } else if(var1 == b.c) {
            H = aE.h;
            l = 10;
            c = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            d = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
         }

         if(var1 != b.a) {
            g = true;
         }

         a(var1, c, d);
         this.b(161, a == b.a?0:1);
      }

      e = var1 == b.a?true:e;
      f = var1 == b.a?true:f;
   }

   public static void a(b var0, int var1, int var2) {
      try {
         aD = var0 == b.a?512:var1;
         aE = var0 == b.a?334:var2;
         c = var1;
         d = var2;
         boolean var10001;
         boolean var10004;
         b var10005;
         if(var0 == b.a) {
            var10001 = var0 == b.c;
            int var10002 = var1 * b;
            int var10003 = var2 * b;
            var10004 = var0 == b.b;
            var10005 = b.a;
            k.a(var10001, var10002, var10003, var10004);
         } else {
            c /= b;
            d /= b;
            var10001 = var0 == b.c;
            var10004 = var0 == b.b;
            var10005 = b.a;
            k.a(var10001, var1, var2, var10004);
         }

         r();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private static void n() {
      u.b(c / b, d / b);
      int[] var10000 = u.s;
   }

   private static void o() {
      u.b(a == b.a?(gg != null?gg.a:519):c / b, a == b.a?(gg != null?gg.b:165):d / b);
      int[] var10000 = u.s;
   }

   private static void p() {
      u.b(a == b.a?(gd != null?gd.a:249):c / b, a == b.a?(gd != null?gd.b:335):d / b);
      gs = u.s;
   }

   private static void q() {
      int var0 = a != b.a?b:1;
      u.b(aD / var0, aE / var0);
      gt = u.s;
   }

   private static void r() {
      n();
      o();
      p();
      q();
      s();
   }

   private static void s() {
      int[] var0 = new int[9];

      for(int var1 = 0; var1 < 9; ++var1) {
         int var2 = 128 + (var1 << 5) + 15;
         int var3 = 600 + var2 * 3;
         var2 = u.h[var2];
         var0[var1] = var3 * var2 >> 16;
      }

      Y.a(aD, aE, var0);
      if(R) {
         gf = new t(aD, aE);
      }

   }

   public final boolean b() {
      return e && (super.au > 0 && super.au < 519 && super.av > d - 165 && super.av < d || super.au > c - 220 && super.au < c && super.av > 0 && super.av < 165);
   }

   public final boolean c() {
      if(a != b.a && this.a(c - (c <= h?240:480), d - (c <= h?90:37), c, d)) {
         return false;
      } else if(this.t()) {
         return false;
      } else {
         boolean var10000;
         if(f) {
            if(c > h) {
               if(super.au >= c - 420 && super.au <= c && super.av >= d - 37 && super.av <= d || super.au > c - 204 && super.au < c && super.av > d - 37 - 274 && super.av < d) {
                  var10000 = true;
                  return !var10000 && !this.b();
               }
            } else if(super.au >= c - 210 && super.au <= c && super.av >= d - 74 && super.av <= d || super.au > c - 225 && super.au < c && super.av > d - 74 - 274 && super.av < d) {
               var10000 = true;
               return !var10000 && !this.b();
            }
         }

         var10000 = false;
         return !var10000 && !this.b();
      }
   }

   private boolean a(int var1, int var2, int var3, int var4) {
      return super.au >= var1 && super.au <= var3 && super.av >= var2 && super.av <= var4;
   }

   private boolean b(int var1, int var2, int var3, int var4) {
      return super.au >= var1 && super.au < var1 + var3 && super.av >= var2 && super.av < var2 + var4;
   }

   private boolean c(int var1, int var2, int var3, int var4) {
      return super.ax >= var1 && super.ax < var1 + var3 && super.ay >= var2 && super.ay < var2 + var4;
   }

   private boolean t() {
      Point var1;
      int var2 = (var1 = t.b(true)).x + t.d().x;
      int var3 = var1.y + t.d().y;
      return super.au >= var2 && super.au <= var2 + 146 && super.av >= var3 && super.av <= var3 + 151;
   }

   private void u() {
      try {
         this.aI = -1;
         if(a == b.a) {
            if(Q || L) {
               this.D();
               if(Q) {
                  Q = false;
               }

               if(L) {
                  L = false;
               }
            }

            if(ac) {
               this.y();
               ac = false;
            }
         } else {
            this.D();
            this.y();
         }

         Client var1 = this;
         if(a == b.a) {
            this.ge.a();
         }

         int var4;
         int var5;
         int var6;
         int var8;
         if(this.dV == 2) {
            t.a(this, true);
            if(this.bX) {
               this.e(a == b.a?516:0, 0);
            }

            if(a == b.a) {
               this.ge.a();
            }
         } else {
            Point var2;
            int var3 = (var2 = t.b(false)).x + t.d().x;
            int var16 = var2.y + t.d().y;
            var4 = this.W & 2047;
            var5 = 48 + M.V / 32;
            var6 = 464 - M.W / 32;
            if(this.dW == 2) {
               this.hs.a(151, var4, this.gU, this.et, var6, var16, var3, 146, var5);

               for(var16 = 0; var16 < var1.eH; ++var16) {
                  var3 = (var1.eI[var16] << 2) + 2 - M.V / 32;
                  var4 = (var1.eJ[var16] << 2) + 2 - M.W / 32;
                  var1.b(var1.fQ[var16], var3, var4);
               }

               for(var16 = 0; var16 < 104; ++var16) {
                  for(var3 = 0; var3 < 104; ++var3) {
                     if(var1.bk[var1.ct][var16][var3] != null) {
                        var5 = (var16 << 2) + 2 - M.V / 32;
                        var6 = (var3 << 2) + 2 - M.W / 32;
                        var1.b(var1.eK, var5, var6);
                     }
                  }
               }

               for(var16 = 0; var16 < var1.bq; ++var16) {
                  z var17;
                  if((var17 = var1.bp[var1.br[var16]]) != null && var17.c()) {
                     h var18 = var17.ad;
                     if(var17.ad.r != null) {
                        var18 = var18.b();
                     }

                     if(var18 != null && var18.q && var18.p) {
                        var5 = var17.V / 32 - M.V / 32;
                        var6 = var17.W / 32 - M.W / 32;
                        var1.b(var1.eL, var5, var6);
                     }
                  }
               }

               for(var16 = 0; var16 < var1.cd; ++var16) {
                  A var19;
                  if((var19 = var1.cc[var1.ce[var16]]) != null && var19.aq) {
                     var4 = var19.V / 32 - M.V / 32;
                     var5 = var19.W / 32 - M.W / 32;
                     boolean var24 = false;
                     boolean var7 = false;

                     for(int var9 = 0; var9 < var1.ck; ++var9) {
                        if(var1.cV[var9] > 0L && aC.a(var1.cV[var9]).equalsIgnoreCase(var19.ai)) {
                           var7 = true;
                           break;
                        }
                     }

                     long var27 = aC.a(var19.ai);

                     for(var8 = 0; var8 < var1.cj; ++var8) {
                        if(var27 == var1.cU[var8] && var1.bj[var8] != 0) {
                           var24 = true;
                           break;
                        }
                     }

                     boolean var26 = false;
                     if(M.ah != 0 && var19.ah != 0 && M.ah == var19.ah) {
                        var26 = true;
                     }

                     if(var24) {
                        var1.b(var1.eN, var4, var5);
                     } else if(var7) {
                        var1.b(var1.eP, var4, var5);
                     } else if(var26) {
                        var1.b(var1.eO, var4, var5);
                     } else {
                        var1.b(var1.eM, var4, var5);
                     }
                  }
               }

               if(var1.bC != 0 && S % 20 < 10) {
                  z var20;
                  if(var1.bC == 1 && var1.gN >= 0 && var1.gN < var1.bp.length && (var20 = var1.bp[var1.gN]) != null) {
                     var3 = var20.V / 32 - M.V / 32;
                     var4 = var20.W / 32 - M.W / 32;
                     var1.a(var1.bL, var4, var3);
                  }

                  if(var1.bC == 2) {
                     var16 = (var1.cD - var1.ef << 2) + 2 - M.V / 32;
                     var3 = (var1.cE - var1.eg << 2) + 2 - M.W / 32;
                     var1.a(var1.bL, var3, var16);
                  }

                  A var21;
                  if(var1.bC == 10 && var1.cC >= 0 && var1.cC < var1.cc.length && (var21 = var1.cc[var1.cC]) != null) {
                     var3 = var21.V / 32 - M.V / 32;
                     var4 = var21.W / 32 - M.W / 32;
                     var1.a(var1.bL, var4, var3);
                  }
               }

               if(var1.hq != 0) {
                  var16 = (var1.hq << 2) + 2 - M.V / 32;
                  var3 = (var1.hr << 2) + 2 - M.W / 32;
                  var1.b(var1.bK, var16, var3);
               }
            }

            t.a(var1, false);
         }

         Client var22 = var1;

         try {
            if(aE.j) {
               boolean var23;
               var5 = (var23 = a == b.a)?0:c - 240;
               var4 = var23?18:22;
               var6 = aN.d()?2:0;
               aH.a("xpdrop", var22.aO == 0?var6 + 1:var6).d(var5, var4);
               var23 = a == b.a;
               var5 = var22.cu[3];
               var6 = var22.em[3];
               double var12 = (double)(var6 = (int)((double)var5 / (double)var6 * 100.0D)) / 100.0D;
               int var11 = 26 - (int)(var12 * 26.0D);
               boolean var29 = aE.k;
               Point var13 = new Point(!var29?0:192, 40);
               Point var25 = new Point(!var29?c - 240:c - 57, 44);
               var8 = var23?var13.x:var25.x;
               var4 = var23?var13.y:var25.y;
               aH.a("orbs", var22.aO == 1?(!var29?1:3):(!var29?0:2)).d(var8, var4);
               aH.a("orbs", var22.bR).d(var8 + (!var29?27:4), var4 + 4);
               n var30;
               (var30 = aH.a("orbs", 4)).d = var11 < 0?0:var11;
               var30.d(var8 + (!var29?27:4), var4 + 4);
               aH.a("orbs", 5).d(var8 + (!var29?33:9), var4 + 10);
               var22.ag.a(m(var6), var8 + (!var29?15:45), String.valueOf(var5), var4 + 26, true);
               var23 = a == b.a;
               var5 = var22.cu[5];
               var6 = var22.em[5];
               var12 = (double)(var6 = (int)((double)var5 / (double)var6 * 100.0D)) / 100.0D;
               var11 = 26 - (int)(var12 * 26.0D);
               var29 = aE.k;
               var13 = new Point(!var29?2:190, 80);
               var25 = new Point(!var29?c - 238:c - 57, 84);
               var8 = var23?var13.x:var25.x;
               var4 = var23?var13.y:var25.y;
               aH.a("orbs", var22.aO == 2?(!var29?1:3):(!var29?0:2)).d(var8, var4);
               aH.a("orbs", 12).d(var8 + (!var29?27:4), var4 + 4);
               (var30 = aH.a("orbs", 4)).d = var11 < 0?0:var11;
               var30.d(var8 + (!var29?27:4), var4 + 4);
               aH.a("orbs", 6).d(var8 + (!var29?30:7), var4 + 7);
               var22.ag.a(m(var6), var8 + (!var29?15:45), String.valueOf(var5), var4 + 26, true);
               var23 = a == b.a;
               var5 = var22.fS;
               double var28 = (double)(var6 = (int)((double)var22.fS / 100.0D * 100.0D)) / 100.0D;
               var11 = 26 - (int)(var28 * 26.0D);
               var29 = aE.k;
               var13 = new Point(!var29?18:174, 120);
               var25 = new Point(!var29?c - 222:c - 57, 124);
               var8 = var23?var13.x:var25.x;
               var4 = var23?var13.y:var25.y;
               aH.a("orbs", var22.aO == 3?(!var29?1:3):(!var29?0:2)).d(var8, var4);
               aH.a("orbs", var22.aP?15:14).d(var8 + (!var29?27:4), var4 + 4);
               (var30 = aH.a("orbs", 4)).d = var11 < 0?0:var11;
               var30.d(var8 + (!var29?27:4), var4 + 4);
               aH.a("orbs", var22.aP?8:7).d(var8 + (!var29?33:10), var4 + 8);
               var22.ag.a(m(var6), var8 + (!var29?15:45), String.valueOf(var5), var4 + 26, true);
            }
         } catch (Exception var14) {
            ;
         }

         if(var1.bX) {
            var1.e(a == b.a?516:0, 0);
         }

         if(a == b.a) {
            gf.a();
            var1.ge.a(0, var1.ao, 516);
         }

      } catch (Exception var15) {
         ao.b("Game Frame Drawing, " + var15.toString());
         throw new RuntimeException();
      }
   }

   private static String v() {
      String var0;
      Pattern var1;
      BufferedReader var2;
      String var3;
      String var4;
      Matcher var5;
      Process var15;
      if(!(var0 = System.getProperty("os.name")).startsWith("Linux") && !var0.startsWith("HP-UX")) {
         if(var0.startsWith("Mac")) {
            var15 = null;
            var1 = Pattern.compile("([a-fA-F0-9]{1,2}(-|:)){5}[a-fA-F0-9]{1,2}");

            try {
               var15 = Runtime.getRuntime().exec("ifconfig");
            } catch (IOException var8) {
               var8.printStackTrace();
            }

            try {
               var15.waitFor();
            } catch (InterruptedException var7) {
               var7.printStackTrace();
            }

            var2 = new BufferedReader(new InputStreamReader(var15.getInputStream()));
            var3 = "";
            var4 = "";

            try {
               while((var3 = var2.readLine()) != null) {
                  var4 = var4 + var3 + "\n";
               }
            } catch (IOException var13) {
               var13.printStackTrace();
            }

            if((var5 = var1.matcher(var4)).find()) {
               var3 = var5.group(0);
            } else {
               System.out.println("Error parsing output");
            }

            return var3;
         } else {
            var0 = null;
            HashMap var16 = new HashMap();
            Enumeration var17 = null;

            try {
               var17 = NetworkInterface.getNetworkInterfaces();
            } catch (SocketException var10) {
               var10.printStackTrace();
            }

            while(var17.hasMoreElements()) {
               NetworkInterface var18 = (NetworkInterface)var17.nextElement();
               byte[] var19 = null;

               try {
                  var19 = var18.getHardwareAddress();
               } catch (SocketException var9) {
                  var9.printStackTrace();
               }

               if(var19 != null) {
                  StringBuilder var20 = new StringBuilder();

                  for(int var6 = 0; var6 < var19.length; ++var6) {
                     var20.append(String.format("%02X%s", new Object[]{Byte.valueOf(var19[var6]), var6 < var19.length - 1?"-":""}));
                  }

                  if(!var20.toString().isEmpty()) {
                     var16.put(var18.getName(), var20.toString());
                  }

                  if(!var20.toString().isEmpty() && var0 == null) {
                     var0 = var18.getName();
                  }
               }
            }

            return var0 != null?(String)var16.get(var0):null;
         }
      } else {
         var15 = null;
         var1 = Pattern.compile("([a-fA-F0-9]{1,2}(-|:)){5}[a-fA-F0-9]{1,2}");

         try {
            var15 = Runtime.getRuntime().exec("ip addr show");
         } catch (IOException var12) {
            var12.printStackTrace();
         }

         try {
            var15.waitFor();
         } catch (InterruptedException var11) {
            var11.printStackTrace();
         }

         var2 = new BufferedReader(new InputStreamReader(var15.getInputStream()));
         var3 = "";
         var4 = "";

         try {
            while((var3 = var2.readLine()) != null) {
               var4 = var4 + var3 + "\n";
            }
         } catch (IOException var14) {
            var14.printStackTrace();
         }

         var4 = var4.replace("00:00:00:00:00:00", "").replace("ff:ff:ff:ff:ff:ff", "");
         if((var5 = var1.matcher(var4)).find()) {
            var3 = var5.group(0);
         } else {
            System.out.println("Error parsing output");
         }

         return var3;
      }
   }

   private void w() {
      String var1 = null;

      for(int var2 = 0; var2 < 100; ++var2) {
         int var3;
         if(this.cK[var2] != null && ((var3 = this.cI[var2]) == 3 || var3 == 7)) {
            var1 = this.cJ[var2];
            break;
         }
      }

      if(var1 == null) {
         this.a("You haven\'t received any messages to which you can reply.", 0, "");
      } else {
         if(var1.startsWith("@cr") || var1.startsWith("@irn") || var1.startsWith("@hci") || var1.startsWith("@ult")) {
            var1 = var1.substring(5);
         }

         long var5 = aC.a(var1.trim());
         int var6 = -1;

         for(int var4 = 0; var4 < this.cj; ++var4) {
            if(this.cU[var4] == var5) {
               var6 = var4;
               break;
            }
         }

         if(var6 != -1) {
            if(this.bj[var6] > 0) {
               ac = true;
               this.ad = 0;
               this.hn = true;
               this.gG = "";
               this.eB = 3;
               this.cS = this.cU[var6];
               this.fC = "Enter message to send to " + this.eS[var6];
               return;
            }

            this.a("That player is currently offline.", 0, "");
         }

      }
   }

   private boolean c(int var1) {
      if(var1 < 0) {
         return false;
      } else {
         if((var1 = this.K[var1]) >= 2000) {
            var1 -= 2000;
         }

         return var1 == 337;
      }
   }

   private static String d(int var0) {
      switch(var0) {
      case 1:
         return "@cr1@";
      case 2:
         return "@cr2@";
      case 3:
         return "@cr2@";
      case 4:
         return "@irn@";
      case 5:
         return "@hci@";
      case 6:
         return "@ult@";
      default:
         return "";
      }
   }

   private int a(int var1, int var2, int var3) {
      switch(var1) {
      case 1:
         this.gL[0].a(var2, var3);
         return 15;
      case 2:
         this.gL[1].a(var2, var3);
         return 15;
      case 3:
         this.gL[1].a(var2, var3);
         return 15;
      case 4:
      case 5:
      case 6:
         aH.a("chaticons", var1 - 4).d(var2, var3);
         return 13;
      default:
         return 0;
      }
   }

   private int d(int var1, int var2, int var3, int var4) {
      int var5 = 0;
      if(var1 > 0) {
         var5 = 0 + this.a(var1, var3, var4);
      }

      if(var2 > 0) {
         var5 += this.a(var2, var5 + var3, var4);
      }

      return var5;
   }

   private boolean x() {
      return this.hn || this.ad != 0 || this.bx != null || this.aj != -1 || this.el != -1;
   }

   private void a(String var1) {
      if(var1 != null && !var1.isEmpty()) {
         try {
            var1 = var1.toLowerCase().trim();
            String[] var2 = new String[]{var1};
            if(var1.indexOf(" ") != -1) {
               var2 = var1.split(" ");
            }

            this.aF = 0;
            int var7 = this.ad == 3?i.G:(this.ad == 4?h.a:j.F);
            int var3 = 0;

            while(true) {
               if(var3 >= var7) {
                  return;
               }

               if(this.aF >= 100) {
                  break;
               }

               label88: {
                  String var4 = null;
                  if(this.ad == 3) {
                     i var5;
                     if((var5 = i.a(var3)) == null || var5.j != -1 || var5.p == null || var5.p.isEmpty()) {
                        break label88;
                     }

                     var4 = var5.p.toLowerCase();
                  } else if(this.ad == 4) {
                     h var8;
                     if((var8 = h.a(var3)) == null || var8.f == null || var8.f.isEmpty()) {
                        break label88;
                     }

                     var4 = var8.f.toLowerCase();
                  } else if(this.ad == 5) {
                     j var9;
                     if((var9 = j.a(var3)) == null || var9.g == null || var9.g.isEmpty()) {
                        break label88;
                     }

                     var4 = var9.g.toLowerCase();
                  }

                  if(var4 != null && !var4.isEmpty()) {
                     int var10 = 0;

                     while(true) {
                        if(var10 >= var2.length) {
                           this.aG[this.aF] = var4;
                           this.aH[this.aF] = var3;
                           ++this.aF;
                           break;
                        }

                        if(var4.indexOf(var2[var10]) == -1) {
                           break;
                        }

                        ++var10;
                     }
                  }
               }

               ++var3;
            }
         } catch (Exception var6) {
            System.out.println("Error searching defs:");
            var6.printStackTrace();
         }

      } else {
         this.aF = 0;
      }
   }

   private void a(Rectangle var1, int var2, int var3) {
      o var4 = this.hz;
      int var5 = this.hz.a;
      q.b(var3 + 20 + 3, var2, (int)var1.getWidth(), var3);
      var3 += var5 - 1;
      this.hH.b("SEARCH NAME: <col=255>" + this.dE + "*</col>", (int)var1.getCenterX(), var3, 0, -1);
      q.c(var3 += 4, g?5723991:8418912, (int)var1.getWidth() - 12, var2);
      q.b((int)var1.getHeight() + var3, var2, (int)var1.getWidth(), var3);
      if(this.dE.length() == 0) {
         this.hH.b("ENTER SEARCH NAME", (int)var1.getCenterX(), var3 + (int)var1.getCenterY() - 20, 255, -1);
      } else if(this.aF <= 0) {
         this.hH.b("NO SEARCH RESULTS FOR: " + this.dE, (int)var1.getCenterX(), var3 + (int)var1.getCenterY() - 20, 255, -1);
      } else {
         try {
            boolean var6 = a == b.a;
            int var7 = var1.width / 3;
            int var8 = t.a(true);
            int var9 = var6?35:20;
            int var10 = 0;

            int var11;
            for(var11 = 0; var11 < this.aF; ++var11) {
               if(this.aG[var11] != null && !this.aG[var11].isEmpty()) {
                  int var12;
                  if(this.ad == 3) {
                     var12 = var3 + var10 * 34 - i;
                     int var13 = var11 % 3;
                     int var14 = var2 + var7 * var13;
                     if(this.b(var14, var12 + (var6?var8:0), var7, 34) && this.b(0, var8 + var9, var1.width, var1.height)) {
                        q.a(16777215, var12, var7, 34, 64, var14);
                        this.aI = this.aH[var11];
                     }

                     n var15;
                     if((var15 = i.a(this.aH[var11], 64, 0)) != null) {
                        var15.d(var14, var12);
                     } else {
                        q.a(16711680, var12 + 2, 32, 32, 128, var14 + 2);
                     }

                     var12 += 2;
                     var4.a(false, var14 + 34 + 3, 0, this.aG[var11], var12 + var5);
                     var4.a(false, var14 + 34 + 3, 0, "ID #" + this.aH[var11], var12 + (var5 << 1) + 3);
                     if(var11 < this.aF - 1 && var13 >= 2) {
                        ++var10;
                     }
                  } else {
                     var12 = var3 + var11 * (var5 + 6) + var5 + 3 - i;
                     var4.a(false, var2, 0, this.aG[var11] + " - " + this.aH[var11], var12);
                  }
               }
            }

            q.e();
            var11 = (int)var1.getHeight() + 1;
            if(this.ad == 3) {
               if((j = (var10 + 1) * 34) < (int)var1.getHeight() - 1) {
                  j = (int)var1.getHeight() - 1;
               }

               this.a(var11, i, var3, (int)var1.getWidth(), j);
            } else {
               if((j = this.aF * (var5 + 6) + 3) < (int)var1.getHeight() - 1) {
                  j = (int)var1.getHeight() - 1;
               }

               this.a(var11, i, var3, (int)var1.getWidth(), j);
            }
         } catch (Exception var16) {
            System.out.println("Error drawing def search:");
            var16.printStackTrace();
         }
      }

      q.e();
   }

   private void a(String var1, String var2, int var3) {
      this.hA.a(0, var1, var3 + 40, 259);
      this.hA.a(128, var2, var3 + 60, 259);
   }

   private void y() {
      if(a == b.a) {
         gg.a();
      }

      if(this.x()) {
         e = true;
      }

      t.c(this);
      Rectangle var1 = t.b();
      int var2 = t.a(false);
      int var3 = (int)var1.getX();
      int var4 = var2 + (int)var1.getY();
      if(this.hn) {
         this.a(this.fC, this.gG + "*", var4);
      } else if(this.ad == 1) {
         this.a(this.dF + ":", this.dE + "*", var4);
      } else if(this.ad == 2) {
         this.a(this.dF + ":", this.dE + "*", var4);
      } else if(this.ad >= 3 && this.ad <= 5) {
         this.a(var1, var3, var4);
      } else if(this.bx != null) {
         this.a(this.bx, "Click to continue", var4);
      } else if(this.aj == -1 && this.el == -1) {
         if(e) {
            o var5 = this.hz;
            int var6 = this.hz.a;
            int var7 = 0;
            q.b((int)var1.getMaxY() + var2, var3, (int)var1.getWidth(), var4);

            int var8;
            String var9;
            for(var8 = 0; var8 < 500; ++var8) {
               if(this.cK[var8] != null) {
                  var9 = this.cJ[var8];
                  String var10 = this.cK[var8];
                  int var11 = this.cI[var8];
                  int var12 = this.aZ[var8];
                  boolean var13 = this.ba[var8];
                  int var14 = var4 + (int)var1.getHeight() - var7 * (var6 + 3) - 6 + 1 + G;
                  byte var16 = 0;
                  if(var9 != null && var9.startsWith("@irn@")) {
                     var9 = var9.substring(5);
                     var16 = 4;
                  } else if(var9 != null && var9.startsWith("@hci@")) {
                     var9 = var9.substring(5);
                     var16 = 5;
                  } else if(var9 != null && var9.startsWith("@ult@")) {
                     var9 = var9.substring(5);
                     var16 = 6;
                  }

                  if(var9 == null) {
                     var9 = aC.c(T);
                  }

                  int var15;
                  String var17;
                  switch(var11) {
                  case 0:
                     if((this.bb == 5 || this.bb == 0) && (this.o == 0 || this.o == 1 && var13)) {
                        var5.a(false, var3, 0, var10, var14);
                        ++var7;
                     }
                     break;
                  case 1:
                  case 2:
                     if((this.bb == 1 || this.bb == 0) && (var11 == 1 || this.ak == 0 || this.ak == 1 && this.f(var9))) {
                        var15 = var3 + this.d(var12, var16, var3, var14 - 12);
                        var5.a(false, var15, 0, var9 + ":", var14);
                        var15 += var5.a(var9 + ":") + 2;
                        var5.a(false, var15, 255, var10, var14);
                        ++var7;
                     }
                     break;
                  case 3:
                  case 7:
                     if((this.gB == 0 && this.bb == 0 || this.bb == 2) && (var11 == 7 || this.u == 0 || this.u == 1 && this.f(var9))) {
                        var5.a(false, var3, 0, "From", var14);
                        var15 = (var15 = var3 + var5.a("From ")) + this.d(var12, var16, var15, var14 - 12);
                        var5.a(false, var15, 0, var9 + ":", var14);
                        var15 += var5.a(var9 + ":") + 2;
                        var5.a(false, var15, 8388608, var10, var14);
                        ++var7;
                     }
                     break;
                  case 4:
                     if((this.bb == 3 || this.bb == 0) && var11 == 4 && (this.af == 0 || this.af == 1 && this.f(var9))) {
                        var5.a(false, var3, 8388736, var9 + " " + var10, var14);
                        ++var7;
                     }
                     break;
                  case 5:
                     if((this.gB == 0 && this.bb == 0 || this.bb == 2) && this.u < 2) {
                        var5.a(false, var3, 8388608, var9 + " " + var10, var14);
                        ++var7;
                     }
                     break;
                  case 6:
                     if((this.gB == 0 && this.bb == 0 || this.bb == 2) && this.u < 2) {
                        var5.a(false, var3, 0, "To " + var9 + ":", var14);
                        var5.a(false, var3 + var5.a("To :".concat(String.valueOf(var9))) + 2, 8388608, var10, var14);
                        ++var7;
                     }
                     break;
                  case 8:
                     if(this.bb == 3 || this.bb == 0) {
                        var5.a(false, var3, 8270336, var9 + " " + var10, var14);
                        ++var7;
                     }
                     break;
                  case 9:
                     if((this.bb == 0 && this.n == 0 || this.bb == 9) && (this.n == 0 || this.n == 1)) {
                        var17 = this.cL[var8];
                        var5.a(false, var3, 255, "[", var14);
                        var15 = var3 + 6;
                        var5.a(false, var15, 255, var17, var14);
                        var15 += var5.a(var17);
                        var5.a(false, var15, 255, "]", var14);
                        var15 += 6;
                        var15 += this.d(var12, var16, var15, var14 - 12);
                        var5.a(false, var15, 0, var9 + ":", var14);
                        var15 += var5.a(var9 + ":") + 2;
                        var5.a(false, var15, 8270336, var10, var14);
                        ++var7;
                     }
                  case 10:
                  case 11:
                  case 13:
                  case 14:
                  case 15:
                  default:
                     break;
                  case 12:
                     if((this.bb == 5 || this.bb == 0) && (this.o == 0 || this.o == 1 && var13)) {
                        var17 = this.cL[var8];
                        var5.a(false, var3, 0, var10 + " @red@" + var17, var14);
                        ++var7;
                     }
                     break;
                  case 16:
                     if((this.bb == 16 || this.bb == 0 && this.m == 0) && (this.m == 0 || this.m == 1)) {
                        var17 = this.cL[var8];
                        var5.a(false, var3, 0, "[", var14);
                        var15 = var3 + 6;
                        var5.a(false, var15, 255, var17, var14);
                        var15 += var5.a(var17);
                        var5.a(false, var15, 0, "]", var14);
                        var15 += 6;
                        var15 += this.d(var12, var16, var15, var14 - 12);
                        var5.a(false, var15, 0, var9 + ":", var14);
                        var15 += var5.a(var9 + ":") + 2;
                        var5.a(false, var15, 8388608, var10, var14);
                        ++var7;
                     }
                  }
               }
            }

            q.e();
            var8 = (int)var1.getHeight();
            if((aa = var7 * (var6 + 3) + 3) < (int)var1.getHeight() - 1) {
               aa = (int)var1.getHeight() - 1;
            }

            this.a(var8, aa - G - var8, var4, (int)var1.getWidth(), aa);
            if(M != null && M.ai != null) {
               var9 = M.ai;
            } else {
               var9 = aC.c(T);
            }

            var3 = (int)var1.getX();
            q.b((var4 = var2 + (int)var1.getMaxY()) + 20, var3, (int)var1.getWidth(), var4);
            q.c(var4, g?5723991:8418912, (int)var1.getWidth() - 12, var3);
            var4 += var6;
            var3 += this.d(this.bI, M.aB > 0?M.aB + 3:0, var3, var4 - 12);
            var5.b(0, var9 + ":", var4, var3);
            var5.a(var3 + var5.a(var9 + ":") + 2, this.bZ + "*", var4);
            q.e();
         }
      } else {
         this.a(var3, var4, m.a[this.aj != -1?this.aj:this.el]);
      }

      if(this.bX) {
         this.e(0, a == b.a?338:0);
      }

      if(a == b.a) {
         gg.a(338, super.ao, 0);
      }

      gf.a();
      u.s = gt;
   }

   public final void a(Runnable var1, int var2) {
      if(var2 > 10) {
         var2 = 10;
      }

      Applet var10000 = ao.e;
      super.a(var1, var2);
   }

   public static Socket a(int var0) {
      return new Socket(InetAddress.getByName(hX), var0);
   }

   private void z() {
      if(this.eW == 0) {
         int var1 = super.aw;
         if(this.fM == 1 && super.ax >= 516 && super.ay >= 160 && super.ax <= 765 && super.ay <= 205) {
            var1 = 0;
         }

         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         if(this.bX) {
            if(var1 != 1) {
               var2 = super.au - 4;
               var3 = super.av - 4;
               if(a == b.a) {
                  var3 = super.av - 4 / b;
               }

               if(var2 < this.cO - 10 || var2 > this.cO + this.cQ + 10 || var3 < this.cP - 10 || var3 > this.cP + this.cR + 10) {
                  this.bX = false;
               }
            }

            if(var1 == 1) {
               var2 = this.cO;
               var3 = this.cP;
               var4 = this.cQ;
               var5 = super.ax - 4;
               var1 = super.ay - 4;
               var6 = -1;

               for(int var7 = 0; var7 < this.O; ++var7) {
                  int var8 = var3 + 31 + (this.O - 1 - var7) * 15;
                  if(var5 > var2 && var5 < var2 + var4 && var1 > var8 - 13 && var1 < var8 + 3) {
                     var6 = var7;
                  }
               }

               if(var6 != -1) {
                  this.i(var6);
               }

               this.bX = false;
               return;
            }
         } else {
            if(var1 == 1 && this.O > 0 && ((var2 = this.K[this.O - 1]) >= 700 && var2 <= 705 || var2 == 632 || var2 == 78 || var2 == 867 || var2 == 431 || var2 == 53 || var2 == 74 || var2 == 454 || var2 == 539 || var2 == 493 || var2 == 847 || var2 == 447 || var2 == 1125)) {
               var3 = this.fc[this.O - 1];
               m var13;
               if((var13 = m.a(var4 = this.fd[this.O - 1])).C || var13.F) {
                  this.ha = false;
                  this.dt = 0;
                  this.eU = var4;
                  this.eV = var3;
                  this.eW = 2;
                  this.eX = super.ax;
                  this.eY = super.ay;
                  if(var13.p == v) {
                     this.eW = 1;
                  }

                  if(var13.p == this.aj) {
                     this.eW = 3;
                  }

                  return;
               }
            }

            if(var1 == 1 && (this.hl == 1 || this.c(this.O - 1)) && this.O > 2) {
               var1 = 2;
            }

            if(var1 == 1 && this.O > 0) {
               this.i(this.O - 1);
            }

            if(var1 == 2 && this.O > 0) {
               this.ad();
            }

            if(this.dV == 0 && super.aw == 1 && this.t()) {
               Point var9;
               var3 = (var9 = t.b(true)).x + t.d().x;
               var4 = var9.y + t.d().y;
               var5 = super.ax - var3;
               var3 = super.ay - var4;
               if(var5 >= 0 && var5 < 146 && var3 >= 0 && var3 < 151 && Math.pow((double)(77 - var5), 2.0D) + Math.pow((double)(77 - var3), 2.0D) < Math.pow(77.0D, 2.0D)) {
                  var5 -= 73;
                  var3 -= 77;
                  var6 = this.W & 2047;
                  var2 = u.h[var6];
                  var4 = u.r[var6];
                  var2 = var2 << 8 >> 8;
                  var4 = var4 << 8 >> 8;
                  var6 = var3 * var2 + var5 * var4 >> 11;
                  var2 = var3 * var4 - var5 * var2 >> 11;
                  var4 = M.V + var6 >> 7;
                  var2 = M.W - var2 >> 7;
                  if(this.a(1, 0, 0, 0, M.b[0], 0, 0, var2, M.a[0], true, var4)) {
                     this.gz.b(var5);
                     this.gz.b(var3);
                     this.gz.c(this.W);
                     this.gz.b(57);
                     this.gz.b(0);
                     this.gz.b(0);
                     this.gz.b(89);
                     this.gz.c(M.V);
                     this.gz.c(M.W);
                     this.gz.b(this.ht);
                     this.gz.b(63);
                  }
               }

               if(++fA > 1151) {
                  fA = 0;
                  this.gz.a(246);
                  this.gz.b(0);
                  var6 = this.gz.b;
                  if((int)(Math.random() * 2.0D) == 0) {
                     this.gz.b(101);
                  }

                  this.gz.b(197);
                  this.gz.c((int)(Math.random() * 65536.0D));
                  this.gz.b((int)(Math.random() * 256.0D));
                  this.gz.b(67);
                  this.gz.c(14214);
                  if((int)(Math.random() * 2.0D) == 0) {
                     this.gz.c(29487);
                  }

                  this.gz.c((int)(Math.random() * 65536.0D));
                  if((int)(Math.random() * 2.0D) == 0) {
                     this.gz.b(220);
                  }

                  this.gz.b(180);
                  this.gz.e(this.gz.b - var6);
               }
            }

            t.b(this);
            Client var11 = this;
            aK var10 = t;
            var3 = a != b.a?d - 21:482;
            var4 = 0;

            while(true) {
               if(var4 >= var10.g().length) {
                  if(var11.p != -1) {
                     var11.p = -1;
                     ac = true;
                  }
                  break;
               }

               if(var11.au >= var10.g()[var4] && var11.au <= var10.g()[var4] + 56 && var11.av >= var3 && var11.av <= d) {
                  var11.p = var4;
                  ac = true;
                  break;
               }

               ++var4;
            }

            boolean var12 = a == b.a;
            this.aO = -1;
            if(aE.j) {
               boolean var14 = aE.k;
               Point var17 = new Point(248, 18);
               Point var15 = new Point(240, 22);
               Point var16 = new Point(!var14?230:75, 122);
               Point var18 = new Point(224, 126);
               if(super.au >= c - (var12?var17.x:var15.x) && super.au <= c - ((var12?var17.x:var15.x) - 22) && super.av >= (var12?var17.y:var15.y) && super.av <= (var12?var17.y:var15.y) + 28) {
                  this.aO = 0;
                  return;
               }

               if(super.au >= c - (var12?var16.x:var18.x) && super.au <= c - ((var12?var16.x:var18.x) - 56) && super.av >= (var12?var16.y:var18.y) && super.av <= (var12?var16.y:var18.y) + 28) {
                  this.aO = 3;
               }
            }
         }

      }
   }

   private static void A() {
      j.D.a();
      j.B.a();
      h.t.a();
      i.f.a();
      i.e.a();
      A.aj.a();
      g.h.a();
   }

   private void e(int var1) {
      int[] var2 = this.hs.b;
      int var3 = this.hs.b.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         var2[var4] = 0;
      }

      int var5;
      for(var4 = 1; var4 < 103; ++var4) {
         var3 = 24628 + (103 - var4 << 9 << 2);

         for(var5 = 1; var5 < 103; ++var5) {
            if((this.ho[var1][var5][var4] & 24) == 0) {
               this.cN.a(var2, var3, var1, var5, var4);
            }

            if(var1 < 3 && (this.ho[var1 + 1][var5][var4] & 8) != 0) {
               this.cN.a(var2, var3, var1 + 1, var5, var4);
            }

            var3 += 4;
         }
      }

      n var8 = this.hs;
      q.a(this.hs.d, var8.c, var8.b);

      for(var5 = 1; var5 < 103; ++var5) {
         for(int var9 = 1; var9 < 103; ++var9) {
            if((this.ho[var1][var9][var5] & 24) == 0) {
               this.c(var5, var9, var1);
            }

            if(var1 < 3 && (this.ho[var1 + 1][var9][var5] & 8) != 0) {
               this.c(var5, var9, var1 + 1);
            }
         }
      }

      gf.a();
      this.eH = 0;
      Client var10 = this;

      for(var3 = 0; var3 < 104; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            j var11;
            if((var5 = var10.cN.m(var1, var3, var4)) != 0 && (var11 = j.a(var5 >> 14 & 32767)) != null && (var5 = var11.i) >= 0) {
               var10.fQ[var10.eH] = var10.ee[var5];
               var10.eI[var10.eH] = var3;
               var10.eJ[var10.eH] = var4;
               ++var10.eH;
            }
         }
      }

   }

   private void c(int var1, int var2) {
      O var3;
      if((var3 = this.bk[this.ct][var1][var2]) == null) {
         this.cN.e(this.ct, var1, var2);
      } else {
         int var4 = -99999999;
         y var5 = null;

         y var6;
         int var8;
         for(var6 = (y)var3.b(); var6 != null; var6 = (y)var3.d()) {
            i var7;
            var8 = (var7 = i.a(var6.a)).b;
            if(var7.t) {
               var8 *= var6.b + 1;
            }

            if(var8 > var4) {
               var4 = var8;
               var5 = var6;
            }
         }

         var3.b((M)var5);
         var6 = null;
         y var9 = null;

         for(y var10 = (y)var3.b(); var10 != null; var10 = (y)var3.d()) {
            if(var10.a != ((y)var5).a && var6 == null) {
               var6 = var10;
            }

            if(var10.a != ((y)var5).a && var10.a != ((y)var6).a && var9 == null) {
               var9 = var10;
            }
         }

         var8 = var1 + (var2 << 7) + 1610612736;
         this.cN.a(var1, var8, (C)var6, this.b(this.ct, (var2 << 7) + 64, (var1 << 7) + 64), (C)var9, (C)var5, this.ct, var2);
      }
   }

   private void a(boolean var1) {
      for(int var2 = 0; var2 < this.bq; ++var2) {
         z var3 = this.bp[this.br[var2]];
         int var4 = 536870912 + (this.br[var2] << 14);
         if(var3 != null && var3.c() && var3.ad.s == var1) {
            int var5 = var3.V >> 7;
            int var6 = var3.W >> 7;
            if(var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
               if(var3.L == 1 && (var3.V & 127) == 64 && (var3.W & 127) == 64) {
                  if(this.cz[var5][var6] == this.hu) {
                     continue;
                  }

                  this.cz[var5][var6] = this.hu;
               }

               if(!var3.ad.p) {
                  var4 += Integer.MIN_VALUE;
               }

               this.cN.a(this.ct, var3.X, this.b(this.ct, var3.W, var3.V), var4, var3.W, (var3.L - 1 << 6) + 60, var3.V, var3, var3.M);
            }
         }
      }

   }

   private void a(int var1, int var2, String var3) {
      String[] var7;
      int var4 = ((var7 = var3.split("\n")).length << 4) + 6;
      int var5 = this.ag.a(var7[0]) + 6;

      int var6;
      for(var6 = 1; var6 < var7.length; ++var6) {
         if(var5 <= this.ag.a(var7[var6]) + 6) {
            var5 = this.ag.a(var7[var6]) + 6;
         }
      }

      q.b(var4, var2, var1, 16777120, var5);
      q.c(var1, var5, var4, 0, var2);
      var2 += 14;

      for(var6 = 0; var6 < var7.length; ++var6) {
         this.ag.a(false, var1 + 3, 0, var7[var6], var2);
         var2 += 16;
      }

   }

   private void a(int var1, m[] var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 != null) {
         for(int var8 = 0; var8 < var2.length; ++var8) {
            m var9;
            if((var9 = var2[var8]) != null && var9.q == var7) {
               if(var9.z) {
                  if(var9.b == 0 && !this.f(var9)) {
                     continue;
                  }
               } else if(var9.y) {
                  continue;
               }

               int var10 = var9.b() + var1;
               int var11 = var9.c() + var4 - var6;
               if((var9.r >= 0 || var9.Z != 0) && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                  if(var9.r >= 0) {
                     this.bY = var2[var9.r].s;
                  } else {
                     this.bY = var9.s;
                  }
               }

               if(var9.b == 0) {
                  if(var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() + 32 && var5 < var11 + var9.e()) {
                     this.a(var10, var2, var3, var11, var5, var9.x, var9.s);
                     if(var9.w > var9.e()) {
                        this.a(var10 + var9.d(), var9.e(), var3, var5, var9, var11, true, var9.w);
                     }
                  }
               } else {
                  if(var9.b == 8 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                     this.ib = var9.s;
                  }

                  if(var9.b == 4 && var9.ar != null && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                     this.Y[this.O] = "Go-to @lre@" + var9.as + (this.bI > 1?" @gre@(@whi@" + var9.s + "@gre@)":"");
                     this.K[this.O] = 928;
                     this.fd[this.O] = var9.s;
                     ++this.O;
                  }

                  int var13;
                  int var14;
                  if(var9.c == 1 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                     boolean var12 = false;
                     if(var9.d != 0) {
                        var14 = var9.d;
                        boolean var10000;
                        if((var9.d <= 0 || var14 > 200) && (var14 < 701 || var14 > 900)) {
                           if(var14 >= 401 && var14 <= 500) {
                              this.Y[this.O] = "Remove @whi@" + var9.V;
                              this.K[this.O] = 322;
                              ++this.O;
                              var10000 = true;
                           } else {
                              var10000 = false;
                           }
                        } else {
                           if(var14 >= 801) {
                              var14 -= 701;
                           } else if(var14 >= 701) {
                              var14 -= 601;
                           } else if(var14 >= 101) {
                              var14 -= 101;
                           } else {
                              --var14;
                           }

                           this.Y[this.O] = "Remove @whi@" + this.eS[var14];
                           this.K[this.O] = 792;
                           ++this.O;
                           this.Y[this.O] = "Message @whi@" + this.eS[var14];
                           this.K[this.O] = 639;
                           ++this.O;
                           var10000 = true;
                        }

                        label455: {
                           if(!var10000) {
                              var14 = var9.d;
                              if(var9.d >= 20001 && var14 <= 20101) {
                                 label446: {
                                    var13 = var14 - 20001;
                                    String var20;
                                    if(this.e(M.ai) > 0 && !(var20 = aC.a(this.cV[var13])).isEmpty()) {
                                       if(var20.startsWith("@cc1@") || var20.startsWith("@cc2@") || var20.startsWith("@cc3@")) {
                                          var20 = var20.substring(5);
                                       }

                                       var20 = aC.c(var20);
                                       if(this.cW[var13] >= 2 || var20.equalsIgnoreCase(M.ai)) {
                                          var10000 = true;
                                          break label446;
                                       }

                                       this.Y[this.O] = "Ban @whi@".concat(String.valueOf(var20));
                                       this.K[this.O] = 1502;
                                       ++this.O;
                                       this.Y[this.O] = "Demote @whi@".concat(String.valueOf(var20));
                                       this.K[this.O] = 1501;
                                       ++this.O;
                                       this.Y[this.O] = "Promote @whi@".concat(String.valueOf(var20));
                                       this.K[this.O] = 1500;
                                       ++this.O;
                                    }

                                    var10000 = true;
                                 }
                              } else {
                                 var10000 = false;
                              }

                              if(!var10000) {
                                 var10000 = false;
                                 break label455;
                              }
                           }

                           var10000 = true;
                        }

                        var12 = var10000;
                     }

                     if(!var12) {
                        this.Y[this.O] = var9.an + (this.bI > 1?" @gre@(@whi@" + var9.s + "@gre@)":"");
                        this.K[this.O] = 315;
                        this.fd[this.O] = var9.s;
                        ++this.O;
                     }
                  }

                  if(var9.c == 2 && this.fM == 0 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                     String var17 = var9.ak;
                     if(var9.ak.indexOf(" ") != -1) {
                        var17 = var17.substring(0, var17.indexOf(" "));
                     }

                     this.Y[this.O] = var17 + " @gre@" + var9.al + (this.bI > 1?" @gre@(@whi@" + var9.s + "@gre@)":"");
                     this.K[this.O] = 626;
                     this.fd[this.O] = var9.s;
                     ++this.O;
                  }

                  if(var9.c == 3 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                     this.Y[this.O] = "Close" + (this.bI > 1?" @gre@(@whi@" + var9.s + "@gre@)":"");
                     this.K[this.O] = 200;
                     this.fd[this.O] = var9.s;
                     ++this.O;
                  }

                  if(var9.c == 4 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                     this.Y[this.O] = var9.an + (this.bI > 1?" @gre@(@whi@" + var9.s + "@gre@)":"");
                     this.K[this.O] = 169;
                     this.fd[this.O] = var9.s;
                     ++this.O;
                  }

                  if(var9.c == 5 && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                     this.Y[this.O] = var9.an + (this.bI > 1?" @gre@(@whi@" + var9.s + "@gre@)":"");
                     this.K[this.O] = 646;
                     this.fd[this.O] = var9.s;
                     ++this.O;
                  }

                  if(var9.c == 6 && !this.fT && var3 >= var10 && var5 >= var11 && var3 < var10 + var9.d() && var5 < var11 + var9.e()) {
                     this.Y[this.O] = var9.an + (this.bI > 1?" @gre@(@whi@" + var9.s + "@gre@)":"");
                     this.K[this.O] = 679;
                     this.fd[this.O] = var9.s;
                     ++this.O;
                  }

                  if(var9.b == 2) {
                     int var18 = 0;

                     for(var13 = 0; var13 < var9.e(); ++var13) {
                        for(var14 = 0; var14 < var9.d(); ++var14) {
                           int var15 = var10 + var14 * (32 + var9.I);
                           int var16 = var11 + var13 * (32 + var9.J);
                           if(var18 < 20) {
                              var15 += var9.K[var18];
                              var16 += var9.L[var18];
                           }

                           if(var3 >= var15 && var5 >= var16 && var3 < var15 + 32 && var5 < var16 + 32) {
                              this.eD = var18;
                              this.eE = var9.s;
                              if(var9.A[var18] > 0) {
                                 i var19 = i.a(var9.A[var18] - 1);
                                 if(this.hR == 1 && var9.D) {
                                    if(var9.s != this.hT || var18 != this.hS) {
                                       this.Y[this.O] = "Use @lre@" + this.hV + "@whi@ -> @lre@" + var19.p;
                                       this.K[this.O] = 870;
                                       this.fe[this.O] = var19.d;
                                       this.fc[this.O] = var18;
                                       this.fd[this.O] = var9.s;
                                       ++this.O;
                                    }
                                 } else if(this.fM == 1 && var9.D) {
                                    if((this.fO & 16) == 16) {
                                       this.Y[this.O] = this.fP + " @lre@" + var19.p;
                                       this.K[this.O] = 543;
                                       this.fe[this.O] = var19.d;
                                       this.fc[this.O] = var18;
                                       this.fd[this.O] = var9.s;
                                       ++this.O;
                                    }
                                 } else {
                                    if(var9.D) {
                                       for(var16 = 4; var16 >= 3; --var16) {
                                          if(var19.y != null && var19.y[var16] != null) {
                                             this.Y[this.O] = var19.y[var16] + " @lre@" + var19.p;
                                             if(var16 == 3) {
                                                this.K[this.O] = 493;
                                             }

                                             if(var16 == 4) {
                                                this.K[this.O] = 847;
                                             }

                                             this.fe[this.O] = var19.d;
                                          } else {
                                             if(var16 != 4) {
                                                continue;
                                             }

                                             this.Y[this.O] = "Drop @lre@" + var19.p;
                                             this.K[this.O] = 847;
                                             this.fe[this.O] = var19.d;
                                             if(var19.d == 1971) {
                                                this.Y[this.O] = "Remove @lre@" + var19.p;
                                             }
                                          }

                                          this.fc[this.O] = var18;
                                          this.fd[this.O] = var9.s;
                                          ++this.O;
                                       }
                                    }

                                    if(var9.E) {
                                       this.Y[this.O] = "Use @lre@" + var19.p;
                                       this.K[this.O] = 447;
                                       this.fe[this.O] = var19.d;
                                       this.fc[this.O] = var18;
                                       this.fd[this.O] = var9.s;
                                       ++this.O;
                                    }

                                    if(var9.D && var19.y != null) {
                                       for(var16 = 2; var16 >= 0; --var16) {
                                          if(var19.y[var16] != null) {
                                             this.Y[this.O] = var19.y[var16] + " @lre@" + var19.p;
                                             if(var16 == 0) {
                                                this.K[this.O] = 74;
                                             }

                                             if(var16 == 1) {
                                                this.K[this.O] = 454;
                                             }

                                             if(var16 == 2) {
                                                this.K[this.O] = 539;
                                             }

                                             this.fe[this.O] = var19.d;
                                             this.fc[this.O] = var18;
                                             this.fd[this.O] = var9.s;
                                             ++this.O;
                                          }
                                       }
                                    }

                                    if(var19.z != null && (var9.p == 94 || var9.p == 483)) {
                                       for(var16 = 4; var16 >= 0; --var16) {
                                          if(var19.z[var16] != null) {
                                             this.Y[this.O] = var19.z[var16] + " @lre@" + var19.p;
                                             if(var16 == 0) {
                                                this.K[this.O] = 700;
                                             }

                                             if(var16 == 1) {
                                                this.K[this.O] = 701;
                                             }

                                             if(var16 == 2) {
                                                this.K[this.O] = 702;
                                             }

                                             if(var16 == 3) {
                                                this.K[this.O] = 703;
                                             }

                                             if(var16 == 4) {
                                                this.K[this.O] = 704;
                                             }

                                             this.fe[this.O] = var19.d;
                                             this.fc[this.O] = var18;
                                             this.fd[this.O] = var9.s;
                                             ++this.O;
                                          }
                                       }
                                    }

                                    if(var9.N != null) {
                                       for(var16 = 4; var16 >= 0; --var16) {
                                          if(var9.N[var16] != null) {
                                             this.Y[this.O] = var9.N[var16] + " @lre@" + var19.p;
                                             if(var16 == 0) {
                                                this.K[this.O] = 632;
                                             }

                                             if(var16 == 1) {
                                                this.K[this.O] = 78;
                                             }

                                             if(var16 == 2) {
                                                this.K[this.O] = 867;
                                             }

                                             if(var16 == 3) {
                                                this.K[this.O] = 431;
                                             }

                                             if(var16 == 4) {
                                                this.K[this.O] = 53;
                                             }

                                             this.fe[this.O] = var19.d;
                                             this.fc[this.O] = var18;
                                             this.fd[this.O] = var9.s;
                                             ++this.O;
                                          }
                                       }
                                    }

                                    this.Y[this.O] = this.bI < 2?"Examine @lre@" + var19.p:"Examine @lre@" + var19.p + " @gre@(@whi@" + (var9.A[var18] - 1) + "@gre@)";
                                    this.K[this.O] = 1125;
                                    this.fe[this.O] = var19.d;
                                    this.fc[this.O] = var18;
                                    this.fd[this.O] = var9.s;
                                    ++this.O;
                                 }
                              }
                           }

                           ++var18;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      if(t.e()) {
         this.dZ.a(var4, var3);
         this.ea.a(var4, var3 + var1 - 16);
         q.a(var1 - 32, var3 + 16, var4, 2301979, 16);
         if((var6 = (var1 - 32) * var1 / var5) < 8) {
            var6 = 8;
         }

         var1 = (var1 - 32 - var6) * var2 / (var5 - var1);
         q.a(var6, var3 + 16 + var1, var4, 5063219, 16);
         q.d(var3 + 16 + var1, 7759444, var6, var4);
         q.d(var3 + 16 + var1, 7759444, var6, var4 + 1);
         q.c(var3 + 16 + var1, 7759444, 16, var4);
         q.c(var3 + 17 + var1, 7759444, 16, var4);
         q.d(var3 + 16 + var1, 3353893, var6, var4 + 15);
         q.d(var3 + 17 + var1, 3353893, var6 - 1, var4 + 14);
         q.c(var3 + 15 + var1 + var6, 3353893, 16, var4);
         q.c(var3 + 14 + var1 + var6, 3353893, 15, var4 + 1);
      } else {
         this.dX.d(var4, var3);
         this.dY.d(var4, var3 + var1 - 16);
         q.b(var1 - 32, var3 + 16, var4, 1, 16);
         q.b(var1 - 32, var3 + 16, var4, 4011046, 15);
         q.b(var1 - 32, var3 + 16, var4, 3419425, 13);
         q.b(var1 - 32, var3 + 16, var4, 3024925, 11);
         q.b(var1 - 32, var3 + 16, var4, 2696219, 10);
         q.b(var1 - 32, var3 + 16, var4, 2433049, 9);
         q.b(var1 - 32, var3 + 16, var4, 1, 1);
         if((var6 = (var1 - 32) * var1 / var5) < 8) {
            var6 = 8;
         }

         var1 = (var1 - 32 - var6) * var2 / (var5 - var1);
         q.b(var6, var3 + 16 + var1, var4, 5063219, 16);
         q.d(var3 + 16 + var1, 1, var6, var4);
         q.d(var3 + 16 + var1, 8482897, var6, var4 + 1);
         q.d(var3 + 16 + var1, 7562570, var6, var4 + 2);
         q.d(var3 + 16 + var1, 6970435, var6, var4 + 3);
         q.d(var3 + 16 + var1, 6970435, var6, var4 + 4);
         q.d(var3 + 16 + var1, 6641729, var6, var4 + 5);
         q.d(var3 + 16 + var1, 6641729, var6, var4 + 6);
         q.d(var3 + 16 + var1, 6378814, var6, var4 + 7);
         q.d(var3 + 16 + var1, 6378814, var6, var4 + 8);
         q.d(var3 + 16 + var1, 6115644, var6, var4 + 9);
         q.d(var3 + 16 + var1, 6115644, var6, var4 + 10);
         q.d(var3 + 16 + var1, 5852730, var6, var4 + 11);
         q.d(var3 + 16 + var1, 5852730, var6, var4 + 12);
         q.d(var3 + 16 + var1, 5326389, var6, var4 + 13);
         q.d(var3 + 16 + var1, 4931889, var6, var4 + 14);
         q.c(var3 + 16 + var1, 1, 15, var4);
         q.c(var3 + 17 + var1, 1, 15, var4);
         q.c(var3 + 17 + var1, 6641729, 14, var4);
         q.c(var3 + 17 + var1, 6970435, 13, var4);
         q.c(var3 + 17 + var1, 7167816, 11, var4);
         q.c(var3 + 17 + var1, 7562570, 10, var4);
         q.c(var3 + 17 + var1, 7759947, 7, var4);
         q.c(var3 + 17 + var1, 8088141, 5, var4);
         q.c(var3 + 17 + var1, 8285776, 4, var4);
         q.c(var3 + 17 + var1, 8482897, 3, var4);
         q.c(var3 + 17 + var1, 1, 2, var4);
         q.c(var3 + 18 + var1, 1, 16, var4);
         q.c(var3 + 18 + var1, 5655352, 15, var4);
         q.c(var3 + 18 + var1, 6115644, 14, var4);
         q.c(var3 + 18 + var1, 6444608, 11, var4);
         q.c(var3 + 18 + var1, 6641729, 10, var4);
         q.c(var3 + 18 + var1, 6970435, 7, var4);
         q.c(var3 + 18 + var1, 7233606, 5, var4);
         q.c(var3 + 18 + var1, 7430727, 4, var4);
         q.c(var3 + 18 + var1, 8088141, 3, var4);
         q.c(var3 + 18 + var1, 8482897, 2, var4);
         q.c(var3 + 18 + var1, 1, 1, var4);
         q.c(var3 + 19 + var1, 1, 16, var4);
         q.c(var3 + 19 + var1, 5326389, 15, var4);
         q.c(var3 + 19 + var1, 5655352, 14, var4);
         q.c(var3 + 19 + var1, 6115644, 11, var4);
         q.c(var3 + 19 + var1, 6378814, 9, var4);
         q.c(var3 + 19 + var1, 6641729, 7, var4);
         q.c(var3 + 19 + var1, 6970435, 5, var4);
         q.c(var3 + 19 + var1, 7233606, 4, var4);
         q.c(var3 + 19 + var1, 7562570, 3, var4);
         q.c(var3 + 19 + var1, 8482897, 2, var4);
         q.c(var3 + 19 + var1, 1, 1, var4);
         q.c(var3 + 20 + var1, 1, 16, var4);
         q.c(var3 + 20 + var1, 4931889, 15, var4);
         q.c(var3 + 20 + var1, 5523766, 14, var4);
         q.c(var3 + 20 + var1, 5852730, 13, var4);
         q.c(var3 + 20 + var1, 6115644, 10, var4);
         q.c(var3 + 20 + var1, 6378814, 8, var4);
         q.c(var3 + 20 + var1, 6641729, 6, var4);
         q.c(var3 + 20 + var1, 6970435, 4, var4);
         q.c(var3 + 20 + var1, 7562570, 3, var4);
         q.c(var3 + 20 + var1, 8482897, 2, var4);
         q.c(var3 + 20 + var1, 1, 1, var4);
         q.d(var3 + 16 + var1, 1, var6, var4 + 15);
         q.c(var3 + 15 + var1 + var6, 1, 16, var4);
         q.c(var3 + 14 + var1 + var6, 1, 15, var4);
         q.c(var3 + 14 + var1 + var6, 4142890, 14, var4);
         q.c(var3 + 14 + var1 + var6, 4471853, 10, var4);
         q.c(var3 + 14 + var1 + var6, 4734511, 9, var4);
         q.c(var3 + 14 + var1 + var6, 4866095, 7, var4);
         q.c(var3 + 14 + var1 + var6, 4931889, 4, var4);
         q.c(var3 + 14 + var1 + var6, 5655352, 3, var4);
         q.c(var3 + 14 + var1 + var6, 1, 2, var4);
         q.c(var3 + 13 + var1 + var6, 1, 16, var4);
         q.c(var3 + 13 + var1 + var6, 4471853, 15, var4);
         q.c(var3 + 13 + var1 + var6, 4931889, 11, var4);
         q.c(var3 + 13 + var1 + var6, 5326389, 9, var4);
         q.c(var3 + 13 + var1 + var6, 5523766, 7, var4);
         q.c(var3 + 13 + var1 + var6, 5655352, 6, var4);
         q.c(var3 + 13 + var1 + var6, 5852730, 4, var4);
         q.c(var3 + 13 + var1 + var6, 6444608, 3, var4);
         q.c(var3 + 13 + var1 + var6, 6970435, 2, var4);
         q.c(var3 + 13 + var1 + var6, 1, 1, var4);
         q.c(var3 + 12 + var1 + var6, 1, 16, var4);
         q.c(var3 + 12 + var1 + var6, 4471853, 15, var4);
         q.c(var3 + 12 + var1 + var6, 4931889, 14, var4);
         q.c(var3 + 12 + var1 + var6, 5523766, 12, var4);
         q.c(var3 + 12 + var1 + var6, 5655352, 11, var4);
         q.c(var3 + 12 + var1 + var6, 5852730, 10, var4);
         q.c(var3 + 12 + var1 + var6, 6115644, 7, var4);
         q.c(var3 + 12 + var1 + var6, 6378814, 4, var4);
         q.c(var3 + 12 + var1 + var6, 7233606, 3, var4);
         q.c(var3 + 12 + var1 + var6, 8088141, 2, var4);
         q.c(var3 + 12 + var1 + var6, 1, 1, var4);
         q.c(var3 + 11 + var1 + var6, 1, 16, var4);
         q.c(var3 + 11 + var1 + var6, 4931889, 15, var4);
         q.c(var3 + 11 + var1 + var6, 5326389, 14, var4);
         q.c(var3 + 11 + var1 + var6, 5655352, 13, var4);
         q.c(var3 + 11 + var1 + var6, 5852730, 11, var4);
         q.c(var3 + 11 + var1 + var6, 6115644, 9, var4);
         q.c(var3 + 11 + var1 + var6, 6378814, 7, var4);
         q.c(var3 + 11 + var1 + var6, 6641729, 5, var4);
         q.c(var3 + 11 + var1 + var6, 6970435, 4, var4);
         q.c(var3 + 11 + var1 + var6, 7562570, 3, var4);
         q.c(var3 + 11 + var1 + var6, 8088141, 2, var4);
         q.c(var3 + 11 + var1 + var6, 1, 1, var4);
      }
   }

   private void a(K var1, int var2) {
      this.bs = 0;
      this.cf = 0;
      K var4 = var1;
      Client var3 = this;
      var1.o();
      int var5;
      int var6;
      if((var5 = var1.f(8)) < this.bq) {
         for(var6 = var5; var6 < var3.bq; ++var6) {
            var3.bt[var3.bs++] = var3.br[var6];
         }
      }

      if(var5 > var3.bq) {
         ao.b(T + " Too many npcs");
         throw new RuntimeException("eek");
      } else {
         var3.bq = 0;

         for(var6 = 0; var6 < var5; ++var6) {
            int var7 = var3.br[var6];
            z var8 = var3.bp[var7];
            if(var4.f(1) == 0) {
               var3.br[var3.bq++] = var7;
               var8.I = S;
            } else {
               int var9;
               if((var9 = var4.f(2)) == 0) {
                  var3.br[var3.bq++] = var7;
                  var8.I = S;
                  var3.cg[var3.cf++] = var7;
               } else if(var9 == 1) {
                  var3.br[var3.bq++] = var7;
                  var8.I = S;
                  var9 = var4.f(3);
                  var8.a(false, var9);
                  if(var4.f(1) == 1) {
                     var3.cg[var3.cf++] = var7;
                  }
               } else if(var9 == 2) {
                  var3.br[var3.bq++] = var7;
                  var8.I = S;
                  var9 = var4.f(3);
                  var8.a(true, var9);
                  var9 = var4.f(3);
                  var8.a(true, var9);
                  if(var4.f(1) == 1) {
                     var3.cg[var3.cf++] = var7;
                  }
               } else if(var9 == 3) {
                  var3.bt[var3.bs++] = var7;
               }
            }
         }

         this.a(var2, var1);
         this.b(var1);

         int var10;
         for(var10 = 0; var10 < this.bs; ++var10) {
            int var11 = this.bt[var10];
            if(this.bp[var11].I != S) {
               this.bp[var11].ad = null;
               this.bp[var11] = null;
            }
         }

         if(var1.b != var2) {
            ao.b(T + " size mismatch in getnpcpos - pos:" + var1.b + " psize:" + var2);
            throw new RuntimeException("eek");
         } else {
            for(var10 = 0; var10 < this.bq; ++var10) {
               if(this.bp[this.br[var10]] == null) {
                  ao.b(T + " null entry in npc list - pos:" + var10 + " size:" + this.bq);
                  throw new RuntimeException("eek");
               }
            }

         }
      }
   }

   private void d(int var1, int var2) {
      if(this.q == var1) {
         e = a != b.a?!e:true;
      } else {
         this.q = var1;
         this.bb = var2;
         ac = true;
         e = true;
      }
   }

   private void f(int var1) {
      try {
         int var2 = an.a[var1].b;
         int var3 = this.B[var1];
         if(var2 == 0) {
            switch(var1) {
            case 19:
               this.gS = var3 > 0;
               if(this.gT != null && this.gQ && this.hp <= 0) {
                  this.gT.a(this.gS);
                  if(!this.gT.a() && fV) {
                     this.gP = this.cX;
                     this.gQ = true;
                     this.F.a(2, this.gP);
                     return;
                  }
               }
               break;
            case 161:
               switch(var3) {
               case 1:
                  this.a(b.b);
                  aE.c = b.b;
                  break;
               default:
                  this.a(b.a);
                  aE.c = b.a;
               }

               aE.a();
               return;
            case 162:
               aE.g = var3 == 1;
               aE.a();
               return;
            case 163:
               aE.i = var3 == 0;
               aE.a();
               return;
            case 164:
               if(var3 <= 1) {
                  aE.j = var3 == 0;
                  aE.a();
                  return;
               }

               if(var3 == 2) {
                  this.bR = 9;
               } else if(var3 == 4) {
                  this.bR = 10;
               } else if(var3 == 8) {
                  this.bR = 11;
               }

               this.B[var1] = aE.j?0:1;
               return;
            case 165:
               aE.n = var3 == 0;
               aE.a();
            }

            return;
         }

         if(var2 == 1) {
            if(var3 == 1) {
               this.aU = 0.9D;
            }

            if(var3 == 2) {
               this.aU = 0.8D;
            }

            if(var3 == 3) {
               this.aU = 0.7D;
            }

            if(var3 == 4) {
               this.aU = 0.6D;
            }

            u.a(this.aU);
            i.e.a();
            this.hm = true;
         }

         if(var2 == 3 && !aS) {
            boolean var5 = fV;
            if(var3 == 0) {
               if(!fV) {
                  this.hp = 0;
               }

               this.g(256);
               fV = true;
            }

            if(var3 == 1) {
               this.g(192);
               fV = true;
            }

            if(var3 == 2) {
               this.g(128);
               fV = true;
            }

            if(var3 == 3) {
               this.g(64);
               fV = true;
            }

            if(var3 == 4) {
               fV = false;
            }

            if(fV != var5) {
               if(fV) {
                  this.gP = this.cX;
                  this.gQ = true;
                  this.F.a(2, this.gP);
               } else {
                  this.I();
               }

               this.hp = 0;
            }
         }

         if(var2 == 4 && !aS) {
            ax.a = var3;
            if(var3 == 0) {
               this.bz = true;
               ao.g = 0;
            }

            if(var3 == 1) {
               this.bz = true;
               ao.g = -400;
            }

            if(var3 == 2) {
               this.bz = true;
               ao.g = -800;
            }

            if(var3 == 3) {
               this.bz = true;
               ao.g = -1200;
            }

            if(var3 == 4) {
               this.bz = false;
            }
         }

         if(var2 == 5) {
            this.hl = var3;
         }

         if(var2 == 6) {
            this.hg = var3;
         }

         if(var2 == 7) {
            this.aP = var3 == 1;
         }

         if(var2 == 8) {
            this.gB = var3;
            ac = true;
         }

         if(var2 == 9) {
            this.co = var3;
            return;
         }
      } catch (Exception var4) {
         ;
      }

   }

   private void B() {
      try {
         int var1 = 0;

         int var2;
         int var12;
         for(var2 = -1; var2 < this.cd + this.bq; ++var2) {
            Object var3;
            if(var2 == -1) {
               var3 = M;
            } else if(var2 < this.cd) {
               var3 = this.cc[this.ce[var2]];
            } else {
               var3 = this.bp[this.br[var2 - this.cd]];
            }

            if(var3 != null && ((w)var3).c()) {
               h var4;
               if(var3 instanceof z) {
                  var4 = ((z)var3).ad;
                  if(((z)var3).ad.r != null) {
                     var4 = var4.b();
                  }

                  if(var4 == null) {
                     continue;
                  }
               }

               if(var2 < this.cd) {
                  var12 = 30;
                  A var5;
                  if((var5 = (A)var3).al >= 0) {
                     this.a((w)var3, ((w)var3).h + 15);
                     if(this.db >= 0) {
                        if(var5.am < 2) {
                           this.fh[var5.am].d(this.db - 12, this.dc - 30);
                           var12 += 25;
                        }

                        if(var5.al < 7) {
                           this.fg[var5.al].d(this.db - 12, this.dc - var12);
                           var12 += 18;
                        }
                     }
                  }

                  if(var2 >= 0 && this.bC == 10 && this.cC == this.ce[var2]) {
                     this.a((w)var3, ((w)var3).h + 15);
                     if(this.db >= 0) {
                        this.fi[0].d(this.db - 12, this.dc - var12);
                     }
                  }
               } else {
                  var4 = ((z)var3).ad;
                  if(((z)var3).ad.j >= 0 && var4.j < this.fg.length) {
                     this.a((w)var3, ((w)var3).h + 15);
                     if(this.db >= 0) {
                        this.fg[var4.j].d(this.db - 12, this.dc - 30);
                     }
                  }

                  if(this.bC == 1 && this.gN == this.br[var2 - this.cd] && S % 20 < 10) {
                     this.a((w)var3, ((w)var3).h + 15);
                     if(this.db >= 0) {
                        this.fi[0].d(this.db - 12, this.dc - 28);
                     }
                  }
               }

               if(((w)var3).g != null && (var2 >= this.cd || this.ak == 0 || this.ak == 3 || this.ak == 1 && this.f(((A)var3).ai))) {
                  this.a((w)var3, ((w)var3).h);
                  if(this.db >= 0 && var1 < 50) {
                     this.dj[var1] = this.hA.b(((w)var3).g) / 2;
                     this.di[var1] = this.hA.a;
                     this.dg[var1] = this.db;
                     this.dh[var1] = this.dc;
                     this.dk[var1] = ((w)var3).l;
                     this.dl[var1] = ((w)var3).D;
                     this.dm[var1] = ((w)var3).H;
                     this.dn[var1++] = ((w)var3).g;
                     if(this.hg == 0 && ((w)var3).D > 0 && ((w)var3).D <= 3) {
                        this.di[var1] += 10;
                        this.dh[var1] += 5;
                     }

                     if(this.hg == 0 && ((w)var3).D == 4) {
                        this.dj[var1] = 60;
                     }

                     if(this.hg == 0 && ((w)var3).D == 5) {
                        this.di[var1] += 5;
                     }
                  }
               }

               if(((w)var3).E > S) {
                  try {
                     this.a((w)var3, ((w)var3).h + 15);
                     if(this.db >= 0) {
                        if((var12 = ((w)var3).F * 30 / ((w)var3).G) > 30) {
                           var12 = 30;
                        }

                        q.b(5, this.dc - 3, this.db - 15, '\uff00', var12);
                        q.b(5, this.dc - 3, this.db - 15 + var12, 16711680, 30 - var12);
                     }
                  } catch (Exception var9) {
                     ;
                  }
               }

               for(var12 = 0; var12 < 4; ++var12) {
                  if(((w)var3).o[var12] > S) {
                     this.a((w)var3, ((w)var3).h / 2);
                     if(this.db >= 0) {
                        if(var12 == 1) {
                           this.dc -= 20;
                        }

                        if(var12 == 2) {
                           this.db -= 15;
                           this.dc -= 10;
                        }

                        if(var12 == 3) {
                           this.db += 15;
                           this.dc -= 10;
                        }

                        this.ds[((w)var3).n[var12]].d(this.db - 12, this.dc - 12);
                        this.ag.a(0, String.valueOf(((w)var3).m[var12]), this.dc + 4, this.db);
                        this.ag.a(16777215, String.valueOf(((w)var3).m[var12]), this.dc + 3, this.db - 1);
                     }
                  }
               }
            }
         }

         for(var2 = 0; var2 < var1; ++var2) {
            int var11 = this.dg[var2];
            var12 = this.dh[var2];
            int var13 = this.dj[var2];
            int var6 = this.di[var2];
            boolean var7 = true;

            while(var7) {
               var7 = false;

               for(int var8 = 0; var8 < var2; ++var8) {
                  if(var12 + 2 > this.dh[var8] - this.di[var8] && var12 - var6 < this.dh[var8] + 2 && var11 - var13 < this.dg[var8] + this.dj[var8] && var11 + var13 > this.dg[var8] - this.dj[var8] && this.dh[var8] - this.di[var8] < var12) {
                     var12 = this.dh[var8] - this.di[var8];
                     var7 = true;
                  }
               }
            }

            this.db = this.dg[var2];
            this.dc = this.dh[var2] = var12;
            String var14 = this.dn[var2];
            if(this.hg == 0) {
               var11 = 16776960;
               if(this.dk[var2] < 6) {
                  var11 = this.dd[this.dk[var2]];
               }

               if(this.dk[var2] == 6) {
                  var11 = this.hu % 20 >= 10?16776960:16711680;
               }

               if(this.dk[var2] == 7) {
                  var11 = this.hu % 20 >= 10?'\uffff':255;
               }

               if(this.dk[var2] == 8) {
                  var11 = this.hu % 20 >= 10?8454016:'\ub000';
               }

               if(this.dk[var2] == 9) {
                  if((var12 = 150 - this.dm[var2]) < 50) {
                     var11 = 16711680 + var12 * 1280;
                  } else if(var12 < 100) {
                     var11 = 16776960 - 327680 * (var12 - 50);
                  } else if(var12 < 150) {
                     var11 = '\uff00' + 5 * (var12 - 100);
                  }
               }

               if(this.dk[var2] == 10) {
                  if((var12 = 150 - this.dm[var2]) < 50) {
                     var11 = 16711680 + 5 * var12;
                  } else if(var12 < 100) {
                     var11 = 16711935 - 327680 * (var12 - 50);
                  } else if(var12 < 150) {
                     var11 = 255 + 327680 * (var12 - 100) - 5 * (var12 - 100);
                  }
               }

               if(this.dk[var2] == 11) {
                  if((var12 = 150 - this.dm[var2]) < 50) {
                     var11 = 16777215 - var12 * 327685;
                  } else if(var12 < 100) {
                     var11 = '\uff00' + 327685 * (var12 - 50);
                  } else if(var12 < 150) {
                     var11 = 16777215 - 327680 * (var12 - 100);
                  }
               }

               if(this.dl[var2] == 0) {
                  this.hA.a(0, var14, this.dc + 1, this.db);
                  this.hA.a(var11, var14, this.dc, this.db);
               }

               if(this.dl[var2] == 1) {
                  this.hA.a(0, var14, this.db, this.hu, this.dc + 1);
                  this.hA.a(var11, var14, this.db, this.hu, this.dc);
               }

               if(this.dl[var2] == 2) {
                  this.hA.b(this.db, var14, this.hu, this.dc + 1, 0);
                  this.hA.b(this.db, var14, this.hu, this.dc, var11);
               }

               if(this.dl[var2] == 3) {
                  this.hA.a(150 - this.dm[var2], var14, this.hu, this.dc + 1, this.db, 0);
                  this.hA.a(150 - this.dm[var2], var14, this.hu, this.dc, this.db, var11);
               }

               if(this.dl[var2] == 4) {
                  var12 = this.hA.b(var14);
                  var13 = (150 - this.dm[var2]) * (var12 + 100) / 150;
                  q.b(334, this.db - 50, this.db + 50, 0);
                  this.hA.b(0, var14, this.dc + 1, this.db + 50 - var13);
                  this.hA.b(var11, var14, this.dc, this.db + 50 - var13);
                  q.e();
               }

               if(this.dl[var2] == 5) {
                  var12 = 150 - this.dm[var2];
                  var13 = 0;
                  if(var12 < 25) {
                     var13 = var12 - 25;
                  } else if(var12 > 125) {
                     var13 = var12 - 125;
                  }

                  q.b(this.dc + 5, 0, 512, this.dc - this.hA.a - 1);
                  this.hA.a(0, var14, this.dc + 1 + var13, this.db);
                  this.hA.a(var11, var14, this.dc + var13, this.db);
                  q.e();
               }
            } else {
               this.hA.a(0, var14, this.dc + 1, this.db);
               this.hA.a(16776960, var14, this.dc, this.db);
            }
         }

      } catch (Exception var10) {
         ;
      }
   }

   private void a(long var1) {
      if(var1 != 0L) {
         try {
            for(int var3 = 0; var3 < this.cj; ++var3) {
               if(this.cU[var3] == var1) {
                  --this.cj;

                  for(Q = true; var3 < this.cj; ++var3) {
                     this.eS[var3] = this.eS[var3 + 1];
                     this.bj[var3] = this.bj[var3 + 1];
                     this.cU[var3] = this.cU[var3 + 1];
                  }

                  this.gz.a(215);
                  this.gz.a(var1);
                  return;
               }
            }

         } catch (RuntimeException var4) {
            ao.b("18622, false, " + var1 + ", " + var4.toString());
            throw new RuntimeException();
         }
      }
   }

   private boolean C() {
      return this.X != -1;
   }

   private void D() {
      if(a == b.a) {
         gd.a();
      }

      u.s = gs;
      if(this.C()) {
         f = true;
      }

      t.a(this);
      if(this.bX) {
         this.e(a == b.a?516:0, a == b.a?168:0);
      }

      if(a == b.a) {
         gd.a(168, super.ao, 516);
      }

      gf.a();
      u.s = gt;
   }

   private void E() {
      int var1;
      int var2;
      for(var1 = -1; var1 < this.cd; ++var1) {
         if(var1 == -1) {
            var2 = 2047;
         } else {
            var2 = this.ce[var1];
         }

         A var3;
         if((var3 = this.cc[var2]) != null && var3.H > 0) {
            var3.H = var3.H - 1;
            if(var3.H == 0) {
               var3.g = null;
            }
         }
      }

      for(var1 = 0; var1 < this.bq; ++var1) {
         var2 = this.br[var1];
         z var4;
         if((var4 = this.bp[var2]) != null && var4.H > 0) {
            var4.H = var4.H - 1;
            if(var4.H == 0) {
               var4.g = null;
            }
         }
      }

   }

   private void e(int var1, int var2) {
      int var3 = this.cO - (var1 - 4);
      int var4 = -var2 + 4 / b + this.cP;
      int var5 = this.cQ;
      int var6 = this.cR + 1;
      ac = true;
      L = true;
      Q = true;
      q.b(var6, var4, var3, 6116423, var5);
      q.b(16, var4 + 1, var3 + 1, 0, var5 - 2);
      q.c(var3 + 1, var5 - 2, var6 - 19, 0, var4 + 18);
      this.hA.b(6116423, "Choose Option", var4 + 14, var3 + 3);
      var1 = super.au - var1;
      var2 = -var2 + super.av;

      for(var6 = 0; var6 < this.O; ++var6) {
         int var7 = var4 + 31 + (this.O - 1 - var6) * 15;
         int var8 = 16777215;
         if(var1 > var3 && var1 < var3 + var5 && var2 > var7 - 13 && var2 < var7 + 3) {
            q.b(15, var7 - 11, var3 + 3, 7301469, this.cQ - 6);
            var8 = 16776960;
         }

         this.hH.a(b(this.Y[var6]), var3 + 3, var7, var8, 0);
      }

   }

   private static String b(String var0) {
      if(!var0.contains("@")) {
         return var0;
      } else {
         String var1 = var0;

         for(int var2 = 0; var2 < var0.length(); ++var2) {
            if(var0.charAt(var2) == 64 && var2 + 4 < var0.length() && var0.charAt(var2 + 4) == 64) {
               String var3;
               String var4;
               if(!(var4 = l.b(var3 = var0.substring(var2 + 1, var2 + 4))).equals("")) {
                  var1 = var1.replaceAll(var0.substring(var2, var2 + 5), "<col=" + var4 + ">");
               } else if(var3.equals("str")) {
                  var1 = var1.replaceAll(var0.substring(var2, var2 + 5), "<str>");
               }
            }
         }

         return var1;
      }
   }

   private void b(long var1) {
      if(var1 != 0L) {
         try {
            if(this.cj >= 200) {
               this.a("Your friendlist is full. Max of 100 for free users, and 200 for members", "", true);
            } else {
               String var3 = aC.c(aC.a(var1));

               int var4;
               for(var4 = 0; var4 < this.cj; ++var4) {
                  if(this.cU[var4] == var1) {
                     this.a(var3 + " is already on your friend list", "", true);
                     return;
                  }
               }

               for(var4 = 0; var4 < this.bg; ++var4) {
                  if(this.cw[var4] == var1) {
                     this.a("Please remove " + var3 + " from your ignore list first", "", true);
                     return;
                  }
               }

               if(!var3.equals(M.ai)) {
                  this.eS[this.cj] = var3;
                  this.cU[this.cj] = var1;
                  this.bj[this.cj] = 0;
                  ++this.cj;
                  Q = true;
                  this.gz.a(188);
                  this.gz.a(var1);
               }
            }
         } catch (RuntimeException var5) {
            ao.b("15283, 68, " + var1 + ", " + var5.toString());
            throw new RuntimeException();
         }
      }
   }

   private int b(int var1, int var2, int var3) {
      int var4 = var3 >> 7;
      int var5 = var2 >> 7;
      if(var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         if(var1 < 3 && (this.ho[1][var4][var5] & 2) == 2) {
            ++var1;
         }

         var3 &= 127;
         var2 &= 127;
         int var6 = this.gI[var1][var4][var5] * (128 - var3) + this.gI[var1][var4 + 1][var5] * var3 >> 7;
         var1 = this.gI[var1][var4][var5 + 1] * (128 - var3) + this.gI[var1][var4 + 1][var5 + 1] * var3 >> 7;
         return var6 * (128 - var2) + var1 * var2 >> 7;
      } else {
         return 0;
      }
   }

   private void F() {
      try {
         if(this.gi != null) {
            this.gi.a();
         }
      } catch (Exception var2) {
         ;
      }

      aE.a();
      aN.b();
      this.if.a();
      this.ig.a();
      this.gi = null;
      R = false;
      if(this.ie != null) {
         this.ie.a();
         this.ie = null;
      }

      this.bn = 0;
      this.hv = "";
      this.hw = "";
      this.fq = "";
      this.bg = 0;
      this.ck = 0;
      this.aV = 0;
      this.aW = 1;
      A();
      this.cN.b();

      for(int var1 = 0; var1 < 4; ++var1) {
         this.gV[var1].a();
      }

      System.gc();
      this.I();
      this.cX = -1;
      this.gP = 0;
      this.hp = 0;
      if(P && !aS) {
         this.gR = 256;
         this.gQ = true;
         this.F.a(2, this.gP);
      }

      this.a(b.a);
      gk = -1;
      gl = "";
   }

   private void G() {
      this.ed = true;
      int var1 = 0;

      while(var1 < 7) {
         this.eC[var1] = -1;
         int var2 = 0;

         while(true) {
            if(var2 < E.a) {
               if(E.b[var2].d || E.b[var2].c != var1 + (this.ep?0:7)) {
                  ++var2;
                  continue;
               }

               this.eC[var1] = var2;
            }

            ++var1;
            break;
         }
      }

   }

   private F H() {
      int var2;
      for(int var1 = 0; var1 < 7; ++var1) {
         if((var2 = this.eC[var1]) >= 0 && !E.b[var2].a()) {
            return null;
         }
      }

      this.ed = false;
      F[] var5 = new F[7];
      var2 = 0;

      int var4;
      for(int var3 = 0; var3 < 7; ++var3) {
         if((var4 = this.eC[var3]) >= 0) {
            var5[var2++] = E.b[var4].b();
         }
      }

      F var6 = new F(var2, var5);

      for(var4 = 0; var4 < 5; ++var4) {
         if(this.du[var4] != 0) {
            var6.a(C[var4][0], C[var4][this.du[var4]]);
            if(var4 == 1) {
               var6.a(Z[0], Z[this.du[var4]]);
            }
         }
      }

      var6.d();
      var6.c(uwotm8.d.a[M.j].c[0]);
      var6.a(64, 850, -30, -50, -30, true);
      return var6;
   }

   private void a(int var1, K var2) {
      int var3;
      while(var2.c + 21 < var1 << 3 && (var3 = var2.f(14)) != 16383) {
         boolean var4 = false;
         if(this.bp[var3] == null) {
            this.bp[var3] = new z();
            var4 = true;
         }

         z var5 = this.bp[var3];
         this.br[this.bq++] = var3;
         var5.I = S;
         int var6;
         if((var6 = var2.f(5)) > 15) {
            var6 -= 32;
         }

         int var7;
         if((var7 = var2.f(5)) > 15) {
            var7 -= 32;
         }

         int var8 = var2.f(1);
         var5.ad = h.a(var2.f(14));
         int var9;
         if((var9 = var2.f(2)) != -1 && var4) {
            int[] var10 = new int[]{1024, 1536, 0, 512};
            var5.X = var5.i = var10[var9];
         }

         if(var2.f(1) == 1) {
            this.cg[this.cf++] = var3;
         }

         var5.L = var5.ad.i;
         var5.e = var5.ad.m;
         var5.Z = var5.ad.h;
         var5.aa = var5.ad.d;
         var5.ab = var5.ad.o;
         var5.ac = var5.ad.c;
         var5.j = var5.ad.k;
         var5.a(M.a[0] + var7, M.b[0] + var6, var8 == 1);
      }

      var2.p();
   }

   public final void d() {
      if(!this.cx) {
         ++S;
         if(!R) {
            label275: {
               Client var1 = this;
               if(super.at == 1 || super.aw == 1) {
                  ++this.gH;
               }

               this.aQ = "";
               int var2 = c / 2;
               int var3 = d / 2;
               if(this.b(c - 52, 10, 42, 42)) {
                  if(this.bn != 1) {
                     this.aQ = this.bn != 2?"Settings":"Main Screen";
                  } else {
                     this.aQ = "Disabled on this screen";
                  }
               }

               if(this.b(c - 104, 10, 42, 42)) {
                  this.aQ = (P?"Mute":"Un-Mute") + " Title Music";
               }

               if(super.aw == 1) {
                  if(this.bn != 1 && this.c(c - 52, 10, 42, 42)) {
                     this.bn = this.bn != 2?2:0;
                     break label275;
                  }

                  if(this.c(c - 104, 10, 42, 42)) {
                     if(!aS) {
                        if(P = !P) {
                           this.gR = 256;
                           this.gP = 0;
                           this.gQ = true;
                           this.F.a(2, this.gP);
                        } else {
                           this.I();
                        }

                        aE.a();
                     }
                     break label275;
                  }

                  if(this.bn == 0) {
                     var2 -= 145;
                     var3 -= 135;
                     if(this.c(var2 + 35, var3 + 68, 218, 27)) {
                        this.gK = 0;
                     } else if(this.c(var2 + 35, var3 + 114, 218, 27)) {
                        this.gK = 1;
                     } else if(this.c(var2 + 35, var3 + 150, 106, 13)) {
                        V = !V;
                        aE.a();
                     } else if(this.c(var2 + 55, var3 + 174, 179, 25)) {
                        this.af();
                     }
                  } else if(this.bn == 1) {
                     var3 -= 135;
                     if(this.c(var2 - 57, var3 + 145, 114, 25)) {
                        this.af();
                     } else if(this.c(var2 - 57, var3 + 178, 114, 25)) {
                        this.gK = 0;
                        this.bn = 0;
                        gk = -1;
                        gl = "";
                        this.hv = "";
                        this.hw = "";
                     }
                  } else if(this.bn == 2) {
                     Rectangle var9;
                     var3 = (var9 = new Rectangle(var2 - 138, 88, 276, 216)).y + 30;
                     if(!aL.b(aM.a) && this.c((int)var9.getCenterX() - 132, var3, 128, 96)) {
                        aL.a(aM.a);
                        t = aL.c();
                        aE.a();
                     } else if(!aL.b(aM.b) && this.c((int)var9.getCenterX() + 4, var3, 128, 96)) {
                        aL.a(aM.b);
                        t = aL.c();
                        aE.a();
                     } else if(this.c((int)var9.getCenterX() - 64, 64 + (int)var9.getHeight() - 16, 128, 32)) {
                        var3 = b;

                        for(int var4 = 0; var4 < 4; ++var4) {
                           int var5 = (int)var9.getCenterX() - 64 + (var4 << 5);
                           int var6 = 64 + (int)var9.getHeight() - 16;
                           int var7 = var4 + 1;
                           if(var1.c(var5, var6, 32, 32) && ai() >= var7 * 503) {
                              b = var7;
                              break;
                           }
                        }

                        if(var3 != b) {
                           a(b.a, c, d);
                        }
                     }
                  }
               }

               if((var1.bn == 0 || var1.bn == 1) && (var2 = var1.m()) != -1) {
                  boolean var10;
                  if(var1.bn == 0) {
                     var10 = aC.a((char)var2, var1.gK == 1);
                     if(var1.gK == 0) {
                        if(var2 == 8 && T.length() > 0) {
                           T = T.substring(0, T.length() - 1);
                        }

                        if(var2 == 9 || var2 == 10 || var2 == 13) {
                           var1.gK = 1;
                        }

                        if(var10) {
                           T = T + (char)var2;
                        }

                        if(T.length() > 12) {
                           T = T.substring(0, 12);
                        }
                     } else if(var1.gK == 1) {
                        if(var2 == 8 && U.length() > 0) {
                           U = U.substring(0, U.length() - 1);
                        }

                        if(var2 == 9) {
                           var1.gK = 0;
                        }

                        if(var10) {
                           U = U + (char)var2;
                        }

                        if(U.length() > 20) {
                           U = U.substring(0, 20);
                        }

                        if(var2 == 13 || var2 == 10) {
                           var1.af();
                        }
                     }
                  } else if(var1.bn == 1) {
                     var10 = var2 >= 48 && var2 <= 57;
                     if(var1.gK == 0) {
                        label259: {
                           if(var2 == 8 && gl.length() > 0) {
                              gl = gl.substring(0, gl.length() - 1);
                           }

                           if(var10) {
                              gl = gl + (char)var2;
                           }

                           if(gl.length() > 6) {
                              gl = gl.substring(0, 6);
                           }

                           if(gl != null && !gl.isEmpty()) {
                              try {
                                 gk = Integer.parseInt(gl);
                              } catch (Exception var8) {
                                 gk = -1;
                                 gl = "";
                                 break label259;
                              }
                           }

                           if(var2 == 13 || var2 == 10) {
                              var1.af();
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.K();
         }

         this.J();
      }
   }

   private void b(boolean var1) {
      if(M.V >> 7 == this.hq && M.W >> 7 == this.hr) {
         this.hq = 0;
      }

      int var2 = this.cd;
      if(var1) {
         var2 = 1;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         A var4;
         int var5;
         if(var1) {
            var4 = M;
            var5 = 33538048;
         } else {
            var4 = this.cc[this.ce[var3]];
            var5 = this.ce[var3] << 14;
         }

         if(var4 != null && var4.aq) {
            var4.af = this.cd > 200 && !var1 && var4.p == var4.j;
            int var6 = var4.V >> 7;
            int var7 = var4.W >> 7;
            if(var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
               if(var4.au != null && S >= var4.an && S < var4.ao) {
                  var4.af = false;
                  var4.ap = this.b(this.ct, var4.W, var4.V);
                  this.cN.a(this.ct, var4.W, var4, var4.X, var4.az, var4.V, var4.ap, var4.aw, var4.ay, var5, var4.ax);
               } else {
                  if((var4.V & 127) == 64 && (var4.W & 127) == 64) {
                     if(this.cz[var6][var7] == this.hu) {
                        continue;
                     }

                     this.cz[var6][var7] = this.hu;
                  }

                  var4.ap = this.b(this.ct, var4.W, var4.V);
                  this.cN.a(this.ct, var4.X, var4.ap, var5, var4.W, 60, var4.V, var4, var4.M);
               }
            }
         }
      }

   }

   private boolean a(m var1) {
      int var5 = var1.d;
      if(this.cl == 2) {
         if(var5 == 201) {
            ac = true;
            this.ad = 0;
            this.hn = true;
            this.gG = "";
            this.eB = 1;
            this.fC = "Enter name of friend to add to list";
         }

         if(var5 == 202) {
            ac = true;
            this.ad = 0;
            this.hn = true;
            this.gG = "";
            this.eB = 2;
            this.fC = "Enter name of friend to delete from list";
         }
      }

      if(var5 == 205) {
         this.dM = 250;
         return true;
      } else {
         if(var5 == 501) {
            ac = true;
            this.ad = 0;
            this.hn = true;
            this.gG = "";
            this.eB = 4;
            this.fC = "Enter name of player to add to list";
         }

         if(var5 == 502) {
            ac = true;
            this.ad = 0;
            this.hn = true;
            this.gG = "";
            this.eB = 5;
            this.fC = "Enter name of player to delete from list";
         }

         if(var5 == 550) {
            ac = true;
            this.ad = 0;
            this.hn = true;
            this.gG = "";
            this.eB = 6;
            this.fC = "Enter the name of the chat you wish to join";
         }

         int var2;
         int var3;
         int var4;
         if(var5 >= 300 && var5 <= 313) {
            var2 = (var5 - 300) / 2;
            var3 = var5 & 1;
            if((var4 = this.eC[var2]) != -1) {
               do {
                  do {
                     if(var3 == 0) {
                        --var4;
                        if(var4 < 0) {
                           var4 = E.a - 1;
                        }
                     }

                     if(var3 == 1) {
                        ++var4;
                        if(var4 >= E.a) {
                           var4 = 0;
                        }
                     }
                  } while(E.b[var4].d);
               } while(E.b[var4].c != var2 + (this.ep?0:7));

               this.eC[var2] = var4;
               this.ed = true;
            }
         }

         if(var5 >= 314 && var5 <= 323) {
            var2 = (var5 - 314) / 2;
            var3 = var5 & 1;
            var4 = this.du[var2];
            if(var3 == 0) {
               --var4;
               if(var4 < 0) {
                  var4 = C[var2].length - 1;
               }
            }

            if(var3 == 1) {
               ++var4;
               if(var4 >= C[var2].length) {
                  var4 = 0;
               }
            }

            this.du[var2] = var4;
            this.ed = true;
         }

         if(var5 == 324 && !this.ep) {
            this.ep = true;
            this.G();
         }

         if(var5 == 325 && this.ep) {
            this.ep = false;
            this.G();
         }

         if(var5 == 326) {
            this.gz.a(101);
            this.gz.b(this.ep?0:1);

            for(var2 = 0; var2 < 7; ++var2) {
               this.gz.b(this.eC[var2]);
            }

            for(var2 = 0; var2 < 5; ++var2) {
               this.gz.b(this.du[var2]);
            }

            return true;
         } else {
            if(var5 == 620) {
               this.fZ = !this.fZ;
            }

            if(var5 >= 601 && var5 <= 613) {
               if(v == this.gp) {
                  if(this.bU.length() > 0) {
                     this.gz.a(218);
                     this.gz.b(11);
                     this.gz.b(0);
                     this.gz.a(aC.a(this.bU));
                     this.gz.b(var5 - 601);
                     this.gz.b(this.fZ?1:0);
                     this.bU = "";
                     this.fZ = false;
                     this.ah();
                  }
               } else if(v == this.gq) {
                  if(this.bV[0].length() <= 0 || m.a(this.gq, 31).y) {
                     return true;
                  }

                  for(var2 = 0; var2 < this.bV.length; ++var2) {
                     this.gz.a(218);
                     this.gz.b(1 + this.bV[var2].length() + 1);
                     this.gz.b(var2 + 1);
                     this.gz.a(this.bV[var2]);
                  }

                  this.bV = new String[]{"", "", ""};
                  this.ah();
               }
            }

            return var5 >= 10000 && var5 <= 10022;
         }
      }
   }

   private void a(K var1) {
      for(int var2 = 0; var2 < this.cf; ++var2) {
         int var3 = this.cg[var2];
         A var4 = this.cc[var3];
         int var5;
         if(((var5 = var1.f()) & 64) != 0) {
            var5 += var1.f() << 8;
         }

         A var7 = var4;
         K var6 = var1;
         Client var18 = this;
         if((var5 & 1024) != 0) {
            var4.O = var1.v();
            var4.Q = var1.v();
            var4.P = var1.v();
            var4.R = var1.v();
            var4.S = var1.z() + S;
            var4.T = var1.y() + S;
            var4.U = var1.v();
            var4.b();
         }

         int var8;
         if((var5 & 256) != 0) {
            var4.s = var1.x();
            var8 = var1.k();
            var4.w = var8 >> 16;
            var4.v = S + (var8 & '\uffff');
            var4.t = 0;
            var4.u = 0;
            if(var4.v > S) {
               var4.t = -1;
            }

            if(var4.s == '\uffff') {
               var4.s = -1;
            }
         }

         int var9;
         int var10;
         if((var5 & 8) != 0) {
            if((var8 = var1.x()) == '\uffff') {
               var8 = -1;
            }

            var9 = var1.u();
            if(var8 == var4.y && var8 != -1) {
               if((var10 = uwotm8.d.a[var8].n) == 1) {
                  var4.z = 0;
                  var4.A = 0;
                  var4.B = var9;
                  var4.C = 0;
               }

               if(var10 == 2) {
                  var4.C = 0;
               }
            } else if(var8 == -1 || var4.y == -1 || uwotm8.d.a[var8].h >= uwotm8.d.a[var4.y].h) {
               var4.y = var8;
               var4.z = 0;
               var4.A = 0;
               var4.B = var9;
               var4.C = 0;
               var4.N = var4.x;
            }
         }

         if((var5 & 4) != 0) {
            var4.g = var1.m();
            if(var4.g.charAt(0) == 126) {
               var4.g = var4.g.substring(1);
               this.a(var4.g, 2, var4.ai);
            } else if(var4 == M) {
               this.a(var4.g, 2, var4.ai);
            }

            var4.l = 0;
            var4.D = 0;
            var4.H = 150;
         }

         if((var5 & 128) != 0) {
            var8 = var1.x();
            var9 = var1.f();
            var10 = var1.u();
            int var11 = var1.b;
            if(var4.ai != null && var4.aq) {
               long var15 = aC.a(var4.ai);
               boolean var12 = false;
               int var13;
               if(var9 <= 1) {
                  for(var13 = 0; var13 < var18.bg; ++var13) {
                     if(var18.cw[var13] == var15) {
                        var12 = true;
                        break;
                     }
                  }
               }

               if(!var12 && var18.hj == 0) {
                  try {
                     var18.bo.b = 0;
                     byte[] var14 = var18.bo.a;
                     K var22 = var6;

                     for(var13 = var10 - 1; var13 >= 0; --var13) {
                        var14[var13] = var22.a[var22.b++];
                     }

                     var18.bo.b = 0;
                     String var23 = aB.a(var10, var18.bo);
                     var7.g = var23;
                     var7.l = var8 >> 8;
                     var7.ad = var9;
                     var7.D = var8 & 255;
                     var7.H = 150;
                     var8 = var9 > 0?1:2;
                     if(var7.aB == 1) {
                        var18.a(var23, var8, "@irn@" + var7.ai, var9);
                     } else if(var7.aB == 2) {
                        var18.a(var23, var8, "@hci@" + var7.ai, var9);
                     } else if(var7.aB == 3) {
                        var18.a(var23, var8, "@ult@" + var7.ai, var9);
                     } else {
                        var18.a(var23, var8, var7.ai, var9);
                     }
                  } catch (Exception var17) {
                     ao.b("cde2");
                  }
               }
            }

            var1.b = var11 + var10;
         }

         if((var5 & 1) != 0) {
            var4.c = var1.x();
            if(var4.c == '\uffff') {
               var4.c = -1;
            }
         }

         if((var5 & 16) != 0) {
            byte[] var20 = new byte[var8 = var1.u()];
            K var21 = new K(var20);
            var1.a(var8, var20);
            var18.ch[var3] = var21;
            var4.a(var21);
         }

         if((var5 & 2) != 0) {
            var4.J = var1.z();
            var4.K = var1.x();
         }

         if((var5 & 32) != 0) {
            var8 = var1.f();
            var9 = var1.t();
            var4.a(var9, var8, S);
            var4.E = S + 300;
            var4.F = var1.u();
            var4.G = var1.f();
         }

         if((var5 & 512) != 0) {
            var8 = var1.f();
            var9 = var1.v();
            var4.a(var9, var8, S);
            var4.E = S + 300;
            var4.F = var1.f();
            var4.G = var1.u();
         }
      }

   }

   private void c(int var1, int var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      int var9;
      if((var4 = this.cN.j(var3, var2, var1)) != 0) {
         var6 = (var5 = this.cN.c(var3, var2, var1, var4)) >> 6 & 3;
         var5 &= 31;
         var7 = 16777215;
         if(var4 > 0) {
            var7 = 15597568;
         }

         int[] var8 = this.hs.b;
         var9 = 24624 + (var2 << 2) + (103 - var1 << 9 << 2);
         j var10;
         if((var10 = j.a(var4 >> 14 & 32767)) != null && var10.n != -1) {
            k var11;
            if((var11 = this.ey[var10.n]) != null) {
               var5 = ((var10.h << 2) - var11.c) / 2;
               var6 = ((var10.p << 2) - var11.d) / 2;
               var11.a(48 + (var2 << 2) + var5, 48 + (104 - var1 - var10.p << 2) + var6);
            }
         } else {
            if(var5 == 0 || var5 == 2) {
               if(var6 == 0) {
                  var8[var9] = var7;
                  var8[var9 + 512] = var7;
                  var8[var9 + 1024] = var7;
                  var8[var9 + 1536] = var7;
               } else if(var6 == 1) {
                  var8[var9] = var7;
                  var8[var9 + 1] = var7;
                  var8[var9 + 2] = var7;
                  var8[var9 + 3] = var7;
               } else if(var6 == 2) {
                  var8[var9 + 3] = var7;
                  var8[var9 + 3 + 512] = var7;
                  var8[var9 + 3 + 1024] = var7;
                  var8[var9 + 3 + 1536] = var7;
               } else if(var6 == 3) {
                  var8[var9 + 1536] = var7;
                  var8[var9 + 1536 + 1] = var7;
                  var8[var9 + 1536 + 2] = var7;
                  var8[var9 + 1536 + 3] = var7;
               }
            }

            if(var5 == 3) {
               if(var6 == 0) {
                  var8[var9] = var7;
               } else if(var6 == 1) {
                  var8[var9 + 3] = var7;
               } else if(var6 == 2) {
                  var8[var9 + 3 + 1536] = var7;
               } else if(var6 == 3) {
                  var8[var9 + 1536] = var7;
               }
            }

            if(var5 == 2) {
               if(var6 == 3) {
                  var8[var9] = var7;
                  var8[var9 + 512] = var7;
                  var8[var9 + 1024] = var7;
                  var8[var9 + 1536] = var7;
               } else if(var6 == 0) {
                  var8[var9] = var7;
                  var8[var9 + 1] = var7;
                  var8[var9 + 2] = var7;
                  var8[var9 + 3] = var7;
               } else if(var6 == 1) {
                  var8[var9 + 3] = var7;
                  var8[var9 + 3 + 512] = var7;
                  var8[var9 + 3 + 1024] = var7;
                  var8[var9 + 3 + 1536] = var7;
               } else if(var6 == 2) {
                  var8[var9 + 1536] = var7;
                  var8[var9 + 1536 + 1] = var7;
                  var8[var9 + 1536 + 2] = var7;
                  var8[var9 + 1536 + 3] = var7;
               }
            }
         }
      }

      if((var4 = this.cN.l(var3, var2, var1)) != 0) {
         var6 = (var5 = this.cN.c(var3, var2, var1, var4)) >> 6 & 3;
         var5 &= 31;
         j var15;
         int var17;
         if((var15 = j.a(var4 >> 14 & 32767)) != null && var15.n != -1) {
            k var18;
            if((var18 = this.ey[var15.n]) != null) {
               var4 = ((var15.h << 2) - var18.c) / 2;
               var17 = ((var15.p << 2) - var18.d) / 2;
               var18.a(48 + (var2 << 2) + var4, 48 + (104 - var1 - var15.p << 2) + var17);
            }
         } else if(var5 == 9) {
            var9 = 15658734;
            if(var4 > 0) {
               var9 = 15597568;
            }

            int[] var12 = this.hs.b;
            var17 = 24624 + (var2 << 2) + (103 - var1 << 9 << 2);
            if(var6 != 0 && var6 != 2) {
               var12[var17] = var9;
               var12[var17 + 512 + 1] = var9;
               var12[var17 + 1024 + 2] = var9;
               var12[var17 + 1536 + 3] = var9;
            } else {
               var12[var17 + 1536] = var9;
               var12[var17 + 1024 + 1] = var9;
               var12[var17 + 512 + 2] = var9;
               var12[var17 + 3] = var9;
            }
         }
      }

      k var13;
      j var14;
      if((var4 = this.cN.m(var3, var2, var1)) != 0 && (var14 = j.a(var4 >> 14 & 32767)) != null && var14.n != -1 && (var13 = this.ey[var14.n]) != null) {
         var7 = ((var14.h << 2) - var13.c) / 2;
         int var16 = ((var14.p << 2) - var13.d) / 2;
         var13.a(48 + (var2 << 2) + var7, 48 + (104 - var1 - var14.p << 2) + var16);
      }

   }

   public static void main(String[] var0) {
      try {
         cY = 10;
         x = 0;
         Y.a = false;
         u.a = false;
         U.c = false;
         j.k = false;
         da = true;
         ao.a = 32;
         InetAddress.getLocalHost();
         // Cache shit
         ao.b();
         if(var0.length == 1 && var0[0].equals("mute")) {
            aS = true;
         }

         Client var10000 = k = new Client();
         int var2 = d;
         int var1 = c;
         Client var4 = var10000;
         //isApplet = false;
         var10000.aA = false;
         // myWidth = w;
         var4.am = var1;
         // myHeight = h;
         var4.an = var2;

         // rsFrame = new RSFrame(RSApplet applet, int width, int height, boolean resizable, boolean fullscreen)
         var4.aq = new d(var4, var4.am, var4.an, a == b.b, a == b.c);

         // Receives key events for focus traversal keys.
         var4.aq.setFocusTraversalKeysEnabled(false);

         // graphics = getGameComponent().getGraphics();
         var4.ao = var4.g().getGraphics();

         // fullGameScreen = new RSImageProducer(myWidth, myHeight);
         var4.ap = new t(var4.am, var4.an);

         // startRunnable(this, 1);
         var4.a(var4, 1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static Client e() {
      return k;
   }

   public AppletContext getAppletContext() {
      Applet var10000 = ao.e;
      return super.getAppletContext();
   }

   private void g(int var1) {
      if(!aS) {
         this.gR = var1;
         if(this.gT == null) {
            return;
         }

         this.gT.a(this.gR);
      }

   }

   private void I() {
      if(!aS && this.gT != null) {
         this.gT.b();
      }

   }

   private void d(int var1, int var2, int var3) {
      if(!aS && this.bz && this.ez < 50) {
         this.gE[this.ez] = var1;
         this.hi[this.ez] = var2;
         this.hh[this.ez] = var3;
         ++this.ez;
      }

   }

   private void b(int var1, int var2, int var3, int var4, int var5) {
      if(!aS && this.bz && this.ez < 50) {
         var3 -= M.a[0];
         var4 -= M.b[0];
         if((int)Math.sqrt(Math.pow((double)var3, 2.0D) + Math.pow((double)var4, 2.0D)) <= var5) {
            this.gE[this.ez] = var1;
            this.hi[this.ez] = 10;
            this.hh[this.ez] = var2;
            ++this.ez;
         }
      }
   }

   private void J() {
      af var1;
      while((var1 = this.F.d()) != null) {
         if(var1.a == 0) {
            F.a(var1.b, var1.c);
            Q = true;
            if(this.aj != -1) {
               ac = true;
            }
         }

         if(var1.a == 1 && var1.b != null) {
            e.a(var1.b, var1.c);
         }

         if(var1.a == 2 && var1.c == this.gP && var1.b != null) {
            byte[] var4 = var1.b;
            boolean var3 = this.gQ;
            if(!aS && this.gT != null) {
               boolean var5 = this.hp > 0;
               if(var3 && !var5) {
                  this.gT.a(var4, this.gS, this.gR);
               } else {
                  this.gT.a(var4, false, this.gR);
               }
            }
         }

         if(var1.a == 3 && this.dW == 1) {
            for(int var2 = 0; var2 < this.gu.length; ++var2) {
               if(this.gX[var2] == var1.c) {
                  this.gu[var2] = var1.b;
                  if(var1.b == null) {
                     this.gX[var2] = -1;
                  }
                  break;
               }

               if(this.gY[var2] == var1.c) {
                  this.hf[var2] = var1.b;
                  if(var1.b == null) {
                     this.gY[var2] = -1;
                  }
                  break;
               }
            }
         }

         if(var1.a == 93 && this.F.b(var1.c)) {
            U.a(new K(var1.b), this.F);
         }
      }

   }

   private static void h(int var0) {
      if(var0 != -1 && var0 < m.a.length) {
         m[] var1 = m.a[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            m var3;
            if((var3 = var1[var2]) != null) {
               var3.ap = 0;
               var3.ao = 0;
               var3.aq = 0;
            }
         }

         p.a(var0, var1);
      }
   }

   private static void a(String var0, int var1, int var2) {
      m var3;
      if((var3 = m.a(var1, var2)) != null) {
         var3.V = var0;
         if(var0.contains("<url=") && var0.endsWith("</url>")) {
            String var4 = var0.substring(0, var0.indexOf("<url="));
            var0 = var0.substring(var4.length() + 5).trim();
            var3.ar = var0.substring(0, var0.indexOf(">"));
            var0 = var0.substring(var3.ar.length() + 1).trim();
            var3.as = var0.substring(0, var0.indexOf("</url>"));
         } else {
            var3.ar = null;
            var3.as = null;
         }

         Q = true;
         ac = true;
      }

   }

   private void K() {
      int var3;
      int var18;
      if(a == b.b) {
         d var4 = this.aq;
         Insets var2 = this.aq.getInsets();
         var18 = (var4.getWidth() - (var2.left + var2.right)) / b;
         var3 = this.aq.a() / b;
         if(c != var18) {
            c = var18;
            aD = var18 * b;
            r();
         }

         if(d != var3) {
            aE = (d = this.aq.a() / b) * b;
            r();
         }

         if(R && (c != aE.d || d != aE.e)) {
            aE.a();
         }
      }

      if(this.fp > 1) {
         --this.fp;
      }

      if(this.dM > 0) {
         --this.dM;
      }

      int var1;
      for(var1 = 0; var1 < 5 && this.ag(); ++var1) {
         ;
      }

      if(R) {
         if(this.dQ > 0) {
            --this.dQ;
         }

         if(super.az[1] == 1 || super.az[2] == 1 || super.az[3] == 1 || super.az[4] == 1) {
            this.dR = true;
         }

         if(this.dR && this.dQ <= 0) {
            this.dQ = 20;
            this.dR = false;
            this.gz.a(86);
            this.gz.c(this.gv);
            this.gz.j(this.W);
         }

         if(super.ar && !this.cT) {
            this.cT = true;
            this.gz.a(3);
            this.gz.b(1);
         }

         if(!super.ar && this.cT) {
            this.cT = false;
            this.gz.a(3);
            this.gz.b(0);
         }

         int var6;
         int var7;
         int var22;
         int var26;
         if(this.dW == 1) {
            Client var19 = this;
            var22 = 0;

            byte var10000;
            while(true) {
               if(var22 >= var19.gu.length) {
                  boolean var24 = true;

                  for(var18 = 0; var18 < var19.gu.length; ++var18) {
                     byte[] var5;
                     if((var5 = var19.hf[var18]) != null) {
                        var6 = (var19.gW[var18] >> 8 << 6) - var19.ef;
                        var7 = ((var19.gW[var18] & 255) << 6) - var19.eg;
                        if(var19.ga) {
                           var6 = 10;
                           var7 = 10;
                        }

                        var24 &= U.a(var6, var5, var7);
                     }
                  }

                  if(!var24) {
                     var10000 = -3;
                  } else if(var19.eR) {
                     var10000 = -4;
                  } else {
                     var19.dW = 2;
                     U.a = var19.ct;
                     Client var20 = var19;

                     int var8;
                     int var10;
                     int var11;
                     int var32;
                     try {
                        var20.dq = -1;
                        var20.dp = false;
                        var20.ew.f();
                        var20.dN.f();
                        u.c();
                        A();
                        var20.cN.b();
                        System.gc();

                        for(var22 = 0; var22 < 4; ++var22) {
                           var20.gV[var22].a();
                        }

                        for(var22 = 0; var22 < 4; ++var22) {
                           for(var26 = 0; var26 < 104; ++var26) {
                              for(var6 = 0; var6 < 104; ++var6) {
                                 var20.ho[var22][var26][var6] = 0;
                              }
                           }
                        }

                        U var28 = new U(var20.ho, var20.gI);
                        var26 = var20.gu.length;
                        var20.gz.a(0);
                        if(!var20.ga) {
                           for(var6 = 0; var6 < var26; ++var6) {
                              var7 = (var20.gW[var6] >> 8 << 6) - var20.ef;
                              var8 = ((var20.gW[var6] & 255) << 6) - var20.eg;
                              byte[] var9;
                              if((var9 = var20.gu[var6]) != null) {
                                 var28.a(var9, var8, var7, var20.eF - 6 << 3, var20.eG - 6 << 3, var20.gV);
                              }
                           }

                           for(var6 = 0; var6 < var26; ++var6) {
                              var7 = (var20.gW[var6] >> 8 << 6) - var20.ef;
                              var8 = ((var20.gW[var6] & 255) << 6) - var20.eg;
                              if(var20.gu[var6] == null && var20.eG < 800) {
                                 var28.a(var8, 64, 64, var7);
                              }
                           }

                           if(++fj > 160) {
                              fj = 0;
                              var20.gz.a(238);
                              var20.gz.b(96);
                           }

                           var20.gz.a(0);

                           for(var6 = 0; var6 < var26; ++var6) {
                              byte[] var31;
                              if((var31 = var20.hf[var6]) != null) {
                                 var8 = (var20.gW[var6] >> 8 << 6) - var20.ef;
                                 var32 = ((var20.gW[var6] & 255) << 6) - var20.eg;
                                 var28.a(var8, var20.gV, var32, var20.cN, var31);
                              }
                           }
                        }

                        if(var20.ga) {
                           int var12;
                           int var13;
                           for(var6 = 0; var6 < 4; ++var6) {
                              for(var7 = 0; var7 < 13; ++var7) {
                                 for(var8 = 0; var8 < 13; ++var8) {
                                    if((var32 = var20.fJ[var6][var7][var8]) != -1) {
                                       var10 = var32 >> 14 & 1023;
                                       var11 = var32 >> 3 & 2047;
                                       var26 = var32 >> 24 & 3;
                                       var32 = var32 >> 1 & 3;
                                       var12 = (var10 / 8 << 8) + var11 / 8;

                                       for(var13 = 0; var13 < var20.gW.length; ++var13) {
                                          if(var20.gW[var13] == var12 && var20.gu[var13] != null) {
                                             var28.a(var26, var32, var20.gV, var7 << 3, (var10 & 7) << 3, var20.gu[var13], (var11 & 7) << 3, var6, var8 << 3);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           for(var6 = 0; var6 < 13; ++var6) {
                              for(var7 = 0; var7 < 13; ++var7) {
                                 if(var20.fJ[0][var6][var7] == -1) {
                                    var28.a(var7 << 3, 8, 8, var6 << 3);
                                 }
                              }
                           }

                           var20.gz.a(0);

                           for(var6 = 0; var6 < 4; ++var6) {
                              for(var7 = 0; var7 < 13; ++var7) {
                                 for(var8 = 0; var8 < 13; ++var8) {
                                    if((var32 = var20.fJ[var6][var7][var8]) != -1) {
                                       var10 = var32 >> 24 & 3;
                                       var11 = var32 >> 1 & 3;
                                       var26 = var32 >> 14 & 1023;
                                       var32 = var32 >> 3 & 2047;
                                       var12 = (var26 / 8 << 8) + var32 / 8;

                                       for(var13 = 0; var13 < var20.gW.length; ++var13) {
                                          if(var20.gW[var13] == var12 && var20.hf[var13] != null) {
                                             var28.a(var20.gV, var20.cN, var10, var7 << 3, (var32 & 7) << 3, var6, var20.hf[var13], (var26 & 7) << 3, var11, var8 << 3);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var20.gz.a(0);
                        var28.a(var20.gV, var20.cN);
                        gf.a();
                        var20.gz.a(0);
                        int var33 = U.b;
                        var20.cN.c();

                        for(var7 = 0; var7 < 104; ++var7) {
                           for(var8 = 0; var8 < 104; ++var8) {
                              var20.c(var7, var8);
                           }
                        }

                        if(++es > 98) {
                           es = 0;
                           var20.gz.a(150);
                        }

                        Client var30 = var20;

                        for(ab var29 = (ab)var20.gr.b(); var29 != null; var29 = (ab)var30.gr.d()) {
                           if(var29.d == -1) {
                              var29.l = 0;
                              var30.a(var29);
                           } else {
                              var29.E();
                           }
                        }
                     } catch (Exception var16) {
                        ;
                     }

                     j.D.a();
                     if(var20.aq != null) {
                        var20.gz.a(210);
                        var20.gz.d(1057001181);
                     }

                     System.gc();
                     u.d();
                     var20.F.e();
                     var22 = (var20.eF - 6) / 8 - 1;
                     var26 = (var20.eF + 6) / 8 + 1;
                     var6 = (var20.eG - 6) / 8 - 1;
                     var7 = (var20.eG + 6) / 8 + 1;
                     if(var20.fR) {
                        var22 = 49;
                        var26 = 50;
                        var6 = 49;
                        var7 = 50;
                     }

                     for(var8 = var22; var8 <= var26; ++var8) {
                        for(var32 = var6; var32 <= var7; ++var32) {
                           if(var8 == var22 || var8 == var26 || var32 == var6 || var32 == var7) {
                              if((var10 = var20.F.a(0, var32, var8)) != -1) {
                                 var20.F.b(var10, 3);
                              }

                              if((var11 = var20.F.a(1, var32, var8)) != -1) {
                                 var20.F.b(var11, 3);
                              }
                           }
                        }
                     }

                     var19.gz.a(121);
                     var10000 = 0;
                  }
                  break;
               }

               if(var19.gu[var22] == null && var19.gX[var22] != -1) {
                  var10000 = -1;
                  break;
               }

               if(var19.hf[var22] == null && var19.gY[var22] != -1) {
                  var10000 = -2;
                  break;
               }

               ++var22;
            }

            byte var21 = var10000;
            if(var10000 != 0 && System.currentTimeMillis() - this.bh > 360000L) {
               ao.b(T + " glcfb " + this.gJ + "," + var21 + ",false," + this.A[0] + "," + this.F.b() + "," + this.ct + "," + this.eF + "," + this.eG);
               this.bh = System.currentTimeMillis();
            }
         }

         if(this.dW == 2 && this.ct != this.dq) {
            this.dq = this.ct;
            this.e(this.ct);
         }

         this.ac();
         this.U();
         ++this.dK;
         if(this.dK > 750) {
            this.O();
         }

         this.ab();
         this.V();
         this.E();
         ++this.cM;
         if(this.cs != 0) {
            this.cr += 20;
            if(this.cr >= 400) {
               this.cs = 0;
            }
         }

         if(this.he != 0) {
            ++this.hb;
            if(this.hb >= 15) {
               if(this.he == 2) {
                  Q = true;
               }

               if(this.he == 3) {
                  ac = true;
               }

               this.he = 0;
            }
         }

         if(this.eW != 0) {
            ++this.dt;
            if(super.au > this.eX + 5 || super.au < this.eX - 5 || super.av > this.eY + 5 || super.av < this.eY - 5) {
               this.ha = true;
            }

            if(super.at == 0) {
               if(this.eW == 2) {
                  Q = true;
               }

               if(this.eW == 3) {
                  ac = true;
               }

               this.eW = 0;
               if(this.ha && this.dt >= 15) {
                  this.eE = -1;
                  this.T();
                  if(v == 174 && this.eU >= 11403314 && this.eU <= 11403324 && (var18 = this.Z()) >= 0 && var18 <= 10) {
                     this.gz.a(213);
                     this.gz.d(this.eU);
                     this.gz.d(11403273 + var18 * 3);
                     this.gz.k(this.eV);
                     this.gz.i(var18);
                  }

                  m var17;
                  if(this.eE == this.eU) {
                     if(this.eD != this.eV) {
                        var17 = m.a(this.eU);
                        byte var23 = 0;
                        if(this.co == 1 && var17.d == 206) {
                           var23 = 1;
                        }

                        if(var17.A[this.eD] <= 0) {
                           var23 = 0;
                        }

                        if(var17.F) {
                           var3 = this.eV;
                           var22 = this.eD;
                           var17.A[this.eD] = var17.A[var3];
                           var17.B[var22] = var17.B[var3];
                           var17.A[var3] = -1;
                           var17.B[var3] = 0;
                        } else if(var23 == 1) {
                           var3 = this.eV;
                           var22 = this.eD;

                           while(var3 != var22) {
                              if(var3 > var22) {
                                 var17.b(var3, var3 - 1);
                                 --var3;
                              } else if(var3 < var22) {
                                 var17.b(var3, var3 + 1);
                                 ++var3;
                              }
                           }
                        } else {
                           var17.b(this.eV, this.eD);
                        }

                        this.gz.a(214);
                        this.gz.d(this.eU);
                        this.gz.g(var23);
                        this.gz.k(this.eV);
                        this.gz.i(this.eD);
                     }
                  } else {
                     var17 = m.a(this.eU);
                     m var27;
                     if((var27 = m.a(this.eE)) != null && var17 != null && var17.G && var27.G) {
                        var3 = this.eV;
                        var22 = this.eD;
                        var26 = var17.A[var3];
                        var17.A[var3] = var27.A[var22];
                        var27.A[var22] = var26;
                        var26 = var17.B[var3];
                        var17.B[var3] = var27.B[var22];
                        var27.B[var22] = var26;
                        this.gz.a(213);
                        this.gz.d(this.eU);
                        this.gz.d(this.eE);
                        this.gz.k(this.eV);
                        this.gz.i(this.eD);
                     }
                  }
               } else if((this.hl == 1 || this.c(this.O - 1)) && this.O > 2) {
                  this.ad();
               } else if(this.O > 0) {
                  this.i(this.O - 1);
               }

               this.hb = 10;
               super.aw = 0;
            }
         }

         if(Y.b != -1) {
            var1 = Y.b;
            var18 = Y.c;
            boolean var25 = this.a(0, 0, 0, 0, M.b[0], 0, 0, var18, M.a[0], true, var1);
            Y.b = -1;
            if(var25) {
               this.cp = super.ax;
               this.cq = super.ay;
               this.cs = 1;
               this.cr = 0;
            }
         }

         if(super.aw == 1 && this.bx != null) {
            this.bx = null;
            ac = true;
            super.aw = 0;
         }

         this.z();
         if(super.at == 1 || super.aw == 1) {
            ++this.gH;
         }

         if(this.ic == 0 && this.hZ == 0 && this.ia == 0) {
            if(this.id > 0) {
               --this.id;
            }
         } else if(this.id < 0 && !this.bX) {
            ++this.id;
            if(this.id == 0 && this.ic != 0) {
               ac = true;
            }
         }

         if(this.dW == 2) {
            this.aa();
         }

         if(this.dW == 2 && this.gb) {
            var18 = (this.fk << 7) + 64;
            var3 = (this.fl << 7) + 64;
            var22 = this.b(this.ct, var3, var18) - this.fm;
            if(this.bD < var18) {
               this.bD += this.fn + (var18 - this.bD) * this.fo / 1000;
               if(this.bD > var18) {
                  this.bD = var18;
               }
            }

            if(this.bD > var18) {
               this.bD -= this.fn + (this.bD - var18) * this.fo / 1000;
               if(this.bD < var18) {
                  this.bD = var18;
               }
            }

            if(this.bE < var22) {
               this.bE += this.fn + (var22 - this.bE) * this.fo / 1000;
               if(this.bE > var22) {
                  this.bE = var22;
               }
            }

            if(this.bE > var22) {
               this.bE -= this.fn + (this.bE - var22) * this.fo / 1000;
               if(this.bE < var22) {
                  this.bE = var22;
               }
            }

            if(this.bF < var3) {
               this.bF += this.fn + (var3 - this.bF) * this.fo / 1000;
               if(this.bF > var3) {
                  this.bF = var3;
               }
            }

            if(this.bF > var3) {
               this.bF -= this.fn + (this.bF - var3) * this.fo / 1000;
               if(this.bF < var3) {
                  this.bF = var3;
               }
            }

            var18 = (this.dw << 7) + 64;
            var3 = (this.dx << 7) + 64;
            var22 = this.b(this.ct, var3, var18) - this.dy;
            var18 -= this.bD;
            var26 = var22 - this.bE;
            var6 = var3 - this.bF;
            var7 = (int)Math.sqrt((double)(var18 * var18 + var6 * var6));
            var3 = (int)(Math.atan2((double)var26, (double)var7) * 325.949D) & 2047;
            var18 = (int)(Math.atan2((double)var18, (double)var6) * -325.949D) & 2047;
            if(var3 < 128) {
               var3 = 128;
            }

            if(var3 > 383) {
               var3 = 383;
            }

            if(this.bG < var3) {
               this.bG += this.dz + (var3 - this.bG) * this.dA / 1000;
               if(this.bG > var3) {
                  this.bG = var3;
               }
            }

            if(this.bG > var3) {
               this.bG -= this.dz + (this.bG - var3) * this.dA / 1000;
               if(this.bG < var3) {
                  this.bG = var3;
               }
            }

            if((var3 = var18 - this.bH) > 1024) {
               var3 -= 2048;
            }

            if(var3 < -1024) {
               var3 += 2048;
            }

            if(var3 > 0) {
               this.bH += this.dz + var3 * this.dA / 1000;
               this.bH &= 2047;
            }

            if(var3 < 0) {
               this.bH -= this.dz + -var3 * this.dA / 1000;
               this.bH &= 2047;
            }

            if((var22 = var18 - this.bH) > 1024) {
               var22 -= 2048;
            }

            if(var22 < -1024) {
               var22 += 2048;
            }

            if(var22 < 0 && var3 > 0 || var22 > 0 && var3 < 0) {
               this.bH = var18;
            }
         }

         for(var1 = 0; var1 < 5; ++var1) {
            ++this.ec[var1];
         }

         this.R();
         ++super.as;
         if(super.as > 20000) {
            this.dM = 250;
            super.as -= 2000;
            this.gz.a(202);
         }

         ++this.dL;
         if(this.dL > 50) {
            this.gz.a(0);
         }

         try {
            if(this.gi != null && this.gz.b > 0) {
               this.gi.a(this.gz.b, this.gz.a);
               this.gz.b = 0;
               this.dL = 0;
               return;
            }
         } catch (IOException var14) {
            this.O();
            return;
         } catch (Exception var15) {
            this.F();
         }

      }
   }

   private void L() {
      if(this.fr == null) {
         super.ap = null;
         gg = null;
         this.ge = null;
         gd = null;
         gf = null;
         this.fG = null;
         this.fu = new t(128, 265);
         q.f();
         this.fv = new t(128, 265);
         q.f();
         this.fr = new t(509, 171);
         q.f();
         this.fs = new t(360, 132);
         q.f();
         this.ft = new t(c, d);
         q.f();
         this.fw = new t(202, 238);
         q.f();
         this.fx = new t(203, 238);
         q.f();
         this.fy = new t(74, 94);
         q.f();
         this.fz = new t(75, 94);
         q.f();
         this.hm = true;
      }
   }

   private void M() {
      if(gg == null) {
         this.bl = false;
         super.ap = null;
         this.fr = null;
         this.fs = null;
         this.ft = null;
         this.fu = null;
         this.fv = null;
         this.fw = null;
         this.fx = null;
         this.fy = null;
         this.fz = null;
         gg = new t(519, 165);
         this.ge = new t(249, 168);
         q.f();
         gd = new t(249, 335);
         gf = new t(512, 334);
         q.f();
         this.fG = new t(249, 45);
         this.hm = true;
      }
   }

   public final void a(int var1, String var2) {
      this.eQ = var1;
      this.er = var2;
      this.L();
      if(this.eu == null) {
         super.a(var1, var2);
      } else {
         this.ft.a();
         this.hA.a(16777215, "vscape is loading - please wait...", 54, 180);
         q.c(28, 304, 34, 9179409, 62);
         q.c(29, 302, 32, 0, 63);
         q.b(30, 64, 30, 9179409, var1 * 3);
         q.b(30, 64, 30 + var1 * 3, 0, 300 - var1 * 3);
         this.hA.a(16777215, var2, 85, 180);
         this.ft.a(171, super.ao, 202);
      }
   }

   private void N() {
      gf.a();
      q.c(2, 130, 21, 16777215, 2);
      q.b(19, 3, 3, 0, 128);
      this.hz.a(16777215, "Loading - please wait.", 17, 67);
      gf.a(a == b.a?4:0, super.ao, a == b.a?4:0);
   }

   private void a(int var1, int var2, int var3, int var4, m var5, int var6, boolean var7, int var8) {
      byte var9;
      if(this.de) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      this.de = false;
      if(var3 >= var1 && var3 < var1 + 16 && var4 >= var6 && var4 < var6 + 16) {
         var5.x -= this.gH << 2;
         if(var7) {
            Q = true;
            return;
         }
      } else if(var3 >= var1 && var3 < var1 + 16 && var4 >= var6 + var2 - 16 && var4 < var6 + var2) {
         var5.x += this.gH << 2;
         if(var7) {
            Q = true;
            return;
         }
      } else if(var3 >= var1 - var9 && var3 < var1 + 16 + var9 && var4 >= var6 + 16 && var4 < var6 + var2 - 16 && this.gH > 0) {
         if((var1 = (var2 - 32) * var2 / var8) < 8) {
            var1 = 8;
         }

         var3 = var4 - var6 - 16 - var1 / 2;
         var1 = var2 - 32 - var1;
         var5.x = (short)((var8 - var2) * var3 / var1);
         if(var7) {
            Q = true;
         }

         this.de = true;
      }

   }

   private boolean e(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & 32767;
      if((var1 = this.cN.c(this.ct, var3, var2, var1)) == -1) {
         return false;
      } else {
         int var5 = var1 & 31;
         var1 = var1 >> 6 & 3;
         if(var5 != 10 && var5 != 11 && var5 != 22) {
            this.a(2, var1, 0, var5 + 1, M.b[0], 0, 0, var2, M.a[0], false, var3);
         } else {
            j var7;
            if((var7 = j.a(var4)) != null) {
               int var6;
               if(var1 != 0 && var1 != 2) {
                  var5 = var7.p;
                  var6 = var7.h;
               } else {
                  var5 = var7.h;
                  var6 = var7.p;
               }

               var4 = var7.u;
               if(var1 != 0) {
                  var4 = (var4 << var1 & 15) + (var4 >> 4 - var1);
               }

               this.a(2, 0, var6, 0, M.b[0], var5, var4, var2, M.a[0], false, var3);
            }
         }

         this.cp = super.ax;
         this.cq = super.ay;
         this.cs = 2;
         this.cr = 0;
         return true;
      }
   }

   private I a(int var1, String var2, String var3, int var4, int var5) {
      byte[] var6 = null;
      int var7 = 5;

      try {
         if(this.A[0] != null) {
            var6 = this.A[0].b(var1);
         }
      } catch (Exception var16) {
         ;
      }

      if(var6 != null) {
         return new I(var6);
      } else {
         while(var6 == null) {
            String var8 = "Unknown error";
            this.a(var5, "Requesting ".concat(String.valueOf(var2)));

            int var9;
            try {
               var9 = 0;
               DataInputStream var10 = this.g(var3 + var4);
               byte[] var11 = new byte[6];
               var10.readFully(var11, 0, 6);
               K var21;
               (var21 = new K(var11)).b = 3;
               int var12 = var21.j() + 6;
               int var13 = 6;
               var6 = new byte[var12];
               System.arraycopy(var11, 0, var6, 0, 6);

               int var22;
               for(; var13 < var12; var9 = var22) {
                  if((var22 = var12 - var13) > 1000) {
                     var22 = 1000;
                  }

                  if((var22 = var10.read(var6, var13, var22)) < 0) {
                     "Length error: " + var13 + "/" + var12;
                     throw new IOException("EOF");
                  }

                  if((var22 = (var13 += var22) * 100 / var12) != var9) {
                     this.a(var5, "Loading " + var2 + " - " + var22 + "%");
                  }
               }

               var10.close();

               try {
                  if(this.A[0] != null) {
                     this.A[0].a(var6.length, var6, var1);
                  }
               } catch (Exception var15) {
                  this.A[0] = null;
               }
            } catch (IOException var17) {
               if(var8.equals("Unknown error")) {
                  var8 = "Connection error";
               }

               var6 = null;
            } catch (NullPointerException var18) {
               var8 = "Null error";
               var6 = null;
               if(!ao.h) {
                  return null;
               }
            } catch (ArrayIndexOutOfBoundsException var19) {
               var8 = "Bounds error";
               var6 = null;
               if(!ao.h) {
                  return null;
               }
            } catch (Exception var20) {
               var8 = "Unexpected error";
               var6 = null;
               if(!ao.h) {
                  return null;
               }
            }

            if(var6 == null) {
               for(var9 = var7; var9 > 0; --var9) {
                  this.a(var5, var8 + " - Retrying in " + var9);

                  try {
                     Thread.sleep(1000L);
                  } catch (Exception var14) {
                     ;
                  }
               }

               if((var7 <<= 1) > 60) {
                  var7 = 60;
               }

               this.bM = !this.bM;
            }
         }

         return new I(var6);
      }
   }

   private void O() {
      if(this.dM > 0) {
         this.F();
      } else {
         int var1 = (c - 253) / 2;
         int var2 = (d - 169) / 2;
         gf.a();
         this.hz.a(16777215, "Connection lost", var2 - 24, var1, true);
         this.hz.a(16777215, "Please wait - attempting to reestablish", var2 - 9, var1, true);
         gf.a(4, super.ao, 4);
         this.dV = 0;
         this.hq = 0;
         aj var4 = this.gi;
         R = false;
         this.ej = 0;
         this.b(T, U, true);
         if(!R) {
            this.F();
         } else {
            r();
         }

         try {
            var4.a();
         } catch (Exception var3) {
            ;
         }
      }
   }

   private void P() {
      this.hO = 0;
      this.fK = 0;
      this.ci = 0;
      this.W = 0;
      this.gF = 0;
      this.gj = 0;
   }

   private void i(int var1) {
      if(var1 >= 0) {
         if(var1 > 0 && this.ad != 3 && this.ad != 4 && this.ad != 5 && this.ad != 0) {
            this.ad = 0;
            ac = true;
         }

         int var2 = this.fc[var1];
         int var3 = this.fd[var1];
         int var4 = this.K[var1];
         int var5 = this.fe[var1];
         if(var4 >= 10000173 && var4 <= 10000176) {
            if(var2 == -1) {
               this.aK = this.dE;
               this.aJ = var5;
               this.dF = "Enter Amount";
               this.hn = false;
               this.ad = 1;
               this.dE = "";
               ac = true;
               this.dJ = -1;
            } else {
               this.j(var5, var2);
            }
         } else {
            if(var4 >= 2000) {
               var4 -= 2000;
            }

            if(var4 == 696) {
               this.P();
            }

            z var6;
            if(var4 == 582 && (var6 = this.bp[var5]) != null) {
               this.a(2, 0, 1, 0, M.b[0], 1, 0, var6.b[0], M.a[0], false, var6.a[0]);
               this.cp = super.ax;
               this.cq = super.ay;
               this.cs = 2;
               this.cr = 0;
               this.gz.a(57);
               this.gz.j(this.hU);
               this.gz.j(var5);
               this.gz.i(this.hS);
               this.gz.d(this.hT);
            }

            if(var4 == 234) {
               if(!this.a(2, 0, 0, 0, M.b[0], 0, 0, var3, M.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var3, M.a[0], false, var2);
               }

               this.cp = super.ax;
               this.cq = super.ay;
               this.cs = 2;
               this.cr = 0;
               this.gz.a(236);
               this.gz.i(var3 + this.eg);
               this.gz.c(var5);
               this.gz.i(var2 + this.ef);
            }

            if(var4 == 62 && this.e(var5, var3, var2)) {
               this.gz.a(192);
               this.gz.d(this.hT);
               this.gz.i(var5 >> 14 & 32767);
               this.gz.k(var3 + this.eg);
               this.gz.i(this.hS);
               this.gz.k(var2 + this.ef);
               this.gz.c(this.hU);
            }

            if(var4 == 511) {
               if(!this.a(2, 0, 0, 0, M.b[0], 0, 0, var3, M.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var3, M.a[0], false, var2);
               }

               this.cp = super.ax;
               this.cq = super.ay;
               this.cs = 2;
               this.cr = 0;
               this.gz.a(25);
               this.gz.d(this.hT);
               this.gz.j(this.hU);
               this.gz.c(var5);
               this.gz.j(var3 + this.eg);
               this.gz.k(this.hS);
               this.gz.c(var2 + this.ef);
            }

            m var10;
            if(var4 == 74) {
               this.gz.a(122);
               this.gz.d(var3);
               this.gz.j(var2);
               this.gz.i(var5);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if((var10 = m.a(var3)) != null) {
                  if(var10.p == v) {
                     this.he = 1;
                  }

                  if(var10.p == this.aj) {
                     this.he = 3;
                  }
               }
            }

            if(var4 == 315) {
               var10 = m.a(var3);
               boolean var7 = true;
               if(var10.d > 0) {
                  var7 = this.a(var10);
               }

               if(var7) {
                  switch(var3) {
                  case 2097179:
                     H = 600;
                     break;
                  default:
                     this.gz.a(185);
                     this.gz.d(var3);
                  }
               }
            }

            A var11;
            if(var4 == 561 && (var11 = this.cc[var5]) != null) {
               this.a(2, 0, 1, 0, M.b[0], 1, 0, var11.b[0], M.a[0], false, var11.a[0]);
               this.cp = super.ax;
               this.cq = super.ay;
               this.cs = 2;
               this.cr = 0;
               if((gy += var5) >= 90) {
                  this.gz.a(136);
                  gy = 0;
               }

               this.gz.a(128);
               this.gz.c(var5);
            }

            if(var4 == 20 && (var6 = this.bp[var5]) != null) {
               this.a(2, 0, 1, 0, M.b[0], 1, 0, var6.b[0], M.a[0], false, var6.a[0]);
               this.cp = super.ax;
               this.cq = super.ay;
               this.cs = 2;
               this.cr = 0;
               this.gz.a(155);
               this.gz.i(var5);
            }

            if(var4 == 779 && (var11 = this.cc[var5]) != null) {
               this.a(2, 0, 1, 0, M.b[0], 1, 0, var11.b[0], M.a[0], false, var11.a[0]);
               this.cp = super.ax;
               this.cq = super.ay;
               this.cs = 2;
               this.cr = 0;
               this.gz.a(153);
               this.gz.i(var5);
            }

            if(var4 == 519) {
               if(!this.bX) {
                  Y.b(super.ay - 4, super.ax - 4);
               } else {
                  Y.b(var3 - 4, var2 - 4);
               }
            }

            if(var4 == 1062) {
               if((cv += this.ef) >= 113) {
                  this.gz.a(183);
                  this.gz.e();
                  cv = 0;
               }

               this.e(var5, var3, var2);
               this.gz.a(228);
               this.gz.j(var5 >> 14 & 32767);
               this.gz.j(var3 + this.eg);
               this.gz.c(var2 + this.ef);
            }

            if(var4 == 679 && !this.fT) {
               this.gz.a(40);
               this.gz.c(var3);
               this.fT = true;
            }

            if(var4 == 431) {
               this.gz.a(129);
               this.gz.j(var2);
               this.gz.d(var3);
               this.gz.j(var5);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if((var10 = m.a(var3)) != null) {
                  if(var10.p == v) {
                     this.he = 1;
                  }

                  if(var10.p == this.aj) {
                     this.he = 3;
                  }
               }
            }

            long var8;
            int var12;
            String var13;
            if((var4 == 337 || var4 == 42 || var4 == 792 || var4 == 322) && (var12 = (var13 = this.Y[var1]).indexOf("@whi@")) != -1) {
               var8 = aC.a(var13.substring(var12 + 5).trim());
               if(var4 == 337) {
                  this.b(var8);
               }

               if(var4 == 42) {
                  this.c(var8);
               }

               if(var4 == 792) {
                  this.a(var8);
               }

               if(var4 == 322) {
                  this.d(var8);
               }
            }

            if((var4 == 1500 || var4 == 1501 || var4 == 1502) && (var12 = (var13 = this.Y[var1]).indexOf("@whi@")) != -1) {
               var8 = aC.a(var13.substring(var12 + 5).trim());
               if(var4 == 1500) {
                  this.a(var8, 0);
               }

               if(var4 == 1501) {
                  this.a(var8, 1);
               }

               if(var4 == 1502) {
                  this.a(var8, 2);
               }
            }

            if(var4 == 53) {
               this.gz.a(135);
               this.gz.i(var2);
               this.gz.d(var3);
               this.gz.i(var5);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if((var10 = m.a(var3)) != null) {
                  if(var10.p == v) {
                     this.he = 1;
                  }

                  if(var10.p == this.aj) {
                     this.he = 3;
                  }
               }
            }

            if(var4 == 539) {
               this.gz.a(16);
               this.gz.j(var5);
               this.gz.k(var2);
               this.gz.d(var3);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if((var10 = m.a(var3)) != null) {
                  if(var10.p == v) {
                     this.he = 1;
                  }

                  if(var10.p == this.aj) {
                     this.he = 3;
                  }
               }
            }

            if(var4 == 927 && (var13 = this.cJ[var3]) != null) {
               this.h(var13);
            }

            if(var4 == 928 && (var10 = m.a(var3)).ar != null) {
               this.h(var10.ar);
            }

            String var14;
            int var19;
            if((var4 == 484 || var4 == 6) && (var12 = (var13 = this.Y[var1]).indexOf("@whi@")) != -1) {
               var14 = aC.c(aC.a(aC.a(var13.substring(var12 + 5).trim())));
               boolean var9 = false;

               for(var19 = 0; var19 < this.cd; ++var19) {
                  A var15;
                  if((var15 = this.cc[this.ce[var19]]) != null && var15.ai != null && var15.ai.equalsIgnoreCase(var14)) {
                     this.a(2, 0, 1, 0, M.b[0], 1, 0, var15.b[0], M.a[0], false, var15.a[0]);
                     if(var4 == 484) {
                        this.gz.a(139);
                        this.gz.i(this.ce[var19]);
                     }

                     if(var4 == 6) {
                        if((gy += var5) >= 90) {
                           this.gz.a(136);
                           gy = 0;
                        }

                        this.gz.a(128);
                        this.gz.c(this.ce[var19]);
                     }

                     var9 = true;
                     break;
                  }
               }

               if(!var9) {
                  this.a("Unable to find ".concat(String.valueOf(var14)), "", true);
               }
            }

            if(var4 == 870) {
               this.gz.a(53);
               this.gz.c(var2);
               this.gz.j(this.hS);
               this.gz.k(var5);
               this.gz.c(this.hT);
               this.gz.i(this.hU);
               this.gz.d(var3);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if((var10 = m.a(var3)) != null) {
                  if(var10.p == v) {
                     this.he = 1;
                  }

                  if(var10.p == this.aj) {
                     this.he = 3;
                  }
               }
            }

            if(var4 == 847) {
               this.gz.a(87);
               this.gz.j(var5);
               this.gz.d(var3);
               this.gz.j(var2);
               this.hb = 0;
               this.hc = var3;
               this.hd = var2;
               this.he = 2;
               if((var10 = m.a(var3)) != null) {
                  if(var10.p == v) {
                     this.he = 1;
                  }

                  if(var10.p == this.aj) {
                     this.he = 3;
                  }
               }
            }

            String var20;
            if(var4 == 626) {
               var10 = m.a(var3);
               this.fM = 1;
               eZ = var10.s;
               this.fN = var3;
               this.fO = var10.am;
               this.hR = 0;
               Q = true;
               var20 = var10.ak;
               if(var10.ak.indexOf(" ") != -1) {
                  var20 = var20.substring(0, var20.indexOf(" "));
               }

               var14 = var10.ak;
               if(var10.ak.indexOf(" ") != -1) {
                  var14 = var14.substring(var14.indexOf(" ") + 1);
               }

               this.fP = var20 + " " + var10.al + " " + var14;
               if(this.fO == 16) {
                  Q = true;
                  ab = 3;
                  L = true;
               }

            } else {
               if(var4 == 78) {
                  this.gz.a(117);
                  this.gz.d(var3);
                  this.gz.k(var5);
                  this.gz.i(var2);
                  this.hb = 0;
                  this.hc = var3;
                  this.hd = var2;
                  this.he = 2;
                  if((var10 = m.a(var3)) != null) {
                     if(var10.p == v) {
                        this.he = 1;
                     }

                     if(var10.p == this.aj) {
                        this.he = 3;
                     }
                  }
               }

               if(var4 == 27 && (var11 = this.cc[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var11.b[0], M.a[0], false, var11.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  if((dr += var5) >= 54) {
                     this.gz.a(189);
                     this.gz.b(234);
                     dr = 0;
                  }

                  this.gz.a(73);
                  this.gz.i(var5);
               }

               if(var4 == 213) {
                  if(!this.a(2, 0, 0, 0, M.b[0], 0, 0, var3, M.a[0], false, var2)) {
                     this.a(2, 0, 1, 0, M.b[0], 1, 0, var3, M.a[0], false, var2);
                  }

                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(79);
                  this.gz.i(var3 + this.eg);
                  this.gz.c(var5);
                  this.gz.j(var2 + this.ef);
               }

               if(var4 == 632) {
                  this.gz.a(145);
                  this.gz.d(var3);
                  this.gz.j(var2);
                  this.gz.j(var5);
                  this.hb = 0;
                  this.hc = var3;
                  this.hd = var2;
                  this.he = 2;
                  if((var10 = m.a(var3)) != null) {
                     if(var10.p == v) {
                        this.he = 1;
                     }

                     if(var10.p == this.aj) {
                        this.he = 3;
                     }
                  }
               }

               if(var4 >= 700 && var4 <= 705) {
                  var19 = 110 + (var4 - 700);
                  this.gz.a(var19);
                  this.gz.d(var3);
                  this.gz.k(var5);
                  this.gz.i(var2);
                  this.hb = 0;
                  this.hc = var3;
                  this.hd = var2;
                  this.he = 2;
                  m var16;
                  if((var16 = m.a(var3)) != null) {
                     if(var16.p == v) {
                        this.he = 1;
                     }

                     if(var16.p == this.aj) {
                        this.he = 3;
                     }
                  }
               }

               if(var4 == 1011) {
                  this.W = 0;
               }

               if(var4 >= 1012 && var4 <= 1015) {
                  switch(var4) {
                  case 1012:
                     aN.c();
                     break;
                  case 1013:
                  case 1014:
                  case 1015:
                     aN.a(var4 - 1013);
                  }

                  aE.a();
               }

               if(var4 == 1050 && this.cu[3] > 0) {
                  this.aP = !this.aP;
                  this.n(this.aP?1:0);
                  this.gz.a(185);
                  this.gz.d(2097164);
               }

               if(var4 == 1051) {
                  aE.k = !aE.k;
               }

               if(var4 >= 1009 && var4 <= 1010) {
                  boolean var22 = var4 == 1009;
                  this.gz.a(218);
                  this.gz.b(1);
                  this.gz.b(var22?4:5);
                  if(var22) {
                     this.bU = "";
                     this.fZ = false;
                  } else {
                     this.bV = new String[]{"", "", ""};
                  }
               }

               if(var4 == 1008) {
                  this.n = 2;
                  ac = true;
                  aE.a();
               }

               if(var4 == 1007) {
                  this.n = 1;
                  ac = true;
                  aE.a();
               }

               if(var4 == 1006) {
                  this.n = 0;
                  ac = true;
                  aE.a();
               }

               if(var4 == 1005) {
                  this.d(6, 9);
               }

               if(var4 == 1004 && N[10] != -1) {
                  Q = true;
                  ab = 10;
                  L = true;
               }

               if(var4 == 1002) {
                  this.o = 2;
                  ac = true;
                  aE.a();
               }

               if(var4 == 1001) {
                  this.o = 1;
                  ac = true;
                  aE.a();
               }

               if(var4 == 1000) {
                  this.o = 0;
                  ac = true;
                  aE.a();
               }

               if(var4 == 999) {
                  this.d(0, 0);
               }

               if(var4 == 998) {
                  this.d(1, 5);
               }

               if(var4 >= 994 && var4 <= 997) {
                  if(var4 == 997) {
                     this.ak = 3;
                  }

                  if(var4 == 996) {
                     this.ak = 2;
                  }

                  if(var4 == 995) {
                     this.ak = 1;
                  }

                  if(var4 == 994) {
                     this.ak = 0;
                  }

                  ac = true;
                  this.gz.a(95);
                  this.gz.b(this.ak);
                  this.gz.b(this.u);
                  this.gz.b(this.af);
               }

               if(var4 == 993) {
                  this.d(2, 1);
               }

               if(var4 >= 990 && var4 <= 992) {
                  if(var4 == 992) {
                     this.u = 2;
                  }

                  if(var4 == 991) {
                     this.u = 1;
                  }

                  if(var4 == 990) {
                     this.u = 0;
                  }

                  ac = true;
                  this.gz.a(95);
                  this.gz.b(this.ak);
                  this.gz.b(this.u);
                  this.gz.b(this.af);
               }

               if(var4 == 989) {
                  this.d(3, 2);
               }

               if(var4 >= 985 && var4 <= 987) {
                  if(var4 == 987) {
                     this.af = 2;
                  }

                  if(var4 == 986) {
                     this.af = 1;
                  }

                  if(var4 == 985) {
                     this.af = 0;
                  }

                  ac = true;
                  this.gz.a(95);
                  this.gz.b(this.ak);
                  this.gz.b(this.u);
                  this.gz.b(this.af);
               }

               if(var4 == 984) {
                  this.d(5, 3);
               }

               if(var4 == 983) {
                  this.m = 2;
                  ac = true;
                  aE.a();
               }

               if(var4 == 982) {
                  this.m = 1;
                  ac = true;
                  aE.a();
               }

               if(var4 == 981) {
                  this.m = 0;
                  ac = true;
                  aE.a();
               }

               if(var4 == 980) {
                  this.d(4, 16);
               }

               if(var4 == 493) {
                  this.gz.a(75);
                  this.gz.d(var3);
                  this.gz.i(var2);
                  this.gz.j(var5);
                  this.hb = 0;
                  this.hc = var3;
                  this.hd = var2;
                  this.he = 2;
                  if((var10 = m.a(var3)) != null) {
                     if(var10.p == v) {
                        this.he = 1;
                     }

                     if(var10.p == this.aj) {
                        this.he = 3;
                     }
                  }
               }

               if(var4 == 652) {
                  if(!this.a(2, 0, 0, 0, M.b[0], 0, 0, var3, M.a[0], false, var2)) {
                     this.a(2, 0, 1, 0, M.b[0], 1, 0, var3, M.a[0], false, var2);
                  }

                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(156);
                  this.gz.j(var2 + this.ef);
                  this.gz.i(var3 + this.eg);
                  this.gz.k(var5);
               }

               if(var4 == 94) {
                  if(!this.a(2, 0, 0, 0, M.b[0], 0, 0, var3, M.a[0], false, var2)) {
                     this.a(2, 0, 1, 0, M.b[0], 1, 0, var3, M.a[0], false, var2);
                  }

                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(181);
                  this.gz.i(var3 + this.eg);
                  this.gz.c(var5);
                  this.gz.i(var2 + this.ef);
                  this.gz.d(this.fN);
               }

               if(var4 == 646) {
                  this.gz.a(185);
                  this.gz.d(var3);
                  if((var10 = m.a(var3)) != null && var10.v != null && var10.v[0][0] == 5) {
                     var12 = var10.v[0][1];
                     if(this.B[var12] != var10.u[0]) {
                        this.B[var12] = var10.u[0];
                        this.f(var12);
                        Q = true;
                     }
                  }
               }

               if(var4 == 225 && (var6 = this.bp[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var6.b[0], M.a[0], false, var6.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  if((gO += var5) >= 85) {
                     this.gz.a(230);
                     this.gz.b(239);
                     gO = 0;
                  }

                  this.gz.a(17);
                  this.gz.k(var5);
               }

               if(var4 == 965 && (var6 = this.bp[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var6.b[0], M.a[0], false, var6.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  if(++fL >= 96) {
                     this.gz.a(152);
                     this.gz.b(88);
                     fL = 0;
                  }

                  this.gz.a(21);
                  this.gz.c(var5);
               }

               if(var4 == 413 && (var6 = this.bp[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var6.b[0], M.a[0], false, var6.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(131);
                  this.gz.k(var5);
                  this.gz.d(this.fN);
               }

               if(var4 == 200) {
                  this.ah();
               }

               if(var4 == 1025 && (var6 = this.bp[var5]) != null) {
                  h var18 = var6.ad;
                  if(var6.ad.r != null) {
                     var18 = var18.b();
                  }

                  if(var18 != null) {
                     this.gz.a(222);
                     this.gz.c(var18.b);
                  }
               }

               if(var4 == 900) {
                  this.e(var5, var3, var2);
                  this.gz.a(252);
                  this.gz.k(var5 >> 14 & 32767);
                  this.gz.i(var3 + this.eg);
                  this.gz.j(var2 + this.ef);
               }

               if(var4 == 412 && (var6 = this.bp[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var6.b[0], M.a[0], false, var6.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(72);
                  this.gz.j(var5);
               }

               if(var4 == 365 && (var11 = this.cc[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var11.b[0], M.a[0], false, var11.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(249);
                  this.gz.j(var5);
                  this.gz.d(this.fN);
               }

               if(var4 == 729 && (var11 = this.cc[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var11.b[0], M.a[0], false, var11.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(39);
                  this.gz.i(var5);
               }

               if(var4 == 577 && (var11 = this.cc[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var11.b[0], M.a[0], false, var11.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(139);
                  this.gz.i(var5);
               }

               if(var4 == 956 && this.e(var5, var3, var2)) {
                  this.gz.a(35);
                  this.gz.i(var2 + this.ef);
                  this.gz.d(this.fN);
                  this.gz.j(var3 + this.eg);
                  this.gz.i(var5 >> 14 & 32767);
               }

               if(var4 == 567) {
                  if(!this.a(2, 0, 0, 0, M.b[0], 0, 0, var3, M.a[0], false, var2)) {
                     this.a(2, 0, 1, 0, M.b[0], 1, 0, var3, M.a[0], false, var2);
                  }

                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(23);
                  this.gz.i(var3 + this.eg);
                  this.gz.i(var5);
                  this.gz.i(var2 + this.ef);
               }

               if(var4 == 867) {
                  if((var5 & 3) == 0) {
                     ++gm;
                  }

                  if(gm >= 59) {
                     this.gz.a(200);
                     this.gz.c(25501);
                     gm = 0;
                  }

                  this.gz.a(43);
                  this.gz.d(var3);
                  this.gz.j(var5);
                  this.gz.j(var2);
                  this.hb = 0;
                  this.hc = var3;
                  this.hd = var2;
                  this.he = 2;
                  if((var10 = m.a(var3)) != null) {
                     if(var10.p == v) {
                        this.he = 1;
                     }

                     if(var10.p == this.aj) {
                        this.he = 3;
                     }
                  }
               }

               if(var4 == 543) {
                  this.gz.a(237);
                  this.gz.c(var2);
                  this.gz.j(var5);
                  this.gz.d(this.fN);
                  this.hb = 0;
                  this.hc = var3;
                  this.hd = var2;
                  this.he = 2;
                  if((var10 = m.a(var3)) != null) {
                     if(var10.p == v) {
                        this.he = 1;
                     }

                     if(var10.p == this.aj) {
                        this.he = 3;
                     }
                  }
               }

               if(var4 == 606 && (var12 = (var13 = this.Y[var1]).indexOf("@whi@")) != -1) {
                  if(v == -1) {
                     this.ah();
                     this.bU = var13.substring(var12 + 5).trim();
                     this.fZ = false;
                     v = 201;
                     this.gp = 201;
                  } else {
                     this.a("Please close the interface you have open before using \'report abuse\'", 0, "");
                  }
               }

               if(var4 == 491 && (var11 = this.cc[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var11.b[0], M.a[0], false, var11.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  this.gz.a(14);
                  this.gz.c(var5);
                  this.gz.i(this.hS);
               }

               if(var4 == 639 && (var12 = (var13 = this.Y[var1]).indexOf("@whi@")) != -1) {
                  var8 = aC.a(var13.substring(var12 + 5).trim());
                  var19 = -1;

                  for(var12 = 0; var12 < this.cj; ++var12) {
                     if(this.cU[var12] == var8) {
                        var19 = var12;
                        break;
                     }
                  }

                  if(var19 != -1 && this.bj[var19] > 0) {
                     ac = true;
                     this.ad = 0;
                     this.hn = true;
                     this.gG = "";
                     this.eB = 3;
                     this.cS = this.cU[var19];
                     this.fC = "Enter message to send to " + this.eS[var19];
                  }
               }

               if(var4 == 454) {
                  this.gz.a(41);
                  this.gz.c(var5);
                  this.gz.j(var2);
                  this.gz.d(var3);
                  this.hb = 0;
                  this.hc = var3;
                  this.hd = var2;
                  this.he = 2;
                  if((var10 = m.a(var3)) != null) {
                     if(var10.p == v) {
                        this.he = 1;
                     }

                     if(var10.p == this.aj) {
                        this.he = 3;
                     }
                  }
               }

               if(var4 == 478 && (var6 = this.bp[var5]) != null) {
                  this.a(2, 0, 1, 0, M.b[0], 1, 0, var6.b[0], M.a[0], false, var6.a[0]);
                  this.cp = super.ax;
                  this.cq = super.ay;
                  this.cs = 2;
                  this.cr = 0;
                  if((var5 & 3) == 0) {
                     ++fX;
                  }

                  if(fX >= 53) {
                     this.gz.a(85);
                     this.gz.b(66);
                     fX = 0;
                  }

                  this.gz.a(18);
                  this.gz.i(var5);
               }

               if(var4 == 113) {
                  this.e(var5, var3, var2);
                  this.gz.a(70);
                  this.gz.i(var2 + this.ef);
                  this.gz.c(var3 + this.eg);
                  this.gz.k(var5 >> 14 & 32767);
               }

               if(var4 == 872) {
                  this.e(var5, var3, var2);
                  this.gz.a(234);
                  this.gz.k(var2 + this.ef);
                  this.gz.j(var5 >> 14 & 32767);
                  this.gz.k(var3 + this.eg);
               }

               if(var4 == 502) {
                  this.e(var5, var3, var2);
                  this.gz.a(132);
                  this.gz.k(var2 + this.ef);
                  this.gz.c(var5 >> 14 & 32767);
                  this.gz.j(var3 + this.eg);
               }

               if(var4 == 1125) {
                  i var23 = i.a(var5);
                  m var17 = m.a(var3);
                  if(var23 != null) {
                     if(var17 != null && var17.B[var2] >= 100000) {
                        var20 = var17.B[var2] + " x " + var23.p;
                        this.a(var20, "", true);
                     } else {
                        this.gz.a(220);
                        this.gz.c(var5);
                     }
                  }
               }

               if(var4 == 169) {
                  this.gz.a(185);
                  this.gz.d(var3);
                  if((var10 = m.a(var3)).v != null && var10.v[0][0] == 5) {
                     var12 = var10.v[0][1];
                     this.B[var12] = 1 - (this.B[var12] & 1);
                     this.f(var12);
                     Q = true;
                  }
               }

               if(var4 == 447) {
                  this.hR = 1;
                  this.hS = var2;
                  this.hT = var3;
                  this.hU = var5;
                  this.hV = i.a(var5).p;
                  this.fM = 0;
                  Q = true;
               } else {
                  if(var4 == 1226) {
                     j var21;
                     if((var21 = j.a(var5 >> 14 & 32767)).o != null) {
                        var21 = var21.b();
                     }

                     if(var21 != null) {
                        this.gz.a(97);
                        this.gz.c(var21.l);
                     }
                  }

                  if(var4 == 244) {
                     if(!this.a(2, 0, 0, 0, M.b[0], 0, 0, var3, M.a[0], false, var2)) {
                        this.a(2, 0, 1, 0, M.b[0], 1, 0, var3, M.a[0], false, var2);
                     }

                     this.cp = super.ax;
                     this.cq = super.ay;
                     this.cs = 2;
                     this.cr = 0;
                     this.gz.a(253);
                     this.gz.i(var2 + this.ef);
                     this.gz.k(var3 + this.eg);
                     this.gz.j(var5);
                  }

                  if(var4 == 1448 && i.a(var5) != null) {
                     this.gz.a(220);
                     this.gz.c(var5);
                  }

                  this.hR = 0;
                  this.fM = 0;
                  Q = true;
               }
            }
         }
      }
   }

   public void run() {
      super.run();
   }

   private void Q() {
      if(this.hR == 0 && this.fM == 0) {
         this.Y[this.O] = "Walk here";
         this.K[this.O] = 519;
         this.fc[this.O] = super.au;
         this.fd[this.O] = super.av;
         ++this.O;
      }

      int var1 = -1;

      for(int var2 = 0; var2 < F.B; ++var2) {
         int var3;
         int var4 = (var3 = F.C[var2]) & 127;
         int var5 = var3 >> 7 & 127;
         int var6 = var3 >> 29 & 3;
         int var7 = var3 >> 14 & 32767;
         if(var3 != var1) {
            var1 = var3;
            int var9;
            if(var6 == 2 && this.cN.c(this.ct, var4, var5, var3) >= 0) {
               j var8;
               if((var8 = j.a(var7)) == null) {
                  continue;
               }

               if(var8.o != null) {
                  var8 = var8.b();
               }

               if(this.hR == 1) {
                  this.Y[this.O] = "Use @lre@" + this.hV + "@whi@ -> @cya@" + var8.g;
                  this.K[this.O] = 62;
                  this.fe[this.O] = var3;
                  this.fc[this.O] = var4;
                  this.fd[this.O] = var5;
                  ++this.O;
               } else if(this.fM == 1) {
                  if((this.fO & 4) == 4) {
                     this.Y[this.O] = this.fP + " @cya@" + var8.g;
                     this.K[this.O] = 956;
                     this.fe[this.O] = var3;
                     this.fc[this.O] = var4;
                     this.fd[this.O] = var5;
                     ++this.O;
                  }
               } else {
                  if(var8.E != null) {
                     for(var9 = 4; var9 >= 0; --var9) {
                        if(var8.E[var9] != null) {
                           this.Y[this.O] = var8.E[var9] + " @cya@" + var8.g;
                           if(var9 == 0) {
                              this.K[this.O] = 502;
                           }

                           if(var9 == 1) {
                              this.K[this.O] = 900;
                           }

                           if(var9 == 2) {
                              this.K[this.O] = 113;
                           }

                           if(var9 == 3) {
                              this.K[this.O] = 872;
                           }

                           if(var9 == 4) {
                              this.K[this.O] = 1062;
                           }

                           this.fe[this.O] = var3;
                           this.fc[this.O] = var4;
                           this.fd[this.O] = var5;
                           ++this.O;
                        }
                     }
                  }

                  this.Y[this.O] = this.bI < 2?"Examine @cya@" + var8.g:"Examine @cya@" + var8.g + " @gre@(@whi@" + var7 + "@gre@) (@whi@" + (var4 + this.ef) + "," + (var5 + this.eg) + "@gre@)";
                  this.K[this.O] = 1226;
                  this.fe[this.O] = var8.l << 14;
                  this.fc[this.O] = var4;
                  this.fd[this.O] = var5;
                  ++this.O;
               }
            }

            z var12;
            A var13;
            if(var6 == 1) {
               z var15 = this.bp[var7];

               try {
                  if(var15.ad.i == 1 && (var15.V & 127) == 64 && (var15.W & 127) == 64) {
                     for(var9 = 0; var9 < this.bq; ++var9) {
                        if((var12 = this.bp[this.br[var9]]) != null && var12 != var15 && var12.ad.i == 1 && var12.V == var15.V && var12.W == var15.W) {
                           this.a(var12.ad, this.br[var9], var5, var4);
                        }
                     }

                     for(var9 = 0; var9 < this.cd; ++var9) {
                        if((var13 = this.cc[this.ce[var9]]) != null && var13.V == var15.V && var13.W == var15.W) {
                           this.a(var4, this.ce[var9], var13, var5);
                        }
                     }
                  }

                  this.a(var15.ad, var7, var5, var4);
               } catch (Exception var11) {
                  ;
               }
            }

            if(var6 == 0) {
               A var16 = this.cc[var7];

               try {
                  if((var16.V & 127) == 64 && (var16.W & 127) == 64) {
                     for(var9 = 0; var9 < this.bq; ++var9) {
                        if((var12 = this.bp[this.br[var9]]) != null && var12.ad.i == 1 && var12.V == var16.V && var12.W == var16.W) {
                           this.a(var12.ad, this.br[var9], var5, var4);
                        }
                     }

                     for(var9 = 0; var9 < this.cd; ++var9) {
                        if((var13 = this.cc[this.ce[var9]]) != null && var13 != var16 && var13.V == var16.V && var13.W == var16.W) {
                           this.a(var4, this.ce[var9], var13, var5);
                        }
                     }
                  }

                  this.a(var4, var7, var16, var5);
               } catch (Exception var10) {
                  ;
               }
            }

            O var17;
            if(var6 == 3 && (var17 = this.bk[this.ct][var4][var5]) != null) {
               for(y var18 = (y)var17.c(); var18 != null; var18 = (y)var17.e()) {
                  i var14 = i.a(var18.a);
                  if(this.hR == 1) {
                     this.Y[this.O] = "Use @lre@" + this.hV + "@whi@ -> @lre@" + var14.p;
                     this.K[this.O] = 511;
                     this.fe[this.O] = var18.a;
                     this.fc[this.O] = var4;
                     this.fd[this.O] = var5;
                     ++this.O;
                  } else if(this.fM == 1) {
                     if((this.fO & 1) == 1) {
                        this.Y[this.O] = this.fP + " @lre@" + var14.p;
                        this.K[this.O] = 94;
                        this.fe[this.O] = var18.a;
                        this.fc[this.O] = var4;
                        this.fd[this.O] = var5;
                        ++this.O;
                     }
                  } else {
                     for(var6 = 4; var6 >= 0; --var6) {
                        if(var14.n != null && var14.n[var6] != null) {
                           this.Y[this.O] = var14.n[var6] + " @lre@" + var14.p;
                           if(var6 == 0) {
                              this.K[this.O] = 652;
                           }

                           if(var6 == 1) {
                              this.K[this.O] = 567;
                           }

                           if(var6 == 2) {
                              this.K[this.O] = 234;
                           }

                           if(var6 == 3) {
                              this.K[this.O] = 244;
                           }

                           if(var6 == 4) {
                              this.K[this.O] = 213;
                           }

                           this.fe[this.O] = var18.a;
                        } else {
                           if(var6 != 2) {
                              continue;
                           }

                           this.Y[this.O] = "Take @lre@" + var14.p;
                           this.K[this.O] = 234;
                           this.fe[this.O] = var18.a;
                           if(var18.a == 1971) {
                              this.Y[this.O] = "Remove @lre@" + var14.p;
                           }
                        }

                        this.fc[this.O] = var4;
                        this.fd[this.O] = var5;
                        ++this.O;
                     }

                     this.Y[this.O] = this.bI < 2?"Examine @lre@" + var14.p:"Examine @lre@" + var14.p + " @gre@(@whi@" + var18.a + "@gre@)";
                     this.K[this.O] = 1448;
                     this.fe[this.O] = var18.a;
                     this.fc[this.O] = var4;
                     this.fd[this.O] = var5;
                     ++this.O;
                  }
               }
            }
         }
      }

   }

   public final void f() {
      ao.h = false;

      try {
         if(this.gi != null) {
            this.gi.a();
         }
      } catch (Exception var1) {
         ;
      }

      this.gi = null;
      this.I();
      this.if.a();
      this.ig.a();
      if(this.bT != null) {
         this.bT.a = false;
      }

      this.bT = null;
      if(this.gT != null) {
         this.gT = null;
      }

      this.F.c();
      this.F = null;
      this.bo = null;
      this.gz = null;
      this.by = null;
      this.eT = null;
      this.gW = null;
      this.gu = null;
      this.hf = null;
      this.gX = null;
      this.gY = null;
      this.gI = null;
      this.ho = null;
      this.cN = null;
      this.gV = null;
      this.cm = null;
      this.bi = null;
      this.hP = null;
      this.hQ = null;
      this.cn = null;
      gd = null;
      this.be = null;
      this.bf = null;
      this.ge = null;
      gf = null;
      gg = null;
      this.fE = null;
      this.fF = null;
      this.fG = null;
      t = null;
      this.bd = null;
      this.r = null;
      this.s = null;
      this.gC = null;
      this.w = null;
      this.fD = null;
      this.ds = null;
      this.fg = null;
      this.fh = null;
      this.fi = null;
      this.fU = null;
      this.eK = null;
      this.eL = null;
      this.eM = null;
      this.eN = null;
      this.eO = null;
      this.ey = null;
      this.ee = null;
      this.cz = null;
      this.cc = null;
      this.ce = null;
      this.cg = null;
      this.ch = null;
      this.bt = null;
      this.bp = null;
      this.br = null;
      this.bk = null;
      this.gr = null;
      this.dN = null;
      this.ew = null;
      this.fc = null;
      this.fd = null;
      this.K = null;
      this.fe = null;
      this.Y = null;
      this.B = null;
      this.eI = null;
      this.eJ = null;
      this.fQ = null;
      this.hs = null;
      this.eS = null;
      this.cU = null;
      this.bj = null;
      this.cw = null;
      this.cV = null;
      this.cW = null;
      this.fu = null;
      this.fv = null;
      this.fr = null;
      this.fs = null;
      this.ft = null;
      this.fw = null;
      this.fx = null;
      this.fy = null;
      this.fz = null;
      this.dD = null;
      this.bl = false;
      j.a();
      h.c();
      i.a();
      E.b = null;
      m.a = null;
      uwotm8.d.a = null;
      g.a = null;
      g.h = null;
      an.a = null;
      super.ap = null;
      A.aj = null;
      u.a();
      Y.a();
      F.b();
      e.a();
      System.gc();
   }

   final Component g() {
      Applet var10000 = ao.e;
      return (Component)(super.aq != null?super.aq:this);
   }

   private void R() {
      int var1;
      while((var1 = this.m()) != -1) {
         if(v != -1 && v == this.gp) {
            if(var1 == 8 && this.bU.length() > 0) {
               this.bU = this.bU.substring(0, this.bU.length() - 1);
            }

            if((var1 >= 97 && var1 <= 126 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32 || var1 == 95) && this.bU.length() < 12) {
               this.bU = this.bU + (char)var1;
            }
         } else {
            int var5;
            int var13;
            if(v != -1 && v == this.gq) {
               boolean var15;
               m var16;
               if(var15 = !m.a(v, 37).y) {
                  var13 = 0;
                  var16 = m.a(v, 39);
               } else {
                  var13 = !m.a(v, 29).y?1:2;
                  var16 = m.a(v, 15);
               }

               if(var13 < this.bV.length && var1 < 1000 && var1 != '\uffff' && this.bV[var13].length() < (var15?42:511)) {
                  var5 = ((l)var16.a()).a(this.bV[var13], new int[]{var16.d()}, l.b);
                  if(var15 || var5 <= 21) {
                     var16 = m.a(581, 16);
                     int var6 = (var5 - 14) * 12;
                     if(var5 >= 14) {
                        var16.x = var6;
                     } else if(var16.x > var6) {
                        var16.x = var6;
                     }

                     if(var1 == 8) {
                        if(this.bV[var13].length() > 0) {
                           String var12;
                           if(this.bV[var13].length() >= 4 && ((var12 = this.bV[var13].substring(this.bV[var13].length() - 4, this.bV[var13].length())).equals("<br>") || var12.equals("    "))) {
                              this.bV[var13] = this.bV[var13].substring(0, this.bV[var13].length() - 4);
                           } else {
                              this.bV[var13] = this.bV[var13].substring(0, this.bV[var13].length() - 1);
                           }
                        }
                     } else if(var1 == 10) {
                        if(!var15) {
                           this.bV[var13] = this.bV[var13] + "<br>";
                        }
                     } else if(var1 == 9) {
                        if(!var15) {
                           this.bV[var13] = this.bV[var13] + "    ";
                        }
                     } else if(var1 != 60 && var1 != 5) {
                        this.bV[var13] = this.bV[var13] + (char)var1;
                     }
                  }
               }
            } else if(this.hn) {
               if(var1 >= 32 && var1 <= 126 && this.gG.length() < 80) {
                  this.gG = this.gG + (char)var1;
                  ac = true;
               }

               if(var1 == 8 && this.gG.length() > 0) {
                  this.gG = this.gG.substring(0, this.gG.length() - 1);
                  ac = true;
               }

               if(var1 == 13 || var1 == 10) {
                  this.hn = false;
                  ac = true;
                  long var14;
                  if(this.eB == 1) {
                     var14 = aC.a(this.gG);
                     this.b(var14);
                  }

                  if(this.eB == 2 && this.cj > 0) {
                     var14 = aC.a(this.gG);
                     this.a(var14);
                  }

                  if(this.eB == 3 && this.gG.length() > 0) {
                     this.gz.a(126);
                     this.gz.b(0);
                     var13 = this.gz.b;
                     this.gz.a(this.cS);
                     aB.a(this.gG, this.gz);
                     this.gz.e(this.gz.b - var13);
                     this.gG = aB.a(this.gG);
                     this.a(this.gG, 6, aC.c(aC.a(this.cS)));
                     if(this.u == 2) {
                        this.u = 1;
                        this.gz.a(95);
                        this.gz.b(this.ak);
                        this.gz.b(this.u);
                        this.gz.b(this.af);
                     }
                  }

                  if(this.eB == 4 && this.bg < 100) {
                     var14 = aC.a(this.gG);
                     this.c(var14);
                  }

                  if(this.eB == 5 && this.bg > 0) {
                     var14 = aC.a(this.gG);
                     this.d(var14);
                  }

                  if(this.eB == 6) {
                     var14 = aC.a(this.gG);
                     long var7 = var14;
                     Client var11 = this;
                     if(var14 != 0L) {
                        try {
                           var11.gz.a(61);
                           var11.gz.a(var7);
                        } catch (RuntimeException var9) {
                           ao.b("47229, 3, " + var14 + ", " + var9.toString());
                           throw new RuntimeException();
                        }
                     }
                  }
               }
            } else if(this.ad == 1) {
               if(var1 >= 48 && var1 <= 57 && this.dE.length() < 10) {
                  this.dE = this.dE + (char)var1;
                  ac = true;
               }

               if(!this.dE.toLowerCase().contains("k") && !this.dE.toLowerCase().contains("m") && !this.dE.toLowerCase().contains("b") && (var1 == 107 || var1 == 109) || var1 == 98) {
                  this.dE = this.dE + (char)var1;
                  ac = true;
               }

               if(var1 == 8 && this.dE.length() > 0) {
                  this.dE = this.dE.substring(0, this.dE.length() - 1);
                  ac = true;
               }

               if(var1 == 13 || var1 == 10) {
                  var13 = 0;
                  if(this.dE.length() > 0) {
                     if(this.dE.toLowerCase().contains("k")) {
                        this.dE = this.dE.replaceAll("k", "000");
                     } else if(this.dE.toLowerCase().contains("m")) {
                        this.dE = this.dE.replaceAll("m", "000000");
                     } else if(this.dE.toLowerCase().contains("b")) {
                        this.dE = this.dE.replaceAll("b", "000000000");
                     }

                     try {
                        var13 = Integer.parseInt(this.dE);
                     } catch (NumberFormatException var10) {
                        var13 = Integer.MAX_VALUE;
                     }
                  }

                  if(this.aJ >= 0) {
                     this.j(this.aJ, var13);
                     this.dE = this.aK;
                     this.ad = 3;
                     this.aJ = -1;
                  } else {
                     this.gz.a(208);
                     this.gz.d(var13);
                     this.ad = 0;
                  }

                  ac = true;
               }
            } else if(this.ad == 2) {
               if(aB.a((char)var1) && this.dE.length() < 12) {
                  this.dE = this.dE + (char)var1;
                  ac = true;
               }

               if(var1 == 8 && this.dE.length() > 0) {
                  this.dE = this.dE.substring(0, this.dE.length() - 1);
                  ac = true;
               }

               if(var1 == 13 || var1 == 10) {
                  if(this.dE.length() > 0) {
                     this.gz.a(60);
                     this.gz.a(aC.a(this.dE));
                  }

                  this.ad = 0;
                  ac = true;
               }
            } else if(this.ad >= 3 && this.ad <= 5) {
               if(aB.a((char)var1) && this.dE.length() < 40) {
                  this.dE = this.dE + (char)var1;
                  ac = true;
               }

               if(var1 == 8 && this.dE.length() > 0) {
                  this.dE = this.dE.substring(0, this.dE.length() - 1);
                  ac = true;
               }

               if(var1 == 13 || var1 == 10) {
                  this.ad = 0;
                  ac = true;
               }

               if(aB.a((char)var1) && this.dE.length() < 40 || var1 == 8 && this.dE.length() > 0) {
                  this.a(this.dE);
                  ac = true;
               }
            } else if(this.aj == -1) {
               if(aB.a((char)var1) && this.bZ.length() < 80) {
                  this.bZ = this.bZ + (char)var1;
                  ac = true;
               }

               if(var1 == 8 && this.bZ.length() > 0) {
                  this.bZ = this.bZ.substring(0, this.bZ.length() - 1);
                  ac = true;
               }

               if(var1 == 9) {
                  this.w();
               }

               if((var1 == 13 || var1 == 10) && this.bZ.length() > 0) {
                  if(this.bZ.equalsIgnoreCase("::fps")) {
                     fY = !fY;
                  }

                  if(this.bZ.equalsIgnoreCase("::ping")) {
                     if(this.ie == null) {
                        this.ie = new ak("vidyascape.org", new a(this));
                        this.ie.start();
                     } else {
                        this.ie.a();
                        this.ie = null;
                     }

                     this.bZ = "";
                     ac = true;
                     return;
                  }

                  if(this.bI >= 2) {
                     if(this.bZ.equalsIgnoreCase("::dumpclip")) {
                        this.F.a();
                     }

                     if(this.bZ.equalsIgnoreCase("::data")) {
                        cZ = !cZ;
                     }

                     if(this.bZ.equalsIgnoreCase("::debugchildren")) {
                        aT = !aT;
                     }

                     if(this.bZ.equalsIgnoreCase("::itemsearch")) {
                        this.ad = 3;
                        this.a(this.dE);
                        ac = true;
                     } else if(this.bZ.equalsIgnoreCase("::npcsearch")) {
                        this.ad = 4;
                        this.a(this.dE);
                        ac = true;
                     } else if(this.bZ.equalsIgnoreCase("::objectsearch")) {
                        this.ad = 5;
                        this.a(this.dE);
                        ac = true;
                     }
                  }

                  if(this.bZ.startsWith("/")) {
                     this.bZ = "::" + this.bZ;
                  }

                  if(this.bZ.startsWith("::")) {
                     this.gz.a(103);
                     this.gz.b(this.bZ.length() - 1);
                     this.gz.a(this.bZ.substring(2));
                  } else {
                     String var2 = this.bZ.toLowerCase();
                     byte var3 = 0;
                     if(var2.startsWith("yellow:")) {
                        var3 = 0;
                        this.bZ = this.bZ.substring(7);
                     } else if(var2.startsWith("red:")) {
                        var3 = 1;
                        this.bZ = this.bZ.substring(4);
                     } else if(var2.startsWith("green:")) {
                        var3 = 2;
                        this.bZ = this.bZ.substring(6);
                     } else if(var2.startsWith("cyan:")) {
                        var3 = 3;
                        this.bZ = this.bZ.substring(5);
                     } else if(var2.startsWith("purple:")) {
                        var3 = 4;
                        this.bZ = this.bZ.substring(7);
                     } else if(var2.startsWith("white:")) {
                        var3 = 5;
                        this.bZ = this.bZ.substring(6);
                     } else if(var2.startsWith("flash1:")) {
                        var3 = 6;
                        this.bZ = this.bZ.substring(7);
                     } else if(var2.startsWith("flash2:")) {
                        var3 = 7;
                        this.bZ = this.bZ.substring(7);
                     } else if(var2.startsWith("flash3:")) {
                        var3 = 8;
                        this.bZ = this.bZ.substring(7);
                     } else if(var2.startsWith("glow1:")) {
                        var3 = 9;
                        this.bZ = this.bZ.substring(6);
                     } else if(var2.startsWith("glow2:")) {
                        var3 = 10;
                        this.bZ = this.bZ.substring(6);
                     } else if(var2.startsWith("glow3:")) {
                        var3 = 11;
                        this.bZ = this.bZ.substring(6);
                     } else if(var2.startsWith(">")) {
                        var3 = 2;
                     }

                     var2 = this.bZ.toLowerCase();
                     byte var4 = 0;
                     if(var2.startsWith("wave:")) {
                        var4 = 1;
                        this.bZ = this.bZ.substring(5);
                     } else if(var2.startsWith("wave2:")) {
                        var4 = 2;
                        this.bZ = this.bZ.substring(6);
                     } else if(var2.startsWith("shake:")) {
                        var4 = 3;
                        this.bZ = this.bZ.substring(6);
                     } else if(var2.startsWith("scroll:")) {
                        var4 = 4;
                        this.bZ = this.bZ.substring(7);
                     } else if(var2.startsWith("slide:")) {
                        var4 = 5;
                        this.bZ = this.bZ.substring(6);
                     }

                     this.gz.a(4);
                     this.gz.b(0);
                     var5 = this.gz.b;
                     this.gz.h(var4);
                     this.gz.h(var3);
                     this.bo.b = 0;
                     aB.a(this.bZ, this.bo);
                     this.gz.b(this.bo.a, this.bo.b);
                     this.gz.e(this.gz.b - var5);
                     this.bZ = aB.a(this.bZ);
                     M.g = this.bZ;
                     M.l = var3;
                     M.D = var4;
                     M.H = 150;
                     if(M.aB == 1) {
                        this.a(M.g, 2, "@irn@" + M.ai, this.bI);
                     } else if(M.aB == 2) {
                        this.a(M.g, 2, "@hci@" + M.ai, this.bI);
                     } else if(M.aB == 3) {
                        this.a(M.g, 2, "@ult@" + M.ai, this.bI);
                     } else {
                        this.a(M.g, 2, M.ai, this.bI);
                     }

                     if(this.ak == 2) {
                        this.ak = 3;
                        this.gz.a(95);
                        this.gz.b(this.ak);
                        this.gz.b(this.u);
                        this.gz.b(this.af);
                     }
                  }

                  this.bZ = "";
                  ac = true;
               }
            }
         }
      }

   }

   private static String S() {
      m var0;
      int var1;
      return (var0 = m.a(489, 2)) != null && var0.V != null && (var1 = var0.V.indexOf(58)) != -1?var0.V.substring(var1 + 2):"";
   }

   private void c(String var1) {
      if(this.bI >= 0) {
         this.Y[this.O] = "Report abuse @whi@".concat(String.valueOf(var1));
         this.K[this.O] = 606;
         ++this.O;
      }

      this.Y[this.O] = "Add ignore @whi@".concat(String.valueOf(var1));
      this.K[this.O] = 42;
      ++this.O;
      this.Y[this.O] = "Add friend @whi@".concat(String.valueOf(var1));
      this.K[this.O] = 337;
      ++this.O;
   }

   private void j(int var1) {
      if(!this.hn && this.ad == 0 && this.bx == null && this.aj == -1 && this.el == -1) {
         Rectangle var2;
         (var2 = t.b()).getX();
         int var3 = (int)var2.getY();
         int var4 = this.hz.a;
         int var5 = 0;

         for(int var6 = 0; var6 < 500; ++var6) {
            if(this.cK[var6] != null) {
               String var7 = this.cJ[var6];
               int var8 = this.cI[var6];
               boolean var9 = this.ba[var6];
               int var10 = var3 + (int)var2.getHeight() - var5 * (var4 + 3) - 6 + G;
               if(var7 != null && (var7.startsWith("@irn@") || var7.startsWith("@hci@") || var7.startsWith("@ult@"))) {
                  var7 = var7.substring(5);
               }

               if(var7 == null) {
                  var7 = aC.c(T);
               }

               switch(var8) {
               case 0:
                  if((this.bb == 5 || this.bb == 0) && (this.o == 0 || this.o == 1 && var9)) {
                     ++var5;
                  }
                  break;
               case 1:
               case 2:
                  if(this.bb != 1 && this.bb != 0 || var8 != 1 && this.ak != 0 && (this.ak != 1 || !this.f(var7))) {
                     break;
                  }

                  ++var5;
                  if(!var7.equalsIgnoreCase(M.ai) && var1 > var10 - var4 && var1 <= var10) {
                     this.c(var7);
                  }
                  break;
               case 3:
               case 7:
                  if((this.gB == 0 && this.bb == 0 || this.bb == 2) && (var8 == 7 || this.u == 0 || this.u == 1 && this.f(var7))) {
                     ++var5;
                     if(!var7.equalsIgnoreCase(M.ai) && var1 > var10 - var4 && var1 <= var10) {
                        this.c(var7);
                     }
                  }
                  break;
               case 4:
                  if(this.bb != 3 && this.bb != 0 || var8 != 4 || this.af != 0 && (this.af != 1 || !this.f(var7))) {
                     break;
                  }

                  ++var5;
                  if(!var7.equalsIgnoreCase(M.ai) && var1 > var10 - var4 && var1 <= var10) {
                     this.Y[this.O] = "Accept trade @whi@".concat(String.valueOf(var7));
                     this.K[this.O] = 484;
                     ++this.O;
                  }
                  break;
               case 5:
                  if((this.gB == 0 && this.bb == 0 || this.bb == 2) && this.u < 2) {
                     ++var5;
                  }
                  break;
               case 6:
                  if((this.gB == 0 && this.bb == 0 || this.bb == 2) && this.u < 2) {
                     ++var5;
                  }
                  break;
               case 8:
                  if(this.bb != 3 && this.bb != 0) {
                     break;
                  }

                  ++var5;
                  if(!var7.equalsIgnoreCase(M.ai) && var1 > var10 - var4 && var1 <= var10) {
                     this.Y[this.O] = "Accept challenge @whi@".concat(String.valueOf(var7));
                     this.K[this.O] = 6;
                     ++this.O;
                  }
                  break;
               case 9:
                  if((this.bb == 0 && this.n == 0 || this.bb == 9) && (this.n == 0 || this.n == 1)) {
                     ++var5;
                     if(!var7.equalsIgnoreCase(M.ai) && var1 > var10 - var4 && var1 <= var10) {
                        this.c(var7);
                     }
                  }
               case 10:
               case 11:
               case 13:
               case 14:
               case 15:
               default:
                  break;
               case 12:
                  if(this.bb != 5 && this.bb != 0 || this.o != 0 && (this.o != 1 || !var9)) {
                     break;
                  }

                  ++var5;
                  if(!var7.equalsIgnoreCase(M.ai) && var1 > var10 - var4 && var1 <= var10) {
                     var7 = this.cL[var6];
                     this.Y[this.O] = "Go-to @lre@".concat(String.valueOf(var7));
                     this.K[this.O] = 927;
                     this.fd[this.O] = var6;
                     ++this.O;
                  }
                  break;
               case 16:
                  if((this.bb == 16 || this.bb == 0 && this.m == 0) && (this.m == 0 || this.m == 1)) {
                     ++var5;
                     if(!var7.equalsIgnoreCase(M.ai) && var1 > var10 - var4 && var1 <= var10) {
                        this.c(var7);
                     }
                  }
               }
            }
         }

      }
   }

   private void b(m var1) {
      int var2 = var1.d;
      int var3;
      if((var1.d <= 0 || var2 > 100) && (var2 < 701 || var2 > 800)) {
         if((var2 < 101 || var2 > 200) && (var2 < 801 || var2 > 900)) {
            if(var2 == 203) {
               var3 = this.cj;
               if(this.cl != 2) {
                  var3 = 0;
               }

               var1.w = var3 * 15 + 20;
               if(var1.w <= var1.e()) {
                  var1.w = var1.e() + 1;
               }

            } else if(var2 >= 401 && var2 <= 500) {
               var2 -= 401;
               if(var2 == 0 && this.cl == 0) {
                  var1.V = "Loading ignore list";
                  var1.c = 0;
               } else if(var2 == 1 && this.cl == 0) {
                  var1.V = "Please wait...";
                  var1.c = 0;
               } else {
                  var3 = this.bg;
                  if(this.cl == 0) {
                     var3 = 0;
                  }

                  if(var2 >= var3) {
                     var1.V = "";
                     var1.c = 0;
                  } else {
                     var1.V = aC.c(aC.a(this.cw[var2]));
                     var1.c = 1;
                  }
               }
            } else if(var2 == 503) {
               var1.w = this.bg * 15 + 20;
               if(var1.w <= var1.e()) {
                  var1.w = var1.e() + 1;
               }

            } else if(var2 == 327) {
               var1.ai = 150;
               var1.aj = (int)(Math.sin((double)S / 40.0D) * 256.0D) & 2047;
               var1.ad = 5;
               var1.ae = 0;
            } else if(var2 == 328) {
               int var5 = (int)(Math.sin((double)S / 40.0D) * 256.0D) & 2047;
               var1.ai = 150;
               var1.aj = var5;
               var1.ad = 5;
               var1.ae = 1;
            } else if(var2 == 324) {
               if(this.cA == null) {
                  this.cA = var1.ab;
                  this.cB = var1.ac;
               }

               if(this.ep) {
                  var1.ab = this.cB;
               } else {
                  var1.ab = this.cA;
               }
            } else if(var2 == 325) {
               if(this.cA == null) {
                  this.cA = var1.ab;
                  this.cB = var1.ac;
               }

               if(this.ep) {
                  var1.ab = this.cA;
               } else {
                  var1.ab = this.cB;
               }
            } else {
               if(var2 == 600) {
                  if(var1.p == this.gp) {
                     var1.V = this.bU;
                     if(S % 20 < 10) {
                        var1.V = var1.V + "|";
                        return;
                     }

                     var1.V = var1.V + " ";
                     return;
                  }

                  if(var1.p == this.gq) {
                     if(var1.q != -1 && !m.a(var1.q).y) {
                        if(var1.h > 32) {
                           boolean var8 = !m.a(var1.p, 29).y;
                           var1.V = this.bV[var8?1:2] + "*";
                           return;
                        }

                        m.a(var1.p, 41).y = this.bV[0].isEmpty();
                        var1.V = this.bV[0] + "*";
                     }

                     return;
                  }
               }

               if(var2 == 620) {
                  if(this.bI > 0) {
                     if(this.fZ) {
                        var1.X = 16711680;
                        var1.V = "Moderator option: Mute player for 48 hours: <ON>";
                     } else {
                        var1.X = 16777215;
                        var1.V = "Moderator option: Mute player for 48 hours: <OFF>";
                     }
                  } else {
                     var1.V = "";
                  }
               }

               String var7;
               if(var2 == 650 || var2 == 655) {
                  if(this.gA != 0) {
                     if(this.dH == 0) {
                        var7 = "earlier today";
                     } else if(this.dH == 1) {
                        var7 = "yesterday";
                     } else {
                        var7 = this.dH + " days ago";
                     }

                     var1.V = "You last logged in " + var7 + " from: " + ao.f;
                  } else {
                     var1.V = "";
                  }
               }

               if(var2 == 651) {
                  if(this.fW == 0) {
                     var1.V = "0 unread messages";
                     var1.X = 16776960;
                  }

                  if(this.fW == 1) {
                     var1.V = "1 unread message";
                     var1.X = '\uff00';
                  }

                  if(this.fW > 1) {
                     var1.V = this.fW + " unread messages";
                     var1.X = '\uff00';
                  }
               }

               if(var2 == 652) {
                  if(this.gh == 201) {
                     if(this.fB == 1) {
                        var1.V = "@yel@This is a non-members world: @whi@Since you are a member we";
                     } else {
                        var1.V = "";
                     }
                  } else if(this.gh == 200) {
                     var1.V = "You have not yet set any password recovery questions.";
                  } else {
                     if(this.gh == 0) {
                        var7 = "Earlier today";
                     } else if(this.gh == 1) {
                        var7 = "Yesterday";
                     } else {
                        var7 = this.gh + " days ago";
                     }

                     var1.V = var7 + " you changed your recovery questions";
                  }
               }

               if(var2 == 653) {
                  if(this.gh == 201) {
                     if(this.fB == 1) {
                        var1.V = "@whi@recommend you use a members world instead. You may use";
                     } else {
                        var1.V = "";
                     }
                  } else if(this.gh == 200) {
                     var1.V = "We strongly recommend you do so now to secure your account.";
                  } else {
                     var1.V = "If you do not remember making this change then cancel it immediately";
                  }
               }

               if(var2 == 654) {
                  if(this.gh == 201) {
                     if(this.fB == 1) {
                        var1.V = "@whi@this world but member benefits are unavailable whilst here.";
                        return;
                     }

                     var1.V = "";
                     return;
                  }

                  if(this.gh == 200) {
                     var1.V = "Do this from the \'account management\' area on our front webpage";
                     return;
                  }

                  var1.V = "Do this from the \'account management\' area on our front webpage";
               }

               if(var2 >= 10000 && var2 <= 10022) {
                  var2 -= 10000;
                  var7 = "";
                  var7 = var7 + aC.c(aA.a[aL[var2]]) + ": " + this.cu[aL[var2]] + "/" + this.em[aL[var2]] + "\\n";
                  var7 = var7 + "Current XP: " + NumberFormat.getIntegerInstance().format((long)this.bJ[aL[var2]]) + "\\n";
                  if(this.em[aL[var2]] < 99) {
                     var7 = var7 + "Next level: " + NumberFormat.getIntegerInstance().format((long)k(this.em[aL[var2]] + 1)) + "\\n";
                     var7 = var7 + "Remainder: " + NumberFormat.getIntegerInstance().format((long)(k(this.em[aL[var2]] + 1) - this.bJ[aL[var2]]));
                  } else {
                     if(this.bJ[aL[var2]] < 200000000) {
                        var7 = var7 + "Remainder: " + NumberFormat.getIntegerInstance().format((long)(200000000 - this.bJ[aL[var2]])) + "\\n";
                     } else {
                        var7 = var7 + "Max EXP Reached\\n";
                     }

                     var7 = var7 + "Max Level Reached";
                  }

                  var1.V = var7;
               } else if(var2 == 20000) {
                  var1.w = this.ck * 15 + 20;
                  if(var1.w <= var1.e()) {
                     var1.w = var1.e() + 1;
                  }

               } else if(var2 >= 20001 && var2 <= 20101) {
                  var3 = this.ck;
                  var2 -= 20001;
                  m var4 = m.a(var1.p, var2 + 21);
                  if(var2 >= var3) {
                     var4.ab = var4.ac = null;
                     var1.V = "";
                     var1.g = 0;
                     var1.c = 0;
                  } else {
                     var3 = this.cW[var2];
                     String var6 = aC.a(this.cV[var2]);
                     switch(var3) {
                     case 0:
                        if(this.f(var6) && !var6.equalsIgnoreCase(M.ai)) {
                           var4.ab = var4.ac = aH.a("clanchat", 0);
                        } else {
                           var4.ab = var4.ac = null;
                        }
                        break;
                     case 1:
                        var4.ab = var4.ac = aH.a("clanchat", 1);
                        break;
                     case 2:
                        var4.ab = var4.ac = aH.a("clanchat", 3);
                        break;
                     case 3:
                        var4.ab = var4.ac = aH.a("clanchat", 2);
                     }

                     var1.V = aC.c(var6);
                     var2 = 0;
                     if(var1.a() instanceof o) {
                        var2 = ((o)var1.a()).a(var1.V);
                     } else if(var1.a() instanceof l) {
                        var2 = ((l)var1.a()).a(var1.V);
                     }

                     var1.g = var2;
                     var1.c = 1;
                  }
               }
            }
         } else {
            var3 = this.cj;
            if(this.cl != 2) {
               var3 = 0;
            }

            if(var2 > 800) {
               var2 -= 701;
            } else {
               var2 -= 101;
            }

            if(var2 >= var3) {
               var1.V = "";
               var1.c = 0;
            } else {
               if(this.bj[var2] != 0 && this.bj[var2] == cY) {
                  var1.V = "@gre@Online";
               } else {
                  var1.V = "@red@Offline";
               }

               var1.c = 1;
            }
         }
      } else if(var2 == 1 && this.cl == 0) {
         var1.V = "Loading friend list";
         var1.c = 0;
      } else if(var2 == 1 && this.cl == 1) {
         var1.V = "Connecting to friendserver";
         var1.c = 0;
      } else if(var2 == 2 && this.cl != 2) {
         var1.V = "Please wait...";
         var1.c = 0;
      } else {
         var3 = this.cj;
         if(this.cl != 2) {
            var3 = 0;
         }

         if(var2 > 700) {
            var2 -= 601;
         } else {
            --var2;
         }

         if(var2 >= var3) {
            var1.V = "";
            var1.c = 0;
         } else {
            var1.V = this.eS[var2];
            var1.c = 1;
         }
      }
   }

   private static int k(int var0) {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 1; var3 <= var0; ++var3) {
         var1 = (int)((double)var1 + Math.floor((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D)));
         if(var3 >= var0) {
            return var2;
         }

         var2 = var1 / 4;
      }

      return 0;
   }

   private void a(String var1, int var2, String var3) {
      this.a(var2, "", var3, var1, 0, false);
   }

   private void a(String var1, String var2, boolean var3) {
      this.a(0, "", var2, var1, 0, var3);
   }

   private void a(String var1, int var2, String var3, int var4) {
      this.a(var2, "", var3, var1, var4, false);
   }

   private void a(int var1, String var2, String var3, String var4, int var5) {
      this.a(var1, var2, var3, var4, var5, false);
   }

   private void a(int var1, String var2, String var3, String var4, int var5, boolean var6) {
      if(var1 == 0 && this.el != -1) {
         this.bx = var4;
         super.aw = 0;
      }

      if(this.aj == -1) {
         ac = true;
      }

      for(int var7 = 499; var7 > 0; --var7) {
         this.cI[var7] = this.cI[var7 - 1];
         this.cJ[var7] = this.cJ[var7 - 1];
         this.cK[var7] = this.cK[var7 - 1];
         this.aZ[var7] = this.aZ[var7 - 1];
         this.ba[var7] = this.ba[var7 - 1];
         this.cL[var7] = this.cL[var7 - 1];
      }

      this.cI[0] = var1;
      this.cJ[0] = var3;
      this.cK[0] = var4;
      this.aZ[0] = var5;
      this.ba[0] = var6;
      this.cL[0] = var2;
   }

   public static void b(int var0) {
      if(N[var0] != -1) {
         Q = true;
         ab = var0;
         L = true;
      }

   }

   private void T() {
      if(this.eW == 0) {
         this.Y[0] = "Cancel";
         this.K[0] = 1107;
         this.O = 1;
         if(this.hY != -1) {
            this.bY = 0;
            this.ib = 0;
            this.a(8, m.a[this.hY], super.au, 8, super.av, 0, -1);
            if(this.bY != this.eb) {
               this.eb = this.bY;
            }

            if(this.ib != this.ia) {
               this.ia = this.ib;
            }

         } else {
            Client var1 = this;
            int var2;
            int var3;
            if(this.gB != 0) {
               var2 = 0;
               if(!this.fq.isEmpty()) {
                  ++var2;
               }

               if(this.fp != 0) {
                  ++var2;
               }

               for(var3 = 0; var3 < 100; ++var3) {
                  if(var1.cK[var3] != null) {
                     int var4 = var1.cI[var3];
                     String var5;
                     if((var5 = var1.cJ[var3]) != null && (var5.startsWith("@irn@") || var5.startsWith("@hci@") || var5.startsWith("@ult@"))) {
                        var5 = var5.substring(5);
                     }

                     if((var4 == 3 || var4 == 7) && (var4 == 7 || var1.u == 0 || var1.u == 1 && var1.f(var5))) {
                        int var6 = 329 - var2 * 13;
                        if(a != b.a) {
                           var6 = d - 176 - var2 * 13;
                        }

                        if(var1.au > 4 && var1.av - 4 > var6 - 10 && var1.av - 4 <= var6 + 3) {
                           int var7;
                           if((var7 = var1.hz.a("From:  " + var5 + var1.cK[var3]) + 25) > 450) {
                              var7 = 450;
                           }

                           if(var1.au < var7 + 4) {
                              if(var1.bI > 0) {
                                 var1.Y[var1.O] = "Report abuse @whi@".concat(String.valueOf(var5));
                                 var1.K[var1.O] = 2606;
                                 ++var1.O;
                              }

                              var1.Y[var1.O] = "Add ignore @whi@".concat(String.valueOf(var5));
                              var1.K[var1.O] = 2042;
                              ++var1.O;
                              var1.Y[var1.O] = "Add friend @whi@".concat(String.valueOf(var5));
                              var1.K[var1.O] = 2337;
                              ++var1.O;
                           }
                        }

                        ++var2;
                        if(var2 >= 5) {
                           break;
                        }
                     }

                     if((var4 == 5 || var4 == 6) && var1.u < 2) {
                        ++var2;
                        if(var2 >= 5) {
                           break;
                        }
                     }
                  }
               }
            }

            this.bY = 0;
            this.ib = 0;
            int var8;
            if(a == b.a) {
               if(super.au > 4 && super.av > 4 && super.au < 516 && super.av < 338) {
                  if(v != -1) {
                     this.a(4, m.a[v], super.au, 4, super.av, 0, -1);
                  } else {
                     this.Q();
                  }
               }
            } else if(a != b.a && this.c()) {
               var8 = c / 2 - 356;
               var2 = d / 2 - 230;
               if(this.a(var8, var2, var8 + 516, var2 + 338) && v != -1) {
                  this.a(var8, m.a[v], super.au, var2, super.av, 0, -1);
               } else {
                  this.Q();
               }
            }

            if(this.bY != this.eb) {
               this.eb = this.bY;
            }

            if(this.ib != this.ia) {
               this.ia = this.ib;
            }

            this.bY = 0;
            this.ib = 0;
            if(a == b.a) {
               if(super.au > c - 218 && super.av > d - 298 && super.au < c - 25 && super.av < d - 35) {
                  if(this.X != -1) {
                     this.a(c - 218, m.a[this.X], super.au, d - 298, super.av, 0, -1);
                  } else if(N[ab] != -1) {
                     this.a(c - 218, m.a[N[ab]], super.au, d - 298, super.av, 0, -1);
                  }
               }
            } else if(a != b.a) {
               var8 = c > h?37:74;
               if(c > h && super.au > c - 197 && super.av > d - var8 - 267 && super.au < c - 7 && super.av < d - var8 - 7 && f) {
                  if(this.X != -1) {
                     this.a(c - 197, m.a[this.X], super.au, d - 304, super.av, 0, -1);
                  } else if(N[ab] != -1) {
                     this.a(c - 197, m.a[N[ab]], super.au, d - 304, super.av, 0, -1);
                  }
               }

               if(c <= h && super.au > c - 211 && super.av > d - var8 - 267 && super.au < c - 7 && super.av < d - var8 - 7 && f) {
                  if(this.X != -1) {
                     this.a(c - 211, m.a[this.X], super.au, d - var8 - 267, super.av, 0, -1);
                  } else if(N[ab] != -1) {
                     this.a(c - 211, m.a[N[ab]], super.au, d - var8 - 267, super.av, 0, -1);
                  }
               }
            }

            if(this.bY != this.eq) {
               Q = true;
               L = true;
               this.eq = this.bY;
            }

            if(this.ib != this.hZ) {
               Q = true;
               L = true;
               this.hZ = this.ib;
            }

            this.bY = 0;
            this.ib = 0;
            if(e) {
               var8 = t.a(true);
               Rectangle var14 = t.b();
               if(super.au > 0 && super.au < (int)var14.getWidth() && super.av > var8 && super.av < var8 + (int)var14.getMaxY() + 11) {
                  if(this.aj != -1) {
                     var3 = var8 + var14.y + 11;
                     this.a((int)var14.getX(), m.a[this.aj], super.au, var3, super.av, 0, -1);
                  } else {
                     this.j(super.av - var8);
                  }
               }
            }

            if(this.aj != -1 && this.bY != this.ek) {
               ac = true;
               this.ek = this.bY;
            }

            if(this.aj != -1 && this.ib != this.ic) {
               ac = true;
               this.ic = this.ib;
            }

            if(super.au > 0 && super.av > d - 165 && super.au < 517 && super.av < d) {
               t.d(this);
            } else if(super.au > c - 249 && super.av < 168) {
               boolean var15 = a == b.a;
               if(super.au >= c - (var15?225:215) && super.au <= c - (var15?185:172) && super.av > 0 && super.av < 38) {
                  this.Y[1] = "Face north";
                  this.K[1] = 1011;
                  this.O = 2;
               }

               if(aE.j) {
                  boolean var11 = aE.k;
                  Point var12 = new Point(248, 18);
                  Point var17 = new Point(240, 22);
                  Point var18 = new Point(!var11?230:75, 122);
                  Point var19 = new Point(!var11?224:57, 126);
                  if(super.au >= c - (var15?var12.x:var17.x) && super.au <= c - ((var15?var12.x:var17.x) - 22) && super.av >= (var15?var12.y:var17.y) && super.av <= (var15?var12.y:var17.y) + 28) {
                     if(aN.d()) {
                        this.Y[4] = "Disable @lre@XP Drops";
                        this.K[4] = 1012;
                        this.Y[3] = "Position: @lre@Left";
                        this.K[3] = 1013;
                        this.Y[2] = "Position: @lre@Center";
                        this.K[2] = 1014;
                        this.Y[1] = "Position: @lre@Right";
                        this.K[1] = 1015;
                        this.O = 5;
                     } else {
                        this.Y[1] = "Enable @lre@XP Drops";
                        this.K[1] = 1012;
                        this.O = 2;
                     }
                  } else if(super.au >= c - (var15?var18.x:var19.x) && super.au <= c - ((var15?var18.x:var19.x) - 56) && super.av >= (var15?var18.y:var19.y) && super.av <= (var15?var18.y:var19.y) + 28) {
                     this.Y[2] = "Toggle @lre@Run";
                     this.K[2] = 1050;
                     this.Y[1] = "Toggle @lre@" + (var11?"Left":"Right");
                     this.K[1] = 1051;
                     this.O = 3;
                  }
               }
            }

            boolean var9 = false;

            String var10;
            while(!var9) {
               var9 = true;

               for(var2 = 0; var2 < this.O - 1; ++var2) {
                  if(this.K[var2] < 1000 && this.K[var2 + 1] > 1000) {
                     var10 = this.Y[var2];
                     this.Y[var2] = this.Y[var2 + 1];
                     this.Y[var2 + 1] = var10;
                     var3 = this.K[var2];
                     this.K[var2] = this.K[var2 + 1];
                     this.K[var2 + 1] = var3;
                     var3 = this.fc[var2];
                     this.fc[var2] = this.fc[var2 + 1];
                     this.fc[var2 + 1] = var3;
                     var3 = this.fd[var2];
                     this.fd[var2] = this.fd[var2 + 1];
                     this.fd[var2 + 1] = var3;
                     var3 = this.fe[var2];
                     this.fe[var2] = this.fe[var2 + 1];
                     this.fe[var2 + 1] = var3;
                     var9 = false;
                  }
               }
            }

            if(this.ad == 3 && this.aI != -1) {
               i var16 = i.a(this.aI);
               var10 = " <col=ff9040>" + var16.p;

               for(var3 = 0; var3 < 4; ++var3) {
                  byte var13;
                  if(var3 == 0) {
                     var13 = 1;
                  } else if(var3 == 1) {
                     var13 = 5;
                  } else if(var3 == 2) {
                     var13 = 10;
                  } else {
                     var13 = -1;
                  }

                  this.Y[4 - var3] = "Spawn " + (var13 == -1?"X":Integer.valueOf(var13)) + var10;
                  this.K[4 - var3] = var3 + 10000173;
                  this.fe[4 - var3] = var16.d;
                  this.fc[4 - var3] = var13;
               }

               this.Y[0] = "Cancel";
               this.K[0] = 1107;
               this.O = 5;
            }

         }
      }
   }

   private void b(String var1, String var2, boolean var3) {
      ao.i = var1;

      try {
         if(!var3) {
            this.hw = "";
            this.hv = "Connecting to server...";
         }

         File var4 = new File(ao.a() + "cacheVersion.dat");
         new aF(this);
         int var5 = aF.a();
         int var6;
         if(var4.exists()) {
            var6 = aF.b();
            if(var5 != var6) {
               this.hv = "Vscape has been updated!";
               this.hw = "Please restart your client.";
               return;
            }
         }

         this.gi = new aj(this, a('\uaa4a'));
         int var12 = (int)(aC.a(var1) >> 16 & 31L);
         this.gz.b = 0;
         this.gz.b(14);
         this.gz.b(var12);
         this.gi.a(2, this.gz.a);

         for(var12 = 0; var12 < 8; ++var12) {
            this.gi.b();
         }

         var5 = var12 = this.gi.b();
         int var7;
         if(var12 == 0) {
            this.gi.a(this.eT.a, 8);
            this.eT.b = 0;
            this.gJ = this.eT.l();
            int[] var13;
            (var13 = new int[4])[0] = (int)(Math.random() * 9.9999999E7D);
            var13[1] = (int)(Math.random() * 9.9999999E7D);
            var13[2] = (int)(this.gJ >> 32);
            var13[3] = (int)this.gJ;
            this.gz.b = 0;
            this.gz.b(10);
            this.gz.d(var13[0]);
            this.gz.d(var13[1]);
            this.gz.d(var13[2]);
            this.gz.d(var13[3]);
            this.gz.d(1092);
            this.gz.a(var1);
            this.gz.a(var2);
            String var14;
            if((var14 = v()).equals("00-00-00-00-00-00-00-E0") || var14.equals("00:00:00:00:00:00")) {
               var14 = System.getenv("USERNAME") + "@" + System.getenv("COMPUTERNAME");
            }

            this.gz.a(var14);
            this.gz.d(this.bn == 1?(gk >= 0?gk:0):-1);
            this.gz.s();
            this.by.b = 0;
            if(var3) {
               this.by.b(18);
            } else {
               this.by.b(16);
            }

            this.by.b(this.gz.b + 40);
            this.by.b(255);
            this.by.c(370);
            this.by.b(0);

            for(var7 = 0; var7 < 9; ++var7) {
               this.by.d(this.fb[var7]);
            }

            this.by.a(this.gz.a, this.gz.b);
            this.gz.d = new ae(var13);

            for(var7 = 0; var7 < 4; ++var7) {
               var13[var7] += 50;
            }

            this.dB = new ae(var13);
            this.gi.a(this.by.b, this.by.a);
            var12 = this.gi.b();
         }

         if(var12 == 1) {
            try {
               Thread.sleep(2000L);
            } catch (Exception var8) {
               ;
            }

            this.b(var1, var2, var3);
         } else if(var12 == 2) {
            this.bI = this.gi.b();
            this.gi.b();
            this.gM = 0L;
            this.bT.b = 0;
            super.ar = true;
            this.cT = true;
            R = true;
            this.gz.b = 0;
            this.eT.b = 0;
            this.dJ = -1;
            this.bu = -1;
            this.bv = -1;
            this.bw = -1;
            this.dI = 0;
            this.dK = 0;
            this.fp = 0;
            this.fq = "";
            this.dM = 0;
            this.bC = 0;
            this.O = 0;
            this.bX = false;
            super.as = 0;
            this.hR = 0;
            this.fM = 0;
            this.dW = 0;
            this.ez = 0;
            this.P();
            this.dV = 0;
            this.dq = -1;
            this.hq = 0;
            this.hr = 0;
            this.cd = 0;
            this.bq = 0;

            for(var12 = 0; var12 < 2048; ++var12) {
               this.cc[var12] = null;
               this.ch[var12] = null;
            }

            for(var12 = 0; var12 < 16384; ++var12) {
               this.bp[var12] = null;
            }

            M = this.cc[2047] = new A();
            this.dN.f();
            this.ew.f();

            for(var12 = 0; var12 < 4; ++var12) {
               for(var6 = 0; var6 < 104; ++var6) {
                  for(var7 = 0; var7 < 104; ++var7) {
                     this.bk[var12][var6][var7] = null;
                  }
               }
            }

            this.gr = new O();
            this.cl = 0;
            this.cj = 0;
            this.bg = 0;
            this.ck = 0;
            this.el = -1;
            this.aj = -1;
            v = -1;
            this.X = -1;
            this.dS = -1;
            this.fT = false;
            ab = 3;
            this.ad = 0;
            this.bX = false;
            this.hn = false;
            this.bx = null;
            this.ev = 0;
            this.D = -1;
            this.ep = true;
            this.G();

            for(var12 = 0; var12 < 5; ++var12) {
               this.du[var12] = 0;
            }

            for(var12 = 0; var12 < 5; ++var12) {
               this.fH[var12] = null;
               this.fI[var12] = false;
            }

            gm = 0;
            fL = 0;
            dr = 0;
            hW = 0;
            cv = 0;
            gy = 0;
            fX = 0;
            gO = 0;
            this.L();
            this.M();
            this.a(aE.c);
            gk = -1;
            gl = "";
         } else if(var12 == 3) {
            this.hw = "";
            this.hv = "Invalid username or password.";
         } else if(var12 == 4) {
            this.hv = "Your account has been disabled.";
            this.hw = "Thank you, come again.";
         } else if(var12 == 5) {
            this.hv = "Your account is already logged in.";
            this.hw = "Try again in 60 seconds...";
         } else if(var12 == 6) {
            this.hv = "Vscape has been updated!";
            this.hw = "Download the new client.";
         } else if(var12 == 7) {
            this.hv = "This world is full.";
            this.hw = "Please use a different world.";
         } else if(var12 == 8) {
            this.hv = "Unable to connect.";
            this.hw = "Login server offline.";
         } else if(var12 == 9) {
            this.hv = "Login limit exceeded.";
            this.hw = "Too many connections.";
         } else if(var12 == 10) {
            this.hv = "Unable to connect.";
            this.hw = "Bad session id.";
         } else if(var12 == 11) {
            this.hw = "Login server rejected session.";
            this.hw = "Please try again.";
         } else if(var12 == 12) {
            this.hv = "You need a members account to login to this world.";
            this.hw = "Please subscribe, or use a different world.";
         } else if(var12 == 13) {
            this.hv = "Could not complete login.";
            this.hw = "Please try again.";
         } else if(var12 == 14) {
            this.hv = "The server is being updated.";
            this.hw = "Please wait and try again.";
         } else if(var12 == 15) {
            R = true;
            this.gz.b = 0;
            this.eT.b = 0;
            this.dJ = -1;
            this.bu = -1;
            this.bv = -1;
            this.bw = -1;
            this.dI = 0;
            this.dK = 0;
            this.fp = 0;
            this.fq = "";
            this.O = 0;
            this.bX = false;
            this.bh = System.currentTimeMillis();
         } else if(var12 == 16) {
            this.hv = "Login attempts exceeded.";
            this.hw = "Please wait 1 minute and try again.";
         } else if(var12 == 17) {
            this.hv = "You are standing in a members-only area.";
            this.hw = "To play on this world move to a free area first";
         } else if(var12 == 18) {
            this.hv = "Your account has been locked.";
            this.hw = "Visit vidyascape.org for more info.";
         } else if(var12 == 20) {
            this.hv = "Invalid loginserver requested";
            this.hw = "Please try again.";
         } else if(var12 != 21) {
            if(var12 == 22) {
               this.hv = "";
               this.hw = "";
               gk = -1;
               gl = "";
               this.gK = 0;
               this.bn = 1;
            } else if(var12 == 23) {
               this.hv = "Invalid Verification Code";
               this.hw = "Please try again.";
            } else if(var12 == -1) {
               if(var5 == 0) {
                  if(this.ej < 2) {
                     try {
                        Thread.sleep(2000L);
                     } catch (Exception var10) {
                        ;
                     }

                     ++this.ej;
                     this.b(var1, var2, var3);
                  } else {
                     this.hv = "No response from loginserver.";
                     this.hw = "Please wait and try again.";
                  }
               } else {
                  this.hv = "No response from server.";
                  this.hw = "Please try again.";
               }
            } else {
               System.out.println("response:".concat(String.valueOf(var12)));
               this.hv = "Unexpected server response.";
               this.hw = "Please try again.";
            }
         } else {
            for(var12 = this.gi.b(); var12 >= 0; --var12) {
               this.hv = "You have only just left another world";
               this.hw = "Your profile will be transferred in: " + var12 + " seconds";

               try {
                  Thread.sleep(1000L);
               } catch (Exception var9) {
                  ;
               }
            }

            this.b(var1, var2, var3);
         }
      } catch (IOException var11) {
         this.hv = "";
         this.hv = "Invalid login or server offline.";
      }
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
      if(var5 >= 0 && var9 >= 0) {
         int var12;
         int var13;
         for(var12 = 0; var12 < 104; ++var12) {
            for(var13 = 0; var13 < 104; ++var13) {
               this.cm[var12][var13] = 0;
               this.bi[var12][var13] = 99999999;
            }
         }

         var12 = var9;
         var13 = var5;
         this.cm[var9][var5] = 99;
         this.bi[var9][var5] = 0;
         byte var14 = 0;
         int var15 = 0;
         this.hP[0] = var9;
         int var20 = var14 + 1;
         this.hQ[0] = var5;
         boolean var16 = false;
         int var17 = this.hP.length;
         int[][] var18 = this.gV[this.ct].a;

         int var19;
         while(var15 != var20) {
            var12 = this.hP[var15];
            var13 = this.hQ[var15];
            var15 = (var15 + 1) % var17;
            if(var12 == var11 && var13 == var8) {
               var16 = true;
               break;
            }

            if(var4 != 0) {
               if((var4 < 5 || var4 == 10) && this.gV[this.ct].a(var11, var12, var13, var2, var4 - 1, var8)) {
                  var16 = true;
                  break;
               }

               if(var4 < 10 && this.gV[this.ct].b(var11, var8, var13, var4 - 1, var2, var12)) {
                  var16 = true;
                  break;
               }
            }

            if(var6 != 0 && var3 != 0 && this.gV[this.ct].a(var8, var11, var12, var3, var7, var6, var13)) {
               var16 = true;
               break;
            }

            var19 = this.bi[var12][var13] + 1;
            if(var12 > 0 && this.cm[var12 - 1][var13] == 0 && (var18[var12 - 1][var13] & 19398920) == 0) {
               this.hP[var20] = var12 - 1;
               this.hQ[var20] = var13;
               var20 = (var20 + 1) % var17;
               this.cm[var12 - 1][var13] = 2;
               this.bi[var12 - 1][var13] = var19;
            }

            if(var12 < 103 && this.cm[var12 + 1][var13] == 0 && (var18[var12 + 1][var13] & 19399040) == 0) {
               this.hP[var20] = var12 + 1;
               this.hQ[var20] = var13;
               var20 = (var20 + 1) % var17;
               this.cm[var12 + 1][var13] = 8;
               this.bi[var12 + 1][var13] = var19;
            }

            if(var13 > 0 && this.cm[var12][var13 - 1] == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
               this.hP[var20] = var12;
               this.hQ[var20] = var13 - 1;
               var20 = (var20 + 1) % var17;
               this.cm[var12][var13 - 1] = 1;
               this.bi[var12][var13 - 1] = var19;
            }

            if(var13 < 103 && this.cm[var12][var13 + 1] == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
               this.hP[var20] = var12;
               this.hQ[var20] = var13 + 1;
               var20 = (var20 + 1) % var17;
               this.cm[var12][var13 + 1] = 4;
               this.bi[var12][var13 + 1] = var19;
            }

            if(var12 > 0 && var13 > 0 && this.cm[var12 - 1][var13 - 1] == 0 && (var18[var12 - 1][var13 - 1] & 19398926) == 0 && (var18[var12 - 1][var13] & 19398920) == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
               this.hP[var20] = var12 - 1;
               this.hQ[var20] = var13 - 1;
               var20 = (var20 + 1) % var17;
               this.cm[var12 - 1][var13 - 1] = 3;
               this.bi[var12 - 1][var13 - 1] = var19;
            }

            if(var12 < 103 && var13 > 0 && this.cm[var12 + 1][var13 - 1] == 0 && (var18[var12 + 1][var13 - 1] & 19399043) == 0 && (var18[var12 + 1][var13] & 19399040) == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
               this.hP[var20] = var12 + 1;
               this.hQ[var20] = var13 - 1;
               var20 = (var20 + 1) % var17;
               this.cm[var12 + 1][var13 - 1] = 9;
               this.bi[var12 + 1][var13 - 1] = var19;
            }

            if(var12 > 0 && var13 < 103 && this.cm[var12 - 1][var13 + 1] == 0 && (var18[var12 - 1][var13 + 1] & 19398968) == 0 && (var18[var12 - 1][var13] & 19398920) == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
               this.hP[var20] = var12 - 1;
               this.hQ[var20] = var13 + 1;
               var20 = (var20 + 1) % var17;
               this.cm[var12 - 1][var13 + 1] = 6;
               this.bi[var12 - 1][var13 + 1] = var19;
            }

            if(var12 < 103 && var13 < 103 && this.cm[var12 + 1][var13 + 1] == 0 && (var18[var12 + 1][var13 + 1] & 19399136) == 0 && (var18[var12 + 1][var13] & 19399040) == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
               this.hP[var20] = var12 + 1;
               this.hQ[var20] = var13 + 1;
               var20 = (var20 + 1) % var17;
               this.cm[var12 + 1][var13 + 1] = 12;
               this.bi[var12 + 1][var13 + 1] = var19;
            }
         }

         this.ht = 0;
         if(!var16) {
            if(var10) {
               var19 = 100;

               for(var2 = 1; var2 < 2; ++var2) {
                  for(var3 = var11 - var2; var3 <= var11 + var2; ++var3) {
                     for(var4 = var8 - var2; var4 <= var8 + var2; ++var4) {
                        if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && this.bi[var3][var4] < var19) {
                           var19 = this.bi[var3][var4];
                           var12 = var3;
                           var13 = var4;
                           this.ht = 1;
                           var16 = true;
                        }
                     }
                  }

                  if(var16) {
                     break;
                  }
               }
            }

            if(!var16) {
               return false;
            }
         }

         byte var21 = 0;
         this.hP[0] = var12;
         var15 = var21 + 1;
         this.hQ[0] = var13;

         for(var2 = var19 = this.cm[var12][var13]; var12 != var9 || var13 != var5; var2 = this.cm[var12][var13]) {
            if(var2 != var19) {
               var19 = var2;
               this.hP[var15] = var12;
               this.hQ[var15++] = var13;
            }

            if((var2 & 2) != 0) {
               ++var12;
            } else if((var2 & 8) != 0) {
               --var12;
            }

            if((var2 & 1) != 0) {
               ++var13;
            } else if((var2 & 4) != 0) {
               --var13;
            }
         }

         if(var15 <= 0) {
            if(var1 != 1) {
               return true;
            } else {
               return false;
            }
         } else {
            var2 = var15;
            if(var15 > 25) {
               var2 = 25;
            }

            --var15;
            var3 = this.hP[var15];
            var4 = this.hQ[var15];
            if((hW += var2) >= 92) {
               this.gz.a(36);
               this.gz.d(0);
               hW = 0;
            }

            if(var1 == 0) {
               this.gz.a(164);
               this.gz.b(var2 + var2 + 3);
            }

            if(var1 == 1) {
               this.gz.a(248);
               this.gz.b(var2 + var2 + 3 + 14);
            }

            if(var1 == 2) {
               this.gz.a(98);
               this.gz.b(var2 + var2 + 3);
            }

            this.gz.k(var3 + this.ef);
            this.hq = this.hP[0];
            this.hr = this.hQ[0];

            for(var1 = 1; var1 < var2; ++var1) {
               --var15;
               this.gz.b(this.hP[var15] - var3);
               this.gz.b(this.hQ[var15] - var4);
            }

            this.gz.i(var4 + this.eg);
            this.gz.g(super.az[5] != 1?0:1);
            return true;
         }
      } else {
         return false;
      }
   }

   private void b(K var1) {
      for(int var2 = 0; var2 < this.cf; ++var2) {
         int var3 = this.cg[var2];
         z var7 = this.bp[var3];
         int var4;
         int var5;
         int var6;
         if(((var4 = var1.f()) & 16) != 0) {
            if((var5 = var1.x()) == '\uffff') {
               var5 = -1;
            }

            var6 = var1.f();
            if(var5 == var7.y && var5 != -1) {
               if((var5 = uwotm8.d.a[var5].n) == 1) {
                  var7.z = 0;
                  var7.A = 0;
                  var7.B = var6;
                  var7.C = 0;
               }

               if(var5 == 2) {
                  var7.C = 0;
               }
            } else if(var5 == -1 || var7.y == -1 || uwotm8.d.a[var5].h >= uwotm8.d.a[var7.y].h) {
               var7.y = var5;
               var7.z = 0;
               var7.A = 0;
               var7.B = var6;
               var7.C = 0;
               var7.N = var7.x;
            }
         }

         if((var4 & 8) != 0) {
            var5 = var1.t();
            var6 = var1.u();
            var7.a(var6, var5, S);
            var7.E = S + 300;
            var7.F = var1.t();
            var7.G = var1.f();
         }

         if((var4 & 128) != 0) {
            var7.s = var1.h();
            var5 = var1.k();
            var7.w = var5 >> 16;
            var7.v = S + (var5 & '\uffff');
            var7.t = 0;
            var7.u = 0;
            if(var7.v > S) {
               var7.t = -1;
            }

            if(var7.s == '\uffff') {
               var7.s = -1;
            }
         }

         if((var4 & 32) != 0) {
            var7.c = var1.h();
            if(var7.c == '\uffff') {
               var7.c = -1;
            }
         }

         if((var4 & 1) != 0) {
            var7.g = var1.m();
            var7.H = 100;
         }

         if((var4 & 64) != 0) {
            var5 = var1.u();
            var6 = var1.v();
            var7.a(var6, var5, S);
            var7.E = S + 300;
            var7.F = var1.v();
            var7.G = var1.u();
         }

         if((var4 & 2) != 0) {
            var7.ad = h.a(var1.z());
            var7.L = var7.ad.i;
            var7.e = var7.ad.m;
            var7.Z = var7.ad.h;
            var7.aa = var7.ad.d;
            var7.ab = var7.ad.o;
            var7.ac = var7.ad.c;
            var7.j = var7.ad.k;
         }

         if((var4 & 4) != 0) {
            var7.J = var1.x();
            var7.K = var1.x();
         }
      }

   }

   private void a(h var1, int var2, int var3, int var4) {
      if(this.O < 400) {
         if(var1.r != null) {
            var1 = var1.b();
         }

         if(var1 != null) {
            if(var1.p) {
               String var5 = var1.f;
               if(var1.e != 0) {
                  var5 = var5 + g(M.ak, var1.e) + " (level-" + var1.e + ")";
               }

               if(this.hR == 1) {
                  this.Y[this.O] = "Use @lre@" + this.hV + "@whi@ -> @yel@" + var5;
                  this.K[this.O] = 582;
                  this.fe[this.O] = var2;
                  this.fc[this.O] = var4;
                  this.fd[this.O] = var3;
                  ++this.O;
               } else {
                  if(this.fM == 1) {
                     if((this.fO & 2) == 2) {
                        this.Y[this.O] = this.fP + " @yel@" + var5;
                        this.K[this.O] = 413;
                        this.fe[this.O] = var2;
                        this.fc[this.O] = var4;
                        this.fd[this.O] = var3;
                        ++this.O;
                        return;
                     }
                  } else {
                     int var6;
                     if(var1.g != null) {
                        for(var6 = 4; var6 >= 0; --var6) {
                           if(var1.g[var6] != null && !var1.g[var6].equalsIgnoreCase("attack")) {
                              this.Y[this.O] = var1.g[var6] + " @yel@" + var5;
                              if(var6 == 0) {
                                 this.K[this.O] = 20;
                              }

                              if(var6 == 1) {
                                 this.K[this.O] = 412;
                              }

                              if(var6 == 2) {
                                 this.K[this.O] = 225;
                              }

                              if(var6 == 3) {
                                 this.K[this.O] = 965;
                              }

                              if(var6 == 4) {
                                 this.K[this.O] = 478;
                              }

                              this.fe[this.O] = var2;
                              this.fc[this.O] = var4;
                              this.fd[this.O] = var3;
                              ++this.O;
                           }
                        }
                     }

                     if(var1.g != null) {
                        for(var6 = 4; var6 >= 0; --var6) {
                           if(var1.g[var6] != null && var1.g[var6].equalsIgnoreCase("attack")) {
                              short var7 = 0;
                              if(var1.e > M.ak) {
                                 var7 = 2000;
                              }

                              this.Y[this.O] = var1.g[var6] + " @yel@" + var5;
                              if(var6 == 0) {
                                 this.K[this.O] = var7 + 20;
                              }

                              if(var6 == 1) {
                                 this.K[this.O] = var7 + 412;
                              }

                              if(var6 == 2) {
                                 this.K[this.O] = var7 + 225;
                              }

                              if(var6 == 3) {
                                 this.K[this.O] = var7 + 965;
                              }

                              if(var6 == 4) {
                                 this.K[this.O] = var7 + 478;
                              }

                              this.fe[this.O] = var2;
                              this.fc[this.O] = var4;
                              this.fd[this.O] = var3;
                              ++this.O;
                           }
                        }
                     }

                     this.Y[this.O] = this.bI < 2?"Examine @yel@".concat(String.valueOf(var5)):"Examine @yel@" + var5 + " @gre@(@whi@" + var1.l + "@gre@)";
                     this.K[this.O] = 1025;
                     this.fe[this.O] = var2;
                     this.fc[this.O] = var4;
                     this.fd[this.O] = var3;
                     ++this.O;
                  }

               }
            }
         }
      }
   }

   private void a(int var1, int var2, A var3, int var4) {
      if(var3 != M) {
         if(this.O < 400) {
            String var5;
            if(var3.aA == 0) {
               var5 = var3.ai + g(M.ak, var3.ak) + " (level-" + var3.ak + ")";
            } else {
               var5 = var3.ai + " (skill-" + var3.aA + ")";
            }

            int var6;
            if(this.hR == 1) {
               this.Y[this.O] = "Use @lre@" + this.hV + "@whi@ -> " + var5;
               this.K[this.O] = 491;
               this.fe[this.O] = var2;
               this.fc[this.O] = var1;
               this.fd[this.O] = var4;
               ++this.O;
            } else if(this.fM == 1) {
               if((this.fO & 8) == 8) {
                  this.Y[this.O] = this.fP + " @whi@" + var5;
                  this.K[this.O] = 365;
                  this.fe[this.O] = var2;
                  this.fc[this.O] = var1;
                  this.fd[this.O] = var4;
                  ++this.O;
               }
            } else {
               for(var6 = 4; var6 >= 0; --var6) {
                  if(this.fH[var6] != null) {
                     this.Y[this.O] = this.fH[var6] + " @whi@" + var5;
                     short var7 = 0;
                     if(this.fH[var6].equalsIgnoreCase("attack")) {
                        if(var3.ak > M.ak) {
                           var7 = 2000;
                        }

                        if(M.ah != 0 && var3.ah != 0) {
                           if(M.ah == var3.ah) {
                              var7 = 2000;
                           } else {
                              var7 = 0;
                           }
                        }
                     } else if(this.fI[var6]) {
                        var7 = 2000;
                     }

                     if(var6 == 0) {
                        this.K[this.O] = var7 + 561;
                     }

                     if(var6 == 1) {
                        this.K[this.O] = var7 + 779;
                     }

                     if(var6 == 2) {
                        this.K[this.O] = var7 + 27;
                     }

                     if(var6 == 3) {
                        this.K[this.O] = var7 + 577;
                     }

                     if(var6 == 4) {
                        this.K[this.O] = var7 + 729;
                     }

                     this.fe[this.O] = var2;
                     this.fc[this.O] = var1;
                     this.fd[this.O] = var4;
                     ++this.O;
                  }
               }
            }

            for(var6 = 0; var6 < this.O; ++var6) {
               if(this.K[var6] == 519) {
                  this.Y[var6] = "Walk here @whi@".concat(String.valueOf(var5));
                  return;
               }
            }

         }
      }
   }

   private void a(ab var1) {
      int var2 = 0;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if(var1.f == 0) {
         var2 = this.cN.j(var1.e, var1.g, var1.h);
      }

      if(var1.f == 1) {
         var2 = this.cN.k(var1.e, var1.g, var1.h);
      }

      if(var1.f == 2) {
         var2 = this.cN.l(var1.e, var1.g, var1.h);
      }

      if(var1.f == 3) {
         var2 = this.cN.m(var1.e, var1.g, var1.h);
      }

      if(var2 != 0) {
         var5 = this.cN.c(var1.e, var1.g, var1.h, var2);
         var3 = var2 >> 14 & 32767;
         var4 = var5 & 31;
         var5 >>= 6;
      }

      var1.i = var3;
      var1.k = var4;
      var1.j = var5;
   }

   private void U() {
      if(!aS) {
         while(this.ez > 0) {
            try {
               av var1;
               if((var1 = aw.a(this.gE[0])) != null) {
                  ax var10000 = new ax;
                  au var2 = var1.a();
                  AudioFormat var3 = new AudioFormat((float)var2.a, 8, 1, true, false);
                  var10000.<init>(new AudioInputStream(new ByteArrayInputStream(var2.b), var3, (long)var2.b.length), this.hi[0], this.hh[0] + var1.a);
               }

               if(System.currentTimeMillis() + (long)(this.gz.b / 22) > this.bP + (long)(this.bQ / 22)) {
                  this.bQ = this.gz.b;
                  this.bP = System.currentTimeMillis();
               }
            } catch (Exception var4) {
               var4.printStackTrace();
            }

            --this.ez;

            for(int var5 = 0; var5 < this.ez; ++var5) {
               this.gE[var5] = this.gE[var5 + 1];
               this.hi[var5] = this.hi[var5 + 1];
               this.hh[var5] = this.hh[var5 + 1];
            }
         }

         if(this.hp > 0) {
            this.hp -= 20;
            if(this.hp < 0) {
               this.hp = 0;
            }

            if(this.hp == 0 && fV) {
               this.gP = this.cX;
               this.gQ = true;
               this.F.a(2, this.gP);
            }
         }

      }
   }

   public final void h() {
      this.a(20, "Starting up");

      try {
         (new aF(this)).c();
         Client var1 = this;
         String var2 = "http://vidyascape.org/files/client/clientVersion.dat";
         BufferedReader var24 = new BufferedReader(new InputStreamReader((new URL(var2)).openStream()));

         try {
            String var3;
            if((var3 = var24.readLine()) != null) {
               var1.aR = !var3.equalsIgnoreCase("7.6.0");
            }

            var24.close();
         } catch (IOException var14) {
            System.out.println("problem reading remote client version");
            var24.close();
         }
      } catch (Exception var15) {
         ;
      }

      try {
         aE.b();
         H = aE.h;
      } catch (Exception var13) {
         ;
      }

      boolean var10000 = ao.d;
      int var22;
      if(ao.b != null) {
         for(var22 = 0; var22 < 8; ++var22) {
            this.A[var22] = new uwotm8.c(ao.b, ao.c[var22], var22 + 1);
         }
      }

      try {
         this.eu = this.a(1, "title screen", "title", this.fb[1], 25);
         this.ag = new o(false, "p11_full", this.eu);
         this.hz = new o(false, "p12_full", this.eu);
         this.hA = new o(false, "b12_full", this.eu);
         this.hB = new o(true, "q8_full", this.eu);
         this.hC = new o(true, "fancy_m", this.eu);
         this.hD = new o(true, "fancy_l", this.eu);
         this.hE = new o(true, "gravestone", this.eu);
         this.hF = new o(true, "lunar_alphabet32", this.eu);
         this.hG = new o(true, "lunar_alphabet60", this.eu);
         this.ah = new l(false, "p11_full", this.eu);
         this.ai = new l(false, "p12_full", this.eu);
         this.hH = new l(false, "b12_full", this.eu);
         this.hI = new l(true, "q8_full", this.eu);
         this.hJ = new l(true, "fancy_m", this.eu);
         this.hK = new l(true, "fancy_l", this.eu);
         this.hL = new l(true, "gravestone", this.eu);
         this.hM = new l(true, "lunar_alphabet32", this.eu);
         this.hN = new l(true, "lunar_alphabet60", this.eu);
         I var23 = this.a(2, "config", "config", this.fb[2], 30);
         this.a(3, "interface", "interface", this.fb[3], 35);
         I var26 = this.a(4, "2d graphics", "media", this.fb[4], 40);
         I var28 = this.a(6, "textures", "textures", this.fb[6], 45);
         I var4 = this.a(7, "chat system", "wordenc", this.fb[7], 50);
         this.a(8, "sound effects", "sounds", this.fb[8], 55);
         this.ho = new byte[4][104][104];
         this.gI = new int[4][105][105];
         this.cN = new Y(this.gI);

         int var5;
         for(var5 = 0; var5 < 4; ++var5) {
            this.gV[var5] = new R();
         }

         this.hs = new n(512, 512);
         I var30 = this.a(5, "update list", "versionlist", this.fb[5], 60);
         this.a(60, "Connecting to update server");
         this.F = new ag();
         this.F.a(var30, this);
         F.a(this.F);
         if(P && !aS) {
            this.gP = 0;

            try {
               this.gP = Integer.parseInt(this.getParameter("music"));
            } catch (Exception var12) {
               ;
            }

            this.gQ = true;
            this.F.a(2, this.gP);

            while(this.F.b() > 0) {
               this.J();

               try {
                  Thread.sleep(100L);
               } catch (Exception var11) {
                  ;
               }

               if(this.F.a > 3) {
                  return;
               }
            }
         }

         this.a(80, "Unpacking media");

         try {
            aH.a();
         } catch (Exception var10) {
            System.out.println("Unable to load sprite cache.");
         }

         this.bc = aH.a("login", 0);
         if((new File(ao.a() + "sprites/background_custom.png")).exists()) {
            this.bd = new n("background_custom");
         } else {
            this.bd = new n("background");
         }

         this.r = new n("mascot_inv");
         this.s = new n("mascot_chat");
         this.dD = new n(var26, "overlay_multiway", 0);
         this.gC = new k(var26, "mapback", 0);

         for(var5 = 0; var5 <= 17; ++var5) {
            this.w[var5] = new n(var26, "staticons", var5);
         }

         for(var5 = 0; var5 <= 5; ++var5) {
            this.w[var5 + 18] = new n(var26, "staticons2", var5);
         }

         this.fD = new n(var26, "compass", 0);
         this.dC = new n(var26, "mapedge", 0);
         this.dC.a();

         try {
            for(var5 = 0; var5 < 100; ++var5) {
               this.ey[var5] = new k(var26, "mapscene", var5);
            }
         } catch (Exception var20) {
            ;
         }

         try {
            for(var5 = 0; var5 < 100; ++var5) {
               this.ee[var5] = new n(var26, "mapfunction", var5);
            }
         } catch (Exception var19) {
            ;
         }

         try {
            for(var5 = 0; var5 < 20; ++var5) {
               this.ds[var5] = new n(var26, "hitmarks", var5);
            }
         } catch (Exception var18) {
            ;
         }

         try {
            for(var5 = 0; var5 < 6; ++var5) {
               this.fi[var5] = new n(var26, "headicons_hint", var5);
            }
         } catch (Exception var17) {
            ;
         }

         try {
            for(var5 = 0; var5 < 8; ++var5) {
               this.fg[var5] = new n(var26, "headicons_prayer", var5);
            }

            for(var5 = 0; var5 < 3; ++var5) {
               this.fh[var5] = new n(var26, "headicons_pk", var5);
            }
         } catch (Exception var16) {
            ;
         }

         this.bK = new n(var26, "mapmarker", 0);
         this.bL = new n(var26, "mapmarker", 1);

         for(var5 = 0; var5 < 8; ++var5) {
            this.fU[var5] = new n(var26, "cross", var5);
         }

         this.eK = new n(var26, "mapdots", 0);
         this.ff = new n(var26, "Overlay_multiway", 0);
         this.eL = new n(var26, "mapdots", 1);
         this.eM = new n(var26, "mapdots", 2);
         this.eN = new n(var26, "mapdots", 3);
         this.eO = new n(var26, "mapdots", 4);
         this.eP = aH.a("clanchat", 7);
         this.dX = new n(var26, "scrollbar", 2);
         this.dY = new n(var26, "scrollbar", 3);
         this.dZ = new k(var26, "scrollbar", 0);
         this.ea = new k(var26, "scrollbar", 1);

         for(var5 = 0; var5 < 2; ++var5) {
            this.gL[var5] = new k(var26, "mod_icons", var5);
         }

         n var32 = new n(var26, "screenframe", 0);
         this.be = new t(var32.c, var32.d);
         var32.b(0, 0);
         var32 = new n(var26, "screenframe", 1);
         this.bf = new t(var32.c, var32.d);
         var32.b(0, 0);
         var5 = (int)(Math.random() * 21.0D) - 10;
         int var6 = (int)(Math.random() * 21.0D) - 10;
         int var7 = (int)(Math.random() * 21.0D) - 10;
         int var8 = (int)(Math.random() * 41.0D) - 20;

         for(int var9 = 0; var9 < 100; ++var9) {
            if(this.ee[var9] != null) {
               this.ee[var9].b(var5 + var8, var6 + var8, var7 + var8);
            }

            if(this.ey[var9] != null) {
               this.ey[var9].a(var5 + var8, var6 + var8, var7 + var8);
            }
         }

         this.a(83, "Unpacking textures");
         u.a(var28);
         u.a(0.8D);
         u.d();
         this.a(86, "Unpacking config");
         uwotm8.d.a(var23);
         j.a(var23);
         Z.a(var23);
         i.a(var23);
         h.a(var23);
         E.a(var23);
         g.a(var23);
         an.a(var23);
         am.a(var23);
         i.v = da;
         this.a(90, "Unpacking sounds");
         aw.a(this.A[7]);
         this.a(95, "Unpacking interfaces");
         o[] var31 = new o[]{this.ag, this.hz, this.hA, this.hB, this.hC, this.hD, this.hE, this.hF, this.hG};
         l[] var25 = new l[]{this.ah, this.ai, this.hH, this.hI, this.hJ, this.hK, this.hL, this.hM, this.hN};
         m.a(this.A[5], var26, var31, var25);
         this.a(100, "Preparing game engine");
         var22 = 0;

         int var27;
         int var29;
         while(var22 < 33) {
            var27 = 999;
            var29 = 0;
            var5 = 0;

            while(true) {
               if(var5 < 34) {
                  label307: {
                     if(this.gC.a[var5 + var22 * this.gC.c] == 0) {
                        if(var27 == 999) {
                           var27 = var5;
                        }
                     } else if(var27 != 999) {
                        var29 = var5;
                        break label307;
                     }

                     ++var5;
                     continue;
                  }
               }

               this.z[var22] = var27;
               this.E[var22] = var29 - var27;
               ++var22;
               break;
            }
         }

         var22 = 5;

         while(var22 < 156) {
            var27 = 999;
            var29 = 0;
            var5 = 25;

            while(true) {
               if(var5 < 172) {
                  label302: {
                     if(this.gC.a[var5 + var22 * this.gC.c] == 0 && (var5 > 34 || var22 > 34)) {
                        if(var27 == 999) {
                           var27 = var5;
                        }
                     } else if(var27 != 999) {
                        var29 = var5;
                        break label302;
                     }

                     ++var5;
                     continue;
                  }
               }

               this.et[var22 - 5] = var27 - 25;
               this.gU[var22 - 5] = var29 - var27;
               ++var22;
               break;
            }
         }

         r();
         ay.a(var4);
         this.bT = new az(this);
         this.a((Runnable)this.bT, 10);
         D.a = this;
         j.s = this;
         h.n = this;
         aL.a();
         t = aL.c();
      } catch (Exception var21) {
         var21.printStackTrace();
         ao.b("loaderror " + this.er + " " + this.eQ);
         this.cx = true;
      }
   }

   private void b(K var1, int var2) {
      int var3;
      A var4;
      int var5;
      int var6;
      for(; var1.c + 10 < var2 << 3 && (var3 = var1.f(11)) != 2047; var4.a(M.a[0] + var6, M.b[0] + var5, var3 == 1)) {
         if(this.cc[var3] == null) {
            this.cc[var3] = new A();
            if(this.ch[var3] != null) {
               this.cc[var3].a(this.ch[var3]);
            }
         }

         this.ce[this.cd++] = var3;
         (var4 = this.cc[var3]).I = S;
         if(var1.f(1) == 1) {
            this.cg[this.cf++] = var3;
         }

         var3 = var1.f(1);
         if((var5 = var1.f(5)) > 15) {
            var5 -= 32;
         }

         if((var6 = var1.f(5)) > 15) {
            var6 -= 32;
         }
      }

      var1.p();
   }

   private static String l(int var0) {
      return var0 < 999999999?String.valueOf(var0):"*";
   }

   private static String d(String var0) {
      if(var0.contains("<url=") && var0.endsWith("</url>")) {
         String var1 = var0.substring(0, var0.indexOf("<url="));
         String var2 = (var0 = var0.substring(var1.length() + 5).trim()).substring(0, var0.indexOf(">"));
         var0 = (var0 = var0.substring(var2.length() + 1).trim()).substring(0, var0.indexOf("</url>"));
         return var1 + " @red@" + var0;
      } else {
         return var0;
      }
   }

   private String a(m var1, String var2) {
      if(var2.indexOf("%") != -1) {
         int var3;
         while((var3 = var2.indexOf("%1")) != -1) {
            var2 = var2.substring(0, var3) + l(this.a(var1, 0)) + var2.substring(var3 + 2);
         }

         while((var3 = var2.indexOf("%2")) != -1) {
            var2 = var2.substring(0, var3) + l(this.a(var1, 1)) + var2.substring(var3 + 2);
         }

         while((var3 = var2.indexOf("%3")) != -1) {
            var2 = var2.substring(0, var3) + l(this.a(var1, 2)) + var2.substring(var3 + 2);
         }

         while((var3 = var2.indexOf("%4")) != -1) {
            var2 = var2.substring(0, var3) + l(this.a(var1, 3)) + var2.substring(var3 + 2);
         }

         while((var3 = var2.indexOf("%5")) != -1) {
            var2 = var2.substring(0, var3) + l(this.a(var1, 4)) + var2.substring(var3 + 2);
         }
      }

      return var2;
   }

   public URL getCodeBase() {
      try {
         return new URL(hX + ":80");
      } catch (Exception var1) {
         return null;
      }
   }

   private void V() {
      for(int var1 = 0; var1 < this.bq; ++var1) {
         int var2 = this.br[var1];
         z var3;
         if((var3 = this.bp[var2]) != null) {
            this.a((w)var3);
         }
      }

   }

   private void a(w var1) {
      if(var1.V < 128 || var1.W < 128 || var1.V >= 13184 || var1.W >= 13184) {
         var1.y = -1;
         var1.s = -1;
         var1.S = 0;
         var1.T = 0;
         var1.V = (var1.a[0] << 7) + (var1.L << 6);
         var1.W = (var1.b[0] << 7) + (var1.L << 6);
         var1.b();
      }

      if(var1 == M && (var1.V < 1536 || var1.W < 1536 || var1.V >= 11776 || var1.W >= 11776)) {
         var1.y = -1;
         var1.s = -1;
         var1.S = 0;
         var1.T = 0;
         var1.V = (var1.a[0] << 7) + (var1.L << 6);
         var1.W = (var1.b[0] << 7) + (var1.L << 6);
         var1.b();
      }

      if(var1.S > S) {
         b(var1);
      } else if(var1.T >= S) {
         c(var1);
      } else {
         d(var1);
      }

      this.e(var1);
      f(var1);
   }

   private static void b(w var0) {
      int var1 = var0.S - S;
      int var2 = (var0.O << 7) + (var0.L << 6);
      int var3 = (var0.Q << 7) + (var0.L << 6);
      var0.V += (var2 - var0.V) / var1;
      var0.W += (var3 - var0.W) / var1;
      var0.d = 0;
      if(var0.U == 0) {
         var0.i = 1024;
      }

      if(var0.U == 1) {
         var0.i = 1536;
      }

      if(var0.U == 2) {
         var0.i = 0;
      }

      if(var0.U == 3) {
         var0.i = 512;
      }

   }

   private static void c(w var0) {
      if(var0.T == S || var0.y == -1 || var0.B != 0 || var0.A + 1 > uwotm8.d.a[var0.y].a(var0.z)) {
         int var1 = var0.T - var0.S;
         int var2 = S - var0.S;
         int var3 = (var0.O << 7) + (var0.L << 6);
         int var4 = (var0.Q << 7) + (var0.L << 6);
         int var5 = (var0.P << 7) + (var0.L << 6);
         int var6 = (var0.R << 7) + (var0.L << 6);
         var0.V = (var3 * (var1 - var2) + var5 * var2) / var1;
         var0.W = (var4 * (var1 - var2) + var6 * var2) / var1;
      }

      var0.d = 0;
      if(var0.U == 0) {
         var0.i = 1024;
      }

      if(var0.U == 1) {
         var0.i = 1536;
      }

      if(var0.U == 2) {
         var0.i = 0;
      }

      if(var0.U == 3) {
         var0.i = 512;
      }

      var0.X = var0.i;
   }

   private static void d(w var0) {
      var0.p = var0.j;
      if(var0.x == 0) {
         var0.d = 0;
      } else {
         if(var0.y != -1 && var0.B == 0) {
            uwotm8.d var1 = uwotm8.d.a[var0.y];
            if(var0.N > 0 && var1.l == 0) {
               ++var0.d;
               return;
            }

            if(var0.N <= 0 && var1.m == 0) {
               ++var0.d;
               return;
            }
         }

         int var7 = var0.V;
         int var2 = var0.W;
         int var3 = (var0.a[var0.x - 1] << 7) + (var0.L << 6);
         int var4 = (var0.b[var0.x - 1] << 7) + (var0.L << 6);
         if(var3 - var7 <= 256 && var3 - var7 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
            if(var7 < var3) {
               if(var2 < var4) {
                  var0.i = 1280;
               } else if(var2 > var4) {
                  var0.i = 1792;
               } else {
                  var0.i = 1536;
               }
            } else if(var7 > var3) {
               if(var2 < var4) {
                  var0.i = 768;
               } else if(var2 > var4) {
                  var0.i = 256;
               } else {
                  var0.i = 512;
               }
            } else if(var2 < var4) {
               var0.i = 1024;
            } else {
               var0.i = 0;
            }

            int var5;
            if((var5 = var0.i - var0.X & 2047) > 1024) {
               var5 -= 2048;
            }

            int var6 = var0.aa;
            if(var5 >= -256 && var5 <= 256) {
               var6 = var0.Z;
            } else if(var5 >= 256 && var5 < 768) {
               var6 = var0.ac;
            } else if(var5 >= -768 && var5 <= -256) {
               var6 = var0.ab;
            }

            if(var6 == -1) {
               var6 = var0.Z;
            }

            var0.p = var6;
            var5 = 4;
            if(var0.X != var0.i && var0.c == -1 && var0.e != 0) {
               var5 = 2;
            }

            if(var0.x > 2) {
               var5 = 6;
            }

            if(var0.x > 3) {
               var5 = 8;
            }

            if(var0.d > 0 && var0.x > 1) {
               var5 = 8;
               --var0.d;
            }

            if(var0.Y[var0.x - 1]) {
               var5 <<= 1;
            }

            if(var5 >= 8 && var0.p == var0.Z && var0.f != -1) {
               var0.p = var0.f;
            }

            if(var7 < var3) {
               var0.V += var5;
               if(var0.V > var3) {
                  var0.V = var3;
               }
            } else if(var7 > var3) {
               var0.V -= var5;
               if(var0.V < var3) {
                  var0.V = var3;
               }
            }

            if(var2 < var4) {
               var0.W += var5;
               if(var0.W > var4) {
                  var0.W = var4;
               }
            } else if(var2 > var4) {
               var0.W -= var5;
               if(var0.W < var4) {
                  var0.W = var4;
               }
            }

            if(var0.V == var3 && var0.W == var4) {
               --var0.x;
               if(var0.N > 0) {
                  --var0.N;
               }
            }

         } else {
            var0.V = var3;
            var0.W = var4;
         }
      }
   }

   private void e(w var1) {
      if(var1.e != 0) {
         z var2;
         int var3;
         int var4;
         if(var1.c != -1 && var1.c < '\u8000' && (var2 = this.bp[var1.c]) != null) {
            var3 = var1.V - var2.V;
            var4 = var1.W - var2.W;
            if(var3 != 0 || var4 != 0) {
               var1.i = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
            }
         }

         if(var1.c >= '\u8000') {
            if((var4 = var1.c - '\u8000') == this.bW) {
               var4 = 2047;
            }

            A var5;
            if((var5 = this.cc[var4]) != null) {
               var4 = var1.V - var5.V;
               var3 = var1.W - var5.W;
               if(var4 != 0 || var3 != 0) {
                  var1.i = (int)(Math.atan2((double)var4, (double)var3) * 325.949D) & 2047;
               }
            }
         }

         if((var1.J != 0 || var1.K != 0) && (var1.x == 0 || var1.d > 0)) {
            var4 = var1.V - (var1.J - this.ef - this.ef << 6);
            var3 = var1.W - (var1.K - this.eg - this.eg << 6);
            if(var4 != 0 || var3 != 0) {
               var1.i = (int)(Math.atan2((double)var4, (double)var3) * 325.949D) & 2047;
            }

            var1.J = 0;
            var1.K = 0;
         }

         if((var4 = var1.i - var1.X & 2047) != 0) {
            if(var4 >= var1.e && var4 <= 2048 - var1.e) {
               if(var4 > 1024) {
                  var1.X -= var1.e;
               } else {
                  var1.X += var1.e;
               }
            } else {
               var1.X = var1.i;
            }

            var1.X &= 2047;
            if(var1.p == var1.j && var1.X != var1.i) {
               if(var1.k != -1) {
                  var1.p = var1.k;
                  return;
               }

               var1.p = var1.Z;
            }
         }

      }
   }

   private static void f(w var0) {
      var0.M = false;
      uwotm8.d var1;
      if(var0.p != -1) {
         var1 = uwotm8.d.a[var0.p];
         ++var0.r;
         if(var0.q < var1.b && var0.r > var1.a(var0.q)) {
            var0.r = 0;
            ++var0.q;
         }

         if(var0.q >= var1.b) {
            var0.r = 0;
            var0.q = 0;
         }
      }

      if(var0.s >= g.a.length) {
         var0.s = -1;
      }

      if(var0.s != -1 && S >= var0.v && (var1 = g.a[var0.s].b) != null) {
         if(var0.t < 0) {
            var0.t = 0;
         }

         ++var0.u;

         while(var0.t < var1.b && var0.u > var1.a(var0.t)) {
            var0.u -= var1.a(var0.t);
            ++var0.t;
         }

         if(var0.t >= var1.b && (var0.t < 0 || var0.t >= var1.b)) {
            var0.s = -1;
         }
      }

      if(var0.y >= uwotm8.d.a.length) {
         var0.y = -1;
      }

      if(var0.y != -1 && var0.B <= 1 && uwotm8.d.a[var0.y].l == 1 && var0.N > 0 && var0.S <= S && var0.T < S) {
         var0.B = 1;
      } else {
         if(var0.y != -1 && var0.B == 0) {
            var1 = uwotm8.d.a[var0.y];
            ++var0.A;

            while(var0.z < var1.b && var0.A > var1.a(var0.z)) {
               var0.A -= var1.a(var0.z);
               ++var0.z;
            }

            if(var0.z >= var1.b) {
               var0.z -= var1.e;
               ++var0.C;
               if(var0.C >= var1.k) {
                  var0.y = -1;
               }

               if(var0.z < 0 || var0.z >= var1.b) {
                  var0.y = -1;
               }
            }

            var0.M = var1.g;
         }

         if(var0.B > 0) {
            --var0.B;
         }

      }
   }

   private void W() {
      if(this.hm) {
         this.hm = false;
         if(a == b.a) {
            this.bf.a(0, super.ao, 0);
            this.be.a(4, super.ao, 0);
         }

         ac = true;
         Q = true;
         L = true;
         if(this.dW != 2 && a == b.a) {
            gf.a(a == b.a?4:0, super.ao, a == b.a?4:0);
            this.ge.a(0, super.ao, 516);
         }
      }

      int var3;
      int var4;
      int var5;
      if(this.dW == 2) {
         Client var1 = this;

         try {
            ++var1.hu;
            q();
            u.b();
            var1.b(true);
            var1.a(true);
            var1.b(false);
            var1.a(false);
            Client var2 = var1;

            int var26;
            for(B var8 = (B)var1.dN.b(); var8 != null; var8 = (B)var2.dN.d()) {
               if(var8.i == var2.ct && S <= var8.b) {
                  if(S >= var8.a) {
                     z var9;
                     if(var8.g > 0 && (var9 = var2.bp[var8.g - 1]) != null && var9.V >= 0 && var9.V < 13312 && var9.W >= 0 && var9.W < 13312) {
                        var8.a(S, var9.W, var2.b(var8.i, var9.W, var9.V) - var8.c, var9.V);
                     }

                     if(var8.g < 0) {
                        A var10;
                        if((var26 = -var8.g - 1) == var2.bW) {
                           var10 = M;
                        } else {
                           var10 = var2.cc[var26];
                        }

                        if(var10 != null && var10.V >= 0 && var10.V < 13312 && var10.W >= 0 && var10.W < 13312) {
                           var8.a(S, var10.W, var2.b(var8.i, var10.W, var10.V) - var8.c, var10.V);
                        }
                     }

                     var8.a(var2.cM);
                     var2.cN.a(var2.ct, var8.h, (int)var8.f, -1, (int)var8.e, 60, (int)var8.d, var8, false);
                  }
               } else {
                  var8.E();
               }
            }

            var2 = var1;

            for(v var24 = (v)var1.ew.b(); var24 != null; var24 = (v)var2.ew.d()) {
               if(var24.a == var2.ct && !var24.f) {
                  if(S >= var24.e) {
                     var24.a(var2.cM);
                     if(var24.f) {
                        var24.E();
                     } else {
                        var2.cN.a(var24.a, 0, var24.d, -1, var24.c, 60, var24.b, var24, false);
                     }
                  }
               } else {
                  var24.E();
               }
            }

            int var11;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var22;
            int var25;
            int var27;
            if(!var1.gb) {
               var22 = var1.gv;
               if(var1.do / 256 > var22) {
                  var22 = var1.do / 256;
               }

               if(var1.bO[4] && var1.gD[4] + 128 > var22) {
                  var22 = var1.gD[4] + 128;
               }

               var3 = var1.W & 2047;
               int var10001 = H + var22 * (a == b.a?var1.fa:5);
               int var10003 = var1.dO;
               int var10004 = var1.b(var1.ct, M.W, M.V) - 50;
               var13 = var1.dP;
               var11 = var10004;
               var27 = var10003;
               var25 = var10001;
               var14 = 2048 - var22 & 2047;
               var15 = 2048 - var3 & 2047;
               var16 = 0;
               var17 = 0;
               int var19;
               if(var14 != 0) {
                  var3 = F.D[var14];
                  var18 = F.E[var14];
                  var19 = 0 * var18 - var25 * var3 >> 16;
                  var25 = 0 * var3 + var25 * var18 >> 16;
                  var17 = var19;
               }

               if(var15 != 0) {
                  var3 = F.D[var15];
                  var18 = F.E[var15];
                  var19 = var25 * var3 + 0 * var18 >> 16;
                  var25 = var25 * var18 - 0 * var3 >> 16;
                  var16 = var19;
               }

               var1.bD = var27 - var16;
               var1.bE = var11 - var17;
               var1.bF = var13 - var25;
               var1.bG = var22;
               var1.bH = var3;
            }

            int var12;
            if(!var1.gb) {
               var2 = var1;
               int var10000;
               if(!aE.i) {
                  var10000 = var1.ct;
               } else {
                  var25 = 3;
                  if(var1.bG < 310) {
                     var26 = var1.bD >> 7;
                     var27 = var1.bF >> 7;
                     var11 = M.V >> 7;
                     var12 = M.W >> 7;
                     if((var1.ho[var1.ct][var26][var27] & 4) != 0) {
                        var25 = var1.ct;
                     }

                     if(var11 > var26) {
                        var13 = var11 - var26;
                     } else {
                        var13 = var26 - var11;
                     }

                     if(var12 > var27) {
                        var14 = var12 - var27;
                     } else {
                        var14 = var27 - var12;
                     }

                     if(var13 > var14) {
                        var15 = (var14 << 16) / var13;
                        var16 = '\u8000';

                        while(var26 != var11) {
                           if(var26 < var11) {
                              ++var26;
                           } else if(var26 > var11) {
                              --var26;
                           }

                           if((var2.ho[var2.ct][var26][var27] & 4) != 0) {
                              var25 = var2.ct;
                           }

                           if((var16 += var15) >= 65536) {
                              var16 -= 65536;
                              if(var27 < var12) {
                                 ++var27;
                              } else if(var27 > var12) {
                                 --var27;
                              }

                              if((var2.ho[var2.ct][var26][var27] & 4) != 0) {
                                 var25 = var2.ct;
                              }
                           }
                        }
                     } else {
                        var15 = (var13 << 16) / var14;
                        var16 = '\u8000';

                        while(var27 != var12) {
                           if(var27 < var12) {
                              ++var27;
                           } else if(var27 > var12) {
                              --var27;
                           }

                           if((var2.ho[var2.ct][var26][var27] & 4) != 0) {
                              var25 = var2.ct;
                           }

                           if((var16 += var15) >= 65536) {
                              var16 -= 65536;
                              if(var26 < var11) {
                                 ++var26;
                              } else if(var26 > var11) {
                                 --var26;
                              }

                              if((var2.ho[var2.ct][var26][var27] & 4) != 0) {
                                 var25 = var2.ct;
                              }
                           }
                        }
                     }
                  }

                  if((var2.ho[var2.ct][M.V >> 7][M.W >> 7] & 4) != 0) {
                     var25 = var2.ct;
                  }

                  var10000 = var25;
               }

               var22 = var10000;
            } else {
               var22 = var1.gc?var1.ct:(var1.b(var1.ct, var1.bF, var1.bD) - var1.bE < 800 && (var1.ho[var1.ct][var1.bD >> 7][var1.bF >> 7] & 4) != 0?var1.ct:3);
            }

            var3 = var1.bD;
            var4 = var1.bE;
            var5 = var1.bF;
            int var6 = var1.bG;
            int var7 = var1.bH;

            for(var25 = 0; var25 < 5; ++var25) {
               if(var1.bO[var25]) {
                  var26 = (int)(Math.random() * (double)((var1.bN[var25] << 1) + 1) - (double)var1.bN[var25] + Math.sin((double)var1.ec[var25] * ((double)var1.cy[var25] / 100.0D)) * (double)var1.gD[var25]);
                  if(var25 == 0) {
                     var1.bD += var26;
                  }

                  if(var25 == 1) {
                     var1.bE += var26;
                  }

                  if(var25 == 2) {
                     var1.bF += var26;
                  }

                  if(var25 == 3) {
                     var1.bH = var1.bH + var26 & 2047;
                  }

                  if(var25 == 4) {
                     var1.bG += var26;
                     if(var1.bG < 128) {
                        var1.bG = 128;
                     }

                     if(var1.bG > 383) {
                        var1.bG = 383;
                     }
                  }
               }
            }

            var25 = u.v;
            F.y = true;
            F.B = 0;
            F.z = var1.au - 4;
            F.A = var1.av - 4;
            q.f();
            var1.cN.a(var1.bD, var1.bF, var1.bH, var1.bE, var22, var1.bG);
            var1.cN.d();
            var1.B();
            if(var1.bC == 2) {
               var1.f((var1.cD - var1.ef << 7) + var1.cG, var1.cF << 1, (var1.cE - var1.eg << 7) + var1.cH);
               if(var1.db >= 0 && S % 20 < 10) {
                  var1.fi[0].d(var1.db - 12, var1.dc - 28);
               }
            }

            k var28;
            byte[] var29;
            byte[] var31;
            if(u.u[17] >= var25) {
               var27 = (var28 = u.t[17]).c * var28.d - 1;
               var11 = var28.c * var1.cM << 1;
               var29 = var28.a;
               var31 = var1.cn;

               for(var14 = 0; var14 <= var27; ++var14) {
                  var31[var14] = var29[var14 - var11 & var27];
               }

               var28.a = var31;
               var1.cn = var29;
               u.b(17);
               if(++bB > 1235) {
                  bB = 0;
                  var1.gz.a(226);
                  var1.gz.b(0);
                  var14 = var1.gz.b;
                  var1.gz.c('\ue562');
                  var1.gz.b(240);
                  var1.gz.c((int)(Math.random() * 65536.0D));
                  var1.gz.b((int)(Math.random() * 256.0D));
                  if((int)(Math.random() * 2.0D) == 0) {
                     var1.gz.c('\uca71');
                  }

                  var1.gz.b((int)(Math.random() * 256.0D));
                  var1.gz.c((int)(Math.random() * 65536.0D));
                  var1.gz.c(7130);
                  var1.gz.c((int)(Math.random() * 65536.0D));
                  var1.gz.c('\uf0d9');
                  var1.gz.e(var1.gz.b - var14);
               }
            }

            if(u.u[24] >= var25) {
               var27 = (var28 = u.t[24]).c * var28.d - 1;
               var11 = var28.c * var1.cM << 1;
               var29 = var28.a;
               var31 = var1.cn;

               for(var14 = 0; var14 <= var27; ++var14) {
                  var31[var14] = var29[var14 - var11 & var27];
               }

               var28.a = var31;
               var1.cn = var29;
               u.b(24);
            }

            if(u.u[34] >= var25) {
               var27 = (var28 = u.t[34]).c * var28.d - 1;
               var11 = var28.c * var1.cM << 1;
               var29 = var28.a;
               var31 = var1.cn;

               for(var14 = 0; var14 <= var27; ++var14) {
                  var31[var14] = var29[var14 - var11 & var27];
               }

               var28.a = var31;
               var1.cn = var29;
               u.b(34);
            }

            int[] var39 = u.u;
            var27 = (var28 = u.t[40]).c * var28.d - 1;
            var11 = var28.c * var1.cM << 1;
            var29 = var28.a;
            var31 = var1.cn;

            for(var14 = 0; var14 <= var27; ++var14) {
               var31[var14] = var29[var14 - var11 & var27];
            }

            var28.a = var31;
            var1.cn = var29;
            u.b(40);
            var1.ig.a(var1.dS, c, d);
            var1.if.a(v, c, d);
            aN.a();
            if(e) {
               Client var33 = var1;
               if(var1.gB != 0) {
                  o var30 = var1.hz;
                  var27 = 0;
                  if(!var1.fq.isEmpty()) {
                     ++var27;
                  }

                  if(var1.fp != 0) {
                     ++var27;
                  }

                  for(var11 = 0; var11 < 100; ++var11) {
                     if(var33.cK[var11] != null) {
                        var12 = var33.cI[var11];
                        String var35 = var33.cJ[var11];
                        var14 = var33.aZ[var11];
                        byte var36 = 0;
                        if(var35 != null && var35.startsWith("@irn@")) {
                           var35 = var35.substring(5);
                           var36 = 4;
                        } else if(var35 != null && var35.startsWith("@hci@")) {
                           var35 = var35.substring(5);
                           var36 = 5;
                        } else if(var35 != null && var35.startsWith("@ult@")) {
                           var35 = var35.substring(5);
                           var36 = 6;
                        }

                        if((var12 == 3 || var12 == 7) && (var12 == 7 || var33.u == 0 || var33.u == 1 && var33.f(var35))) {
                           var16 = 329 - var27 * 13;
                           if(a != b.a) {
                              var16 = d - 170 - var27 * 13;
                           }

                           var30.b(0, "From", var16, 4);
                           var30.b('\uffff', "From", var16 - 1, 4);
                           var17 = 4 + var30.a("From ");
                           if(var14 > 0) {
                              var17 += var33.a(var14, var17 + 1, var16 - 12);
                           }

                           if(var36 > 0) {
                              var17 += var33.a(var36, var17 + 1, var16 - 12);
                           }

                           var30.b(0, var35 + ": " + var33.cK[var11], var16, var17);
                           var30.b('\uffff', var35 + ": " + var33.cK[var11], var16 - 1, var17);
                           ++var27;
                           if(var27 >= 5) {
                              break;
                           }
                        }

                        if(var12 == 5 && var33.u < 2) {
                           var16 = 329 - var27 * 13;
                           if(a != b.a) {
                              var16 = d - 170 - var27 * 13;
                           }

                           var30.b(0, var33.cK[var11], var16, 4);
                           var30.b('\uffff', var33.cK[var11], var16 - 1, 4);
                           ++var27;
                           if(var27 >= 5) {
                              break;
                           }
                        }

                        if(var12 == 6 && var33.u < 2) {
                           var16 = 329 - var27 * 13;
                           if(a != b.a) {
                              var16 = d - 170 - var27 * 13;
                           }

                           var30.b(0, "To " + var35 + ": " + var33.cK[var11], var16, 4);
                           var30.b('\uffff', "To " + var35 + ": " + var33.cK[var11], var16 - 1, 4);
                           ++var27;
                           if(var27 >= 5) {
                              break;
                           }
                        }
                     }
                  }
               }
            }

            if(var1.cs == 1) {
               var25 = a == b.a?4:0;
               var1.fU[var1.cr / 100].d(var1.cp - 8 - var25, var1.cq - 8 - var25);
            }

            if(var1.cs == 2) {
               var25 = a == b.a?4:0;
               var1.fU[4 + var1.cr / 100].d(var1.cp - 8 - var25, var1.cq - 8 - var25);
            }

            if(var1.ev == 1) {
               var25 = var1.dS == 4?c - 90:c - 120;
               var1.dD.d(a == b.a?472:var25, a == b.a?296:174);
            }

            if(var1.dS != -1 && r.a(var1.dS)) {
               var1.h(var1.cM, var1.dS);
               if(a != b.a) {
                  if(var1.dS == 260) {
                     var1.a(0, d - 334 - 165, 512, 334, m.a[var1.dS], -1, 0);
                  } else if(var1.dS == 310) {
                     var27 = c / 2 - 256;
                     var1.a(var27, 0, 512, 334, m.a[var1.dS], -1, 0);
                  } else if(var1.dS == 358) {
                     var27 = c / 2 - 256;
                     var11 = d / 2 - 167 - 40;
                     var1.a(var27, var11, 512, 334, m.a[var1.dS], -1, 0);
                  } else if(var1.dS != 495 && var1.dS != 314) {
                     if(var1.dS == 533) {
                        var1.a(c - 241 - 512, 0, 512, 334, m.a[var1.dS], -1, 0);
                     } else {
                        var1.c(0, 0, 512, 334, var1.dS);
                     }
                  } else {
                     var27 = c / 2 - 256;
                     var11 = d / 2 - 167 - 40;
                     var1.a(var27, var11, 512, 334, m.a[var1.dS], -1, 0);
                  }
               } else {
                  var1.c(0, 0, 512, 334, var1.dS);
               }
            }

            if(v != -1 && r.a(v)) {
               var1.h(var1.cM, v);
               if(a != b.a) {
                  var27 = c / 2 - 356;
                  var11 = d / 2 - 230;
                  if((v < 592 || v > 595) && v != 597 && v != 599 && v != 602 && v != 604 && v != 605) {
                     var1.c(var27, var11, 512, 334, v);
                  } else {
                     var1.c(0, 0, c, d, v);
                  }
               } else {
                  var1.c(0, 0, 512, 334, v);
               }
            }

            var1.hj = 0;
            var26 = (M.V >> 7) + var1.ef;
            var27 = (M.W >> 7) + var1.eg;
            if(var26 >= 3053 && var26 <= 3156 && var27 >= 3056 && var27 <= 3136) {
               var1.hj = 1;
            }

            if(var26 >= 3072 && var26 <= 3118 && var27 >= 9492 && var27 <= 9535) {
               var1.hj = 1;
            }

            if(var1.hj == 1 && var26 >= 3135 && var26 <= 3199 && var27 >= 3008 && var27 <= 3062) {
               var1.hj = 0;
            }

            if(!var1.fq.isEmpty()) {
               var25 = a == b.a?329:d - 171;
               if(e) {
                  var1.hz.a(true, 4, 16776960, var1.fq, var25);
               } else {
                  var1.hz.a(true, 4, 16776960, var1.fq, d - 30);
               }
            }

            if(!var1.bX) {
               var1.T();
               if(var1.O >= 2 || var1.hR != 0 || var1.fM != 0) {
                  String var32;
                  if(var1.hR == 1 && var1.O < 2) {
                     var32 = "Use @lre@" + var1.hV + "@whi@ ->";
                  } else if(var1.fM == 1 && var1.O < 2) {
                     var32 = var1.fP + "...";
                  } else {
                     var32 = var1.Y[var1.O - 1];
                  }

                  if(var1.O > 2) {
                     var32 = var32 + "@whi@ / " + (var1.O - 2) + " more options";
                  }

                  var1.hH.a(b(var32), 4, 15, 16777215, 0);
               }
            } else {
               var1.e(a == b.a?4:0, a == b.a?4:0);
            }

            var25 = c - 258;
            var26 = 20;
            if(fY) {
               Runtime var34;
               var12 = (int)(((var34 = Runtime.getRuntime()).totalMemory() - var34.freeMemory()) / 1024L);
               var27 = 16776960;
               var1.hz.a("Mem:" + var12 + "k", var25, 16776960, 20);
               var26 += 15;
               if(var1.al < 15) {
                  var27 = 16711680;
               }

               var1.hz.a("Fps:" + var1.al, var25, var27, 35);
               var26 += 15;
            }

            if(var1.ie != null) {
               var27 = 16776960;
               if(y > 200) {
                  var27 = 16711680;
               }

               if(y < 0) {
                  var1.hz.a("Ping: -", var25, var27, var26);
               } else {
                  var1.hz.a("Ping: " + y, var25, var27, var26);
               }
            }

            var27 = var1.ef + (M.V - 6 >> 7);
            var11 = var1.eg + (M.W - 6 >> 7);
            var12 = (var27 >> 3) - 6;
            var13 = (var11 >> 3) - 6;
            var14 = var27 - (var12 << 3);
            var15 = var11 - (var13 << 3);
            if(cZ) {
               var16 = e?d - 173:d - 34;
               l var37 = var1.hH;
               var25 = var1.hH.a + 3;
               var18 = 16776960;
               if(var1.al < 15) {
                  var18 = 16711680;
               }

               Runtime var38;
               var26 = (int)(((var38 = Runtime.getRuntime()).totalMemory() - var38.freeMemory()) / 1024L);
               var37.a("Fps: " + var1.al, 5, var16, var18, 0);
               var16 -= var25;
               var37.a("Memory Usage: " + var26 + "k", 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("Screen Mode: " + a, 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("Client Resolution: " + c + "x" + d, 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("Client Zoom: " + H, 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("frameWidth: " + (var1.au - c) + ", frameHeight: " + (var1.av - d), 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("Mouse X: " + var1.au + ", Mouse Y: " + var1.av, 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("Coords: " + var27 + ", " + var11, 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("Local Coords: " + var14 + ", " + var15, 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("Floor Map Array: " + Arrays.toString(var1.gX), 5, var16, 16776960, 0);
               var16 -= var25;
               var37.a("Object Map Array: " + Arrays.toString(var1.gY), 5, var16, 16776960, 0);
            }

            if(var1.fp != 0) {
               if(a == b.a) {
                  var16 = 329;
               } else {
                  var16 = d - 170;
               }

               if(!var1.fq.isEmpty()) {
                  var16 -= 14;
               }

               var25 = (var17 = var1.fp / 50) / 60;
               if((var17 %= 60) < 10) {
                  var1.hz.b(16776960, "System update in: " + var25 + ":0" + var17, var16, 4);
               } else {
                  var1.hz.b(16776960, "System update in: " + var25 + ":" + var17, var16, 4);
               }

               if(++bA > 75) {
                  bA = 0;
                  var1.gz.a(148);
               }
            }

            if(a != b.a) {
               var1.u();
            }

            gf.a(a == b.a?4:0, var1.ao, a == b.a?4:0);
            var1.bD = var3;
            var1.bE = var4;
            var1.bF = var5;
            var1.bG = var6;
            var1.bH = var7;
         } catch (Exception var20) {
            ao.b("97263, " + var20.toString());
            var20.printStackTrace();
         }
      }

      if(this.X != -1 && this.h(this.cM, this.X)) {
         Q = true;
      }

      if(this.he == 2 || this.eW == 2) {
         Q = true;
      }

      int var21;
      Rectangle var23;
      if(this.aj == -1) {
         var21 = t.a(true);
         var3 = (int)(var23 = t.b()).getHeight() + 1;
         this.ex.x = aa - G - var3;
         var5 = (var4 = (int)var23.getWidth()) + 16;
         if(super.au >= var4 && super.au <= var5 && super.av > var21) {
            this.a(var4, var3, super.au, super.av, this.ex, var21 + (int)var23.getY(), false, aa);
         }

         if((var21 = aa - var3 - this.ex.x) > aa - var3) {
            var21 = aa - var3;
         }

         if(var21 < 0) {
            var21 = 0;
         }

         if(G != var21) {
            G = var21;
            ac = true;
         }
      }

      if(this.aj == -1 && this.ad >= 3 && this.ad <= 5) {
         var21 = t.a(true) + 14;
         var3 = (int)(var23 = t.b()).getHeight() + 1;
         this.ex.x = i;
         var5 = (var4 = (int)var23.getWidth()) + 16;
         if(super.au >= var4 && super.au <= var5 && super.av > var21) {
            this.a(var4, var3, super.au, super.av, this.ex, var21 + (int)var23.getY(), false, j);
         }

         var21 = this.ex.x;
         if(this.ex.x > j - var3) {
            var21 = j - var3;
         }

         if(var21 < 0) {
            var21 = 0;
         }

         if(i != var21) {
            i = var21;
            ac = true;
         }

         if(this.b()) {
            ac = true;
         }
      }

      if(this.aj != -1 && this.h(this.cM, this.aj)) {
         ac = true;
      }

      if(this.he != 3 && this.eW != 3 && this.bx == null) {
         if(this.bX) {
            ;
         }
      } else {
         ac = true;
      }

      if(this.dW == 2 && this.dp) {
         this.dp = false;
         this.e(this.ct);
      }

      if(this.D != -1) {
         L = true;
      }

      if(L && this.D != -1 && this.D == ab) {
         this.D = -1;
         this.gz.a(120);
         this.gz.b(ab);
      }

      if(a == b.a) {
         this.u();
      }

      this.cM = 0;
   }

   private int e(String var1) {
      for(int var2 = 0; var2 < this.ck; ++var2) {
         String var3;
         if(this.cV[var2] > 0L && !(var3 = aC.a(this.cV[var2])).isEmpty() && var3.equalsIgnoreCase(var1)) {
            return this.cW[var2];
         }
      }

      return 0;
   }

   private void f(int var1, int var2) {
      try {
         m[] var3;
         m var4;
         (var4 = (var3 = m.a[174])[78]).A[0] = 0;
         var4.B[0] = 0;

         int var5;
         m var7;
         m var11;
         for(var5 = 0; var5 < 10; ++var5) {
            int var6 = 9 + (var5 << 2);
            var7 = var3[var6];
            m var8 = var3[var6 + 2];
            var11 = var3[var6 + 3];
            m var9 = var3[var5 + 50];
            var7.ab = aH.a("bank", 0);
            var8.ab = aH.a("bank", 1);
            if(var5 > 0) {
               var7.an = "";
               var7.y = true;
               var11.y = true;
               if(var5 >= var2) {
                  if(var5 == var2) {
                     var7.an = "New tab";
                     var7.y = false;
                     var11.y = false;
                  }
               } else {
                  var7.an = "View Tab @lre@".concat(String.valueOf(var5));
                  var7.y = false;
                  var11.y = true;
               }

               var4.A[var5] = var9.A[0];
               var4.B[var5] = var9.B[0];
            }

            if(var5 <= 8) {
               var11 = var3[var5 + 60];
               var3[var5 + 69].y = true;
               var11.y = true;
            }

            if(var5 != this.aV) {
               var9.y = true;
            } else {
               var9.y = false;
            }
         }

         if(var1 >= 0 && var1 <= 9) {
            var5 = 9 + (var1 << 2);
            var11 = var3[var5];
            var7 = var3[var5 + 2];
            var11.ab = aH.a("bank", 2);
            var7.ab = aH.a("bank", 2);
            return;
         }
      } catch (Exception var10) {
         ;
      }

   }

   private static int c(m var0) {
      return d(var0) * (32 + var0.J);
   }

   private static int d(m var0) {
      return (int)Math.ceil((double)e(var0) / (double)var0.d());
   }

   private static int e(m var0) {
      int var1 = 0;
      if(var0 != null && var0.b == 2 && var0.A != null) {
         for(int var2 = 0; var2 < var0.A.length; ++var2) {
            if(var0.A[var2] > 0) {
               ++var1;
            }
         }
      }

      return var1;
   }

   private void X() {
      if(v == 174) {
         try {
            m[] var1;
            m var2 = (var1 = m.a[174])[49];
            m var3;
            var1[50].h = d(var3 = var1[50]);
            int var4;
            if(this.aV <= 0) {
               var4 = c(var3) + 14;
               int var5 = var3.c() + var4;

               for(int var12 = 0; var12 < 9; ++var12) {
                  m var6 = var1[var12 + 51];
                  m var7 = var1[var12 + 60];
                  m var8 = var1[var12 + 69];
                  int var9 = e(var6);
                  int var10 = c(var6) + 14;
                  boolean var14 = var9 <= 0;
                  var8.y = var14;
                  var6.y = var14;
                  var7.y = var14;
                  if(!var14) {
                     var8.f = var5 - 22;
                     var7.f = var5 - 8;
                     var6.f = var5;
                     var6.h = d(var6);
                     var5 += var10;
                     var4 += var10;
                  }
               }

               if(var2.w != var4) {
                  var2.w = var4;
                  return;
               }
            } else {
               var4 = 0;
               m var13;
               if((var13 = var1[50 + this.aV]) != null) {
                  var13.f = var3.c();
                  var13.h = d(var13);
                  var4 = c(var13);
               }

               if(var2.w != var4) {
                  var2.w = var4;
                  return;
               }
            }
         } catch (Exception var11) {
            ;
         }

      }
   }

   private boolean Y() {
      int var1 = a == b.a?0:c / 2 - 356;
      int var2 = a == b.a?0:d / 2 - 230;
      return super.av >= var2 + 40 && super.av <= var2 + 80 && super.au >= var1 + 54 && super.au <= var1 + 464;
   }

   private int Z() {
      int var1 = a == b.a?0:c / 2 - 356;
      int var2 = a == b.a?0:d / 2 - 230;
      if(super.av >= var2 + 40 && super.av <= var2 + 80) {
         for(var2 = 0; var2 < 10; ++var2) {
            int var3;
            int var4 = (var3 = 54 + var2 * 40) + 40;
            if(super.au >= var1 + var3 && super.au <= var1 + var4) {
               return var2;
            }
         }
      }

      return -1;
   }

   private void c(int var1, int var2, int var3, int var4, int var5) {
      m[] var6 = m.a[var5];
      boolean var7 = p.b(var5, var6);
      if(a != b.a && !var7) {
         for(int var15 = 0; var15 < var6.length; ++var15) {
            m var8 = var6[var15];
            if(var5 == this.dS) {
               if(var8.e() >= 334 && var8.d() == 512) {
                  var8.m = aE;
                  var8.n = aD;
               } else {
                  int var9 = var8.e;
                  int var10 = var8.f;
                  int var11 = c - 241;
                  int var12 = d - (e?166:38);
                  var3 = var11;
                  var4 = var12;
                  int var13 = var9 + var8.d() / 2;
                  int var14 = var10 + var8.e() / 2;
                  if(var13 > 170) {
                     if(var13 < 340) {
                        var8.k = var9 + (var11 / 2 - 256);
                     } else {
                        var8.k = var9 + (var11 - 512);
                     }
                  }

                  if(var14 > 167) {
                     var8.l = var10 + (var12 - 334);
                  }
               }
            }
         }
      }

      this.a(var1, var2, var3, var4, var6, -1, 0);
   }

   private void a(int var1, int var2, m[] var3) {
      var1 += (int)t.c().getX();
      var2 += (int)t.c().getY();
      int var4 = (int)t.c().getWidth();
      int var5 = (int)t.c().getHeight();
      this.a(var1, var2, var4, var5, var3, -1, 0);
   }

   public final void a(int var1, int var2, int var3, int var4, m[] var5, int var6, int var7) {
      if(var5 != null) {
         int var8 = q.n;
         int var9 = q.l;
         int var10 = q.o;
         int var11 = q.m;
         m var12 = null;
         m var13 = null;
         if(var6 >= 0 && (var12 = m.a(var6)).q >= 0) {
            var13 = m.a(var12.q);
         }

         if(var12 == null || var13 == null || var13.w <= 0) {
            q.b(var2 + var4, var1, var1 + var3, var2);
            u.b();
         }

         for(int var28 = 0; var28 < var5.length; ++var28) {
            m var14;
            if((var14 = var5[var28]) != null && var14.q == var6) {
               if(var14.z) {
                  if(var14.b == 0 && !this.f(var14)) {
                     continue;
                  }
               } else if(var14.y && this.eb != var14.s && this.eq != var14.s && this.ek != var14.s) {
                  continue;
               }

               int var15 = var14.b() + var14.i + var1;
               int var16 = var14.c() + var14.j + var2 - var7;
               if(var14.d > 0) {
                  this.b(var14);
               }

               if(var14.b == 0) {
                  if(var14.p == 174) {
                     this.X();
                  }

                  if(var14.x > var14.w - var14.e()) {
                     var14.x = var14.w - var14.e();
                  }

                  if(var14.x < 0) {
                     var14.x = 0;
                  }

                  this.a(var15, var16, var14.d(), var14.e(), var5, var14.s, var14.x);
                  if(var14.w > var14.e()) {
                     this.a(var14.e(), var14.x, var16, var15 + var14.d(), var14.w);
                  }

                  q.b(var2 + var4, var1, var1 + var3, var2);
                  u.b();
               } else if(var14.b != 1) {
                  int var17;
                  int var18;
                  int var19;
                  int var20;
                  int var21;
                  int var22;
                  int var23;
                  int var24;
                  int var25;
                  if(var14.b == 2) {
                     var17 = 0;

                     for(var18 = 0; var18 < var14.e(); ++var18) {
                        for(var19 = 0; var19 < var14.d(); ++var19) {
                           var20 = var15 + var19 * (32 + var14.I);
                           var21 = var16 + var18 * (32 + var14.J);
                           if(var17 < 20) {
                              var20 += var14.K[var17];
                              var21 += var14.L[var17];
                           }

                           if(var14.A[var17] > 0) {
                              var22 = 0;
                              var23 = 0;
                              var24 = var14.A[var17] - 1;
                              if(var20 > q.n - 32 && var20 < q.o && var21 > q.l - 32 && var21 < q.m || this.eW != 0 && this.eV == var17) {
                                 var25 = 0;
                                 if(this.hR == 1 && this.hS == var17 && this.hT == var14.s) {
                                    var25 = 16777215;
                                 }

                                 n var26;
                                 if((var26 = i.a(var24, var14.B[var17], var25)) != null) {
                                    if(var12 != null && this.eW != 0 && this.eV == var17 && this.eU == var14.s) {
                                       var22 = super.au - this.eX;
                                       var23 = super.av - this.eY;
                                       if(var22 < 5 && var22 > -5) {
                                          var22 = 0;
                                       }

                                       if(var23 < 5 && var23 > -5) {
                                          var23 = 0;
                                       }

                                       if(this.dt < 5) {
                                          var22 = 0;
                                          var23 = 0;
                                       }

                                       if(var14.p != 174 || !this.Y()) {
                                          if(var21 + var23 < q.l && var12.x > 0) {
                                             if((var25 = this.cM * (q.l - var21 - var23) / 3) > this.cM * 10) {
                                                var25 = this.cM * 10;
                                             }

                                             if(var25 > var12.x) {
                                                var25 = var12.x;
                                             }

                                             var12.x -= var25;
                                             this.eY += var25;
                                          }

                                          if(var21 + var23 + 32 > q.m && var12.x < var12.w - var12.e()) {
                                             if((var25 = this.cM * (var21 + var23 + 32 - q.m) / 3) > this.cM * 10) {
                                                var25 = this.cM * 10;
                                             }

                                             if(var25 > var12.w - var12.e() - var12.x) {
                                                var25 = var12.w - var12.e() - var12.x;
                                             }

                                             var12.x += var25;
                                             this.eY -= var25;
                                          }
                                       }

                                       q.b(var11, var8, var10, var9);
                                       var26.c(var20 + var22, var21 + var23);
                                       q.b(var2 + var4, var1, var1 + var3, var2);
                                    } else if(this.he != 0 && this.hd == var17 && this.hc == var14.s) {
                                       var26.c(var20, var21);
                                    } else {
                                       var26.d(var20, var21);
                                    }

                                    if(var14.H && (var26.g == 33 || var14.B[var17] != 1)) {
                                       int var27 = var14.B[var17];
                                       this.ag.b(0, i.b(var27), var21 + 10 + var23, var20 + 1 + var22);
                                       this.ag.b(i.d(var27), i.b(var27), var21 + 9 + var23, var20 + var22);
                                    }
                                 }
                              }
                           } else {
                              n var36;
                              if(var14.M != null && var17 < 20 && (var36 = var14.M[var17]) != null) {
                                 var36.d(var20, var21);
                              }
                           }

                           ++var17;
                        }
                     }
                  } else if(var14.b == 3) {
                     boolean var29 = false;
                     if(this.ek == var14.s || this.eq == var14.s || this.eb == var14.s) {
                        var29 = true;
                     }

                     if(this.f(var14)) {
                        var18 = var14.Y;
                        if(var29 && var14.aa != 0) {
                           var18 = var14.aa;
                        }
                     } else {
                        var18 = var14.X;
                        if(var29 && var14.Z != 0) {
                           var18 = var14.Z;
                        }
                     }

                     if(var14.o == 0) {
                        if(var14.O) {
                           q.b(var14.e(), var16, var15, var18, var14.d());
                        } else {
                           q.c(var15, var14.d(), var14.e(), var18, var16);
                        }
                     } else if(var14.O) {
                        q.a(var18, var16, var14.d(), var14.e(), 256 - (var14.o & 255), var15);
                     } else {
                        q.b(var16, var14.e(), 256 - (var14.o & 255), var18, var14.d(), var15);
                     }
                  } else {
                     q var30;
                     String var33;
                     String var45;
                     if(var14.b == 4) {
                        var30 = var14.a();
                        var33 = var14.V;
                        boolean var32 = false;
                        if(this.ek == var14.s || this.eq == var14.s || this.eb == var14.s) {
                           var32 = true;
                        }

                        if(this.f(var14)) {
                           var20 = var14.Y;
                           if(var32 && var14.aa != 0) {
                              var20 = var14.aa;
                           }

                           if(var14.W.length() > 0) {
                              var33 = var14.W;
                           }
                        } else {
                           var20 = var14.X;
                           if(var32 && var14.Z != 0) {
                              var20 = var14.Z;
                           }
                        }

                        if(var14.c == 6 && this.fT) {
                           var33 = "Please wait...";
                           var20 = var14.X;
                        }

                        if((this.aj != -1 || this.el != -1 || var14.V.toLowerCase().contains("click here to continue")) && (var14.p == this.aj || var14.p == this.el)) {
                           if(var20 == 16776960) {
                              var20 = 255;
                           }

                           if(var20 == '\uc000') {
                              var20 = 16777215;
                           }
                        }

                        var33 = d(var33);
                        var33 = this.a(var14, var33);
                        if(var14.P == 1) {
                           var33 = b(var33);
                           if(var30 instanceof l) {
                              ((l)var30).a(var33, var15, var16, var14.d(), var14.e(), var20, var14.R?0:-1, var14.S, var14.T, var14.U);
                           }
                        } else {
                           var21 = 0;
                           if(var30 instanceof o) {
                              var21 = ((o)var30).a;
                           } else if(var30 instanceof l) {
                              var21 = ((l)var30).a;
                           }

                           for(var22 = var16 + var21; var33.length() > 0; var22 += var21) {
                              var23 = var33.indexOf("\\n");
                              var24 = var33.indexOf("<br>");
                              if(var23 != -1) {
                                 var45 = var33.substring(0, var23);
                                 var33 = var33.substring(var23 + 2);
                              } else if(var24 != -1) {
                                 var45 = var33.substring(0, var24);
                                 var33 = var33.substring(var24 + 4);
                              } else {
                                 var45 = var33;
                                 var33 = "";
                              }

                              if(var14.Q) {
                                 if(var30 instanceof o) {
                                    ((o)var30).a(var20, var15 + var14.d() / 2, var45, var22, var14.R);
                                 } else if(var30 instanceof l) {
                                    ((l)var30).b(var45, var15 + var14.d() / 2, var22, var20, var14.R?0:-1);
                                 }
                              } else if(var30 instanceof o) {
                                 ((o)var30).a(var14.R, var15, var20, var45, var22);
                              } else if(var30 instanceof l) {
                                 ((l)var30).a(var45, var15, var22, var20, var14.R?0:-1);
                              }
                           }
                        }
                     } else if(var14.b == 5) {
                        n var31;
                        if((var31 = var14.a(this.f(var14))) != null) {
                           if(this.fM == 1 && var14.s == eZ && eZ != 0) {
                              var31.c(var15, var16, 16777215);
                           } else {
                              var18 = var31.g;
                              var19 = var31.h;
                              if(var14.au) {
                                 q.b(var14.h + var16, var15, var15 + var14.g, var16);
                                 var20 = (var14.h + var19 - 1) / var19;
                                 var21 = (var18 + var14.g - 1) / var18;

                                 for(var22 = 0; var22 < var21; ++var22) {
                                    for(var23 = 0; var23 < var20; ++var23) {
                                       if(var14.aw == 0 && var14.av != 0) {
                                          var31.c(var15 + var18 * var22, var16 + var19 * var23, 256 - (var14.av & 255));
                                       } else {
                                          var31.d(var15 + var18 * var22, var16 + var19 * var23);
                                       }
                                    }
                                 }

                                 q.b(var2 + var4, var1, var1 + var3, var2);
                              } else if(var14.av == 0) {
                                 var31.d(var15, var16);
                              } else {
                                 var31.c(var15, var16, 256 - (var14.av & 255));
                              }
                           }
                        }
                     } else if(var14.b == 6) {
                        var17 = u.e;
                        var18 = u.f;
                        u.a(var15 + var14.aB + var14.d() / 2, var16 + var14.aC + var14.e() / 2);
                        var19 = u.h[var14.ai] * var14.ah >> 16;
                        var20 = u.r[var14.ai] * var14.ah >> 16;
                        boolean var35;
                        if(var35 = this.f(var14)) {
                           var22 = var14.ag;
                        } else {
                           var22 = var14.af;
                        }

                        F var39 = null;
                        var24 = 0;
                        if(var14.ax != -1 && var14.ax != '\uffff') {
                           i var48;
                           if((var48 = i.a(var14.ax)) != null && (var39 = var48.e(var14.ay).b()) != null) {
                              var39.c();
                              var24 = var39.aD / 2;
                           }
                        } else if(var14.ad != 5) {
                           if(var22 == -1) {
                              var39 = var14.a((uwotm8.d)null, var35);
                           } else {
                              uwotm8.d var47 = uwotm8.d.a[var22];
                              var39 = var14.a(var47, var35);
                           }
                        } else if(var14.ae != 0) {
                           var39 = M.a();
                        } else {
                           var39 = this.H();
                        }

                        if(var39 != null && (var16 >= q.l || var7 == 0)) {
                           if(!var14.at) {
                              var39.a(var14.aj, 0, var14.ai, 0, var19, var20);
                           } else if(!var14.aE) {
                              var39.a(var14.aj, var14.aD, var14.ai, var14.az, var19 + var24 + var14.aA, var20 + var14.aA);
                           } else {
                              var39.a(var14.aj, var14.aD, var14.ai, var14.az, var19 + var24 + var14.aA, var20 + var14.aA, var14.ah);
                           }
                        }

                        u.e = var17;
                        u.f = var18;
                     } else if(var14.b == 7) {
                        var30 = var14.a();
                        var18 = 0;

                        for(var19 = 0; var19 < var14.d(); ++var19) {
                           for(var20 = 0; var20 < var14.e(); ++var20) {
                              if(var14.A[var18] > 0) {
                                 i var37;
                                 String var42 = (var37 = i.a(var14.A[var18] - 1)).p;
                                 if(var37.t || var14.B[var18] != 1) {
                                    var42 = var42 + " x" + i.c(var14.B[var18]);
                                 }

                                 var23 = var15 + var19 * (115 + var14.I);
                                 var24 = var16 + var20 * (12 + var14.J);
                                 if(var14.P == 1) {
                                    if(var30 instanceof l) {
                                       l var49 = (l)var30;
                                       if(var14.S == 0) {
                                          var49.a(var42, var23, var24, var14.X, var14.R?0:-1);
                                       } else if(var14.S == 1) {
                                          var49.b(var42, var23 + var14.d() / 2, var24, var14.X, var14.R?0:-1);
                                       } else {
                                          var49.c(var42, var23 + var14.d() - 1, var24, var14.X, var14.R?0:-1);
                                       }
                                    }
                                 } else if(var14.Q) {
                                    if(var30 instanceof o) {
                                       ((o)var30).a(var14.X, var23 + var14.d() / 2, var42, var24, var14.R);
                                    } else if(var30 instanceof l) {
                                       ((l)var30).b(var42, var23 + var14.d() / 2, var24, var14.X, var14.R?0:-1);
                                    }
                                 } else if(var30 instanceof o) {
                                    ((o)var30).a(var14.R, var23, var14.X, var42, var24);
                                 } else if(var30 instanceof l) {
                                    ((l)var30).a(var42, var23, var24, var14.X, var14.R?0:-1);
                                 }
                              }

                              ++var18;
                           }
                        }
                     } else if(var14.b == 8 && (this.ic == var14.s || this.hZ == var14.s || this.ia == var14.s) && this.id == 0 && !this.bX) {
                        var17 = 0;
                        var18 = 0;
                        o var34 = this.hz;
                        String var43 = var14.V;
                        if(this.f(var14) && var14.W.length() > 0) {
                           var43 = var14.W;
                        }

                        for(String var38 = var43 = this.a(var14, var43); var38.length() > 0; var18 += var34.a + 1) {
                           var22 = var38.indexOf("\\n");
                           var23 = var38.indexOf("<br>");
                           String var40;
                           if(var22 != -1) {
                              var40 = var38.substring(0, var22);
                              var38 = var38.substring(var22 + 2);
                           } else if(var23 != -1) {
                              var40 = var38.substring(0, var23);
                              var38 = var38.substring(var23 + 4);
                           } else {
                              var40 = var38;
                              var38 = "";
                           }

                           if((var25 = var34.a(var40)) > var17) {
                              var17 = var25;
                           }
                        }

                        var17 += 6;
                        var18 += 7;
                        var21 = var15;
                        var22 = var16 + var14.e() + 2;
                        if(var15 + var17 > var1 + var3) {
                           var21 = var1 + var3 - var17;
                        }

                        if(var21 < var1) {
                           var21 = var1;
                        }

                        if(var22 + var18 > var2 + var4) {
                           var22 = var2 + var4 - var18;
                        }

                        if(var22 < var16 && var22 + var18 > var16) {
                           var22 = var16 - var18 - 2;
                        }

                        if(var22 > var16 && var22 < var16 + var14.e()) {
                           var22 = var16 - var18 - 2;
                        }

                        if(var22 < var2) {
                           var22 = var2;
                        }

                        if(var22 + var18 >= d) {
                           var22 = d - var18;
                        }

                        q.b(var18, var22, var21, 16777120, var17);
                        q.c(var21, var17, var18, 0, var22);
                        String var46 = this.a(var14, var43);

                        for(var24 = var22 + var34.a + 2; var46.length() > 0; var24 += var34.a + 1) {
                           var25 = var46.indexOf("\\n");
                           int var41 = var46.indexOf("<br>");
                           String var44;
                           if(var25 != -1) {
                              var44 = var46.substring(0, var25);
                              var46 = var46.substring(var25 + 2);
                           } else if(var41 != -1) {
                              var44 = var46.substring(0, var41);
                              var46 = var46.substring(var41 + 4);
                           } else {
                              var44 = var46;
                              var46 = "";
                           }

                           if(var14.Q) {
                              var34.a(0, var21 + var14.d() / 2, var44, var24, false);
                           } else if(var44.contains("\\r")) {
                              var45 = var44.substring(0, var44.indexOf("\\r"));
                              var33 = var44.substring(var44.indexOf("\\r") + 2);
                              var34.a(false, var21 + 3, 0, var45, var24);
                              var20 = var17 + var21 - var34.a(var33) - 2;
                              var34.a(false, var20, 0, var33, var24);
                           } else {
                              var34.a(false, var21 + 3, 0, var44, var24);
                           }
                        }
                     }
                  }
               }

               if(aT && (var14.b != 5 || var14.b == 5 && var14.c > 0)) {
                  this.hz.a(true, var15, 16777215, "Child ".concat(String.valueOf(var28)), var16 + 16);
                  if(var14.b != 3 && var14.b != 4 || var14.b == 4 && var14.c > 0) {
                     q.b(var16, var14.e(), 256, 16777215, var14.d(), var15);
                  }
               }

               var14.k = var14.l = -1;
               var14.m = var14.n = -1;
            }
         }

         q.b(var11, var8, var10, var9);
      }
   }

   public final void a(int var1, int var2) {
      if(aE.n && (super.aB == 5 || super.aC && super.aB == 5) && R) {
         int var3 = aE.f;
         if(aE.f <= 0) {
            var3 = 1;
         }

         if(var3 > 10) {
            var3 = 10;
         }

         this.gw += var1 * var3;
         this.gx += var2 << 1;
      }
   }

   private void aa() {
      try {
         int var1 = M.V;
         int var2 = M.W;
         if(this.dO - var1 < -500 || this.dO - var1 > 500 || this.dP - var2 < -500 || this.dP - var2 > 500) {
            this.dO = var1;
            this.dP = var2;
         }

         if(this.dO != var1) {
            this.dO += (var1 - this.dO) / 16;
         }

         if(this.dP != var2) {
            this.dP += (var2 - this.dP) / 16;
         }

         if(super.az[1] == 1) {
            this.gw += (-24 - this.gw) / 2;
         } else if(super.az[2] == 1) {
            this.gw += (24 - this.gw) / 2;
         } else {
            this.gw /= 2;
         }

         if(super.az[3] == 1) {
            this.gx += (12 - this.gx) / 2;
         } else if(super.az[4] == 1) {
            this.gx += (-12 - this.gx) / 2;
         } else {
            this.gx /= 2;
         }

         this.W = this.W + this.gw / 2 & 2047;
         this.gv += this.gx / 2;
         if(this.gv < 128) {
            this.gv = 128;
         }

         if(this.gv > 383) {
            this.gv = 383;
         }

         var1 = this.dO >> 7;
         var2 = this.dP >> 7;
         int var3 = this.b(this.ct, this.dP, this.dO);
         int var4 = 0;
         int var5;
         if(var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for(var5 = var1 - 4; var5 <= var1 + 4; ++var5) {
               for(int var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
                  int var7 = this.ct;
                  if(this.ct < 3 && (this.ho[1][var5][var6] & 2) == 2) {
                     ++var7;
                  }

                  if((var7 = var3 - this.gI[var7][var5][var6]) > var4) {
                     var4 = var7;
                  }
               }
            }
         }

         if(++dG > 1512) {
            dG = 0;
            this.gz.a(77);
            this.gz.b(0);
            var5 = this.gz.b;
            this.gz.b((int)(Math.random() * 256.0D));
            this.gz.b(101);
            this.gz.b(233);
            this.gz.c('\ub024');
            if((int)(Math.random() * 2.0D) == 0) {
               this.gz.c('\u8bc8');
            }

            this.gz.b((int)(Math.random() * 256.0D));
            this.gz.b(64);
            this.gz.b(38);
            this.gz.c((int)(Math.random() * 65536.0D));
            this.gz.c((int)(Math.random() * 65536.0D));
            this.gz.e(this.gz.b - var5);
         }

         if((var5 = var4 * 192) > 98048) {
            var5 = 98048;
         }

         if(var5 < '\u8000') {
            var5 = '\u8000';
         }

         if(var5 > this.do) {
            this.do += (var5 - this.do) / 24;
         } else if(var5 < this.do) {
            this.do += (var5 - this.do) / 80;
         }
      } catch (Exception var8) {
         ao.b("glfc_ex " + M.V + "," + M.W + "," + this.dO + "," + this.dP + "," + this.eF + "," + this.eG + "," + this.ef + "," + this.eg);
         throw new RuntimeException("eek");
      }
   }

   public final void i() {
      if(this.cx) {
         Graphics var2;
         (var2 = this.g().getGraphics()).setColor(Color.black);
         var2.fillRect(0, 0, 765, 503);
         this.l();
         if(this.cx) {
            this.bl = false;
            var2.setFont(new Font("Helvetica", 1, 16));
            var2.setColor(Color.yellow);
            var2.drawString("Sorry, an error has occured whilst loading /v/scape", 30, 35);
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, 85);
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
            var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
            var2.drawString("3: Try using a different game-world", 30, 195);
            var2.drawString("4: Try rebooting your computer", 30, 225);
            var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
         }

      } else {
         if(!R) {
            this.ae();
         } else {
            this.W();
         }

         this.gH = 0;
      }
   }

   private boolean f(String var1) {
      if(var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.cj; ++var2) {
            if(var1.equalsIgnoreCase(this.eS[var2])) {
               return true;
            }
         }

         return var1.equalsIgnoreCase(M.ai);
      }
   }

   private static String g(int var0, int var1) {
      return (var0 -= var1) < -9?"@red@":(var0 < -6?"@or3@":(var0 < -3?"@or2@":(var0 < 0?"@or1@":(var0 > 9?"@gre@":(var0 > 6?"@gr3@":(var0 > 3?"@gr2@":(var0 > 0?"@gr1@":"@yel@")))))));
   }

   public final long j() {
      long var1 = 0L;

      for(int var3 = 0; var3 < 25; ++var3) {
         var1 += (long)this.bJ[var3];
      }

      return var1;
   }

   private void c(long var1) {
      if(var1 != 0L) {
         try {
            if(this.bg >= 100) {
               this.a("Your ignore list is full. Max of 100 hit", "", true);
            } else {
               String var3 = aC.c(aC.a(var1));

               int var4;
               for(var4 = 0; var4 < this.bg; ++var4) {
                  if(this.cw[var4] == var1) {
                     this.a(var3 + " is already on your ignore list", "", true);
                     return;
                  }
               }

               for(var4 = 0; var4 < this.cj; ++var4) {
                  if(this.cU[var4] == var1) {
                     this.a("Please remove " + var3 + " from your friend list first", "", true);
                     return;
                  }
               }

               if(!var3.equals(M.ai)) {
                  this.cw[this.bg++] = var1;
                  Q = true;
                  this.gz.a(133);
                  this.gz.a(var1);
               }
            }
         } catch (RuntimeException var5) {
            ao.b("45688, " + var1 + ", 4, " + var5.toString());
            throw new RuntimeException();
         }
      }
   }

   private void ab() {
      for(int var1 = -1; var1 < this.cd; ++var1) {
         int var2;
         if(var1 == -1) {
            var2 = 2047;
         } else {
            var2 = this.ce[var1];
         }

         A var3;
         if((var3 = this.cc[var2]) != null) {
            this.a((w)var3);
         }
      }

   }

   private void ac() {
      if(this.dW == 2) {
         for(ab var1 = (ab)this.gr.b(); var1 != null; var1 = (ab)this.gr.d()) {
            if(var1.d > 0) {
               --var1.d;
            }

            if(var1.d == 0) {
               if(var1.i < 0 || U.a(var1.i, var1.k)) {
                  this.a(var1.h, var1.e, var1.j, var1.k, var1.g, var1.f, var1.i);
                  var1.E();
               }
            } else {
               if(var1.l > 0) {
                  --var1.l;
               }

               if(var1.l == 0 && var1.g > 0 && var1.h > 0 && var1.g <= 102 && var1.h <= 102 && (var1.a < 0 || U.a(var1.a, var1.c))) {
                  this.a(var1.h, var1.e, var1.b, var1.c, var1.g, var1.f, var1.a);
                  var1.l = -1;
                  if(var1.a == var1.i && var1.i == -1) {
                     var1.E();
                  } else if(var1.a == var1.i && var1.b == var1.j && var1.c == var1.k) {
                     var1.E();
                  }
               }
            }
         }
      }

   }

   private void ad() {
      int var1 = this.hA.a("Choose option");

      int var2;
      int var3;
      for(var2 = 0; var2 < this.O; ++var2) {
         if((var3 = this.hH.a(b(this.Y[var2]))) > var1) {
            var1 = var3;
         }
      }

      var1 += 8;
      var2 = 15 * this.O + 21;
      if(super.ax > 0 && super.ay > 0 && super.ax < c && super.ay < d) {
         if((var3 = super.ax - var1 / 2) + var1 > c - 4) {
            var3 = c - 4 - var1;
         }

         if(var3 < 0) {
            var3 = 0;
         }

         int var4 = super.ay;
         if(super.ay + var2 > d - 6) {
            var4 = d - 6 - var2;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         this.bX = true;
         this.cO = var3;
         this.cP = var4;
         this.cQ = var1;
         this.cR = 15 * this.O + 22;
      }

   }

   private boolean h(int var1, int var2) {
      boolean var3 = false;
      m[] var7 = m.a[var2];

      for(int var4 = 0; var4 < var7.length; ++var4) {
         m var5;
         if((var5 = var7[var4]) != null && var5.b == 6 && (var5.af != -1 || var5.ag != -1)) {
            int var6;
            if(this.f(var5)) {
               var6 = var5.ag;
            } else {
               var6 = var5.af;
            }

            if(var6 != -1) {
               uwotm8.d var8 = uwotm8.d.a[var6];

               for(var5.ao += var1; var5.ao > var8.a(var5.ap); var3 = true) {
                  var5.ao -= var8.a(var5.ap) + 1;
                  ++var5.ap;
                  if(var5.ap >= var8.b) {
                     var5.ap -= var8.e;
                     ++var5.aq;
                     if(var5.ap < 0 || var5.ap >= var8.b) {
                        var5.ap = 0;
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   private void d(long var1) {
      if(var1 != 0L) {
         try {
            for(int var3 = 0; var3 < this.bg; ++var3) {
               if(this.cw[var3] == var1) {
                  --this.bg;
                  Q = true;
                  System.arraycopy(this.cw, var3 + 1, this.cw, var3, this.bg - var3);
                  this.gz.a(74);
                  this.gz.a(var1);
                  return;
               }
            }

         } catch (RuntimeException var4) {
            ao.b("47229, 3, " + var1 + ", " + var4.toString());
            throw new RuntimeException();
         }
      }
   }

   private void a(long var1, int var3) {
      if(var1 != 0L) {
         if(var3 >= 0) {
            try {
               this.gz.a(62);
               this.gz.a(var1);
               this.gz.c(var3);
            } catch (RuntimeException var4) {
               ao.b("47229, 3, " + var1 + ", " + var4.toString());
               throw new RuntimeException();
            }
         }
      }
   }

   public String getParameter(String var1) {
      Applet var10000 = ao.e;
      return super.getParameter(var1);
   }

   private int a(m var1, int var2) {
      if(var1.v != null && var2 < var1.v.length) {
         try {
            int[] var12 = var1.v[var2];
            var2 = 0;
            int var3 = 0;
            byte var4 = 0;

            while(true) {
               int var5 = var12[var3++];
               int var6 = 0;
               byte var7 = 0;
               if(var5 == 0) {
                  return var2;
               }

               if(var5 == 1) {
                  var6 = this.cu[var12[var3++]];
               }

               if(var5 == 2) {
                  var6 = this.em[var12[var3++]];
               }

               if(var5 == 3) {
                  var6 = this.bJ[var12[var3++]];
               }

               int var8;
               int var9;
               int var10;
               if(var5 == 4) {
                  var8 = var12[var3++];
                  var9 = var12[var3++];
                  m var13 = m.a(var8);
                  if(var9 >= 0 && var9 < i.G && (!i.a(var9).h || da)) {
                     for(var10 = 0; var10 < var13.A.length; ++var10) {
                        if(var13.A[var10] == var9 + 1) {
                           var6 += var13.B[var10];
                        }
                     }
                  }
               }

               if(var5 == 5) {
                  var6 = this.B[var12[var3++]];
               }

               if(var5 == 6) {
                  var6 = dU[this.em[var12[var3++]] - 1];
               }

               if(var5 == 7) {
                  var6 = this.B[var12[var3++]] * 100 / '\ub71b';
               }

               if(var5 == 8) {
                  var6 = M.ak;
               }

               if(var5 == 9) {
                  for(var8 = 0; var8 < 25; ++var8) {
                     if(aA.b[var8]) {
                        var6 += this.em[var8];
                     }
                  }
               }

               if(var5 == 10) {
                  m var14 = m.a(var12[var3++]);
                  if((var8 = var12[var3++] + 1) >= 0 && var8 < i.G && da) {
                     for(var10 = 0; var10 < var14.A.length; ++var10) {
                        if(var14.A[var10] == var8) {
                           var6 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var5 == 11) {
                  var6 = this.fS;
               }

               if(var5 == 12) {
                  var6 = this.bS;
               }

               if(var5 == 13) {
                  var8 = this.B[var12[var3++]];
                  var9 = var12[var3++];
                  var6 = (var8 & 1 << var9) == 0?0:1;
               }

               if(var5 == 14) {
                  var8 = var12[var3++];
                  am var15;
                  var8 = (var15 = am.a[var8]).b;
                  var10 = var15.c;
                  var6 = var15.d;
                  var6 = ae[var6 - var10];
                  var6 &= this.B[var8] >> var10;
               }

               if(var5 == 15) {
                  var7 = 1;
               }

               if(var5 == 16) {
                  var7 = 2;
               }

               if(var5 == 17) {
                  var7 = 3;
               }

               if(var5 == 18) {
                  var6 = (M.V >> 7) + this.ef;
               }

               if(var5 == 19) {
                  var6 = (M.W >> 7) + this.eg;
               }

               if(var5 == 20) {
                  var6 = var12[var3++];
               }

               if(var7 == 0) {
                  if(var4 == 0) {
                     var2 += var6;
                  }

                  if(var4 == 1) {
                     var2 -= var6;
                  }

                  if(var4 == 2 && var6 != 0) {
                     var2 /= var6;
                  }

                  if(var4 == 3) {
                     var2 *= var6;
                  }

                  var4 = 0;
               } else {
                  var4 = var7;
               }
            }
         } catch (Exception var11) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   private void a(n var1, int var2, int var3) {
      int var4;
      if((var4 = var3 * var3 + var2 * var2) > 4225 && var4 < 90000) {
         int var8 = this.W & 2047;
         var4 = F.D[var8];
         var8 = F.E[var8];
         var4 = (var4 << 8) / 256;
         var8 = (var8 << 8) / 256;
         int var5 = var2 * var4 + var3 * var8 >> 16;
         var8 = var2 * var8 - var3 * var4 >> 16;
         double var6;
         var8 = (int)(Math.sin(var6 = Math.atan2((double)var5, (double)var8)) * 58.0D);
         var2 = (int)(Math.cos(var6) * 52.0D);
         Point var9;
         var4 = (var9 = t.b(false)).x + t.d().x + 68;
         var3 = var9.y + t.d().y + 83;
         this.dC.a(var3 - var2 - 20, var6, var4 + var8 + 4 - 10);
      } else {
         this.b(var1, var3, var2);
      }
   }

   private void b(n var1, int var2, int var3) {
      if(var1 != null) {
         int var4 = this.W & 2047;
         if(var1.c + var1.d + var2 * var2 + var3 * var3 <= 6400) {
            int var5 = F.D[var4];
            var4 = F.E[var4];
            var5 = (var5 << 8) / 256;
            var4 = (var4 << 8) / 256;
            int var6 = var3 * var5 + var2 * var4 >> 16;
            var2 = var3 * var4 - var2 * var5 >> 16;
            Point var7;
            var4 = (var7 = t.b(false)).x + t.d().x + 69;
            var3 = var7.y + t.d().y + 78;
            var1.d(var4 + var6 - var1.g / 2 + 4, var3 - var2 - var1.h / 2 - 4);
         }
      }
   }

   private void a(w var1, int var2) {
      this.f(var1.V, var2, var1.W);
   }

   private void f(int var1, int var2, int var3) {
      if(var1 >= 128 && var3 >= 128 && var1 <= 13056 && var3 <= 13056) {
         var2 = this.b(this.ct, var3, var1) - var2;
         var1 -= this.bD;
         var2 -= this.bE;
         var3 -= this.bF;
         int var4 = F.D[this.bG];
         int var5 = F.E[this.bG];
         int var6 = F.D[this.bH];
         int var7 = F.E[this.bH];
         int var8 = var3 * var6 + var1 * var7 >> 16;
         var3 = var3 * var7 - var1 * var6 >> 16;
         var1 = var8;
         var8 = var2 * var5 - var3 * var4 >> 16;
         var3 = var2 * var4 + var3 * var5 >> 16;
         if(var3 >= 50) {
            this.db = u.e + (var1 << l) / var3;
            this.dc = u.f + (var8 << l) / var3;
         } else {
            this.db = -1;
            this.dc = -1;
         }
      } else {
         this.db = -1;
         this.dc = -1;
      }
   }

   private static int m(int var0) {
      return var0 >= 75?'\uff00':(var0 >= 50 && var0 <= 74?16776960:(var0 >= 25 && var0 <= 49?16750623:16711680));
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      ab var10 = null;

      for(ab var11 = (ab)this.gr.b(); var11 != null; var11 = (ab)this.gr.d()) {
         if(var11.e == var7 && var11.g == var8 && var11.h == var5 && var11.f == var4) {
            var10 = var11;
            break;
         }
      }

      if(var10 == null) {
         (var10 = new ab()).e = var7;
         var10.f = var4;
         var10.g = var8;
         var10.h = var5;
         this.a(var10);
         this.gr.a(var10);
      }

      var10.a = var2;
      var10.c = var6;
      var10.b = var3;
      var10.l = var9;
      var10.d = var1;
   }

   private boolean f(m var1) {
      if(var1.t == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.t.length; ++var2) {
            int var3 = this.a(var1, var2);
            int var4 = var1.u[var2];
            if(var1.t[var2] == 2) {
               if(var3 >= var4) {
                  return false;
               }
            } else if(var1.t[var2] == 3) {
               if(var3 <= var4) {
                  return false;
               }
            } else if(var1.t[var2] == 4) {
               if(var3 == var4) {
                  return false;
               }
            } else if(var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private DataInputStream g(String var1) {
      if(this.bm != null) {
         try {
            this.bm.close();
         } catch (Exception var3) {
            ;
         }

         this.bm = null;
      }

      this.bm = a('\uaa4b');
      this.bm.setSoTimeout(10000);
      InputStream var2 = this.bm.getInputStream();
      this.bm.getOutputStream().write(("JAGGRAB /" + var1 + "\n\n").getBytes());
      return new DataInputStream(var2);
   }

   private void i(int var1, int var2) {
      if(this.aQ != null && !this.aQ.isEmpty()) {
         int var3 = this.hH.a(this.aQ) + 8;
         int var4 = this.hH.a + 8 + 2;
         if(var1 + var3 > c) {
            var1 = c - var3;
         }

         if(var1 < 0) {
            var1 = 0;
         }

         if(var2 > d) {
            var2 = d;
         }

         if(var2 < var4) {
            var2 = var4;
         }

         q.a(0, var2 - var4, var3, var4, 200, var1);
         this.hH.a(this.aQ, var1 + 4, var2 - 4 - 2, 16777215, 0);
      }
   }

   private void ae() {
      this.L();
      this.ft.a();
      int var1 = c / 2;
      int var2 = d / 2;
      if(this.bd != null) {
         this.bd.d(0, 0);
      }

      boolean var3 = this.b(c - 52, 10, 42, 42);
      aH.a("login", "settings", var3?(this.bn == 2?2:1):(this.bn == 2?1:0)).d(c - 52, 10);
      if(!aS) {
         if(P) {
            aH.a("login", 4).d(c - 104, 10);
         } else {
            aH.a("login", 5).d(c - 104, 10);
         }
      }

      int var5;
      boolean var6;
      int var7;
      int var10;
      if(this.bn != 0 && this.bn != 1) {
         if(this.bn == 2) {
            var7 = var1 - 145;
            this.hK.b("SETTINGS", var1, 64, 16777215, 0);
            Rectangle var8 = new Rectangle(var1 - 138, 88, 276, 216);
            q.a(0, var8.y, var8.width, var8.height, 100, var8.x);
            this.hK.b("UI", (int)var8.getCenterX(), var8.y + 26, 16777215, 0);
            var5 = var8.y + 30;
            var6 = aL.b(aM.a);
            aH.a("login", "settings", !var6 && !this.b((int)var8.getCenterX() - 132, var5, 128, 96)?3:4).d((int)var8.getCenterX() - 132, var5);
            this.hJ.b("2007", (int)var8.getCenterX() - 68, var5 + 112, var6?16776960:16777215, 0);
            var6 = aL.b(aM.b);
            aH.a("login", "settings", !var6 && !this.b((int)var8.getCenterX() + 4, var5, 128, 96)?5:6).d((int)var8.getCenterX() + 4, var5);
            this.hJ.b("Pre-2007", (int)var8.getCenterX() + 68, var5 + 112, var6?16776960:16777215, 0);
            this.hH.a("Pixel Scaling", var7 + 100, 256, 15970623, 0);

            for(var1 = 4; var1 > 0; --var1) {
               var2 = (int)var8.getCenterX() - 64 + (var1 - 1 << 5);
               var7 = 64 + (int)var8.getHeight() - 16;
               boolean var9 = ai() >= var1 * 503;
               aH.a("sliders", var1 - 1 + (b == var1?4:0)).d(var2, var7);
               var10 = this.hH.a(Character.getNumericValue((char)var1));
               this.hH.a(var1 + "x", var2 + 16 - var10, var7 + 32, b == var1?16776960:(var9?16777215:3289650), 0);
               if(this.b(var2, var7, 32, 32) && !var9) {
                  this.a(var2 + 8, var7 + 24, "Your display does\nnot support this\nlevel of scaling.");
               }
            }
         }
      } else {
         this.bc.d(var1 - this.bc.c / 2, 24);
         var7 = var1 - 145;
         var2 -= 135;
         aH.a("login", "login_box", 0).a(var7, var2, 256);
         int var4;
         if(this.bn == 0) {
            this.hH.b("Login", var1, var2 + 42, 15970623, 0);
            var4 = this.b(var7 + 35, var2 + 68, 218, 27)?2:1;
            var5 = this.b(var7 + 35, var2 + 114, 218, 27)?2:1;
            this.ai.a("Username:", var7 + 36, var2 + 66, 15458492, 0);
            aH.a("login", "login_box", var4).d(var7 + 35, var2 + 68);
            this.ai.a("Password:", var7 + 36, var2 + 112, 15458492, 0);
            aH.a("login", "login_box", var5).d(var7 + 35, var2 + 114);
            this.hH.a(T + (this.gK == 0 & S % 40 < 20?"|":""), var7 + 40, var2 + 87, 15970623, 0);
            this.hH.a(aC.d(U) + (this.gK == 1 & S % 40 < 20?"|":""), var7 + 40, var2 + 135, 15970623, 0);
            String var10000;
            int var10001;
            if(V) {
               var10000 = "login";
               var10001 = 2;
            } else {
               var6 = this.b(var7 + 35, var2 + 150, 106, 13);
               var10000 = "login";
               var10001 = var6?3:1;
            }

            aH.a(var10000, var10001).d(var7 + 35, var2 + 150);
            this.hH.a("Remember Me", var7 + 52, var2 + 161, 15970623, 0);
            var10 = this.b(var7 + 55, var2 + 174, 179, 25)?4:3;
            aH.a("login", "login_box", var10).d(var7 + 55, var2 + 174);
            this.ai.b("Log In", var1, var2 + 191, 0, -1);
         } else if(this.bn == 1) {
            this.hH.b("Authenticator", var1, var2 + 42, 15970623, 0);
            this.hH.a("Enter the 6-digit code generated by your authenticator app.", var7 + 34, var2 + 60, 228, 32, 15458492, 0, 0, 0, 16);
            var4 = this.b(var7 + 35, var2 + 105, 218, 27)?2:1;
            var5 = this.b(var1 - 57, var2 + 145, 114, 25)?6:5;
            var10 = this.b(var1 - 57, var2 + 178, 114, 25)?6:5;
            aH.a("login", "login_box", var4).d(var7 + 35, var2 + 105);
            aH.a("login", "login_box", var5).d(var1 - 57, var2 + 145);
            aH.a("login", "login_box", var10).d(var1 - 57, var2 + 178);
            this.ai.b("Verify", var1, var2 + 162, 0, -1);
            this.ai.b("Cancel", var1, var2 + 195, 0, -1);
            this.hH.b(aC.d(gl) + (this.gK == 0 & S % 40 < 20?"|":""), var1, var2 + 124, 15970623, 0);
         }

         q.c(var2 + 207, 0, 215, var7 + 35);
         this.hH.b(this.hv, var1, var2 + 226, 15970623, 0);
         this.hH.b(this.hw, var1, var2 + 247, 15970623, 0);
      }

      if(this.aR) {
         this.hH.a("New Client Available", 16, d - 16, 16711680, 0);
      }

      this.i(super.au, super.av);
      this.ft.a(0, super.ao, 0);
   }

   private void af() {
      if(!R) {
         if(aC.e(T) && aC.f(U)) {
            this.ej = 0;
            this.b(T, U, false);
            if(!aE.a.equals(T) || !aE.b.equals(U)) {
               aE.a();
            }

            this.I();
         } else {
            this.hw = "";
            this.hv = "Invalid username or password.";
         }
      }
   }

   public final void k() {
      this.hm = true;
   }

   private void c(K var1, int var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if(var2 == 84) {
         var3 = var1.f();
         var4 = this.hx + (var3 >> 4 & 7);
         var5 = this.hy + (var3 & 7);
         var6 = var1.h();
         var7 = var1.h();
         var8 = var1.h();
         O var30;
         if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && (var30 = this.bk[this.ct][var4][var5]) != null) {
            for(y var31 = (y)var30.b(); var31 != null; var31 = (y)var30.d()) {
               if(var31.a == (var6 & 32767) && var31.b == var7) {
                  var31.b = var8;
                  break;
               }
            }

            this.c(var4, var5);
         }

      } else {
         int var9;
         if(var2 == 105) {
            var3 = var1.f();
            var4 = this.hx + (var3 >> 4 & 7);
            var5 = this.hy + (var3 & 7);
            var6 = var1.h();
            var8 = (var7 = var1.f()) >> 4 & 15;
            var9 = var7 & 7;
            if(M.a[0] >= var4 - var8 && M.a[0] <= var4 + var8 && M.b[0] >= var5 - var8 && M.b[0] <= var5 + var8 && this.bz && this.ez < 50) {
               this.d(var6, var9, 0);
            }
         }

         if(var2 == 215) {
            var3 = var1.y();
            var4 = var1.v();
            var5 = this.hx + (var4 >> 4 & 7);
            var6 = this.hy + (var4 & 7);
            var7 = var1.y();
            var8 = var1.h();
            if(var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 != this.bW) {
               y var29;
               (var29 = new y()).a = var3;
               var29.b = var8;
               if(this.bk[this.ct][var5][var6] == null) {
                  this.bk[this.ct][var5][var6] = new O();
               }

               this.bk[this.ct][var5][var6].a(var29);
               this.c(var5, var6);
            }

         } else {
            y var26;
            if(var2 == 156) {
               var3 = var1.t();
               var4 = this.hx + (var3 >> 4 & 7);
               var5 = this.hy + (var3 & 7);
               var6 = var1.h();
               O var28;
               if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && (var28 = this.bk[this.ct][var4][var5]) != null) {
                  for(var26 = (y)var28.b(); var26 != null; var26 = (y)var28.d()) {
                     if(var26.a == (var6 & 32767)) {
                        var26.E();
                        break;
                     }
                  }

                  if(var28.b() == null) {
                     this.bk[this.ct][var4][var5] = null;
                  }

                  this.c(var4, var5);
               }

            } else {
               int var10;
               int var11;
               int var12;
               int var13;
               int var15;
               if(var2 == 160) {
                  var3 = var1.v();
                  var4 = this.hx + (var3 >> 4 & 7);
                  var5 = this.hy + (var3 & 7);
                  var7 = (var6 = var1.v()) >> 2;
                  var8 = var6 & 3;
                  var9 = this.go[var7];
                  var10 = var1.y();
                  if(var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                     var3 = this.gI[this.ct][var4][var5];
                     var11 = this.gI[this.ct][var4 + 1][var5];
                     var12 = this.gI[this.ct][var4 + 1][var5 + 1];
                     var13 = this.gI[this.ct][var4][var5 + 1];
                     ac var33;
                     if(var9 == 0 && (var33 = this.cN.f(this.ct, var4, var5)) != null) {
                        var15 = var33.h >> 14 & 32767;
                        if(var7 == 2) {
                           var33.f = new D(var15, var8 + 4, 2, var11, var12, var3, var13, var10, false);
                           var33.g = new D(var15, var8 + 1 & 3, 2, var11, var12, var3, var13, var10, false);
                        } else {
                           var33.f = new D(var15, var8, var7, var11, var12, var3, var13, var10, false);
                        }
                     }

                     ad var35;
                     if(var9 == 1 && (var35 = this.cN.g(var4, var5, this.ct)) != null) {
                        var35.f = new D(var35.g >> 14 & 32767, 0, 4, var11, var12, var3, var13, var10, false);
                     }

                     if(var9 == 2) {
                        x var37 = this.cN.h(var4, var5, this.ct);
                        if(var7 == 11) {
                           var7 = 10;
                        }

                        if(var37 != null) {
                           var37.e = new D(var37.m >> 14 & 32767, var8, var7, var11, var12, var3, var13, var10, false);
                        }
                     }

                     aa var38;
                     if(var9 == 3 && (var38 = this.cN.i(var5, var4, this.ct)) != null) {
                        var38.d = new D(var38.e >> 14 & 32767, var8, 22, var11, var12, var3, var13, var10, false);
                     }
                  }

               } else {
                  if(var2 == 147) {
                     var3 = var1.v();
                     var4 = this.hx + (var3 >> 4 & 7);
                     var5 = this.hy + (var3 & 7);
                     var6 = var1.h();
                     byte var22 = (byte)(128 - var1.a[var1.b++]);
                     var8 = var1.x();
                     byte var23 = var1.w();
                     var10 = var1.h();
                     var11 = (var3 = var1.v()) >> 2;
                     var12 = var3 & 3;
                     var13 = this.go[var11];
                     byte var14 = var1.g();
                     var15 = var1.h();
                     byte var20 = var1.w();
                     A var21;
                     if(var6 == this.bW) {
                        var21 = M;
                     } else {
                        var21 = this.cc[var6];
                     }

                     j var34;
                     if(var21 != null && (var34 = j.a(var15)) != null) {
                        int var16 = this.gI[this.ct][var4][var5];
                        int var17 = this.gI[this.ct][var4 + 1][var5];
                        int var18 = this.gI[this.ct][var4 + 1][var5 + 1];
                        int var19 = this.gI[this.ct][var4][var5 + 1];
                        F var27;
                        if((var27 = var34.a(var11, var12, var16, var17, var18, var19, -1)) != null) {
                           this.a(var10 + 1, -1, 0, var13, var5, 0, this.ct, var4, var8 + 1);
                           var21.an = var8 + S;
                           var21.ao = var10 + S;
                           var21.au = var27;
                           var8 = var34.h;
                           var10 = var34.p;
                           if(var12 == 1 || var12 == 3) {
                              var8 = var34.p;
                              var10 = var34.h;
                           }

                           var21.ar = (var4 << 7) + (var8 << 6);
                           var21.at = (var5 << 7) + (var10 << 6);
                           var21.as = this.b(this.ct, var21.at, var21.ar);
                           byte var24;
                           if(var14 > var22) {
                              var24 = var14;
                              var14 = var22;
                              var22 = var24;
                           }

                           if(var20 > var23) {
                              var24 = var20;
                              var20 = var23;
                              var23 = var24;
                           }

                           var21.aw = var4 + var14;
                           var21.ay = var4 + var22;
                           var21.ax = var5 + var20;
                           var21.az = var5 + var23;
                        }
                     }
                  }

                  if(var2 == 150) {
                     if((var3 = this.dI / 5) > 0) {
                        for(var4 = 0; var4 < var3; ++var4) {
                           if((var5 = var1.x()) == '\uffff') {
                              var5 = -1;
                           }

                           var6 = var1.u();
                           var7 = var1.u();
                           var9 = (var8 = var1.v()) >> 2;
                           var10 = var8 & 3;
                           if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                              this.a(-1, var5, var10, this.go[var9], var7, var9, this.ct, var6, 0);
                              this.dp = true;
                           }
                        }

                     }
                  } else if(var2 == 151) {
                     var3 = var1.t();
                     var4 = this.hx + (var3 >> 4 & 7);
                     var5 = this.hy + (var3 & 7);
                     var6 = var1.x();
                     var8 = (var7 = var1.v()) >> 2;
                     var9 = var7 & 3;
                     var10 = this.go[var8];
                     if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        this.a(-1, var6, var9, var10, var5, var8, this.ct, var4, 0);
                        this.dp = true;
                     }

                  } else if(var2 == 4) {
                     var3 = var1.f();
                     var4 = this.hx + (var3 >> 4 & 7);
                     var5 = this.hy + (var3 & 7);
                     var6 = var1.h();
                     var7 = var1.f();
                     var8 = var1.h();
                     if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var4 = (var4 << 7) + 64;
                        var5 = (var5 << 7) + 64;
                        v var25 = new v(this.ct, S, var8, var6, this.b(this.ct, var5, var4) - var7, var5, var4);
                        this.ew.a(var25);
                     }

                  } else if(var2 == 44) {
                     var3 = var1.z();
                     var4 = var1.h();
                     var5 = var1.f();
                     var6 = this.hx + (var5 >> 4 & 7);
                     var7 = this.hy + (var5 & 7);
                     if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                        (var26 = new y()).a = var3;
                        var26.b = var4;
                        if(this.bk[this.ct][var6][var7] == null) {
                           this.bk[this.ct][var6][var7] = new O();
                        }

                        this.bk[this.ct][var6][var7].a(var26);
                        this.c(var6, var7);
                     }

                  } else if(var2 == 101) {
                     var4 = (var3 = var1.u()) >> 2;
                     var5 = var3 & 3;
                     var6 = this.go[var4];
                     var7 = var1.f();
                     var8 = this.hx + (var7 >> 4 & 7);
                     var9 = this.hy + (var7 & 7);
                     if(var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                        this.a(-1, -1, var5, var6, var9, var4, this.ct, var8, 0);
                     }

                  } else {
                     if(var2 == 117) {
                        var3 = var1.f();
                        var4 = this.hx + (var3 >> 4 & 7);
                        var5 = this.hy + (var3 & 7);
                        var6 = var4 + var1.g();
                        var7 = var5 + var1.g();
                        var8 = var1.i();
                        var9 = var1.h();
                        var10 = var1.f() << 2;
                        var3 = var1.f() << 2;
                        var11 = var1.h();
                        var12 = var1.h();
                        var13 = var1.f();
                        int var32 = var1.f();
                        if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 != '\uffff') {
                           var4 = (var4 << 7) + 64;
                           var5 = (var5 << 7) + 64;
                           var6 = (var6 << 7) + 64;
                           var7 = (var7 << 7) + 64;
                           B var36;
                           (var36 = new B(var13, var3, var11 + S, var12 + S, var32, this.ct, this.b(this.ct, var5, var4) - var10, var5, var4, var8, var9)).a(var11 + S, var7, this.b(this.ct, var7, var6) - var3, var6);
                           this.dN.a(var36);
                        }
                     }

                  }
               }
            }
         }
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var5 > 0 && var1 > 0 && var5 <= 102 && var1 <= 102) {
         int var8 = 0;
         if(var6 == 0) {
            var8 = this.cN.j(var2, var5, var1);
         }

         if(var6 == 1) {
            var8 = this.cN.k(var2, var5, var1);
         }

         if(var6 == 2) {
            var8 = this.cN.l(var2, var5, var1);
         }

         if(var6 == 3) {
            var8 = this.cN.m(var2, var5, var1);
         }

         int var9;
         if(var8 != 0) {
            var9 = this.cN.c(var2, var5, var1, var8);
            var8 = var8 >> 14 & 32767;
            int var10 = var9 & 31;
            var9 >>= 6;
            j var11;
            if(var6 == 0) {
               this.cN.a(var5, var2, var1);
               if((var11 = j.a(var8)) != null && var11.t) {
                  this.gV[var2].a(var9, var10, var11.m, var5, var1);
               }
            }

            if(var6 == 1) {
               this.cN.b(var1, var2, var5);
            }

            if(var6 == 2) {
               this.cN.c(var2, var5, var1);
               if((var11 = j.a(var8)) == null) {
                  return;
               }

               if(var5 + var11.h > 103 || var1 + var11.h > 103 || var5 + var11.p > 103 || var1 + var11.p > 103) {
                  return;
               }

               if(var11.t) {
                  this.gV[var2].a(var9, var11.h, var5, var1, var11.p, var11.m);
               }
            }

            if(var6 == 3) {
               this.cN.d(var2, var1, var5);
               if((var11 = j.a(var8)) == null) {
                  return;
               }

               if(var11.t && var11.z) {
                  this.gV[var2].b(var1, var5);
               }
            }
         }

         if(var7 >= 0) {
            var9 = var2;
            if(var2 < 3 && (this.ho[1][var5][var1] & 2) == 2) {
               var9 = var2 + 1;
            }

            U.a(this.cN, var3, var1, var4, var9, this.gV[var2], this.gI, var5, var7, var2);
         }
      }

   }

   private void b(int var1, K var2) {
      this.bs = 0;
      this.cf = 0;
      Client var3 = this;
      var2.o();
      int var6;
      int var7;
      int var9;
      int var10;
      if(var2.f(1) != 0) {
         if((var6 = var2.f(2)) == 0) {
            this.cg[this.cf++] = 2047;
         } else if(var6 == 1) {
            var7 = var2.f(3);
            M.a(false, var7);
            if(var2.f(1) == 1) {
               this.cg[this.cf++] = 2047;
            }
         } else {
            int var8;
            if(var6 == 2) {
               var7 = var2.f(3);
               M.a(true, var7);
               var8 = var2.f(3);
               M.a(true, var8);
               if(var2.f(1) == 1) {
                  this.cg[this.cf++] = 2047;
               }
            } else if(var6 == 3) {
               if((var7 = var2.f(2)) != this.ct) {
                  this.ct = var7;

                  for(var8 = 0; var8 < 4; ++var8) {
                     for(var9 = 0; var9 < 104; ++var9) {
                        for(var10 = 0; var10 < 104; ++var10) {
                           var3.bk[var8][var9][var10] = null;
                        }
                     }
                  }
               }

               var8 = var2.f(1);
               if(var2.f(1) == 1) {
                  var3.cg[var3.cf++] = 2047;
               }

               var10 = var2.f(7);
               var9 = var2.f(7);
               M.a(var9, var10, var8 == 1);
            }
         }
      }

      K var4 = var2;
      var3 = this;
      int var5;
      if((var5 = var2.f(8)) < this.cd) {
         for(var6 = var5; var6 < var3.cd; ++var6) {
            var3.bt[var3.bs++] = var3.ce[var6];
         }
      }

      if(var5 > var3.cd) {
         ao.b(T + " Too many players");
         throw new RuntimeException("eek");
      } else {
         var3.cd = 0;

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = var3.ce[var6];
            A var13 = var3.cc[var7];
            if(var4.f(1) == 0) {
               var3.ce[var3.cd++] = var7;
               var13.I = S;
            } else if((var10 = var4.f(2)) == 0) {
               var3.ce[var3.cd++] = var7;
               var13.I = S;
               var3.cg[var3.cf++] = var7;
            } else if(var10 == 1) {
               var3.ce[var3.cd++] = var7;
               var13.I = S;
               var9 = var4.f(3);
               var13.a(false, var9);
               if(var4.f(1) == 1) {
                  var3.cg[var3.cf++] = var7;
               }
            } else if(var10 == 2) {
               var3.ce[var3.cd++] = var7;
               var13.I = S;
               var9 = var4.f(3);
               var13.a(true, var9);
               var9 = var4.f(3);
               var13.a(true, var9);
               if(var4.f(1) == 1) {
                  var3.cg[var3.cf++] = var7;
               }
            } else if(var10 == 3) {
               var3.bt[var3.bs++] = var7;
            }
         }

         this.b(var2, var1);
         this.a(var2);

         int var11;
         for(var11 = 0; var11 < this.bs; ++var11) {
            int var12 = this.bt[var11];
            if(this.cc[var12].I != S) {
               this.cc[var12] = null;
            }
         }

         if(var2.b != var1) {
            ao.b("Error packet size mismatch in getplayer pos:" + var2.b + " psize:" + var1);
            throw new RuntimeException("eek");
         } else {
            for(var11 = 0; var11 < this.cd; ++var11) {
               if(this.cc[this.ce[var11]] == null) {
                  ao.b(T + " null entry in pl list - pos:" + var11 + " size:" + this.cd);
                  throw new RuntimeException("eek");
               }
            }

         }
      }
   }

   private void n(int var1) {
      this.en[429] = var1;
      if(this.B[429] != var1) {
         this.B[429] = var1;
         this.f(429);
         Q = true;
         if(this.el != -1) {
            ac = true;
         }
      }

   }

   public final void b(int var1, int var2) {
      this.en[var1] = var2;
      if(this.B[var1] != var2) {
         this.B[var1] = var2;
         Q = true;
         if(this.el != -1) {
            ac = true;
         }
      }

   }

   private boolean ag() {
      if(this.gi == null) {
         return false;
      } else {
         String var1;
         int var2;
         try {
            int var28;
            if((var28 = this.gi.c()) == 0) {
               return false;
            }

            if(this.dJ == -1) {
               this.gi.a(this.eT.a, 1);
               this.dJ = this.eT.a[0] & 255;
               if(this.dB != null) {
                  this.dJ = this.dJ - this.dB.a() & 255;
               }

               this.dI = ai.a[this.dJ];
               --var28;
            }

            if(this.dI == -1) {
               if(var28 <= 0) {
                  return false;
               }

               this.gi.a(this.eT.a, 1);
               this.dI = this.eT.a[0] & 255;
               --var28;
            }

            if(this.dI == -2) {
               if(var28 <= 1) {
                  return false;
               }

               this.gi.a(this.eT.a, 2);
               this.eT.b = 0;
               this.dI = this.eT.h();
               var28 -= 2;
            }

            if(var28 < this.dI) {
               return false;
            }

            this.eT.b = 0;
            this.gi.a(this.eT.a, this.dI);
            this.dK = 0;
            this.bw = this.bv;
            this.bv = this.bu;
            this.bu = this.dJ;
            int var3;
            int var4;
            int var5;
            int var6;
            int var9;
            long var10;
            int var11;
            boolean var29;
            String var31;
            boolean var32;
            m var33;
            String var34;
            boolean var36;
            m var39;
            int var44;
            switch(this.dJ) {
            case 1:
               int var48;
               for(var48 = 0; var48 < this.cc.length; ++var48) {
                  if(this.cc[var48] != null) {
                     this.cc[var48].y = -1;
                  }
               }

               for(var48 = 0; var48 < this.bp.length; ++var48) {
                  if(this.bp[var48] != null) {
                     this.bp[var48].y = -1;
                  }
               }

               this.dJ = -1;
               return true;
            case 4:
            case 44:
            case 84:
            case 101:
            case 105:
            case 117:
            case 147:
            case 150:
            case 151:
            case 156:
            case 160:
            case 215:
               this.c(this.eT, this.dJ);
               this.dJ = -1;
               return true;
            case 8:
               var28 = this.eT.z();
               var2 = this.eT.z();
               var3 = this.eT.h();
               m var58;
               if((var58 = m.a(var28, var2)) != null) {
                  var58.ad = 1;
                  var58.ae = var3;
               }

               this.dJ = -1;
               return true;
            case 24:
               this.D = this.eT.v();
               if(this.D == ab) {
                  if(this.D == 3) {
                     ab = 1;
                  } else {
                     ab = 3;
                  }

                  Q = true;
               }

               this.dJ = -1;
               return true;
            case 27:
               if(this.eT.f() == 1) {
                  this.dF = this.eT.m();
               } else {
                  this.dF = "Enter Amount";
               }

               this.hn = false;
               this.ad = 1;
               this.dE = "";
               ac = true;
               this.dJ = -1;
               return true;
            case 34:
               Q = true;
               var28 = this.eT.x();
               var2 = this.eT.x();
               if((var39 = m.a(var28, var2)) != null) {
                  while(this.eT.b < this.dI) {
                     var2 = this.eT.h();
                     var3 = this.eT.h();
                     if((var4 = this.eT.f()) == 255) {
                        var4 = this.eT.k();
                     }

                     if(var2 >= 0 && var2 < var39.A.length) {
                        var39.A[var2] = var3;
                        var39.B[var2] = var4;
                     }
                  }
               }

               this.dJ = -1;
               return true;
            case 35:
               var28 = this.eT.f();
               var2 = this.eT.f();
               var3 = this.eT.f();
               var4 = this.eT.f();
               this.bO[var28] = true;
               this.bN[var28] = var2;
               this.gD[var28] = var3;
               this.cy[var28] = var4;
               this.ec[var28] = 0;
               this.dJ = -1;
               return true;
            case 36:
               var4 = this.eT.x();
               byte var60 = this.eT.g();
               this.en[var4] = var60;
               if(this.B[var4] != var60) {
                  this.B[var4] = var60;
                  this.f(var4);
                  Q = true;
                  if(this.el != -1) {
                     ac = true;
                  }
               }

               this.dJ = -1;
               return true;
            case 50:
               long var47 = this.eT.l();
               int var51 = this.eT.f();
               var34 = aC.c(aC.a(var47));

               for(var3 = 0; var3 < this.cj; ++var3) {
                  if(var47 == this.cU[var3]) {
                     if(this.bj[var3] != var51) {
                        this.bj[var3] = var51;
                        Q = true;
                        if(var51 >= 2) {
                           this.a(var34 + " has logged in.", 5, "");
                        }

                        if(var51 <= 1) {
                           this.a(var34 + " has logged out.", 5, "");
                        }
                     }

                     var34 = null;
                  }
               }

               if(var34 != null && this.cj < 200) {
                  this.cU[this.cj] = var47;
                  this.eS[this.cj] = var34;
                  this.bj[this.cj] = var51;
                  ++this.cj;
                  Q = true;
               }

               var36 = false;

               while(!var36) {
                  var36 = true;

                  for(var28 = 0; var28 < this.cj - 1; ++var28) {
                     if(this.bj[var28] != cY && this.bj[var28 + 1] == cY || this.bj[var28] == 0 && this.bj[var28 + 1] != 0) {
                        var2 = this.bj[var28];
                        this.bj[var28] = this.bj[var28 + 1];
                        this.bj[var28 + 1] = var2;
                        var31 = this.eS[var28];
                        this.eS[var28] = this.eS[var28 + 1];
                        this.eS[var28 + 1] = var31;
                        long var56 = this.cU[var28];
                        this.cU[var28] = this.cU[var28 + 1];
                        this.cU[var28 + 1] = var56;
                        Q = true;
                        var36 = false;
                     }
                  }
               }

               this.dJ = -1;
               return true;
            case 53:
               Q = true;
               var28 = this.eT.x();
               var2 = this.eT.x();
               if((var39 = m.a(var28, var2)) != null) {
                  var2 = this.eT.h();

                  for(var3 = 0; var3 < var2; ++var3) {
                     if((var4 = this.eT.f()) == 255) {
                        var4 = this.eT.D();
                     }

                     var39.A[var3] = this.eT.z();
                     var39.B[var3] = var4;
                  }

                  for(var3 = var2; var3 < var39.A.length; ++var3) {
                     var39.A[var3] = 0;
                     var39.B[var3] = 0;
                  }
               }

               this.dJ = -1;
               return true;
            case 60:
               this.hy = this.eT.f();
               this.hx = this.eT.u();

               while(this.eT.b < this.dI) {
                  var28 = this.eT.f();
                  this.c(this.eT, var28);
               }

               this.dJ = -1;
               return true;
            case 61:
               this.ev = this.eT.f();
               this.dJ = -1;
               return true;
            case 64:
               this.hx = this.eT.u();
               this.hy = this.eT.v();

               for(var28 = this.hx; var28 < this.hx + 8; ++var28) {
                  for(var2 = this.hy; var2 < this.hy + 8; ++var2) {
                     if(this.bk[this.ct][var28][var2] != null) {
                        this.bk[this.ct][var28][var2] = null;
                        this.c(var28, var2);
                     }
                  }
               }

               for(ab var59 = (ab)this.gr.b(); var59 != null; var59 = (ab)this.gr.d()) {
                  if(var59.g >= this.hx && var59.g < this.hx + 8 && var59.h >= this.hy && var59.h < this.hy + 8 && var59.e == this.ct) {
                     var59.d = 0;
                  }
               }

               this.dJ = -1;
               return true;
            case 65:
               this.a(this.eT, this.dI);
               this.dJ = -1;
               return true;
            case 68:
               for(int var57 = 0; var57 < this.B.length; ++var57) {
                  if(this.B[var57] != this.en[var57]) {
                     this.B[var57] = this.en[var57];
                     this.f(var57);
                     Q = true;
                  }
               }

               this.dJ = -1;
               return true;
            case 70:
               var28 = this.eT.x();
               var2 = this.eT.x();
               var3 = this.eT.i();
               var4 = this.eT.i();
               if((var39 = m.a(var28, var2)) != null) {
                  var39.i = var3;
                  var39.j = var4;
               }

               this.dJ = -1;
               return true;
            case 71:
               var11 = this.eT.h();
               var6 = this.eT.t();
               if(var11 == '\uffff') {
                  var11 = -1;
               }

               N[var6] = var11;
               Q = true;
               L = true;
               this.dJ = -1;
               return true;
            case 72:
               var28 = this.eT.x();
               var2 = this.eT.x();
               m var54;
               if((var54 = m.a(var28, var2)) != null) {
                  for(var4 = 0; var4 < var54.A.length; ++var4) {
                     var54.A[var4] = 0;
                     var54.B[var4] = 0;
                  }
               }

               this.dJ = -1;
               return true;
            case 73:
            case 241:
               var28 = this.eF;
               var2 = this.eG;
               if(this.dJ == 73) {
                  var28 = this.eT.y();
                  var2 = this.eT.h();
                  this.ga = false;
               }

               if(this.dJ == 241) {
                  var2 = this.eT.y();
                  this.eT.o();

                  for(var28 = 0; var28 < 4; ++var28) {
                     for(var3 = 0; var3 < 13; ++var3) {
                        for(var4 = 0; var4 < 13; ++var4) {
                           if(this.eT.f(1) == 1) {
                              this.fJ[var28][var3][var4] = this.eT.f(26);
                           } else {
                              this.fJ[var28][var3][var4] = -1;
                           }
                        }
                     }
                  }

                  this.eT.p();
                  var28 = this.eT.h();
                  this.ga = true;
               }

               if(this.eF == var28 && this.eG == var2 && this.dW == 2) {
                  this.dJ = -1;
                  return true;
               }

               this.eF = var28;
               this.eG = var2;
               this.ef = this.eF - 6 << 3;
               this.eg = this.eG - 6 << 3;
               this.fR = (this.eF / 8 == 48 || this.eF / 8 == 49) && this.eG / 8 == 48;
               if(this.eF / 8 == 48 && this.eG / 8 == 148) {
                  this.fR = true;
               }

               this.N();
               this.dW = 1;
               this.bh = System.currentTimeMillis();
               if(this.dJ == 73) {
                  var28 = 0;

                  for(var3 = (this.eF - 6) / 8; var3 <= (this.eF + 6) / 8; ++var3) {
                     for(var4 = (this.eG - 6) / 8; var4 <= (this.eG + 6) / 8; ++var4) {
                        ++var28;
                     }
                  }

                  this.gu = new byte[var28][];
                  this.hf = new byte[var28][];
                  this.gW = new int[var28];
                  this.gX = new int[var28];
                  this.gY = new int[var28];
                  var28 = 0;

                  for(var3 = (this.eF - 6) / 8; var3 <= (this.eF + 6) / 8; ++var3) {
                     for(var4 = (this.eG - 6) / 8; var4 <= (this.eG + 6) / 8; ++var4) {
                        this.gW[var28] = (var3 << 8) + var4;
                        if(this.fR && (var4 == 49 || var4 == 149 || var4 == 147 || var3 == 50 || var3 == 49 && var4 == 47)) {
                           this.gX[var28] = -1;
                           this.gY[var28] = -1;
                        } else {
                           if((var5 = this.gX[var28] = this.F.a(0, var4, var3)) != -1) {
                              this.F.a(3, var5);
                           }

                           if((var2 = this.gY[var28] = this.F.a(1, var4, var3)) != -1) {
                              this.F.a(3, var2);
                           }
                        }

                        ++var28;
                     }
                  }
               }

               if(this.dJ == 241) {
                  var28 = 0;
                  int[] var53 = new int[676];

                  int var7;
                  int var8;
                  for(var4 = 0; var4 < 4; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        for(var2 = 0; var2 < 13; ++var2) {
                           if((var6 = this.fJ[var4][var5][var2]) != -1) {
                              var7 = var6 >> 14 & 1023;
                              var8 = var6 >> 3 & 2047;
                              var9 = (var7 / 8 << 8) + var8 / 8;

                              for(var44 = 0; var44 < var28; ++var44) {
                                 if(var53[var44] == var9) {
                                    var9 = -1;
                                 }
                              }

                              if(var9 != -1) {
                                 var53[var28++] = var9;
                              }
                           }
                        }
                     }
                  }

                  this.gu = new byte[var28][];
                  this.hf = new byte[var28][];
                  this.gW = new int[var28];
                  this.gX = new int[var28];
                  this.gY = new int[var28];

                  for(var4 = 0; var4 < var28; ++var4) {
                     var2 = (var5 = this.gW[var4] = var53[var4]) >> 8 & 255;
                     var6 = var5 & 255;
                     if((var7 = this.gX[var4] = this.F.a(0, var6, var2)) != -1) {
                        this.F.a(3, var7);
                     }

                     if((var8 = this.gY[var4] = this.F.a(1, var6, var2)) != -1) {
                        this.F.a(3, var8);
                     }
                  }
               }

               var28 = this.ef - this.eh;
               var3 = this.eg - this.ei;
               this.eh = this.ef;
               this.ei = this.eg;

               for(var4 = 0; var4 < 16384; ++var4) {
                  z var41;
                  if((var41 = this.bp[var4]) != null) {
                     for(var2 = 0; var2 < 10; ++var2) {
                        var41.a[var2] -= var28;
                        var41.b[var2] -= var3;
                     }

                     var41.V -= var28 << 7;
                     var41.W -= var3 << 7;
                  }
               }

               for(var4 = 0; var4 < 2048; ++var4) {
                  A var42;
                  if((var42 = this.cc[var4]) != null) {
                     for(var2 = 0; var2 < 10; ++var2) {
                        var42.a[var2] -= var28;
                        var42.b[var2] -= var3;
                     }

                     var42.V -= var28 << 7;
                     var42.W -= var3 << 7;
                  }
               }

               this.eR = true;
               byte var52 = 0;
               byte var43 = 104;
               byte var55 = 1;
               if(var28 < 0) {
                  var52 = 103;
                  var43 = -1;
                  var55 = -1;
               }

               byte var38 = 0;
               byte var35 = 104;
               byte var40 = 1;
               if(var3 < 0) {
                  var38 = 103;
                  var35 = -1;
                  var40 = -1;
               }

               for(var9 = var52; var9 != var43; var9 += var55) {
                  for(var44 = var38; var44 != var35; var44 += var40) {
                     var4 = var9 + var28;
                     var11 = var44 + var3;

                     for(int var46 = 0; var46 < 4; ++var46) {
                        if(var4 >= 0 && var11 >= 0 && var4 < 104 && var11 < 104) {
                           this.bk[var46][var9][var44] = this.bk[var46][var4][var11];
                        } else {
                           this.bk[var46][var9][var44] = null;
                        }
                     }
                  }
               }

               for(ab var45 = (ab)this.gr.b(); var45 != null; var45 = (ab)this.gr.d()) {
                  var45.g -= var28;
                  var45.h -= var3;
                  if(var45.g < 0 || var45.h < 0 || var45.g >= 104 || var45.h >= 104) {
                     var45.E();
                  }
               }

               if(this.hq != 0) {
                  this.hq -= var28;
                  this.hr -= var3;
               }

               this.gb = false;
               this.gc = false;
               this.dJ = -1;
               return true;
            case 74:
               if((var28 = this.eT.x()) == '\uffff') {
                  var28 = -1;
               }

               if(!aS) {
                  if(var28 != this.cX && fV && this.hp == 0) {
                     this.gP = var28;
                     this.gQ = true;
                     this.F.a(2, this.gP);
                  }

                  this.cX = var28;
               }

               this.dJ = -1;
               return true;
            case 75:
               var44 = this.eT.z();
               var4 = this.eT.z();
               var11 = this.eT.z();
               m var12;
               if((var12 = m.a(var44, var4)) != null) {
                  h var49;
                  if((var49 = h.a(var11)) != null && (var49 = var49.b()) != null) {
                     var11 = var49.b;
                  }

                  var12.ad = 2;
                  var12.ae = var11;
               }

               this.dJ = -1;
               return true;
            case 78:
               this.hq = 0;
               this.dJ = -1;
               return true;
            case 79:
               var2 = this.eT.x();
               var3 = this.eT.x();
               int var16 = this.eT.y();
               m var17;
               if((var17 = m.a(var2, var3)) != null && var17.b == 0) {
                  if(var16 < 0) {
                     var16 = 0;
                  }

                  if(var16 > var17.w - var17.e()) {
                     var16 = var17.w - var17.e();
                  }

                  var17.x = var16;
               }

               this.dJ = -1;
               return true;
            case 81:
               this.b(this.dI, this.eT);
               this.eR = false;
               this.dJ = -1;
               return true;
            case 85:
               this.hy = this.eT.u();
               this.hx = this.eT.u();
               this.dJ = -1;
               return true;
            case 87:
               var3 = this.eT.x();
               var2 = this.eT.C();
               this.en[var3] = var2;
               if(this.B[var3] != var2) {
                  this.B[var3] = var2;
                  this.f(var3);
                  Q = true;
                  if(this.el != -1) {
                     ac = true;
                  }
               }

               this.dJ = -1;
               return true;
            case 97:
               if((var3 = this.eT.h()) == '\uffff') {
                  var3 = -1;
               }

               h(var3);
               if(this.X != -1) {
                  Q = true;
                  this.X = -1;
                  L = true;
               }

               if(this.aj != -1) {
                  this.aj = -1;
                  ac = true;
               }

               if(this.ad != 0) {
                  this.ad = 0;
                  ac = true;
               }

               v = var3;
               this.if.a();
               this.fT = false;
               this.dJ = -1;
               return true;
            case 99:
               this.dV = this.eT.f();
               this.dJ = -1;
               return true;
            case 104:
               var28 = this.eT.u();
               var2 = this.eT.t();
               var31 = this.eT.m();
               if(var28 > 0 && var28 <= 5) {
                  if(var31.equalsIgnoreCase("null")) {
                     var31 = null;
                  }

                  this.fH[var28 - 1] = var31;
                  this.fI[var28 - 1] = var2 == 0;
               }

               this.dJ = -1;
               return true;
            case 106:
               ab = this.eT.u();
               Q = true;
               L = true;
               this.dJ = -1;
               return true;
            case 107:
               this.gb = false;
               this.gc = false;

               for(var28 = 0; var28 < 5; ++var28) {
                  this.bO[var28] = false;
               }

               this.dJ = -1;
               return true;
            case 108:
               this.gc = this.eT.f() == 1;
               this.dJ = -1;
               return true;
            case 109:
               this.F();
               this.dJ = -1;
               return false;
            case 110:
               if(ab == 12) {
                  Q = true;
               }

               this.fS = this.eT.f();
               this.dJ = -1;
               return true;
            case 114:
               this.fp = this.eT.x() * 30;
               this.dJ = -1;
               return true;
            case 115:
               if(this.eT.h() > 0) {
                  try {
                     this.fq = this.eT.m();
                  } catch (Exception var21) {
                     ao.b("cde1");
                  }
               } else {
                  this.fq = "";
               }

               this.dJ = -1;
               return true;
            case 121:
               var28 = this.eT.z();
               var2 = this.eT.y();
               if(!aS && fV) {
                  this.gP = var28;
                  this.gQ = false;
                  this.F.a(2, this.gP);
                  this.hp = var2;
               }

               this.dJ = -1;
               return true;
            case 122:
               var28 = this.eT.z();
               var2 = this.eT.z();
               var4 = (var3 = this.eT.z()) >> 10 & 31;
               var5 = var3 >> 5 & 31;
               var3 &= 31;
               if((var39 = m.a(var28, var2)) != null) {
                  var39.X = (var4 << 19) + (var5 << 11) + (var3 << 3);
               }

               this.dJ = -1;
               return true;
            case 126:
               try {
                  var28 = this.eT.y();
                  var2 = this.eT.y();
                  a(this.eT.m(), var28, var2);
               } catch (Exception var20) {
                  ;
               }

               this.dJ = -1;
               return true;
            case 127:
               try {
                  var28 = this.eT.y();
                  var2 = this.eT.h();

                  for(var3 = 0; var3 < var2; ++var3) {
                     var4 = this.eT.y();
                     a(this.eT.m(), var28, var4);
                  }
               } catch (Exception var22) {
                  ;
               }

               this.dJ = -1;
               return true;
            case 134:
               Q = true;
               var4 = this.eT.f();
               var5 = this.eT.C();
               var44 = this.eT.f();
               if(this.dW == 2 && (var11 = var5 - this.bJ[var4]) > 0 && this.bJ[var4] >= 0) {
                  aN.a(var4, var11);
               }

               this.bJ[var4] = var5;
               this.cu[var4] = var44;
               this.em[var4] = 1;

               for(var11 = 0; var11 < 98; ++var11) {
                  if(var5 >= dU[var11]) {
                     this.em[var4] = var11 + 2;
                  }
               }

               this.dJ = -1;
               return true;
            case 142:
               h(var28 = this.eT.x());
               if(this.aj != -1) {
                  this.aj = -1;
                  ac = true;
               }

               if(this.ad != 0) {
                  this.ad = 0;
                  ac = true;
               }

               this.X = var28;
               L = true;
               Q = true;
               v = -1;
               this.fT = false;
               this.dJ = -1;
               return true;
            case 164:
               h(var2 = this.eT.x());
               if(this.X != -1) {
                  Q = true;
                  this.X = -1;
                  L = true;
               }

               this.aj = var2;
               ac = true;
               v = -1;
               this.fT = false;
               this.dJ = -1;
               return true;
            case 166:
               this.gb = true;
               this.fk = this.eT.f();
               this.fl = this.eT.f();
               this.fm = this.eT.h();
               this.fn = this.eT.f();
               this.fo = this.eT.f();
               if(this.fo >= 100) {
                  this.bD = (this.fk << 7) + 64;
                  this.bF = (this.fl << 7) + 64;
                  this.bE = this.b(this.ct, this.bF, this.bD) - this.fm;
               }

               this.dJ = -1;
               return true;
            case 171:
               var4 = this.eT.h();
               var28 = this.eT.h();
               var29 = this.eT.f() == 1;
               if((var39 = m.a(var4, var28)) != null) {
                  var39.y = var29;
               }

               this.dJ = -1;
               return true;
            case 174:
               var28 = this.eT.h();
               var2 = this.eT.f();
               var3 = this.eT.h();
               if(this.bz && this.ez < 50) {
                  this.d(var28, var2, var3);
               }

               this.dJ = -1;
               return true;
            case 175:
               var28 = this.eT.h();
               var2 = this.eT.h();
               var3 = this.eT.u();
               var4 = this.eT.u();
               var5 = this.eT.f();
               if(!aS && this.bz && this.ez < 50) {
                  this.b(var28, var2, var3, var4, var5);
               }

               this.dJ = -1;
               return true;
            case 176:
               this.gh = this.eT.u();
               this.fW = this.eT.y();
               this.fB = this.eT.f();
               this.gA = this.eT.D();
               this.dH = this.eT.h();
               if(this.gA != 0 && v == -1) {
                  ao.a(aC.a(this.gA));
                  this.ah();
                  this.bU = "";
                  this.fZ = false;
                  this.bV = new String[]{"", "", ""};
               }

               this.dJ = -1;
               return true;
            case 177:
               this.gb = true;
               this.dw = this.eT.f();
               this.dx = this.eT.f();
               this.dy = this.eT.h();
               this.dz = this.eT.f();
               this.dA = this.eT.f();
               if(this.dA >= 100) {
                  var28 = (this.dw << 7) + 64;
                  var2 = (this.dx << 7) + 64;
                  var3 = this.b(this.ct, var2, var28) - this.dy;
                  var28 -= this.bD;
                  var3 -= this.bE;
                  var2 -= this.bF;
                  var4 = (int)Math.sqrt((double)(var28 * var28 + var2 * var2));
                  this.bG = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
                  this.bH = (int)(Math.atan2((double)var28, (double)var2) * -325.949D) & 2047;
                  if(this.bG < 128) {
                     this.bG = 128;
                  }

                  if(this.bG > 383) {
                     this.bG = 383;
                  }
               }

               this.dJ = -1;
               return true;
            case 180:
               this.aV = this.eT.h();
               this.aW = this.eT.h();
               this.f(this.aV, this.aW);
               this.dJ = -1;
               return true;
            case 185:
               var28 = this.eT.z();
               var2 = this.eT.z();
               if((var39 = m.a(var28, var2)) != null) {
                  var39.ad = 3;
                  if(M.ae == null) {
                     var39.ae = (M.ag[0] << 25) + (M.ag[4] << 20) + (M.av[0] << 15) + (M.av[8] << 10) + (M.av[11] << 5) + M.av[1];
                  } else {
                     var39.ae = (int)(305419896L + M.ae.l);
                  }
               }

               this.dJ = -1;
               return true;
            case 187:
               if(this.eT.f() == 1) {
                  this.dF = this.eT.m();
               } else {
                  this.dF = "Enter Name";
               }

               this.hn = false;
               this.ad = 2;
               this.dE = "";
               ac = true;
               this.dJ = -1;
               return true;
            case 196:
               long var18 = this.eT.l();
               this.eT.k();
               var28 = this.eT.f();
               var2 = this.eT.f();
               var36 = false;

               for(var4 = 0; var4 < this.bg; ++var4) {
                  if(this.cw[var4] == var18) {
                     var36 = true;
                  }
               }

               if(!var36 && this.hj == 0) {
                  try {
                     String var37 = aB.a(this.dI - 14, this.eT);
                     var34 = var2 > 0?d(var2):"";
                     if(var28 > 0 && var28 <= 3) {
                        this.a(var37, 7, var34 + aC.c(aC.a(var18)), var28);
                     } else {
                        this.a(var37, 3, var34 + aC.c(aC.a(var18)), var28);
                     }
                  } catch (Exception var23) {
                     ao.b("cde1");
                  }
               }

               this.dJ = -1;
               return true;
            case 200:
               var28 = this.eT.h();
               var2 = this.eT.h();
               var3 = this.eT.i();
               if((var39 = m.a(var28, var2)) != null) {
                  var39.af = var3;
                  var39.ap = 0;
                  var39.ao = 0;
                  var39.aq = 0;
               }

               this.dJ = -1;
               return true;
            case 206:
               this.ak = this.eT.f();
               this.u = this.eT.f();
               this.af = this.eT.f();
               ac = true;
               this.dJ = -1;
               return true;
            case 208:
               if((var9 = this.eT.A()) == '\uffff') {
                  var9 = -1;
               }

               if(var9 >= 0) {
                  h(var9);
                  this.dT = true;
               } else {
                  this.dT = false;
               }

               this.dS = var9;
               this.ig.a();
               this.dJ = -1;
               return true;
            case 212:
               this.aX = this.eT.m();
               this.dJ = -1;
               return true;
            case 213:
               this.ck = this.eT.f();
               if(this.ck > 0) {
                  for(var4 = 0; var4 < this.ck; ++var4) {
                     this.cV[var4] = this.eT.l();
                     this.cW[var4] = this.eT.f();
                  }
               }

               this.dJ = -1;
               return true;
            case 214:
               this.bg = this.dI / 8;
               if(this.bg > 0) {
                  for(var4 = 0; var4 < this.bg; ++var4) {
                     this.cw[var4] = this.eT.l();
                  }
               }

               this.dJ = -1;
               return true;
            case 216:
               try {
                  var1 = this.eT.m();
                  var34 = this.eT.m();
                  var3 = this.eT.f();
                  var4 = this.eT.f();
                  var32 = false;
                  var10 = aC.a(var1);

                  for(var6 = 0; var6 < this.bg; ++var6) {
                     if(this.cw[var6] == var10) {
                        var32 = true;
                     }
                  }

                  if(!var32) {
                     this.a(16, S(), (var4 > 0?d(var4):"") + aC.c(var1), var34, var3);
                  }
               } catch (Exception var25) {
                  var25.printStackTrace();
               }

               this.dJ = -1;
               return true;
            case 217:
               try {
                  var1 = this.eT.m();
                  var34 = this.eT.m();
                  var3 = this.eT.f();
                  var4 = this.eT.f();
                  var32 = false;
                  var10 = aC.a(var1);

                  for(var6 = 0; var6 < this.bg; ++var6) {
                     if(this.cw[var6] == var10) {
                        var32 = true;
                     }
                  }

                  if(!var32) {
                     this.a(9, this.aX, (var4 > 0?d(var4):"") + aC.c(var1), var34, var3);
                  }
               } catch (Exception var24) {
                  var24.printStackTrace();
               }

               this.dJ = -1;
               return true;
            case 218:
               var28 = this.eT.B();
               this.el = var28;
               ac = true;
               this.dJ = -1;
               return true;
            case 219:
               if(this.X != -1) {
                  this.X = -1;
                  Q = true;
                  L = true;
               }

               if(this.aj != -1) {
                  this.aj = -1;
                  ac = true;
               }

               if(this.ad != 0) {
                  this.ad = 0;
                  ac = true;
               }

               v = -1;
               this.fT = false;
               this.dJ = -1;
               return true;
            case 221:
               this.cl = this.eT.f();
               Q = true;
               this.dJ = -1;
               return true;
            case 230:
               var2 = this.eT.x();
               var3 = this.eT.x();
               var4 = this.eT.h();
               var28 = this.eT.h();
               var5 = this.eT.h();
               if((var33 = m.a(var2, var3)) != null) {
                  var33.ai = var4;
                  var33.aj = var28;
                  var33.ah = var5;
               }

               this.dJ = -1;
               return true;
            case 240:
               if(ab == 12) {
                  Q = true;
               }

               this.bS = this.eT.i();
               this.dJ = -1;
               return true;
            case 246:
               var4 = this.eT.x();
               var2 = this.eT.x();
               var28 = this.eT.h();
               var3 = this.eT.k();
               if((var33 = m.a(var4, var2)) != null) {
                  if(var28 == '\uffff') {
                     var28 = -1;
                  }

                  i var30;
                  if(var33.at) {
                     var33.ay = var3;
                     var33.ax = var28;
                     var30 = i.a(var28).e(var3);
                     var33.az = var30.o;
                     var33.ai = var30.A;
                     var33.aA = var30.B;
                     var33.ah = var30.u;
                     var33.aj = var30.D;
                     if(var33.g > 0) {
                        var33.ah = (var33.ah << 5) / var33.g;
                     }

                     var33.aD = var30.H;
                  } else {
                     if(var28 == -1) {
                        var33.ad = 0;
                        this.dJ = -1;
                        return true;
                     }

                     var30 = i.a(var28);
                     var33.ad = 4;
                     var33.ae = var28;
                     var33.ai = var30.A;
                     var33.aj = var30.D;
                     var33.ah = var30.u * 100 / var3;
                  }
               }

               this.dJ = -1;
               return true;
            case 248:
               if((var3 = this.eT.y()) == '\uffff') {
                  var3 = -1;
               }

               var28 = this.eT.h();
               if(this.aj != -1) {
                  this.aj = -1;
                  ac = true;
               }

               if(this.ad != 0) {
                  this.ad = 0;
                  ac = true;
               }

               if(!f) {
                  f = true;
               }

               v = var3;
               this.if.a();
               this.X = var28;
               Q = true;
               L = true;
               this.fT = false;
               this.dJ = -1;
               return true;
            case 249:
               this.eo = this.eT.t();
               this.bW = this.eT.z();
               this.dJ = -1;
               return true;
            case 253:
               var1 = this.eT.m();
               var29 = this.eT.f() == 1;
               String var13;
               long var14;
               if(var1.endsWith(":tradereq:")) {
                  var14 = aC.a(var13 = var1.substring(0, var1.indexOf(":")));
                  var29 = false;

                  for(var3 = 0; var3 < this.bg; ++var3) {
                     if(this.cw[var3] == var14) {
                        var29 = true;
                     }
                  }

                  if(!var29 && this.hj == 0) {
                     this.a("wishes to trade with you.", 4, var13);
                  }
               } else if(var1.endsWith(":duelreq:")) {
                  var14 = aC.a(var13 = var1.substring(0, var1.indexOf(":")));
                  var29 = false;

                  for(var3 = 0; var3 < this.bg; ++var3) {
                     if(this.cw[var3] == var14) {
                        var29 = true;
                     }
                  }

                  if(!var29 && this.hj == 0) {
                     this.a("wishes to duel with you.", 8, var13);
                  }
               } else if(var1.endsWith(":chalreq:")) {
                  var14 = aC.a(var13 = var1.substring(0, var1.indexOf(":")));
                  var29 = false;

                  for(var3 = 0; var3 < this.bg; ++var3) {
                     if(this.cw[var3] == var14) {
                        var29 = true;
                     }
                  }

                  if(!var29 && this.hj == 0) {
                     var31 = var1.substring(var1.indexOf(":") + 1, var1.length() - 9);
                     this.a(var31, 8, var13);
                  }
               } else if(var1.contains("<url=") && var1.endsWith("</url>")) {
                  var13 = var1.substring(0, var1.indexOf("<url="));
                  String var50 = (var1 = var1.substring(var13.length() + 5).trim()).substring(0, var1.indexOf(">"));
                  String var15 = (var1 = var1.substring(var50.length() + 1).trim()).substring(0, var1.indexOf("</url>"));
                  this.a(12, var15, var50, var13, 0);
               } else {
                  this.a(var1, "", var29);
               }

               this.dJ = -1;
               return true;
            case 254:
               this.bC = this.eT.f();
               if(this.bC == 1) {
                  this.gN = this.eT.h();
               }

               if(this.bC >= 2 && this.bC <= 6) {
                  if(this.bC == 2) {
                     this.cG = 64;
                     this.cH = 64;
                  }

                  if(this.bC == 3) {
                     this.cG = 0;
                     this.cH = 64;
                  }

                  if(this.bC == 4) {
                     this.cG = 128;
                     this.cH = 64;
                  }

                  if(this.bC == 5) {
                     this.cG = 64;
                     this.cH = 0;
                  }

                  if(this.bC == 6) {
                     this.cG = 64;
                     this.cH = 128;
                  }

                  this.bC = 2;
                  this.cD = this.eT.h();
                  this.cE = this.eT.h();
                  this.cF = this.eT.f();
               }

               if(this.bC == 10) {
                  this.cC = this.eT.h();
               }

               this.dJ = -1;
               return true;
            default:
               ao.b("T1 - " + this.dJ + "," + this.dI + " - " + this.bv + "," + this.bw);
            }
         } catch (IOException var26) {
            this.O();
         } catch (Exception var27) {
            var1 = "T2 - " + this.dJ + "," + this.bv + "," + this.bw + " - " + this.dI + "," + (this.ef + M.a[0]) + "," + (this.eg + M.b[0]) + " - ";

            for(var2 = 0; var2 < this.dI && var2 < 50; ++var2) {
               var1 = var1 + this.eT.a[var2] + ",";
            }

            ao.b(var1);
         }

         this.dJ = -1;
         return true;
      }
   }

   private void ah() {
      this.gz.a(130);
      if(this.X != -1) {
         this.X = -1;
         Q = true;
         this.fT = false;
         L = true;
      }

      if(this.aj != -1) {
         this.aj = -1;
         ac = true;
         this.fT = false;
      }

      v = -1;
      this.hY = -1;
   }

   private void h(String var1) {
      if(var1 != null) {
         if(!(var1 = var1.trim()).isEmpty()) {
            try {
               System.out.println("Opening page: ".concat(String.valueOf(var1)));
               if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                  Desktop.getDesktop().browse(new URI(var1));
               } else {
                  System.out.println("This OS does not support Java desktop browse, Attempting to launch legacy browsing");
                  String var2;
                  if((var2 = System.getProperty("os.name")).startsWith("Mac OS")) {
                     Runtime var8 = Runtime.getRuntime();
                     String[] var9 = new String[]{"osascript", "-e", "open location \"" + var1 + "\""};

                     try {
                        var8.exec(var9);
                     } catch (IOException var5) {
                        ;
                     }
                  } else if(var2.startsWith("Windows")) {
                     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler ".concat(String.valueOf(var1)));
                  } else {
                     String[] var7 = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
                     String var3 = null;

                     for(int var4 = 0; var4 < 7; ++var4) {
                        if(Runtime.getRuntime().exec(new String[]{"which", var7[var4]}).waitFor() == 0) {
                           var3 = var7[var4];
                           break;
                        }
                     }

                     if(var3 == null) {
                        throw new Exception("Could not find web browser");
                     } else {
                        Runtime.getRuntime().exec(new String[]{var3, var1});
                     }
                  }
               }
            } catch (Exception var6) {
               if(R) {
                  this.a("Failed to open URL.", 0, "");
               } else {
                  System.out.println("Failed to open URL.");
               }
            }
         }
      }
   }

   private void j(int var1, int var2) {
      if(var2 > 0) {
         String var3 = "item " + var1 + " " + var2;
         this.gz.a(103);
         this.gz.b(var3.length() + 1);
         this.gz.a(var3);
      }
   }

   public Client() {
      this.aM = c / 2;
      this.aN = d / 2;
      this.aO = -1;
      this.aP = false;
      this.aQ = "";
      this.aR = true;
      this.aU = 0.8D;
      this.aV = 0;
      this.aW = 1;
      this.aY = 500;
      this.bn = 0;
      this.bR = 9;
      this.dd = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
      this.fa = 3;
      this.fq = "";
      this.go = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      this.gR = 256;
      this.gS = true;
      this.gZ = 100;
      this.ie = null;
      this.if = new r();
      this.ig = new r();
      if(!aS) {
         try {
            this.gT = new at();
         } catch (Exception var1) {
            var1.printStackTrace();
         }
      }

      this.a(b.a);
      hX = "vidyascape.org";
      this.hY = -1;
      this.aZ = new int[500];
      this.ba = new boolean[500];
      this.bb = 0;
      this.m = 0;
      this.n = 0;
      this.o = 0;
      this.p = -1;
      this.q = 0;
      this.bi = new int[104][104];
      this.bj = new int[200];
      this.bk = new O[4][104][104];
      this.bl = false;
      this.bo = new K(new byte[5000]);
      this.bp = new z[16384];
      this.br = new int[16384];
      this.bt = new int[1000];
      this.by = K.a();
      this.bz = true;
      v = -1;
      this.bJ = new int[25];
      this.bM = false;
      this.bN = new int[5];
      this.bO = new boolean[5];
      this.bU = "";
      this.bV = new String[]{"", "", ""};
      this.bW = -1;
      this.bX = false;
      this.bZ = "";
      this.ca = 2048;
      this.cb = 2047;
      this.cc = new A[2048];
      this.ce = new int[2048];
      this.cg = new int[2048];
      this.ch = new K[2048];
      this.cm = new int[104][104];
      this.cn = new byte[16384];
      this.cu = new int[25];
      this.cV = new long[100];
      this.cW = new int[100];
      this.cw = new long[100];
      this.cx = false;
      this.cy = new int[5];
      this.cz = new int[104][104];
      this.cI = new int[500];
      this.cJ = new String[500];
      this.cK = new String[500];
      this.cL = new String[500];
      this.w = new n[24];
      this.cT = true;
      this.cU = new long[200];
      this.cX = -1;
      this.db = -1;
      this.dc = -1;
      this.z = new int[33];
      this.A = new uwotm8.c[8];
      this.B = new int[2000];
      this.de = false;
      this.df = 50;
      this.dg = new int[50];
      this.dh = new int[50];
      this.di = new int[50];
      this.dj = new int[50];
      this.dk = new int[50];
      this.dl = new int[50];
      this.dm = new int[50];
      this.dn = new String[50];
      this.dq = -1;
      this.dp = false;
      this.ds = new n[20];
      this.du = new int[5];
      this.dv = false;
      this.dE = "";
      this.dF = "Enter Value";
      this.dN = new O();
      this.dR = false;
      this.dS = -1;
      this.ec = new int[5];
      this.ed = false;
      this.ee = new n[100];
      this.el = -1;
      this.em = new int[25];
      this.en = new int[2000];
      this.ep = true;
      this.et = new int[152];
      this.gU = new int[152];
      this.D = -1;
      this.ew = new O();
      this.E = new int[33];
      this.ex = new m();
      this.ey = new k[100];
      this.eA = 5063219;
      this.eC = new int[7];
      this.eI = new int[1000];
      this.eJ = new int[1000];
      this.eR = false;
      this.eS = new String[200];
      this.eT = K.a();
      this.fb = new int[9];
      this.fc = new int[500];
      this.fd = new int[500];
      this.K = new int[500];
      this.fe = new int[500];
      this.fg = new n[20];
      this.fh = new n[20];
      this.fi = new n[20];
      L = false;
      this.fC = "";
      this.fH = new String[5];
      this.fI = new boolean[5];
      this.fJ = new int[4][13][13];
      this.fQ = new n[1000];
      this.fR = false;
      this.fT = false;
      this.fU = new n[8];
      fV = true;
      Q = false;
      R = false;
      this.fZ = false;
      this.ga = false;
      this.gb = false;
      this.gc = false;
      this.gn = false;
      this.gp = 201;
      this.gq = 581;
      this.gr = new O();
      this.gv = 128;
      this.X = -1;
      this.gz = K.a();
      this.Y = new String[500];
      this.gD = new int[5];
      this.gE = new int[50];
      aa = 100;
      this.gG = "";
      this.gL = new k[2];
      ab = 3;
      ac = false;
      this.gQ = true;
      this.gV = new R[4];
      this.ha = false;
      this.hh = new int[50];
      this.hi = new int[50];
      this.hk = false;
      this.hm = false;
      this.hn = false;
      this.hv = "";
      this.hw = "";
      this.aj = -1;
      this.hP = new int[4000];
      this.hQ = new int[4000];
   }

   private static int ai() {
      return (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
   }
}
