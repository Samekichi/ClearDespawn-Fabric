package io.github.strikerrocker;

import de.guntram.mcmod.fabrictools.ConfigurationProvider;
import de.guntram.mcmod.fabrictools.GuiModOptions;
import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;

public class MMConfigurationHandler implements ModMenuApi
{
    @Override
    public String getModId() {
        return ClearDespawn.MODID;
    }

    @Override
    public ConfigScreenFactory getModConfigScreenFactory() {
        return screen -> new GuiModOptions(screen, ClearDespawn.MODNAME, ConfigurationProvider.getHandler(ClearDespawn.MODNAME));
    }
}
