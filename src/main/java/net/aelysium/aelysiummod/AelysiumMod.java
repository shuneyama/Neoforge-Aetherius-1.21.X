package net.aelysium.aelysiummod;

import com.natamus.collective_common_neoforge.check.ShouldLoadCheck;

import net.aelysium.aelysiummod.block.ModBlocks;
import net.aelysium.aelysiummod.command.Deus;
import net.aelysium.aelysiummod.command.Deus_Config;
import net.aelysium.aelysiummod.item.ModItems;

import net.aelysium.aelysiummod.particle.DamaDaNoiteParticula;
import net.aelysium.aelysiummod.particle.DamaVermelhaDaNoiteParticula;
import net.aelysium.aelysiummod.particle.ModParticles;
import net.aelysium.aelysiummod.util.ServerEvents;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(AelysiumMod.MOD_ID)
public class AelysiumMod {

    public static final String MOD_ID = "aelysiummod";

    public AelysiumMod(IEventBus modEventBus, ModContainer modContainer) {
        if (!ShouldLoadCheck.shouldLoad(MOD_ID)) {
            return;
        }

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModParticles.register(modEventBus);
        modEventBus.addListener(this::addCreative);
        NeoForge.EVENT_BUS.register(ServerEvents.class);


        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        NeoForge.EVENT_BUS.register(new Deus());
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Deus_Config.loadClient();
        }
        @SubscribeEvent
        public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
            event.registerSpriteSet(ModParticles.DAMA_DA_NOITE_PARTICULA.get(), DamaDaNoiteParticula.Provider::new);
            event.registerSpriteSet(ModParticles.DAMA_VERMELHA_DA_NOITE_PARTICULA.get(), DamaVermelhaDaNoiteParticula.Provider::new);
        }
    }
}