package net.aelysium.aelysiummod.datagen;

import net.aelysium.aelysiummod.AelysiumMod;
import net.aelysium.aelysiummod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AelysiumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.CIANE_CRU.get());
        basicItem(ModItems.CIANE_FRAGMENTO.get());
        basicItem(ModItems.CIANE_BARRA.get());

        basicItem(ModItems.CHAVERACHA1.get());
        basicItem(ModItems.CHAVERACHA2.get());
        basicItem(ModItems.CHAVERACHA3.get());
        basicItem(ModItems.CHAVERACHA4.get());
        basicItem(ModItems.CHAVERACHA5.get());
        basicItem(ModItems.CHAVERACHA6.get());
        basicItem(ModItems.CHAVERACHA7.get());
        basicItem(ModItems.CHAVERACHA8.get());

        basicItem(ModItems.ELEMENTO_FOGO.get());
        basicItem(ModItems.ELEMENTO_GELO.get());
        basicItem(ModItems.ELEMENTO_NATUREZA.get());
        basicItem(ModItems.ELEMENTO_RAIO.get());
        basicItem(ModItems.ELEMENTO_SACRA.get());
        basicItem(ModItems.ELEMENTO_SANGUE.get());
        basicItem(ModItems.ELEMENTO_VAZIO.get());

        basicItem(ModItems.CIANE_CAPACETE.get());
        basicItem(ModItems.CIANE_PEITORAL.get());
        basicItem(ModItems.CIANE_CALCINHA.get());
        basicItem(ModItems.CIANE_BOTAS.get());
    }
}