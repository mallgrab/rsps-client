package uwotm8;

import uwotm8.P;

public final class Q {

   private final P a = new P();
   private P b;


   public Q() {
      this.a.aH = this.a;
      this.a.aI = this.a;
   }

   public final void a(P var1) {
      if(var1.aI != null) {
         var1.F();
      }

      var1.aI = this.a.aI;
      var1.aH = this.a;
      var1.aI.aH = var1;
      var1.aH.aI = var1;
   }

   public final P a() {
      P var1 = this.a.aH;
      if(this.a.aH == this.a) {
         return null;
      } else {
         var1.F();
         return var1;
      }
   }

   public final P b() {
      P var1 = this.a.aH;
      if(this.a.aH == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.aH;
         return var1;
      }
   }

   public final P c() {
      P var1 = this.b;
      if(this.b == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.aH;
         return var1;
      }
   }

   public final int d() {
      int var1 = 0;

      for(P var2 = this.a.aH; var2 != this.a; var2 = var2.aH) {
         ++var1;
      }

      return var1;
   }
}
