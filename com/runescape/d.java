package com.runescape;

import com.runescape.Client;
import com.runescape.c;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import java.lang.reflect.Field;
import javax.swing.ImageIcon;

final class d extends Frame {

   private final c a;
   private Toolkit b = Toolkit.getDefaultToolkit();
   private Dimension c;
   private int d;
   private int e;
   private Insets f;


   public d(c var1, int var2, int var3, boolean var4, boolean var5) {
      this.c = this.b.getScreenSize();
      this.d = (int)this.c.getWidth();
      this.e = (int)this.c.getHeight();
      this.f = this.getInsets();
      this.a = var1;
      this.c = this.b.getScreenSize();
      this.d = (int)this.c.getWidth();
      this.e = (int)this.c.getHeight();
      ImageIcon var10 = new ImageIcon(d.class.getResource("icon.png"));
      this.setIconImage(var10.getImage());
      String var11 = "/v/scape 7.6.0";
      this.setTitle(var11);

      try {
         Toolkit var6;
         Field var7;
         (var7 = (var6 = Toolkit.getDefaultToolkit()).getClass().getDeclaredField("awtAppClassName")).setAccessible(true);
         var7.set(var6, var11);
      } catch (IllegalAccessException var9) {
         ;
      }

      this.setResizable(var4);
      this.setUndecorated(var5);
      this.setBackground(Color.BLACK);
      this.setLocationByPlatform(true);
      this.setVisible(true);
      this.f = this.getInsets();
      if(var4) {
         this.setMinimumSize(new Dimension(765 * Client.b + this.f.left + this.f.right, 503 * Client.b + this.f.top + this.f.bottom));
      }

      String var12 = System.getProperty("os.name").toLowerCase();
      if(var4 && var12.indexOf("mac") >= 0) {
         this.setSize(this.d, this.e);
      } else {
         this.setSize(var2 + this.f.left + this.f.right, var3 + this.f.top + this.f.bottom);
      }

      if(var12.indexOf("mac") >= 0) {
         try {
            Thread.sleep(100L);
         } catch (InterruptedException var8) {
            var8.printStackTrace();
         }
      }

      this.setVisible(true);
      this.setFocusTraversalKeysEnabled(false);
      this.requestFocus();
      this.toFront();
   }

   public final Graphics getGraphics() {
      Graphics var1 = super.getGraphics();
      Insets var2 = this.getInsets();
      var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      var1.translate(var2 != null?var2.left:0, var2 != null?var2.top:0);
      return var1;
   }

   public final int a() {
      Insets var1 = this.getInsets();
      return this.getHeight() - (var1.top + var1.bottom);
   }

   public final void update(Graphics var1) {
      this.a.update(var1);
   }

   public final void paint(Graphics var1) {
      this.a.paint(var1);
   }
}
