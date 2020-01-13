package uwotm8;

import uwotm8.I;
import uwotm8.K;

public final class ay {

   private static int[] a;
   private static char[][] b;
   private static byte[][][] c;
   private static char[][] d;
   private static int[] e;


   static {
      String[] var10000 = new String[]{"cook", "cook\'s", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
   }

   public static void a(I var0) {
      K var1 = new K(var0.b("fragmentsenc.txt"));
      K var2 = new K(var0.b("badenc.txt"));
      K var3 = new K(var0.b("domainenc.txt"));
      K var9 = new K(var0.b("tldlist.txt"));
      K var10000 = var1;
      K var10001 = var2;
      K var10002 = var3;
      var3 = var9;
      var2 = var10002;
      var1 = var10001;
      var9 = var10000;
      int var4;
      b = new char[var4 = var1.k()][];
      c = new byte[var4][][];
      byte[][][] var7 = c;
      char[][] var6 = b;
      K var5 = var1;

      for(int var10 = 0; var10 < var6.length; ++var10) {
         char[] var12 = new char[var5.f()];

         for(int var8 = 0; var8 < var12.length; ++var8) {
            var12[var8] = (char)var5.f();
         }

         var6[var10] = var12;
         byte[][] var18 = new byte[var5.f()][2];

         for(var4 = 0; var4 < var18.length; ++var4) {
            var18[var4][0] = (byte)var5.f();
            var18[var4][1] = (byte)var5.f();
         }

         if(var18.length > 0) {
            var7[var10] = var18;
         }
      }

      char[][] var19 = new char[var2.k()][];
      K var15 = var2;
      char[][] var13 = var19;

      int var17;
      for(var17 = 0; var17 < var13.length; ++var17) {
         char[] var11 = new char[var15.f()];

         for(var4 = 0; var4 < var11.length; ++var4) {
            var11[var4] = (char)var15.f();
         }

         var13[var17] = var11;
      }

      var1 = var9;
      a = new int[var9.k()];

      for(var4 = 0; var4 < a.length; ++var4) {
         a[var4] = var1.h();
      }

      var1 = var3;
      d = new char[var4 = var3.k()][];
      e = new int[var4];

      for(int var14 = 0; var14 < var4; ++var14) {
         e[var14] = var1.f();
         char[] var16 = new char[var1.f()];

         for(var17 = 0; var17 < var16.length; ++var17) {
            var16[var17] = (char)var1.f();
         }

         d[var14] = var16;
      }

   }
}
