package io.papermc.testplugin;

import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import org.jetbrains.annotations.NotNull;
import organica.Organica;

public class TestPluginBootstrap implements PluginBootstrap {
    static {
        System.out.println("**** TestPluginBootstrap::static ****");
        Organica.staticInit();
    }

    @Override
    public void bootstrap(@NotNull BootstrapContext context) {
        System.out.println("**** TestPluginBootstrap::bootstrap ****");
    }

}
