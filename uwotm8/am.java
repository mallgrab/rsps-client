package uwotm8;

import uwotm8.I;
import uwotm8.K;
import uwotm8.an;

public final class am {

   public static am[] a;
   public int b;
   public int c;
   public int d;
   private boolean e = false;
   private boolean f = true;
   private String g;
   private Integer h;
   private Integer i;


   public static void a(I var0) {
      K var6;
      int var1 = (var6 = new K(var0.b("varbit.dat"))).h();
      if(a == null) {
         a = new am[var1];
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         if(a[var2] == null) {
            a[var2] = new am();
         }

         am var10000 = a[var2];
         K var4 = var6;
         am var3 = var10000;

         int var5;
         while((var5 = var4.f()) != 0) {
            if(var5 == 1) {
               var3.b = var4.h();
               var3.c = var4.f();
               var3.d = var4.f();
            } else if(var5 == 10) {
               var3.g = var4.d();
            } else if(var5 == 2) {
               var3.e = true;
            } else if(var5 == 3) {
               var3.h = Integer.valueOf(var4.k());
            } else if(var5 == 4) {
               var3.i = Integer.valueOf(var4.k());
            } else if(var5 == 5) {
               var3.f = false;
            } else {
               System.out.println("Error unrecognised varbit opcode: ".concat(String.valueOf(var5)));
            }
         }

         if(a[var2].e) {
            an.a[a[var2].b].c = true;
         }
      }

      if(var6.b != var6.a.length) {
         System.out.println("varbit load mismatch");
      }

   }

}
