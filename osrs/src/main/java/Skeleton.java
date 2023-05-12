import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Skeleton")
public class Skeleton extends Node {
    @ObfuscatedName("ab")
    int id;
    @ObfuscatedName("aq")
    int count;
    @ObfuscatedName("al")
    int[] transformTypes;
    @ObfuscatedName("at")
    int[][] labels;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   class219 field2010;

   public Skeleton(int var1, byte[] var2) {
      this.id = var1;
      Buffer var3 = new Buffer(var2);
      this.count = var3.readUnsignedByte();
      this.transformTypes = new int[this.count];
      this.labels = new int[this.count][];

      int var4;
      for(var4 = 0; var4 < this.count; ++var4) {
         this.transformTypes[var4] = var3.readUnsignedByte();
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         this.labels[var4] = new int[var3.readUnsignedByte()];
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         for(int var5 = 0; var5 < this.labels[var4].length; ++var5) {
            this.labels[var4][var5] = var3.readUnsignedByte();
         }
      }

      if (var3.offset < var3.array.length) {
         var4 = var3.readUnsignedShort();
         if (var4 > 0) {
            this.field2010 = new class219(var3, var4);
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "612928159"
   )
   public int method1234() {
      return this.count;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Lic;",
      garbageValue = "485057822"
   )
   public class219 method1235() {
      return this.field2010;
   }
}
