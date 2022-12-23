import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CHESS = FabricItemGroupBuilder.build(
            new Identifier(chesstime.modid, "chess"), () -> new ItemStack(ModItems.CHESSTIMER));
}