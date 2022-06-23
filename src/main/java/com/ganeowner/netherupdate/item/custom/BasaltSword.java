package com.ganeowner.netherupdate.item.custom;

import com.ganeowner.netherupdate.item.client.BasaltSwordRenderer;
import com.ganeowner.netherupdate.item.client.MagmaSwordRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.common.Tags;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.function.Consumer;

public class BasaltSword extends SwordItem implements IAnimatable {
    public AnimationFactory factory = new AnimationFactory(this);

    public BasaltSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        if(!pAttacker.level.isClientSide){

            for (int x = -4; x < 4; x++) {
                for (int y = -4; y < 4; y++) {
                    for (int z = -4; z < 4; z++) {

                        BlockPos pos = new BlockPos(pTarget.getBlockX()+x,pTarget.getBlockY()+y,pTarget.getBlockZ()+z);
                        Level level = pTarget.level;
                        if(level.getBlockState(pos).getBlock() == Blocks.STONE || level.getBlockState(pos).getBlock() == Blocks.COBBLESTONE ){
                            level.destroyBlock(pos,true);
                            pStack.setDamageValue(pStack.getDamageValue()-20);
                        }

                    }
                }
            }

        }
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    // ANIMATIONS & RENDERER
    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IItemRenderProperties() {
            private final BlockEntityWithoutLevelRenderer renderer = new BasaltSwordRenderer();

            @Override
            public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                return renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));

        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
