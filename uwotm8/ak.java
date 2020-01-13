package uwotm8;

import java.net.InetSocketAddress;
import java.net.Socket;
import uwotm8.al;

public final class ak extends Thread {

   private final String a;
   private final al b;
   private boolean c;


   public ak(String var1, al var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void start() {
      this.c = true;
      super.start();
   }

   public final void run() {
      InetSocketAddress var1 = new InetSocketAddress(this.a, 80);

      while(this.c) {
         int var2 = 3000;
         long var3 = System.currentTimeMillis();
         Socket var5 = new Socket();

         try {
            var5.setReuseAddress(true);
            var5.connect(var1, 3000);
            var2 = (int)(System.currentTimeMillis() - var3);
         } catch (Exception var14) {
            ;
         } finally {
            try {
               var5.close();
            } catch (Exception var12) {
               ;
            }

         }

         this.b.a(var2);

         try {
            sleep(5000L);
         } catch (Exception var13) {
            ;
         }
      }

   }

   public final void a() {
      this.c = false;
   }
}
