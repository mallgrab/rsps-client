package uwotm8;

import com.runescape.Client;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import uwotm8.aL;
import uwotm8.aM;
import uwotm8.aN;
import uwotm8.ao;

public final class aE {

   private static String p = ao.a() + "settings.ini";
   public static String a = "";
   public static String b = "";
   public static com.runescape.b c = com.runescape.b.a;
   public static int d = 766;
   public static int e = 529;
   public static int f = 4;
   public static boolean g = false;
   public static int h = 600;
   public static boolean i = true;
   public static boolean j = true;
   public static boolean k = false;
   public static boolean l = true;
   public static boolean m = false;
   public static boolean n = true;
   public static int[] o = new int[]{0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12};


   public static void a() {
      File var0 = new File(p);

      try {
         if(!var0.exists()) {
            var0.createNewFile();
         }
      } catch (IOException var11) {
         System.out.println("error writing settings file.");
      }

      if(var0.exists()) {
         try {
            Throwable var15 = null;

            try {
               BufferedWriter var1 = new BufferedWriter(new FileWriter(p));

               try {
                  var1.write("[CHARACTER]");
                  var1.newLine();
                  var1.write("remember = " + Client.V);
                  var1.newLine();
                  var1.write("username = " + (Client.V?Client.T:""));
                  var1.newLine();
                  var1.write("password = " + (Client.V?Client.U:""));
                  var1.newLine();
                  var1.newLine();
                  var1.write("[CHAT]");
                  var1.newLine();
                  var1.write("game = " + Client.k.o);
                  var1.newLine();
                  var1.write("clan = " + Client.k.m);
                  var1.newLine();
                  var1.write("global = " + Client.k.n);
                  var1.newLine();
                  var1.newLine();
                  var1.write("[GRAPHICAL]");
                  var1.newLine();
                  var1.write("sizeMode = " + c.toString());
                  var1.newLine();
                  var1.write("resizableW = " + Client.c * Client.b);
                  var1.newLine();
                  var1.write("resizableH = " + Client.d * Client.b);
                  var1.newLine();
                  var1.write("pixelScaling = " + Client.b);
                  var1.newLine();
                  var1.write("gameFrame = " + aL.b().toString());
                  var1.newLine();
                  var1.write("zoomControl = " + g);
                  var1.newLine();
                  var1.write("showRoofs = " + i);
                  var1.newLine();
                  var1.write("orbsEnabled = " + j);
                  var1.newLine();
                  var1.write("orbsOnRight = " + k);
                  if(!l) {
                     var1.newLine();
                     var1.write("oldCharacterShading = " + l);
                  }

                  if(m) {
                     var1.newLine();
                     var1.write("enableVertexBlending = " + m);
                  }

                  var1.newLine();
                  var1.newLine();
                  var1.write("[MISC]");
                  var1.newLine();
                  var1.write("loginMusic = " + Client.P);
                  var1.newLine();
                  var1.write("camDragSensitivity = " + f);
                  var1.newLine();
                  var1.write("middleMouseCamera = " + n);
                  var1.newLine();
                  if((h = Client.H) < Client.I) {
                     h = Client.I;
                  }

                  if(h > Client.J) {
                     h = Client.J;
                  }

                  var1.write("cameraZoom = " + h);
                  var1.newLine();
                  var1.newLine();
                  var1.write("[XPDROP]");
                  var1.newLine();
                  var1.write(aN.e());
                  var1.newLine();
                  var1.newLine();
                  var1.write("[HOTKEYS]");
                  var1.newLine();

                  for(int var2 = 0; var2 < 12; ++var2) {
                     var1.write("f" + (var2 + 1) + " = " + o[var2]);
                     var1.newLine();
                  }

                  var1.flush();
               } finally {
                  var1.close();
               }
            } catch (Throwable var13) {
               if(var15 == null) {
                  var15 = var13;
               } else if(var15 != var13) {
                  var15.addSuppressed(var13);
               }

               throw var15;
            }
         } catch (IOException var14) {
            System.out.println("error writing settings file.");
         }
      }

      a = Client.V?Client.T:"";
      b = Client.V?Client.U:"";
      d = Client.c * Client.b;
      e = Client.d * Client.b;
   }

   public static void b() {
      if((new File(p)).exists()) {
         String var2 = "";

         try {
            Throwable var3 = null;

            try {
               BufferedReader var4 = new BufferedReader(new FileReader(p));

               try {
                  for(String var0 = var4.readLine(); var0 != null; var0 = var4.readLine()) {
                     if((var0 = var0.trim()).startsWith("[") && var0.endsWith("]")) {
                        var2 = var0;
                     }

                     int var5;
                     if((var5 = var0.indexOf("=")) >= 0) {
                        String var1 = var0.substring(0, var5).trim();
                        if(!(var0 = var0.substring(var5 + 1).trim()).isEmpty() && var0.length() > 0) {
                           switch(var2.hashCode()) {
                           case -1833601947:
                              if(var2.equals("[GRAPHICAL]")) {
                                 switch(var1.hashCode()) {
                                 case -1915476702:
                                    if(var1.equals("showRoofs")) {
                                       i = Boolean.parseBoolean(var0);
                                       Client.e().b(163, i?0:1);
                                    }
                                    break;
                                 case -1050016632:
                                    if(var1.equals("oldCharacterShading")) {
                                       l = Boolean.parseBoolean(var0);
                                    }
                                    break;
                                 case -947934419:
                                    if(var1.equals("orbsEnabled")) {
                                       j = Boolean.parseBoolean(var0);
                                       Client.e().b(164, j?0:1);
                                    }
                                    break;
                                 case -676481175:
                                    if(var1.equals("orbsOnRight")) {
                                       k = Boolean.parseBoolean(var0);
                                    }
                                    break;
                                 case 22115850:
                                    if(var1.equals("zoomControl")) {
                                       g = Boolean.parseBoolean(var0);
                                       Client.e().b(162, g?1:0);
                                    }
                                    break;
                                 case 420478497:
                                    if(var1.equals("pixelScaling") && (Client.b = Integer.parseInt(var0)) != 1) {
                                       Client.a(com.runescape.b.a, Client.c, Client.d);
                                    }
                                    break;
                                 case 846767428:
                                    if(var1.equals("sizeMode")) {
                                       try {
                                          c = com.runescape.b.valueOf(var0);
                                       } catch (Exception var18) {
                                          c = com.runescape.b.a;
                                       }
                                    }
                                    break;
                                 case 977999003:
                                    if(var1.equals("gameFrame")) {
                                       try {
                                          aL.a(aM.valueOf(var0));
                                       } catch (Exception var17) {
                                          aL.a(aM.a);
                                       }
                                    }
                                    break;
                                 case 1195019288:
                                    if(var1.equals("enableVertexBlending")) {
                                       m = Boolean.parseBoolean(var0);
                                    }
                                    break;
                                 case 2046685949:
                                    if(var1.equals("resizableH")) {
                                       e = Integer.parseInt(var0);
                                    }
                                    break;
                                 case 2046685964:
                                    if(var1.equals("resizableW")) {
                                       d = Integer.parseInt(var0);
                                    }
                                 }
                              }
                              break;
                           case -1625628534:
                              if(var2.equals("[CHAT]")) {
                                 switch(var1.hashCode()) {
                                 case -1243020381:
                                    if(var1.equals("global")) {
                                       Client.k.n = Integer.parseInt(var0);
                                    }
                                    break;
                                 case 3056214:
                                    if(var1.equals("clan")) {
                                       Client.k.m = Integer.parseInt(var0);
                                    }
                                    break;
                                 case 3165170:
                                    if(var1.equals("game")) {
                                       Client.k.o = Integer.parseInt(var0);
                                    }
                                 }
                              }
                              break;
                           case -1616346762:
                              if(var2.equals("[MISC]")) {
                                 switch(var1.hashCode()) {
                                 case -2011938664:
                                    if(var1.equals("cameraZoom")) {
                                       if((h = Integer.parseInt(var0)) < Client.I) {
                                          h = Client.I;
                                       }

                                       if(h > Client.J) {
                                          h = Client.J;
                                       }
                                    }
                                    break;
                                 case -1764210628:
                                    if(var1.equals("loginMusic")) {
                                       Client.P = Boolean.parseBoolean(var0);
                                    }
                                    break;
                                 case 270258428:
                                    if(var1.equals("camDragSensitivity")) {
                                       if((f = Integer.parseInt(var0)) <= 0) {
                                          f = 1;
                                       }

                                       if(f > 10) {
                                          f = 10;
                                       }
                                    }
                                    break;
                                 case 1386253141:
                                    if(var1.equals("middleMouseCamera")) {
                                       n = Boolean.parseBoolean(var0);
                                       Client.e().b(165, n?0:1);
                                    }
                                 }
                              }
                              break;
                           case -1466451301:
                              if(var2.equals("[XPDROP]")) {
                                 aN.a(var1, var0);
                              }
                              break;
                           case -766703049:
                              if(var2.equals("[HOTKEYS]")) {
                                 for(var5 = 0; var5 < o.length; ++var5) {
                                    String var6 = "f" + (var5 + 1);
                                    if(var1.equals(var6)) {
                                       o[var5] = Integer.parseInt(var0);
                                       if(o[var5] > 13 || o[var5] < 0) {
                                          o[var5] = 0;
                                       }
                                    }
                                 }
                              }
                              break;
                           case 1416700175:
                              if(var2.equals("[CHARACTER]")) {
                                 switch(var1.hashCode()) {
                                 case -522328435:
                                    if(var1.equals("remember")) {
                                       Client.V = Boolean.parseBoolean(var0);
                                    }
                                    break;
                                 case -265713450:
                                    if(var1.equals("username")) {
                                       a = var0;
                                       Client.T = var0;
                                    }
                                    break;
                                 case 1216985755:
                                    if(var1.equals("password")) {
                                       b = var0;
                                       Client.U = var0;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               } finally {
                  var4.close();
               }

               return;
            } catch (Throwable var20) {
               if(var3 == null) {
                  var3 = var20;
               } else if(var3 != var20) {
                  var3.addSuppressed(var20);
               }

               throw var3;
            }
         } catch (IOException var21) {
            System.out.println("error writing settings file.");
         }
      }

   }
}
