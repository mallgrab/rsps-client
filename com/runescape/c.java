package com.runescape;

import com.runescape.Client;
import com.runescape.b;
import com.runescape.d;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import uwotm8.aE;
import uwotm8.M;
import uwotm8.T;

public class c extends Applet implements FocusListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, WindowListener, Runnable {

   private int a;
   private int b = 20;
   private int c = 1;
   private final long[] d = new long[10];
   int al;
   private boolean e = false;
   int am;
   int an;
   Graphics ao;
   T ap;
   d aq;
   private boolean f = true;
   boolean ar = true;
   int as;
   int at;
   public int au;
   public int av;
   private int g;
   private int h;
   private int i;
   private long j;
   public int aw;
   public int ax;
   public int ay;
   private long k;
   final int[] az = new int[128];
   private final int[] l = new int[128];
   private int m;
   private int n;
   public boolean aA;
   public int aB;
   private int o = 0;
   private int p = 1;
   private int q = 2;
   private int r = 3;
   private int s = 4;
   private int t = 5;
   private int u;
   private int v;
   private int w;
   private int x;
   public boolean aC = false;


   public final void a(boolean var1, int var2, int var3, boolean var4) {
      this.am = var2;
      this.an = var3;
      if(this.aq != null) {
         this.aq.dispose();
      }

      this.aq = new d(this, var2, var3, var4, var1);
      this.aq.addWindowListener(this);
      this.ao = this.aq.getGraphics();
      this.g().addMouseWheelListener(this);
      this.g().addMouseListener(this);
      this.g().addMouseMotionListener(this);
      this.g().addKeyListener(this);
      this.g().addFocusListener(this);
   }

   public void run() {
      this.g().addMouseListener(this);
      this.g().addMouseMotionListener(this);
      this.g().addKeyListener(this);
      this.g().addFocusListener(this);
      this.g().addMouseWheelListener(this);
      if(this.aq != null) {
         this.aq.addWindowListener(this);
      }

      this.a(0, "Loading...");
      this.h();
      int var1 = 0;
      int var2 = 256;
      int var3 = 1;
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < 10; ++var5) {
         this.d[var5] = System.currentTimeMillis();
      }

      for(; this.a >= 0; this.i()) {
         if(this.a > 0) {
            --this.a;
            if(this.a == 0) {
               this.a();
               return;
            }
         }

         var5 = var2;
         int var6 = var3;
         var2 = 300;
         var3 = 1;
         long var7 = System.currentTimeMillis();
         if(this.d[var1] == 0L) {
            var2 = var5;
            var3 = var6;
         } else if(var7 > this.d[var1]) {
            var2 = (int)((long)(2560 * this.b) / (var7 - this.d[var1]));
         }

         if(var2 < 25) {
            var2 = 25;
         }

         if(var2 > 256) {
            var2 = 256;
            var3 = (int)((long)this.b - (var7 - this.d[var1]) / 10L);
         }

         if(var3 > this.b) {
            var3 = this.b;
         }

         this.d[var1] = var7;
         var1 = (var1 + 1) % 10;
         if(var3 > 1) {
            for(var5 = 0; var5 < 10; ++var5) {
               if(this.d[var5] != 0L) {
                  this.d[var5] += (long)var3;
               }
            }
         }

         if(var3 < this.c) {
            var3 = this.c;
         }

         try {
            Thread.sleep((long)var3);
         } catch (InterruptedException var9) {
            ;
         }

         while(var4 < 256) {
            this.aw = this.g;
            if(Client.b > 1) {
               this.ax = this.h / Client.b;
               this.ay = this.i / Client.b;
            } else {
               this.ax = this.h;
               this.ay = this.i;
            }

            this.k = this.j;
            this.g = 0;
            this.d();
            this.m = this.n;
            var4 += var2;
         }

         var4 &= 255;
         if(this.b > 0) {
            this.al = var2 * 1000 / (this.b << 8);
         }
      }

      if(this.a == -1) {
         this.a();
      }

   }

   private void a() {
      this.a = -2;
      this.f();
      if(this.aq != null) {
         try {
            Thread.sleep(1000L);
         } catch (Exception var1) {
            ;
         }

         try {
            System.exit(0);
            return;
         } catch (Throwable var2) {
            ;
         }
      }

   }

   final void l() {
      this.b = 1000;
   }

   public final void start() {
      if(this.a >= 0) {
         this.a = 0;
      }

   }

   public final void stop() {
      if(this.a >= 0) {
         this.a = 4000 / this.b;
      }

   }

   public final void destroy() {
      aE.a();
      this.a = -1;

      try {
         Thread.sleep(5000L);
      } catch (Exception var1) {
         ;
      }

      if(this.a == -1) {
         this.a();
      }

   }

   public final void update(Graphics var1) {
      if(this.ao == null) {
         this.ao = var1;
      }

      this.f = true;
      this.k();
   }

   public final void paint(Graphics var1) {
      super.paint(var1);
      if(this.ao == null) {
         this.ao = var1;
      }

      this.f = true;
      this.k();
   }

   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2 = var1.getWheelRotation();
      if(Client.R) {
         int var13;
         boolean var10000;
         label185: {
            c var11 = this;
            var13 = var1.getWheelRotation();
            int var4;
            if((var4 = Client.N[Client.ab]) != -1 || Client.v != -1) {
               int var5;
               m[] var6;
               int var7;
               m var8;
               int var9;
               int var10;
               if(var4 != -1) {
                  var6 = m.a[var4];
                  var4 = Client.a == b.a?Client.c - 218:(Client.a == b.a?28:Client.c - 197);
                  var5 = Client.a == b.a?Client.d - 298:(Client.a == b.a?37:Client.d - (Client.c >= 900?37:74) - 267);

                  for(var7 = 0; var7 < var6.length; ++var7) {
                     if((var8 = var6[var7]) != null && var8.b == 0 && var8.w > 0) {
                        var9 = var8.b() + var4;
                        var10 = var8.c() + var5;
                        if(var11.au > var9 && var11.av > var10 && var11.au < var9 + var8.d() && var11.av < var10 + var8.e()) {
                           var8.x += var13 * 30;
                           Client.Q = true;
                           var10000 = true;
                           break label185;
                        }
                     }
                  }
               }

               if(Client.v != -1) {
                  var6 = m.a[Client.v];
                  var4 = Client.a == b.a?4:Client.c / 2 - 356;
                  var5 = Client.a == b.a?4:Client.d / 2 - 230;

                  for(var7 = 0; var7 < var6.length; ++var7) {
                     if((var8 = var6[var7]) != null && var8.b == 0 && var8.w > 0) {
                        var9 = var8.b() + var4;
                        var10 = var8.c() + var5;
                        if(var11.au > var9 && var11.av > var10 && var11.au < var9 + var8.d() && var11.av < var10 + var8.e()) {
                           var8.x += var13 * 30;
                           var10000 = true;
                           break label185;
                        }
                     }
                  }
               }
            }

            var10000 = false;
         }

         if(!var10000) {
            if(Client.k.aj == -1 && Client.k.b()) {
               int var12 = (int)Client.t.b().getHeight();
               if(Client.k.ad >= 3 && Client.k.ad <= 5) {
                  if((var13 = Client.i + var2 * 30) > Client.j) {
                     var13 = Client.j;
                  }

                  if(var13 < 0) {
                     var13 = 0;
                  }

                  if(Client.i != var13) {
                     Client.i = var13;
                     Client.ac = true;
                     return;
                  }
               } else {
                  if((var13 = Client.G - var2 * 30) > Client.aa - var12) {
                     var13 = Client.aa - var12;
                  }

                  if(var13 < 0) {
                     var13 = 0;
                  }

                  if(Client.G != var13) {
                     Client.G = var13;
                     Client.ac = true;
                     return;
                  }
               }
            } else if(aE.g && Client.e().c()) {
               if(Client.v != -1 || Client.H <= Client.I && var2 < 0 || Client.H >= Client.J && var2 > 0) {
                  return;
               }

               Client.H += var2 * 25;
            }

         }
      }
   }

   public final void mousePressed(MouseEvent var1) {
      int var2 = var1.getButton();
      int var3 = var1.getX();
      int var4 = var1.getY();
      if(this.aq != null) {
         Insets var5 = this.aq.getInsets();
         var3 -= var5.left;
         var4 -= var5.top;
      }

      this.as = 0;
      this.h = var3;
      this.i = var4;
      this.j = System.currentTimeMillis();
      if(var2 != 2 && (!this.aC || var2 != 1 && var2 != 3)) {
         if(var1.getButton() == 3) {
            this.aB = 1;
            this.g = 2;
            this.at = 2;
         } else {
            this.aB = 0;
            this.g = 1;
            this.at = 1;
         }
      } else {
         this.aB = 5;
         this.w = var3;
         this.x = var4;
      }
   }

   public final void mouseReleased(MouseEvent var1) {
      int var2 = var1.getX();
      int var4 = var1.getY();
      if(this.aq != null) {
         Insets var3 = this.aq.getInsets();
         var2 -= var3.left;
         var4 -= var3.top;
      }

      this.u = var2;
      this.v = var4;
      this.as = 0;
      this.at = 0;
      this.aB = 3;
   }

   public final void mouseClicked(MouseEvent var1) {}

   public final void mouseEntered(MouseEvent var1) {}

   public final void mouseExited(MouseEvent var1) {
      this.as = 0;
      this.au = -1;
      this.av = -1;
   }

   public final void mouseDragged(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      if(this.aq != null) {
         Insets var4 = this.aq.getInsets();
         var2 -= var4.left;
         var3 -= var4.top;
      }

      if(Client.b > 1) {
         var2 /= Client.b;
         var3 /= Client.b;
      }

      if(this.aB == 5) {
         int var5 = this.w - var1.getX();
         var2 = this.x - var1.getY();
         if(Client.e() != null) {
            Client.e().a(var5, -var2);
         }

         this.w = var1.getX();
         this.x = var1.getY();
      } else {
         this.as = 0;
         this.au = var2;
         this.av = var3;
         this.aB = 2;
      }
   }

   public final void mouseMoved(MouseEvent var1) {
      int var2 = var1.getX();
      int var4 = var1.getY();
      if(this.aq != null) {
         Insets var3 = this.aq.getInsets();
         var2 -= var3.left;
         var4 -= var3.top;
         if(Client.b > 1) {
            var2 /= Client.b;
            var4 /= Client.b;
         }
      }

      this.as = 0;
      this.au = var2;
      this.av = var4;
      this.aB = 4;
   }

   public final void keyPressed(KeyEvent var1) {
      this.as = 0;
      int var2 = var1.getKeyCode();
      int var3;
      if((var3 = var1.getKeyChar()) < 30) {
         var3 = 0;
      }

      if(var2 == 37) {
         var3 = 1;
      }

      if(var2 == 39) {
         var3 = 2;
      }

      if(var2 == 38) {
         var3 = 3;
      }

      if(var2 == 40) {
         var3 = 4;
      }

      if(var2 == 17) {
         var3 = 5;
      }

      if(var2 == 8) {
         var3 = 8;
      }

      if(var2 == 127) {
         var3 = 8;
      }

      if(var2 == 9) {
         var3 = 9;
      }

      if(var2 == 10) {
         var3 = 10;
      }

      if(var2 >= 112 && var2 <= 123) {
         var3 = var2 + 1008 - 112;
      }

      if(var2 == 36) {
         var3 = 1000;
      }

      if(var2 == 35) {
         var3 = 1001;
      }

      if(var2 == 33) {
         var3 = 1002;
      }

      if(var2 == 34) {
         var3 = 1003;
      }

      if(var2 == 112) {
         Client.b(aE.o[0]);
      } else if(var2 == 113) {
         Client.b(aE.o[1]);
      } else if(var2 == 114) {
         Client.b(aE.o[2]);
      } else if(var2 == 115) {
         Client.b(aE.o[3]);
      } else if(var2 == 116) {
         Client.b(aE.o[4]);
      } else if(var2 == 117) {
         Client.b(aE.o[5]);
      } else if(var2 == 118) {
         Client.b(aE.o[6]);
      } else if(var2 == 119) {
         Client.b(aE.o[7]);
      } else if(var2 == 120) {
         Client.b(aE.o[8]);
      } else if(var2 == 121) {
         Client.b(aE.o[9]);
      } else if(var2 == 122) {
         Client.b(aE.o[10]);
      } else if(var2 == 123) {
         Client.b(aE.o[11]);
      } else if(var2 == 18) {
         this.aC = true;
      }

      if(var3 > 0 && var3 < 128) {
         this.az[var3] = 1;
      }

      if(var3 > 4) {
         this.l[this.n] = var3;
         this.n = this.n + 1 & 127;
      }

   }

   public final void keyReleased(KeyEvent var1) {
      this.as = 0;
      int var2 = var1.getKeyCode();
      char var3;
      if((var3 = var1.getKeyChar()) < 30) {
         var3 = 0;
      }

      if(var2 == 37) {
         var3 = 1;
      }

      if(var2 == 39) {
         var3 = 2;
      }

      if(var2 == 38) {
         var3 = 3;
      }

      if(var2 == 40) {
         var3 = 4;
      }

      if(var2 == 17) {
         var3 = 5;
      }

      if(var2 == 8) {
         var3 = 8;
      }

      if(var2 == 127) {
         var3 = 8;
      }

      if(var2 == 9) {
         var3 = 9;
      }

      if(var2 == 10) {
         var3 = 10;
      }

      if(var2 == 18) {
         this.aC = false;
      }

      if(var3 > 0 && var3 < 128) {
         this.az[var3] = 0;
      }

   }

   public final void keyTyped(KeyEvent var1) {}

   public final int m() {
      int var1 = -1;
      if(this.n != this.m) {
         var1 = this.l[this.m];
         this.m = this.m + 1 & 127;
      }

      return var1;
   }

   public final void focusGained(FocusEvent var1) {
      this.ar = true;
      this.f = true;
      this.k();
   }

   public final void focusLost(FocusEvent var1) {
      this.ar = false;

      for(int var2 = 0; var2 < 128; ++var2) {
         this.az[var2] = 0;
      }

      this.aC = false;
   }

   public final void windowActivated(WindowEvent var1) {}

   public final void windowClosed(WindowEvent var1) {}

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {}

   public final void windowDeiconified(WindowEvent var1) {}

   public final void windowIconified(WindowEvent var1) {}

   public final void windowOpened(WindowEvent var1) {}

   public void h() {}

   public void f() {}

   public void d() {}

   public void i() {}

   public void k() {}

   Component g() {
      return (Component)(this.aq != null?this.aq:this);
   }

   public void a(Runnable var1, int var2) {
      Thread var3;
      (var3 = new Thread(var1)).start();
      var3.setPriority(var2);
   }

   void a(int var1, String var2) {
      while(this.ao == null) {
         this.ao = this.aq.getGraphics();

         try {
            this.g().repaint();
         } catch (Exception var9) {
            ;
         }

         try {
            Thread.sleep(1000L);
         } catch (Exception var8) {
            ;
         }
      }

      Font var3 = new Font("Helvetica", 1, 13);
      FontMetrics var4 = this.g().getFontMetrics(var3);
      Font var5 = new Font("Helvetica", 0, 13);
      FontMetrics var10 = this.g().getFontMetrics(var5);
      if(this.f) {
         this.ao.setColor(Color.black);
         this.ao.fillRect(0, 0, Client.c, Client.d);
         this.f = false;
      }

      Color var6 = new Color(140, 17, 17);
      int var7 = Client.d * Client.b / 2 - 18;
      this.ao.setColor(var6);
      this.ao.drawRect(Client.c * Client.b / 2 - 152, var7, 304, 34);
      this.ao.fillRect(Client.c * Client.b / 2 - 150, var7 + 2, var1 * 3, 30);
      this.ao.setColor(Color.black);
      this.ao.fillRect(Client.c * Client.b / 2 - 150 + var1 * 3, var7 + 2, 300 - var1 * 3, 30);
      this.ao.setFont(var3);
      this.ao.setColor(Color.white);
      this.ao.drawString(var2, (Client.c * Client.b - var4.stringWidth(var2)) / 2, var7 + 22);
      this.ao.drawString("", (Client.c * Client.b - var10.stringWidth("")) / 2, var7 - 8);
   }

}
