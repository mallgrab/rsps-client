package uwotm8;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public final class J {

   private static byte[] a = new byte[465000];


   public static final byte[] a(byte[] var0) {
      if(var0 == null) {
         return null;
      } else {
         int var1 = 0;

         try {
            GZIPInputStream var4 = new GZIPInputStream(new ByteArrayInputStream(var0));

            while(true) {
               if(var1 == a.length) {
                  throw new RuntimeException("buffer overflow!");
               }

               int var2;
               if((var2 = var4.read(a, var1, a.length - var1)) == -1) {
                  break;
               }

               var1 += var2;
            }
         } catch (IOException var3) {
            var3.printStackTrace();
            return null;
         }

         var0 = new byte[var1];
         System.arraycopy(a, 0, var0, 0, var1);
         return var0;
      }
   }
}
