package net.mry.coolcolamode;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  //проверка связи
public class CoolColaMod implements ModInitializer {
	public static final String MOD_ID = "coolcola-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
