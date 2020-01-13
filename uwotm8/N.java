package uwotm8;

import uwotm8.M;
import uwotm8.ao;

final class N {

   private final int a = 1024;
   private final M[] b = new M[1024];


   public N() {
      for(int var1 = 0; var1 < 1024; ++var1) {
         M var2;
         this.b.aF = var2 = this.b[var1] = new M();
         var2.aG = var2;
      }

   }

   public final M a(long var1) {
      M var3;
      for(M var4 = (var3 = this.b[(int)(var1 & 1023L)]).aF; var4 != var3; var4 = var4.aF) {
         if(var4.aE == var1) {
            return var4;
         }
      }

      return null;
   }

   public final void a(M var1, long var2) {
      try {
         if(var1.aG != null) {
            var1.E();
         }

         M var4 = this.b[(int)(var2 & 1023L)];
         var1.aG = var4.aG;
         var1.aF = var4;
         var1.aG.aF = var1;
         var1.aF.aG = var1;
         var1.aE = var2;
      } catch (RuntimeException var5) {
         ao.b("91499, " + var1 + ", " + var2 + ", 7, " + var5.toString());
         throw new RuntimeException();
      }
   }
}
