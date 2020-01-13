package uwotm8;

import java.io.DataInputStream;
import java.util.HashMap;
import java.util.Map;
import uwotm8.n;

public final class aG {

   private String b;
   private int c;
   private n[] d;
   private aG e;
   public final Map a;


   public aG(String var1) {
      this.d = null;
      this.a = new HashMap();
      this.b = var1.toLowerCase();
   }

   public aG(String var1, aG var2) {
      this(var1);
      this.e = var2;
   }

   public final void a(DataInputStream var1, DataInputStream var2) {
      this.c = var1.readInt();
      this.d = new n[this.c];

      for(int var8 = 0; var8 < this.c; ++var8) {
         short var3 = var2.readShort();
         short var4 = var2.readShort();
         short var5 = var2.readShort();
         short var6 = var2.readShort();
         byte[] var7 = new byte[var2.readInt()];
         var2.readFully(var7);
         n var9;
         (var9 = new n(var7)).g = var3;
         var9.h = var4;
         var9.e = var5;
         var9.f = var6;
         var9.a = var8;
         this.d[var8] = var9;
      }

   }

   public final n a(int var1) {
      return var1 >= 0 && var1 <= this.c?this.d[var1]:null;
   }

   public final boolean a() {
      return this.e != null;
   }

   public final String toString() {
      return this.b;
   }
}
