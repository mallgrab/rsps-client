package uwotm8;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import uwotm8.K;
import uwotm8.b;

public final class I {

   private final byte[] a;
   private final int b;
   private final int[] c;
   private final int[] d;
   private final int[] e;
   private final int[] f;
   private final boolean g;


   public static byte[] a(String var0) {
      try {
         RandomAccessFile var7;
         MappedByteBuffer var1 = (var7 = new RandomAccessFile(var0, "r")).getChannel().map(MapMode.READ_ONLY, 0L, var7.length());

         byte[] var8;
         try {
            if(!var1.hasArray()) {
               byte[] var2 = new byte[var1.remaining()];
               var1.get(var2);
               var8 = var2;
               return var8;
            }

            var8 = var1.array();
         } finally {
            var7.close();
         }

         return var8;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public I(byte[] var1) {
      K var2;
      int var3 = (var2 = new K(var1)).j();
      int var4;
      if((var4 = var2.j()) != var3) {
         byte[] var5;
         b.a(var5 = new byte[var3], var3, var1, var4, 6);
         this.a = var5;
         var2 = new K(this.a);
         this.g = true;
      } else {
         this.a = var1;
         this.g = false;
      }

      this.b = var2.h();
      this.c = new int[this.b];
      this.d = new int[this.b];
      this.e = new int[this.b];
      this.f = new int[this.b];
      int var7 = var2.b + this.b * 10;

      for(int var6 = 0; var6 < this.b; ++var6) {
         this.c[var6] = var2.k();
         this.d[var6] = var2.j();
         this.e[var6] = var2.j();
         this.f[var6] = var7;
         var7 += this.e[var6];
      }

   }

   public final byte[] b(String var1) {
      int var2 = 0;
      var1 = var1.toUpperCase();

      int var3;
      for(var3 = 0; var3 < var1.length(); ++var3) {
         var2 = var2 * 61 + var1.charAt(var3) - 32;
      }

      for(var3 = 0; var3 < this.b; ++var3) {
         if(this.c[var3] == var2) {
            byte[] var4 = new byte[this.d[var3]];
            if(!this.g) {
               b.a(var4, this.d[var3], this.a, this.e[var3], this.f[var3]);
            } else {
               System.arraycopy(this.a, this.f[var3], var4, 0, this.d[var3]);
            }

            return var4;
         }
      }

      return null;
   }
}
