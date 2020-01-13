package uwotm8;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;

public final class ao implements Runnable {

   private static String j = "/.vscape2/";
   private final int k = 524288;
   public static int a;
   public static RandomAccessFile b = null;
   public static final RandomAccessFile[] c = new RandomAccessFile[8];
   public static boolean d;
   public static Applet e = null;
   private static boolean l_active;
   private static int m_threadliveid;
   private static String n = null;
   public static String f = null;
   public static int g;
   public static boolean h = true;
   public static String i;


   public static String a() {
      if((new File(System.getProperty("user.home") + j)).exists()) {
         return System.getProperty("user.home") + j;
      } else {
         (new File(System.getProperty("user.home") + j)).mkdir();
         return System.getProperty("user.home") + j;
      }
   }

   public static void b() {
      m_threadliveid = (int)(Math.random() * 9.9999999E7D);
      if(l_active) {
         try {
            Thread.sleep(500L);
         } catch (Exception var2) {
            ;
         }

         l_active = false;
      }

      n = null;
      Thread var0;
      (var0 = new Thread(new ao())).setDaemon(true);
      var0.start();

      while(!l_active) {
         try {
            Thread.sleep(50L);
         } catch (Exception var1) {
            ;
         }
      }

   }

   public final void run() {
      l_active = true;
      String var1;
      c(var1 = a());

      int var2;
      try {
         b = new RandomAccessFile(var1 + "main_file_cache.dat", "rw");

         for(var2 = 0; var2 < 8; ++var2) {
            c[var2] = new RandomAccessFile(var1 + "main_file_cache.idx" + var2, "rw");
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      var2 = m_threadliveid;

      while(m_threadliveid == var2) {
         if(n != null) {
            try {
               f = InetAddress.getByName(n).getHostName();
            } catch (Exception var3) {
               f = "unknown";
            }

            n = null;
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var4) {
            ;
         }
      }

   }

   private static int c(String var0) {
      try {
         File var1;
         if(!(var1 = new File(var0 + "uid.dat")).exists() || var1.length() < 4L) {
            DataOutputStream var2;
            (var2 = new DataOutputStream(new FileOutputStream(var0 + "uid.dat"))).writeInt((int)(Math.random() * 9.9999999E7D));
            var2.close();
         }
      } catch (Exception var4) {
         ;
      }

      try {
         DataInputStream var5;
         int var6 = (var5 = new DataInputStream(new FileInputStream(var0 + "uid.dat"))).readInt();
         var5.close();
         return var6 + 1;
      } catch (Exception var3) {
         return 0;
      }
   }

   public static synchronized void a(String var0) {
      f = var0;
      n = var0;
   }

   public static void b(String var0) {
      System.out.println("Error: ".concat(String.valueOf(var0)));
   }

}
