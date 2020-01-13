package uwotm8;

import uwotm8.M;

public class P extends M {

   public P aH;
   P aI;


   public final void F() {
      if(this.aI != null) {
         this.aI.aH = this.aH;
         this.aH.aI = this.aI;
         this.aH = null;
         this.aI = null;
      }

   }

}
