package net.mcreator.foreigntechnologies.world.features.treedecorators;

public class EtheroverworldFruitDecorator extends CocoaDecorator {

    public static final EtheroverworldFruitDecorator INSTANCE = new EtheroverworldFruitDecorator();

    public static com.mojang.serialization.Codec<EtheroverworldFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;

    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        tdt.setRegistryName("etheroverworld_tree_fruit_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    public EtheroverworldFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
