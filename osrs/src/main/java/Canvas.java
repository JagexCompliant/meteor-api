import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
    @ObfuscatedName("ay")
    @ObfuscatedSignature(
            descriptor = "Ltc;"
    )
    static IndexedSprite logoSprite;
    @ObfuscatedName("af")
    Component component;

   Canvas(Component var1) {
      this.component = var1;
   }

   public final void paint(Graphics var1) {
      this.component.paint(var1);
   }

   public final void update(Graphics var1) {
      this.component.update(var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1551365421"
   )
   public static int method91(int var0, int var1, int var2) {
      int var3 = class140.method806(var2 - var1 + 1);
      var3 <<= var1;
      return var0 & ~var3;
   }

   @ObfuscatedName("ne")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   static void method92() {
      Client.packetWriter.addNode(class330.getPacketBufferNode(ClientPacket.field2467, Client.packetWriter.isaacCipher));
      Client.oculusOrbState = 0;
   }
}
