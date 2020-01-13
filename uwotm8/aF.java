package uwotm8;

import com.runescape.Client;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import uwotm8.ao;

public final class aF {

   private Client a;
   private final int b = 1024;
   private int c = 0;
   private String d = ao.a() + d();


   public aF(Client var1) {
      this.a = var1;
   }

   public static int a() {
      BufferedReader var0 = new BufferedReader(new InputStreamReader((new URL("http://vidyascape.org/files/cache/versionLive.dat")).openStream()));

      try {
         String var1;
         if((var1 = var0.readLine()) != null) {
            var0.close();
            return Integer.parseInt(var1);
         } else {
            var0.close();
            return 0;
         }
      } catch (IOException var2) {
         System.out.println("problem reading remote cache version");
         var0.close();
         return 0;
      }
   }

   public static int b() {
      File var0;
      if(!(var0 = new File(ao.a() + "cacheVersion.dat")).exists()) {
         return 0;
      } else {
         BufferedReader var1 = null;
         boolean var8 = false;

         int var16;
         label126: {
            label127: {
               try {
                  var8 = true;
                  String var15;
                  if((var15 = (var1 = new BufferedReader(new FileReader(var0))).readLine()) != null) {
                     var16 = Integer.parseInt(var15);
                     var8 = false;
                     break label126;
                  }

                  var8 = false;
               } catch (Exception var13) {
                  var13.printStackTrace();
                  var8 = false;
                  break label127;
               } finally {
                  if(var8) {
                     try {
                        if(var1 != null) {
                           var1.close();
                        }
                     } catch (Exception var9) {
                        ;
                     }

                  }
               }

               try {
                  var1.close();
               } catch (Exception var11) {
                  ;
               }

               return 0;
            }

            try {
               if(var1 != null) {
                  var1.close();
                  return 0;
               }
            } catch (Exception var12) {
               ;
            }

            return 0;
         }

         try {
            var1.close();
         } catch (Exception var10) {
            ;
         }

         return var16;
      }
   }

   public final aF c() {
      try {
         int var1 = a();
         this.c = b();
         if(var1 == this.c) {
            return null;
         }

         if(!this.a("http://vidyascape.org/files/cache/live.zip", d())) {
            return null;
         }

         if(!this.e()) {
            return null;
         }

         this.c = var1;
         aF var17 = this;
         File var2 = new File(ao.a() + "cacheVersion.dat");
         BufferedWriter var3 = null;
         boolean var10 = false;

         label117: {
            try {
               var10 = true;
               (var3 = new BufferedWriter(new FileWriter(var2))).write(String.valueOf(var17.c));
               var3.flush();
               var3.close();
               var10 = false;
               break label117;
            } catch (Exception var14) {
               var14.printStackTrace();
               var10 = false;
            } finally {
               if(var10) {
                  try {
                     if(var3 != null) {
                        var3.close();
                     }
                  } catch (Exception var11) {
                     ;
                  }

               }
            }

            try {
               if(var3 != null) {
                  var3.close();
                  return null;
               }
            } catch (Exception var13) {
               ;
            }

            return null;
         }

         try {
            var3.close();
         } catch (Exception var12) {
            ;
         }
      } catch (Exception var16) {
         var16.printStackTrace();
      }

      return null;
   }

   private boolean a(String var1, String var2) {
      BufferedOutputStream var3 = null;
      InputStream var4 = null;
      int var5 = 0;
      boolean var15 = false;

      label127: {
         try {
            var15 = true;
            URL var21 = new URL(var1);
            var3 = new BufferedOutputStream(new FileOutputStream(ao.a() + var2));
            URLConnection var22;
            var4 = (var22 = var21.openConnection()).getInputStream();
            byte[] var24 = new byte[1024];
            long var8 = 0L;
            int var6 = var22.getContentLength();

            int var23;
            while((var23 = var4.read(var24)) != -1) {
               var3.write(var24, 0, var23);
               if((var23 = (int)((double)(var8 += (long)var23) / (double)var6 * 100.0D)) > var5) {
                  String var7 = "Downloading Cache " + var23 + "%";
                  this.a.a(var23, var7);
                  System.out.println(var7);
                  var5 = var23;
               }
            }

            String var25 = "Finished downloading cache!";
            this.a.a(35, var25);
            System.out.println(var25);
            var15 = false;
            break label127;
         } catch (Exception var19) {
            var19.printStackTrace();
            var15 = false;
         } finally {
            if(var15) {
               try {
                  if(var4 != null) {
                     var4.close();
                  }

                  if(var3 != null) {
                     var3.close();
                  }
               } catch (IOException var16) {
                  ;
               }

            }
         }

         try {
            if(var4 != null) {
               var4.close();
            }

            if(var3 != null) {
               var3.close();
            }
         } catch (IOException var17) {
            ;
         }

         return false;
      }

      try {
         if(var4 != null) {
            var4.close();
         }

         var3.close();
      } catch (IOException var18) {
         ;
      }

      return true;
   }

   private static String d() {
      int var0;
      if((var0 = "http://vidyascape.org/files/cache/live.zip".lastIndexOf(47)) >= 0 && var0 < 41) {
         return "http://vidyascape.org/files/cache/live.zip".substring(var0 + 1);
      } else {
         System.err.println("error retreiving archivaed name.");
         return "";
      }
   }

   private boolean e() {
      try {
         BufferedInputStream var1 = new BufferedInputStream(new FileInputStream(this.d));
         ZipInputStream var6 = new ZipInputStream(var1);

         ZipEntry var2;
         while((var2 = var6.getNextEntry()) != null) {
            String var3 = var2.getName();
            File var4 = new File(ao.a(), var3);
            if(var2.isDirectory()) {
               var4.mkdir();
            } else {
               if(var3.equals(this.d)) {
                  a(var6, this.d);
                  break;
               }

               if(!var3.equals("settings.ini") && (!var4.exists() || !var3.endsWith("background_custom.png") && !var3.endsWith("mascot_chat.png") && !var3.endsWith("mascot_inv.png"))) {
                  a(var6, var4.getAbsolutePath());
               }
            }
         }

         var6.close();
         File var7;
         String var8 = (var7 = new File(this.d)).getName();
         if(!var7.exists()) {
            throw new IllegalArgumentException("Cache Delete: no such file or directory: ".concat(String.valueOf(var8)));
         } else if(!var7.canWrite()) {
            throw new IllegalArgumentException("Cache Delete: write protected: ".concat(String.valueOf(var8)));
         } else if(var7.isDirectory() && var7.list().length > 0) {
            throw new IllegalArgumentException("Cache Delete: directory not empty: ".concat(String.valueOf(var8)));
         } else if(!var7.delete()) {
            throw new IllegalArgumentException("Cache Delete: deletion failed");
         } else {
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return false;
      }
   }

   private static void a(ZipInputStream var0, String var1) {
      FileOutputStream var4 = new FileOutputStream(var1);
      byte[] var2 = new byte[1024];

      int var3;
      while((var3 = var0.read(var2)) != -1) {
         var4.write(var2, 0, var3);
      }

      var4.close();
   }
}
