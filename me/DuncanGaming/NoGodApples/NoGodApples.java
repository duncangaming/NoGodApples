/*    */ package me.DuncanGaming.NoGodApples;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.inventory.Recipe;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class NoGodApples
/*    */   extends JavaPlugin
/*    */   implements Listener
/*    */ {
/*    */   public void onEnable() {
/* 16 */     PluginManager pm = getServer().getPluginManager();
/* 17 */     pm.registerEvents(new StopCraft(this), (Plugin)this);
/* 18 */     getServer().getPluginManager().registerEvents(this, (Plugin)this);
/*    */     
/* 20 */     Iterator<Recipe> it = getServer().recipeIterator();
/*    */     
/* 22 */     while (it.hasNext()) {
/*    */       
/* 24 */       Recipe recipe = it.next();
/* 25 */       if (recipe != null && recipe.getResult().getType() == Material.GOLDEN_APPLE && recipe.getResult().getDurability() == 1)
/*    */       {
/* 27 */         it.remove();
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public void onDisable() {}
/*    */ }


/* Location:              C:\Users\Duncan Wijnberg\Downloads\NoGodApples.jar!\me\DuncanGaming\NoGodApples\NoGodApples.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */