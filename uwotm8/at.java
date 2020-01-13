package uwotm8;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.MidiDevice.Info;

public final class at implements Receiver {

   private int a;
   private final int[] b = new int[16];
   private final Receiver c;
   private final Sequencer d;


   public at() {
      this.e();
      Receiver var1 = null;
      Sequencer var2 = null;

      try {
         var1 = MidiSystem.getReceiver();
         (var2 = MidiSystem.getSequencer(false)).getTransmitter().setReceiver(this);
         var2.open();
      } catch (Exception var7) {
         Exception var3 = var7;

         try {
            System.out.println(var3);
            System.out.println("Trying Windows 10 Midi device compatability");
            int var8 = -1;
            Info[] var4 = MidiSystem.getMidiDeviceInfo();

            for(int var5 = 0; var5 < var4.length; ++var5) {
               System.out.println("Midi device: " + var4[var5].getName());
               if(var4[var5].getName().equals("Microsoft MIDI Mapper") || var4[var5].getName().equals("Real Time Sequencer")) {
                  var8 = var5;
                  break;
               }
            }

            if(var8 >= 0) {
               System.out.println("Selecting Midi device " + var4[var8]);
               MidiSystem.getMidiDevice(var4[var8]);
               var1 = MidiSystem.getMidiDevice(var4[var8]).getReceiver();
               (var2 = MidiSystem.getSequencer()).getTransmitter().setReceiver(var1);
               var2.getTransmitter().setReceiver(this);
               var2.open();
            }
         } catch (Exception var6) {
            System.out.println(var6);
            System.out.println("Something went really wrong, bug a dev for better sound support :^)");
         }
      }

      this.c = var1;
      this.d = var2;
      this.c();
   }

   public final synchronized void a(int var1) {
      this.b(var1);
   }

   public final synchronized void a(boolean var1) {
      if(this.d != null) {
         this.d.setLoopCount(var1?-1:0);
      }

   }

   public final void a(byte[] var1, boolean var2, int var3) {
      try {
         if(this.d != null) {
            Sequence var6 = MidiSystem.getSequence(new ByteArrayInputStream(var1));
            this.d.setSequence(var6);
            this.d.setLoopCount(var2?-1:0);
            this.b(var3);
            this.d.start();
            return;
         }
      } catch (InvalidMidiDataException var4) {
         return;
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public final boolean a() {
      return this.d == null?false:this.d.isRunning();
   }

   public final void b() {
      if(this.d != null) {
         this.d.stop();
      }

      this.c();
   }

   private void c() {
      int var1;
      for(var1 = 0; var1 != 16; ++var1) {
         this.a(var1 + 176, 123, 0, -1L);
      }

      for(var1 = 0; var1 != 16; ++var1) {
         this.a(var1 + 176, 120, 0, -1L);
      }

      for(var1 = 0; var1 != 16; ++var1) {
         this.a(var1 + 176, 121, 0, -1L);
      }

      for(var1 = 0; var1 != 16; ++var1) {
         this.a(var1 + 176, 0, 0, -1L);
      }

      for(var1 = 0; var1 != 16; ++var1) {
         this.a(var1 + 176, 32, 0, -1L);
      }

      for(var1 = 0; var1 != 16; ++var1) {
         this.a(var1 + 192, 0, 0, -1L);
      }

   }

   private void a(int var1, int var2, int var3, long var4) {
      try {
         if(this.c != null) {
            ShortMessage var6;
            (var6 = new ShortMessage()).setMessage(var1, var2, var3);
            this.c.send(var6, var4);
            return;
         }
      } catch (InvalidMidiDataException var7) {
         ;
      }

   }

   private void d() {
      for(int var1 = 0; var1 != 16; ++var1) {
         int var2 = this.c(var1);
         this.a(var1 + 176, 7, var2 >>> 7, -1L);
         this.a(var1 + 176, 39, var2 & 127, -1L);
      }

   }

   private void b(int var1) {
      var1 = (int)((double)var1 * Math.pow(0.1D, 0.0D) + 0.5D);
      if(this.a != var1) {
         this.a = var1;
         this.d();
      }
   }

   private int c(int var1) {
      return (int)(Math.sqrt((double)(((var1 = this.b[var1]) * this.a >>> 8) * var1)) + 0.5D);
   }

   private void e() {
      for(int var1 = 0; var1 != 16; ++var1) {
         this.b[var1] = 12800;
      }

   }

   private boolean b(int var1, int var2, int var3, long var4) {
      if((var1 & 240) == 176) {
         int var6;
         if(var2 == 121) {
            this.a(var1, var2, var3, var4);
            var6 = var1 & 15;
            this.b[var6] = 12800;
            var2 = this.c(var6);
            this.a(var1, 7, var2 >>> 7, var4);
            this.a(var1, 39, var2 & 127, var4);
            return true;
         }

         if(var2 == 7 || var2 == 39) {
            var6 = var1 & 15;
            if(var2 == 7) {
               this.b[var6] = this.b[var6] & 127 | var3 << 7;
            } else {
               this.b[var6] = this.b[var6] & 16256 | var3;
            }

            var2 = this.c(var6);
            this.a(var1, 7, var2 >>> 7, var4);
            this.a(var1, 39, var2 & 127, var4);
            return true;
         }
      }

      return false;
   }

   public final synchronized void send(MidiMessage var1, long var2) {
      byte[] var4;
      if(this.c != null && ((var4 = var1.getMessage()).length < 3 || !this.b(var4[0], var4[1], var4[2], var2))) {
         this.c.send(var1, var2);
      }

   }

   public final void close() {}

   protected final void finalize() {
      try {
         if(this.d != null) {
            this.d.close();
         }

         if(this.c != null) {
            this.c.close();
         }
      } finally {
         super.finalize();
      }

   }
}
