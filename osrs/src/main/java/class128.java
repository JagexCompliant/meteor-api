import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
class class128 implements Callable {
    @ObfuscatedName("fg")
    @ObfuscatedSignature(
            descriptor = "Lnd;"
    )
    static Archive archive13;
   // $FF: synthetic field
   @ObfuscatedSignature(
           descriptor = "Lfh;"
   )
   @ObfuscatedName("this$0")
   final class133 this$0;
   // $FF: synthetic field
   @ObfuscatedName("val$workStart")
   final int val$workStart;
   // $FF: synthetic field
   @ObfuscatedName("val$workEnd")
   final int val$workEnd;
   // $FF: synthetic field
   @ObfuscatedSignature(
           descriptor = "[Leh;"
   )
   @ObfuscatedName("val$curveLoadJobs")
   final class124[] val$curveLoadJobs;

   @ObfuscatedSignature(
      descriptor = "(Lfh;II[Leh;)V"
   )
   class128(class133 var1, int var2, int var3, class124[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

    @ObfuscatedName("call")
    public Object call() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }
}
