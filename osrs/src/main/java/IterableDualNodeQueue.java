import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("IterableDualNodeQueue")
public class IterableDualNodeQueue implements Iterable {
    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "Lrk;"
    )
    public DualNode sentinel = new DualNode();
    @ObfuscatedName("an")
    @ObfuscatedSignature(
            descriptor = "Lrk;"
    )
    DualNode head;

   public IterableDualNodeQueue() {
      this.sentinel.previousDual = this.sentinel;
      this.sentinel.nextDual = this.sentinel;
   }

    @ObfuscatedName("af")
    public void clear() {
      while(this.sentinel.previousDual != this.sentinel) {
         this.sentinel.previousDual.removeDual();
      }

   }

    @ObfuscatedName("an")
    @ObfuscatedSignature(
            descriptor = "(Lrk;)V"
    )
    public void add(DualNode var1) {
      if (var1.nextDual != null) {
         var1.removeDual();
      }

      var1.nextDual = this.sentinel.nextDual;
      var1.previousDual = this.sentinel;
      var1.nextDual.previousDual = var1;
      var1.previousDual.nextDual = var1;
   }

    @ObfuscatedName("ac")
    @ObfuscatedSignature(
            descriptor = "()Lrk;"
    )
    public DualNode removeLast() {
      DualNode var1 = this.sentinel.previousDual;
      if (var1 == this.sentinel) {
         return null;
      } else {
         var1.removeDual();
         return var1;
      }
   }

    @ObfuscatedName("au")
    @ObfuscatedSignature(
            descriptor = "()Lrk;"
    )
    public DualNode last() {
      return this.previousOrLast((DualNode)null);
   }

    @ObfuscatedName("ab")
    @ObfuscatedSignature(
            descriptor = "(Lrk;)Lrk;"
    )
    DualNode previousOrLast(DualNode var1) {
      DualNode var2;
      if (var1 == null) {
         var2 = this.sentinel.previousDual;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.head = null;
         return null;
      } else {
         this.head = var2.previousDual;
         return var2;
      }
   }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(
            descriptor = "()Lrk;"
    )
    public DualNode previous() {
      DualNode var1 = this.head;
      if (var1 == this.sentinel) {
         this.head = null;
         return null;
      } else {
         this.head = var1.previousDual;
         return var1;
      }
   }

    @ObfuscatedName("iterator")
    public Iterator iterator() {
      return new IterableDualNodeQueueIterator(this);
   }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(
            descriptor = "(Lrk;Lrk;)V"
    )
    public static void DualNodeDeque_addBefore(DualNode var0, DualNode var1) {
      if (var0.nextDual != null) {
         var0.removeDual();
      }

      var0.nextDual = var1;
      var0.previousDual = var1.previousDual;
      var0.nextDual.previousDual = var0;
      var0.previousDual.nextDual = var0;
   }
}
