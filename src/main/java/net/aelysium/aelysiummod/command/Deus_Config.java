package net.aelysium.aelysiummod.command;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.attributes.Attribute;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class Deus_Config {

    public static ConfigData DATA;

    public static class ConfigData {
        public Team team;
        public Attributes attributes;
        public Effects effects;
        public Abilities abilities;
    }

    public static class Team {
        public boolean enabled;
        public String name;
    }

    public static class Attributes {
        public boolean enabled;
        public List<AttributeEntry> list;
    }

    public static class AttributeEntry {
        public String attribute;
        public double value;

        public AttributeEntry(String attribute, double value) {
            this.attribute = attribute;
            this.value = value;
        }
    }

    public static class Effects {
        public boolean enabled;
        public List<EffectEntry> list;
        public boolean enable_darkness = true;
        public boolean enable_heal = true;
    }

    public static class EffectEntry {
        public String effect;
        public int duration;
        public int amplifier;

        public EffectEntry(String effect, int duration, int amplifier) {
            this.effect = effect;
            this.duration = duration;
            this.amplifier = amplifier;
        }
    }

    public static class Abilities {
        public boolean allow_flight;
    }

    public static void load(MinecraftServer server) {
        try {
            File file = new File(server.getServerDirectory().toFile(), "config/aelysium/deus.json");

            if (!file.exists()) {
                generateDefault(file);
            }

            Gson gson = new Gson();
            Type type = new TypeToken<ConfigData>(){}.getType();
            DATA = gson.fromJson(new FileReader(file), type);

        } catch (Exception ignored) {}
    }

    public static void loadClient() {
        try {
            File file = new File("config/aelysium/deus.json");

            if (!file.exists()) {
                file.getParentFile().mkdirs();
                generateDefault(file);
            }

            if (DATA == null) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Type type = new TypeToken<ConfigData>(){}.getType();
                DATA = gson.fromJson(new FileReader(file), type);
            }
        } catch (Exception ignored) {}
    }

    public static void generateDefault(File file) {
        try {
            file.getParentFile().mkdirs();

            ConfigData defaultConfig = new ConfigData();
            defaultConfig.team = new Team();
            defaultConfig.team.enabled = true;
            defaultConfig.team.name = "deuses";

            defaultConfig.attributes = new Attributes();
            defaultConfig.attributes.enabled = true;
            defaultConfig.attributes.list = List.of(
                    new AttributeEntry("minecraft:generic.attack_damage", 100.0)
            );


            defaultConfig.effects = new Effects();
            defaultConfig.effects.enabled = true;
            defaultConfig.effects.list = List.of(
                    new EffectEntry("minecraft:strength", 120, 10),
                    new EffectEntry("minecraft:resistance", 120, 10)
            );

            defaultConfig.abilities = new Abilities();
            defaultConfig.abilities.allow_flight = true;

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try (var writer = new java.io.FileWriter(file)) {
                writer.write(gson.toJson(defaultConfig));
            }

            System.out.println("[Aelysium] Config criado em " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Holder<MobEffect> getEffect(String id) {
        try {
            return BuiltInRegistries.MOB_EFFECT
                    .getHolder(ResourceLocation.parse(id))
                    .orElse(null);
        } catch (Exception e) {
            System.out.println("[Aelysium] Efeito inválido no config: " + id);
            return null;
        }
    }

    public static Holder<Attribute> getAttribute(String id) {
        try {
            return net.minecraft.core.registries.BuiltInRegistries.ATTRIBUTE
                    .getHolder(net.minecraft.resources.ResourceLocation.parse(id))
                    .orElse(null);
        } catch (Exception e) {
            System.out.println("[Aelysium] Atributo inválido no config: " + id);
            return null;
        }
    }
}
