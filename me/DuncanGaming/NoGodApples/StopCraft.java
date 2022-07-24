/*    */ package me.DuncanGaming.NoGodApples;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.inventory.CraftItemEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ public class StopCraft
/*    */   implements Listener
/*    */ {
/*    */   public StopCraft(NoGodApples noGodApples) {}
/*    */   
/*    */   public void craftApple(CraftItemEvent e) {
/* 16 */     Material result = e.getRecipe().getResult().getType();
/* 17 */     ItemStack item = e.getRecipe().getResult();
/* 18 */     Material godapple = Material.GOLDEN_APPLE;
/* 19 */     String s = "1";
/* 20 */     Short durability = Short.valueOf(s);
/*    */ 
/*    */     
/* 23 */     if (result == godapple) {
/* 24 */       e.getWhoClicked().sendMessage("That isn't allowed");
/* 25 */       e.setCancelled(true);
/* 26 */       item.setType(Material.BARRIER);
/* 27 */       ItemMeta meta = item.getItemMeta();
/* 28 */       meta.setDisplayName("God Apples are not craftable on this server!");
/*    */     } 
/*    */     
/* 31 */     if (item.getType() == Material.BARRIER && item.getItemMeta().getDisplayName().equals("God Apples are not craftable on this server"))
/* 32 */       e.setCancelled(true); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Duncan Wijnberg\Downloads\NoGodApples.jar!\me\DuncanGaming\NoGodApples\StopCraft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */