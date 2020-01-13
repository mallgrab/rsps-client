package uwotm8;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.FloatControl.Type;

public final class ax implements Runnable {

   private AudioInputStream b;
   private Info c;
   private Clip d;
   private InputStream e;
   private Thread f;
   private int g;
   private int h;
   public static int a;


   public ax(InputStream var1, int var2, int var3) {
      if(var2 != 0 && a != 4 && var2 - a > 0) {
         this.e = var1;
         this.h = var2;
         this.g = var3;
         this.f = new Thread(this);
         this.f.start();
      }
   }

   public final void run() {
      try {
         this.b = this.e instanceof AudioInputStream?(AudioInputStream)this.e:AudioSystem.getAudioInputStream(this.e);
         this.c = new Info(Clip.class, this.b.getFormat());
         this.d = (Clip)AudioSystem.getLine(this.c);
         this.d.open(this.b);
         if(this.d.isControlSupported(Type.MASTER_GAIN)) {
            FloatControl var10000 = (FloatControl)this.d.getControl(Type.MASTER_GAIN);
            float var10001;
            switch(this.h - a) {
            case 1:
               var10001 = -72.0F;
               break;
            case 2:
               var10001 = -64.0F;
               break;
            case 3:
               var10001 = -56.0F;
               break;
            case 4:
               var10001 = -48.0F;
               break;
            case 5:
               var10001 = -40.0F;
               break;
            case 6:
               var10001 = -32.0F;
               break;
            case 7:
               var10001 = -24.0F;
               break;
            case 8:
               var10001 = -16.0F;
               break;
            case 9:
               var10001 = -8.0F;
               break;
            case 10:
               var10001 = -0.0F;
               break;
            default:
               var10001 = 0.0F;
            }

            var10000.setValue(var10001);
         } else if(this.d.isControlSupported(Type.VOLUME)) {
            FloatControl var1;
            (var1 = (FloatControl)this.d.getControl(Type.VOLUME)).setValue((float)(this.h - a) / 10.0F * var1.getMaximum());
         }

         if(this.g > 0) {
            Thread.sleep((long)this.g);
         }

         this.d.start();

         while(this.d.isRunning()) {
            Thread.sleep(250L);
         }

         Thread.sleep(10000L);
         this.d.close();
         this.b.close();
         this.f.interrupt();
      } catch (Exception var2) {
         this.f.interrupt();
         var2.printStackTrace();
      }
   }
}
